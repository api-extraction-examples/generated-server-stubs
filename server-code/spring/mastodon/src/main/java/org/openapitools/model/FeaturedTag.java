package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a hashtag that is featured on a profile.
 */

@Schema(name = "FeaturedTag", description = "Represents a hashtag that is featured on a profile.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class FeaturedTag {

  private String id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastStatusAt;

  private String name;

  private Integer statusesCount;

  private String url;

  public FeaturedTag id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The internal ID of the featured tag in the database. Cast from integer but not guaranteed to be a number
   * @return id
  */
  
  @Schema(name = "id", description = "The internal ID of the featured tag in the database. Cast from integer but not guaranteed to be a number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FeaturedTag lastStatusAt(OffsetDateTime lastStatusAt) {
    this.lastStatusAt = lastStatusAt;
    return this;
  }

  /**
   * The timestamp of the last authored status containing this hashtag. ISO 8601 Datetime.
   * @return lastStatusAt
  */
  @Valid 
  @Schema(name = "last_status_at", description = "The timestamp of the last authored status containing this hashtag. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_status_at")
  public OffsetDateTime getLastStatusAt() {
    return lastStatusAt;
  }

  public void setLastStatusAt(OffsetDateTime lastStatusAt) {
    this.lastStatusAt = lastStatusAt;
  }

  public FeaturedTag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the hashtag being featured.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the hashtag being featured.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeaturedTag statusesCount(Integer statusesCount) {
    this.statusesCount = statusesCount;
    return this;
  }

  /**
   * The number of authored statuses containing this hashtag.
   * @return statusesCount
  */
  
  @Schema(name = "statuses_count", description = "The number of authored statuses containing this hashtag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses_count")
  public Integer getStatusesCount() {
    return statusesCount;
  }

  public void setStatusesCount(Integer statusesCount) {
    this.statusesCount = statusesCount;
  }

  public FeaturedTag url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to all statuses by a user that contain this hashtag.
   * @return url
  */
  
  @Schema(name = "url", description = "A link to all statuses by a user that contain this hashtag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    FeaturedTag featuredTag = (FeaturedTag) o;
    return Objects.equals(this.id, featuredTag.id) &&
        Objects.equals(this.lastStatusAt, featuredTag.lastStatusAt) &&
        Objects.equals(this.name, featuredTag.name) &&
        Objects.equals(this.statusesCount, featuredTag.statusesCount) &&
        Objects.equals(this.url, featuredTag.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastStatusAt, name, statusesCount, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeaturedTag {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastStatusAt: ").append(toIndentedString(lastStatusAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusesCount: ").append(toIndentedString(statusesCount)).append("\n");
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

