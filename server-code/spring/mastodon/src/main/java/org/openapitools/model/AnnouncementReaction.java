package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents an emoji reaction to an Announcement.
 */

@Schema(name = "AnnouncementReaction", description = "Represents an emoji reaction to an Announcement.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class AnnouncementReaction {

  private Integer count;

  private Boolean me;

  private String name;

  private String staticUrl;

  private String url;

  public AnnouncementReaction count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The total number of users who have added this reaction.
   * @return count
  */
  
  @Schema(name = "count", description = "The total number of users who have added this reaction.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public AnnouncementReaction me(Boolean me) {
    this.me = me;
    return this;
  }

  /**
   * Whether the authorized user has added this reaction to the announcement.
   * @return me
  */
  
  @Schema(name = "me", description = "Whether the authorized user has added this reaction to the announcement.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("me")
  public Boolean getMe() {
    return me;
  }

  public void setMe(Boolean me) {
    this.me = me;
  }

  public AnnouncementReaction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The emoji used for the reaction. Either a unicode emoji, or a custom emoji's shortcode.
   * @return name
  */
  
  @Schema(name = "name", description = "The emoji used for the reaction. Either a unicode emoji, or a custom emoji's shortcode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AnnouncementReaction staticUrl(String staticUrl) {
    this.staticUrl = staticUrl;
    return this;
  }

  /**
   * A link to a non-animated version of the custom emoji (URL).
   * @return staticUrl
  */
  
  @Schema(name = "static_url", description = "A link to a non-animated version of the custom emoji (URL).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("static_url")
  public String getStaticUrl() {
    return staticUrl;
  }

  public void setStaticUrl(String staticUrl) {
    this.staticUrl = staticUrl;
  }

  public AnnouncementReaction url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to the custom emoji (URL).
   * @return url
  */
  
  @Schema(name = "url", description = "A link to the custom emoji (URL).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AnnouncementReaction announcementReaction = (AnnouncementReaction) o;
    return Objects.equals(this.count, announcementReaction.count) &&
        Objects.equals(this.me, announcementReaction.me) &&
        Objects.equals(this.name, announcementReaction.name) &&
        Objects.equals(this.staticUrl, announcementReaction.staticUrl) &&
        Objects.equals(this.url, announcementReaction.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, me, name, staticUrl, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnouncementReaction {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    me: ").append(toIndentedString(me)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    staticUrl: ").append(toIndentedString(staticUrl)).append("\n");
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

