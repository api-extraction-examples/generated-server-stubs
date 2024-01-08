package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlagListItem;
import org.openapitools.model.Links;
import org.openapitools.model.UserSegmentRule;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserSegment
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UserSegment {

  @Valid
  private List<@Valid FlagListItem> flags;

  private Links links;

  private Long creationDate;

  private String description;

  @Valid
  private List<String> excluded;

  @Valid
  private List<String> included;

  private String key;

  private String name;

  @Valid
  private List<@Valid UserSegmentRule> rules;

  @Valid
  private List<String> tags;

  private Boolean unbounded;

  private Integer version;

  public UserSegment() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserSegment(Long creationDate, String key, String name) {
    this.creationDate = creationDate;
    this.key = key;
    this.name = name;
  }

  public UserSegment flags(List<@Valid FlagListItem> flags) {
    this.flags = flags;
    return this;
  }

  public UserSegment addFlagsItem(FlagListItem flagsItem) {
    if (this.flags == null) {
      this.flags = new ArrayList<>();
    }
    this.flags.add(flagsItem);
    return this;
  }

  /**
   * Get flags
   * @return flags
  */
  @Valid 
  @Schema(name = "_flags", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_flags")
  public List<@Valid FlagListItem> getFlags() {
    return flags;
  }

  public void setFlags(List<@Valid FlagListItem> flags) {
    this.flags = flags;
  }

  public UserSegment links(Links links) {
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

  public UserSegment creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the creation time of this flag.
   * @return creationDate
  */
  @NotNull 
  @Schema(name = "creationDate", example = "1443652232590", description = "A unix epoch time in milliseconds specifying the creation time of this flag.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creationDate")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public UserSegment description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the user segment.
   * @return description
  */
  
  @Schema(name = "description", example = "Users in this segment can access beta features.", description = "Description of the user segment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserSegment excluded(List<String> excluded) {
    this.excluded = excluded;
    return this;
  }

  public UserSegment addExcludedItem(String excludedItem) {
    if (this.excluded == null) {
      this.excluded = new ArrayList<>();
    }
    this.excluded.add(excludedItem);
    return this;
  }

  /**
   * An array of user keys that should not be included in this segment, unless they are also listed in \"included\".
   * @return excluded
  */
  
  @Schema(name = "excluded", description = "An array of user keys that should not be included in this segment, unless they are also listed in \"included\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excluded")
  public List<String> getExcluded() {
    return excluded;
  }

  public void setExcluded(List<String> excluded) {
    this.excluded = excluded;
  }

  public UserSegment included(List<String> included) {
    this.included = included;
    return this;
  }

  public UserSegment addIncludedItem(String includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    return this;
  }

  /**
   * An array of user keys that are included in this segment.
   * @return included
  */
  
  @Schema(name = "included", description = "An array of user keys that are included in this segment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("included")
  public List<String> getIncluded() {
    return included;
  }

  public void setIncluded(List<String> included) {
    this.included = included;
  }

  public UserSegment key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Unique identifier for the user segment.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "beta-testers", description = "Unique identifier for the user segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserSegment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the user segment.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Beta Testers", description = "Name of the user segment.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserSegment rules(List<@Valid UserSegmentRule> rules) {
    this.rules = rules;
    return this;
  }

  public UserSegment addRulesItem(UserSegmentRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

  /**
   * An array of rules that can cause a user to be included in this segment.
   * @return rules
  */
  @Valid 
  @Schema(name = "rules", description = "An array of rules that can cause a user to be included in this segment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rules")
  public List<@Valid UserSegmentRule> getRules() {
    return rules;
  }

  public void setRules(List<@Valid UserSegmentRule> rules) {
    this.rules = rules;
  }

  public UserSegment tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public UserSegment addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * An array of tags for this user segment.
   * @return tags
  */
  
  @Schema(name = "tags", example = "[dev, ops]", description = "An array of tags for this user segment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public UserSegment unbounded(Boolean unbounded) {
    this.unbounded = unbounded;
    return this;
  }

  /**
   * Controls whether this is considered a \"big segment\" which can support an unlimited numbers of users. Include/exclude lists sent with this payload are not used in big segments. Contact your account manager for early access to this feature.
   * @return unbounded
  */
  
  @Schema(name = "unbounded", example = "false", description = "Controls whether this is considered a \"big segment\" which can support an unlimited numbers of users. Include/exclude lists sent with this payload are not used in big segments. Contact your account manager for early access to this feature.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unbounded")
  public Boolean getUnbounded() {
    return unbounded;
  }

  public void setUnbounded(Boolean unbounded) {
    this.unbounded = unbounded;
  }

  public UserSegment version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    UserSegment userSegment = (UserSegment) o;
    return Objects.equals(this.flags, userSegment.flags) &&
        Objects.equals(this.links, userSegment.links) &&
        Objects.equals(this.creationDate, userSegment.creationDate) &&
        Objects.equals(this.description, userSegment.description) &&
        Objects.equals(this.excluded, userSegment.excluded) &&
        Objects.equals(this.included, userSegment.included) &&
        Objects.equals(this.key, userSegment.key) &&
        Objects.equals(this.name, userSegment.name) &&
        Objects.equals(this.rules, userSegment.rules) &&
        Objects.equals(this.tags, userSegment.tags) &&
        Objects.equals(this.unbounded, userSegment.unbounded) &&
        Objects.equals(this.version, userSegment.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flags, links, creationDate, description, excluded, included, key, name, rules, tags, unbounded, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSegment {\n");
    sb.append("    flags: ").append(toIndentedString(flags)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    excluded: ").append(toIndentedString(excluded)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    unbounded: ").append(toIndentedString(unbounded)).append("\n");
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

