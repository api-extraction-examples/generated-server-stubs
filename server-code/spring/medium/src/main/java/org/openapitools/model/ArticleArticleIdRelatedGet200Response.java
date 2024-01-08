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
 * ArticleArticleIdRelatedGet200Response
 */

@JsonTypeName("_article__article_id__related_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class ArticleArticleIdRelatedGet200Response {

  private String id;

  @Valid
  private List<String> relatedArticles;

  public ArticleArticleIdRelatedGet200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "67fa62fc1971", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArticleArticleIdRelatedGet200Response relatedArticles(List<String> relatedArticles) {
    this.relatedArticles = relatedArticles;
    return this;
  }

  public ArticleArticleIdRelatedGet200Response addRelatedArticlesItem(String relatedArticlesItem) {
    if (this.relatedArticles == null) {
      this.relatedArticles = new ArrayList<>();
    }
    this.relatedArticles.add(relatedArticlesItem);
    return this;
  }

  /**
   * Get relatedArticles
   * @return relatedArticles
  */
  
  @Schema(name = "related_articles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("related_articles")
  public List<String> getRelatedArticles() {
    return relatedArticles;
  }

  public void setRelatedArticles(List<String> relatedArticles) {
    this.relatedArticles = relatedArticles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleArticleIdRelatedGet200Response articleArticleIdRelatedGet200Response = (ArticleArticleIdRelatedGet200Response) o;
    return Objects.equals(this.id, articleArticleIdRelatedGet200Response.id) &&
        Objects.equals(this.relatedArticles, articleArticleIdRelatedGet200Response.relatedArticles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, relatedArticles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleArticleIdRelatedGet200Response {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    relatedArticles: ").append(toIndentedString(relatedArticles)).append("\n");
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

