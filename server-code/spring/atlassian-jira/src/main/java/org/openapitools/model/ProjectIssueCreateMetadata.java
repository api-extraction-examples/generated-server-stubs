package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueTypeIssueCreateMetadata;
import org.openapitools.model.ProjectIssueCreateMetadataAvatarUrls;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the issue creation metadata for a project.
 */

@Schema(name = "ProjectIssueCreateMetadata", description = "Details of the issue creation metadata for a project.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectIssueCreateMetadata {

  private ProjectIssueCreateMetadataAvatarUrls avatarUrls;

  private String expand;

  private String id;

  @Valid
  private List<@Valid IssueTypeIssueCreateMetadata> issuetypes;

  private String key;

  private String name;

  private String self;

  public ProjectIssueCreateMetadata avatarUrls(ProjectIssueCreateMetadataAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
    return this;
  }

  /**
   * Get avatarUrls
   * @return avatarUrls
  */
  @Valid 
  @Schema(name = "avatarUrls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatarUrls")
  public ProjectIssueCreateMetadataAvatarUrls getAvatarUrls() {
    return avatarUrls;
  }

  public void setAvatarUrls(ProjectIssueCreateMetadataAvatarUrls avatarUrls) {
    this.avatarUrls = avatarUrls;
  }

  public ProjectIssueCreateMetadata expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional project issue create metadata details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional project issue create metadata details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public ProjectIssueCreateMetadata id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the project.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectIssueCreateMetadata issuetypes(List<@Valid IssueTypeIssueCreateMetadata> issuetypes) {
    this.issuetypes = issuetypes;
    return this;
  }

  public ProjectIssueCreateMetadata addIssuetypesItem(IssueTypeIssueCreateMetadata issuetypesItem) {
    if (this.issuetypes == null) {
      this.issuetypes = new ArrayList<>();
    }
    this.issuetypes.add(issuetypesItem);
    return this;
  }

  /**
   * List of the issue types supported by the project.
   * @return issuetypes
  */
  @Valid 
  @Schema(name = "issuetypes", accessMode = Schema.AccessMode.READ_ONLY, description = "List of the issue types supported by the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuetypes")
  public List<@Valid IssueTypeIssueCreateMetadata> getIssuetypes() {
    return issuetypes;
  }

  public void setIssuetypes(List<@Valid IssueTypeIssueCreateMetadata> issuetypes) {
    this.issuetypes = issuetypes;
  }

  public ProjectIssueCreateMetadata key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the project.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ProjectIssueCreateMetadata name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the project.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectIssueCreateMetadata self(String self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the project.
   * @return self
  */
  
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProjectIssueCreateMetadata projectIssueCreateMetadata = (ProjectIssueCreateMetadata) o;
    return Objects.equals(this.avatarUrls, projectIssueCreateMetadata.avatarUrls) &&
        Objects.equals(this.expand, projectIssueCreateMetadata.expand) &&
        Objects.equals(this.id, projectIssueCreateMetadata.id) &&
        Objects.equals(this.issuetypes, projectIssueCreateMetadata.issuetypes) &&
        Objects.equals(this.key, projectIssueCreateMetadata.key) &&
        Objects.equals(this.name, projectIssueCreateMetadata.name) &&
        Objects.equals(this.self, projectIssueCreateMetadata.self);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrls, expand, id, issuetypes, key, name, self);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueCreateMetadata {\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuetypes: ").append(toIndentedString(issuetypes)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

