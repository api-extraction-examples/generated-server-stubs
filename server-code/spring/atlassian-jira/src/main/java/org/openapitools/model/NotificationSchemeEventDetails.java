package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NotificationSchemeEventTypeId;
import org.openapitools.model.NotificationSchemeNotificationDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of a notification scheme event.
 */

@Schema(name = "NotificationSchemeEventDetails", description = "Details of a notification scheme event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NotificationSchemeEventDetails {

  private NotificationSchemeEventTypeId event;

  @Valid
  private List<@Valid NotificationSchemeNotificationDetails> notifications = new ArrayList<>();

  public NotificationSchemeEventDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public NotificationSchemeEventDetails(NotificationSchemeEventTypeId event, List<@Valid NotificationSchemeNotificationDetails> notifications) {
    this.event = event;
    this.notifications = notifications;
  }

  public NotificationSchemeEventDetails event(NotificationSchemeEventTypeId event) {
    this.event = event;
    return this;
  }

  /**
   * Get event
   * @return event
  */
  @NotNull @Valid 
  @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event")
  public NotificationSchemeEventTypeId getEvent() {
    return event;
  }

  public void setEvent(NotificationSchemeEventTypeId event) {
    this.event = event;
  }

  public NotificationSchemeEventDetails notifications(List<@Valid NotificationSchemeNotificationDetails> notifications) {
    this.notifications = notifications;
    return this;
  }

  public NotificationSchemeEventDetails addNotificationsItem(NotificationSchemeNotificationDetails notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

  /**
   * The list of notifications mapped to a specified event.
   * @return notifications
  */
  @NotNull @Valid 
  @Schema(name = "notifications", description = "The list of notifications mapped to a specified event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notifications")
  public List<@Valid NotificationSchemeNotificationDetails> getNotifications() {
    return notifications;
  }

  public void setNotifications(List<@Valid NotificationSchemeNotificationDetails> notifications) {
    this.notifications = notifications;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public NotificationSchemeEventDetails putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationSchemeEventDetails notificationSchemeEventDetails = (NotificationSchemeEventDetails) o;
    return Objects.equals(this.event, notificationSchemeEventDetails.event) &&
        Objects.equals(this.notifications, notificationSchemeEventDetails.notifications) &&
    Objects.equals(this.additionalProperties, notificationSchemeEventDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(event, notifications, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationSchemeEventDetails {\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

