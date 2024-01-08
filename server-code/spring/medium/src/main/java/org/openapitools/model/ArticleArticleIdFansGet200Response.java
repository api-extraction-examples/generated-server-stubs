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
 * ArticleArticleIdFansGet200Response
 */

@JsonTypeName("_article__article_id__fans_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class ArticleArticleIdFansGet200Response {

  private String articleId;

  private Integer count;

  @Valid
  private List<String> voters;

  public ArticleArticleIdFansGet200Response articleId(String articleId) {
    this.articleId = articleId;
    return this;
  }

  /**
   * Get articleId
   * @return articleId
  */
  
  @Schema(name = "article_id", example = "67fa62fc1971", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("article_id")
  public String getArticleId() {
    return articleId;
  }

  public void setArticleId(String articleId) {
    this.articleId = articleId;
  }

  public ArticleArticleIdFansGet200Response count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  
  @Schema(name = "count", example = "145", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ArticleArticleIdFansGet200Response voters(List<String> voters) {
    this.voters = voters;
    return this;
  }

  public ArticleArticleIdFansGet200Response addVotersItem(String votersItem) {
    if (this.voters == null) {
      this.voters = new ArrayList<>();
    }
    this.voters.add(votersItem);
    return this;
  }

  /**
   * Get voters
   * @return voters
  */
  
  @Schema(name = "voters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voters")
  public List<String> getVoters() {
    return voters;
  }

  public void setVoters(List<String> voters) {
    this.voters = voters;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleArticleIdFansGet200Response articleArticleIdFansGet200Response = (ArticleArticleIdFansGet200Response) o;
    return Objects.equals(this.articleId, articleArticleIdFansGet200Response.articleId) &&
        Objects.equals(this.count, articleArticleIdFansGet200Response.count) &&
        Objects.equals(this.voters, articleArticleIdFansGet200Response.voters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleId, count, voters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleArticleIdFansGet200Response {\n");
    sb.append("    articleId: ").append(toIndentedString(articleId)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
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

