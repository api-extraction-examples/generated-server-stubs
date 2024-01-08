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
 * ListAttachedGroupPoliciesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListAttachedGroupPoliciesRequest {

  private String groupName;

  private String pathPrefix;

  private String marker;

  private Integer maxItems;

  public ListAttachedGroupPoliciesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListAttachedGroupPoliciesRequest(String groupName) {
    this.groupName = groupName;
  }

  public ListAttachedGroupPoliciesRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  */
  @NotNull 
  @Schema(name = "GroupName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GroupName")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public ListAttachedGroupPoliciesRequest pathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  /**
   * Get pathPrefix
   * @return pathPrefix
  */
  
  @Schema(name = "PathPrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathPrefix")
  public String getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public ListAttachedGroupPoliciesRequest marker(String marker) {
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

  public ListAttachedGroupPoliciesRequest maxItems(Integer maxItems) {
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
    ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest = (ListAttachedGroupPoliciesRequest) o;
    return Objects.equals(this.groupName, listAttachedGroupPoliciesRequest.groupName) &&
        Objects.equals(this.pathPrefix, listAttachedGroupPoliciesRequest.pathPrefix) &&
        Objects.equals(this.marker, listAttachedGroupPoliciesRequest.marker) &&
        Objects.equals(this.maxItems, listAttachedGroupPoliciesRequest.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, pathPrefix, marker, maxItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAttachedGroupPoliciesRequest {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
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

