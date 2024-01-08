package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnvironmentApprovalSettings;
import org.openapitools.model.Links;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Environment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Environment {

  private String id;

  private Links links;

  private String apiKey;

  private EnvironmentApprovalSettings approvalSettings;

  private String color;

  private Boolean confirmChanges;

  private Boolean defaultTrackEvents;

  private BigDecimal defaultTtl;

  private String key;

  private String mobileKey;

  private String name;

  private Boolean requireComments;

  private Boolean secureMode;

  @Valid
  private List<String> tags;

  public Environment id(String id) {
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

  public Environment links(Links links) {
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

  public Environment apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * The SDK key for backend LaunchDarkly SDKs.
   * @return apiKey
  */
  
  @Schema(name = "apiKey", example = "XXX", description = "The SDK key for backend LaunchDarkly SDKs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("apiKey")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public Environment approvalSettings(EnvironmentApprovalSettings approvalSettings) {
    this.approvalSettings = approvalSettings;
    return this;
  }

  /**
   * Get approvalSettings
   * @return approvalSettings
  */
  @Valid 
  @Schema(name = "approvalSettings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approvalSettings")
  public EnvironmentApprovalSettings getApprovalSettings() {
    return approvalSettings;
  }

  public void setApprovalSettings(EnvironmentApprovalSettings approvalSettings) {
    this.approvalSettings = approvalSettings;
  }

  public Environment color(String color) {
    this.color = color;
    return this;
  }

  /**
   * The swatch color for the environment.
   * @return color
  */
  
  @Schema(name = "color", example = "417505", description = "The swatch color for the environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Environment confirmChanges(Boolean confirmChanges) {
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

  public Environment defaultTrackEvents(Boolean defaultTrackEvents) {
    this.defaultTrackEvents = defaultTrackEvents;
    return this;
  }

  /**
   * Set to true to send detailed event information for new flags.
   * @return defaultTrackEvents
  */
  
  @Schema(name = "defaultTrackEvents", example = "false", description = "Set to true to send detailed event information for new flags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultTrackEvents")
  public Boolean getDefaultTrackEvents() {
    return defaultTrackEvents;
  }

  public void setDefaultTrackEvents(Boolean defaultTrackEvents) {
    this.defaultTrackEvents = defaultTrackEvents;
  }

  public Environment defaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
    return this;
  }

  /**
   * The default TTL.
   * @return defaultTtl
  */
  @Valid 
  @Schema(name = "defaultTtl", example = "0.0", description = "The default TTL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultTtl")
  public BigDecimal getDefaultTtl() {
    return defaultTtl;
  }

  public void setDefaultTtl(BigDecimal defaultTtl) {
    this.defaultTtl = defaultTtl;
  }

  public Environment key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key for the environment.
   * @return key
  */
  
  @Schema(name = "key", example = "production", description = "The key for the environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Environment mobileKey(String mobileKey) {
    this.mobileKey = mobileKey;
    return this;
  }

  /**
   * The SDK key for mobile LaunchDarkly SDKs.
   * @return mobileKey
  */
  
  @Schema(name = "mobileKey", example = "XXX", description = "The SDK key for mobile LaunchDarkly SDKs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mobileKey")
  public String getMobileKey() {
    return mobileKey;
  }

  public void setMobileKey(String mobileKey) {
    this.mobileKey = mobileKey;
  }

  public Environment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the environment.
   * @return name
  */
  
  @Schema(name = "name", example = "Production", description = "The name of the environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Environment requireComments(Boolean requireComments) {
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

  public Environment secureMode(Boolean secureMode) {
    this.secureMode = secureMode;
    return this;
  }

  /**
   * Determines if this environment is in safe mode.
   * @return secureMode
  */
  
  @Schema(name = "secureMode", example = "false", description = "Determines if this environment is in safe mode.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secureMode")
  public Boolean getSecureMode() {
    return secureMode;
  }

  public void setSecureMode(Boolean secureMode) {
    this.secureMode = secureMode;
  }

  public Environment tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Environment addTagsItem(String tagsItem) {
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
  
  @Schema(name = "tags", description = "An array of tags for this environment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Environment environment = (Environment) o;
    return Objects.equals(this.id, environment.id) &&
        Objects.equals(this.links, environment.links) &&
        Objects.equals(this.apiKey, environment.apiKey) &&
        Objects.equals(this.approvalSettings, environment.approvalSettings) &&
        Objects.equals(this.color, environment.color) &&
        Objects.equals(this.confirmChanges, environment.confirmChanges) &&
        Objects.equals(this.defaultTrackEvents, environment.defaultTrackEvents) &&
        Objects.equals(this.defaultTtl, environment.defaultTtl) &&
        Objects.equals(this.key, environment.key) &&
        Objects.equals(this.mobileKey, environment.mobileKey) &&
        Objects.equals(this.name, environment.name) &&
        Objects.equals(this.requireComments, environment.requireComments) &&
        Objects.equals(this.secureMode, environment.secureMode) &&
        Objects.equals(this.tags, environment.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, apiKey, approvalSettings, color, confirmChanges, defaultTrackEvents, defaultTtl, key, mobileKey, name, requireComments, secureMode, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Environment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    approvalSettings: ").append(toIndentedString(approvalSettings)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    confirmChanges: ").append(toIndentedString(confirmChanges)).append("\n");
    sb.append("    defaultTrackEvents: ").append(toIndentedString(defaultTrackEvents)).append("\n");
    sb.append("    defaultTtl: ").append(toIndentedString(defaultTtl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    mobileKey: ").append(toIndentedString(mobileKey)).append("\n");
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

