package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;ListRoles&lt;/a&gt; request. 
 */

@Schema(name = "ListRolesResponse", description = "Contains the response to a successful <a>ListRoles</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListRolesResponse {

  private List roles;

  private Boolean isTruncated;

  private String marker;

  public ListRolesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListRolesResponse(List roles) {
    this.roles = roles;
  }

  public ListRolesResponse roles(List roles) {
    this.roles = roles;
    return this;
  }

  /**
   * Get roles
   * @return roles
  */
  @NotNull @Valid 
  @Schema(name = "Roles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Roles")
  public List getRoles() {
    return roles;
  }

  public void setRoles(List roles) {
    this.roles = roles;
  }

  public ListRolesResponse isTruncated(Boolean isTruncated) {
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

  public ListRolesResponse marker(String marker) {
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
    ListRolesResponse listRolesResponse = (ListRolesResponse) o;
    return Objects.equals(this.roles, listRolesResponse.roles) &&
        Objects.equals(this.isTruncated, listRolesResponse.isTruncated) &&
        Objects.equals(this.marker, listRolesResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roles, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRolesResponse {\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
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

