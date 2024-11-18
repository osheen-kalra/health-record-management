package com.expedia.www.eginsurance.wilp.recordManagementService.dto;

public enum Frequency {
    DAILY("Daily"),
    TWICE_DAILY("Twice Daily"),
    WEEKLY("Weekly"),
    MONTHLY("Monthly"),
    YEARLY("Yearly");

    private String frequency;

    // Constructor to initialize the frequency value
    Frequency(String frequency) {
        this.frequency = frequency;
    }

    // Getter for the frequency
    public String getFrequency() {
        return frequency;
    }

    @Override
    public String toString() {
        return this.frequency;
    }
}

