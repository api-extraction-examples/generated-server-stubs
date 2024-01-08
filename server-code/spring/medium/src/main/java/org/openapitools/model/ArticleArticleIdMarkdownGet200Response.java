package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ArticleArticleIdMarkdownGet200Response
 */

@JsonTypeName("_article__article_id__markdown_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class ArticleArticleIdMarkdownGet200Response {

  private String markdown;

  public ArticleArticleIdMarkdownGet200Response markdown(String markdown) {
    this.markdown = markdown;
    return this;
  }

  /**
   * Get markdown
   * @return markdown
  */
  
  @Schema(name = "markdown", example = "# Article title ## Article Subtitle Article **Content** with lot of _markups_ .... ![Images Alt](Image URL) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("markdown")
  public String getMarkdown() {
    return markdown;
  }

  public void setMarkdown(String markdown) {
    this.markdown = markdown;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleArticleIdMarkdownGet200Response articleArticleIdMarkdownGet200Response = (ArticleArticleIdMarkdownGet200Response) o;
    return Objects.equals(this.markdown, articleArticleIdMarkdownGet200Response.markdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleArticleIdMarkdownGet200Response {\n");
    sb.append("    markdown: ").append(toIndentedString(markdown)).append("\n");
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

