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
 * PutUserPermissionsBoundaryRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class PutUserPermissionsBoundaryRequest {

  private String userName;

  private String permissionsBoundary;

  public PutUserPermissionsBoundaryRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PutUserPermissionsBoundaryRequest(String userName, String permissionsBoundary) {
    this.userName = userName;
    this.permissionsBoundary = permissionsBoundary;
  }

  public PutUserPermissionsBoundaryRequest userName(String userName) {
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

  public PutUserPermissionsBoundaryRequest permissionsBoundary(String permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
    return this;
  }

  /**
   * Get permissionsBoundary
   * @return permissionsBoundary
  */
  @NotNull 
  @Schema(name = "PermissionsBoundary", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PermissionsBoundary")
  public String getPermissionsBoundary() {
    return permissionsBoundary;
  }

  public void setPermissionsBoundary(String permissionsBoundary) {
    this.permissionsBoundary = permissionsBoundary;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutUserPermissionsBoundaryRequest putUserPermissionsBoundaryRequest = (PutUserPermissionsBoundaryRequest) o;
    return Objects.equals(this.userName, putUserPermissionsBoundaryRequest.userName) &&
        Objects.equals(this.permissionsBoundary, putUserPermissionsBoundaryRequest.permissionsBoundary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, permissionsBoundary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutUserPermissionsBoundaryRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    permissionsBoundary: ").append(toIndentedString(permissionsBoundary)).append("\n");
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

