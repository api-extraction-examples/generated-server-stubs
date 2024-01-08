package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
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
 * ArticleArticleIdGet200Response
 */

@JsonTypeName("_article__article_id__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class ArticleArticleIdGet200Response {

  private String author;

  private Integer claps;

  private String id;

  private String imageUrl;

  private Boolean isLocked;

  private Boolean isSeries;

  private String lang;

  private String lastModifiedAt;

  private String publicationId;

  private String publishedAt;

  private BigDecimal readingTime;

  private Integer responsesCount;

  private String subtitle;

  @Valid
  private List<String> tags;

  private String title;

  @Valid
  private List<String> topics;

  private String url;

  private Integer voters;

  private Integer wordCount;

  public ArticleArticleIdGet200Response author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  
  @Schema(name = "author", example = "1985b61817c3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public ArticleArticleIdGet200Response claps(Integer claps) {
    this.claps = claps;
    return this;
  }

  /**
   * Get claps
   * @return claps
  */
  
  @Schema(name = "claps", example = "53", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("claps")
  public Integer getClaps() {
    return claps;
  }

  public void setClaps(Integer claps) {
    this.claps = claps;
  }

  public ArticleArticleIdGet200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "f06086080568", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ArticleArticleIdGet200Response imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @Schema(name = "image_url", example = "https://miro.medium.com/1*W0wM9xIeeIR3_Oo0E_thaA.png", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public ArticleArticleIdGet200Response isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Get isLocked
   * @return isLocked
  */
  
  @Schema(name = "is_locked", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_locked")
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public ArticleArticleIdGet200Response isSeries(Boolean isSeries) {
    this.isSeries = isSeries;
    return this;
  }

  /**
   * Get isSeries
   * @return isSeries
  */
  
  @Schema(name = "is_series", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_series")
  public Boolean getIsSeries() {
    return isSeries;
  }

  public void setIsSeries(Boolean isSeries) {
    this.isSeries = isSeries;
  }

  public ArticleArticleIdGet200Response lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  
  @Schema(name = "lang", example = "en", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public ArticleArticleIdGet200Response lastModifiedAt(String lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * Get lastModifiedAt
   * @return lastModifiedAt
  */
  
  @Schema(name = "last_modified_at", example = "2021-05-28 04:22:48", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_modified_at")
  public String getLastModifiedAt() {
    return lastModifiedAt;
  }

  public void setLastModifiedAt(String lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }

  public ArticleArticleIdGet200Response publicationId(String publicationId) {
    this.publicationId = publicationId;
    return this;
  }

  /**
   * Get publicationId
   * @return publicationId
  */
  
  @Schema(name = "publication_id", example = "e7040e67514c", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("publication_id")
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  public ArticleArticleIdGet200Response publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Get publishedAt
   * @return publishedAt
  */
  
  @Schema(name = "published_at", example = "2020-08-25 11:08:18", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("published_at")
  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public ArticleArticleIdGet200Response readingTime(BigDecimal readingTime) {
    this.readingTime = readingTime;
    return this;
  }

  /**
   * Get readingTime
   * @return readingTime
  */
  @Valid 
  @Schema(name = "reading_time", example = "3.5720125786164", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reading_time")
  public BigDecimal getReadingTime() {
    return readingTime;
  }

  public void setReadingTime(BigDecimal readingTime) {
    this.readingTime = readingTime;
  }

  public ArticleArticleIdGet200Response responsesCount(Integer responsesCount) {
    this.responsesCount = responsesCount;
    return this;
  }

  /**
   * Get responsesCount
   * @return responsesCount
  */
  
  @Schema(name = "responses_count", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responses_count")
  public Integer getResponsesCount() {
    return responsesCount;
  }

  public void setResponsesCount(Integer responsesCount) {
    this.responsesCount = responsesCount;
  }

  public ArticleArticleIdGet200Response subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Get subtitle
   * @return subtitle
  */
  
  @Schema(name = "subtitle", example = "Re-energize your relationship in the midst of a crisis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public ArticleArticleIdGet200Response tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public ArticleArticleIdGet200Response addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public ArticleArticleIdGet200Response title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", example = "4 Tips to Strengthen Your Bonds — Now", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ArticleArticleIdGet200Response topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public ArticleArticleIdGet200Response addTopicsItem(String topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * Get topics
   * @return topics
  */
  
  @Schema(name = "topics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("topics")
  public List<String> getTopics() {
    return topics;
  }

  public void setTopics(List<String> topics) {
    this.topics = topics;
  }

  public ArticleArticleIdGet200Response url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", example = "https://medium.com/age-of-awareness/re-energizing-your-relationship-in-the-midst-of-a-crisis-f06086080568", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ArticleArticleIdGet200Response voters(Integer voters) {
    this.voters = voters;
    return this;
  }

  /**
   * Get voters
   * @return voters
  */
  
  @Schema(name = "voters", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voters")
  public Integer getVoters() {
    return voters;
  }

  public void setVoters(Integer voters) {
    this.voters = voters;
  }

  public ArticleArticleIdGet200Response wordCount(Integer wordCount) {
    this.wordCount = wordCount;
    return this;
  }

  /**
   * Get wordCount
   * @return wordCount
  */
  
  @Schema(name = "word_count", example = "845", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("word_count")
  public Integer getWordCount() {
    return wordCount;
  }

  public void setWordCount(Integer wordCount) {
    this.wordCount = wordCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArticleArticleIdGet200Response articleArticleIdGet200Response = (ArticleArticleIdGet200Response) o;
    return Objects.equals(this.author, articleArticleIdGet200Response.author) &&
        Objects.equals(this.claps, articleArticleIdGet200Response.claps) &&
        Objects.equals(this.id, articleArticleIdGet200Response.id) &&
        Objects.equals(this.imageUrl, articleArticleIdGet200Response.imageUrl) &&
        Objects.equals(this.isLocked, articleArticleIdGet200Response.isLocked) &&
        Objects.equals(this.isSeries, articleArticleIdGet200Response.isSeries) &&
        Objects.equals(this.lang, articleArticleIdGet200Response.lang) &&
        Objects.equals(this.lastModifiedAt, articleArticleIdGet200Response.lastModifiedAt) &&
        Objects.equals(this.publicationId, articleArticleIdGet200Response.publicationId) &&
        Objects.equals(this.publishedAt, articleArticleIdGet200Response.publishedAt) &&
        Objects.equals(this.readingTime, articleArticleIdGet200Response.readingTime) &&
        Objects.equals(this.responsesCount, articleArticleIdGet200Response.responsesCount) &&
        Objects.equals(this.subtitle, articleArticleIdGet200Response.subtitle) &&
        Objects.equals(this.tags, articleArticleIdGet200Response.tags) &&
        Objects.equals(this.title, articleArticleIdGet200Response.title) &&
        Objects.equals(this.topics, articleArticleIdGet200Response.topics) &&
        Objects.equals(this.url, articleArticleIdGet200Response.url) &&
        Objects.equals(this.voters, articleArticleIdGet200Response.voters) &&
        Objects.equals(this.wordCount, articleArticleIdGet200Response.wordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, claps, id, imageUrl, isLocked, isSeries, lang, lastModifiedAt, publicationId, publishedAt, readingTime, responsesCount, subtitle, tags, title, topics, url, voters, wordCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArticleArticleIdGet200Response {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    claps: ").append(toIndentedString(claps)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isSeries: ").append(toIndentedString(isSeries)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    lastModifiedAt: ").append(toIndentedString(lastModifiedAt)).append("\n");
    sb.append("    publicationId: ").append(toIndentedString(publicationId)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    readingTime: ").append(toIndentedString(readingTime)).append("\n");
    sb.append("    responsesCount: ").append(toIndentedString(responsesCount)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
    sb.append("    wordCount: ").append(toIndentedString(wordCount)).append("\n");
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

