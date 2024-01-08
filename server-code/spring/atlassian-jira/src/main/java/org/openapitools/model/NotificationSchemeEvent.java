package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EventNotification;
import org.openapitools.model.NotificationEvent;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a notification scheme event.
 */

@Schema(name = "NotificationSchemeEvent", description = "Details about a notification scheme event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NotificationSchemeEvent {

  private NotificationEvent event;

  @Valid
  private List<@Valid EventNotification> notifications;

  public NotificationSchemeEvent event(NotificationEvent event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event")
  public NotificationEvent getEvent() {
    return event;
  }

  public void setEvent(NotificationEvent event) {
    this.event = event;
  }

  public NotificationSchemeEvent notifications(List<@Valid EventNotification> notifications) {
    this.notifications = notifications;
    return this;
  }

  public NotificationSchemeEvent addNotificationsItem(EventNotification notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * Get notifications
   * @return notifications
  */
  @Valid 
  @Schema(name = "notifications", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifications")
  public List<@Valid EventNotification> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<@Valid EventNotification> notifications) {
    this.notifications = notifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSchemeEvent notificationSchemeEvent = (NotificationSchemeEvent) o;
    return Objects.equals(this.event, notificationSchemeEvent.event) &&
        Objects.equals(this.notifications, notificationSchemeEvent.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSchemeEvent {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

