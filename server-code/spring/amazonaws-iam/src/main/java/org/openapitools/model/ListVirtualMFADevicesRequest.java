package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AssignmentStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListVirtualMFADevicesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListVirtualMFADevicesRequest {

  private AssignmentStatusType assignmentStatus;

  private String marker;

  private Integer maxItems;

  public ListVirtualMFADevicesRequest assignmentStatus(AssignmentStatusType assignmentStatus) {
    this.assignmentStatus = assignmentStatus;
    return this;
  }

  /**
   * Get assignmentStatus
   * @return assignmentStatus
  */
  @Valid 
  @Schema(name = "AssignmentStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AssignmentStatus")
  public AssignmentStatusType getAssignmentStatus() {
    return assignmentStatus;
  }

  public void setAssignmentStatus(AssignmentStatusType assignmentStatus) {
    this.assignmentStatus = assignmentStatus;
  }

  public ListVirtualMFADevicesRequest marker(String marker) {
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

  public ListVirtualMFADevicesRequest maxItems(Integer maxItems) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVirtualMFADevicesRequest listVirtualMFADevicesRequest = (ListVirtualMFADevicesRequest) o;
    return Objects.equals(this.assignmentStatus, listVirtualMFADevicesRequest.assignmentStatus) &&
        Objects.equals(this.marker, listVirtualMFADevicesRequest.marker) &&
        Objects.equals(this.maxItems, listVirtualMFADevicesRequest.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignmentStatus, marker, maxItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVirtualMFADevicesRequest {\n");
    sb.append("    assignmentStatus: ").append(toIndentedString(assignmentStatus)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
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

