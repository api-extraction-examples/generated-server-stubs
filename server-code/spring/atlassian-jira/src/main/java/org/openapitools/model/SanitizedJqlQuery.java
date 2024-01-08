package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ErrorCollection;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the sanitized JQL query.
 */

@Schema(name = "SanitizedJqlQuery", description = "Details of the sanitized JQL query.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SanitizedJqlQuery {

  private JsonNullable<@Size(max = 128) String> accountId = JsonNullable.<String>undefined();

  private ErrorCollection errors;

  private String initialQuery;

  private JsonNullable<String> sanitizedQuery = JsonNullable.<String>undefined();

  public SanitizedJqlQuery accountId(String accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * The account ID of the user for whom sanitization was performed.
   * @return accountId
  */
  @Size(max = 128) 
  @Schema(name = "accountId", description = "The account ID of the user for whom sanitization was performed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public JsonNullable<@Size(max = 128) String> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<String> accountId) {
    this.accountId = accountId;
  }

  public SanitizedJqlQuery errors(ErrorCollection errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Get errors
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public ErrorCollection getErrors() {
    return errors;
  }

  public void setErrors(ErrorCollection errors) {
    this.errors = errors;
  }

  public SanitizedJqlQuery initialQuery(String initialQuery) {
    this.initialQuery = initialQuery;
    return this;
  }

  /**
   * The initial query.
   * @return initialQuery
  */
  
  @Schema(name = "initialQuery", description = "The initial query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initialQuery")
  public String getInitialQuery() {
    return initialQuery;
  }

  public void setInitialQuery(String initialQuery) {
    this.initialQuery = initialQuery;
  }

  public SanitizedJqlQuery sanitizedQuery(String sanitizedQuery) {
    this.sanitizedQuery = JsonNullable.of(sanitizedQuery);
    return this;
  }

  /**
   * The sanitized query, if there were no errors.
   * @return sanitizedQuery
  */
  
  @Schema(name = "sanitizedQuery", description = "The sanitized query, if there were no errors.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sanitizedQuery")
  public JsonNullable<String> getSanitizedQuery() {
    return sanitizedQuery;
  }

  public void setSanitizedQuery(JsonNullable<String> sanitizedQuery) {
    this.sanitizedQuery = sanitizedQuery;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanitizedJqlQuery sanitizedJqlQuery = (SanitizedJqlQuery) o;
    return equalsNullable(this.accountId, sanitizedJqlQuery.accountId) &&
        Objects.equals(this.errors, sanitizedJqlQuery.errors) &&
        Objects.equals(this.initialQuery, sanitizedJqlQuery.initialQuery) &&
        equalsNullable(this.sanitizedQuery, sanitizedJqlQuery.sanitizedQuery);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accountId), errors, initialQuery, hashCodeNullable(sanitizedQuery));
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
    sb.append("class SanitizedJqlQuery {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    initialQuery: ").append(toIndentedString(initialQuery)).append("\n");
    sb.append("    sanitizedQuery: ").append(toIndentedString(sanitizedQuery)).append("\n");
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

