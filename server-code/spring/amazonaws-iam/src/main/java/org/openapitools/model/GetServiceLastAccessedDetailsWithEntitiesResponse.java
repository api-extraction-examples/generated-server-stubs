package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.List;
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
 * GetServiceLastAccessedDetailsWithEntitiesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetServiceLastAccessedDetailsWithEntitiesResponse {

  private JobStatusType jobStatus;

  private OffsetDateTime jobCreationDate;

  private OffsetDateTime jobCompletionDate;

  private List entityDetailsList;

  private Boolean isTruncated;

  private String marker;

  private GetServiceLastAccessedDetailsResponseError error;

  public GetServiceLastAccessedDetailsWithEntitiesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetServiceLastAccessedDetailsWithEntitiesResponse(JobStatusType jobStatus, OffsetDateTime jobCreationDate, OffsetDateTime jobCompletionDate, List entityDetailsList) {
    this.jobStatus = jobStatus;
    this.jobCreationDate = jobCreationDate;
    this.jobCompletionDate = jobCompletionDate;
    this.entityDetailsList = entityDetailsList;
  }

  public GetServiceLastAccessedDetailsWithEntitiesResponse jobStatus(JobStatusType jobStatus) {
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

  public GetServiceLastAccessedDetailsWithEntitiesResponse jobCreationDate(OffsetDateTime jobCreationDate) {
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

  public GetServiceLastAccessedDetailsWithEntitiesResponse jobCompletionDate(OffsetDateTime jobCompletionDate) {
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

  public GetServiceLastAccessedDetailsWithEntitiesResponse entityDetailsList(List entityDetailsList) {
    this.entityDetailsList = entityDetailsList;
    return this;
  }

  /**
   * Get entityDetailsList
   * @return entityDetailsList
  */
  @NotNull @Valid 
  @Schema(name = "EntityDetailsList", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EntityDetailsList")
  public List getEntityDetailsList() {
    return entityDetailsList;
  }

  public void setEntityDetailsList(List entityDetailsList) {
    this.entityDetailsList = entityDetailsList;
  }

  public GetServiceLastAccessedDetailsWithEntitiesResponse isTruncated(Boolean isTruncated) {
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

  public GetServiceLastAccessedDetailsWithEntitiesResponse marker(String marker) {
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

  public GetServiceLastAccessedDetailsWithEntitiesResponse error(GetServiceLastAccessedDetailsResponseError error) {
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
    GetServiceLastAccessedDetailsWithEntitiesResponse getServiceLastAccessedDetailsWithEntitiesResponse = (GetServiceLastAccessedDetailsWithEntitiesResponse) o;
    return Objects.equals(this.jobStatus, getServiceLastAccessedDetailsWithEntitiesResponse.jobStatus) &&
        Objects.equals(this.jobCreationDate, getServiceLastAccessedDetailsWithEntitiesResponse.jobCreationDate) &&
        Objects.equals(this.jobCompletionDate, getServiceLastAccessedDetailsWithEntitiesResponse.jobCompletionDate) &&
        Objects.equals(this.entityDetailsList, getServiceLastAccessedDetailsWithEntitiesResponse.entityDetailsList) &&
        Objects.equals(this.isTruncated, getServiceLastAccessedDetailsWithEntitiesResponse.isTruncated) &&
        Objects.equals(this.marker, getServiceLastAccessedDetailsWithEntitiesResponse.marker) &&
        Objects.equals(this.error, getServiceLastAccessedDetailsWithEntitiesResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobStatus, jobCreationDate, jobCompletionDate, entityDetailsList, isTruncated, marker, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServiceLastAccessedDetailsWithEntitiesResponse {\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    jobCreationDate: ").append(toIndentedString(jobCreationDate)).append("\n");
    sb.append("    jobCompletionDate: ").append(toIndentedString(jobCompletionDate)).append("\n");
    sb.append("    entityDetailsList: ").append(toIndentedString(entityDetailsList)).append("\n");
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

