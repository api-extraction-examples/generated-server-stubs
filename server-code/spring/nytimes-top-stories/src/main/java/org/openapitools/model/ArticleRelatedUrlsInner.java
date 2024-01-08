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
 * ArticleRelatedUrlsInner
 */

@JsonTypeName("Article_related_urls_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:48.532857-04:00[America/Lower_Princes]")
public class ArticleRelatedUrlsInner {

  private String suggestedLinkText;

  private String url;

  public ArticleRelatedUrlsInner suggestedLinkText(String suggestedLinkText) {
    this.suggestedLinkText = suggestedLinkText;
    return this;
  }

  /**
   * Get suggestedLinkText
   * @return suggestedLinkText
  */
  
  @Schema(name = "suggested_link_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggested_link_text")
  public String getSuggestedLinkText() {
    return suggestedLinkText;
  }

  public void setSuggestedLinkText(String suggestedLinkText) {
    this.suggestedLinkText = suggestedLinkText;
  }

  public ArticleRelatedUrlsInner url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleRelatedUrlsInner articleRelatedUrlsInner = (ArticleRelatedUrlsInner) o;
    return Objects.equals(this.suggestedLinkText, articleRelatedUrlsInner.suggestedLinkText) &&
        Objects.equals(this.url, articleRelatedUrlsInner.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suggestedLinkText, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleRelatedUrlsInner {\n");
    sb.append("    suggestedLinkText: ").append(toIndentedString(suggestedLinkText)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

