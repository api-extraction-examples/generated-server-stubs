package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.ClientSideAvailability;
import org.openapitools.model.CustomProperty;
import org.openapitools.model.Defaults;
import org.openapitools.model.FeatureFlagConfig;
import org.openapitools.model.Links;
import org.openapitools.model.Member;
import org.openapitools.model.Variation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeatureFlag
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class FeatureFlag {

  private Links links;

  private Member maintainer;

  private Integer version;

  private Boolean archived;

  private Long archivedDate;

  private ClientSideAvailability clientSideAvailability;

  private Long creationDate;

  @Valid
  private Map<String, CustomProperty> customProperties = new HashMap<>();

  private Defaults defaults;

  private String description;

  @Valid
  private Map<String, FeatureFlagConfig> environments = new HashMap<>();

  @Valid
  private List<String> goalIds;

  private Boolean includeInSnippet;

  private String key;

  private String kind;

  private String maintainerId;

  private String name;

  @Valid
  private List<String> tags;

  private Boolean temporary;

  @Valid
  private List<@Valid Variation> variations;

  public FeatureFlag links(Links links) {
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

  public FeatureFlag maintainer(Member maintainer) {
    this.maintainer = maintainer;
    return this;
  }

  /**
   * Get maintainer
   * @return maintainer
  */
  @Valid 
  @Schema(name = "_maintainer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_maintainer")
  public Member getMaintainer() {
    return maintainer;
  }

  public void setMaintainer(Member maintainer) {
    this.maintainer = maintainer;
  }

  public FeatureFlag version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "_version", example = "23", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public FeatureFlag archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Whether or not this flag is archived.
   * @return archived
  */
  
  @Schema(name = "archived", example = "false", description = "Whether or not this flag is archived.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public FeatureFlag archivedDate(Long archivedDate) {
    this.archivedDate = archivedDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the archived time of this flag.
   * @return archivedDate
  */
  
  @Schema(name = "archivedDate", example = "1443652232590", description = "A unix epoch time in milliseconds specifying the archived time of this flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archivedDate")
  public Long getArchivedDate() {
    return archivedDate;
  }

  public void setArchivedDate(Long archivedDate) {
    this.archivedDate = archivedDate;
  }

  public FeatureFlag clientSideAvailability(ClientSideAvailability clientSideAvailability) {
    this.clientSideAvailability = clientSideAvailability;
    return this;
  }

  /**
   * Get clientSideAvailability
   * @return clientSideAvailability
  */
  @Valid 
  @Schema(name = "clientSideAvailability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clientSideAvailability")
  public ClientSideAvailability getClientSideAvailability() {
    return clientSideAvailability;
  }

  public void setClientSideAvailability(ClientSideAvailability clientSideAvailability) {
    this.clientSideAvailability = clientSideAvailability;
  }

  public FeatureFlag creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the creation time of this flag.
   * @return creationDate
  */
  
  @Schema(name = "creationDate", example = "1443652232590", description = "A unix epoch time in milliseconds specifying the creation time of this flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public FeatureFlag customProperties(Map<String, CustomProperty> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public FeatureFlag putCustomPropertiesItem(String key, CustomProperty customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * A mapping of keys to CustomProperty entries.
   * @return customProperties
  */
  @Valid 
  @Schema(name = "customProperties", example = "{\"bugs\":{\"name\":\"Issue tracker ids\",\"value\":[\"123\",\"456\"]},\"deprecated\":{\"name\":\"Deprecated Date\",\"value\":[]}}", description = "A mapping of keys to CustomProperty entries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customProperties")
  public Map<String, CustomProperty> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, CustomProperty> customProperties) {
    this.customProperties = customProperties;
  }

  public FeatureFlag defaults(Defaults defaults) {
    this.defaults = defaults;
    return this;
  }

  /**
   * Get defaults
   * @return defaults
  */
  @Valid 
  @Schema(name = "defaults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaults")
  public Defaults getDefaults() {
    return defaults;
  }

  public void setDefaults(Defaults defaults) {
    this.defaults = defaults;
  }

  public FeatureFlag description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the feature flag.
   * @return description
  */
  
  @Schema(name = "description", example = "This flag controls whether test feature is turned on or not.", description = "Description of the feature flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FeatureFlag environments(Map<String, FeatureFlagConfig> environments) {
    this.environments = environments;
    return this;
  }

  public FeatureFlag putEnvironmentsItem(String key, FeatureFlagConfig environmentsItem) {
    if (this.environments == null) {
      this.environments = new HashMap<>();
    }
    this.environments.put(key, environmentsItem);
    return this;
  }

  /**
   * Get environments
   * @return environments
  */
  @Valid 
  @Schema(name = "environments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("environments")
  public Map<String, FeatureFlagConfig> getEnvironments() {
    return environments;
  }

  public void setEnvironments(Map<String, FeatureFlagConfig> environments) {
    this.environments = environments;
  }

  public FeatureFlag goalIds(List<String> goalIds) {
    this.goalIds = goalIds;
    return this;
  }

  public FeatureFlag addGoalIdsItem(String goalIdsItem) {
    if (this.goalIds == null) {
      this.goalIds = new ArrayList<>();
    }
    this.goalIds.add(goalIdsItem);
    return this;
  }

  /**
   * An array goals from all environments associated with this feature flag
   * @return goalIds
  */
  
  @Schema(name = "goalIds", example = "[d7239405bd89c930e885aa76, 405bc930e88d7239d895aa76]", description = "An array goals from all environments associated with this feature flag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("goalIds")
  public List<String> getGoalIds() {
    return goalIds;
  }

  public void setGoalIds(List<String> goalIds) {
    this.goalIds = goalIds;
  }

  public FeatureFlag includeInSnippet(Boolean includeInSnippet) {
    this.includeInSnippet = includeInSnippet;
    return this;
  }

  /**
   * Get includeInSnippet
   * @return includeInSnippet
  */
  
  @Schema(name = "includeInSnippet", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeInSnippet")
  public Boolean getIncludeInSnippet() {
    return includeInSnippet;
  }

  public void setIncludeInSnippet(Boolean includeInSnippet) {
    this.includeInSnippet = includeInSnippet;
  }

  public FeatureFlag key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", example = "test-feature", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public FeatureFlag kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Whether the feature flag is a boolean flag or multivariate.
   * @return kind
  */
  
  @Schema(name = "kind", example = "boolean", description = "Whether the feature flag is a boolean flag or multivariate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public FeatureFlag maintainerId(String maintainerId) {
    this.maintainerId = maintainerId;
    return this;
  }

  /**
   * The ID of the member that should maintain this flag.
   * @return maintainerId
  */
  
  @Schema(name = "maintainerId", example = "561c579cd8fd5c2704000001", description = "The ID of the member that should maintain this flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maintainerId")
  public String getMaintainerId() {
    return maintainerId;
  }

  public void setMaintainerId(String maintainerId) {
    this.maintainerId = maintainerId;
  }

  public FeatureFlag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the feature flag.
   * @return name
  */
  
  @Schema(name = "name", example = "Test Feature", description = "Name of the feature flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FeatureFlag tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public FeatureFlag addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * An array of tags for this feature flag.
   * @return tags
  */
  
  @Schema(name = "tags", example = "[]", description = "An array of tags for this feature flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public FeatureFlag temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

  /**
   * Whether or not this flag is temporary.
   * @return temporary
  */
  
  @Schema(name = "temporary", example = "false", description = "Whether or not this flag is temporary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temporary")
  public Boolean getTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }

  public FeatureFlag variations(List<@Valid Variation> variations) {
    this.variations = variations;
    return this;
  }

  public FeatureFlag addVariationsItem(Variation variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<>();
    }
    this.variations.add(variationsItem);
    return this;
  }

  /**
   * The variations for this feature flag.
   * @return variations
  */
  @Valid 
  @Schema(name = "variations", example = "[{value=a}, {value=b}]", description = "The variations for this feature flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variations")
  public List<@Valid Variation> getVariations() {
    return variations;
  }

  public void setVariations(List<@Valid Variation> variations) {
    this.variations = variations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlag featureFlag = (FeatureFlag) o;
    return Objects.equals(this.links, featureFlag.links) &&
        Objects.equals(this.maintainer, featureFlag.maintainer) &&
        Objects.equals(this.version, featureFlag.version) &&
        Objects.equals(this.archived, featureFlag.archived) &&
        Objects.equals(this.archivedDate, featureFlag.archivedDate) &&
        Objects.equals(this.clientSideAvailability, featureFlag.clientSideAvailability) &&
        Objects.equals(this.creationDate, featureFlag.creationDate) &&
        Objects.equals(this.customProperties, featureFlag.customProperties) &&
        Objects.equals(this.defaults, featureFlag.defaults) &&
        Objects.equals(this.description, featureFlag.description) &&
        Objects.equals(this.environments, featureFlag.environments) &&
        Objects.equals(this.goalIds, featureFlag.goalIds) &&
        Objects.equals(this.includeInSnippet, featureFlag.includeInSnippet) &&
        Objects.equals(this.key, featureFlag.key) &&
        Objects.equals(this.kind, featureFlag.kind) &&
        Objects.equals(this.maintainerId, featureFlag.maintainerId) &&
        Objects.equals(this.name, featureFlag.name) &&
        Objects.equals(this.tags, featureFlag.tags) &&
        Objects.equals(this.temporary, featureFlag.temporary) &&
        Objects.equals(this.variations, featureFlag.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, maintainer, version, archived, archivedDate, clientSideAvailability, creationDate, customProperties, defaults, description, environments, goalIds, includeInSnippet, key, kind, maintainerId, name, tags, temporary, variations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlag {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    maintainer: ").append(toIndentedString(maintainer)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    archivedDate: ").append(toIndentedString(archivedDate)).append("\n");
    sb.append("    clientSideAvailability: ").append(toIndentedString(clientSideAvailability)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
    sb.append("    goalIds: ").append(toIndentedString(goalIds)).append("\n");
    sb.append("    includeInSnippet: ").append(toIndentedString(includeInSnippet)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    maintainerId: ").append(toIndentedString(maintainerId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    temporary: ").append(toIndentedString(temporary)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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

