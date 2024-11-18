package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DiagnosticTest {
    private String testID;
    private String patientID;
    private String testType;
    private Date scheduledDate;
    private String status;
    private Object results;

    // Methods
    public void scheduleTest() {
        // Implement logic here
    }

    public void updateTestStatus() {
        // Implement logic here
    }

    public void addTestResults() {
        // Implement logic here
    }

    public void getTestResults() {
        // Implement logic here
    }
}
