package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GroupName;
import org.openapitools.model.UserDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of the users and groups to receive the notification.
 */

@Schema(name = "NotificationRecipients", description = "Details of the users and groups to receive the notification.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NotificationRecipients {

  private Boolean assignee;

  @Valid
  private List<String> groupIds;

  @Valid
  private List<@Valid GroupName> groups;

  private Boolean reporter;

  @Valid
  private List<@Valid UserDetails> users;

  private Boolean voters;

  private Boolean watchers;

  public NotificationRecipients assignee(Boolean assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Whether the notification should be sent to the issue's assignees.
   * @return assignee
  */
  
  @Schema(name = "assignee", description = "Whether the notification should be sent to the issue's assignees.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee")
  public Boolean getAssignee() {
    return assignee;
  }

  public void setAssignee(Boolean assignee) {
    this.assignee = assignee;
  }

  public NotificationRecipients groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public NotificationRecipients addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

  /**
   * List of groupIds to receive the notification.
   * @return groupIds
  */
  
  @Schema(name = "groupIds", description = "List of groupIds to receive the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupIds")
  public List<String> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }

  public NotificationRecipients groups(List<@Valid GroupName> groups) {
    this.groups = groups;
    return this;
  }

  public NotificationRecipients addGroupsItem(GroupName groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * List of groups to receive the notification.
   * @return groups
  */
  @Valid 
  @Schema(name = "groups", description = "List of groups to receive the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public List<@Valid GroupName> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid GroupName> groups) {
    this.groups = groups;
  }

  public NotificationRecipients reporter(Boolean reporter) {
    this.reporter = reporter;
    return this;
  }

  /**
   * Whether the notification should be sent to the issue's reporter.
   * @return reporter
  */
  
  @Schema(name = "reporter", description = "Whether the notification should be sent to the issue's reporter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reporter")
  public Boolean getReporter() {
    return reporter;
  }

  public void setReporter(Boolean reporter) {
    this.reporter = reporter;
  }

  public NotificationRecipients users(List<@Valid UserDetails> users) {
    this.users = users;
    return this;
  }

  public NotificationRecipients addUsersItem(UserDetails usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

  /**
   * List of users to receive the notification.
   * @return users
  */
  @Valid 
  @Schema(name = "users", description = "List of users to receive the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public List<@Valid UserDetails> getUsers() {
    return users;
  }

  public void setUsers(List<@Valid UserDetails> users) {
    this.users = users;
  }

  public NotificationRecipients voters(Boolean voters) {
    this.voters = voters;
    return this;
  }

  /**
   * Whether the notification should be sent to the issue's voters.
   * @return voters
  */
  
  @Schema(name = "voters", description = "Whether the notification should be sent to the issue's voters.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("voters")
  public Boolean getVoters() {
    return voters;
  }

  public void setVoters(Boolean voters) {
    this.voters = voters;
  }

  public NotificationRecipients watchers(Boolean watchers) {
    this.watchers = watchers;
    return this;
  }

  /**
   * Whether the notification should be sent to the issue's watchers.
   * @return watchers
  */
  
  @Schema(name = "watchers", description = "Whether the notification should be sent to the issue's watchers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("watchers")
  public Boolean getWatchers() {
    return watchers;
  }

  public void setWatchers(Boolean watchers) {
    this.watchers = watchers;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public NotificationRecipients putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRecipients notificationRecipients = (NotificationRecipients) o;
    return Objects.equals(this.assignee, notificationRecipients.assignee) &&
        Objects.equals(this.groupIds, notificationRecipients.groupIds) &&
        Objects.equals(this.groups, notificationRecipients.groups) &&
        Objects.equals(this.reporter, notificationRecipients.reporter) &&
        Objects.equals(this.users, notificationRecipients.users) &&
        Objects.equals(this.voters, notificationRecipients.voters) &&
        Objects.equals(this.watchers, notificationRecipients.watchers) &&
    Objects.equals(this.additionalProperties, notificationRecipients.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, groupIds, groups, reporter, users, voters, watchers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRecipients {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

