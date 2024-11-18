package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@Data
public class Document {
    private String documentID;
    private String documentType;
    private String patientID;
    private ZonedDateTime dateUploaded;
    private String filePath;
    private Integer versionNumber;
    private DocumentDetails documentDetails;
}
