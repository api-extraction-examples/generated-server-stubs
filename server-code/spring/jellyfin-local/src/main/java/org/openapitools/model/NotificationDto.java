package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NotificationLevel;
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
 * The notification DTO.
 */

@Schema(name = "NotificationDto", description = "The notification DTO.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class NotificationDto {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime date;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private Boolean isRead;

  private NotificationLevel level;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> url = JsonNullable.<String>undefined();

  private JsonNullable<String> userId = JsonNullable.<String>undefined();

  public NotificationDto date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Gets or sets the notification date.
   * @return date
  */
  @Valid 
  @Schema(name = "Date", description = "Gets or sets the notification date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Date")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public NotificationDto description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Gets or sets the notification's description. Defaults to an empty string.
   * @return description
  */
  
  @Schema(name = "Description", description = "Gets or sets the notification's description. Defaults to an empty string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public NotificationDto id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the notification ID. Defaults to an empty string.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the notification ID. Defaults to an empty string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public NotificationDto isRead(Boolean isRead) {
    this.isRead = isRead;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the notification has been read. Defaults to false.
   * @return isRead
  */
  
  @Schema(name = "IsRead", description = "Gets or sets a value indicating whether the notification has been read. Defaults to false.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsRead")
  public Boolean getIsRead() {
    return isRead;
  }

  public void setIsRead(Boolean isRead) {
    this.isRead = isRead;
  }

  public NotificationDto level(NotificationLevel level) {
    this.level = level;
    return this;
  }

  /**
   * Get level
   * @return level
  */
  @Valid 
  @Schema(name = "Level", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Level")
  public NotificationLevel getLevel() {
    return level;
  }

  public void setLevel(NotificationLevel level) {
    this.level = level;
  }

  public NotificationDto name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the notification's name. Defaults to an empty string.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the notification's name. Defaults to an empty string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public NotificationDto url(String url) {
    this.url = JsonNullable.of(url);
    return this;
  }

  /**
   * Gets or sets the notification's URL. Defaults to an empty string.
   * @return url
  */
  
  @Schema(name = "Url", description = "Gets or sets the notification's URL. Defaults to an empty string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Url")
  public JsonNullable<String> getUrl() {
    return url;
  }

  public void setUrl(JsonNullable<String> url) {
    this.url = url;
  }

  public NotificationDto userId(String userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Gets or sets the notification's user ID. Defaults to an empty string.
   * @return userId
  */
  
  @Schema(name = "UserId", description = "Gets or sets the notification's user ID. Defaults to an empty string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public JsonNullable<String> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<String> userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationDto notificationDto = (NotificationDto) o;
    return Objects.equals(this.date, notificationDto.date) &&
        equalsNullable(this.description, notificationDto.description) &&
        equalsNullable(this.id, notificationDto.id) &&
        Objects.equals(this.isRead, notificationDto.isRead) &&
        Objects.equals(this.level, notificationDto.level) &&
        equalsNullable(this.name, notificationDto.name) &&
        equalsNullable(this.url, notificationDto.url) &&
        equalsNullable(this.userId, notificationDto.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, hashCodeNullable(description), hashCodeNullable(id), isRead, level, hashCodeNullable(name), hashCodeNullable(url), hashCodeNullable(userId));
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
    sb.append("class NotificationDto {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isRead: ").append(toIndentedString(isRead)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

