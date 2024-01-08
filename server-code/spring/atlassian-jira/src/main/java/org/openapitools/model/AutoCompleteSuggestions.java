package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AutoCompleteSuggestion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The results from a JQL query.
 */

@Schema(name = "AutoCompleteSuggestions", description = "The results from a JQL query.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AutoCompleteSuggestions {

  @Valid
  private List<@Valid AutoCompleteSuggestion> results;

  public AutoCompleteSuggestions results(List<@Valid AutoCompleteSuggestion> results) {
    this.results = results;
    return this;
  }

  public AutoCompleteSuggestions addResultsItem(AutoCompleteSuggestion resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The list of suggested item.
   * @return results
  */
  @Valid 
  @Schema(name = "results", description = "The list of suggested item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("results")
  public List<@Valid AutoCompleteSuggestion> getResults() {
    return results;
  }

  public void setResults(List<@Valid AutoCompleteSuggestion> results) {
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
    AutoCompleteSuggestions autoCompleteSuggestions = (AutoCompleteSuggestions) o;
    return Objects.equals(this.results, autoCompleteSuggestions.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutoCompleteSuggestions {\n");
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

