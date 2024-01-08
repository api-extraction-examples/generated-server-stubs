package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PersonalisedRadioActivity;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PersonalisedRadioResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PersonalisedRadioResponse {

  private String $schema;

  private Integer limit;

  private String method;

  private Integer offset;

  private String repliedAt;

  @Valid
  private List<@Valid PersonalisedRadioActivity> results = new ArrayList<>();

  private Integer total;

  public PersonalisedRadioResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PersonalisedRadioResponse(String $schema, Integer limit, String method, Integer offset, String repliedAt, List<@Valid PersonalisedRadioActivity> results, Integer total) {
    this.$schema = $schema;
    this.limit = limit;
    this.method = method;
    this.offset = offset;
    this.repliedAt = repliedAt;
    this.results = results;
    this.total = total;
  }

  public PersonalisedRadioResponse $schema(String $schema) {
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

  public PersonalisedRadioResponse limit(Integer limit) {
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

  public PersonalisedRadioResponse method(String method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @NotNull 
  @Schema(name = "method", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public PersonalisedRadioResponse offset(Integer offset) {
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

  public PersonalisedRadioResponse repliedAt(String repliedAt) {
    this.repliedAt = repliedAt;
    return this;
  }

  /**
   * Get repliedAt
   * @return repliedAt
  */
  @NotNull 
  @Schema(name = "replied_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("replied_at")
  public String getRepliedAt() {
    return repliedAt;
  }

  public void setRepliedAt(String repliedAt) {
    this.repliedAt = repliedAt;
  }

  public PersonalisedRadioResponse results(List<@Valid PersonalisedRadioActivity> results) {
    this.results = results;
    return this;
  }

  public PersonalisedRadioResponse addResultsItem(PersonalisedRadioActivity resultsItem) {
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
  public List<@Valid PersonalisedRadioActivity> getResults() {
    return results;
  }

  public void setResults(List<@Valid PersonalisedRadioActivity> results) {
    this.results = results;
  }

  public PersonalisedRadioResponse total(Integer total) {
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
    PersonalisedRadioResponse personalisedRadioResponse = (PersonalisedRadioResponse) o;
    return Objects.equals(this.$schema, personalisedRadioResponse.$schema) &&
        Objects.equals(this.limit, personalisedRadioResponse.limit) &&
        Objects.equals(this.method, personalisedRadioResponse.method) &&
        Objects.equals(this.offset, personalisedRadioResponse.offset) &&
        Objects.equals(this.repliedAt, personalisedRadioResponse.repliedAt) &&
        Objects.equals(this.results, personalisedRadioResponse.results) &&
        Objects.equals(this.total, personalisedRadioResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash($schema, limit, method, offset, repliedAt, results, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalisedRadioResponse {\n");
    sb.append("    $schema: ").append(toIndentedString($schema)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    repliedAt: ").append(toIndentedString(repliedAt)).append("\n");
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

