package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

import lombok.Data;
import java.util.List;
@Data
public class PatientRecord {
    private String patientID;
    private Object personalDetails;  // You may define a more specific type for personal details.
    private List<String> medicalHistory;
    private List<String> allergyInfo;
    private List<String> visitHistory;
    private String languagePreference;

    // Methods
    public void updateMedicalHistory() {
        // Implement logic here
    }

    public void addAllergyInfo() {
        // Implement logic here
    }

    public List<String> getMedicalHistory() {
        return this.medicalHistory;
    }

    public void translateRecord() {
        // Implement logic here
    }
}
