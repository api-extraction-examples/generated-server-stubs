package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Category;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CategoriesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class CategoriesResponse {

  private String $schema;

  private Integer limit;

  private Integer offset;

  @Valid
  private List<@Valid Category> results = new ArrayList<>();

  private Integer total;

  public CategoriesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CategoriesResponse(String $schema, Integer limit, Integer offset, List<@Valid Category> results, Integer total) {
    this.$schema = $schema;
    this.limit = limit;
    this.offset = offset;
    this.results = results;
    this.total = total;
  }

  public CategoriesResponse $schema(String $schema) {
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

  public CategoriesResponse limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
  @NotNull 
  @Schema(name = "limit", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public CategoriesResponse offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  @NotNull 
  @Schema(name = "offset", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public CategoriesResponse results(List<@Valid Category> results) {
    this.results = results;
    return this;
  }

  public CategoriesResponse addResultsItem(Category resultsItem) {
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
  public List<@Valid Category> getResults() {
    return results;
  }

  public void setResults(List<@Valid Category> results) {
    this.results = results;
  }

  public CategoriesResponse total(Integer total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @NotNull 
  @Schema(name = "total", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
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
    CategoriesResponse categoriesResponse = (CategoriesResponse) o;
    return Objects.equals(this.$schema, categoriesResponse.$schema) &&
        Objects.equals(this.limit, categoriesResponse.limit) &&
        Objects.equals(this.offset, categoriesResponse.offset) &&
        Objects.equals(this.results, categoriesResponse.results) &&
        Objects.equals(this.total, categoriesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, limit, offset, results, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoriesResponse {\n");
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

