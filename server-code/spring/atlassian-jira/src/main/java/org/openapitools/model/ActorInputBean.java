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
 * ActorInputBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ActorInputBean {

  @Valid
  private List<String> group;

  @Valid
  private List<String> groupId;

  @Valid
  private List<String> user;

  public ActorInputBean group(List<String> group) {
    this.group = group;
    return this;
  }

  public ActorInputBean addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

  /**
   * The name of the group to add as a default actor. This parameter cannot be used with the `groupId` parameter. As a group's name can change,use of `groupId` is recommended. This parameter accepts a comma-separated list. For example, `\"group\":[\"project-admin\", \"jira-developers\"]`.
   * @return group
  */
  
  @Schema(name = "group", description = "The name of the group to add as a default actor. This parameter cannot be used with the `groupId` parameter. As a group's name can change,use of `groupId` is recommended. This parameter accepts a comma-separated list. For example, `\"group\":[\"project-admin\", \"jira-developers\"]`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group")
  public List<String> getGroup() {
    return group;
  }

  public void setGroup(List<String> group) {
    this.group = group;
  }

  public ActorInputBean groupId(List<String> groupId) {
    this.groupId = groupId;
    return this;
  }

  public ActorInputBean addGroupIdItem(String groupIdItem) {
    if (this.groupId == null) {
      this.groupId = new ArrayList<>();
    }
    this.groupId.add(groupIdItem);
    return this;
  }

  /**
   * The ID of the group to add as a default actor. This parameter cannot be used with the `group` parameter This parameter accepts a comma-separated list. For example, `\"groupId\":[\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\", \"0c011f85-69ed-49c4-a801-3b18d0f771bc\"]`.
   * @return groupId
  */
  
  @Schema(name = "groupId", description = "The ID of the group to add as a default actor. This parameter cannot be used with the `group` parameter This parameter accepts a comma-separated list. For example, `\"groupId\":[\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\", \"0c011f85-69ed-49c4-a801-3b18d0f771bc\"]`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public List<String> getGroupId() {
    return groupId;
  }

  public void setGroupId(List<String> groupId) {
    this.groupId = groupId;
  }

  public ActorInputBean user(List<String> user) {
    this.user = user;
    return this;
  }

  public ActorInputBean addUserItem(String userItem) {
    if (this.user == null) {
      this.user = new ArrayList<>();
    }
    this.user.add(userItem);
    return this;
  }

  /**
   * The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, `\"user\":[\"5b10a2844c20165700ede21g\", \"5b109f2e9729b51b54dc274d\"]`.
   * @return user
  */
  
  @Schema(name = "user", description = "The account IDs of the users to add as default actors. This parameter accepts a comma-separated list. For example, `\"user\":[\"5b10a2844c20165700ede21g\", \"5b109f2e9729b51b54dc274d\"]`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ActorInputBean actorInputBean = (ActorInputBean) o;
    return Objects.equals(this.group, actorInputBean.group) &&
        Objects.equals(this.groupId, actorInputBean.groupId) &&
        Objects.equals(this.user, actorInputBean.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, groupId, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActorInputBean {\n");
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

