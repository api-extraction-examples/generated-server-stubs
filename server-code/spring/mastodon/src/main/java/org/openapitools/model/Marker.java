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
 * Represents the last read position within a user&#39;s timelines.
 */

@Schema(name = "Marker", description = "Represents the last read position within a user's timelines.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Marker {

  private Object home;

  private String lastReadId;

  private Object notifications;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private Integer version;

  public Marker home(Object home) {
    this.home = home;
    return this;
  }

  /**
   * Information about the user's position in the home timeline.
   * @return home
  */
  
  @Schema(name = "home", description = "Information about the user's position in the home timeline.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home")
  public Object getHome() {
    return home;
  }

  public void setHome(Object home) {
    this.home = home;
  }

  public Marker lastReadId(String lastReadId) {
    this.lastReadId = lastReadId;
    return this;
  }

  /**
   * The ID of the most recently viewed entity. Cast from integer but not guaranteed to be a number
   * @return lastReadId
  */
  
  @Schema(name = "last_read_id", description = "The ID of the most recently viewed entity. Cast from integer but not guaranteed to be a number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_read_id")
  public String getLastReadId() {
    return lastReadId;
  }

  public void setLastReadId(String lastReadId) {
    this.lastReadId = lastReadId;
  }

  public Marker notifications(Object notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Information about the user's position in their notifications.
   * @return notifications
  */
  
  @Schema(name = "notifications", description = "Information about the user's position in their notifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifications")
  public Object getNotifications() {
    return notifications;
  }

  public void setNotifications(Object notifications) {
    this.notifications = notifications;
  }

  public Marker updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp of when the marker was set. ISO 8601 Datetime.
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", description = "The timestamp of when the marker was set. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Marker version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Used for locking to prevent write conflicts.
   * @return version
  */
  
  @Schema(name = "version", description = "Used for locking to prevent write conflicts.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Marker marker = (Marker) o;
    return Objects.equals(this.home, marker.home) &&
        Objects.equals(this.lastReadId, marker.lastReadId) &&
        Objects.equals(this.notifications, marker.notifications) &&
        Objects.equals(this.updatedAt, marker.updatedAt) &&
        Objects.equals(this.version, marker.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(home, lastReadId, notifications, updatedAt, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Marker {\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    lastReadId: ").append(toIndentedString(lastReadId)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

