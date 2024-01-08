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
 * UpdateUserRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateUserRequest {

  private String userName;

  private String newPath;

  private String newUserName;

  public UpdateUserRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateUserRequest(String userName) {
    this.userName = userName;
  }

  public UpdateUserRequest userName(String userName) {
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

  public UpdateUserRequest newPath(String newPath) {
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

  public UpdateUserRequest newUserName(String newUserName) {
    this.newUserName = newUserName;
    return this;
  }

  /**
   * Get newUserName
   * @return newUserName
  */
  
  @Schema(name = "NewUserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewUserName")
  public String getNewUserName() {
    return newUserName;
  }

  public void setNewUserName(String newUserName) {
    this.newUserName = newUserName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateUserRequest updateUserRequest = (UpdateUserRequest) o;
    return Objects.equals(this.userName, updateUserRequest.userName) &&
        Objects.equals(this.newPath, updateUserRequest.newPath) &&
        Objects.equals(this.newUserName, updateUserRequest.newUserName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, newPath, newUserName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateUserRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
    sb.append("    newUserName: ").append(toIndentedString(newUserName)).append("\n");
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
