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
 * SearchListsQueryQueryGet200Response
 */

@JsonTypeName("_search_lists_query__query__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class SearchListsQueryQueryGet200Response {

  @Valid
  private List<String> lists;

  private String searchQuery;

  public SearchListsQueryQueryGet200Response lists(List<String> lists) {
    this.lists = lists;
    return this;
  }

  public SearchListsQueryQueryGet200Response addListsItem(String listsItem) {
    if (this.lists == null) {
      this.lists = new ArrayList<>();
    }
    this.lists.add(listsItem);
    return this;
  }

  /**
   * Get lists
   * @return lists
  */
  
  @Schema(name = "lists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lists")
  public List<String> getLists() {
    return lists;
  }

  public void setLists(List<String> lists) {
    this.lists = lists;
  }

  public SearchListsQueryQueryGet200Response searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Get searchQuery
   * @return searchQuery
  */
  
  @Schema(name = "search_query", example = "artificial intelligence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchListsQueryQueryGet200Response searchListsQueryQueryGet200Response = (SearchListsQueryQueryGet200Response) o;
    return Objects.equals(this.lists, searchListsQueryQueryGet200Response.lists) &&
        Objects.equals(this.searchQuery, searchListsQueryQueryGet200Response.searchQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lists, searchQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchListsQueryQueryGet200Response {\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    searchQuery: ").append(toIndentedString(searchQuery)).append("\n");
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

