package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChangePassword
 */

@JsonTypeName("changePassword")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:43.475854-04:00[America/Lower_Princes]")
public class ChangePassword {

  private String password1;

  private String password2;

  private String username;

  public ChangePassword() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ChangePassword(String password2, String username) {
    this.password2 = password2;
    this.username = username;
  }

  public ChangePassword password1(String password1) {
    this.password1 = password1;
    return this;
  }

  /**
   * Get password1
   * @return password1
  */
  
  @Schema(name = "password1", example = "Th1s!sz3nu3Passv0rd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password1")
  public String getPassword1() {
    return password1;
  }

  public void setPassword1(String password1) {
    this.password1 = password1;
  }

  public ChangePassword password2(String password2) {
    this.password2 = password2;
    return this;
  }

  /**
   * Get password2
   * @return password2
  */
  @NotNull 
  @Schema(name = "password2", example = "Th1s!sz3nu3Passv0rd", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password2")
  public String getPassword2() {
    return password2;
  }

  public void setPassword2(String password2) {
    this.password2 = password2;
  }

  public ChangePassword username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @NotNull 
  @Schema(name = "username", example = "jdoe", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangePassword changePassword = (ChangePassword) o;
    return Objects.equals(this.password1, changePassword.password1) &&
        Objects.equals(this.password2, changePassword.password2) &&
        Objects.equals(this.username, changePassword.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password1, password2, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangePassword {\n");
    sb.append("    password1: ").append("*").append("\n");
    sb.append("    password2: ").append("*").append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

