package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GoalResponseAllOfCurrentStatusUpdate;
import org.openapitools.model.GoalResponseAllOfMetric;
import org.openapitools.model.GoalResponseAllOfOwner;
import org.openapitools.model.GoalResponseAllOfTeam;
import org.openapitools.model.GoalResponseAllOfTimePeriod;
import org.openapitools.model.GoalResponseAllOfWorkspace;
import org.openapitools.model.Like;
import org.openapitools.model.UserCompact;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoalResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalResponse {

  private String gid;

  private String resourceType;

  private JsonNullable<String> dueOn = JsonNullable.<String>undefined();

  private String htmlNotes;

  private Boolean isWorkspaceLevel;

  private Boolean liked;

  private String name;

  private String notes;

  private JsonNullable<String> startOn = JsonNullable.<String>undefined();

  private JsonNullable<String> status = JsonNullable.<String>undefined();

  private JsonNullable<GoalResponseAllOfCurrentStatusUpdate> currentStatusUpdate = JsonNullable.<GoalResponseAllOfCurrentStatusUpdate>undefined();

  @Valid
  private List<@Valid UserCompact> followers;

  @Valid
  private List<@Valid Like> likes;

  private GoalResponseAllOfMetric metric;

  private Integer numLikes;

  private GoalResponseAllOfOwner owner;

  private GoalResponseAllOfTeam team;

  private GoalResponseAllOfTimePeriod timePeriod;

  private GoalResponseAllOfWorkspace workspace;

  public GoalResponse gid(String gid) {
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

  public GoalResponse resourceType(String resourceType) {
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

  public GoalResponse dueOn(String dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.
   * @return dueOn
  */
  
  @Schema(name = "due_on", example = "2019-09-15", description = "The localized day on which this goal is due. This takes a date with format `YYYY-MM-DD`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<String> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<String> dueOn) {
    this.dueOn = dueOn;
  }

  public GoalResponse htmlNotes(String htmlNotes) {
    this.htmlNotes = htmlNotes;
    return this;
  }

  /**
   * The notes of the goal with formatting as HTML.
   * @return htmlNotes
  */
  
  @Schema(name = "html_notes", example = "<body>Start building brand awareness.</body>", description = "The notes of the goal with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_notes")
  public String getHtmlNotes() {
    return htmlNotes;
  }

  public void setHtmlNotes(String htmlNotes) {
    this.htmlNotes = htmlNotes;
  }

  public GoalResponse isWorkspaceLevel(Boolean isWorkspaceLevel) {
    this.isWorkspaceLevel = isWorkspaceLevel;
    return this;
  }

  /**
   * *Conditional*. This property is only present when the `workspace` provided is an organization. Whether the goal belongs to the `workspace` (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.
   * @return isWorkspaceLevel
  */
  
  @Schema(name = "is_workspace_level", example = "true", description = "*Conditional*. This property is only present when the `workspace` provided is an organization. Whether the goal belongs to the `workspace` (and is listed as part of the workspace’s goals) or not. If it isn’t a workspace-level goal, it is a team-level goal, and is associated with the goal’s team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_workspace_level")
  public Boolean getIsWorkspaceLevel() {
    return isWorkspaceLevel;
  }

  public void setIsWorkspaceLevel(Boolean isWorkspaceLevel) {
    this.isWorkspaceLevel = isWorkspaceLevel;
  }

  public GoalResponse liked(Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * True if the goal is liked by the authorized user, false if not.
   * @return liked
  */
  
  @Schema(name = "liked", example = "false", description = "True if the goal is liked by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked")
  public Boolean getLiked() {
    return liked;
  }

  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  public GoalResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the goal.
   * @return name
  */
  
  @Schema(name = "name", example = "Grow web traffic by 30%", description = "The name of the goal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GoalResponse notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form textual information associated with the goal (i.e. its description).
   * @return notes
  */
  
  @Schema(name = "notes", example = "Start building brand awareness.", description = "Free-form textual information associated with the goal (i.e. its description).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public GoalResponse startOn(String startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.
   * @return startOn
  */
  
  @Schema(name = "start_on", example = "2019-09-14", description = "The day on which work for this goal begins, or null if the goal has no start date. This takes a date with `YYYY-MM-DD` format, and cannot be set unless there is an accompanying due date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<String> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<String> startOn) {
    this.startOn = startOn;
  }

  public GoalResponse status(String status) {
    this.status = JsonNullable.of(status);
    return this;
  }

  /**
   * The current status of this goal. When the goal is open, its status can be `green`, `yellow`, and `red` to reflect \"On Track\", \"At Risk\", and \"Off Track\", respectively. When the goal is closed, the value can be `missed`, `achieved`, `partial`, or `dropped`. *Note* you can only write to this property if `metric` is set.
   * @return status
  */
  
  @Schema(name = "status", example = "green", description = "The current status of this goal. When the goal is open, its status can be `green`, `yellow`, and `red` to reflect \"On Track\", \"At Risk\", and \"Off Track\", respectively. When the goal is closed, the value can be `missed`, `achieved`, `partial`, or `dropped`. *Note* you can only write to this property if `metric` is set.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public JsonNullable<String> getStatus() {
    return status;
  }

  public void setStatus(JsonNullable<String> status) {
    this.status = status;
  }

  public GoalResponse currentStatusUpdate(GoalResponseAllOfCurrentStatusUpdate currentStatusUpdate) {
    this.currentStatusUpdate = JsonNullable.of(currentStatusUpdate);
    return this;
  }

  /**
   * Get currentStatusUpdate
   * @return currentStatusUpdate
  */
  @Valid 
  @Schema(name = "current_status_update", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_status_update")
  public JsonNullable<GoalResponseAllOfCurrentStatusUpdate> getCurrentStatusUpdate() {
    return currentStatusUpdate;
  }

  public void setCurrentStatusUpdate(JsonNullable<GoalResponseAllOfCurrentStatusUpdate> currentStatusUpdate) {
    this.currentStatusUpdate = currentStatusUpdate;
  }

  public GoalResponse followers(List<@Valid UserCompact> followers) {
    this.followers = followers;
    return this;
  }

  public GoalResponse addFollowersItem(UserCompact followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

  /**
   * Array of users who are members of this goal.
   * @return followers
  */
  @Valid 
  @Schema(name = "followers", description = "Array of users who are members of this goal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers")
  public List<@Valid UserCompact> getFollowers() {
    return followers;
  }

  public void setFollowers(List<@Valid UserCompact> followers) {
    this.followers = followers;
  }

  public GoalResponse likes(List<@Valid Like> likes) {
    this.likes = likes;
    return this;
  }

  public GoalResponse addLikesItem(Like likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * Array of likes for users who have liked this goal.
   * @return likes
  */
  @Valid 
  @Schema(name = "likes", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of likes for users who have liked this goal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid Like> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid Like> likes) {
    this.likes = likes;
  }

  public GoalResponse metric(GoalResponseAllOfMetric metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Get metric
   * @return metric
  */
  @Valid 
  @Schema(name = "metric", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metric")
  public GoalResponseAllOfMetric getMetric() {
    return metric;
  }

  public void setMetric(GoalResponseAllOfMetric metric) {
    this.metric = metric;
  }

  public GoalResponse numLikes(Integer numLikes) {
    this.numLikes = numLikes;
    return this;
  }

  /**
   * The number of users who have liked this goal.
   * @return numLikes
  */
  
  @Schema(name = "num_likes", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "The number of users who have liked this goal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_likes")
  public Integer getNumLikes() {
    return numLikes;
  }

  public void setNumLikes(Integer numLikes) {
    this.numLikes = numLikes;
  }

  public GoalResponse owner(GoalResponseAllOfOwner owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public GoalResponseAllOfOwner getOwner() {
    return owner;
  }

  public void setOwner(GoalResponseAllOfOwner owner) {
    this.owner = owner;
  }

  public GoalResponse team(GoalResponseAllOfTeam team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
  @Valid 
  @Schema(name = "team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public GoalResponseAllOfTeam getTeam() {
    return team;
  }

  public void setTeam(GoalResponseAllOfTeam team) {
    this.team = team;
  }

  public GoalResponse timePeriod(GoalResponseAllOfTimePeriod timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

  /**
   * Get timePeriod
   * @return timePeriod
  */
  @Valid 
  @Schema(name = "time_period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("time_period")
  public GoalResponseAllOfTimePeriod getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(GoalResponseAllOfTimePeriod timePeriod) {
    this.timePeriod = timePeriod;
  }

  public GoalResponse workspace(GoalResponseAllOfWorkspace workspace) {
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
  public GoalResponseAllOfWorkspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(GoalResponseAllOfWorkspace workspace) {
    this.workspace = workspace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalResponse goalResponse = (GoalResponse) o;
    return Objects.equals(this.gid, goalResponse.gid) &&
        Objects.equals(this.resourceType, goalResponse.resourceType) &&
        equalsNullable(this.dueOn, goalResponse.dueOn) &&
        Objects.equals(this.htmlNotes, goalResponse.htmlNotes) &&
        Objects.equals(this.isWorkspaceLevel, goalResponse.isWorkspaceLevel) &&
        Objects.equals(this.liked, goalResponse.liked) &&
        Objects.equals(this.name, goalResponse.name) &&
        Objects.equals(this.notes, goalResponse.notes) &&
        equalsNullable(this.startOn, goalResponse.startOn) &&
        equalsNullable(this.status, goalResponse.status) &&
        equalsNullable(this.currentStatusUpdate, goalResponse.currentStatusUpdate) &&
        Objects.equals(this.followers, goalResponse.followers) &&
        Objects.equals(this.likes, goalResponse.likes) &&
        Objects.equals(this.metric, goalResponse.metric) &&
        Objects.equals(this.numLikes, goalResponse.numLikes) &&
        Objects.equals(this.owner, goalResponse.owner) &&
        Objects.equals(this.team, goalResponse.team) &&
        Objects.equals(this.timePeriod, goalResponse.timePeriod) &&
        Objects.equals(this.workspace, goalResponse.workspace);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, hashCodeNullable(dueOn), htmlNotes, isWorkspaceLevel, liked, name, notes, hashCodeNullable(startOn), hashCodeNullable(status), hashCodeNullable(currentStatusUpdate), followers, likes, metric, numLikes, owner, team, timePeriod, workspace);
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
    sb.append("class GoalResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    htmlNotes: ").append(toIndentedString(htmlNotes)).append("\n");
    sb.append("    isWorkspaceLevel: ").append(toIndentedString(isWorkspaceLevel)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currentStatusUpdate: ").append(toIndentedString(currentStatusUpdate)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    numLikes: ").append(toIndentedString(numLikes)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
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

