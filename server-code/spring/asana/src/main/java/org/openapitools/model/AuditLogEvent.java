package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.AuditLogEventActor;
import org.openapitools.model.AuditLogEventContext;
import org.openapitools.model.AuditLogEventResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object representing a single event within an Asana domain.  Every audit log event is comprised of an &#x60;event_type&#x60;, &#x60;actor&#x60;, &#x60;resource&#x60;, and &#x60;context&#x60;. Some events will include additional metadata about the event under &#x60;details&#x60;. See our [currently supported list of events](/docs/supported-auditlogevents) for more details.
 */

@Schema(name = "AuditLogEvent", description = "An object representing a single event within an Asana domain.  Every audit log event is comprised of an `event_type`, `actor`, `resource`, and `context`. Some events will include additional metadata about the event under `details`. See our [currently supported list of events](/docs/supported-auditlogevents) for more details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class AuditLogEvent {

  private AuditLogEventActor actor;

  private AuditLogEventContext context;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private Object details;

  private String eventCategory;

  private String eventType;

  private String gid;

  private AuditLogEventResource resource;

  public AuditLogEvent actor(AuditLogEventActor actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  */
  @Valid 
  @Schema(name = "actor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actor")
  public AuditLogEventActor getActor() {
    return actor;
  }

  public void setActor(AuditLogEventActor actor) {
    this.actor = actor;
  }

  public AuditLogEvent context(AuditLogEventContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  @Valid 
  @Schema(name = "context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context")
  public AuditLogEventContext getContext() {
    return context;
  }

  public void setContext(AuditLogEventContext context) {
    this.context = context;
  }

  public AuditLogEvent createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time the event was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", example = "2021-01-01T00:00Z", description = "The time the event was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public AuditLogEvent details(Object details) {
    this.details = details;
    return this;
  }

  /**
   * Event specific details. The schema will vary depending on the `event_type`.
   * @return details
  */
  
  @Schema(name = "details", description = "Event specific details. The schema will vary depending on the `event_type`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("details")
  public Object getDetails() {
    return details;
  }

  public void setDetails(Object details) {
    this.details = details;
  }

  public AuditLogEvent eventCategory(String eventCategory) {
    this.eventCategory = eventCategory;
    return this;
  }

  /**
   * The category that this `event_type` belongs to.
   * @return eventCategory
  */
  
  @Schema(name = "event_category", example = "deletion", description = "The category that this `event_type` belongs to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_category")
  public String getEventCategory() {
    return eventCategory;
  }

  public void setEventCategory(String eventCategory) {
    this.eventCategory = eventCategory;
  }

  public AuditLogEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * The type of the event.
   * @return eventType
  */
  
  @Schema(name = "event_type", example = "task_deleted", description = "The type of the event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_type")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public AuditLogEvent gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the `AuditLogEvent`, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", example = "12345", description = "Globally unique identifier of the `AuditLogEvent`, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public AuditLogEvent resource(AuditLogEventResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  */
  @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public AuditLogEventResource getResource() {
    return resource;
  }

  public void setResource(AuditLogEventResource resource) {
    this.resource = resource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEvent auditLogEvent = (AuditLogEvent) o;
    return Objects.equals(this.actor, auditLogEvent.actor) &&
        Objects.equals(this.context, auditLogEvent.context) &&
        Objects.equals(this.createdAt, auditLogEvent.createdAt) &&
        Objects.equals(this.details, auditLogEvent.details) &&
        Objects.equals(this.eventCategory, auditLogEvent.eventCategory) &&
        Objects.equals(this.eventType, auditLogEvent.eventType) &&
        Objects.equals(this.gid, auditLogEvent.gid) &&
        Objects.equals(this.resource, auditLogEvent.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actor, context, createdAt, details, eventCategory, eventType, gid, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEvent {\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    eventCategory: ").append(toIndentedString(eventCategory)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

