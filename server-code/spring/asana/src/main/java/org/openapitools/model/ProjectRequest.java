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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CustomFieldSettingResponse;
import org.openapitools.model.ProjectBaseAllOfCurrentStatus;
import org.openapitools.model.ProjectBaseAllOfCurrentStatusUpdate;
import org.openapitools.model.ProjectBaseAllOfWorkspace;
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
 * ProjectRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class ProjectRequest {

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

  @Valid
  private Map<String, String> customFields = new HashMap<>();

  private String followers;

  private JsonNullable<String> owner = JsonNullable.<String>undefined();

  private String team;

  public ProjectRequest gid(String gid) {
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

  public ProjectRequest resourceType(String resourceType) {
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

  public ProjectRequest name(String name) {
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

  public ProjectRequest archived(Boolean archived) {
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

  public ProjectRequest color(ColorEnum color) {
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

  public ProjectRequest createdAt(OffsetDateTime createdAt) {
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

  public ProjectRequest currentStatus(ProjectBaseAllOfCurrentStatus currentStatus) {
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

  public ProjectRequest currentStatusUpdate(ProjectBaseAllOfCurrentStatusUpdate currentStatusUpdate) {
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

  public ProjectRequest customFieldSettings(List<@Valid CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
    return this;
  }

  public ProjectRequest addCustomFieldSettingsItem(CustomFieldSettingResponse customFieldSettingsItem) {
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

  public ProjectRequest defaultView(DefaultViewEnum defaultView) {
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

  public ProjectRequest dueDate(OffsetDateTime dueDate) {
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

  public ProjectRequest dueOn(OffsetDateTime dueOn) {
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

  public ProjectRequest htmlNotes(String htmlNotes) {
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

  public ProjectRequest isTemplate(Boolean isTemplate) {
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

  public ProjectRequest members(List<@Valid UserCompact> members) {
    this.members = members;
    return this;
  }

  public ProjectRequest addMembersItem(UserCompact membersItem) {
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

  public ProjectRequest modifiedAt(OffsetDateTime modifiedAt) {
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

  public ProjectRequest notes(String notes) {
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

  public ProjectRequest _public(Boolean _public) {
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

  public ProjectRequest startOn(LocalDate startOn) {
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

  public ProjectRequest workspace(ProjectBaseAllOfWorkspace workspace) {
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

  public ProjectRequest customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public ProjectRequest putCustomFieldsItem(String key, String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

  /**
   * An object where each key is a Custom Field GID and each value is an enum GID, string, number, or object.
   * @return customFields
  */
  
  @Schema(name = "custom_fields", example = "{\"4578152156\":\"Not Started\",\"5678904321\":\"On Hold\"}", description = "An object where each key is a Custom Field GID and each value is an enum GID, string, number, or object.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_fields")
  public Map<String, String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }

  public ProjectRequest followers(String followers) {
    this.followers = followers;
    return this;
  }

  /**
   * *Create-only*. Comma separated string of users. Followers are a subset of members who have opted in to receive \"tasks added\" notifications for a project.
   * @return followers
  */
  
  @Schema(name = "followers", example = "12345,23456", description = "*Create-only*. Comma separated string of users. Followers are a subset of members who have opted in to receive \"tasks added\" notifications for a project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followers")
  public String getFollowers() {
    return followers;
  }

  public void setFollowers(String followers) {
    this.followers = followers;
  }

  public ProjectRequest owner(String owner) {
    this.owner = JsonNullable.of(owner);
    return this;
  }

  /**
   * The current owner of the project, may be null.
   * @return owner
  */
  
  @Schema(name = "owner", example = "12345", description = "The current owner of the project, may be null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public JsonNullable<String> getOwner() {
    return owner;
  }

  public void setOwner(JsonNullable<String> owner) {
    this.owner = owner;
  }

  public ProjectRequest team(String team) {
    this.team = team;
    return this;
  }

  /**
   * The team that this project is shared with.
   * @return team
  */
  
  @Schema(name = "team", example = "12345", description = "The team that this project is shared with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
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
    ProjectRequest projectRequest = (ProjectRequest) o;
    return Objects.equals(this.gid, projectRequest.gid) &&
        Objects.equals(this.resourceType, projectRequest.resourceType) &&
        Objects.equals(this.name, projectRequest.name) &&
        Objects.equals(this.archived, projectRequest.archived) &&
        equalsNullable(this.color, projectRequest.color) &&
        Objects.equals(this.createdAt, projectRequest.createdAt) &&
        equalsNullable(this.currentStatus, projectRequest.currentStatus) &&
        equalsNullable(this.currentStatusUpdate, projectRequest.currentStatusUpdate) &&
        Objects.equals(this.customFieldSettings, projectRequest.customFieldSettings) &&
        Objects.equals(this.defaultView, projectRequest.defaultView) &&
        equalsNullable(this.dueDate, projectRequest.dueDate) &&
        equalsNullable(this.dueOn, projectRequest.dueOn) &&
        Objects.equals(this.htmlNotes, projectRequest.htmlNotes) &&
        Objects.equals(this.isTemplate, projectRequest.isTemplate) &&
        Objects.equals(this.members, projectRequest.members) &&
        Objects.equals(this.modifiedAt, projectRequest.modifiedAt) &&
        Objects.equals(this.notes, projectRequest.notes) &&
        Objects.equals(this._public, projectRequest._public) &&
        equalsNullable(this.startOn, projectRequest.startOn) &&
        Objects.equals(this.workspace, projectRequest.workspace) &&
        Objects.equals(this.customFields, projectRequest.customFields) &&
        Objects.equals(this.followers, projectRequest.followers) &&
        equalsNullable(this.owner, projectRequest.owner) &&
        Objects.equals(this.team, projectRequest.team);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, archived, hashCodeNullable(color), createdAt, hashCodeNullable(currentStatus), hashCodeNullable(currentStatusUpdate), customFieldSettings, defaultView, hashCodeNullable(dueDate), hashCodeNullable(dueOn), htmlNotes, isTemplate, members, modifiedAt, notes, _public, hashCodeNullable(startOn), workspace, customFields, followers, hashCodeNullable(owner), team);
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
    sb.append("class ProjectRequest {\n");
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
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

