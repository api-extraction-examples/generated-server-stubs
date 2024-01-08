package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.NotificationDto;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of notifications with the total record count for pagination.
 */

@Schema(name = "NotificationResultDto", description = "A list of notifications with the total record count for pagination.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class NotificationResultDto {

  @Valid
  private JsonNullable<List<@Valid NotificationDto>> notifications = JsonNullable.<List<@Valid NotificationDto>>undefined();

  private Integer totalRecordCount;

  public NotificationResultDto notifications(List<@Valid NotificationDto> notifications) {
    this.notifications = JsonNullable.of(notifications);
    return this;
  }

  public NotificationResultDto addNotificationsItem(NotificationDto notificationsItem) {
    if (this.notifications == null || !this.notifications.isPresent()) {
      this.notifications = JsonNullable.of(new ArrayList<>());
    }
    this.notifications.get().add(notificationsItem);
    return this;
  }

  /**
   * Gets or sets the current page of notifications.
   * @return notifications
  */
  @Valid 
  @Schema(name = "Notifications", description = "Gets or sets the current page of notifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Notifications")
  public JsonNullable<List<@Valid NotificationDto>> getNotifications() {
    return notifications;
  }

  public void setNotifications(JsonNullable<List<@Valid NotificationDto>> notifications) {
    this.notifications = notifications;
  }

  public NotificationResultDto totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

  /**
   * Gets or sets the total number of notifications.
   * @return totalRecordCount
  */
  
  @Schema(name = "TotalRecordCount", description = "Gets or sets the total number of notifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalRecordCount")
  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationResultDto notificationResultDto = (NotificationResultDto) o;
    return equalsNullable(this.notifications, notificationResultDto.notifications) &&
        Objects.equals(this.totalRecordCount, notificationResultDto.totalRecordCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(notifications), totalRecordCount);
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
    sb.append("class NotificationResultDto {\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
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

