package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MusicPopularityArtist;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MusicPopularityArtists
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicPopularityArtists {

  private Integer limit;

  private String method;

  private Integer offset;

  private String repliedAt;

  @Valid
  private List<@Valid MusicPopularityArtist> results = new ArrayList<>();

  private String schema;

  private Integer total;

  public MusicPopularityArtists() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicPopularityArtists(String method, String repliedAt, List<@Valid MusicPopularityArtist> results, String schema, Integer total) {
    this.method = method;
    this.repliedAt = repliedAt;
    this.results = results;
    this.schema = schema;
    this.total = total;
  }

  public MusicPopularityArtists limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
  */
  
  @Schema(name = "limit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public MusicPopularityArtists method(String method) {
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

  public MusicPopularityArtists offset(Integer offset) {
    this.offset = offset;
    return this;
  }

  /**
   * Get offset
   * @return offset
  */
  
  @Schema(name = "offset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offset")
  public Integer getOffset() {
    return offset;
  }

  public void setOffset(Integer offset) {
    this.offset = offset;
  }

  public MusicPopularityArtists repliedAt(String repliedAt) {
    this.repliedAt = repliedAt;
    return this;
  }

  /**
   * Get repliedAt
   * @return repliedAt
  */
  @NotNull 
  @Schema(name = "repliedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("repliedAt")
  public String getRepliedAt() {
    return repliedAt;
  }

  public void setRepliedAt(String repliedAt) {
    this.repliedAt = repliedAt;
  }

  public MusicPopularityArtists results(List<@Valid MusicPopularityArtist> results) {
    this.results = results;
    return this;
  }

  public MusicPopularityArtists addResultsItem(MusicPopularityArtist resultsItem) {
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
  public List<@Valid MusicPopularityArtist> getResults() {
    return results;
  }

  public void setResults(List<@Valid MusicPopularityArtist> results) {
    this.results = results;
  }

  public MusicPopularityArtists schema(String schema) {
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

  public MusicPopularityArtists total(Integer total) {
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
    MusicPopularityArtists musicPopularityArtists = (MusicPopularityArtists) o;
    return Objects.equals(this.limit, musicPopularityArtists.limit) &&
        Objects.equals(this.method, musicPopularityArtists.method) &&
        Objects.equals(this.offset, musicPopularityArtists.offset) &&
        Objects.equals(this.repliedAt, musicPopularityArtists.repliedAt) &&
        Objects.equals(this.results, musicPopularityArtists.results) &&
        Objects.equals(this.schema, musicPopularityArtists.schema) &&
        Objects.equals(this.total, musicPopularityArtists.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, method, offset, repliedAt, results, schema, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicPopularityArtists {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

