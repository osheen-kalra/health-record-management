package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class PrescriptionItem {
    private String medicationName;
    private String dosage;
    private String instructions;
    private Frequency frequency;
}
