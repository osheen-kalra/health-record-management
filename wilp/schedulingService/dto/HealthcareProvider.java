package com.expedia.www.eginsurance.wilp.schedulingService.dto;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class HealthcareProvider {
    private String providerId;
    private String name;
    private String specialization;
    private List<Date> availability;
}
