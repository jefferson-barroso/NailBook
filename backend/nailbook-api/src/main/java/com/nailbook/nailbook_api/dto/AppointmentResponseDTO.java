package com.nailbook.nailbook_api.dto;

import java.time.LocalDateTime;

public class AppointmentResponseDTO {
    private Long id;
    private String serviceName;
    private LocalDateTime dateTime;
    private String status;

    public AppointmentResponseDTO(Long id, String serviceName, LocalDateTime dateTime, String status) {
        this.id = id;
        this.serviceName = serviceName;
        this.dateTime = dateTime;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
