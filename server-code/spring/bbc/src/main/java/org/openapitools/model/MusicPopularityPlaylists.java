package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.MusicPopularityPlaylist;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MusicPopularityPlaylists
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicPopularityPlaylists {

  private Integer limit;

  private String method;

  private Integer offset;

  private String repliedAt;

  @Valid
  private List<@Valid MusicPopularityPlaylist> results = new ArrayList<>();

  private String schema;

  private Integer total;

  public MusicPopularityPlaylists() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicPopularityPlaylists(String method, String repliedAt, List<@Valid MusicPopularityPlaylist> results, String schema, Integer total) {
    this.method = method;
    this.repliedAt = repliedAt;
    this.results = results;
    this.schema = schema;
    this.total = total;
  }

  public MusicPopularityPlaylists limit(Integer limit) {
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

  public MusicPopularityPlaylists method(String method) {
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

  public MusicPopularityPlaylists offset(Integer offset) {
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

  public MusicPopularityPlaylists repliedAt(String repliedAt) {
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

  public MusicPopularityPlaylists results(List<@Valid MusicPopularityPlaylist> results) {
    this.results = results;
    return this;
  }

  public MusicPopularityPlaylists addResultsItem(MusicPopularityPlaylist resultsItem) {
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
  public List<@Valid MusicPopularityPlaylist> getResults() {
    return results;
  }

  public void setResults(List<@Valid MusicPopularityPlaylist> results) {
    this.results = results;
  }

  public MusicPopularityPlaylists schema(String schema) {
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

  public MusicPopularityPlaylists total(Integer total) {
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
    MusicPopularityPlaylists musicPopularityPlaylists = (MusicPopularityPlaylists) o;
    return Objects.equals(this.limit, musicPopularityPlaylists.limit) &&
        Objects.equals(this.method, musicPopularityPlaylists.method) &&
        Objects.equals(this.offset, musicPopularityPlaylists.offset) &&
        Objects.equals(this.repliedAt, musicPopularityPlaylists.repliedAt) &&
        Objects.equals(this.results, musicPopularityPlaylists.results) &&
        Objects.equals(this.schema, musicPopularityPlaylists.schema) &&
        Objects.equals(this.total, musicPopularityPlaylists.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, method, offset, repliedAt, results, schema, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicPopularityPlaylists {\n");
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

