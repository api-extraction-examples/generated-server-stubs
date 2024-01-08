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
 * Contains the response to a successful &lt;a&gt;ListInstanceProfilesForRole&lt;/a&gt; request. 
 */

@Schema(name = "ListInstanceProfilesForRoleResponse", description = "Contains the response to a successful <a>ListInstanceProfilesForRole</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListInstanceProfilesForRoleResponse {

  private List instanceProfiles;

  private Boolean isTruncated;

  private String marker;

  public ListInstanceProfilesForRoleResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListInstanceProfilesForRoleResponse(List instanceProfiles) {
    this.instanceProfiles = instanceProfiles;
  }

  public ListInstanceProfilesForRoleResponse instanceProfiles(List instanceProfiles) {
    this.instanceProfiles = instanceProfiles;
    return this;
  }

  /**
   * Get instanceProfiles
   * @return instanceProfiles
  */
  @NotNull @Valid 
  @Schema(name = "InstanceProfiles", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstanceProfiles")
  public List getInstanceProfiles() {
    return instanceProfiles;
  }

  public void setInstanceProfiles(List instanceProfiles) {
    this.instanceProfiles = instanceProfiles;
  }

  public ListInstanceProfilesForRoleResponse isTruncated(Boolean isTruncated) {
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

  public ListInstanceProfilesForRoleResponse marker(String marker) {
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
    ListInstanceProfilesForRoleResponse listInstanceProfilesForRoleResponse = (ListInstanceProfilesForRoleResponse) o;
    return Objects.equals(this.instanceProfiles, listInstanceProfilesForRoleResponse.instanceProfiles) &&
        Objects.equals(this.isTruncated, listInstanceProfilesForRoleResponse.isTruncated) &&
        Objects.equals(this.marker, listInstanceProfilesForRoleResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceProfiles, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListInstanceProfilesForRoleResponse {\n");
    sb.append("    instanceProfiles: ").append(toIndentedString(instanceProfiles)).append("\n");
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

