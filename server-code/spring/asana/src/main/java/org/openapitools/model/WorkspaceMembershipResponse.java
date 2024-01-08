package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserCompact;
import org.openapitools.model.UserTaskListCompact;
import org.openapitools.model.WorkspaceCompact;
import org.openapitools.model.WorkspaceMembershipResponseAllOfVacationDates;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WorkspaceMembershipResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class WorkspaceMembershipResponse {

  private String gid;

  private String resourceType;

  private UserCompact user;

  private WorkspaceCompact workspace;

  private Boolean isActive;

  private Boolean isAdmin;

  private Boolean isGuest;

  private UserTaskListCompact userTaskList;

  private JsonNullable<WorkspaceMembershipResponseAllOfVacationDates> vacationDates = JsonNullable.<WorkspaceMembershipResponseAllOfVacationDates>undefined();

  public WorkspaceMembershipResponse gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public WorkspaceMembershipResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public WorkspaceMembershipResponse user(UserCompact user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public UserCompact getUser() {
    return user;
  }

  public void setUser(UserCompact user) {
    this.user = user;
  }

  public WorkspaceMembershipResponse workspace(WorkspaceCompact workspace) {
    this.workspace = workspace;
    return this;
  }

  /**
   * Get workspace
   * @return workspace
  */
  @Valid 
  @Schema(name = "workspace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("workspace")
  public WorkspaceCompact getWorkspace() {
    return workspace;
  }

  public void setWorkspace(WorkspaceCompact workspace) {
    this.workspace = workspace;
  }

  public WorkspaceMembershipResponse isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Reflects if this user still a member of the workspace.
   * @return isActive
  */
  
  @Schema(name = "is_active", accessMode = Schema.AccessMode.READ_ONLY, description = "Reflects if this user still a member of the workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_active")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public WorkspaceMembershipResponse isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * Reflects if this user is an admin of the workspace.
   * @return isAdmin
  */
  
  @Schema(name = "is_admin", accessMode = Schema.AccessMode.READ_ONLY, description = "Reflects if this user is an admin of the workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_admin")
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public WorkspaceMembershipResponse isGuest(Boolean isGuest) {
    this.isGuest = isGuest;
    return this;
  }

  /**
   * Reflects if this user is a guest of the workspace.
   * @return isGuest
  */
  
  @Schema(name = "is_guest", accessMode = Schema.AccessMode.READ_ONLY, description = "Reflects if this user is a guest of the workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_guest")
  public Boolean getIsGuest() {
    return isGuest;
  }

  public void setIsGuest(Boolean isGuest) {
    this.isGuest = isGuest;
  }

  public WorkspaceMembershipResponse userTaskList(UserTaskListCompact userTaskList) {
    this.userTaskList = userTaskList;
    return this;
  }

  /**
   * Get userTaskList
   * @return userTaskList
  */
  @Valid 
  @Schema(name = "user_task_list", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_task_list")
  public UserTaskListCompact getUserTaskList() {
    return userTaskList;
  }

  public void setUserTaskList(UserTaskListCompact userTaskList) {
    this.userTaskList = userTaskList;
  }

  public WorkspaceMembershipResponse vacationDates(WorkspaceMembershipResponseAllOfVacationDates vacationDates) {
    this.vacationDates = JsonNullable.of(vacationDates);
    return this;
  }

  /**
   * Get vacationDates
   * @return vacationDates
  */
  @Valid 
  @Schema(name = "vacation_dates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vacation_dates")
  public JsonNullable<WorkspaceMembershipResponseAllOfVacationDates> getVacationDates() {
    return vacationDates;
  }

  public void setVacationDates(JsonNullable<WorkspaceMembershipResponseAllOfVacationDates> vacationDates) {
    this.vacationDates = vacationDates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceMembershipResponse workspaceMembershipResponse = (WorkspaceMembershipResponse) o;
    return Objects.equals(this.gid, workspaceMembershipResponse.gid) &&
        Objects.equals(this.resourceType, workspaceMembershipResponse.resourceType) &&
        Objects.equals(this.user, workspaceMembershipResponse.user) &&
        Objects.equals(this.workspace, workspaceMembershipResponse.workspace) &&
        Objects.equals(this.isActive, workspaceMembershipResponse.isActive) &&
        Objects.equals(this.isAdmin, workspaceMembershipResponse.isAdmin) &&
        Objects.equals(this.isGuest, workspaceMembershipResponse.isGuest) &&
        Objects.equals(this.userTaskList, workspaceMembershipResponse.userTaskList) &&
        equalsNullable(this.vacationDates, workspaceMembershipResponse.vacationDates);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, user, workspace, isActive, isAdmin, isGuest, userTaskList, hashCodeNullable(vacationDates));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceMembershipResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isGuest: ").append(toIndentedString(isGuest)).append("\n");
    sb.append("    userTaskList: ").append(toIndentedString(userTaskList)).append("\n");
    sb.append("    vacationDates: ").append(toIndentedString(vacationDates)).append("\n");
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

