package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueMatchesForJQL;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.
 */

@Schema(name = "IssueMatches", description = "A list of matched issues or errors for each JQL query, in the order the JQL queries were passed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueMatches {

  @Valid
  private List<@Valid IssueMatchesForJQL> matches = new ArrayList<>();

  public IssueMatches() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueMatches(List<@Valid IssueMatchesForJQL> matches) {
    this.matches = matches;
  }

  public IssueMatches matches(List<@Valid IssueMatchesForJQL> matches) {
    this.matches = matches;
    return this;
  }

  public IssueMatches addMatchesItem(IssueMatchesForJQL matchesItem) {
    if (this.matches == null) {
      this.matches = new ArrayList<>();
    }
    this.matches.add(matchesItem);
    return this;
  }

  /**
   * Get matches
   * @return matches
  */
  @NotNull @Valid 
  @Schema(name = "matches", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("matches")
  public List<@Valid IssueMatchesForJQL> getMatches() {
    return matches;
  }

  public void setMatches(List<@Valid IssueMatchesForJQL> matches) {
    this.matches = matches;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueMatches issueMatches = (IssueMatches) o;
    return Objects.equals(this.matches, issueMatches.matches);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matches);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueMatches {\n");
    sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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

