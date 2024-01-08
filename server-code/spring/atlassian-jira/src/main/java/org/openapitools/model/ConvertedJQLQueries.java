package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JQLQueryWithUnknownUsers;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The converted JQL queries.
 */

@Schema(name = "ConvertedJQLQueries", description = "The converted JQL queries.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ConvertedJQLQueries {

  @Valid
  private List<@Valid JQLQueryWithUnknownUsers> queriesWithUnknownUsers;

  @Valid
  private List<String> queryStrings;

  public ConvertedJQLQueries queriesWithUnknownUsers(List<@Valid JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
    return this;
  }

  public ConvertedJQLQueries addQueriesWithUnknownUsersItem(JQLQueryWithUnknownUsers queriesWithUnknownUsersItem) {
    if (this.queriesWithUnknownUsers == null) {
      this.queriesWithUnknownUsers = new ArrayList<>();
    }
    this.queriesWithUnknownUsers.add(queriesWithUnknownUsersItem);
    return this;
  }

  /**
   * List of queries containing user information that could not be mapped to an existing user
   * @return queriesWithUnknownUsers
  */
  @Valid 
  @Schema(name = "queriesWithUnknownUsers", description = "List of queries containing user information that could not be mapped to an existing user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queriesWithUnknownUsers")
  public List<@Valid JQLQueryWithUnknownUsers> getQueriesWithUnknownUsers() {
    return queriesWithUnknownUsers;
  }

  public void setQueriesWithUnknownUsers(List<@Valid JQLQueryWithUnknownUsers> queriesWithUnknownUsers) {
    this.queriesWithUnknownUsers = queriesWithUnknownUsers;
  }

  public ConvertedJQLQueries queryStrings(List<String> queryStrings) {
    this.queryStrings = queryStrings;
    return this;
  }

  public ConvertedJQLQueries addQueryStringsItem(String queryStringsItem) {
    if (this.queryStrings == null) {
      this.queryStrings = new ArrayList<>();
    }
    this.queryStrings.add(queryStringsItem);
    return this;
  }

  /**
   * The list of converted query strings with account IDs in place of user identifiers.
   * @return queryStrings
  */
  
  @Schema(name = "queryStrings", description = "The list of converted query strings with account IDs in place of user identifiers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ConvertedJQLQueries convertedJQLQueries = (ConvertedJQLQueries) o;
    return Objects.equals(this.queriesWithUnknownUsers, convertedJQLQueries.queriesWithUnknownUsers) &&
        Objects.equals(this.queryStrings, convertedJQLQueries.queryStrings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queriesWithUnknownUsers, queryStrings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConvertedJQLQueries {\n");
    sb.append("    queriesWithUnknownUsers: ").append(toIndentedString(queriesWithUnknownUsers)).append("\n");
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

