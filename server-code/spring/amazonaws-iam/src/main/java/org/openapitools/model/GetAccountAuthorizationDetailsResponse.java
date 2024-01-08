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
 * Contains the response to a successful &lt;a&gt;GetAccountAuthorizationDetails&lt;/a&gt; request. 
 */

@Schema(name = "GetAccountAuthorizationDetailsResponse", description = "Contains the response to a successful <a>GetAccountAuthorizationDetails</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetAccountAuthorizationDetailsResponse {

  private List userDetailList;

  private List groupDetailList;

  private List roleDetailList;

  private List policies;

  private Boolean isTruncated;

  private String marker;

  public GetAccountAuthorizationDetailsResponse userDetailList(List userDetailList) {
    this.userDetailList = userDetailList;
    return this;
  }

  /**
   * Get userDetailList
   * @return userDetailList
  */
  @Valid 
  @Schema(name = "UserDetailList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserDetailList")
  public List getUserDetailList() {
    return userDetailList;
  }

  public void setUserDetailList(List userDetailList) {
    this.userDetailList = userDetailList;
  }

  public GetAccountAuthorizationDetailsResponse groupDetailList(List groupDetailList) {
    this.groupDetailList = groupDetailList;
    return this;
  }

  /**
   * Get groupDetailList
   * @return groupDetailList
  */
  @Valid 
  @Schema(name = "GroupDetailList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupDetailList")
  public List getGroupDetailList() {
    return groupDetailList;
  }

  public void setGroupDetailList(List groupDetailList) {
    this.groupDetailList = groupDetailList;
  }

  public GetAccountAuthorizationDetailsResponse roleDetailList(List roleDetailList) {
    this.roleDetailList = roleDetailList;
    return this;
  }

  /**
   * Get roleDetailList
   * @return roleDetailList
  */
  @Valid 
  @Schema(name = "RoleDetailList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoleDetailList")
  public List getRoleDetailList() {
    return roleDetailList;
  }

  public void setRoleDetailList(List roleDetailList) {
    this.roleDetailList = roleDetailList;
  }

  public GetAccountAuthorizationDetailsResponse policies(List policies) {
    this.policies = policies;
    return this;
  }

  /**
   * Get policies
   * @return policies
  */
  @Valid 
  @Schema(name = "Policies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Policies")
  public List getPolicies() {
    return policies;
  }

  public void setPolicies(List policies) {
    this.policies = policies;
  }

  public GetAccountAuthorizationDetailsResponse isTruncated(Boolean isTruncated) {
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

  public GetAccountAuthorizationDetailsResponse marker(String marker) {
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
    GetAccountAuthorizationDetailsResponse getAccountAuthorizationDetailsResponse = (GetAccountAuthorizationDetailsResponse) o;
    return Objects.equals(this.userDetailList, getAccountAuthorizationDetailsResponse.userDetailList) &&
        Objects.equals(this.groupDetailList, getAccountAuthorizationDetailsResponse.groupDetailList) &&
        Objects.equals(this.roleDetailList, getAccountAuthorizationDetailsResponse.roleDetailList) &&
        Objects.equals(this.policies, getAccountAuthorizationDetailsResponse.policies) &&
        Objects.equals(this.isTruncated, getAccountAuthorizationDetailsResponse.isTruncated) &&
        Objects.equals(this.marker, getAccountAuthorizationDetailsResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userDetailList, groupDetailList, roleDetailList, policies, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountAuthorizationDetailsResponse {\n");
    sb.append("    userDetailList: ").append(toIndentedString(userDetailList)).append("\n");
    sb.append("    groupDetailList: ").append(toIndentedString(groupDetailList)).append("\n");
    sb.append("    roleDetailList: ").append(toIndentedString(roleDetailList)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

