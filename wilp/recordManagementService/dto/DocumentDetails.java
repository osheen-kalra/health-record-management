package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Data
public class DocumentDetails {
    private String documentID;
    private String documentType;
    private String patientID;
    private Date dateUploaded;
}
