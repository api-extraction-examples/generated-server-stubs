package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AsanaResource;
import org.openapitools.model.Like;
import org.openapitools.model.TaskBaseAllOfExternal;
import org.openapitools.model.TaskBaseAllOfMemberships;
import org.openapitools.model.UserCompact;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class TaskBase {

  private String gid;

  private String resourceType;

  private String name;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.
   */
  public enum ResourceSubtypeEnum {
    DEFAULT_TASK("default_task"),
    
    MILESTONE("milestone"),
    
    SECTION("section"),
    
    APPROVAL("approval");

    private String value;

    ResourceSubtypeEnum(String value) {
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
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResourceSubtypeEnum resourceSubtype;

  private JsonNullable<BigDecimal> actualTimeMinutes = JsonNullable.<BigDecimal>undefined();

  /**
   * *Conditional* Reflects the approval status of this task. This field is kept in sync with `completed`, meaning `pending` translates to false while `approved`, `rejected`, and `changes_requested` translate to true. If you set completed to true, this field will be set to `approved`.
   */
  public enum ApprovalStatusEnum {
    PENDING("pending"),
    
    APPROVED("approved"),
    
    REJECTED("rejected"),
    
    CHANGES_REQUESTED("changes_requested");

    private String value;

    ApprovalStatusEnum(String value) {
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
    public static ApprovalStatusEnum fromValue(String value) {
      for (ApprovalStatusEnum b : ApprovalStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ApprovalStatusEnum approvalStatus;

  /**
   * *Deprecated* Scheduling status of this task for the user it is assigned to. This field can only be set if the assignee is non-null. Setting this field to \"inbox\" or \"upcoming\" inserts it at the top of the section, while the other options will insert at the bottom.
   */
  public enum AssigneeStatusEnum {
    TODAY("today"),
    
    UPCOMING("upcoming"),
    
    LATER("later"),
    
    NEW("new"),
    
    INBOX("inbox");

    private String value;

    AssigneeStatusEnum(String value) {
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
    public static AssigneeStatusEnum fromValue(String value) {
      for (AssigneeStatusEnum b : AssigneeStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AssigneeStatusEnum assigneeStatus;

  private Boolean completed;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

  private UserCompact completedBy;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @Valid
  private List<@Valid AsanaResource> dependencies;

  @Valid
  private List<@Valid AsanaResource> dependents;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> dueAt = JsonNullable.<LocalDate>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> dueOn = JsonNullable.<LocalDate>undefined();

  private TaskBaseAllOfExternal external;

  private Boolean hearted;

  @Valid
  private List<@Valid Like> hearts;

  private String htmlNotes;

  private Boolean isRenderedAsSeparator;

  private Boolean liked;

  @Valid
  private List<@Valid Like> likes;

  @Valid
  private List<@Valid TaskBaseAllOfMemberships> memberships;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedAt;

  private String notes;

  private Integer numHearts;

  private Integer numLikes;

  private Integer numSubtasks;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startAt = JsonNullable.<LocalDate>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startOn = JsonNullable.<LocalDate>undefined();

  public TaskBase gid(String gid) {
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

  public TaskBase resourceType(String resourceType) {
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

  public TaskBase name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.
   * @return name
  */
  
  @Schema(name = "name", example = "Buy catnip", description = "Name of the task. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskBase resourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", example = "default_task", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning. The resource_subtype `milestone` represent a single moment in time. This means tasks with this subtype cannot have a start_date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public TaskBase actualTimeMinutes(BigDecimal actualTimeMinutes) {
    this.actualTimeMinutes = JsonNullable.of(actualTimeMinutes);
    return this;
  }

  /**
   * This value represents the sum of all the Time Tracking entries in the Actual Time field on a given Task. It is represented as a nullable long value.
   * @return actualTimeMinutes
  */
  @Valid 
  @Schema(name = "actual_time_minutes", accessMode = Schema.AccessMode.READ_ONLY, example = "200", description = "This value represents the sum of all the Time Tracking entries in the Actual Time field on a given Task. It is represented as a nullable long value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actual_time_minutes")
  public JsonNullable<BigDecimal> getActualTimeMinutes() {
    return actualTimeMinutes;
  }

  public void setActualTimeMinutes(JsonNullable<BigDecimal> actualTimeMinutes) {
    this.actualTimeMinutes = actualTimeMinutes;
  }

  public TaskBase approvalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
    return this;
  }

  /**
   * *Conditional* Reflects the approval status of this task. This field is kept in sync with `completed`, meaning `pending` translates to false while `approved`, `rejected`, and `changes_requested` translate to true. If you set completed to true, this field will be set to `approved`.
   * @return approvalStatus
  */
  
  @Schema(name = "approval_status", example = "pending", description = "*Conditional* Reflects the approval status of this task. This field is kept in sync with `completed`, meaning `pending` translates to false while `approved`, `rejected`, and `changes_requested` translate to true. If you set completed to true, this field will be set to `approved`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("approval_status")
  public ApprovalStatusEnum getApprovalStatus() {
    return approvalStatus;
  }

  public void setApprovalStatus(ApprovalStatusEnum approvalStatus) {
    this.approvalStatus = approvalStatus;
  }

  public TaskBase assigneeStatus(AssigneeStatusEnum assigneeStatus) {
    this.assigneeStatus = assigneeStatus;
    return this;
  }

  /**
   * *Deprecated* Scheduling status of this task for the user it is assigned to. This field can only be set if the assignee is non-null. Setting this field to \"inbox\" or \"upcoming\" inserts it at the top of the section, while the other options will insert at the bottom.
   * @return assigneeStatus
  */
  
  @Schema(name = "assignee_status", example = "upcoming", description = "*Deprecated* Scheduling status of this task for the user it is assigned to. This field can only be set if the assignee is non-null. Setting this field to \"inbox\" or \"upcoming\" inserts it at the top of the section, while the other options will insert at the bottom.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee_status")
  public AssigneeStatusEnum getAssigneeStatus() {
    return assigneeStatus;
  }

  public void setAssigneeStatus(AssigneeStatusEnum assigneeStatus) {
    this.assigneeStatus = assigneeStatus;
  }

  public TaskBase completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * True if the task is currently marked complete, false if not.
   * @return completed
  */
  
  @Schema(name = "completed", example = "false", description = "True if the task is currently marked complete, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public TaskBase completedAt(OffsetDateTime completedAt) {
    this.completedAt = JsonNullable.of(completedAt);
    return this;
  }

  /**
   * The time at which this task was completed, or null if the task is incomplete.
   * @return completedAt
  */
  @Valid 
  @Schema(name = "completed_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this task was completed, or null if the task is incomplete.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_at")
  public JsonNullable<OffsetDateTime> getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(JsonNullable<OffsetDateTime> completedAt) {
    this.completedAt = completedAt;
  }

  public TaskBase completedBy(UserCompact completedBy) {
    this.completedBy = completedBy;
    return this;
  }

  /**
   * Get completedBy
   * @return completedBy
  */
  @Valid 
  @Schema(name = "completed_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_by")
  public UserCompact getCompletedBy() {
    return completedBy;
  }

  public void setCompletedBy(UserCompact completedBy) {
    this.completedBy = completedBy;
  }

  public TaskBase createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this resource was created.
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this resource was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public TaskBase dependencies(List<@Valid AsanaResource> dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  public TaskBase addDependenciesItem(AsanaResource dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). Array of resources referencing tasks that this task depends on. The objects contain only the gid of the dependency.
   * @return dependencies
  */
  @Valid 
  @Schema(name = "dependencies", accessMode = Schema.AccessMode.READ_ONLY, description = "[Opt In](/docs/input-output-options). Array of resources referencing tasks that this task depends on. The objects contain only the gid of the dependency.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependencies")
  public List<@Valid AsanaResource> getDependencies() {
    return dependencies;
  }

  public void setDependencies(List<@Valid AsanaResource> dependencies) {
    this.dependencies = dependencies;
  }

  public TaskBase dependents(List<@Valid AsanaResource> dependents) {
    this.dependents = dependents;
    return this;
  }

  public TaskBase addDependentsItem(AsanaResource dependentsItem) {
    if (this.dependents == null) {
      this.dependents = new ArrayList<>();
    }
    this.dependents.add(dependentsItem);
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). Array of resources referencing tasks that depend on this task. The objects contain only the ID of the dependent.
   * @return dependents
  */
  @Valid 
  @Schema(name = "dependents", accessMode = Schema.AccessMode.READ_ONLY, description = "[Opt In](/docs/input-output-options). Array of resources referencing tasks that depend on this task. The objects contain only the ID of the dependent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependents")
  public List<@Valid AsanaResource> getDependents() {
    return dependents;
  }

  public void setDependents(List<@Valid AsanaResource> dependents) {
    this.dependents = dependents;
  }

  public TaskBase dueAt(LocalDate dueAt) {
    this.dueAt = JsonNullable.of(dueAt);
    return this;
  }

  /**
   * The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.
   * @return dueAt
  */
  @Valid 
  @Schema(name = "due_at", description = "The UTC date and time on which this task is due, or null if the task has no due time. This takes an ISO 8601 date string in UTC and should not be used together with `due_on`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_at")
  public JsonNullable<LocalDate> getDueAt() {
    return dueAt;
  }

  public void setDueAt(JsonNullable<LocalDate> dueAt) {
    this.dueAt = dueAt;
  }

  public TaskBase dueOn(LocalDate dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The localized date on which this task is due, or null if the task has no due date. This takes a date with `YYYY-MM-DD` format and should not be used together with `due_at`.
   * @return dueOn
  */
  @Valid 
  @Schema(name = "due_on", example = "Sat Sep 14 20:00:00 AST 2019", description = "The localized date on which this task is due, or null if the task has no due date. This takes a date with `YYYY-MM-DD` format and should not be used together with `due_at`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<LocalDate> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<LocalDate> dueOn) {
    this.dueOn = dueOn;
  }

  public TaskBase external(TaskBaseAllOfExternal external) {
    this.external = external;
    return this;
  }

  /**
   * Get external
   * @return external
  */
  @Valid 
  @Schema(name = "external", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("external")
  public TaskBaseAllOfExternal getExternal() {
    return external;
  }

  public void setExternal(TaskBaseAllOfExternal external) {
    this.external = external;
  }

  public TaskBase hearted(Boolean hearted) {
    this.hearted = hearted;
    return this;
  }

  /**
   * *Deprecated - please use liked instead* True if the task is hearted by the authorized user, false if not.
   * @return hearted
  */
  
  @Schema(name = "hearted", accessMode = Schema.AccessMode.READ_ONLY, example = "true", description = "*Deprecated - please use liked instead* True if the task is hearted by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearted")
  public Boolean getHearted() {
    return hearted;
  }

  public void setHearted(Boolean hearted) {
    this.hearted = hearted;
  }

  public TaskBase hearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
    return this;
  }

  public TaskBase addHeartsItem(Like heartsItem) {
    if (this.hearts == null) {
      this.hearts = new ArrayList<>();
    }
    this.hearts.add(heartsItem);
    return this;
  }

  /**
   * *Deprecated - please use likes instead* Array of likes for users who have hearted this task.
   * @return hearts
  */
  @Valid 
  @Schema(name = "hearts", accessMode = Schema.AccessMode.READ_ONLY, description = "*Deprecated - please use likes instead* Array of likes for users who have hearted this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hearts")
  public List<@Valid Like> getHearts() {
    return hearts;
  }

  public void setHearts(List<@Valid Like> hearts) {
    this.hearts = hearts;
  }

  public TaskBase htmlNotes(String htmlNotes) {
    this.htmlNotes = htmlNotes;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). The notes of the text with formatting as HTML.
   * @return htmlNotes
  */
  
  @Schema(name = "html_notes", example = "<body>Mittens <em>really</em> likes the stuff from Humboldt.</body>", description = "[Opt In](/docs/input-output-options). The notes of the text with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_notes")
  public String getHtmlNotes() {
    return htmlNotes;
  }

  public void setHtmlNotes(String htmlNotes) {
    this.htmlNotes = htmlNotes;
  }

  public TaskBase isRenderedAsSeparator(Boolean isRenderedAsSeparator) {
    this.isRenderedAsSeparator = isRenderedAsSeparator;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). In some contexts tasks can be rendered as a visual separator; for instance, subtasks can appear similar to [sections](/docs/asana-sections) without being true `section` objects. If a `task` object is rendered this way in any context it will have the property `is_rendered_as_separator` set to `true`.
   * @return isRenderedAsSeparator
  */
  
  @Schema(name = "is_rendered_as_separator", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "[Opt In](/docs/input-output-options). In some contexts tasks can be rendered as a visual separator; for instance, subtasks can appear similar to [sections](/docs/asana-sections) without being true `section` objects. If a `task` object is rendered this way in any context it will have the property `is_rendered_as_separator` set to `true`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_rendered_as_separator")
  public Boolean getIsRenderedAsSeparator() {
    return isRenderedAsSeparator;
  }

  public void setIsRenderedAsSeparator(Boolean isRenderedAsSeparator) {
    this.isRenderedAsSeparator = isRenderedAsSeparator;
  }

  public TaskBase liked(Boolean liked) {
    this.liked = liked;
    return this;
  }

  /**
   * True if the task is liked by the authorized user, false if not.
   * @return liked
  */
  
  @Schema(name = "liked", example = "true", description = "True if the task is liked by the authorized user, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("liked")
  public Boolean getLiked() {
    return liked;
  }

  public void setLiked(Boolean liked) {
    this.liked = liked;
  }

  public TaskBase likes(List<@Valid Like> likes) {
    this.likes = likes;
    return this;
  }

  public TaskBase addLikesItem(Like likesItem) {
    if (this.likes == null) {
      this.likes = new ArrayList<>();
    }
    this.likes.add(likesItem);
    return this;
  }

  /**
   * Array of likes for users who have liked this task.
   * @return likes
  */
  @Valid 
  @Schema(name = "likes", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of likes for users who have liked this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("likes")
  public List<@Valid Like> getLikes() {
    return likes;
  }

  public void setLikes(List<@Valid Like> likes) {
    this.likes = likes;
  }

  public TaskBase memberships(List<@Valid TaskBaseAllOfMemberships> memberships) {
    this.memberships = memberships;
    return this;
  }

  public TaskBase addMembershipsItem(TaskBaseAllOfMemberships membershipsItem) {
    if (this.memberships == null) {
      this.memberships = new ArrayList<>();
    }
    this.memberships.add(membershipsItem);
    return this;
  }

  /**
   * *Create-only*. Array of projects this task is associated with and the section it is in. At task creation time, this array can be used to add the task to specific sections. After task creation, these associations can be modified using the `addProject` and `removeProject` endpoints. Note that over time, more types of memberships may be added to this property.
   * @return memberships
  */
  @Valid 
  @Schema(name = "memberships", accessMode = Schema.AccessMode.READ_ONLY, description = "*Create-only*. Array of projects this task is associated with and the section it is in. At task creation time, this array can be used to add the task to specific sections. After task creation, these associations can be modified using the `addProject` and `removeProject` endpoints. Note that over time, more types of memberships may be added to this property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberships")
  public List<@Valid TaskBaseAllOfMemberships> getMemberships() {
    return memberships;
  }

  public void setMemberships(List<@Valid TaskBaseAllOfMemberships> memberships) {
    this.memberships = memberships;
  }

  public TaskBase modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which this task was last modified.  *Note: This does not currently reflect any changes in associations such as projects or comments that may have been added or removed from the task.*
   * @return modifiedAt
  */
  @Valid 
  @Schema(name = "modified_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this task was last modified.  *Note: This does not currently reflect any changes in associations such as projects or comments that may have been added or removed from the task.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public TaskBase notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form textual information associated with the task (i.e. its description).
   * @return notes
  */
  
  @Schema(name = "notes", example = "Mittens really likes the stuff from Humboldt.", description = "Free-form textual information associated with the task (i.e. its description).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public TaskBase numHearts(Integer numHearts) {
    this.numHearts = numHearts;
    return this;
  }

  /**
   * *Deprecated - please use likes instead* The number of users who have hearted this task.
   * @return numHearts
  */
  
  @Schema(name = "num_hearts", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "*Deprecated - please use likes instead* The number of users who have hearted this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_hearts")
  public Integer getNumHearts() {
    return numHearts;
  }

  public void setNumHearts(Integer numHearts) {
    this.numHearts = numHearts;
  }

  public TaskBase numLikes(Integer numLikes) {
    this.numLikes = numLikes;
    return this;
  }

  /**
   * The number of users who have liked this task.
   * @return numLikes
  */
  
  @Schema(name = "num_likes", accessMode = Schema.AccessMode.READ_ONLY, example = "5", description = "The number of users who have liked this task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_likes")
  public Integer getNumLikes() {
    return numLikes;
  }

  public void setNumLikes(Integer numLikes) {
    this.numLikes = numLikes;
  }

  public TaskBase numSubtasks(Integer numSubtasks) {
    this.numSubtasks = numSubtasks;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). The number of subtasks on this task. 
   * @return numSubtasks
  */
  
  @Schema(name = "num_subtasks", accessMode = Schema.AccessMode.READ_ONLY, example = "3", description = "[Opt In](/docs/input-output-options). The number of subtasks on this task. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("num_subtasks")
  public Integer getNumSubtasks() {
    return numSubtasks;
  }

  public void setNumSubtasks(Integer numSubtasks) {
    this.numSubtasks = numSubtasks;
  }

  public TaskBase startAt(LocalDate startAt) {
    this.startAt = JsonNullable.of(startAt);
    return this;
  }

  /**
   * Date and time on which work begins for the task, or null if the task has no start time. This takes an ISO 8601 date string in UTC and should not be used together with `start_on`. *Note: `due_at` must be present in the request when setting or unsetting the `start_at` parameter.*
   * @return startAt
  */
  @Valid 
  @Schema(name = "start_at", description = "Date and time on which work begins for the task, or null if the task has no start time. This takes an ISO 8601 date string in UTC and should not be used together with `start_on`. *Note: `due_at` must be present in the request when setting or unsetting the `start_at` parameter.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_at")
  public JsonNullable<LocalDate> getStartAt() {
    return startAt;
  }

  public void setStartAt(JsonNullable<LocalDate> startAt) {
    this.startAt = startAt;
  }

  public TaskBase startOn(LocalDate startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work begins for the task , or null if the task has no start date. This takes a date with `YYYY-MM-DD` format and should not be used together with `start_at`. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter.*
   * @return startOn
  */
  @Valid 
  @Schema(name = "start_on", example = "Fri Sep 13 20:00:00 AST 2019", description = "The day on which work begins for the task , or null if the task has no start date. This takes a date with `YYYY-MM-DD` format and should not be used together with `start_at`. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<LocalDate> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<LocalDate> startOn) {
    this.startOn = startOn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskBase taskBase = (TaskBase) o;
    return Objects.equals(this.gid, taskBase.gid) &&
        Objects.equals(this.resourceType, taskBase.resourceType) &&
        Objects.equals(this.name, taskBase.name) &&
        Objects.equals(this.resourceSubtype, taskBase.resourceSubtype) &&
        equalsNullable(this.actualTimeMinutes, taskBase.actualTimeMinutes) &&
        Objects.equals(this.approvalStatus, taskBase.approvalStatus) &&
        Objects.equals(this.assigneeStatus, taskBase.assigneeStatus) &&
        Objects.equals(this.completed, taskBase.completed) &&
        equalsNullable(this.completedAt, taskBase.completedAt) &&
        Objects.equals(this.completedBy, taskBase.completedBy) &&
        Objects.equals(this.createdAt, taskBase.createdAt) &&
        Objects.equals(this.dependencies, taskBase.dependencies) &&
        Objects.equals(this.dependents, taskBase.dependents) &&
        equalsNullable(this.dueAt, taskBase.dueAt) &&
        equalsNullable(this.dueOn, taskBase.dueOn) &&
        Objects.equals(this.external, taskBase.external) &&
        Objects.equals(this.hearted, taskBase.hearted) &&
        Objects.equals(this.hearts, taskBase.hearts) &&
        Objects.equals(this.htmlNotes, taskBase.htmlNotes) &&
        Objects.equals(this.isRenderedAsSeparator, taskBase.isRenderedAsSeparator) &&
        Objects.equals(this.liked, taskBase.liked) &&
        Objects.equals(this.likes, taskBase.likes) &&
        Objects.equals(this.memberships, taskBase.memberships) &&
        Objects.equals(this.modifiedAt, taskBase.modifiedAt) &&
        Objects.equals(this.notes, taskBase.notes) &&
        Objects.equals(this.numHearts, taskBase.numHearts) &&
        Objects.equals(this.numLikes, taskBase.numLikes) &&
        Objects.equals(this.numSubtasks, taskBase.numSubtasks) &&
        equalsNullable(this.startAt, taskBase.startAt) &&
        equalsNullable(this.startOn, taskBase.startOn);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, resourceSubtype, hashCodeNullable(actualTimeMinutes), approvalStatus, assigneeStatus, completed, hashCodeNullable(completedAt), completedBy, createdAt, dependencies, dependents, hashCodeNullable(dueAt), hashCodeNullable(dueOn), external, hearted, hearts, htmlNotes, isRenderedAsSeparator, liked, likes, memberships, modifiedAt, notes, numHearts, numLikes, numSubtasks, hashCodeNullable(startAt), hashCodeNullable(startOn));
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
    sb.append("class TaskBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    actualTimeMinutes: ").append(toIndentedString(actualTimeMinutes)).append("\n");
    sb.append("    approvalStatus: ").append(toIndentedString(approvalStatus)).append("\n");
    sb.append("    assigneeStatus: ").append(toIndentedString(assigneeStatus)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    completedBy: ").append(toIndentedString(completedBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    dependents: ").append(toIndentedString(dependents)).append("\n");
    sb.append("    dueAt: ").append(toIndentedString(dueAt)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    hearted: ").append(toIndentedString(hearted)).append("\n");
    sb.append("    hearts: ").append(toIndentedString(hearts)).append("\n");
    sb.append("    htmlNotes: ").append(toIndentedString(htmlNotes)).append("\n");
    sb.append("    isRenderedAsSeparator: ").append(toIndentedString(isRenderedAsSeparator)).append("\n");
    sb.append("    liked: ").append(toIndentedString(liked)).append("\n");
    sb.append("    likes: ").append(toIndentedString(likes)).append("\n");
    sb.append("    memberships: ").append(toIndentedString(memberships)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    numHearts: ").append(toIndentedString(numHearts)).append("\n");
    sb.append("    numLikes: ").append(toIndentedString(numLikes)).append("\n");
    sb.append("    numSubtasks: ").append(toIndentedString(numSubtasks)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
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

