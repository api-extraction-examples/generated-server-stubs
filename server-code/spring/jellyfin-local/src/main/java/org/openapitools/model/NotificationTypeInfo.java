package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotificationTypeInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class NotificationTypeInfo {

  private JsonNullable<String> category = JsonNullable.<String>undefined();

  private Boolean enabled;

  private Boolean isBasedOnUserEvent;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public NotificationTypeInfo category(String category) {
    this.category = JsonNullable.of(category);
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "Category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Category")
  public JsonNullable<String> getCategory() {
    return category;
  }

  public void setCategory(JsonNullable<String> category) {
    this.category = category;
  }

  public NotificationTypeInfo enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  
  @Schema(name = "Enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public NotificationTypeInfo isBasedOnUserEvent(Boolean isBasedOnUserEvent) {
    this.isBasedOnUserEvent = isBasedOnUserEvent;
    return this;
  }

  /**
   * Get isBasedOnUserEvent
   * @return isBasedOnUserEvent
  */
  
  @Schema(name = "IsBasedOnUserEvent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsBasedOnUserEvent")
  public Boolean getIsBasedOnUserEvent() {
    return isBasedOnUserEvent;
  }

  public void setIsBasedOnUserEvent(Boolean isBasedOnUserEvent) {
    this.isBasedOnUserEvent = isBasedOnUserEvent;
  }

  public NotificationTypeInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public NotificationTypeInfo type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
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
    NotificationTypeInfo notificationTypeInfo = (NotificationTypeInfo) o;
    return equalsNullable(this.category, notificationTypeInfo.category) &&
        Objects.equals(this.enabled, notificationTypeInfo.enabled) &&
        Objects.equals(this.isBasedOnUserEvent, notificationTypeInfo.isBasedOnUserEvent) &&
        equalsNullable(this.name, notificationTypeInfo.name) &&
        equalsNullable(this.type, notificationTypeInfo.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(category), enabled, isBasedOnUserEvent, hashCodeNullable(name), hashCodeNullable(type));
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
    sb.append("class NotificationTypeInfo {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    isBasedOnUserEvent: ").append(toIndentedString(isBasedOnUserEvent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

