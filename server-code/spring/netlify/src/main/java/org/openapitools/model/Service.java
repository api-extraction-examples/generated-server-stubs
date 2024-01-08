package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Service
 */

@JsonTypeName("service")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class Service {

  private String createdAt;

  private String description;

  @Valid
  private List<String> environments;

  @Valid
  private List<Object> events;

  private String icon;

  private String id;

  private String longDescription;

  private String manifestUrl;

  private String name;

  private String servicePath;

  private String slug;

  @Valid
  private List<String> tags;

  private String updatedAt;

  public Service createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Service description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Service environments(List<String> environments) {
    this.environments = environments;
    return this;
  }

  public Service addEnvironmentsItem(String environmentsItem) {
    if (this.environments == null) {
      this.environments = new ArrayList<>();
    }
    this.environments.add(environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
  */
  
  @Schema(name = "environments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environments")
  public List<String> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<String> environments) {
    this.environments = environments;
  }

  public Service events(List<Object> events) {
    this.events = events;
    return this;
  }

  public Service addEventsItem(Object eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    return this;
  }

  /**
   * Get events
   * @return events
  */
  
  @Schema(name = "events", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("events")
  public List<Object> getEvents() {
    return events;
  }

  public void setEvents(List<Object> events) {
    this.events = events;
  }

  public Service icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * Get icon
   * @return icon
  */
  
  @Schema(name = "icon", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public Service id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Service longDescription(String longDescription) {
    this.longDescription = longDescription;
    return this;
  }

  /**
   * Get longDescription
   * @return longDescription
  */
  
  @Schema(name = "long_description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("long_description")
  public String getLongDescription() {
    return longDescription;
  }

  public void setLongDescription(String longDescription) {
    this.longDescription = longDescription;
  }

  public Service manifestUrl(String manifestUrl) {
    this.manifestUrl = manifestUrl;
    return this;
  }

  /**
   * Get manifestUrl
   * @return manifestUrl
  */
  
  @Schema(name = "manifest_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("manifest_url")
  public String getManifestUrl() {
    return manifestUrl;
  }

  public void setManifestUrl(String manifestUrl) {
    this.manifestUrl = manifestUrl;
  }

  public Service name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Service servicePath(String servicePath) {
    this.servicePath = servicePath;
    return this;
  }

  /**
   * Get servicePath
   * @return servicePath
  */
  
  @Schema(name = "service_path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service_path")
  public String getServicePath() {
    return servicePath;
  }

  public void setServicePath(String servicePath) {
    this.servicePath = servicePath;
  }

  public Service slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  
  @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Service tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Service addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  
  @Schema(name = "tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public Service updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.createdAt, service.createdAt) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.environments, service.environments) &&
        Objects.equals(this.events, service.events) &&
        Objects.equals(this.icon, service.icon) &&
        Objects.equals(this.id, service.id) &&
        Objects.equals(this.longDescription, service.longDescription) &&
        Objects.equals(this.manifestUrl, service.manifestUrl) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.servicePath, service.servicePath) &&
        Objects.equals(this.slug, service.slug) &&
        Objects.equals(this.tags, service.tags) &&
        Objects.equals(this.updatedAt, service.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, environments, events, icon, id, longDescription, manifestUrl, name, servicePath, slug, tags, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    longDescription: ").append(toIndentedString(longDescription)).append("\n");
    sb.append("    manifestUrl: ").append(toIndentedString(manifestUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    servicePath: ").append(toIndentedString(servicePath)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

