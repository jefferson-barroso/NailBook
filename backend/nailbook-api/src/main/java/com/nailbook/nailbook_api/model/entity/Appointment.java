package com.nailbook.nailbook_api.model.entity;

import com.nailbook.nailbook_api.model.enums.AppoimentStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="appoiments")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTime;

    @Enumerated(EnumType.STRING)
    private AppoimentStatus status;

    private User client;

    private String serviceName;

    public Appointment() {
    }

    public Appointment(Long id, LocalDateTime dateTime, AppoimentStatus status, User client, String serviceName) {
        this.id = id;
        this.dateTime = dateTime;
        this.status = status;
        this.client = client;
        this.serviceName = serviceName;
    }

    public Long getId() {
        return id;
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public AppoimentStatus getStatus() {
        return status;
    }

    public void setStatus(AppoimentStatus status) {
        this.status = status;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
