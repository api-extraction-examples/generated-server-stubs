package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ClientSideAvailability;
import org.openapitools.model.EnvironmentPost;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostProjectRequest
 */

@JsonTypeName("postProject_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostProjectRequest {

  private ClientSideAvailability defaultClientSideAvailability;

  @Valid
  private List<@Valid EnvironmentPost> environments;

  private Boolean includeInSnippetByDefault;

  private String key;

  private String name;

  @Valid
  private List<String> tags;

  public PostProjectRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostProjectRequest(String key, String name) {
    this.key = key;
    this.name = name;
  }

  public PostProjectRequest defaultClientSideAvailability(ClientSideAvailability defaultClientSideAvailability) {
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

  public PostProjectRequest environments(List<@Valid EnvironmentPost> environments) {
    this.environments = environments;
    return this;
  }

  public PostProjectRequest addEnvironmentsItem(EnvironmentPost environmentsItem) {
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
  public List<@Valid EnvironmentPost> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<@Valid EnvironmentPost> environments) {
    this.environments = environments;
  }

  public PostProjectRequest includeInSnippetByDefault(Boolean includeInSnippetByDefault) {
    this.includeInSnippetByDefault = includeInSnippetByDefault;
    return this;
  }

  /**
   * Get includeInSnippetByDefault
   * @return includeInSnippetByDefault
  */
  
  @Schema(name = "includeInSnippetByDefault", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeInSnippetByDefault")
  public Boolean getIncludeInSnippetByDefault() {
    return includeInSnippetByDefault;
  }

  public void setIncludeInSnippetByDefault(Boolean includeInSnippetByDefault) {
    this.includeInSnippetByDefault = includeInSnippetByDefault;
  }

  public PostProjectRequest key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "new-project", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PostProjectRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "New Project", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostProjectRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PostProjectRequest addTagsItem(String tagsItem) {
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
  
  @Schema(name = "tags", example = "[ops, dev]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PostProjectRequest postProjectRequest = (PostProjectRequest) o;
    return Objects.equals(this.defaultClientSideAvailability, postProjectRequest.defaultClientSideAvailability) &&
        Objects.equals(this.environments, postProjectRequest.environments) &&
        Objects.equals(this.includeInSnippetByDefault, postProjectRequest.includeInSnippetByDefault) &&
        Objects.equals(this.key, postProjectRequest.key) &&
        Objects.equals(this.name, postProjectRequest.name) &&
        Objects.equals(this.tags, postProjectRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultClientSideAvailability, environments, includeInSnippetByDefault, key, name, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostProjectRequest {\n");
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

