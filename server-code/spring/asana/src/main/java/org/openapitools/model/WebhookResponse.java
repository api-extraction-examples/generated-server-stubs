package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AsanaNamedResource;
import org.openapitools.model.WebhookResponseAllOfFilters;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WebhookResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class WebhookResponse {

  private String gid;

  private String resourceType;

  private Boolean active;

  private AsanaNamedResource resource;

  private URI target;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @Valid
  private List<@Valid WebhookResponseAllOfFilters> filters;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastFailureAt;

  private String lastFailureContent;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastSuccessAt;

  public WebhookResponse gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public WebhookResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public WebhookResponse active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * If true, the webhook will send events - if false it is considered inactive and will not generate events.
   * @return active
  */
  
  @Schema(name = "active", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "If true, the webhook will send events - if false it is considered inactive and will not generate events.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public WebhookResponse resource(AsanaNamedResource resource) {
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
  public AsanaNamedResource getResource() {
    return resource;
  }

  public void setResource(AsanaNamedResource resource) {
    this.resource = resource;
  }

  public WebhookResponse target(URI target) {
    this.target = target;
    return this;
  }

  /**
   * The URL to receive the HTTP POST.
   * @return target
  */
  @Valid 
  @Schema(name = "target", accessMode = Schema.AccessMode.READ_ONLY, example = "https://example.com/receive-webhook/7654", description = "The URL to receive the HTTP POST.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target")
  public URI getTarget() {
    return target;
  }

  public void setTarget(URI target) {
    this.target = target;
  }

  public WebhookResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public WebhookResponse filters(List<@Valid WebhookResponseAllOfFilters> filters) {
    this.filters = filters;
    return this;
  }

  public WebhookResponse addFiltersItem(WebhookResponseAllOfFilters filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    return this;
  }

  /**
   * Whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.
   * @return filters
  */
  @Valid 
  @Schema(name = "filters", description = "Whitelist of filters to apply to events from this webhook. If a webhook event passes any of the filters the event will be delivered; otherwise no event will be sent to the receiving server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filters")
  public List<@Valid WebhookResponseAllOfFilters> getFilters() {
    return filters;
  }

  public void setFilters(List<@Valid WebhookResponseAllOfFilters> filters) {
    this.filters = filters;
  }

  public WebhookResponse lastFailureAt(OffsetDateTime lastFailureAt) {
    this.lastFailureAt = lastFailureAt;
    return this;
  }

  /**
   * The timestamp when the webhook last received an error when sending an event to the target.
   * @return lastFailureAt
  */
  @Valid 
  @Schema(name = "last_failure_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The timestamp when the webhook last received an error when sending an event to the target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_failure_at")
  public OffsetDateTime getLastFailureAt() {
    return lastFailureAt;
  }

  public void setLastFailureAt(OffsetDateTime lastFailureAt) {
    this.lastFailureAt = lastFailureAt;
  }

  public WebhookResponse lastFailureContent(String lastFailureContent) {
    this.lastFailureContent = lastFailureContent;
    return this;
  }

  /**
   * The contents of the last error response sent to the webhook when attempting to deliver events to the target.
   * @return lastFailureContent
  */
  
  @Schema(name = "last_failure_content", accessMode = Schema.AccessMode.READ_ONLY, example = "500 Server Error\\n\\nCould not complete the request", description = "The contents of the last error response sent to the webhook when attempting to deliver events to the target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_failure_content")
  public String getLastFailureContent() {
    return lastFailureContent;
  }

  public void setLastFailureContent(String lastFailureContent) {
    this.lastFailureContent = lastFailureContent;
  }

  public WebhookResponse lastSuccessAt(OffsetDateTime lastSuccessAt) {
    this.lastSuccessAt = lastSuccessAt;
    return this;
  }

  /**
   * The timestamp when the webhook last successfully sent an event to the target.
   * @return lastSuccessAt
  */
  @Valid 
  @Schema(name = "last_success_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The timestamp when the webhook last successfully sent an event to the target.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_success_at")
  public OffsetDateTime getLastSuccessAt() {
    return lastSuccessAt;
  }

  public void setLastSuccessAt(OffsetDateTime lastSuccessAt) {
    this.lastSuccessAt = lastSuccessAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookResponse webhookResponse = (WebhookResponse) o;
    return Objects.equals(this.gid, webhookResponse.gid) &&
        Objects.equals(this.resourceType, webhookResponse.resourceType) &&
        Objects.equals(this.active, webhookResponse.active) &&
        Objects.equals(this.resource, webhookResponse.resource) &&
        Objects.equals(this.target, webhookResponse.target) &&
        Objects.equals(this.createdAt, webhookResponse.createdAt) &&
        Objects.equals(this.filters, webhookResponse.filters) &&
        Objects.equals(this.lastFailureAt, webhookResponse.lastFailureAt) &&
        Objects.equals(this.lastFailureContent, webhookResponse.lastFailureContent) &&
        Objects.equals(this.lastSuccessAt, webhookResponse.lastSuccessAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, active, resource, target, createdAt, filters, lastFailureAt, lastFailureContent, lastSuccessAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    lastFailureAt: ").append(toIndentedString(lastFailureAt)).append("\n");
    sb.append("    lastFailureContent: ").append(toIndentedString(lastFailureContent)).append("\n");
    sb.append("    lastSuccessAt: ").append(toIndentedString(lastSuccessAt)).append("\n");
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

