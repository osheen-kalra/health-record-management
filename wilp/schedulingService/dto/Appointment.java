package com.expedia.www.eginsurance.wilp.schedulingService.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Appointment {
    private String appointmentId;
    private String patientId;
    private String providerId;
    private Date date;
    private String time;
    private String status;
    private Boolean recurring;
}
