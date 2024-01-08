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
 * Details of an notification scheme.
 */

@Schema(name = "CreateNotificationSchemeDetails", description = "Details of an notification scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreateNotificationSchemeDetails {

  private String description;

  private String name;

  @Valid
  private List<@Valid NotificationSchemeEventDetails> notificationSchemeEvents;

  public CreateNotificationSchemeDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateNotificationSchemeDetails(String name) {
    this.name = name;
  }

  public CreateNotificationSchemeDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the notification scheme.
   * @return description
  */
  @Size(max = 4000) 
  @Schema(name = "description", description = "The description of the notification scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateNotificationSchemeDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the notification scheme. Must be unique (case-insensitive).
   * @return name
  */
  @NotNull @Size(max = 255) 
  @Schema(name = "name", description = "The name of the notification scheme. Must be unique (case-insensitive).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateNotificationSchemeDetails notificationSchemeEvents(List<@Valid NotificationSchemeEventDetails> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
    return this;
  }

  public CreateNotificationSchemeDetails addNotificationSchemeEventsItem(NotificationSchemeEventDetails notificationSchemeEventsItem) {
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
  @Valid 
  @Schema(name = "notificationSchemeEvents", description = "The list of notifications which should be added to the notification scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    public CreateNotificationSchemeDetails putAdditionalProperty(String key, Object value) {
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
    CreateNotificationSchemeDetails createNotificationSchemeDetails = (CreateNotificationSchemeDetails) o;
    return Objects.equals(this.description, createNotificationSchemeDetails.description) &&
        Objects.equals(this.name, createNotificationSchemeDetails.name) &&
        Objects.equals(this.notificationSchemeEvents, createNotificationSchemeDetails.notificationSchemeEvents) &&
    Objects.equals(this.additionalProperties, createNotificationSchemeDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, notificationSchemeEvents, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateNotificationSchemeDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

