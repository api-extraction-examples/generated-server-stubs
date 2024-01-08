package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetServiceLastAccessedDetailsWithEntitiesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetServiceLastAccessedDetailsWithEntitiesRequest {

  private String jobId;

  private String serviceNamespace;

  private Integer maxItems;

  private String marker;

  public GetServiceLastAccessedDetailsWithEntitiesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetServiceLastAccessedDetailsWithEntitiesRequest(String jobId, String serviceNamespace) {
    this.jobId = jobId;
    this.serviceNamespace = serviceNamespace;
  }

  public GetServiceLastAccessedDetailsWithEntitiesRequest jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Get jobId
   * @return jobId
  */
  @NotNull 
  @Schema(name = "JobId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("JobId")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public GetServiceLastAccessedDetailsWithEntitiesRequest serviceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
    return this;
  }

  /**
   * Get serviceNamespace
   * @return serviceNamespace
  */
  @NotNull 
  @Schema(name = "ServiceNamespace", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServiceNamespace")
  public String getServiceNamespace() {
    return serviceNamespace;
  }

  public void setServiceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
  }

  public GetServiceLastAccessedDetailsWithEntitiesRequest maxItems(Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * Get maxItems
   * @return maxItems
  */
  
  @Schema(name = "MaxItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxItems")
  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }

  public GetServiceLastAccessedDetailsWithEntitiesRequest marker(String marker) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServiceLastAccessedDetailsWithEntitiesRequest getServiceLastAccessedDetailsWithEntitiesRequest = (GetServiceLastAccessedDetailsWithEntitiesRequest) o;
    return Objects.equals(this.jobId, getServiceLastAccessedDetailsWithEntitiesRequest.jobId) &&
        Objects.equals(this.serviceNamespace, getServiceLastAccessedDetailsWithEntitiesRequest.serviceNamespace) &&
        Objects.equals(this.maxItems, getServiceLastAccessedDetailsWithEntitiesRequest.maxItems) &&
        Objects.equals(this.marker, getServiceLastAccessedDetailsWithEntitiesRequest.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, serviceNamespace, maxItems, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServiceLastAccessedDetailsWithEntitiesRequest {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    serviceNamespace: ").append(toIndentedString(serviceNamespace)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

