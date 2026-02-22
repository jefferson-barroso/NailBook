package com.nailbook.nailbook_api.service;

import com.nailbook.nailbook_api.model.entity.Appointment;
import com.nailbook.nailbook_api.model.enums.AppoimentStatus;
import com.nailbook.nailbook_api.repository.AppointmentRepository;
import com.nailbook.nailbook_api.repository.UserRepository;
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

    public Appointment create(Appointment appointment){
        appointment.setStatus(AppoimentStatus.SCHEDULED);
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> listAll(){
        return appointmentRepository.findAll();
    }
}
