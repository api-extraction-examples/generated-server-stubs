package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Filter for a User Picker (single) custom field.
 */

@Schema(name = "UserFilter", description = "Filter for a User Picker (single) custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UserFilter {

  private Boolean enabled;

  @Valid
  private Set<String> groups;

  @Valid
  private Set<Long> roleIds;

  public UserFilter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UserFilter(Boolean enabled) {
    this.enabled = enabled;
  }

  public UserFilter enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the filter is enabled.
   * @return enabled
  */
  @NotNull 
  @Schema(name = "enabled", description = "Whether the filter is enabled.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public UserFilter groups(Set<String> groups) {
    this.groups = groups;
    return this;
  }

  public UserFilter addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new LinkedHashSet<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * User groups autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 groups can be provided.
   * @return groups
  */
  
  @Schema(name = "groups", description = "User groups autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 groups can be provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groups")
  public Set<String> getGroups() {
    return groups;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setGroups(Set<String> groups) {
    this.groups = groups;
  }

  public UserFilter roleIds(Set<Long> roleIds) {
    this.roleIds = roleIds;
    return this;
  }

  public UserFilter addRoleIdsItem(Long roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new LinkedHashSet<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

  /**
   * Roles that autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 roles can be provided.
   * @return roleIds
  */
  
  @Schema(name = "roleIds", description = "Roles that autocomplete suggestion users must belong to. If not provided, the default values are used. A maximum of 10 roles can be provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("roleIds")
  public Set<Long> getRoleIds() {
    return roleIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setRoleIds(Set<Long> roleIds) {
    this.roleIds = roleIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFilter userFilter = (UserFilter) o;
    return Objects.equals(this.enabled, userFilter.enabled) &&
        Objects.equals(this.groups, userFilter.groups) &&
        Objects.equals(this.roleIds, userFilter.roleIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, groups, roleIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFilter {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
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

