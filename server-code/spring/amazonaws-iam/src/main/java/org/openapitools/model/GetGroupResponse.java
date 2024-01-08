package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.model.GetGroupResponseGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetGroup&lt;/a&gt; request. 
 */

@Schema(name = "GetGroupResponse", description = "Contains the response to a successful <a>GetGroup</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetGroupResponse {

  private GetGroupResponseGroup group;

  private List users;

  private Boolean isTruncated;

  private String marker;

  public GetGroupResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetGroupResponse(GetGroupResponseGroup group, List users) {
    this.group = group;
    this.users = users;
  }

  public GetGroupResponse group(GetGroupResponseGroup group) {
    this.group = group;
    return this;
  }

  /**
   * Get group
   * @return group
  */
  @NotNull @Valid 
  @Schema(name = "Group", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Group")
  public GetGroupResponseGroup getGroup() {
    return group;
  }

  public void setGroup(GetGroupResponseGroup group) {
    this.group = group;
  }

  public GetGroupResponse users(List users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @NotNull @Valid 
  @Schema(name = "Users", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Users")
  public List getUsers() {
    return users;
  }

  public void setUsers(List users) {
    this.users = users;
  }

  public GetGroupResponse isTruncated(Boolean isTruncated) {
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

  public GetGroupResponse marker(String marker) {
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
    GetGroupResponse getGroupResponse = (GetGroupResponse) o;
    return Objects.equals(this.group, getGroupResponse.group) &&
        Objects.equals(this.users, getGroupResponse.users) &&
        Objects.equals(this.isTruncated, getGroupResponse.isTruncated) &&
        Objects.equals(this.marker, getGroupResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, users, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupResponse {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

