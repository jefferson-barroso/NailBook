package com.nailbook.nailbook_api.repository;

import com.nailbook.nailbook_api.model.entity.Appointment;
import com.nailbook.nailbook_api.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByClient(User client);

}
