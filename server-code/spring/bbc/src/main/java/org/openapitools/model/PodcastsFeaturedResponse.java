package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PodcastsFeatured;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PodcastsFeaturedResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PodcastsFeaturedResponse {

  private String $schema;

  private BigDecimal limit;

  private BigDecimal offset;

  @Valid
  private List<@Valid PodcastsFeatured> results = new ArrayList<>();

  private BigDecimal total;

  public PodcastsFeaturedResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PodcastsFeaturedResponse(String $schema, BigDecimal limit, BigDecimal offset, List<@Valid PodcastsFeatured> results, BigDecimal total) {
    this.$schema = $schema;
    this.limit = limit;
    this.offset = offset;
    this.results = results;
    this.total = total;
  }

  public PodcastsFeaturedResponse $schema(String $schema) {
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

  public PodcastsFeaturedResponse limit(BigDecimal limit) {
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

  public PodcastsFeaturedResponse offset(BigDecimal offset) {
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

  public PodcastsFeaturedResponse results(List<@Valid PodcastsFeatured> results) {
    this.results = results;
    return this;
  }

  public PodcastsFeaturedResponse addResultsItem(PodcastsFeatured resultsItem) {
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
  public List<@Valid PodcastsFeatured> getResults() {
    return results;
  }

  public void setResults(List<@Valid PodcastsFeatured> results) {
    this.results = results;
  }

  public PodcastsFeaturedResponse total(BigDecimal total) {
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
    PodcastsFeaturedResponse podcastsFeaturedResponse = (PodcastsFeaturedResponse) o;
    return Objects.equals(this.$schema, podcastsFeaturedResponse.$schema) &&
        Objects.equals(this.limit, podcastsFeaturedResponse.limit) &&
        Objects.equals(this.offset, podcastsFeaturedResponse.offset) &&
        Objects.equals(this.results, podcastsFeaturedResponse.results) &&
        Objects.equals(this.total, podcastsFeaturedResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, limit, offset, results, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodcastsFeaturedResponse {\n");
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

