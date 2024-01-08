package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CustomFieldCompact;
import org.openapitools.model.CustomFieldSettingResponse;
import org.openapitools.model.ProjectBaseAllOfCurrentStatus;
import org.openapitools.model.ProjectBaseAllOfCurrentStatusUpdate;
import org.openapitools.model.ProjectBaseAllOfWorkspace;
import org.openapitools.model.ProjectResponseAllOfCreatedFromTemplate;
import org.openapitools.model.ProjectResponseAllOfOwner;
import org.openapitools.model.ProjectResponseAllOfProjectBrief;
import org.openapitools.model.ProjectResponseAllOfTeam;
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
 * ProjectResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectResponse {

  private String gid;

  private String resourceType;

  private String name;

  private Boolean archived;

  /**
   * Color of the project.
   */
  public enum ColorEnum {
    DARK_PINK("dark-pink"),
    
    DARK_GREEN("dark-green"),
    
    DARK_BLUE("dark-blue"),
    
    DARK_RED("dark-red"),
    
    DARK_TEAL("dark-teal"),
    
    DARK_BROWN("dark-brown"),
    
    DARK_ORANGE("dark-orange"),
    
    DARK_PURPLE("dark-purple"),
    
    DARK_WARM_GRAY("dark-warm-gray"),
    
    LIGHT_PINK("light-pink"),
    
    LIGHT_GREEN("light-green"),
    
    LIGHT_BLUE("light-blue"),
    
    LIGHT_RED("light-red"),
    
    LIGHT_TEAL("light-teal"),
    
    LIGHT_BROWN("light-brown"),
    
    LIGHT_ORANGE("light-orange"),
    
    LIGHT_PURPLE("light-purple"),
    
    LIGHT_WARM_GRAY("light-warm-gray");

    private String value;

    ColorEnum(String value) {
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
    public static ColorEnum fromValue(String value) {
      for (ColorEnum b : ColorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<ColorEnum> color = JsonNullable.<ColorEnum>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private JsonNullable<ProjectBaseAllOfCurrentStatus> currentStatus = JsonNullable.<ProjectBaseAllOfCurrentStatus>undefined();

  private JsonNullable<ProjectBaseAllOfCurrentStatusUpdate> currentStatusUpdate = JsonNullable.<ProjectBaseAllOfCurrentStatusUpdate>undefined();

  @Valid
  private List<@Valid CustomFieldSettingResponse> customFieldSettings;

  /**
   * The default view (list, board, calendar, or timeline) of a project.
   */
  public enum DefaultViewEnum {
    LIST("list"),
    
    BOARD("board"),
    
    CALENDAR("calendar"),
    
    TIMELINE("timeline");

    private String value;

    DefaultViewEnum(String value) {
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
    public static DefaultViewEnum fromValue(String value) {
      for (DefaultViewEnum b : DefaultViewEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DefaultViewEnum defaultView;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dueDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dueOn = JsonNullable.<OffsetDateTime>undefined();

  private String htmlNotes;

  private Boolean isTemplate;

  @Valid
  private List<@Valid UserCompact> members;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime modifiedAt;

  private String notes;

  private Boolean _public;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startOn = JsonNullable.<LocalDate>undefined();

  private ProjectBaseAllOfWorkspace workspace;

  private Boolean completed;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

  private UserCompact completedBy;

  private ProjectResponseAllOfCreatedFromTemplate createdFromTemplate;

  @Valid
  private List<@Valid CustomFieldCompact> customFields;

  @Valid
  private List<@Valid UserCompact> followers;

  /**
   * The icon for a project.
   */
  public enum IconEnum {
    LIST("list"),
    
    BOARD("board"),
    
    TIMELINE("timeline"),
    
    CALENDAR("calendar"),
    
    ROCKET("rocket"),
    
    PEOPLE("people"),
    
    GRAPH("graph"),
    
    STAR("star"),
    
    BUG("bug"),
    
    LIGHT_BULB("light_bulb"),
    
    GLOBE("globe"),
    
    GEAR("gear"),
    
    NOTEBOOK("notebook"),
    
    COMPUTER("computer"),
    
    CHECK("check"),
    
    TARGET("target"),
    
    HTML("html"),
    
    MEGAPHONE("megaphone"),
    
    CHAT_BUBBLES("chat_bubbles"),
    
    BRIEFCASE("briefcase"),
    
    PAGE_LAYOUT("page_layout"),
    
    MOUNTAIN_FLAG("mountain_flag"),
    
    PUZZLE("puzzle"),
    
    PRESENTATION("presentation"),
    
    LINE_AND_SYMBOLS("line_and_symbols"),
    
    SPEED_DIAL("speed_dial"),
    
    RIBBON("ribbon"),
    
    SHOE("shoe"),
    
    SHOPPING_BASKET("shopping_basket"),
    
    MAP("map"),
    
    TICKET("ticket"),
    
    COINS("coins");

    private String value;

    IconEnum(String value) {
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
    public static IconEnum fromValue(String value) {
      for (IconEnum b : IconEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  private JsonNullable<IconEnum> icon = JsonNullable.<IconEnum>undefined();

  private JsonNullable<ProjectResponseAllOfOwner> owner = JsonNullable.<ProjectResponseAllOfOwner>undefined();

  private String permalinkUrl;

  private ProjectResponseAllOfProjectBrief projectBrief;

  private ProjectResponseAllOfTeam team;

  public ProjectResponse gid(String gid) {
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

  public ProjectResponse resourceType(String resourceType) {
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

  public ProjectResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.
   * @return name
  */
  
  @Schema(name = "name", example = "Stuff to buy", description = "Name of the project. This is generally a short sentence fragment that fits on a line in the UI for maximum readability. However, it can be longer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProjectResponse archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * True if the project is archived, false if not. Archived projects do not show in the UI by default and may be treated differently for queries.
   * @return archived
  */
  
  @Schema(name = "archived", example = "false", description = "True if the project is archived, false if not. Archived projects do not show in the UI by default and may be treated differently for queries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public ProjectResponse color(ColorEnum color) {
    this.color = JsonNullable.of(color);
    return this;
  }

  /**
   * Color of the project.
   * @return color
  */
  
  @Schema(name = "color", example = "light-green", description = "Color of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public JsonNullable<ColorEnum> getColor() {
    return color;
  }

  public void setColor(JsonNullable<ColorEnum> color) {
    this.color = color;
  }

  public ProjectResponse createdAt(OffsetDateTime createdAt) {
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

  public ProjectResponse currentStatus(ProjectBaseAllOfCurrentStatus currentStatus) {
    this.currentStatus = JsonNullable.of(currentStatus);
    return this;
  }

  /**
   * Get currentStatus
   * @return currentStatus
  */
  @Valid 
  @Schema(name = "current_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_status")
  public JsonNullable<ProjectBaseAllOfCurrentStatus> getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(JsonNullable<ProjectBaseAllOfCurrentStatus> currentStatus) {
    this.currentStatus = currentStatus;
  }

  public ProjectResponse currentStatusUpdate(ProjectBaseAllOfCurrentStatusUpdate currentStatusUpdate) {
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
  public JsonNullable<ProjectBaseAllOfCurrentStatusUpdate> getCurrentStatusUpdate() {
    return currentStatusUpdate;
  }

  public void setCurrentStatusUpdate(JsonNullable<ProjectBaseAllOfCurrentStatusUpdate> currentStatusUpdate) {
    this.currentStatusUpdate = currentStatusUpdate;
  }

  public ProjectResponse customFieldSettings(List<@Valid CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
    return this;
  }

  public ProjectResponse addCustomFieldSettingsItem(CustomFieldSettingResponse customFieldSettingsItem) {
    if (this.customFieldSettings == null) {
      this.customFieldSettings = new ArrayList<>();
    }
    this.customFieldSettings.add(customFieldSettingsItem);
    return this;
  }

  /**
   * Array of Custom Field Settings (in compact form).
   * @return customFieldSettings
  */
  @Valid 
  @Schema(name = "custom_field_settings", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of Custom Field Settings (in compact form).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field_settings")
  public List<@Valid CustomFieldSettingResponse> getCustomFieldSettings() {
    return customFieldSettings;
  }

  public void setCustomFieldSettings(List<@Valid CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
  }

  public ProjectResponse defaultView(DefaultViewEnum defaultView) {
    this.defaultView = defaultView;
    return this;
  }

  /**
   * The default view (list, board, calendar, or timeline) of a project.
   * @return defaultView
  */
  
  @Schema(name = "default_view", example = "calendar", description = "The default view (list, board, calendar, or timeline) of a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_view")
  public DefaultViewEnum getDefaultView() {
    return defaultView;
  }

  public void setDefaultView(DefaultViewEnum defaultView) {
    this.defaultView = defaultView;
  }

  public ProjectResponse dueDate(OffsetDateTime dueDate) {
    this.dueDate = JsonNullable.of(dueDate);
    return this;
  }

  /**
   * *Deprecated: new integrations should prefer the `due_on` field.*
   * @return dueDate
  */
  @Valid 
  @Schema(name = "due_date", description = "*Deprecated: new integrations should prefer the `due_on` field.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_date")
  public JsonNullable<OffsetDateTime> getDueDate() {
    return dueDate;
  }

  public void setDueDate(JsonNullable<OffsetDateTime> dueDate) {
    this.dueDate = dueDate;
  }

  public ProjectResponse dueOn(OffsetDateTime dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The day on which this project is due. This takes a date with format YYYY-MM-DD.
   * @return dueOn
  */
  @Valid 
  @Schema(name = "due_on", description = "The day on which this project is due. This takes a date with format YYYY-MM-DD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<OffsetDateTime> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<OffsetDateTime> dueOn) {
    this.dueOn = dueOn;
  }

  public ProjectResponse htmlNotes(String htmlNotes) {
    this.htmlNotes = htmlNotes;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). The notes of the project with formatting as HTML.
   * @return htmlNotes
  */
  
  @Schema(name = "html_notes", example = "<body>These are things we need to purchase.</body>", description = "[Opt In](/docs/input-output-options). The notes of the project with formatting as HTML.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("html_notes")
  public String getHtmlNotes() {
    return htmlNotes;
  }

  public void setHtmlNotes(String htmlNotes) {
    this.htmlNotes = htmlNotes;
  }

  public ProjectResponse isTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
    return this;
  }

  /**
   * [Opt In](/docs/input-output-options). *Deprecated - please use a project template endpoint instead (more in [this forum post](https://forum.asana.com/t/a-new-api-for-project-templates/156432)).* Determines if the project is a template.
   * @return isTemplate
  */
  
  @Schema(name = "is_template", example = "false", description = "[Opt In](/docs/input-output-options). *Deprecated - please use a project template endpoint instead (more in [this forum post](https://forum.asana.com/t/a-new-api-for-project-templates/156432)).* Determines if the project is a template.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_template")
  public Boolean getIsTemplate() {
    return isTemplate;
  }

  public void setIsTemplate(Boolean isTemplate) {
    this.isTemplate = isTemplate;
  }

  public ProjectResponse members(List<@Valid UserCompact> members) {
    this.members = members;
    return this;
  }

  public ProjectResponse addMembersItem(UserCompact membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Array of users who are members of this project.
   * @return members
  */
  @Valid 
  @Schema(name = "members", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of users who are members of this project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public List<@Valid UserCompact> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid UserCompact> members) {
    this.members = members;
  }

  public ProjectResponse modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The time at which this project was last modified. *Note: This does not currently reflect any changes in associations such as tasks or comments that may have been added or removed from the project.*
   * @return modifiedAt
  */
  @Valid 
  @Schema(name = "modified_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this project was last modified. *Note: This does not currently reflect any changes in associations such as tasks or comments that may have been added or removed from the project.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("modified_at")
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public ProjectResponse notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Free-form textual information associated with the project (ie., its description).
   * @return notes
  */
  
  @Schema(name = "notes", example = "These are things we need to purchase.", description = "Free-form textual information associated with the project (ie., its description).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public ProjectResponse _public(Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * True if the project is public to its team.
   * @return _public
  */
  
  @Schema(name = "public", example = "false", description = "True if the project is public to its team.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public ProjectResponse startOn(LocalDate startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work for this project begins, or null if the project has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*
   * @return startOn
  */
  @Valid 
  @Schema(name = "start_on", example = "Fri Sep 13 20:00:00 AST 2019", description = "The day on which work for this project begins, or null if the project has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` or `due_at` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<LocalDate> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<LocalDate> startOn) {
    this.startOn = startOn;
  }

  public ProjectResponse workspace(ProjectBaseAllOfWorkspace workspace) {
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
  public ProjectBaseAllOfWorkspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(ProjectBaseAllOfWorkspace workspace) {
    this.workspace = workspace;
  }

  public ProjectResponse completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * True if the project is currently marked complete, false if not.
   * @return completed
  */
  
  @Schema(name = "completed", accessMode = Schema.AccessMode.READ_ONLY, example = "false", description = "True if the project is currently marked complete, false if not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public ProjectResponse completedAt(OffsetDateTime completedAt) {
    this.completedAt = JsonNullable.of(completedAt);
    return this;
  }

  /**
   * The time at which this project was completed, or null if the project is not completed.
   * @return completedAt
  */
  @Valid 
  @Schema(name = "completed_at", accessMode = Schema.AccessMode.READ_ONLY, example = "2012-02-22T02:06:58.147Z", description = "The time at which this project was completed, or null if the project is not completed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed_at")
  public JsonNullable<OffsetDateTime> getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(JsonNullable<OffsetDateTime> completedAt) {
    this.completedAt = completedAt;
  }

  public ProjectResponse completedBy(UserCompact completedBy) {
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

  public ProjectResponse createdFromTemplate(ProjectResponseAllOfCreatedFromTemplate createdFromTemplate) {
    this.createdFromTemplate = createdFromTemplate;
    return this;
  }

  /**
   * Get createdFromTemplate
   * @return createdFromTemplate
  */
  @Valid 
  @Schema(name = "created_from_template", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_from_template")
  public ProjectResponseAllOfCreatedFromTemplate getCreatedFromTemplate() {
    return createdFromTemplate;
  }

  public void setCreatedFromTemplate(ProjectResponseAllOfCreatedFromTemplate createdFromTemplate) {
    this.createdFromTemplate = createdFromTemplate;
  }

  public ProjectResponse customFields(List<@Valid CustomFieldCompact> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ProjectResponse addCustomFieldsItem(CustomFieldCompact customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

  /**
   * Array of Custom Fields.
   * @return customFields
  */
  @Valid 
  @Schema(name = "custom_fields", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of Custom Fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_fields")
  public List<@Valid CustomFieldCompact> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<@Valid CustomFieldCompact> customFields) {
    this.customFields = customFields;
  }

  public ProjectResponse followers(List<@Valid UserCompact> followers) {
    this.followers = followers;
    return this;
  }

  public ProjectResponse addFollowersItem(UserCompact followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

  /**
   * Array of users following this project. Followers are a subset of members who have opted in to receive \"tasks added\" notifications for a project.
   * @return followers
  */
  @Valid 
  @Schema(name = "followers", accessMode = Schema.AccessMode.READ_ONLY, description = "Array of users following this project. Followers are a subset of members who have opted in to receive \"tasks added\" notifications for a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers")
  public List<@Valid UserCompact> getFollowers() {
    return followers;
  }

  public void setFollowers(List<@Valid UserCompact> followers) {
    this.followers = followers;
  }

  public ProjectResponse icon(IconEnum icon) {
    this.icon = JsonNullable.of(icon);
    return this;
  }

  /**
   * The icon for a project.
   * @return icon
  */
  
  @Schema(name = "icon", example = "chat_bubbles", description = "The icon for a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public JsonNullable<IconEnum> getIcon() {
    return icon;
  }

  public void setIcon(JsonNullable<IconEnum> icon) {
    this.icon = icon;
  }

  public ProjectResponse owner(ProjectResponseAllOfOwner owner) {
    this.owner = JsonNullable.of(owner);
    return this;
  }

  /**
   * Get owner
   * @return owner
  */
  @Valid 
  @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public JsonNullable<ProjectResponseAllOfOwner> getOwner() {
    return owner;
  }

  public void setOwner(JsonNullable<ProjectResponseAllOfOwner> owner) {
    this.owner = owner;
  }

  public ProjectResponse permalinkUrl(String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
    return this;
  }

  /**
   * A url that points directly to the object within Asana.
   * @return permalinkUrl
  */
  
  @Schema(name = "permalink_url", accessMode = Schema.AccessMode.READ_ONLY, example = "https://app.asana.com/0/resource/123456789/list", description = "A url that points directly to the object within Asana.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permalink_url")
  public String getPermalinkUrl() {
    return permalinkUrl;
  }

  public void setPermalinkUrl(String permalinkUrl) {
    this.permalinkUrl = permalinkUrl;
  }

  public ProjectResponse projectBrief(ProjectResponseAllOfProjectBrief projectBrief) {
    this.projectBrief = projectBrief;
    return this;
  }

  /**
   * Get projectBrief
   * @return projectBrief
  */
  @Valid 
  @Schema(name = "project_brief", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project_brief")
  public ProjectResponseAllOfProjectBrief getProjectBrief() {
    return projectBrief;
  }

  public void setProjectBrief(ProjectResponseAllOfProjectBrief projectBrief) {
    this.projectBrief = projectBrief;
  }

  public ProjectResponse team(ProjectResponseAllOfTeam team) {
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
  public ProjectResponseAllOfTeam getTeam() {
    return team;
  }

  public void setTeam(ProjectResponseAllOfTeam team) {
    this.team = team;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectResponse projectResponse = (ProjectResponse) o;
    return Objects.equals(this.gid, projectResponse.gid) &&
        Objects.equals(this.resourceType, projectResponse.resourceType) &&
        Objects.equals(this.name, projectResponse.name) &&
        Objects.equals(this.archived, projectResponse.archived) &&
        equalsNullable(this.color, projectResponse.color) &&
        Objects.equals(this.createdAt, projectResponse.createdAt) &&
        equalsNullable(this.currentStatus, projectResponse.currentStatus) &&
        equalsNullable(this.currentStatusUpdate, projectResponse.currentStatusUpdate) &&
        Objects.equals(this.customFieldSettings, projectResponse.customFieldSettings) &&
        Objects.equals(this.defaultView, projectResponse.defaultView) &&
        equalsNullable(this.dueDate, projectResponse.dueDate) &&
        equalsNullable(this.dueOn, projectResponse.dueOn) &&
        Objects.equals(this.htmlNotes, projectResponse.htmlNotes) &&
        Objects.equals(this.isTemplate, projectResponse.isTemplate) &&
        Objects.equals(this.members, projectResponse.members) &&
        Objects.equals(this.modifiedAt, projectResponse.modifiedAt) &&
        Objects.equals(this.notes, projectResponse.notes) &&
        Objects.equals(this._public, projectResponse._public) &&
        equalsNullable(this.startOn, projectResponse.startOn) &&
        Objects.equals(this.workspace, projectResponse.workspace) &&
        Objects.equals(this.completed, projectResponse.completed) &&
        equalsNullable(this.completedAt, projectResponse.completedAt) &&
        Objects.equals(this.completedBy, projectResponse.completedBy) &&
        Objects.equals(this.createdFromTemplate, projectResponse.createdFromTemplate) &&
        Objects.equals(this.customFields, projectResponse.customFields) &&
        Objects.equals(this.followers, projectResponse.followers) &&
        equalsNullable(this.icon, projectResponse.icon) &&
        equalsNullable(this.owner, projectResponse.owner) &&
        Objects.equals(this.permalinkUrl, projectResponse.permalinkUrl) &&
        Objects.equals(this.projectBrief, projectResponse.projectBrief) &&
        Objects.equals(this.team, projectResponse.team);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, archived, hashCodeNullable(color), createdAt, hashCodeNullable(currentStatus), hashCodeNullable(currentStatusUpdate), customFieldSettings, defaultView, hashCodeNullable(dueDate), hashCodeNullable(dueOn), htmlNotes, isTemplate, members, modifiedAt, notes, _public, hashCodeNullable(startOn), workspace, completed, hashCodeNullable(completedAt), completedBy, createdFromTemplate, customFields, followers, hashCodeNullable(icon), hashCodeNullable(owner), permalinkUrl, projectBrief, team);
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
    sb.append("class ProjectResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    currentStatusUpdate: ").append(toIndentedString(currentStatusUpdate)).append("\n");
    sb.append("    customFieldSettings: ").append(toIndentedString(customFieldSettings)).append("\n");
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    htmlNotes: ").append(toIndentedString(htmlNotes)).append("\n");
    sb.append("    isTemplate: ").append(toIndentedString(isTemplate)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
    sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    completedBy: ").append(toIndentedString(completedBy)).append("\n");
    sb.append("    createdFromTemplate: ").append(toIndentedString(createdFromTemplate)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    projectBrief: ").append(toIndentedString(projectBrief)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

