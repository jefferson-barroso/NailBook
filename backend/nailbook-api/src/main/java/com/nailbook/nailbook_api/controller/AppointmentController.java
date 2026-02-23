package com.nailbook.nailbook_api.controller;


import com.nailbook.nailbook_api.dto.AppointmentResponseDTO;
import com.nailbook.nailbook_api.model.entity.Appointment;
import com.nailbook.nailbook_api.service.AppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/agendar")
    public ResponseEntity<AppointmentResponseDTO> create (@RequestBody Appointment appointment){
        return ResponseEntity.ok(appointmentService.create(appointment));
    }

    @GetMapping("/buscarTodosAgendamentos")
    public ResponseEntity<List<AppointmentResponseDTO>> list(){
        return ResponseEntity.ok(appointmentService.listAllAppointments());
    }

    @GetMapping("/buscarMeusAgendamentos")
    public ResponseEntity<List<AppointmentResponseDTO>> listMy(){
        return ResponseEntity.ok(appointmentService.listMyAppointments());
    }

}
