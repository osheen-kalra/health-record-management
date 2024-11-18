package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

import lombok.Data;

import java.util.Date;

@Data
public class VersionControl {
    private String documentID;
    private Integer versionNumber;
    private Date timestamp;
    private String changedBy;
    private String changeDescription;

    // Methods
    public void createVersion() {
        // Implement logic here
    }

    public void revertVersion() {
        // Implement logic here
    }

    public void getVersionDetails() {
        // Implement logic here
    }
}
