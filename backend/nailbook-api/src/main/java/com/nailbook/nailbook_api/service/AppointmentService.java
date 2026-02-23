package com.nailbook.nailbook_api.service;

import com.nailbook.nailbook_api.dto.AppointmentResponseDTO;
import com.nailbook.nailbook_api.model.entity.Appointment;
import com.nailbook.nailbook_api.model.entity.User;
import com.nailbook.nailbook_api.model.enums.AppoimentStatus;
import com.nailbook.nailbook_api.model.enums.UserRole;
import com.nailbook.nailbook_api.repository.AppointmentRepository;
import com.nailbook.nailbook_api.repository.UserRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final UserRepository userRepository;

    public AppointmentService(AppointmentRepository appointmentRepository, UserRepository userRepository) {
        this.appointmentRepository = appointmentRepository;
        this.userRepository = userRepository;
    }

    private AppointmentResponseDTO toDTO(Appointment appointment) {
        return new AppointmentResponseDTO(
                appointment.getId(),
                appointment.getServiceName(),
                appointment.getDateTime(),
                appointment.getStatus().name()
        );
    }

    public AppointmentResponseDTO create(Appointment appointment){

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        appointment.setClient(user);
        appointment.setStatus(AppoimentStatus.SCHEDULED);

        Appointment saved = appointmentRepository.save(appointment);

        return toDTO(saved);
    }

    public List<AppointmentResponseDTO> listMyAppointments() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String email = auth.getName();

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

        return appointmentRepository.findByClient(user)
                .stream()
                .map(this::toDTO)
                .toList();
    }

    public List<AppointmentResponseDTO> listAllAppointments() {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        boolean isManicureOrAdmin = auth.getAuthorities().stream()
                .anyMatch(role ->
                        role.getAuthority().equals("ROLE_MANICURE") ||
                                role.getAuthority().equals("ROLE_ADMIN")
                );

        if (!isManicureOrAdmin) {
            throw new RuntimeException("Acesso negado");
        }

        return appointmentRepository.findAll().stream()
                .map(this::toDTO)
                .toList();
    }


}
