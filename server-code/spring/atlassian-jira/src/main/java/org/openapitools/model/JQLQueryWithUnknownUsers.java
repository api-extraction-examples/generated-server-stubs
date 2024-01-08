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
 * JQL queries that contained users that could not be found
 */

@Schema(name = "JQLQueryWithUnknownUsers", description = "JQL queries that contained users that could not be found")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JQLQueryWithUnknownUsers {

  private String convertedQuery;

  private String originalQuery;

  public JQLQueryWithUnknownUsers convertedQuery(String convertedQuery) {
    this.convertedQuery = convertedQuery;
    return this;
  }

  /**
   * The converted query, with accountIDs instead of user identifiers, or 'unknown' for users that could not be found
   * @return convertedQuery
  */
  
  @Schema(name = "convertedQuery", description = "The converted query, with accountIDs instead of user identifiers, or 'unknown' for users that could not be found", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("convertedQuery")
  public String getConvertedQuery() {
    return convertedQuery;
  }

  public void setConvertedQuery(String convertedQuery) {
    this.convertedQuery = convertedQuery;
  }

  public JQLQueryWithUnknownUsers originalQuery(String originalQuery) {
    this.originalQuery = originalQuery;
    return this;
  }

  /**
   * The original query, for reference
   * @return originalQuery
  */
  
  @Schema(name = "originalQuery", description = "The original query, for reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalQuery")
  public String getOriginalQuery() {
    return originalQuery;
  }

  public void setOriginalQuery(String originalQuery) {
    this.originalQuery = originalQuery;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JQLQueryWithUnknownUsers jqLQueryWithUnknownUsers = (JQLQueryWithUnknownUsers) o;
    return Objects.equals(this.convertedQuery, jqLQueryWithUnknownUsers.convertedQuery) &&
        Objects.equals(this.originalQuery, jqLQueryWithUnknownUsers.originalQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(convertedQuery, originalQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JQLQueryWithUnknownUsers {\n");
    sb.append("    convertedQuery: ").append(toIndentedString(convertedQuery)).append("\n");
    sb.append("    originalQuery: ").append(toIndentedString(originalQuery)).append("\n");
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

