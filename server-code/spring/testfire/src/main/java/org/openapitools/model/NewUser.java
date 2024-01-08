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
 * NewUser
 */

@JsonTypeName("newUser")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:43.475854-04:00[America/Lower_Princes]")
public class NewUser {

  private String firstname;

  private String lastname;

  private String password1;

  private String password2;

  private String username;

  public NewUser() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NewUser(String firstname, String lastname, String password1, String password2, String username) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.password1 = password1;
    this.password2 = password2;
    this.username = username;
  }

  public NewUser firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * Get firstname
   * @return firstname
  */
  @NotNull 
  @Schema(name = "firstname", example = "Bilbo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("firstname")
  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public NewUser lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * Get lastname
   * @return lastname
  */
  @NotNull 
  @Schema(name = "lastname", example = "Baggins", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastname")
  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public NewUser password1(String password1) {
    this.password1 = password1;
    return this;
  }

  /**
   * Get password1
   * @return password1
  */
  @NotNull 
  @Schema(name = "password1", example = "S3l3ctS0methingStr0ng5AsP@ssword", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password1")
  public String getPassword1() {
    return password1;
  }

  public void setPassword1(String password1) {
    this.password1 = password1;
  }

  public NewUser password2(String password2) {
    this.password2 = password2;
    return this;
  }

  /**
   * Get password2
   * @return password2
  */
  @NotNull 
  @Schema(name = "password2", example = "S3l3ctS0methingStr0ng5AsP@ssword", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("password2")
  public String getPassword2() {
    return password2;
  }

  public void setPassword2(String password2) {
    this.password2 = password2;
  }

  public NewUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @NotNull 
  @Schema(name = "username", example = "bilbob", requiredMode = Schema.RequiredMode.REQUIRED)
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
    NewUser newUser = (NewUser) o;
    return Objects.equals(this.firstname, newUser.firstname) &&
        Objects.equals(this.lastname, newUser.lastname) &&
        Objects.equals(this.password1, newUser.password1) &&
        Objects.equals(this.password2, newUser.password2) &&
        Objects.equals(this.username, newUser.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstname, lastname, password1, password2, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewUser {\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
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

