package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PodcastEpisodeSummary;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PodcastEpisodesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PodcastEpisodesResponse {

  private String $schema;

  private BigDecimal limit;

  private BigDecimal offset;

  @Valid
  private List<@Valid PodcastEpisodeSummary> results = new ArrayList<>();

  private BigDecimal total;

  public PodcastEpisodesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PodcastEpisodesResponse(String $schema, BigDecimal limit, BigDecimal offset, List<@Valid PodcastEpisodeSummary> results, BigDecimal total) {
    this.$schema = $schema;
    this.limit = limit;
    this.offset = offset;
    this.results = results;
    this.total = total;
  }

  public PodcastEpisodesResponse $schema(String $schema) {
    this.$schema = $schema;
    return this;
  }

  /**
   * Get $schema
   * @return $schema
  */
  @NotNull 
  @Schema(name = "$schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("$schema")
  public String get$Schema() {
    return $schema;
  }

  public void set$Schema(String $schema) {
    this.$schema = $schema;
  }

  public PodcastEpisodesResponse limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
  @NotNull @Valid 
  @Schema(name = "limit", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limit")
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public PodcastEpisodesResponse offset(BigDecimal offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  @NotNull @Valid 
  @Schema(name = "offset", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offset")
  public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }

  public PodcastEpisodesResponse results(List<@Valid PodcastEpisodeSummary> results) {
    this.results = results;
    return this;
  }

  public PodcastEpisodesResponse addResultsItem(PodcastEpisodeSummary resultsItem) {
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
  public List<@Valid PodcastEpisodeSummary> getResults() {
    return results;
  }

  public void setResults(List<@Valid PodcastEpisodeSummary> results) {
    this.results = results;
  }

  public PodcastEpisodesResponse total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @NotNull @Valid 
  @Schema(name = "total", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodcastEpisodesResponse podcastEpisodesResponse = (PodcastEpisodesResponse) o;
    return Objects.equals(this.$schema, podcastEpisodesResponse.$schema) &&
        Objects.equals(this.limit, podcastEpisodesResponse.limit) &&
        Objects.equals(this.offset, podcastEpisodesResponse.offset) &&
        Objects.equals(this.results, podcastEpisodesResponse.results) &&
        Objects.equals(this.total, podcastEpisodesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, limit, offset, results, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodcastEpisodesResponse {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

