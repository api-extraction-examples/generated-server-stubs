package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.NotificationSchemeEvent;
import org.openapitools.model.Scope;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a notification scheme.
 */

@Schema(name = "NotificationScheme", description = "Details about a notification scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NotificationScheme {

  private String description;

  private String expand;

  private Long id;

  private String name;

  @Valid
  private List<@Valid NotificationSchemeEvent> notificationSchemeEvents;

  @Valid
  private List<Long> projects;

  private Scope scope;

  private String self;

  public NotificationScheme description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the notification scheme.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the notification scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NotificationScheme expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional notification scheme details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", description = "Expand options that include additional notification scheme details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public NotificationScheme id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the notification scheme.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the notification scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public NotificationScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the notification scheme.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the notification scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NotificationScheme notificationSchemeEvents(List<@Valid NotificationSchemeEvent> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
    return this;
  }

  public NotificationScheme addNotificationSchemeEventsItem(NotificationSchemeEvent notificationSchemeEventsItem) {
    if (this.notificationSchemeEvents == null) {
      this.notificationSchemeEvents = new ArrayList<>();
    }
    this.notificationSchemeEvents.add(notificationSchemeEventsItem);
    return this;
  }

  /**
   * The notification events and associated recipients.
   * @return notificationSchemeEvents
  */
  @Valid 
  @Schema(name = "notificationSchemeEvents", description = "The notification events and associated recipients.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notificationSchemeEvents")
  public List<@Valid NotificationSchemeEvent> getNotificationSchemeEvents() {
    return notificationSchemeEvents;
  }

  public void setNotificationSchemeEvents(List<@Valid NotificationSchemeEvent> notificationSchemeEvents) {
    this.notificationSchemeEvents = notificationSchemeEvents;
  }

  public NotificationScheme projects(List<Long> projects) {
    this.projects = projects;
    return this;
  }

  public NotificationScheme addProjectsItem(Long projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * The list of project IDs associated with the notification scheme.
   * @return projects
  */
  
  @Schema(name = "projects", description = "The list of project IDs associated with the notification scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public List<Long> getProjects() {
    return projects;
  }

  public void setProjects(List<Long> projects) {
    this.projects = projects;
  }

  public NotificationScheme scope(Scope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public NotificationScheme self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  
  @Schema(name = "self", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationScheme notificationScheme = (NotificationScheme) o;
    return Objects.equals(this.description, notificationScheme.description) &&
        Objects.equals(this.expand, notificationScheme.expand) &&
        Objects.equals(this.id, notificationScheme.id) &&
        Objects.equals(this.name, notificationScheme.name) &&
        Objects.equals(this.notificationSchemeEvents, notificationScheme.notificationSchemeEvents) &&
        Objects.equals(this.projects, notificationScheme.projects) &&
        Objects.equals(this.scope, notificationScheme.scope) &&
        Objects.equals(this.self, notificationScheme.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expand, id, name, notificationSchemeEvents, projects, scope, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationScheme {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationSchemeEvents: ").append(toIndentedString(notificationSchemeEvents)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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

