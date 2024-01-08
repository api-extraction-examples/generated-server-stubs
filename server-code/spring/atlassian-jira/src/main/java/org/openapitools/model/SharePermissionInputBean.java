package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SharePermissionInputBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SharePermissionInputBean {

  private String accountId;

  private String groupId;

  private String groupname;

  private String projectId;

  private String projectRoleId;

  private Integer rights;

  /**
   * The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   */
  public enum TypeEnum {
    USER("user"),
    
    PROJECT("project"),
    
    GROUP("group"),
    
    PROJECTROLE("projectRole"),
    
    GLOBAL("global"),
    
    AUTHENTICATED("authenticated");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public SharePermissionInputBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SharePermissionInputBean(TypeEnum type) {
    this.type = type;
  }

  public SharePermissionInputBean accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.
   * @return accountId
  */
  
  @Schema(name = "accountId", description = "The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("accountId")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public SharePermissionInputBean groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.
   * @return groupId
  */
  
  @Schema(name = "groupId", description = "The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public SharePermissionInputBean groupname(String groupname) {
    this.groupname = groupname;
    return this;
  }

  /**
   * The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.
   * @return groupname
  */
  
  @Schema(name = "groupname", description = "The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("groupname")
  public String getGroupname() {
    return groupname;
  }

  public void setGroupname(String groupname) {
    this.groupname = groupname;
  }

  public SharePermissionInputBean projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project to share the filter with. Set `type` to `project`.
   * @return projectId
  */
  
  @Schema(name = "projectId", description = "The ID of the project to share the filter with. Set `type` to `project`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public SharePermissionInputBean projectRoleId(String projectRoleId) {
    this.projectRoleId = projectRoleId;
    return this;
  }

  /**
   * The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.
   * @return projectRoleId
  */
  
  @Schema(name = "projectRoleId", description = "The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectRoleId")
  public String getProjectRoleId() {
    return projectRoleId;
  }

  public void setProjectRoleId(String projectRoleId) {
    this.projectRoleId = projectRoleId;
  }

  public SharePermissionInputBean rights(Integer rights) {
    this.rights = rights;
    return this;
  }

  /**
   * The rights for the share permission.
   * @return rights
  */
  
  @Schema(name = "rights", description = "The rights for the share permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rights")
  public Integer getRights() {
    return rights;
  }

  public void setRights(Integer rights) {
    this.rights = rights;
  }

  public SharePermissionInputBean type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharePermissionInputBean sharePermissionInputBean = (SharePermissionInputBean) o;
    return Objects.equals(this.accountId, sharePermissionInputBean.accountId) &&
        Objects.equals(this.groupId, sharePermissionInputBean.groupId) &&
        Objects.equals(this.groupname, sharePermissionInputBean.groupname) &&
        Objects.equals(this.projectId, sharePermissionInputBean.projectId) &&
        Objects.equals(this.projectRoleId, sharePermissionInputBean.projectRoleId) &&
        Objects.equals(this.rights, sharePermissionInputBean.rights) &&
        Objects.equals(this.type, sharePermissionInputBean.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, groupId, groupname, projectId, projectRoleId, rights, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharePermissionInputBean {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupname: ").append(toIndentedString(groupname)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectRoleId: ").append(toIndentedString(projectRoleId)).append("\n");
    sb.append("    rights: ").append(toIndentedString(rights)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

