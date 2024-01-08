package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * ActorsMap
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ActorsMap {

  @Valid
  private List<String> group;

  @Valid
  private List<String> groupId;

  @Valid
  private List<String> user;

  public ActorsMap group(List<String> group) {
    this.group = group;
    return this;
  }

  public ActorsMap addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

  /**
   * The name of the group to add. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.
   * @return group
  */
  
  @Schema(name = "group", description = "The name of the group to add. This parameter cannot be used with the `groupId` parameter. As a group's name can change, use of `groupId` is recommended.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public List<String> getGroup() {
    return group;
  }

  public void setGroup(List<String> group) {
    this.group = group;
  }

  public ActorsMap groupId(List<String> groupId) {
    this.groupId = groupId;
    return this;
  }

  public ActorsMap addGroupIdItem(String groupIdItem) {
    if (this.groupId == null) {
      this.groupId = new ArrayList<>();
    }
    this.groupId.add(groupIdItem);
    return this;
  }

  /**
   * The ID of the group to add. This parameter cannot be used with the `group` parameter.
   * @return groupId
  */
  
  @Schema(name = "groupId", description = "The ID of the group to add. This parameter cannot be used with the `group` parameter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public List<String> getGroupId() {
    return groupId;
  }

  public void setGroupId(List<String> groupId) {
    this.groupId = groupId;
  }

  public ActorsMap user(List<String> user) {
    this.user = user;
    return this;
  }

  public ActorsMap addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<>();
    }
    this.user.add(userItem);
    return this;
  }

  /**
   * The user account ID of the user to add.
   * @return user
  */
  
  @Schema(name = "user", description = "The user account ID of the user to add.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public List<String> getUser() {
    return user;
  }

  public void setUser(List<String> user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActorsMap actorsMap = (ActorsMap) o;
    return Objects.equals(this.group, actorsMap.group) &&
        Objects.equals(this.groupId, actorsMap.groupId) &&
        Objects.equals(this.user, actorsMap.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, groupId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActorsMap {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

