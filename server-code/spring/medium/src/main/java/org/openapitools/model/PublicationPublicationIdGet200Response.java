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
 * PublicationPublicationIdGet200Response
 */

@JsonTypeName("_publication__publication_id__get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:18.237558-04:00[America/Lower_Princes]")
public class PublicationPublicationIdGet200Response {

  private String creator;

  private String description;

  @Valid
  private List<String> editors;

  private String facebookPagename;

  private Integer followers;

  private String id;

  private String instagramUsername;

  private String name;

  private String slug;

  private String tagline;

  @Valid
  private List<String> tags;

  private String twitterUsername;

  private String url;

  public PublicationPublicationIdGet200Response creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  */
  
  @Schema(name = "creator", example = "8a819983d566", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creator")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public PublicationPublicationIdGet200Response description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", example = "Towards AI is the world's leading AI and technology publication. Publishing unbiased AI and technology-related articles. Read by thought-leaders and decision-makers around the world.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PublicationPublicationIdGet200Response editors(List<String> editors) {
    this.editors = editors;
    return this;
  }

  public PublicationPublicationIdGet200Response addEditorsItem(String editorsItem) {
    if (this.editors == null) {
      this.editors = new ArrayList<>();
    }
    this.editors.add(editorsItem);
    return this;
  }

  /**
   * Get editors
   * @return editors
  */
  
  @Schema(name = "editors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editors")
  public List<String> getEditors() {
    return editors;
  }

  public void setEditors(List<String> editors) {
    this.editors = editors;
  }

  public PublicationPublicationIdGet200Response facebookPagename(String facebookPagename) {
    this.facebookPagename = facebookPagename;
    return this;
  }

  /**
   * Get facebookPagename
   * @return facebookPagename
  */
  
  @Schema(name = "facebook_pagename", example = "towardsAl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("facebook_pagename")
  public String getFacebookPagename() {
    return facebookPagename;
  }

  public void setFacebookPagename(String facebookPagename) {
    this.facebookPagename = facebookPagename;
  }

  public PublicationPublicationIdGet200Response followers(Integer followers) {
    this.followers = followers;
    return this;
  }

  /**
   * Get followers
   * @return followers
  */
  
  @Schema(name = "followers", example = "25260", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers")
  public Integer getFollowers() {
    return followers;
  }

  public void setFollowers(Integer followers) {
    this.followers = followers;
  }

  public PublicationPublicationIdGet200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "98111c9905da", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PublicationPublicationIdGet200Response instagramUsername(String instagramUsername) {
    this.instagramUsername = instagramUsername;
    return this;
  }

  /**
   * Get instagramUsername
   * @return instagramUsername
  */
  
  @Schema(name = "instagram_username", example = "towards_ai", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instagram_username")
  public String getInstagramUsername() {
    return instagramUsername;
  }

  public void setInstagramUsername(String instagramUsername) {
    this.instagramUsername = instagramUsername;
  }

  public PublicationPublicationIdGet200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Towards AI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PublicationPublicationIdGet200Response slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  
  @Schema(name = "slug", example = "towards-artificial-intelligence", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public PublicationPublicationIdGet200Response tagline(String tagline) {
    this.tagline = tagline;
    return this;
  }

  /**
   * Get tagline
   * @return tagline
  */
  
  @Schema(name = "tagline", example = "The World's Leading AI and Technology Publication", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tagline")
  public String getTagline() {
    return tagline;
  }

  public void setTagline(String tagline) {
    this.tagline = tagline;
  }

  public PublicationPublicationIdGet200Response tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PublicationPublicationIdGet200Response addTagsItem(String tagsItem) {
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

  public PublicationPublicationIdGet200Response twitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
    return this;
  }

  /**
   * Get twitterUsername
   * @return twitterUsername
  */
  
  @Schema(name = "twitter_username", example = "towards_AI", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("twitter_username")
  public String getTwitterUsername() {
    return twitterUsername;
  }

  public void setTwitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
  }

  public PublicationPublicationIdGet200Response url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", example = "pub.towardsai.net", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PublicationPublicationIdGet200Response publicationPublicationIdGet200Response = (PublicationPublicationIdGet200Response) o;
    return Objects.equals(this.creator, publicationPublicationIdGet200Response.creator) &&
        Objects.equals(this.description, publicationPublicationIdGet200Response.description) &&
        Objects.equals(this.editors, publicationPublicationIdGet200Response.editors) &&
        Objects.equals(this.facebookPagename, publicationPublicationIdGet200Response.facebookPagename) &&
        Objects.equals(this.followers, publicationPublicationIdGet200Response.followers) &&
        Objects.equals(this.id, publicationPublicationIdGet200Response.id) &&
        Objects.equals(this.instagramUsername, publicationPublicationIdGet200Response.instagramUsername) &&
        Objects.equals(this.name, publicationPublicationIdGet200Response.name) &&
        Objects.equals(this.slug, publicationPublicationIdGet200Response.slug) &&
        Objects.equals(this.tagline, publicationPublicationIdGet200Response.tagline) &&
        Objects.equals(this.tags, publicationPublicationIdGet200Response.tags) &&
        Objects.equals(this.twitterUsername, publicationPublicationIdGet200Response.twitterUsername) &&
        Objects.equals(this.url, publicationPublicationIdGet200Response.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, description, editors, facebookPagename, followers, id, instagramUsername, name, slug, tagline, tags, twitterUsername, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicationPublicationIdGet200Response {\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editors: ").append(toIndentedString(editors)).append("\n");
    sb.append("    facebookPagename: ").append(toIndentedString(facebookPagename)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instagramUsername: ").append(toIndentedString(instagramUsername)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    tagline: ").append(toIndentedString(tagline)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    twitterUsername: ").append(toIndentedString(twitterUsername)).append("\n");
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

