package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.model.ErrorDetails;
import org.openapitools.model.JobStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetOrganizationsAccessReportResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetOrganizationsAccessReportResponse {

  private JobStatusType jobStatus;

  private OffsetDateTime jobCreationDate;

  private OffsetDateTime jobCompletionDate;

  private Integer numberOfServicesAccessible;

  private Integer numberOfServicesNotAccessed;

  private List accessDetails;

  private Boolean isTruncated;

  private String marker;

  private ErrorDetails errorDetails;

  public GetOrganizationsAccessReportResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetOrganizationsAccessReportResponse(JobStatusType jobStatus, OffsetDateTime jobCreationDate) {
    this.jobStatus = jobStatus;
    this.jobCreationDate = jobCreationDate;
  }

  public GetOrganizationsAccessReportResponse jobStatus(JobStatusType jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @NotNull @Valid 
  @Schema(name = "JobStatus", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("JobStatus")
  public JobStatusType getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(JobStatusType jobStatus) {
    this.jobStatus = jobStatus;
  }

  public GetOrganizationsAccessReportResponse jobCreationDate(OffsetDateTime jobCreationDate) {
    this.jobCreationDate = jobCreationDate;
    return this;
  }

  /**
   * Get jobCreationDate
   * @return jobCreationDate
  */
  @NotNull @Valid 
  @Schema(name = "JobCreationDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("JobCreationDate")
  public OffsetDateTime getJobCreationDate() {
    return jobCreationDate;
  }

  public void setJobCreationDate(OffsetDateTime jobCreationDate) {
    this.jobCreationDate = jobCreationDate;
  }

  public GetOrganizationsAccessReportResponse jobCompletionDate(OffsetDateTime jobCompletionDate) {
    this.jobCompletionDate = jobCompletionDate;
    return this;
  }

  /**
   * Get jobCompletionDate
   * @return jobCompletionDate
  */
  @Valid 
  @Schema(name = "JobCompletionDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobCompletionDate")
  public OffsetDateTime getJobCompletionDate() {
    return jobCompletionDate;
  }

  public void setJobCompletionDate(OffsetDateTime jobCompletionDate) {
    this.jobCompletionDate = jobCompletionDate;
  }

  public GetOrganizationsAccessReportResponse numberOfServicesAccessible(Integer numberOfServicesAccessible) {
    this.numberOfServicesAccessible = numberOfServicesAccessible;
    return this;
  }

  /**
   * Get numberOfServicesAccessible
   * @return numberOfServicesAccessible
  */
  
  @Schema(name = "NumberOfServicesAccessible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumberOfServicesAccessible")
  public Integer getNumberOfServicesAccessible() {
    return numberOfServicesAccessible;
  }

  public void setNumberOfServicesAccessible(Integer numberOfServicesAccessible) {
    this.numberOfServicesAccessible = numberOfServicesAccessible;
  }

  public GetOrganizationsAccessReportResponse numberOfServicesNotAccessed(Integer numberOfServicesNotAccessed) {
    this.numberOfServicesNotAccessed = numberOfServicesNotAccessed;
    return this;
  }

  /**
   * Get numberOfServicesNotAccessed
   * @return numberOfServicesNotAccessed
  */
  
  @Schema(name = "NumberOfServicesNotAccessed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NumberOfServicesNotAccessed")
  public Integer getNumberOfServicesNotAccessed() {
    return numberOfServicesNotAccessed;
  }

  public void setNumberOfServicesNotAccessed(Integer numberOfServicesNotAccessed) {
    this.numberOfServicesNotAccessed = numberOfServicesNotAccessed;
  }

  public GetOrganizationsAccessReportResponse accessDetails(List accessDetails) {
    this.accessDetails = accessDetails;
    return this;
  }

  /**
   * Get accessDetails
   * @return accessDetails
  */
  @Valid 
  @Schema(name = "AccessDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessDetails")
  public List getAccessDetails() {
    return accessDetails;
  }

  public void setAccessDetails(List accessDetails) {
    this.accessDetails = accessDetails;
  }

  public GetOrganizationsAccessReportResponse isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  /**
   * Get isTruncated
   * @return isTruncated
  */
  
  @Schema(name = "IsTruncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsTruncated")
  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public void setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
  }

  public GetOrganizationsAccessReportResponse marker(String marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
  */
  
  @Schema(name = "Marker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Marker")
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }

  public GetOrganizationsAccessReportResponse errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Get errorDetails
   * @return errorDetails
  */
  @Valid 
  @Schema(name = "ErrorDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ErrorDetails")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrganizationsAccessReportResponse getOrganizationsAccessReportResponse = (GetOrganizationsAccessReportResponse) o;
    return Objects.equals(this.jobStatus, getOrganizationsAccessReportResponse.jobStatus) &&
        Objects.equals(this.jobCreationDate, getOrganizationsAccessReportResponse.jobCreationDate) &&
        Objects.equals(this.jobCompletionDate, getOrganizationsAccessReportResponse.jobCompletionDate) &&
        Objects.equals(this.numberOfServicesAccessible, getOrganizationsAccessReportResponse.numberOfServicesAccessible) &&
        Objects.equals(this.numberOfServicesNotAccessed, getOrganizationsAccessReportResponse.numberOfServicesNotAccessed) &&
        Objects.equals(this.accessDetails, getOrganizationsAccessReportResponse.accessDetails) &&
        Objects.equals(this.isTruncated, getOrganizationsAccessReportResponse.isTruncated) &&
        Objects.equals(this.marker, getOrganizationsAccessReportResponse.marker) &&
        Objects.equals(this.errorDetails, getOrganizationsAccessReportResponse.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobStatus, jobCreationDate, jobCompletionDate, numberOfServicesAccessible, numberOfServicesNotAccessed, accessDetails, isTruncated, marker, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrganizationsAccessReportResponse {\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    jobCreationDate: ").append(toIndentedString(jobCreationDate)).append("\n");
    sb.append("    jobCompletionDate: ").append(toIndentedString(jobCompletionDate)).append("\n");
    sb.append("    numberOfServicesAccessible: ").append(toIndentedString(numberOfServicesAccessible)).append("\n");
    sb.append("    numberOfServicesNotAccessed: ").append(toIndentedString(numberOfServicesNotAccessed)).append("\n");
    sb.append("    accessDetails: ").append(toIndentedString(accessDetails)).append("\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

