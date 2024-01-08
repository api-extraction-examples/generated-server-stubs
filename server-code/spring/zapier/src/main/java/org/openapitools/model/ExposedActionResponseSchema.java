package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ExposedActionSchema;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ExposedActionResponseSchema
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:55:55.879556-04:00[America/Lower_Princes]")
public class ExposedActionResponseSchema {

  private String configurationLink;

  @Valid
  private List<@Valid ExposedActionSchema> results = new ArrayList<>();

  public ExposedActionResponseSchema() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ExposedActionResponseSchema(String configurationLink, List<@Valid ExposedActionSchema> results) {
    this.configurationLink = configurationLink;
    this.results = results;
  }

  public ExposedActionResponseSchema configurationLink(String configurationLink) {
    this.configurationLink = configurationLink;
    return this;
  }

  /**
   * URL to configure and expose more actions.
   * @return configurationLink
  */
  @NotNull 
  @Schema(name = "configuration_link", description = "URL to configure and expose more actions.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("configuration_link")
  public String getConfigurationLink() {
    return configurationLink;
  }

  public void setConfigurationLink(String configurationLink) {
    this.configurationLink = configurationLink;
  }

  public ExposedActionResponseSchema results(List<@Valid ExposedActionSchema> results) {
    this.results = results;
    return this;
  }

  public ExposedActionResponseSchema addResultsItem(ExposedActionSchema resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Get results
   * @return results
  */
  @NotNull @Valid 
  @Schema(name = "results", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("results")
  public List<@Valid ExposedActionSchema> getResults() {
    return results;
  }

  public void setResults(List<@Valid ExposedActionSchema> results) {
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
    ExposedActionResponseSchema exposedActionResponseSchema = (ExposedActionResponseSchema) o;
    return Objects.equals(this.configurationLink, exposedActionResponseSchema.configurationLink) &&
        Objects.equals(this.results, exposedActionResponseSchema.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configurationLink, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExposedActionResponseSchema {\n");
    sb.append("    configurationLink: ").append(toIndentedString(configurationLink)).append("\n");
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

