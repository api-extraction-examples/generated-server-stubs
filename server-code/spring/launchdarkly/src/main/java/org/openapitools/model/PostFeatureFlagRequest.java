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
import org.openapitools.model.Defaults;
import org.openapitools.model.Variation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostFeatureFlagRequest
 */

@JsonTypeName("postFeatureFlag_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostFeatureFlagRequest {

  private ClientSideAvailability clientSideAvailability;

  private Defaults defaults;

  private String description;

  private Boolean includeInSnippet;

  private String key;

  private String name;

  @Valid
  private List<String> tags;

  private Boolean temporary;

  @Valid
  private List<@Valid Variation> variations = new ArrayList<>();

  public PostFeatureFlagRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostFeatureFlagRequest(String key, String name, List<@Valid Variation> variations) {
    this.key = key;
    this.name = name;
    this.variations = variations;
  }

  public PostFeatureFlagRequest clientSideAvailability(ClientSideAvailability clientSideAvailability) {
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

  public PostFeatureFlagRequest defaults(Defaults defaults) {
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

  public PostFeatureFlagRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the feature flag.
   * @return description
  */
  
  @Schema(name = "description", example = "This flag controls whether test feature is turned on or not.", description = "A description of the feature flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostFeatureFlagRequest includeInSnippet(Boolean includeInSnippet) {
    this.includeInSnippet = includeInSnippet;
    return this;
  }

  /**
   * Whether or not this flag should be made available to the client-side JavaScript SDK.
   * @return includeInSnippet
  */
  
  @Schema(name = "includeInSnippet", description = "Whether or not this flag should be made available to the client-side JavaScript SDK.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("includeInSnippet")
  public Boolean getIncludeInSnippet() {
    return includeInSnippet;
  }

  public void setIncludeInSnippet(Boolean includeInSnippet) {
    this.includeInSnippet = includeInSnippet;
  }

  public PostFeatureFlagRequest key(String key) {
    this.key = key;
    return this;
  }

  /**
   * A unique key that will be used to reference the flag in your code.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "new-test-flag", description = "A unique key that will be used to reference the flag in your code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PostFeatureFlagRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name for the feature flag. Remember to note if this flag is intended to be temporary or permanent.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "new test flag", description = "A human-friendly name for the feature flag. Remember to note if this flag is intended to be temporary or permanent.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostFeatureFlagRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public PostFeatureFlagRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for the feature flag.
   * @return tags
  */
  
  @Schema(name = "tags", description = "Tags for the feature flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public PostFeatureFlagRequest temporary(Boolean temporary) {
    this.temporary = temporary;
    return this;
  }

  /**
   * Whether or not the flag is a temporary flag.
   * @return temporary
  */
  
  @Schema(name = "temporary", description = "Whether or not the flag is a temporary flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("temporary")
  public Boolean getTemporary() {
    return temporary;
  }

  public void setTemporary(Boolean temporary) {
    this.temporary = temporary;
  }

  public PostFeatureFlagRequest variations(List<@Valid Variation> variations) {
    this.variations = variations;
    return this;
  }

  public PostFeatureFlagRequest addVariationsItem(Variation variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<>();
    }
    this.variations.add(variationsItem);
    return this;
  }

  /**
   * An array of possible variations for the flag.
   * @return variations
  */
  @NotNull @Valid 
  @Schema(name = "variations", description = "An array of possible variations for the flag.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PostFeatureFlagRequest postFeatureFlagRequest = (PostFeatureFlagRequest) o;
    return Objects.equals(this.clientSideAvailability, postFeatureFlagRequest.clientSideAvailability) &&
        Objects.equals(this.defaults, postFeatureFlagRequest.defaults) &&
        Objects.equals(this.description, postFeatureFlagRequest.description) &&
        Objects.equals(this.includeInSnippet, postFeatureFlagRequest.includeInSnippet) &&
        Objects.equals(this.key, postFeatureFlagRequest.key) &&
        Objects.equals(this.name, postFeatureFlagRequest.name) &&
        Objects.equals(this.tags, postFeatureFlagRequest.tags) &&
        Objects.equals(this.temporary, postFeatureFlagRequest.temporary) &&
        Objects.equals(this.variations, postFeatureFlagRequest.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientSideAvailability, defaults, description, includeInSnippet, key, name, tags, temporary, variations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFeatureFlagRequest {\n");
    sb.append("    clientSideAvailability: ").append(toIndentedString(clientSideAvailability)).append("\n");
    sb.append("    defaults: ").append(toIndentedString(defaults)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    includeInSnippet: ").append(toIndentedString(includeInSnippet)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

