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
 * ListRolePoliciesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListRolePoliciesRequest {

  private String roleName;

  private String marker;

  private Integer maxItems;

  public ListRolePoliciesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListRolePoliciesRequest(String roleName) {
    this.roleName = roleName;
  }

  public ListRolePoliciesRequest roleName(String roleName) {
    this.roleName = roleName;
    return this;
  }

  /**
   * Get roleName
   * @return roleName
  */
  @NotNull 
  @Schema(name = "RoleName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RoleName")
  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  public ListRolePoliciesRequest marker(String marker) {
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

  public ListRolePoliciesRequest maxItems(Integer maxItems) {
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
    ListRolePoliciesRequest listRolePoliciesRequest = (ListRolePoliciesRequest) o;
    return Objects.equals(this.roleName, listRolePoliciesRequest.roleName) &&
        Objects.equals(this.marker, listRolePoliciesRequest.marker) &&
        Objects.equals(this.maxItems, listRolePoliciesRequest.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleName, marker, maxItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRolePoliciesRequest {\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
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

