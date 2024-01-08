package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MusicExportPreferences;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MusicExportPreferencesResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicExportPreferencesResponse {

  private String method;

  private String repliedAt;

  @Valid
  private List<@Valid MusicExportPreferences> results = new ArrayList<>();

  private String schema;

  private Integer total;

  public MusicExportPreferencesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicExportPreferencesResponse(String method, String repliedAt, List<@Valid MusicExportPreferences> results, String schema, Integer total) {
    this.method = method;
    this.repliedAt = repliedAt;
    this.results = results;
    this.schema = schema;
    this.total = total;
  }

  public MusicExportPreferencesResponse method(String method) {
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

  public MusicExportPreferencesResponse repliedAt(String repliedAt) {
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

  public MusicExportPreferencesResponse results(List<@Valid MusicExportPreferences> results) {
    this.results = results;
    return this;
  }

  public MusicExportPreferencesResponse addResultsItem(MusicExportPreferences resultsItem) {
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
  public List<@Valid MusicExportPreferences> getResults() {
    return results;
  }

  public void setResults(List<@Valid MusicExportPreferences> results) {
    this.results = results;
  }

  public MusicExportPreferencesResponse schema(String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  */
  @NotNull 
  @Schema(name = "schema", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schema")
  public String getSchema() {
    return schema;
  }

  public void setSchema(String schema) {
    this.schema = schema;
  }

  public MusicExportPreferencesResponse total(Integer total) {
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
    MusicExportPreferencesResponse musicExportPreferencesResponse = (MusicExportPreferencesResponse) o;
    return Objects.equals(this.method, musicExportPreferencesResponse.method) &&
        Objects.equals(this.repliedAt, musicExportPreferencesResponse.repliedAt) &&
        Objects.equals(this.results, musicExportPreferencesResponse.results) &&
        Objects.equals(this.schema, musicExportPreferencesResponse.schema) &&
        Objects.equals(this.total, musicExportPreferencesResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, repliedAt, results, schema, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicExportPreferencesResponse {\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    repliedAt: ").append(toIndentedString(repliedAt)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

