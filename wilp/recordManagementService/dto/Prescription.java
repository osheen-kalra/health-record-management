package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Data
public class Prescription extends DocumentDetails{
    private String prescriptionID;
    private String doctorName;
    private String diagnosis;
    private List<PrescriptionItem> prescriptionItems;
}
