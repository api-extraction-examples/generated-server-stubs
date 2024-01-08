package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The authenticate user by name request body.
 */

@Schema(name = "AuthenticateUserByName", description = "The authenticate user by name request body.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class AuthenticateUserByName {

  private JsonNullable<String> password = JsonNullable.<String>undefined();

  private JsonNullable<String> pw = JsonNullable.<String>undefined();

  private JsonNullable<String> username = JsonNullable.<String>undefined();

  public AuthenticateUserByName password(String password) {
    this.password = JsonNullable.of(password);
    return this;
  }

  /**
   * Gets or sets the sha1-hashed password.
   * @return password
  */
  
  @Schema(name = "Password", description = "Gets or sets the sha1-hashed password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Password")
  public JsonNullable<String> getPassword() {
    return password;
  }

  public void setPassword(JsonNullable<String> password) {
    this.password = password;
  }

  public AuthenticateUserByName pw(String pw) {
    this.pw = JsonNullable.of(pw);
    return this;
  }

  /**
   * Gets or sets the plain text password.
   * @return pw
  */
  
  @Schema(name = "Pw", description = "Gets or sets the plain text password.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Pw")
  public JsonNullable<String> getPw() {
    return pw;
  }

  public void setPw(JsonNullable<String> pw) {
    this.pw = pw;
  }

  public AuthenticateUserByName username(String username) {
    this.username = JsonNullable.of(username);
    return this;
  }

  /**
   * Gets or sets the username.
   * @return username
  */
  
  @Schema(name = "Username", description = "Gets or sets the username.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Username")
  public JsonNullable<String> getUsername() {
    return username;
  }

  public void setUsername(JsonNullable<String> username) {
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
    AuthenticateUserByName authenticateUserByName = (AuthenticateUserByName) o;
    return equalsNullable(this.password, authenticateUserByName.password) &&
        equalsNullable(this.pw, authenticateUserByName.pw) &&
        equalsNullable(this.username, authenticateUserByName.username);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(password), hashCodeNullable(pw), hashCodeNullable(username));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateUserByName {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    pw: ").append(toIndentedString(pw)).append("\n");
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

