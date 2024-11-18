package com.expedia.www.eginsurance.wilp.schedulingService.controller;

import com.expedia.www.eginsurance.wilp.schedulingService.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedule")
public class SchedulingServiceController {

    @PostMapping("/schedule-appointment")
    public ResponseEntity<Appointment> scheduleAppointment(@RequestBody Appointment appointment) {
        // Return the received Appointment object
        return ResponseEntity.ok(appointment);
    }

    @PostMapping("/cancel-appointment")
    public ResponseEntity<String> cancelAppointment(@RequestBody Appointment appointment) {
        // Return a success message
        return ResponseEntity.ok("Appointment cancelled successfully");
    }

    @PostMapping("/optimize-schedule")
    public ResponseEntity<String> optimizeSchedule(@RequestBody List<Appointment> appointments) {
        // Return a success message
        return ResponseEntity.ok("Schedule optimized successfully");
    }

    @PostMapping("/add-to-waitlist")
    public ResponseEntity<Waitlist> addToWaitlist(@RequestBody Waitlist waitlist) {
        // Return the received Waitlist object
        return ResponseEntity.ok(waitlist);
    }

    @PostMapping("/sync-calendar")
    public ResponseEntity<String> syncCalendar(@RequestBody Appointment appointment) {
        // Return the received CalendarIntegration object
        return ResponseEntity.ok("Calendar synced successfully");
    }
}