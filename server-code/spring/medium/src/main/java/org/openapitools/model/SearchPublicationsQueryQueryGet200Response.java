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
 * SearchPublicationsQueryQueryGet200Response
 */

@JsonTypeName("_search_publications_query__query__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class SearchPublicationsQueryQueryGet200Response {

  @Valid
  private List<String> publications;

  private String searchQuery;

  public SearchPublicationsQueryQueryGet200Response publications(List<String> publications) {
    this.publications = publications;
    return this;
  }

  public SearchPublicationsQueryQueryGet200Response addPublicationsItem(String publicationsItem) {
    if (this.publications == null) {
      this.publications = new ArrayList<>();
    }
    this.publications.add(publicationsItem);
    return this;
  }

  /**
   * Get publications
   * @return publications
  */
  
  @Schema(name = "publications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publications")
  public List<String> getPublications() {
    return publications;
  }

  public void setPublications(List<String> publications) {
    this.publications = publications;
  }

  public SearchPublicationsQueryQueryGet200Response searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Get searchQuery
   * @return searchQuery
  */
  
  @Schema(name = "search_query", example = "mental health", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SearchPublicationsQueryQueryGet200Response searchPublicationsQueryQueryGet200Response = (SearchPublicationsQueryQueryGet200Response) o;
    return Objects.equals(this.publications, searchPublicationsQueryQueryGet200Response.publications) &&
        Objects.equals(this.searchQuery, searchPublicationsQueryQueryGet200Response.searchQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(publications, searchQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchPublicationsQueryQueryGet200Response {\n");
    sb.append("    publications: ").append(toIndentedString(publications)).append("\n");
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

