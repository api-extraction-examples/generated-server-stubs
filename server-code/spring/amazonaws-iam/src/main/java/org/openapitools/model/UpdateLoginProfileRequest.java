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
 * UpdateLoginProfileRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateLoginProfileRequest {

  private String userName;

  private String password;

  private Boolean passwordResetRequired;

  public UpdateLoginProfileRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateLoginProfileRequest(String userName) {
    this.userName = userName;
  }

  public UpdateLoginProfileRequest userName(String userName) {
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

  public UpdateLoginProfileRequest password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "Password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public UpdateLoginProfileRequest passwordResetRequired(Boolean passwordResetRequired) {
    this.passwordResetRequired = passwordResetRequired;
    return this;
  }

  /**
   * Get passwordResetRequired
   * @return passwordResetRequired
  */
  
  @Schema(name = "PasswordResetRequired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PasswordResetRequired")
  public Boolean getPasswordResetRequired() {
    return passwordResetRequired;
  }

  public void setPasswordResetRequired(Boolean passwordResetRequired) {
    this.passwordResetRequired = passwordResetRequired;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateLoginProfileRequest updateLoginProfileRequest = (UpdateLoginProfileRequest) o;
    return Objects.equals(this.userName, updateLoginProfileRequest.userName) &&
        Objects.equals(this.password, updateLoginProfileRequest.password) &&
        Objects.equals(this.passwordResetRequired, updateLoginProfileRequest.passwordResetRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, passwordResetRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateLoginProfileRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passwordResetRequired: ").append(toIndentedString(passwordResetRequired)).append("\n");
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

