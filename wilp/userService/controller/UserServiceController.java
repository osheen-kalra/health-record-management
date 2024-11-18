package com.expedia.www.eginsurance.wilp.userService.controller;

import com.expedia.www.eginsurance.wilp.userService.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/user")
public class UserServiceController {

    // User Profile APIs
    @PostMapping("/register")
    public ResponseEntity<UserProfile> registerUser(@RequestBody UserProfile userProfile) {
        // Return the received UserProfile object
        return ResponseEntity.ok(userProfile);
    }

    @GetMapping("/profile/{userID}")
    public ResponseEntity<UserProfile> getUserProfile(@PathVariable String userID) {
        // Return a new UserProfile object with the given userID
        UserProfile mockUserProfile = new UserProfile();
        mockUserProfile.setUserID(userID);

        // Mock personal details
        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setFirstName("John");
        personalDetails.setLastName("Doe");
        personalDetails.setDateOfBirth("1990-01-01");
        personalDetails.setGender("Male");
        personalDetails.setAddress("123 Main St, Anytown, USA");
        personalDetails.setPhoneNumber("555-1234");
        personalDetails.setEmail("john.doe@example.com");
        mockUserProfile.setPersonalDetails(personalDetails);

        // Mock medical history
        MedicalHistory medicalHistory1 = new MedicalHistory();
        medicalHistory1.setCondition("Hypertension");
        medicalHistory1.setDiagnosisDate("2020-01-01");
        medicalHistory1.setTreatment("Medication");
        medicalHistory1.setDoctorName("Dr. Smith");

        MedicalHistory medicalHistory2 = new MedicalHistory();
        medicalHistory2.setCondition("Diabetes");
        medicalHistory2.setDiagnosisDate("2018-05-15");
        medicalHistory2.setTreatment("Insulin");
        medicalHistory2.setDoctorName("Dr. Johnson");

        mockUserProfile.setMedicalHistory(List.of(medicalHistory1, medicalHistory2));

        // Mock emergency contacts
        Contact contact1 = new Contact();
        contact1.setName("Jane Doe");
        contact1.setRelationship("Spouse");
        contact1.setPhoneNumber("555-5678");
        contact1.setEmail("jane.doe@example.com");

        Contact contact2 = new Contact();
        contact2.setName("Jim Doe");
        contact2.setRelationship("Brother");
        contact2.setPhoneNumber("555-8765");
        contact2.setEmail("jim.doe@example.com");

        mockUserProfile.setEmergencyContacts(List.of(contact1, contact2));

        // Mock insurance details
        InsuranceDetails insuranceDetails = new InsuranceDetails();
        insuranceDetails.setPolicyNumber("ABC123456");
        insuranceDetails.setProviderName("Health Insurance Co.");
        insuranceDetails.setCoverageType("Full Coverage");
        insuranceDetails.setStartDate("2021-01-01");
        insuranceDetails.setEndDate("2022-01-01");
        mockUserProfile.setInsuranceDetails(insuranceDetails);

        // Mock user preferences
        UserPreferences userPreferences = new UserPreferences();
        userPreferences.setPreferredLanguage("English");
        userPreferences.setNotificationSettings(List.of("Email", "SMS"));
        userPreferences.setUserID(userID);
        userPreferences.setPrivacySettings(Collections.singletonMap("ShareMedicalHistory", true));
        mockUserProfile.setUserPreferences(userPreferences);

        // Mock accessibility features
        AccessibilityFeatures accessibilityFeatures = new AccessibilityFeatures();
        accessibilityFeatures.setUserID(userID);
        accessibilityFeatures.setTextSize("Large");
        accessibilityFeatures.setSimplifiedMode(true);
        accessibilityFeatures.setVoiceCommandsEnabled(false);
        mockUserProfile.setAccessibilityFeatures(accessibilityFeatures);
        return ResponseEntity.ok(mockUserProfile);
    }

    @GetMapping("/login/requestOtp/{userID}")
    public ResponseEntity<String> requestOtp(@PathVariable String userID) {
        // Return a dummy OTP
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return ResponseEntity.ok(String.valueOf(otp));
    }

    @PutMapping("/profile/{userID}")
    public ResponseEntity<String> updateUserProfile(@PathVariable String userID, @RequestBody UserProfile userProfile) {
        // Return a success message
        return ResponseEntity.ok("Profile updated successfully");
    }

    // User Preferences APIs
    @PostMapping("/preferences")
    public ResponseEntity<UserPreferences> setUserPreferences(@RequestBody UserPreferences userPreferences) {
        // Return the received UserPreferences object
        return ResponseEntity.ok(userPreferences);
    }

    // Accessibility Features APIs
    @PostMapping("/accessibility")
    public ResponseEntity<AccessibilityFeatures> setAccessibilityFeatures(@RequestBody AccessibilityFeatures accessibilityFeatures) {
        // Return the received AccessibilityFeatures object
        return ResponseEntity.ok(accessibilityFeatures);
    }

    // Family Account Manager APIs
    @PostMapping("/family")
    public ResponseEntity<FamilyAccountManager> addDependent(@RequestBody FamilyAccountManager familyAccountManager) {
        // Return the received FamilyAccountManager object
        return ResponseEntity.ok(familyAccountManager);
    }

    @GetMapping("/family/{userID}")
    public ResponseEntity<List<FamilyAccountManager>> getDependentProfiles(@PathVariable String userID) {
        // Return a list with a new FamilyAccountManager object with the given userID
        FamilyAccountManager familyAccountManager = new FamilyAccountManager();
        familyAccountManager.setUserID(userID);
        return ResponseEntity.ok(List.of(familyAccountManager));
    }

    @PutMapping("/family/{userID}/{dependentID}")
    public ResponseEntity<String> updateDependentProfile(@PathVariable String userID, @PathVariable String dependentID, @RequestBody FamilyAccountManager familyAccountManager) {
        // Return a success message
        return ResponseEntity.ok("Dependent profile updated successfully");
    }
}