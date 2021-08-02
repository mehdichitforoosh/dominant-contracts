package com.rondoit.contracts.json.hrmservice.employee.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

/**
 * @author Mehdi Chitforoosh
 * @since 1.0.0
 */
@JsonIgnoreProperties
public class CreateEmployeeJsonObject {

    private final String name;
    private final String personnelId;
    private final DateTime joiningDate;
    private final String departmentId;
    private final String jobTitleReferenceId;
    private final String description;

    @JsonCreator
    public CreateEmployeeJsonObject(@JsonProperty(value = "name", required = true) String name
            , @JsonProperty(value = "personnelId") String personnelId
            , @JsonProperty(value = "joiningDate") DateTime joiningDate
            , @JsonProperty(value = "departmentId") String departmentId
            , @JsonProperty(value = "jobTitleReferenceId") String jobTitleReferenceId
            , @JsonProperty(value = "description") String description) {
        this.name = name;
        this.personnelId = personnelId;
        this.joiningDate = joiningDate;
        this.departmentId = departmentId;
        this.jobTitleReferenceId = jobTitleReferenceId;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getPersonnelId() {
        return personnelId;
    }

    public DateTime getJoiningDate() {
        return joiningDate;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getJobTitleReferenceId() {
        return jobTitleReferenceId;
    }

    public String getDescription() {
        return description;
    }
}
