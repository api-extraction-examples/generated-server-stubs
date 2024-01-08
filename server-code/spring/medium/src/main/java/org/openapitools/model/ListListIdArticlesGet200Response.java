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
 * ListListIdArticlesGet200Response
 */

@JsonTypeName("_list__list_id__articles_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class ListListIdArticlesGet200Response {

  private String id;

  @Valid
  private List<String> listArticles;

  public ListListIdArticlesGet200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "38f9e0f9bea6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ListListIdArticlesGet200Response listArticles(List<String> listArticles) {
    this.listArticles = listArticles;
    return this;
  }

  public ListListIdArticlesGet200Response addListArticlesItem(String listArticlesItem) {
    if (this.listArticles == null) {
      this.listArticles = new ArrayList<>();
    }
    this.listArticles.add(listArticlesItem);
    return this;
  }

  /**
   * Get listArticles
   * @return listArticles
  */
  
  @Schema(name = "list_articles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("list_articles")
  public List<String> getListArticles() {
    return listArticles;
  }

  public void setListArticles(List<String> listArticles) {
    this.listArticles = listArticles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListListIdArticlesGet200Response listListIdArticlesGet200Response = (ListListIdArticlesGet200Response) o;
    return Objects.equals(this.id, listListIdArticlesGet200Response.id) &&
        Objects.equals(this.listArticles, listListIdArticlesGet200Response.listArticles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, listArticles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListListIdArticlesGet200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    listArticles: ").append(toIndentedString(listArticles)).append("\n");
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

