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
 * SearchArticlesQueryQueryGet200Response
 */

@JsonTypeName("_search_articles_query__query__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class SearchArticlesQueryQueryGet200Response {

  @Valid
  private List<String> articles;

  private String searchQuery;

  public SearchArticlesQueryQueryGet200Response articles(List<String> articles) {
    this.articles = articles;
    return this;
  }

  public SearchArticlesQueryQueryGet200Response addArticlesItem(String articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<>();
    }
    this.articles.add(articlesItem);
    return this;
  }

  /**
   * Get articles
   * @return articles
  */
  
  @Schema(name = "articles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("articles")
  public List<String> getArticles() {
    return articles;
  }

  public void setArticles(List<String> articles) {
    this.articles = articles;
  }

  public SearchArticlesQueryQueryGet200Response searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Get searchQuery
   * @return searchQuery
  */
  
  @Schema(name = "search_query", example = "startup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    SearchArticlesQueryQueryGet200Response searchArticlesQueryQueryGet200Response = (SearchArticlesQueryQueryGet200Response) o;
    return Objects.equals(this.articles, searchArticlesQueryQueryGet200Response.articles) &&
        Objects.equals(this.searchQuery, searchArticlesQueryQueryGet200Response.searchQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articles, searchQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchArticlesQueryQueryGet200Response {\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
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

