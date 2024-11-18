package com.expedia.www.eginsurance.wilp.schedulingService.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Waitlist {
    private String waitlistId;
    private String patientId;
    private Date appointmentDate;
    private String status;
}
