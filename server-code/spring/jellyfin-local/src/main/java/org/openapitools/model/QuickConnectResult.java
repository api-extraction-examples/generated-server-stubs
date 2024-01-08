package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Stores the result of an incoming quick connect request.
 */

@Schema(name = "QuickConnectResult", description = "Stores the result of an incoming quick connect request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class QuickConnectResult {

  private Boolean authenticated;

  private JsonNullable<String> authentication = JsonNullable.<String>undefined();

  private JsonNullable<String> code = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dateAdded = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<String> error = JsonNullable.<String>undefined();

  private JsonNullable<String> secret = JsonNullable.<String>undefined();

  public QuickConnectResult authenticated(Boolean authenticated) {
    this.authenticated = authenticated;
    return this;
  }

  /**
   * Gets a value indicating whether this request is authorized.
   * @return authenticated
  */
  
  @Schema(name = "Authenticated", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets a value indicating whether this request is authorized.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Authenticated")
  public Boolean getAuthenticated() {
    return authenticated;
  }

  public void setAuthenticated(Boolean authenticated) {
    this.authenticated = authenticated;
  }

  public QuickConnectResult authentication(String authentication) {
    this.authentication = JsonNullable.of(authentication);
    return this;
  }

  /**
   * Gets or sets the private access token.
   * @return authentication
  */
  
  @Schema(name = "Authentication", description = "Gets or sets the private access token.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Authentication")
  public JsonNullable<String> getAuthentication() {
    return authentication;
  }

  public void setAuthentication(JsonNullable<String> authentication) {
    this.authentication = authentication;
  }

  public QuickConnectResult code(String code) {
    this.code = JsonNullable.of(code);
    return this;
  }

  /**
   * Gets or sets the user facing code used so the user can quickly differentiate this request from others.
   * @return code
  */
  
  @Schema(name = "Code", description = "Gets or sets the user facing code used so the user can quickly differentiate this request from others.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Code")
  public JsonNullable<String> getCode() {
    return code;
  }

  public void setCode(JsonNullable<String> code) {
    this.code = code;
  }

  public QuickConnectResult dateAdded(OffsetDateTime dateAdded) {
    this.dateAdded = JsonNullable.of(dateAdded);
    return this;
  }

  /**
   * Gets or sets the DateTime that this request was created.
   * @return dateAdded
  */
  @Valid 
  @Schema(name = "DateAdded", description = "Gets or sets the DateTime that this request was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateAdded")
  public JsonNullable<OffsetDateTime> getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(JsonNullable<OffsetDateTime> dateAdded) {
    this.dateAdded = dateAdded;
  }

  public QuickConnectResult error(String error) {
    this.error = JsonNullable.of(error);
    return this;
  }

  /**
   * Gets or sets an error message.
   * @return error
  */
  
  @Schema(name = "Error", description = "Gets or sets an error message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Error")
  public JsonNullable<String> getError() {
    return error;
  }

  public void setError(JsonNullable<String> error) {
    this.error = error;
  }

  public QuickConnectResult secret(String secret) {
    this.secret = JsonNullable.of(secret);
    return this;
  }

  /**
   * Gets or sets the secret value used to uniquely identify this request. Can be used to retrieve authentication information.
   * @return secret
  */
  
  @Schema(name = "Secret", description = "Gets or sets the secret value used to uniquely identify this request. Can be used to retrieve authentication information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Secret")
  public JsonNullable<String> getSecret() {
    return secret;
  }

  public void setSecret(JsonNullable<String> secret) {
    this.secret = secret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuickConnectResult quickConnectResult = (QuickConnectResult) o;
    return Objects.equals(this.authenticated, quickConnectResult.authenticated) &&
        equalsNullable(this.authentication, quickConnectResult.authentication) &&
        equalsNullable(this.code, quickConnectResult.code) &&
        equalsNullable(this.dateAdded, quickConnectResult.dateAdded) &&
        equalsNullable(this.error, quickConnectResult.error) &&
        equalsNullable(this.secret, quickConnectResult.secret);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticated, hashCodeNullable(authentication), hashCodeNullable(code), hashCodeNullable(dateAdded), hashCodeNullable(error), hashCodeNullable(secret));
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
    sb.append("class QuickConnectResult {\n");
    sb.append("    authenticated: ").append(toIndentedString(authenticated)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    dateAdded: ").append(toIndentedString(dateAdded)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

