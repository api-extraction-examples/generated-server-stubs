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
 * The primary object that was affected by this event.
 */

@Schema(name = "AuditLogEventResource", description = "The primary object that was affected by this event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class AuditLogEventResource {

  private String email;

  private String gid;

  private String name;

  private String resourceSubtype;

  private String resourceType;

  public AuditLogEventResource email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email of the resource, if applicable.
   * @return email
  */
  
  @Schema(name = "email", description = "The email of the resource, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuditLogEventResource gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource.
   * @return gid
  */
  
  @Schema(name = "gid", example = "1111", description = "Globally unique identifier of the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public AuditLogEventResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the resource.
   * @return name
  */
  
  @Schema(name = "name", example = "Example Task", description = "The name of the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AuditLogEventResource resourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of resource. Most resources will not have a subtype.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", example = "milestone", description = "The subtype of resource. Most resources will not have a subtype.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public String getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(String resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public AuditLogEventResource resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The type of resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", example = "task", description = "The type of resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditLogEventResource auditLogEventResource = (AuditLogEventResource) o;
    return Objects.equals(this.email, auditLogEventResource.email) &&
        Objects.equals(this.gid, auditLogEventResource.gid) &&
        Objects.equals(this.name, auditLogEventResource.name) &&
        Objects.equals(this.resourceSubtype, auditLogEventResource.resourceSubtype) &&
        Objects.equals(this.resourceType, auditLogEventResource.resourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, gid, name, resourceSubtype, resourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogEventResource {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
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

