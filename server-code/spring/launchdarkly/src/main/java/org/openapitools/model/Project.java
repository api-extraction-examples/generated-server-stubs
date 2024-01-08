package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClientSideAvailability;
import org.openapitools.model.Environment;
import org.openapitools.model.Links;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Project
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Project {

  private String id;

  private Links links;

  private ClientSideAvailability defaultClientSideAvailability;

  @Valid
  private List<@Valid Environment> environments;

  private Boolean includeInSnippetByDefault;

  private String key;

  private String name;

  @Valid
  private List<String> tags;

  public Project id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique resource id.
   * @return id
  */
  
  @Schema(name = "_id", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Project links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public Project defaultClientSideAvailability(ClientSideAvailability defaultClientSideAvailability) {
    this.defaultClientSideAvailability = defaultClientSideAvailability;
    return this;
  }

  /**
   * Get defaultClientSideAvailability
   * @return defaultClientSideAvailability
  */
  @Valid 
  @Schema(name = "defaultClientSideAvailability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultClientSideAvailability")
  public ClientSideAvailability getDefaultClientSideAvailability() {
    return defaultClientSideAvailability;
  }

  public void setDefaultClientSideAvailability(ClientSideAvailability defaultClientSideAvailability) {
    this.defaultClientSideAvailability = defaultClientSideAvailability;
  }

  public Project environments(List<@Valid Environment> environments) {
    this.environments = environments;
    return this;
  }

  public Project addEnvironmentsItem(Environment environmentsItem) {
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
  @Valid 
  @Schema(name = "environments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environments")
  public List<@Valid Environment> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<@Valid Environment> environments) {
    this.environments = environments;
  }

  public Project includeInSnippetByDefault(Boolean includeInSnippetByDefault) {
    this.includeInSnippetByDefault = includeInSnippetByDefault;
    return this;
  }

  /**
   * Get includeInSnippetByDefault
   * @return includeInSnippetByDefault
  */
  
  @Schema(name = "includeInSnippetByDefault", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeInSnippetByDefault")
  public Boolean getIncludeInSnippetByDefault() {
    return includeInSnippetByDefault;
  }

  public void setIncludeInSnippetByDefault(Boolean includeInSnippetByDefault) {
    this.includeInSnippetByDefault = includeInSnippetByDefault;
  }

  public Project key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", example = "zentasks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", example = "Zentasks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Project addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * An array of tags for this project.
   * @return tags
  */
  
  @Schema(name = "tags", description = "An array of tags for this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.id, project.id) &&
        Objects.equals(this.links, project.links) &&
        Objects.equals(this.defaultClientSideAvailability, project.defaultClientSideAvailability) &&
        Objects.equals(this.environments, project.environments) &&
        Objects.equals(this.includeInSnippetByDefault, project.includeInSnippetByDefault) &&
        Objects.equals(this.key, project.key) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.tags, project.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, defaultClientSideAvailability, environments, includeInSnippetByDefault, key, name, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    defaultClientSideAvailability: ").append(toIndentedString(defaultClientSideAvailability)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    includeInSnippetByDefault: ").append(toIndentedString(includeInSnippetByDefault)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

