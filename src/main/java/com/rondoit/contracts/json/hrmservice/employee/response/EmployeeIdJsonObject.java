package com.rondoit.contracts.json.hrmservice.employee.response;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Mehdi Chitforoosh
 * @since 1.0.0
 */
public class EmployeeIdJsonObject {

    @JsonProperty(value = "id")
    private final String id;

    public EmployeeIdJsonObject(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
