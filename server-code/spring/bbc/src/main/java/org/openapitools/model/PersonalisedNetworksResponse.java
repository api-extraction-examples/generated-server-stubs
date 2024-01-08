package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PersonalisedNetworks;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedNetworksResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedNetworksResponse {

  private String $schema;

  private Integer limit;

  private Integer offset;

  @Valid
  private List<@Valid PersonalisedNetworks> results = new ArrayList<>();

  private Integer total;

  public PersonalisedNetworksResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedNetworksResponse(String $schema, Integer limit, Integer offset, List<@Valid PersonalisedNetworks> results, Integer total) {
    this.$schema = $schema;
    this.limit = limit;
    this.offset = offset;
    this.results = results;
    this.total = total;
  }

  public PersonalisedNetworksResponse $schema(String $schema) {
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

  public PersonalisedNetworksResponse limit(Integer limit) {
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

  public PersonalisedNetworksResponse offset(Integer offset) {
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

  public PersonalisedNetworksResponse results(List<@Valid PersonalisedNetworks> results) {
    this.results = results;
    return this;
  }

  public PersonalisedNetworksResponse addResultsItem(PersonalisedNetworks resultsItem) {
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
  public List<@Valid PersonalisedNetworks> getResults() {
    return results;
  }

  public void setResults(List<@Valid PersonalisedNetworks> results) {
    this.results = results;
  }

  public PersonalisedNetworksResponse total(Integer total) {
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
    PersonalisedNetworksResponse personalisedNetworksResponse = (PersonalisedNetworksResponse) o;
    return Objects.equals(this.$schema, personalisedNetworksResponse.$schema) &&
        Objects.equals(this.limit, personalisedNetworksResponse.limit) &&
        Objects.equals(this.offset, personalisedNetworksResponse.offset) &&
        Objects.equals(this.results, personalisedNetworksResponse.results) &&
        Objects.equals(this.total, personalisedNetworksResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, limit, offset, results, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedNetworksResponse {\n");
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

