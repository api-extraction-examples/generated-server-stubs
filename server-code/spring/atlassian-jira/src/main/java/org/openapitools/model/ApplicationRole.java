package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.model.GroupName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an application role.
 */

@Schema(name = "ApplicationRole", description = "Details of an application role.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ApplicationRole {

  @Valid
  private Set<String> defaultGroups;

  @Valid
  private List<@Valid GroupName> defaultGroupsDetails;

  private Boolean defined;

  @Valid
  private List<@Valid GroupName> groupDetails;

  @Valid
  private Set<String> groups;

  private Boolean hasUnlimitedSeats;

  private String key;

  private String name;

  private Integer numberOfSeats;

  private Boolean platform;

  private Integer remainingSeats;

  private Boolean selectedByDefault;

  private Integer userCount;

  private String userCountDescription;

  public ApplicationRole defaultGroups(Set<String> defaultGroups) {
    this.defaultGroups = defaultGroups;
    return this;
  }

  public ApplicationRole addDefaultGroupsItem(String defaultGroupsItem) {
    if (this.defaultGroups == null) {
      this.defaultGroups = new LinkedHashSet<>();
    }
    this.defaultGroups.add(defaultGroupsItem);
    return this;
  }

  /**
   * The groups that are granted default access for this application role. As a group's name can change, use of `defaultGroupsDetails` is recommended to identify a groups.
   * @return defaultGroups
  */
  
  @Schema(name = "defaultGroups", description = "The groups that are granted default access for this application role. As a group's name can change, use of `defaultGroupsDetails` is recommended to identify a groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultGroups")
  public Set<String> getDefaultGroups() {
    return defaultGroups;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setDefaultGroups(Set<String> defaultGroups) {
    this.defaultGroups = defaultGroups;
  }

  public ApplicationRole defaultGroupsDetails(List<@Valid GroupName> defaultGroupsDetails) {
    this.defaultGroupsDetails = defaultGroupsDetails;
    return this;
  }

  public ApplicationRole addDefaultGroupsDetailsItem(GroupName defaultGroupsDetailsItem) {
    if (this.defaultGroupsDetails == null) {
      this.defaultGroupsDetails = new ArrayList<>();
    }
    this.defaultGroupsDetails.add(defaultGroupsDetailsItem);
    return this;
  }

  /**
   * The groups that are granted default access for this application role.
   * @return defaultGroupsDetails
  */
  @Valid 
  @Schema(name = "defaultGroupsDetails", description = "The groups that are granted default access for this application role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultGroupsDetails")
  public List<@Valid GroupName> getDefaultGroupsDetails() {
    return defaultGroupsDetails;
  }

  public void setDefaultGroupsDetails(List<@Valid GroupName> defaultGroupsDetails) {
    this.defaultGroupsDetails = defaultGroupsDetails;
  }

  public ApplicationRole defined(Boolean defined) {
    this.defined = defined;
    return this;
  }

  /**
   * Deprecated.
   * @return defined
  */
  
  @Schema(name = "defined", description = "Deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defined")
  public Boolean getDefined() {
    return defined;
  }

  public void setDefined(Boolean defined) {
    this.defined = defined;
  }

  public ApplicationRole groupDetails(List<@Valid GroupName> groupDetails) {
    this.groupDetails = groupDetails;
    return this;
  }

  public ApplicationRole addGroupDetailsItem(GroupName groupDetailsItem) {
    if (this.groupDetails == null) {
      this.groupDetails = new ArrayList<>();
    }
    this.groupDetails.add(groupDetailsItem);
    return this;
  }

  /**
   * The groups associated with the application role.
   * @return groupDetails
  */
  @Valid 
  @Schema(name = "groupDetails", description = "The groups associated with the application role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupDetails")
  public List<@Valid GroupName> getGroupDetails() {
    return groupDetails;
  }

  public void setGroupDetails(List<@Valid GroupName> groupDetails) {
    this.groupDetails = groupDetails;
  }

  public ApplicationRole groups(Set<String> groups) {
    this.groups = groups;
    return this;
  }

  public ApplicationRole addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * The groups associated with the application role. As a group's name can change, use of `groupDetails` is recommended to identify a groups.
   * @return groups
  */
  
  @Schema(name = "groups", description = "The groups associated with the application role. As a group's name can change, use of `groupDetails` is recommended to identify a groups.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public Set<String> getGroups() {
    return groups;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setGroups(Set<String> groups) {
    this.groups = groups;
  }

  public ApplicationRole hasUnlimitedSeats(Boolean hasUnlimitedSeats) {
    this.hasUnlimitedSeats = hasUnlimitedSeats;
    return this;
  }

  /**
   * Get hasUnlimitedSeats
   * @return hasUnlimitedSeats
  */
  
  @Schema(name = "hasUnlimitedSeats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasUnlimitedSeats")
  public Boolean getHasUnlimitedSeats() {
    return hasUnlimitedSeats;
  }

  public void setHasUnlimitedSeats(Boolean hasUnlimitedSeats) {
    this.hasUnlimitedSeats = hasUnlimitedSeats;
  }

  public ApplicationRole key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the application role.
   * @return key
  */
  
  @Schema(name = "key", description = "The key of the application role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApplicationRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the application role.
   * @return name
  */
  
  @Schema(name = "name", description = "The display name of the application role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationRole numberOfSeats(Integer numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
    return this;
  }

  /**
   * The maximum count of users on your license.
   * @return numberOfSeats
  */
  
  @Schema(name = "numberOfSeats", description = "The maximum count of users on your license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberOfSeats")
  public Integer getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(Integer numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public ApplicationRole platform(Boolean platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Indicates if the application role belongs to Jira platform (`jira-core`).
   * @return platform
  */
  
  @Schema(name = "platform", description = "Indicates if the application role belongs to Jira platform (`jira-core`).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public Boolean getPlatform() {
    return platform;
  }

  public void setPlatform(Boolean platform) {
    this.platform = platform;
  }

  public ApplicationRole remainingSeats(Integer remainingSeats) {
    this.remainingSeats = remainingSeats;
    return this;
  }

  /**
   * The count of users remaining on your license.
   * @return remainingSeats
  */
  
  @Schema(name = "remainingSeats", description = "The count of users remaining on your license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("remainingSeats")
  public Integer getRemainingSeats() {
    return remainingSeats;
  }

  public void setRemainingSeats(Integer remainingSeats) {
    this.remainingSeats = remainingSeats;
  }

  public ApplicationRole selectedByDefault(Boolean selectedByDefault) {
    this.selectedByDefault = selectedByDefault;
    return this;
  }

  /**
   * Determines whether this application role should be selected by default on user creation.
   * @return selectedByDefault
  */
  
  @Schema(name = "selectedByDefault", description = "Determines whether this application role should be selected by default on user creation.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selectedByDefault")
  public Boolean getSelectedByDefault() {
    return selectedByDefault;
  }

  public void setSelectedByDefault(Boolean selectedByDefault) {
    this.selectedByDefault = selectedByDefault;
  }

  public ApplicationRole userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * The number of users counting against your license.
   * @return userCount
  */
  
  @Schema(name = "userCount", description = "The number of users counting against your license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userCount")
  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public ApplicationRole userCountDescription(String userCountDescription) {
    this.userCountDescription = userCountDescription;
    return this;
  }

  /**
   * The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.
   * @return userCountDescription
  */
  
  @Schema(name = "userCountDescription", description = "The [type of users](https://confluence.atlassian.com/x/lRW3Ng) being counted against your license.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("userCountDescription")
  public String getUserCountDescription() {
    return userCountDescription;
  }

  public void setUserCountDescription(String userCountDescription) {
    this.userCountDescription = userCountDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationRole applicationRole = (ApplicationRole) o;
    return Objects.equals(this.defaultGroups, applicationRole.defaultGroups) &&
        Objects.equals(this.defaultGroupsDetails, applicationRole.defaultGroupsDetails) &&
        Objects.equals(this.defined, applicationRole.defined) &&
        Objects.equals(this.groupDetails, applicationRole.groupDetails) &&
        Objects.equals(this.groups, applicationRole.groups) &&
        Objects.equals(this.hasUnlimitedSeats, applicationRole.hasUnlimitedSeats) &&
        Objects.equals(this.key, applicationRole.key) &&
        Objects.equals(this.name, applicationRole.name) &&
        Objects.equals(this.numberOfSeats, applicationRole.numberOfSeats) &&
        Objects.equals(this.platform, applicationRole.platform) &&
        Objects.equals(this.remainingSeats, applicationRole.remainingSeats) &&
        Objects.equals(this.selectedByDefault, applicationRole.selectedByDefault) &&
        Objects.equals(this.userCount, applicationRole.userCount) &&
        Objects.equals(this.userCountDescription, applicationRole.userCountDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultGroups, defaultGroupsDetails, defined, groupDetails, groups, hasUnlimitedSeats, key, name, numberOfSeats, platform, remainingSeats, selectedByDefault, userCount, userCountDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationRole {\n");
    sb.append("    defaultGroups: ").append(toIndentedString(defaultGroups)).append("\n");
    sb.append("    defaultGroupsDetails: ").append(toIndentedString(defaultGroupsDetails)).append("\n");
    sb.append("    defined: ").append(toIndentedString(defined)).append("\n");
    sb.append("    groupDetails: ").append(toIndentedString(groupDetails)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    hasUnlimitedSeats: ").append(toIndentedString(hasUnlimitedSeats)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberOfSeats: ").append(toIndentedString(numberOfSeats)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    remainingSeats: ").append(toIndentedString(remainingSeats)).append("\n");
    sb.append("    selectedByDefault: ").append(toIndentedString(selectedByDefault)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
    sb.append("    userCountDescription: ").append(toIndentedString(userCountDescription)).append("\n");
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

