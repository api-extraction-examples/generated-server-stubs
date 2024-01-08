package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParsedJqlQuery;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of parsed JQL queries.
 */

@Schema(name = "ParsedJqlQueries", description = "A list of parsed JQL queries.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ParsedJqlQueries {

  @Valid
  private List<@Valid ParsedJqlQuery> queries = new ArrayList<>();

  public ParsedJqlQueries() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ParsedJqlQueries(List<@Valid ParsedJqlQuery> queries) {
    this.queries = queries;
  }

  public ParsedJqlQueries queries(List<@Valid ParsedJqlQuery> queries) {
    this.queries = queries;
    return this;
  }

  public ParsedJqlQueries addQueriesItem(ParsedJqlQuery queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * A list of parsed JQL queries.
   * @return queries
  */
  @NotNull @Valid 
  @Schema(name = "queries", description = "A list of parsed JQL queries.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("queries")
  public List<@Valid ParsedJqlQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<@Valid ParsedJqlQuery> queries) {
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
    ParsedJqlQueries parsedJqlQueries = (ParsedJqlQueries) o;
    return Objects.equals(this.queries, parsedJqlQueries.queries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedJqlQueries {\n");
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

