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
import org.openapitools.model.PortfolioResponseAllOfCurrentStatusUpdate;
import org.openapitools.model.PortfolioResponseAllOfWorkspace;
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
 * PortfolioResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class PortfolioResponse {

  private String gid;

  private String resourceType;

  private String name;

  /**
   * Color of the portfolio.
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
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ColorEnum color;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private UserCompact createdBy;

  private JsonNullable<PortfolioResponseAllOfCurrentStatusUpdate> currentStatusUpdate = JsonNullable.<PortfolioResponseAllOfCurrentStatusUpdate>undefined();

  @Valid
  private List<@Valid CustomFieldSettingResponse> customFieldSettings;

  @Valid
  private List<@Valid CustomFieldCompact> customFields;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dueOn = JsonNullable.<OffsetDateTime>undefined();

  @Valid
  private List<@Valid UserCompact> members;

  private UserCompact owner;

  private String permalinkUrl;

  private Boolean _public;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private JsonNullable<LocalDate> startOn = JsonNullable.<LocalDate>undefined();

  private PortfolioResponseAllOfWorkspace workspace;

  public PortfolioResponse gid(String gid) {
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

  public PortfolioResponse resourceType(String resourceType) {
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

  public PortfolioResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the portfolio.
   * @return name
  */
  
  @Schema(name = "name", example = "Bug Portfolio", description = "The name of the portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PortfolioResponse color(ColorEnum color) {
    this.color = color;
    return this;
  }

  /**
   * Color of the portfolio.
   * @return color
  */
  
  @Schema(name = "color", example = "light-green", description = "Color of the portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public ColorEnum getColor() {
    return color;
  }

  public void setColor(ColorEnum color) {
    this.color = color;
  }

  public PortfolioResponse createdAt(OffsetDateTime createdAt) {
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

  public PortfolioResponse createdBy(UserCompact createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  */
  @Valid 
  @Schema(name = "created_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_by")
  public UserCompact getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UserCompact createdBy) {
    this.createdBy = createdBy;
  }

  public PortfolioResponse currentStatusUpdate(PortfolioResponseAllOfCurrentStatusUpdate currentStatusUpdate) {
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
  public JsonNullable<PortfolioResponseAllOfCurrentStatusUpdate> getCurrentStatusUpdate() {
    return currentStatusUpdate;
  }

  public void setCurrentStatusUpdate(JsonNullable<PortfolioResponseAllOfCurrentStatusUpdate> currentStatusUpdate) {
    this.currentStatusUpdate = currentStatusUpdate;
  }

  public PortfolioResponse customFieldSettings(List<@Valid CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
    return this;
  }

  public PortfolioResponse addCustomFieldSettingsItem(CustomFieldSettingResponse customFieldSettingsItem) {
    if (this.customFieldSettings == null) {
      this.customFieldSettings = new ArrayList<>();
    }
    this.customFieldSettings.add(customFieldSettingsItem);
    return this;
  }

  /**
   * Array of custom field settings applied to the portfolio.
   * @return customFieldSettings
  */
  @Valid 
  @Schema(name = "custom_field_settings", description = "Array of custom field settings applied to the portfolio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_field_settings")
  public List<@Valid CustomFieldSettingResponse> getCustomFieldSettings() {
    return customFieldSettings;
  }

  public void setCustomFieldSettings(List<@Valid CustomFieldSettingResponse> customFieldSettings) {
    this.customFieldSettings = customFieldSettings;
  }

  public PortfolioResponse customFields(List<@Valid CustomFieldCompact> customFields) {
    this.customFields = customFields;
    return this;
  }

  public PortfolioResponse addCustomFieldsItem(CustomFieldCompact customFieldsItem) {
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
  @Schema(name = "custom_fields", description = "Array of Custom Fields.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_fields")
  public List<@Valid CustomFieldCompact> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(List<@Valid CustomFieldCompact> customFields) {
    this.customFields = customFields;
  }

  public PortfolioResponse dueOn(OffsetDateTime dueOn) {
    this.dueOn = JsonNullable.of(dueOn);
    return this;
  }

  /**
   * The localized day on which this portfolio is due. This takes a date with format YYYY-MM-DD.
   * @return dueOn
  */
  @Valid 
  @Schema(name = "due_on", description = "The localized day on which this portfolio is due. This takes a date with format YYYY-MM-DD.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("due_on")
  public JsonNullable<OffsetDateTime> getDueOn() {
    return dueOn;
  }

  public void setDueOn(JsonNullable<OffsetDateTime> dueOn) {
    this.dueOn = dueOn;
  }

  public PortfolioResponse members(List<@Valid UserCompact> members) {
    this.members = members;
    return this;
  }

  public PortfolioResponse addMembersItem(UserCompact membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * Get members
   * @return members
  */
  @Valid 
  @Schema(name = "members", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
  public List<@Valid UserCompact> getMembers() {
    return members;
  }

  public void setMembers(List<@Valid UserCompact> members) {
    this.members = members;
  }

  public PortfolioResponse owner(UserCompact owner) {
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
  public UserCompact getOwner() {
    return owner;
  }

  public void setOwner(UserCompact owner) {
    this.owner = owner;
  }

  public PortfolioResponse permalinkUrl(String permalinkUrl) {
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

  public PortfolioResponse _public(Boolean _public) {
    this._public = _public;
    return this;
  }

  /**
   * True if the portfolio is public to its workspace members.
   * @return _public
  */
  
  @Schema(name = "public", example = "false", description = "True if the portfolio is public to its workspace members.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public")
  public Boolean getPublic() {
    return _public;
  }

  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  public PortfolioResponse startOn(LocalDate startOn) {
    this.startOn = JsonNullable.of(startOn);
    return this;
  }

  /**
   * The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*
   * @return startOn
  */
  @Valid 
  @Schema(name = "start_on", example = "Fri Sep 13 20:00:00 AST 2019", description = "The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_on")
  public JsonNullable<LocalDate> getStartOn() {
    return startOn;
  }

  public void setStartOn(JsonNullable<LocalDate> startOn) {
    this.startOn = startOn;
  }

  public PortfolioResponse workspace(PortfolioResponseAllOfWorkspace workspace) {
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
  public PortfolioResponseAllOfWorkspace getWorkspace() {
    return workspace;
  }

  public void setWorkspace(PortfolioResponseAllOfWorkspace workspace) {
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
    PortfolioResponse portfolioResponse = (PortfolioResponse) o;
    return Objects.equals(this.gid, portfolioResponse.gid) &&
        Objects.equals(this.resourceType, portfolioResponse.resourceType) &&
        Objects.equals(this.name, portfolioResponse.name) &&
        Objects.equals(this.color, portfolioResponse.color) &&
        Objects.equals(this.createdAt, portfolioResponse.createdAt) &&
        Objects.equals(this.createdBy, portfolioResponse.createdBy) &&
        equalsNullable(this.currentStatusUpdate, portfolioResponse.currentStatusUpdate) &&
        Objects.equals(this.customFieldSettings, portfolioResponse.customFieldSettings) &&
        Objects.equals(this.customFields, portfolioResponse.customFields) &&
        equalsNullable(this.dueOn, portfolioResponse.dueOn) &&
        Objects.equals(this.members, portfolioResponse.members) &&
        Objects.equals(this.owner, portfolioResponse.owner) &&
        Objects.equals(this.permalinkUrl, portfolioResponse.permalinkUrl) &&
        Objects.equals(this._public, portfolioResponse._public) &&
        equalsNullable(this.startOn, portfolioResponse.startOn) &&
        Objects.equals(this.workspace, portfolioResponse.workspace);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, color, createdAt, createdBy, hashCodeNullable(currentStatusUpdate), customFieldSettings, customFields, hashCodeNullable(dueOn), members, owner, permalinkUrl, _public, hashCodeNullable(startOn), workspace);
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
    sb.append("class PortfolioResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    currentStatusUpdate: ").append(toIndentedString(currentStatusUpdate)).append("\n");
    sb.append("    customFieldSettings: ").append(toIndentedString(customFieldSettings)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    permalinkUrl: ").append(toIndentedString(permalinkUrl)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    startOn: ").append(toIndentedString(startOn)).append("\n");
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

