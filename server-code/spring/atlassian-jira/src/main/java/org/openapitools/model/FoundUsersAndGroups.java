package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.FoundGroups;
import org.openapitools.model.FoundUsers;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of users and groups found in a search.
 */

@Schema(name = "FoundUsersAndGroups", description = "List of users and groups found in a search.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FoundUsersAndGroups {

  private FoundGroups groups;

  private FoundUsers users;

  public FoundUsersAndGroups groups(FoundGroups groups) {
    this.groups = groups;
    return this;
  }

  /**
   * Get groups
   * @return groups
  */
  @Valid 
  @Schema(name = "groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public FoundGroups getGroups() {
    return groups;
  }

  public void setGroups(FoundGroups groups) {
    this.groups = groups;
  }

  public FoundUsersAndGroups users(FoundUsers users) {
    this.users = users;
    return this;
  }

  /**
   * Get users
   * @return users
  */
  @Valid 
  @Schema(name = "users", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("users")
  public FoundUsers getUsers() {
    return users;
  }

  public void setUsers(FoundUsers users) {
    this.users = users;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FoundUsersAndGroups foundUsersAndGroups = (FoundUsersAndGroups) o;
    return Objects.equals(this.groups, foundUsersAndGroups.groups) &&
        Objects.equals(this.users, foundUsersAndGroups.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groups, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FoundUsersAndGroups {\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

