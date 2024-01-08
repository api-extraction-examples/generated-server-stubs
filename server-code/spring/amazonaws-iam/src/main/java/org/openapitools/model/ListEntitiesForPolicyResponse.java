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
 * Contains the response to a successful &lt;a&gt;ListEntitiesForPolicy&lt;/a&gt; request. 
 */

@Schema(name = "ListEntitiesForPolicyResponse", description = "Contains the response to a successful <a>ListEntitiesForPolicy</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListEntitiesForPolicyResponse {

  private List policyGroups;

  private List policyUsers;

  private List policyRoles;

  private Boolean isTruncated;

  private String marker;

  public ListEntitiesForPolicyResponse policyGroups(List policyGroups) {
    this.policyGroups = policyGroups;
    return this;
  }

  /**
   * Get policyGroups
   * @return policyGroups
  */
  @Valid 
  @Schema(name = "PolicyGroups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyGroups")
  public List getPolicyGroups() {
    return policyGroups;
  }

  public void setPolicyGroups(List policyGroups) {
    this.policyGroups = policyGroups;
  }

  public ListEntitiesForPolicyResponse policyUsers(List policyUsers) {
    this.policyUsers = policyUsers;
    return this;
  }

  /**
   * Get policyUsers
   * @return policyUsers
  */
  @Valid 
  @Schema(name = "PolicyUsers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyUsers")
  public List getPolicyUsers() {
    return policyUsers;
  }

  public void setPolicyUsers(List policyUsers) {
    this.policyUsers = policyUsers;
  }

  public ListEntitiesForPolicyResponse policyRoles(List policyRoles) {
    this.policyRoles = policyRoles;
    return this;
  }

  /**
   * Get policyRoles
   * @return policyRoles
  */
  @Valid 
  @Schema(name = "PolicyRoles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyRoles")
  public List getPolicyRoles() {
    return policyRoles;
  }

  public void setPolicyRoles(List policyRoles) {
    this.policyRoles = policyRoles;
  }

  public ListEntitiesForPolicyResponse isTruncated(Boolean isTruncated) {
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

  public ListEntitiesForPolicyResponse marker(String marker) {
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
    ListEntitiesForPolicyResponse listEntitiesForPolicyResponse = (ListEntitiesForPolicyResponse) o;
    return Objects.equals(this.policyGroups, listEntitiesForPolicyResponse.policyGroups) &&
        Objects.equals(this.policyUsers, listEntitiesForPolicyResponse.policyUsers) &&
        Objects.equals(this.policyRoles, listEntitiesForPolicyResponse.policyRoles) &&
        Objects.equals(this.isTruncated, listEntitiesForPolicyResponse.isTruncated) &&
        Objects.equals(this.marker, listEntitiesForPolicyResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyGroups, policyUsers, policyRoles, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEntitiesForPolicyResponse {\n");
    sb.append("    policyGroups: ").append(toIndentedString(policyGroups)).append("\n");
    sb.append("    policyUsers: ").append(toIndentedString(policyUsers)).append("\n");
    sb.append("    policyRoles: ").append(toIndentedString(policyRoles)).append("\n");
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

