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
 * The JQL query to sanitize for the account ID. If the account ID is null, sanitizing is performed for an anonymous user.
 */

@Schema(name = "JqlQueryToSanitize", description = "The JQL query to sanitize for the account ID. If the account ID is null, sanitizing is performed for an anonymous user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueryToSanitize {

  private JsonNullable<@Size(max = 128) String> accountId = JsonNullable.<String>undefined();

  private String query;

  public JqlQueryToSanitize() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueryToSanitize(String query) {
    this.query = query;
  }

  public JqlQueryToSanitize accountId(String accountId) {
    this.accountId = JsonNullable.of(accountId);
    return this;
  }

  /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.
   * @return accountId
  */
  @Size(max = 128) 
  @Schema(name = "accountId", description = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public JsonNullable<@Size(max = 128) String> getAccountId() {
    return accountId;
  }

  public void setAccountId(JsonNullable<String> accountId) {
    this.accountId = accountId;
  }

  public JqlQueryToSanitize query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query to sanitize.
   * @return query
  */
  @NotNull 
  @Schema(name = "query", description = "The query to sanitize.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryToSanitize jqlQueryToSanitize = (JqlQueryToSanitize) o;
    return equalsNullable(this.accountId, jqlQueryToSanitize.accountId) &&
        Objects.equals(this.query, jqlQueryToSanitize.query);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accountId), query);
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
    sb.append("class JqlQueryToSanitize {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

