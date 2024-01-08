package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetGroupResponseGroup
 */

@JsonTypeName("GetGroupResponse_Group")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetGroupResponseGroup {

  private String path;

  private String groupName;

  private String groupId;

  private String arn;

  private OffsetDateTime createDate;

  public GetGroupResponseGroup() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetGroupResponseGroup(String path, String groupName, String groupId, String arn, OffsetDateTime createDate) {
    this.path = path;
    this.groupName = groupName;
    this.groupId = groupId;
    this.arn = arn;
    this.createDate = createDate;
  }

  public GetGroupResponseGroup path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @NotNull 
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public GetGroupResponseGroup groupName(String groupName) {
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

  public GetGroupResponseGroup groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Get groupId
   * @return groupId
  */
  @NotNull 
  @Schema(name = "GroupId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GroupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public GetGroupResponseGroup arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
  */
  @NotNull 
  @Schema(name = "Arn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public GetGroupResponseGroup createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @NotNull @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupResponseGroup getGroupResponseGroup = (GetGroupResponseGroup) o;
    return Objects.equals(this.path, getGroupResponseGroup.path) &&
        Objects.equals(this.groupName, getGroupResponseGroup.groupName) &&
        Objects.equals(this.groupId, getGroupResponseGroup.groupId) &&
        Objects.equals(this.arn, getGroupResponseGroup.arn) &&
        Objects.equals(this.createDate, getGroupResponseGroup.createDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, groupName, groupId, arn, createDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupResponseGroup {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
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

