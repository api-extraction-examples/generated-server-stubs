package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Podcast;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PodcastsFeatured
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class PodcastsFeatured {

  @Valid
  private List<@Valid Podcast> featuredPodcasts;

  private String title;

  private String type;

  public PodcastsFeatured featuredPodcasts(List<@Valid Podcast> featuredPodcasts) {
    this.featuredPodcasts = featuredPodcasts;
    return this;
  }

  public PodcastsFeatured addFeaturedPodcastsItem(Podcast featuredPodcastsItem) {
    if (this.featuredPodcasts == null) {
      this.featuredPodcasts = new ArrayList<>();
    }
    this.featuredPodcasts.add(featuredPodcastsItem);
    return this;
  }

  /**
   * Get featuredPodcasts
   * @return featuredPodcasts
  */
  @Valid 
  @Schema(name = "featured_podcasts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("featured_podcasts")
  public List<@Valid Podcast> getFeaturedPodcasts() {
    return featuredPodcasts;
  }

  public void setFeaturedPodcasts(List<@Valid Podcast> featuredPodcasts) {
    this.featuredPodcasts = featuredPodcasts;
  }

  public PodcastsFeatured title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PodcastsFeatured type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodcastsFeatured podcastsFeatured = (PodcastsFeatured) o;
    return Objects.equals(this.featuredPodcasts, podcastsFeatured.featuredPodcasts) &&
        Objects.equals(this.title, podcastsFeatured.title) &&
        Objects.equals(this.type, podcastsFeatured.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(featuredPodcasts, title, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodcastsFeatured {\n");
    sb.append("    featuredPodcasts: ").append(toIndentedString(featuredPodcasts)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

