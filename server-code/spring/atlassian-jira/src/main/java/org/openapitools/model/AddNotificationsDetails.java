package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NotificationSchemeEventDetails;
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
 * Details of notifications which should be added to the notification scheme.
 */

@Schema(name = "AddNotificationsDetails", description = "Details of notifications which should be added to the notification scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AddNotificationsDetails {

  @Valid
  private List<@Valid NotificationSchemeEventDetails> notificationSchemeEvents = new ArrayList<>();

  public AddNotificationsDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddNotificationsDetails(List<@Valid NotificationSchemeEventDetails> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
  }

  public AddNotificationsDetails notificationSchemeEvents(List<@Valid NotificationSchemeEventDetails> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
    return this;
  }

  public AddNotificationsDetails addNotificationSchemeEventsItem(NotificationSchemeEventDetails notificationSchemeEventsItem) {
    if (this.notificationSchemeEvents == null) {
      this.notificationSchemeEvents = new ArrayList<>();
    }
    this.notificationSchemeEvents.add(notificationSchemeEventsItem);
    return this;
  }

  /**
   * The list of notifications which should be added to the notification scheme.
   * @return notificationSchemeEvents
  */
  @NotNull @Valid 
  @Schema(name = "notificationSchemeEvents", description = "The list of notifications which should be added to the notification scheme.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("notificationSchemeEvents")
  public List<@Valid NotificationSchemeEventDetails> getNotificationSchemeEvents() {
    return notificationSchemeEvents;
  }

  public void setNotificationSchemeEvents(List<@Valid NotificationSchemeEventDetails> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
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
    public AddNotificationsDetails putAdditionalProperty(String key, Object value) {
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
    AddNotificationsDetails addNotificationsDetails = (AddNotificationsDetails) o;
    return Objects.equals(this.notificationSchemeEvents, addNotificationsDetails.notificationSchemeEvents) &&
    Objects.equals(this.additionalProperties, addNotificationsDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationSchemeEvents, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddNotificationsDetails {\n");
    sb.append("    notificationSchemeEvents: ").append(toIndentedString(notificationSchemeEvents)).append("\n");
    
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

