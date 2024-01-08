package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JiraExpressionAnalysis;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the analysed Jira expression.
 */

@Schema(name = "JiraExpressionsAnalysis", description = "Details about the analysed Jira expression.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionsAnalysis {

  @Valid
  private List<@Valid JiraExpressionAnalysis> results = new ArrayList<>();

  public JiraExpressionsAnalysis() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionsAnalysis(List<@Valid JiraExpressionAnalysis> results) {
    this.results = results;
  }

  public JiraExpressionsAnalysis results(List<@Valid JiraExpressionAnalysis> results) {
    this.results = results;
    return this;
  }

  public JiraExpressionsAnalysis addResultsItem(JiraExpressionAnalysis resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The results of Jira expressions analysis.
   * @return results
  */
  @NotNull @Valid 
  @Schema(name = "results", description = "The results of Jira expressions analysis.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<@Valid JiraExpressionAnalysis> getResults() {
    return results;
  }

  public void setResults(List<@Valid JiraExpressionAnalysis> results) {
    this.results = results;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionsAnalysis jiraExpressionsAnalysis = (JiraExpressionsAnalysis) o;
    return Objects.equals(this.results, jiraExpressionsAnalysis.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionsAnalysis {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

