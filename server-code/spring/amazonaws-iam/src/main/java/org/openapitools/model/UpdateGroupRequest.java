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
 * UpdateGroupRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateGroupRequest {

  private String groupName;

  private String newPath;

  private String newGroupName;

  public UpdateGroupRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateGroupRequest(String groupName) {
    this.groupName = groupName;
  }

  public UpdateGroupRequest groupName(String groupName) {
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

  public UpdateGroupRequest newPath(String newPath) {
    this.newPath = newPath;
    return this;
  }

  /**
   * Get newPath
   * @return newPath
  */
  
  @Schema(name = "NewPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewPath")
  public String getNewPath() {
    return newPath;
  }

  public void setNewPath(String newPath) {
    this.newPath = newPath;
  }

  public UpdateGroupRequest newGroupName(String newGroupName) {
    this.newGroupName = newGroupName;
    return this;
  }

  /**
   * Get newGroupName
   * @return newGroupName
  */
  
  @Schema(name = "NewGroupName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewGroupName")
  public String getNewGroupName() {
    return newGroupName;
  }

  public void setNewGroupName(String newGroupName) {
    this.newGroupName = newGroupName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupRequest updateGroupRequest = (UpdateGroupRequest) o;
    return Objects.equals(this.groupName, updateGroupRequest.groupName) &&
        Objects.equals(this.newPath, updateGroupRequest.newPath) &&
        Objects.equals(this.newGroupName, updateGroupRequest.newGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, newPath, newGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupRequest {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
    sb.append("    newGroupName: ").append(toIndentedString(newGroupName)).append("\n");
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

