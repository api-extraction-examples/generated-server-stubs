package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LogLevel;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ActivityLogEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ActivityLogEntry {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime date;

  private Long id;

  private JsonNullable<String> itemId = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> overview = JsonNullable.<String>undefined();

  private LogLevel severity;

  private JsonNullable<String> shortOverview = JsonNullable.<String>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  private UUID userId;

  @Deprecated
  private JsonNullable<String> userPrimaryImageTag = JsonNullable.<String>undefined();

  public ActivityLogEntry date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Gets or sets the date.
   * @return date
  */
  @Valid 
  @Schema(name = "Date", description = "Gets or sets the date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public ActivityLogEntry id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets the identifier.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ActivityLogEntry itemId(String itemId) {
    this.itemId = JsonNullable.of(itemId);
    return this;
  }

  /**
   * Gets or sets the item identifier.
   * @return itemId
  */
  
  @Schema(name = "ItemId", description = "Gets or sets the item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemId")
  public JsonNullable<String> getItemId() {
    return itemId;
  }

  public void setItemId(JsonNullable<String> itemId) {
    this.itemId = itemId;
  }

  public ActivityLogEntry name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public ActivityLogEntry overview(String overview) {
    this.overview = JsonNullable.of(overview);
    return this;
  }

  /**
   * Gets or sets the overview.
   * @return overview
  */
  
  @Schema(name = "Overview", description = "Gets or sets the overview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Overview")
  public JsonNullable<String> getOverview() {
    return overview;
  }

  public void setOverview(JsonNullable<String> overview) {
    this.overview = overview;
  }

  public ActivityLogEntry severity(LogLevel severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  */
  @Valid 
  @Schema(name = "Severity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Severity")
  public LogLevel getSeverity() {
    return severity;
  }

  public void setSeverity(LogLevel severity) {
    this.severity = severity;
  }

  public ActivityLogEntry shortOverview(String shortOverview) {
    this.shortOverview = JsonNullable.of(shortOverview);
    return this;
  }

  /**
   * Gets or sets the short overview.
   * @return shortOverview
  */
  
  @Schema(name = "ShortOverview", description = "Gets or sets the short overview.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ShortOverview")
  public JsonNullable<String> getShortOverview() {
    return shortOverview;
  }

  public void setShortOverview(JsonNullable<String> shortOverview) {
    this.shortOverview = shortOverview;
  }

  public ActivityLogEntry type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Gets or sets the type.
   * @return type
  */
  
  @Schema(name = "Type", description = "Gets or sets the type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  public ActivityLogEntry userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Gets or sets the user identifier.
   * @return userId
  */
  @Valid 
  @Schema(name = "UserId", description = "Gets or sets the user identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public ActivityLogEntry userPrimaryImageTag(String userPrimaryImageTag) {
    this.userPrimaryImageTag = JsonNullable.of(userPrimaryImageTag);
    return this;
  }

  /**
   * Gets or sets the user primary image tag.
   * @return userPrimaryImageTag
   * @deprecated
  */
  
  @Schema(name = "UserPrimaryImageTag", description = "Gets or sets the user primary image tag.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserPrimaryImageTag")
  @Deprecated
  public JsonNullable<String> getUserPrimaryImageTag() {
    return userPrimaryImageTag;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setUserPrimaryImageTag(JsonNullable<String> userPrimaryImageTag) {
    this.userPrimaryImageTag = userPrimaryImageTag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityLogEntry activityLogEntry = (ActivityLogEntry) o;
    return Objects.equals(this.date, activityLogEntry.date) &&
        Objects.equals(this.id, activityLogEntry.id) &&
        equalsNullable(this.itemId, activityLogEntry.itemId) &&
        equalsNullable(this.name, activityLogEntry.name) &&
        equalsNullable(this.overview, activityLogEntry.overview) &&
        Objects.equals(this.severity, activityLogEntry.severity) &&
        equalsNullable(this.shortOverview, activityLogEntry.shortOverview) &&
        equalsNullable(this.type, activityLogEntry.type) &&
        Objects.equals(this.userId, activityLogEntry.userId) &&
        equalsNullable(this.userPrimaryImageTag, activityLogEntry.userPrimaryImageTag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, id, hashCodeNullable(itemId), hashCodeNullable(name), hashCodeNullable(overview), severity, hashCodeNullable(shortOverview), hashCodeNullable(type), userId, hashCodeNullable(userPrimaryImageTag));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityLogEntry {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    shortOverview: ").append(toIndentedString(shortOverview)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userPrimaryImageTag: ").append(toIndentedString(userPrimaryImageTag)).append("\n");
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

