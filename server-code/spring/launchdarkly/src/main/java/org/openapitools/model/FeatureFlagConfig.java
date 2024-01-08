package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Fallthrough;
import org.openapitools.model.Prerequisite;
import org.openapitools.model.Rule;
import org.openapitools.model.Site;
import org.openapitools.model.Target;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FeatureFlagConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class FeatureFlagConfig {

  private String environmentName;

  private Site site;

  private Boolean archived;

  private Fallthrough fallthrough;

  private Long lastModified;

  private Integer offVariation;

  private Boolean true;

  @Valid
  private List<@Valid Prerequisite> prerequisites;

  @Valid
  private List<@Valid Rule> rules;

  private String salt;

  private String sel;

  @Valid
  private List<@Valid Target> targets;

  private Boolean trackEvents;

  private Boolean trackEventsFallthrough;

  private Integer version;

  public FeatureFlagConfig environmentName(String environmentName) {
    this.environmentName = environmentName;
    return this;
  }

  /**
   * Get environmentName
   * @return environmentName
  */
  
  @Schema(name = "_environmentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_environmentName")
  public String getEnvironmentName() {
    return environmentName;
  }

  public void setEnvironmentName(String environmentName) {
    this.environmentName = environmentName;
  }

  public FeatureFlagConfig site(Site site) {
    this.site = site;
    return this;
  }

  /**
   * Get site
   * @return site
  */
  @Valid 
  @Schema(name = "_site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_site")
  public Site getSite() {
    return site;
  }

  public void setSite(Site site) {
    this.site = site;
  }

  public FeatureFlagConfig archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Get archived
   * @return archived
  */
  
  @Schema(name = "archived", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public FeatureFlagConfig fallthrough(Fallthrough fallthrough) {
    this.fallthrough = fallthrough;
    return this;
  }

  /**
   * Get fallthrough
   * @return fallthrough
  */
  @Valid 
  @Schema(name = "fallthrough", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fallthrough")
  public Fallthrough getFallthrough() {
    return fallthrough;
  }

  public void setFallthrough(Fallthrough fallthrough) {
    this.fallthrough = fallthrough;
  }

  public FeatureFlagConfig lastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * Get lastModified
   * @return lastModified
  */
  
  @Schema(name = "lastModified", example = "1469326565348", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModified")
  public Long getLastModified() {
    return lastModified;
  }

  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }

  public FeatureFlagConfig offVariation(Integer offVariation) {
    this.offVariation = offVariation;
    return this;
  }

  /**
   * Get offVariation
   * @return offVariation
  */
  
  @Schema(name = "offVariation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offVariation")
  public Integer getOffVariation() {
    return offVariation;
  }

  public void setOffVariation(Integer offVariation) {
    this.offVariation = offVariation;
  }

  public FeatureFlagConfig true(Boolean true) {
    this.true = true;
    return this;
  }

  /**
   * Get true
   * @return true
  */
  
  @Schema(name = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("true")
  public Boolean getTrue() {
    return true;
  }

  public void setTrue(Boolean true) {
    this.true = true;
  }

  public FeatureFlagConfig prerequisites(List<@Valid Prerequisite> prerequisites) {
    this.prerequisites = prerequisites;
    return this;
  }

  public FeatureFlagConfig addPrerequisitesItem(Prerequisite prerequisitesItem) {
    if (this.prerequisites == null) {
      this.prerequisites = new ArrayList<>();
    }
    this.prerequisites.add(prerequisitesItem);
    return this;
  }

  /**
   * Get prerequisites
   * @return prerequisites
  */
  @Valid 
  @Schema(name = "prerequisites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prerequisites")
  public List<@Valid Prerequisite> getPrerequisites() {
    return prerequisites;
  }

  public void setPrerequisites(List<@Valid Prerequisite> prerequisites) {
    this.prerequisites = prerequisites;
  }

  public FeatureFlagConfig rules(List<@Valid Rule> rules) {
    this.rules = rules;
    return this;
  }

  public FeatureFlagConfig addRulesItem(Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * Get rules
   * @return rules
  */
  @Valid 
  @Schema(name = "rules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rules")
  public List<@Valid Rule> getRules() {
    return rules;
  }

  public void setRules(List<@Valid Rule> rules) {
    this.rules = rules;
  }

  public FeatureFlagConfig salt(String salt) {
    this.salt = salt;
    return this;
  }

  /**
   * Get salt
   * @return salt
  */
  
  @Schema(name = "salt", example = "YWx0ZXJuYXRlLnBhZ2U=", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salt")
  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }

  public FeatureFlagConfig sel(String sel) {
    this.sel = sel;
    return this;
  }

  /**
   * Get sel
   * @return sel
  */
  
  @Schema(name = "sel", example = "45501b9314dc4641841af774cb038b96", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sel")
  public String getSel() {
    return sel;
  }

  public void setSel(String sel) {
    this.sel = sel;
  }

  public FeatureFlagConfig targets(List<@Valid Target> targets) {
    this.targets = targets;
    return this;
  }

  public FeatureFlagConfig addTargetsItem(Target targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<>();
    }
    this.targets.add(targetsItem);
    return this;
  }

  /**
   * Get targets
   * @return targets
  */
  @Valid 
  @Schema(name = "targets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("targets")
  public List<@Valid Target> getTargets() {
    return targets;
  }

  public void setTargets(List<@Valid Target> targets) {
    this.targets = targets;
  }

  public FeatureFlagConfig trackEvents(Boolean trackEvents) {
    this.trackEvents = trackEvents;
    return this;
  }

  /**
   * Set to true to send detailed event information for this flag.
   * @return trackEvents
  */
  
  @Schema(name = "trackEvents", example = "false", description = "Set to true to send detailed event information for this flag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackEvents")
  public Boolean getTrackEvents() {
    return trackEvents;
  }

  public void setTrackEvents(Boolean trackEvents) {
    this.trackEvents = trackEvents;
  }

  public FeatureFlagConfig trackEventsFallthrough(Boolean trackEventsFallthrough) {
    this.trackEventsFallthrough = trackEventsFallthrough;
    return this;
  }

  /**
   * Set to true to send detailed event information when targeting is enabled but no individual targeting rule is matched.
   * @return trackEventsFallthrough
  */
  
  @Schema(name = "trackEventsFallthrough", example = "true", description = "Set to true to send detailed event information when targeting is enabled but no individual targeting rule is matched.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackEventsFallthrough")
  public Boolean getTrackEventsFallthrough() {
    return trackEventsFallthrough;
  }

  public void setTrackEventsFallthrough(Boolean trackEventsFallthrough) {
    this.trackEventsFallthrough = trackEventsFallthrough;
  }

  public FeatureFlagConfig version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", example = "65", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagConfig featureFlagConfig = (FeatureFlagConfig) o;
    return Objects.equals(this.environmentName, featureFlagConfig.environmentName) &&
        Objects.equals(this.site, featureFlagConfig.site) &&
        Objects.equals(this.archived, featureFlagConfig.archived) &&
        Objects.equals(this.fallthrough, featureFlagConfig.fallthrough) &&
        Objects.equals(this.lastModified, featureFlagConfig.lastModified) &&
        Objects.equals(this.offVariation, featureFlagConfig.offVariation) &&
        Objects.equals(this.true, featureFlagConfig.true) &&
        Objects.equals(this.prerequisites, featureFlagConfig.prerequisites) &&
        Objects.equals(this.rules, featureFlagConfig.rules) &&
        Objects.equals(this.salt, featureFlagConfig.salt) &&
        Objects.equals(this.sel, featureFlagConfig.sel) &&
        Objects.equals(this.targets, featureFlagConfig.targets) &&
        Objects.equals(this.trackEvents, featureFlagConfig.trackEvents) &&
        Objects.equals(this.trackEventsFallthrough, featureFlagConfig.trackEventsFallthrough) &&
        Objects.equals(this.version, featureFlagConfig.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environmentName, site, archived, fallthrough, lastModified, offVariation, true, prerequisites, rules, salt, sel, targets, trackEvents, trackEventsFallthrough, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagConfig {\n");
    sb.append("    environmentName: ").append(toIndentedString(environmentName)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    fallthrough: ").append(toIndentedString(fallthrough)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    offVariation: ").append(toIndentedString(offVariation)).append("\n");
    sb.append("    true: ").append(toIndentedString(true)).append("\n");
    sb.append("    prerequisites: ").append(toIndentedString(prerequisites)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    salt: ").append(toIndentedString(salt)).append("\n");
    sb.append("    sel: ").append(toIndentedString(sel)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    trackEvents: ").append(toIndentedString(trackEvents)).append("\n");
    sb.append("    trackEventsFallthrough: ").append(toIndentedString(trackEventsFallthrough)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

