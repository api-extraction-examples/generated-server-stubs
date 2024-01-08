package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of JQL queries to parse.
 */

@Schema(name = "JqlQueriesToParse", description = "A list of JQL queries to parse.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueriesToParse {

  @Valid
  private List<@Size(min = 1)String> queries = new ArrayList<>();

  public JqlQueriesToParse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueriesToParse(List<@Size(min = 1)String> queries) {
    this.queries = queries;
  }

  public JqlQueriesToParse queries(List<@Size(min = 1)String> queries) {
    this.queries = queries;
    return this;
  }

  public JqlQueriesToParse addQueriesItem(String queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * A list of queries to parse.
   * @return queries
  */
  @NotNull 
  @Schema(name = "queries", description = "A list of queries to parse.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("queries")
  public List<@Size(min = 1)String> getQueries() {
    return queries;
  }

  public void setQueries(List<@Size(min = 1)String> queries) {
    this.queries = queries;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueriesToParse jqlQueriesToParse = (JqlQueriesToParse) o;
    return Objects.equals(this.queries, jqlQueriesToParse.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueriesToParse {\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
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

