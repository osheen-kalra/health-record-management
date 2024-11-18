package com.expedia.www.eginsurance.wilp.userService.dto;

import lombok.Data;

@Data
public class MedicalHistory {
    private String condition;
    private String diagnosisDate;
    private String treatment;
    private String doctorName;
}
