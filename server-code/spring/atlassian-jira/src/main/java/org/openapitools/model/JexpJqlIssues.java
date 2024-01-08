package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The JQL specifying the issues available in the evaluated Jira expression under the &#x60;issues&#x60; context variable. Not all issues returned by the JQL query are loaded, only those described by the &#x60;startAt&#x60; and &#x60;maxResults&#x60; properties. To determine whether it is necessary to iterate to ensure all the issues returned by the JQL query are evaluated, inspect &#x60;meta.issues.jql.count&#x60; in the response.
 */

@Schema(name = "JexpJqlIssues", description = "The JQL specifying the issues available in the evaluated Jira expression under the `issues` context variable. Not all issues returned by the JQL query are loaded, only those described by the `startAt` and `maxResults` properties. To determine whether it is necessary to iterate to ensure all the issues returned by the JQL query are evaluated, inspect `meta.issues.jql.count` in the response.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JexpJqlIssues {

  private Integer maxResults;

  private String query;

  private Long startAt;

  /**
   * Determines how to validate the JQL query and treat the validation results.
   */
  public enum ValidationEnum {
    STRICT("strict"),
    
    WARN("warn"),
    
    NONE("none");

    private String value;

    ValidationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ValidationEnum fromValue(String value) {
      for (ValidationEnum b : ValidationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ValidationEnum validation = ValidationEnum.STRICT;

  public JexpJqlIssues maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  /**
   * The maximum number of issues to return from the JQL query. Inspect `meta.issues.jql.maxResults` in the response to ensure the maximum value has not been exceeded.
   * @return maxResults
  */
  
  @Schema(name = "maxResults", description = "The maximum number of issues to return from the JQL query. Inspect `meta.issues.jql.maxResults` in the response to ensure the maximum value has not been exceeded.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maxResults")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public JexpJqlIssues query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The JQL query.
   * @return query
  */
  
  @Schema(name = "query", description = "The JQL query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("query")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public JexpJqlIssues startAt(Long startAt) {
    this.startAt = startAt;
    return this;
  }

  /**
   * The index of the first issue to return from the JQL query.
   * @return startAt
  */
  
  @Schema(name = "startAt", description = "The index of the first issue to return from the JQL query.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startAt")
  public Long getStartAt() {
    return startAt;
  }

  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }

  public JexpJqlIssues validation(ValidationEnum validation) {
    this.validation = validation;
    return this;
  }

  /**
   * Determines how to validate the JQL query and treat the validation results.
   * @return validation
  */
  
  @Schema(name = "validation", description = "Determines how to validate the JQL query and treat the validation results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("validation")
  public ValidationEnum getValidation() {
    return validation;
  }

  public void setValidation(ValidationEnum validation) {
    this.validation = validation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JexpJqlIssues jexpJqlIssues = (JexpJqlIssues) o;
    return Objects.equals(this.maxResults, jexpJqlIssues.maxResults) &&
        Objects.equals(this.query, jexpJqlIssues.query) &&
        Objects.equals(this.startAt, jexpJqlIssues.startAt) &&
        Objects.equals(this.validation, jexpJqlIssues.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxResults, query, startAt, validation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JexpJqlIssues {\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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

