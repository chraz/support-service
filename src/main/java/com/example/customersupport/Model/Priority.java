package com.example.customersupport.Model;

import java.util.EnumSet;

public enum Priority {

        LOW("Low Priority"),
        MEDIUM("Medium Priority"),
        HIGH("High Priority");

        private String description;

        Priority(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }
