package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * SearchUsersQueryQueryGet200Response
 */

@JsonTypeName("_search_users_query__query__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class SearchUsersQueryQueryGet200Response {

  private String searchQuery;

  @Valid
  private List<String> users;

  public SearchUsersQueryQueryGet200Response searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Get searchQuery
   * @return searchQuery
  */
  
  @Schema(name = "search_query", example = "data engineer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  public SearchUsersQueryQueryGet200Response users(List<String> users) {
    this.users = users;
    return this;
  }

  public SearchUsersQueryQueryGet200Response addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * Get users
   * @return users
  */
  
  @Schema(name = "users", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public List<String> getUsers() {
    return users;
  }

  public void setUsers(List<String> users) {
    this.users = users;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchUsersQueryQueryGet200Response searchUsersQueryQueryGet200Response = (SearchUsersQueryQueryGet200Response) o;
    return Objects.equals(this.searchQuery, searchUsersQueryQueryGet200Response.searchQuery) &&
        Objects.equals(this.users, searchUsersQueryQueryGet200Response.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchQuery, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchUsersQueryQueryGet200Response {\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

