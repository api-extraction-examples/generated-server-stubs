package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SortKeyType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetOrganizationsAccessReportRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetOrganizationsAccessReportRequest {

  private String jobId;

  private Integer maxItems;

  private String marker;

  private SortKeyType sortKey;

  public GetOrganizationsAccessReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetOrganizationsAccessReportRequest(String jobId) {
    this.jobId = jobId;
  }

  public GetOrganizationsAccessReportRequest jobId(String jobId) {
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

  public GetOrganizationsAccessReportRequest maxItems(Integer maxItems) {
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

  public GetOrganizationsAccessReportRequest marker(String marker) {
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

  public GetOrganizationsAccessReportRequest sortKey(SortKeyType sortKey) {
    this.sortKey = sortKey;
    return this;
  }

  /**
   * Get sortKey
   * @return sortKey
  */
  @Valid 
  @Schema(name = "SortKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortKey")
  public SortKeyType getSortKey() {
    return sortKey;
  }

  public void setSortKey(SortKeyType sortKey) {
    this.sortKey = sortKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrganizationsAccessReportRequest getOrganizationsAccessReportRequest = (GetOrganizationsAccessReportRequest) o;
    return Objects.equals(this.jobId, getOrganizationsAccessReportRequest.jobId) &&
        Objects.equals(this.maxItems, getOrganizationsAccessReportRequest.maxItems) &&
        Objects.equals(this.marker, getOrganizationsAccessReportRequest.marker) &&
        Objects.equals(this.sortKey, getOrganizationsAccessReportRequest.sortKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, maxItems, marker, sortKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrganizationsAccessReportRequest {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
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

