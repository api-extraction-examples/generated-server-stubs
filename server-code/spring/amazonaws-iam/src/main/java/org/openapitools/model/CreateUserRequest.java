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
 * CreateUserRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateUserRequest {

  private String path;

  private String userName;

  private String permissionsBoundary;

  private List tags;

  public CreateUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateUserRequest(String userName) {
    this.userName = userName;
  }

  public CreateUserRequest path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public CreateUserRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @NotNull 
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public CreateUserRequest permissionsBoundary(String permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
    return this;
  }

  /**
   * Get permissionsBoundary
   * @return permissionsBoundary
  */
  
  @Schema(name = "PermissionsBoundary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundary")
  public String getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(String permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }

  public CreateUserRequest tags(List tags) {
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
    CreateUserRequest createUserRequest = (CreateUserRequest) o;
    return Objects.equals(this.path, createUserRequest.path) &&
        Objects.equals(this.userName, createUserRequest.userName) &&
        Objects.equals(this.permissionsBoundary, createUserRequest.permissionsBoundary) &&
        Objects.equals(this.tags, createUserRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, userName, permissionsBoundary, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUserRequest {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    permissionsBoundary: ").append(toIndentedString(permissionsBoundary)).append("\n");
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

