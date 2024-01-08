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
 * Represents an announcement set by an administrator.
 */

@Schema(name = "Announcement", description = "Represents an announcement set by an administrator.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Announcement {

  private Boolean allDay;

  private String createdAt;

  private String endsAt;

  private String id;

  private Boolean published;

  private Boolean read;

  private String scheduledAt;

  private String startsAt;

  private String text;

  private String updatedAt;

  public Announcement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Announcement(Boolean allDay, String createdAt, String id, Boolean published, Boolean read, String text, String updatedAt) {
    this.allDay = allDay;
    this.createdAt = createdAt;
    this.id = id;
    this.published = published;
    this.read = read;
    this.text = text;
    this.updatedAt = updatedAt;
  }

  public Announcement allDay(Boolean allDay) {
    this.allDay = allDay;
    return this;
  }

  /**
   * Whether the announcement has a start/end time.
   * @return allDay
  */
  @NotNull 
  @Schema(name = "all_day", description = "Whether the announcement has a start/end time.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("all_day")
  public Boolean getAllDay() {
    return allDay;
  }

  public void setAllDay(Boolean allDay) {
    this.allDay = allDay;
  }

  public Announcement createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the announcement was created.
   * @return createdAt
  */
  @NotNull 
  @Schema(name = "created_at", description = "When the announcement was created.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Announcement endsAt(String endsAt) {
    this.endsAt = endsAt;
    return this;
  }

  /**
   * When the future announcement will end. ISO 8601 Datetime.
   * @return endsAt
  */
  
  @Schema(name = "ends_at", description = "When the future announcement will end. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ends_at")
  public String getEndsAt() {
    return endsAt;
  }

  public void setEndsAt(String endsAt) {
    this.endsAt = endsAt;
  }

  public Announcement id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The announcement id. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The announcement id. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Announcement published(Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * Whether the announcement is currently active.
   * @return published
  */
  @NotNull 
  @Schema(name = "published", description = "Whether the announcement is currently active.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }

  public void setPublished(Boolean published) {
    this.published = published;
  }

  public Announcement read(Boolean read) {
    this.read = read;
    return this;
  }

  /**
   * Whether the announcement has been read by the user.
   * @return read
  */
  @NotNull 
  @Schema(name = "read", description = "Whether the announcement has been read by the user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("read")
  public Boolean getRead() {
    return read;
  }

  public void setRead(Boolean read) {
    this.read = read;
  }

  public Announcement scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * When the future announcement was scheduled. ISO 8601 Datetime.
   * @return scheduledAt
  */
  
  @Schema(name = "scheduled_at", description = "When the future announcement was scheduled. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduled_at")
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public Announcement startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * When the future announcement will start. ISO 8601 Datetime.
   * @return startsAt
  */
  
  @Schema(name = "starts_at", description = "When the future announcement will start. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("starts_at")
  public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }

  public Announcement text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The content of the announcement.
   * @return text
  */
  @NotNull 
  @Schema(name = "text", description = "The content of the announcement.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Announcement updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * When the announcement was last updated. ISO 8601 Datetime.
   * @return updatedAt
  */
  @NotNull 
  @Schema(name = "updated_at", description = "When the announcement was last updated. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Announcement announcement = (Announcement) o;
    return Objects.equals(this.allDay, announcement.allDay) &&
        Objects.equals(this.createdAt, announcement.createdAt) &&
        Objects.equals(this.endsAt, announcement.endsAt) &&
        Objects.equals(this.id, announcement.id) &&
        Objects.equals(this.published, announcement.published) &&
        Objects.equals(this.read, announcement.read) &&
        Objects.equals(this.scheduledAt, announcement.scheduledAt) &&
        Objects.equals(this.startsAt, announcement.startsAt) &&
        Objects.equals(this.text, announcement.text) &&
        Objects.equals(this.updatedAt, announcement.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allDay, createdAt, endsAt, id, published, read, scheduledAt, startsAt, text, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Announcement {\n");
    sb.append("    allDay: ").append(toIndentedString(allDay)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endsAt: ").append(toIndentedString(endsAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    read: ").append(toIndentedString(read)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

