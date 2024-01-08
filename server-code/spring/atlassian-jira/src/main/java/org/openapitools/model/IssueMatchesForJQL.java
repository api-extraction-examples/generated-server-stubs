package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of the issues matched to a JQL query or details of errors encountered during matching.
 */

@Schema(name = "IssueMatchesForJQL", description = "A list of the issues matched to a JQL query or details of errors encountered during matching.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueMatchesForJQL {

  @Valid
  private Set<String> errors = new LinkedHashSet<>();

  @Valid
  private Set<Long> matchedIssues = new LinkedHashSet<>();

  public IssueMatchesForJQL() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueMatchesForJQL(Set<String> errors, Set<Long> matchedIssues) {
    this.errors = errors;
    this.matchedIssues = matchedIssues;
  }

  public IssueMatchesForJQL errors(Set<String> errors) {
    this.errors = errors;
    return this;
  }

  public IssueMatchesForJQL addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new LinkedHashSet<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * A list of errors.
   * @return errors
  */
  @NotNull 
  @Schema(name = "errors", description = "A list of errors.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("errors")
  public Set<String> getErrors() {
    return errors;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setErrors(Set<String> errors) {
    this.errors = errors;
  }

  public IssueMatchesForJQL matchedIssues(Set<Long> matchedIssues) {
    this.matchedIssues = matchedIssues;
    return this;
  }

  public IssueMatchesForJQL addMatchedIssuesItem(Long matchedIssuesItem) {
    if (this.matchedIssues == null) {
      this.matchedIssues = new LinkedHashSet<>();
    }
    this.matchedIssues.add(matchedIssuesItem);
    return this;
  }

  /**
   * A list of issue IDs.
   * @return matchedIssues
  */
  @NotNull 
  @Schema(name = "matchedIssues", description = "A list of issue IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("matchedIssues")
  public Set<Long> getMatchedIssues() {
    return matchedIssues;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setMatchedIssues(Set<Long> matchedIssues) {
    this.matchedIssues = matchedIssues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueMatchesForJQL issueMatchesForJQL = (IssueMatchesForJQL) o;
    return Objects.equals(this.errors, issueMatchesForJQL.errors) &&
        Objects.equals(this.matchedIssues, issueMatchesForJQL.matchedIssues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, matchedIssues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueMatchesForJQL {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    matchedIssues: ").append(toIndentedString(matchedIssues)).append("\n");
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

