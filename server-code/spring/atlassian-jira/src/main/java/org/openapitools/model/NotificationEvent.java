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
 * Details about a notification event.
 */

@Schema(name = "NotificationEvent", description = "Details about a notification event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NotificationEvent {

  private String description;

  private Long id;

  private String name;

  private NotificationEvent templateEvent;

  public NotificationEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the event.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotificationEvent id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the event. The event can be a [Jira system event](https://confluence.atlassian.com/x/8YdKLg#Creatinganotificationscheme-eventsEvents) or a [custom event](https://confluence.atlassian.com/x/AIlKLg).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NotificationEvent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the event.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationEvent templateEvent(NotificationEvent templateEvent) {
    this.templateEvent = templateEvent;
    return this;
  }

  /**
   * Get templateEvent
   * @return templateEvent
  */
  @Valid 
  @Schema(name = "templateEvent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templateEvent")
  public NotificationEvent getTemplateEvent() {
    return templateEvent;
  }

  public void setTemplateEvent(NotificationEvent templateEvent) {
    this.templateEvent = templateEvent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationEvent notificationEvent = (NotificationEvent) o;
    return Objects.equals(this.description, notificationEvent.description) &&
        Objects.equals(this.id, notificationEvent.id) &&
        Objects.equals(this.name, notificationEvent.name) &&
        Objects.equals(this.templateEvent, notificationEvent.templateEvent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, templateEvent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationEvent {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateEvent: ").append(toIndentedString(templateEvent)).append("\n");
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

