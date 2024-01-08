package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
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
 * EnvironmentPost
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class EnvironmentPost {

  private String color;

  private Boolean confirmChanges;

  private Boolean defaultTrackEvents;

  private BigDecimal defaultTtl;

  private String key;

  private String name;

  private Boolean requireComments;

  private Boolean secureMode;

  @Valid
  private List<String> tags;

  public EnvironmentPost() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EnvironmentPost(String color, String key, String name) {
    this.color = color;
    this.key = key;
    this.name = name;
  }

  public EnvironmentPost color(String color) {
    this.color = color;
    return this;
  }

  /**
   * A color swatch (as an RGB hex value with no leading '#', e.g. C8C8C8).
   * @return color
  */
  @NotNull 
  @Schema(name = "color", example = "417505", description = "A color swatch (as an RGB hex value with no leading '#', e.g. C8C8C8).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public EnvironmentPost confirmChanges(Boolean confirmChanges) {
    this.confirmChanges = confirmChanges;
    return this;
  }

  /**
   * Determines if this environment requires confirmation for flag and segment changes.
   * @return confirmChanges
  */
  
  @Schema(name = "confirmChanges", example = "false", description = "Determines if this environment requires confirmation for flag and segment changes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("confirmChanges")
  public Boolean getConfirmChanges() {
    return confirmChanges;
  }

  public void setConfirmChanges(Boolean confirmChanges) {
    this.confirmChanges = confirmChanges;
  }

  public EnvironmentPost defaultTrackEvents(Boolean defaultTrackEvents) {
    this.defaultTrackEvents = defaultTrackEvents;
    return this;
  }

  /**
   * Set to true to send detailed event information for newly created flags.
   * @return defaultTrackEvents
  */
  
  @Schema(name = "defaultTrackEvents", example = "false", description = "Set to true to send detailed event information for newly created flags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultTrackEvents")
  public Boolean getDefaultTrackEvents() {
    return defaultTrackEvents;
  }

  public void setDefaultTrackEvents(Boolean defaultTrackEvents) {
    this.defaultTrackEvents = defaultTrackEvents;
  }

  public EnvironmentPost defaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
    return this;
  }

  /**
   * The default TTL for the new environment.
   * @return defaultTtl
  */
  @Valid 
  @Schema(name = "defaultTtl", example = "0.0", description = "The default TTL for the new environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultTtl")
  public BigDecimal getDefaultTtl() {
    return defaultTtl;
  }

  public void setDefaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
  }

  public EnvironmentPost key(String key) {
    this.key = key;
    return this;
  }

  /**
   * A project-unique key for the new environment.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "dev", description = "A project-unique key for the new environment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public EnvironmentPost name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the new environment.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Development", description = "The name of the new environment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnvironmentPost requireComments(Boolean requireComments) {
    this.requireComments = requireComments;
    return this;
  }

  /**
   * Determines if this environment requires comments for flag and segment changes.
   * @return requireComments
  */
  
  @Schema(name = "requireComments", example = "false", description = "Determines if this environment requires comments for flag and segment changes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requireComments")
  public Boolean getRequireComments() {
    return requireComments;
  }

  public void setRequireComments(Boolean requireComments) {
    this.requireComments = requireComments;
  }

  public EnvironmentPost secureMode(Boolean secureMode) {
    this.secureMode = secureMode;
    return this;
  }

  /**
   * Determines whether the environment is in secure mode.
   * @return secureMode
  */
  
  @Schema(name = "secureMode", example = "false", description = "Determines whether the environment is in secure mode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secureMode")
  public Boolean getSecureMode() {
    return secureMode;
  }

  public void setSecureMode(Boolean secureMode) {
    this.secureMode = secureMode;
  }

  public EnvironmentPost tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public EnvironmentPost addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * An array of tags for this environment.
   * @return tags
  */
  
  @Schema(name = "tags", example = "[tag1, tag2]", description = "An array of tags for this environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    EnvironmentPost environmentPost = (EnvironmentPost) o;
    return Objects.equals(this.color, environmentPost.color) &&
        Objects.equals(this.confirmChanges, environmentPost.confirmChanges) &&
        Objects.equals(this.defaultTrackEvents, environmentPost.defaultTrackEvents) &&
        Objects.equals(this.defaultTtl, environmentPost.defaultTtl) &&
        Objects.equals(this.key, environmentPost.key) &&
        Objects.equals(this.name, environmentPost.name) &&
        Objects.equals(this.requireComments, environmentPost.requireComments) &&
        Objects.equals(this.secureMode, environmentPost.secureMode) &&
        Objects.equals(this.tags, environmentPost.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, confirmChanges, defaultTrackEvents, defaultTtl, key, name, requireComments, secureMode, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvironmentPost {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    confirmChanges: ").append(toIndentedString(confirmChanges)).append("\n");
    sb.append("    defaultTrackEvents: ").append(toIndentedString(defaultTrackEvents)).append("\n");
    sb.append("    defaultTtl: ").append(toIndentedString(defaultTtl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    requireComments: ").append(toIndentedString(requireComments)).append("\n");
    sb.append("    secureMode: ").append(toIndentedString(secureMode)).append("\n");
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

