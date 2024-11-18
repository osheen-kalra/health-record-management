package com.expedia.www.eginsurance.wilp.recordManagementService.controller;


import com.expedia.www.eginsurance.wilp.recordManagementService.dto.DiagnosticTest;
import com.expedia.www.eginsurance.wilp.recordManagementService.dto.Document;
import com.expedia.www.eginsurance.wilp.recordManagementService.dto.DocumentDetails;
import com.expedia.www.eginsurance.wilp.recordManagementService.dto.Frequency;
import com.expedia.www.eginsurance.wilp.recordManagementService.dto.PatientRecord;
import com.expedia.www.eginsurance.wilp.recordManagementService.dto.Prescription;
import com.expedia.www.eginsurance.wilp.recordManagementService.dto.PrescriptionItem;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/records")
public class RecordManagementController {

    @PostMapping("/create")
    public ResponseEntity<String> createRecord(@RequestBody PatientRecord patientRecord) {
        return ResponseEntity.ok("Record created successfully");
    }

    @PostMapping("/uploadDocument")
    public ResponseEntity<String> uploadDocument(@RequestParam String patientID,
                                                           @RequestParam String documentType,
                                                           @RequestParam MultipartFile file) {
        return ResponseEntity.ok("Document uploaded successfully");
    }

    @GetMapping("/getDocument/{documentID}")
    public ResponseEntity<Document> getDocument(@PathVariable String documentID) throws IOException {
        Document mockDocument = new Document();
        mockDocument.setDocumentID("123");
        mockDocument.setDocumentType("Prescription");
        mockDocument.setPatientID("67890");
        mockDocument.setDateUploaded(ZonedDateTime.now());
        mockDocument.setFilePath("/path/to/document.pdf");
        mockDocument.setVersionNumber(1);

        Prescription documentDetails = new Prescription();
        documentDetails.setPrescriptionID("presc-001");
        documentDetails.setDoctorName("Dr. John Doe");
        documentDetails.setDiagnosis("Flu");

        PrescriptionItem item1 = new PrescriptionItem();
        item1.setMedicationName("Medicine A");
        item1.setDosage("500mg");
        item1.setInstructions("Take one tablet daily");
        item1.setFrequency(Frequency.DAILY);

        PrescriptionItem item2 = new PrescriptionItem();
        item2.setMedicationName("Medicine B");
        item2.setDosage("250mg");
        item2.setInstructions("Take one tablet twice daily");
        item2.setFrequency(Frequency.TWICE_DAILY);

        documentDetails.setPrescriptionItems(Arrays.asList(item1, item2));
        mockDocument.setDocumentDetails(documentDetails);

        return ResponseEntity.ok(mockDocument);
    }

    @GetMapping("/getPatientRecords/{patientID}")
    public ResponseEntity<PatientRecord> getPatientRecords(@PathVariable String patientID) {
        return ResponseEntity.ok(new PatientRecord());
    }

    @GetMapping("/getTestResults/{testID}")
    public ResponseEntity<DiagnosticTest> getTestResults(@PathVariable String testID) {
        return ResponseEntity.ok(new DiagnosticTest());
    }

    @GetMapping("/listVersions/{documentID}")
    public ResponseEntity<List<String>> listVersions(@PathVariable String documentID) {
        return ResponseEntity.ok(Collections.emptyList());
    }
}