package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.model.AccessAdvisorUsageGranularityType;
import org.openapitools.model.GetServiceLastAccessedDetailsResponseError;
import org.openapitools.model.JobStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetServiceLastAccessedDetailsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetServiceLastAccessedDetailsResponse {

  private JobStatusType jobStatus;

  private AccessAdvisorUsageGranularityType jobType;

  private OffsetDateTime jobCreationDate;

  private List servicesLastAccessed;

  private OffsetDateTime jobCompletionDate;

  private Boolean isTruncated;

  private String marker;

  private GetServiceLastAccessedDetailsResponseError error;

  public GetServiceLastAccessedDetailsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetServiceLastAccessedDetailsResponse(JobStatusType jobStatus, OffsetDateTime jobCreationDate, List servicesLastAccessed, OffsetDateTime jobCompletionDate) {
    this.jobStatus = jobStatus;
    this.jobCreationDate = jobCreationDate;
    this.servicesLastAccessed = servicesLastAccessed;
    this.jobCompletionDate = jobCompletionDate;
  }

  public GetServiceLastAccessedDetailsResponse jobStatus(JobStatusType jobStatus) {
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

  public GetServiceLastAccessedDetailsResponse jobType(AccessAdvisorUsageGranularityType jobType) {
    this.jobType = jobType;
    return this;
  }

  /**
   * Get jobType
   * @return jobType
  */
  @Valid 
  @Schema(name = "JobType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("JobType")
  public AccessAdvisorUsageGranularityType getJobType() {
    return jobType;
  }

  public void setJobType(AccessAdvisorUsageGranularityType jobType) {
    this.jobType = jobType;
  }

  public GetServiceLastAccessedDetailsResponse jobCreationDate(OffsetDateTime jobCreationDate) {
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

  public GetServiceLastAccessedDetailsResponse servicesLastAccessed(List servicesLastAccessed) {
    this.servicesLastAccessed = servicesLastAccessed;
    return this;
  }

  /**
   * Get servicesLastAccessed
   * @return servicesLastAccessed
  */
  @NotNull @Valid 
  @Schema(name = "ServicesLastAccessed", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServicesLastAccessed")
  public List getServicesLastAccessed() {
    return servicesLastAccessed;
  }

  public void setServicesLastAccessed(List servicesLastAccessed) {
    this.servicesLastAccessed = servicesLastAccessed;
  }

  public GetServiceLastAccessedDetailsResponse jobCompletionDate(OffsetDateTime jobCompletionDate) {
    this.jobCompletionDate = jobCompletionDate;
    return this;
  }

  /**
   * Get jobCompletionDate
   * @return jobCompletionDate
  */
  @NotNull @Valid 
  @Schema(name = "JobCompletionDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("JobCompletionDate")
  public OffsetDateTime getJobCompletionDate() {
    return jobCompletionDate;
  }

  public void setJobCompletionDate(OffsetDateTime jobCompletionDate) {
    this.jobCompletionDate = jobCompletionDate;
  }

  public GetServiceLastAccessedDetailsResponse isTruncated(Boolean isTruncated) {
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

  public GetServiceLastAccessedDetailsResponse marker(String marker) {
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

  public GetServiceLastAccessedDetailsResponse error(GetServiceLastAccessedDetailsResponseError error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @Valid 
  @Schema(name = "Error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Error")
  public GetServiceLastAccessedDetailsResponseError getError() {
    return error;
  }

  public void setError(GetServiceLastAccessedDetailsResponseError error) {
    this.error = error;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServiceLastAccessedDetailsResponse getServiceLastAccessedDetailsResponse = (GetServiceLastAccessedDetailsResponse) o;
    return Objects.equals(this.jobStatus, getServiceLastAccessedDetailsResponse.jobStatus) &&
        Objects.equals(this.jobType, getServiceLastAccessedDetailsResponse.jobType) &&
        Objects.equals(this.jobCreationDate, getServiceLastAccessedDetailsResponse.jobCreationDate) &&
        Objects.equals(this.servicesLastAccessed, getServiceLastAccessedDetailsResponse.servicesLastAccessed) &&
        Objects.equals(this.jobCompletionDate, getServiceLastAccessedDetailsResponse.jobCompletionDate) &&
        Objects.equals(this.isTruncated, getServiceLastAccessedDetailsResponse.isTruncated) &&
        Objects.equals(this.marker, getServiceLastAccessedDetailsResponse.marker) &&
        Objects.equals(this.error, getServiceLastAccessedDetailsResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobStatus, jobType, jobCreationDate, servicesLastAccessed, jobCompletionDate, isTruncated, marker, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServiceLastAccessedDetailsResponse {\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    jobCreationDate: ").append(toIndentedString(jobCreationDate)).append("\n");
    sb.append("    servicesLastAccessed: ").append(toIndentedString(servicesLastAccessed)).append("\n");
    sb.append("    jobCompletionDate: ").append(toIndentedString(jobCompletionDate)).append("\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

