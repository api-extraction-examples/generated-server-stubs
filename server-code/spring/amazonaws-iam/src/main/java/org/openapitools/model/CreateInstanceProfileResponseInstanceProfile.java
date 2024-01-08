package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateInstanceProfileResponseInstanceProfile
 */

@JsonTypeName("CreateInstanceProfileResponse_InstanceProfile")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateInstanceProfileResponseInstanceProfile {

  private String path;

  private String instanceProfileName;

  private String instanceProfileId;

  private String arn;

  private OffsetDateTime createDate;

  private List roles;

  private List tags;

  public CreateInstanceProfileResponseInstanceProfile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateInstanceProfileResponseInstanceProfile(String path, String instanceProfileName, String instanceProfileId, String arn, OffsetDateTime createDate, List roles) {
    this.path = path;
    this.instanceProfileName = instanceProfileName;
    this.instanceProfileId = instanceProfileId;
    this.arn = arn;
    this.createDate = createDate;
    this.roles = roles;
  }

  public CreateInstanceProfileResponseInstanceProfile path(String path) {
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

  public CreateInstanceProfileResponseInstanceProfile instanceProfileName(String instanceProfileName) {
    this.instanceProfileName = instanceProfileName;
    return this;
  }

  /**
   * Get instanceProfileName
   * @return instanceProfileName
  */
  @NotNull 
  @Schema(name = "InstanceProfileName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstanceProfileName")
  public String getInstanceProfileName() {
    return instanceProfileName;
  }

  public void setInstanceProfileName(String instanceProfileName) {
    this.instanceProfileName = instanceProfileName;
  }

  public CreateInstanceProfileResponseInstanceProfile instanceProfileId(String instanceProfileId) {
    this.instanceProfileId = instanceProfileId;
    return this;
  }

  /**
   * Get instanceProfileId
   * @return instanceProfileId
  */
  @NotNull 
  @Schema(name = "InstanceProfileId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("InstanceProfileId")
  public String getInstanceProfileId() {
    return instanceProfileId;
  }

  public void setInstanceProfileId(String instanceProfileId) {
    this.instanceProfileId = instanceProfileId;
  }

  public CreateInstanceProfileResponseInstanceProfile arn(String arn) {
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

  public CreateInstanceProfileResponseInstanceProfile createDate(OffsetDateTime createDate) {
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

  public CreateInstanceProfileResponseInstanceProfile roles(List roles) {
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

  public CreateInstanceProfileResponseInstanceProfile tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstanceProfileResponseInstanceProfile createInstanceProfileResponseInstanceProfile = (CreateInstanceProfileResponseInstanceProfile) o;
    return Objects.equals(this.path, createInstanceProfileResponseInstanceProfile.path) &&
        Objects.equals(this.instanceProfileName, createInstanceProfileResponseInstanceProfile.instanceProfileName) &&
        Objects.equals(this.instanceProfileId, createInstanceProfileResponseInstanceProfile.instanceProfileId) &&
        Objects.equals(this.arn, createInstanceProfileResponseInstanceProfile.arn) &&
        Objects.equals(this.createDate, createInstanceProfileResponseInstanceProfile.createDate) &&
        Objects.equals(this.roles, createInstanceProfileResponseInstanceProfile.roles) &&
        Objects.equals(this.tags, createInstanceProfileResponseInstanceProfile.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, instanceProfileName, instanceProfileId, arn, createDate, roles, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInstanceProfileResponseInstanceProfile {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    instanceProfileName: ").append(toIndentedString(instanceProfileName)).append("\n");
    sb.append("    instanceProfileId: ").append(toIndentedString(instanceProfileId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

