package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GroupName;
import org.openapitools.model.RestrictedPermission;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the group membership or permissions needed to receive the notification.
 */

@Schema(name = "NotificationRecipientsRestrictions", description = "Details of the group membership or permissions needed to receive the notification.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NotificationRecipientsRestrictions {

  @Valid
  private List<String> groupIds;

  @Valid
  private List<@Valid GroupName> groups;

  @Valid
  private List<@Valid RestrictedPermission> permissions;

  public NotificationRecipientsRestrictions groupIds(List<String> groupIds) {
    this.groupIds = groupIds;
    return this;
  }

  public NotificationRecipientsRestrictions addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

  /**
   * List of groupId memberships required to receive the notification.
   * @return groupIds
  */
  
  @Schema(name = "groupIds", description = "List of groupId memberships required to receive the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupIds")
  public List<String> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<String> groupIds) {
    this.groupIds = groupIds;
  }

  public NotificationRecipientsRestrictions groups(List<@Valid GroupName> groups) {
    this.groups = groups;
    return this;
  }

  public NotificationRecipientsRestrictions addGroupsItem(GroupName groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * List of group memberships required to receive the notification.
   * @return groups
  */
  @Valid 
  @Schema(name = "groups", description = "List of group memberships required to receive the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public List<@Valid GroupName> getGroups() {
    return groups;
  }

  public void setGroups(List<@Valid GroupName> groups) {
    this.groups = groups;
  }

  public NotificationRecipientsRestrictions permissions(List<@Valid RestrictedPermission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public NotificationRecipientsRestrictions addPermissionsItem(RestrictedPermission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * List of permissions required to receive the notification.
   * @return permissions
  */
  @Valid 
  @Schema(name = "permissions", description = "List of permissions required to receive the notification.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<@Valid RestrictedPermission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<@Valid RestrictedPermission> permissions) {
    this.permissions = permissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRecipientsRestrictions notificationRecipientsRestrictions = (NotificationRecipientsRestrictions) o;
    return Objects.equals(this.groupIds, notificationRecipientsRestrictions.groupIds) &&
        Objects.equals(this.groups, notificationRecipientsRestrictions.groups) &&
        Objects.equals(this.permissions, notificationRecipientsRestrictions.permissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupIds, groups, permissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRecipientsRestrictions {\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

