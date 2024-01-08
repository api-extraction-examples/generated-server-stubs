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
 * The JQL queries to be converted.
 */

@Schema(name = "JQLPersonalDataMigrationRequest", description = "The JQL queries to be converted.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JQLPersonalDataMigrationRequest {

  @Valid
  private List<String> queryStrings;

  public JQLPersonalDataMigrationRequest queryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
    return this;
  }

  public JQLPersonalDataMigrationRequest addQueryStringsItem(String queryStringsItem) {
    if (this.queryStrings == null) {
      this.queryStrings = new ArrayList<>();
    }
    this.queryStrings.add(queryStringsItem);
    return this;
  }

  /**
   * A list of queries with user identifiers. Maximum of 100 queries.
   * @return queryStrings
  */
  
  @Schema(name = "queryStrings", description = "A list of queries with user identifiers. Maximum of 100 queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queryStrings")
  public List<String> getQueryStrings() {
    return queryStrings;
  }

  public void setQueryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JQLPersonalDataMigrationRequest jqLPersonalDataMigrationRequest = (JQLPersonalDataMigrationRequest) o;
    return Objects.equals(this.queryStrings, jqLPersonalDataMigrationRequest.queryStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryStrings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JQLPersonalDataMigrationRequest {\n");
    sb.append("    queryStrings: ").append(toIndentedString(queryStrings)).append("\n");
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

