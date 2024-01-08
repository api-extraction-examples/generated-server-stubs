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
 * ListListIdGet200Response
 */

@JsonTypeName("_list__list_id__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class ListListIdGet200Response {

  private String author;

  private Integer claps;

  private Integer count;

  private String createdAt;

  private String description;

  private String id;

  private String lastItemInsertedAt;

  private String name;

  private Integer responsesCount;

  private String thumbnail;

  private Integer voters;

  public ListListIdGet200Response author(String author) {
    this.author = author;
    return this;
  }

  /**
   * `user_id` of the author
   * @return author
  */
  
  @Schema(name = "author", example = "1985b61817c3", description = "`user_id` of the author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public ListListIdGet200Response claps(Integer claps) {
    this.claps = claps;
    return this;
  }

  /**
   * Get claps
   * @return claps
  */
  
  @Schema(name = "claps", example = "48", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("claps")
  public Integer getClaps() {
    return claps;
  }

  public void setClaps(Integer claps) {
    this.claps = claps;
  }

  public ListListIdGet200Response count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of articles in the list
   * @return count
  */
  
  @Schema(name = "count", example = "18", description = "Number of articles in the list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ListListIdGet200Response createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", example = "2023-03-12 06:46:46", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public ListListIdGet200Response description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", example = "Collections of all the articles and resources related to Medium API", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ListListIdGet200Response id(String id) {
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

  public ListListIdGet200Response lastItemInsertedAt(String lastItemInsertedAt) {
    this.lastItemInsertedAt = lastItemInsertedAt;
    return this;
  }

  /**
   * Get lastItemInsertedAt
   * @return lastItemInsertedAt
  */
  
  @Schema(name = "last_item_inserted_at", example = "2023-03-12 06:53:02", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_item_inserted_at")
  public String getLastItemInsertedAt() {
    return lastItemInsertedAt;
  }

  public void setLastItemInsertedAt(String lastItemInsertedAt) {
    this.lastItemInsertedAt = lastItemInsertedAt;
  }

  public ListListIdGet200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Medium API", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ListListIdGet200Response responsesCount(Integer responsesCount) {
    this.responsesCount = responsesCount;
    return this;
  }

  /**
   * Get responsesCount
   * @return responsesCount
  */
  
  @Schema(name = "responses_count", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("responses_count")
  public Integer getResponsesCount() {
    return responsesCount;
  }

  public void setResponsesCount(Integer responsesCount) {
    this.responsesCount = responsesCount;
  }

  public ListListIdGet200Response thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Image URL
   * @return thumbnail
  */
  
  @Schema(name = "thumbnail", example = "https://miro.medium.com/0*8f634a2860234802375db89fbfcccb5cc717f3fd.jpeg", description = "Image URL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnail")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  public ListListIdGet200Response voters(Integer voters) {
    this.voters = voters;
    return this;
  }

  /**
   * Get voters
   * @return voters
  */
  
  @Schema(name = "voters", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voters")
  public Integer getVoters() {
    return voters;
  }

  public void setVoters(Integer voters) {
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
    ListListIdGet200Response listListIdGet200Response = (ListListIdGet200Response) o;
    return Objects.equals(this.author, listListIdGet200Response.author) &&
        Objects.equals(this.claps, listListIdGet200Response.claps) &&
        Objects.equals(this.count, listListIdGet200Response.count) &&
        Objects.equals(this.createdAt, listListIdGet200Response.createdAt) &&
        Objects.equals(this.description, listListIdGet200Response.description) &&
        Objects.equals(this.id, listListIdGet200Response.id) &&
        Objects.equals(this.lastItemInsertedAt, listListIdGet200Response.lastItemInsertedAt) &&
        Objects.equals(this.name, listListIdGet200Response.name) &&
        Objects.equals(this.responsesCount, listListIdGet200Response.responsesCount) &&
        Objects.equals(this.thumbnail, listListIdGet200Response.thumbnail) &&
        Objects.equals(this.voters, listListIdGet200Response.voters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, claps, count, createdAt, description, id, lastItemInsertedAt, name, responsesCount, thumbnail, voters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListListIdGet200Response {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    claps: ").append(toIndentedString(claps)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastItemInsertedAt: ").append(toIndentedString(lastItemInsertedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    responsesCount: ").append(toIndentedString(responsesCount)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

