package com.expedia.www.eginsurance.wilp.userService.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserProfile {
    private String userID;
    private PersonalDetails personalDetails;
    private List<MedicalHistory> medicalHistory;
    private List<Contact> emergencyContacts;
    private InsuranceDetails insuranceDetails;

    private UserPreferences userPreferences;
    private AccessibilityFeatures accessibilityFeatures;
}
