package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import org.openapitools.model.AsanaNamedResource;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WebhookCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class WebhookCompact {

  private String gid;

  private String resourceType;

  private Boolean active;

  private AsanaNamedResource resource;

  private URI target;

  public WebhookCompact gid(String gid) {
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

  public WebhookCompact resourceType(String resourceType) {
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

  public WebhookCompact active(Boolean active) {
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

  public WebhookCompact resource(AsanaNamedResource resource) {
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

  public WebhookCompact target(URI target) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookCompact webhookCompact = (WebhookCompact) o;
    return Objects.equals(this.gid, webhookCompact.gid) &&
        Objects.equals(this.resourceType, webhookCompact.resourceType) &&
        Objects.equals(this.active, webhookCompact.active) &&
        Objects.equals(this.resource, webhookCompact.resource) &&
        Objects.equals(this.target, webhookCompact.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, active, resource, target);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

