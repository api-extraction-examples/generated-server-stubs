package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DashboardOwner;
import org.openapitools.model.SharePermission;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a dashboard.
 */

@Schema(name = "Dashboard", description = "Details of a dashboard.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Dashboard {

  private Integer automaticRefreshMs;

  private String description;

  @Valid
  private List<@Valid SharePermission> editPermissions;

  private String id;

  private Boolean isFavourite;

  private Boolean isWritable;

  private String name;

  private DashboardOwner owner;

  private Long popularity;

  private Integer rank;

  private URI self;

  @Valid
  private List<@Valid SharePermission> sharePermissions;

  private Boolean systemDashboard;

  private String view;

  public Dashboard automaticRefreshMs(Integer automaticRefreshMs) {
    this.automaticRefreshMs = automaticRefreshMs;
    return this;
  }

  /**
   * The automatic refresh interval for the dashboard in milliseconds.
   * @return automaticRefreshMs
  */
  
  @Schema(name = "automaticRefreshMs", accessMode = Schema.AccessMode.READ_ONLY, description = "The automatic refresh interval for the dashboard in milliseconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("automaticRefreshMs")
  public Integer getAutomaticRefreshMs() {
    return automaticRefreshMs;
  }

  public void setAutomaticRefreshMs(Integer automaticRefreshMs) {
    this.automaticRefreshMs = automaticRefreshMs;
  }

  public Dashboard description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Dashboard editPermissions(List<@Valid SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

  public Dashboard addEditPermissionsItem(SharePermission editPermissionsItem) {
    if (this.editPermissions == null) {
      this.editPermissions = new ArrayList<>();
    }
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

  /**
   * The details of any edit share permissions for the dashboard.
   * @return editPermissions
  */
  @Valid 
  @Schema(name = "editPermissions", accessMode = Schema.AccessMode.READ_ONLY, description = "The details of any edit share permissions for the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editPermissions")
  public List<@Valid SharePermission> getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(List<@Valid SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }

  public Dashboard id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the dashboard.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Dashboard isFavourite(Boolean isFavourite) {
    this.isFavourite = isFavourite;
    return this;
  }

  /**
   * Whether the dashboard is selected as a favorite by the user.
   * @return isFavourite
  */
  
  @Schema(name = "isFavourite", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the dashboard is selected as a favorite by the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isFavourite")
  public Boolean getIsFavourite() {
    return isFavourite;
  }

  public void setIsFavourite(Boolean isFavourite) {
    this.isFavourite = isFavourite;
  }

  public Dashboard isWritable(Boolean isWritable) {
    this.isWritable = isWritable;
    return this;
  }

  /**
   * Whether the current user has permission to edit the dashboard.
   * @return isWritable
  */
  
  @Schema(name = "isWritable", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the current user has permission to edit the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isWritable")
  public Boolean getIsWritable() {
    return isWritable;
  }

  public void setIsWritable(Boolean isWritable) {
    this.isWritable = isWritable;
  }

  public Dashboard name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the dashboard.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Dashboard owner(DashboardOwner owner) {
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
  public DashboardOwner getOwner() {
    return owner;
  }

  public void setOwner(DashboardOwner owner) {
    this.owner = owner;
  }

  public Dashboard popularity(Long popularity) {
    this.popularity = popularity;
    return this;
  }

  /**
   * The number of users who have this dashboard as a favorite.
   * @return popularity
  */
  
  @Schema(name = "popularity", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of users who have this dashboard as a favorite.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("popularity")
  public Long getPopularity() {
    return popularity;
  }

  public void setPopularity(Long popularity) {
    this.popularity = popularity;
  }

  public Dashboard rank(Integer rank) {
    this.rank = rank;
    return this;
  }

  /**
   * The rank of this dashboard.
   * @return rank
  */
  
  @Schema(name = "rank", accessMode = Schema.AccessMode.READ_ONLY, description = "The rank of this dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rank")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public Dashboard self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of these dashboard details.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of these dashboard details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public Dashboard sharePermissions(List<@Valid SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public Dashboard addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

  /**
   * The details of any view share permissions for the dashboard.
   * @return sharePermissions
  */
  @Valid 
  @Schema(name = "sharePermissions", accessMode = Schema.AccessMode.READ_ONLY, description = "The details of any view share permissions for the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sharePermissions")
  public List<@Valid SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<@Valid SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }

  public Dashboard systemDashboard(Boolean systemDashboard) {
    this.systemDashboard = systemDashboard;
    return this;
  }

  /**
   * Whether the current dashboard is system dashboard.
   * @return systemDashboard
  */
  
  @Schema(name = "systemDashboard", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the current dashboard is system dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("systemDashboard")
  public Boolean getSystemDashboard() {
    return systemDashboard;
  }

  public void setSystemDashboard(Boolean systemDashboard) {
    this.systemDashboard = systemDashboard;
  }

  public Dashboard view(String view) {
    this.view = view;
    return this;
  }

  /**
   * The URL of the dashboard.
   * @return view
  */
  
  @Schema(name = "view", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view")
  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dashboard dashboard = (Dashboard) o;
    return Objects.equals(this.automaticRefreshMs, dashboard.automaticRefreshMs) &&
        Objects.equals(this.description, dashboard.description) &&
        Objects.equals(this.editPermissions, dashboard.editPermissions) &&
        Objects.equals(this.id, dashboard.id) &&
        Objects.equals(this.isFavourite, dashboard.isFavourite) &&
        Objects.equals(this.isWritable, dashboard.isWritable) &&
        Objects.equals(this.name, dashboard.name) &&
        Objects.equals(this.owner, dashboard.owner) &&
        Objects.equals(this.popularity, dashboard.popularity) &&
        Objects.equals(this.rank, dashboard.rank) &&
        Objects.equals(this.self, dashboard.self) &&
        Objects.equals(this.sharePermissions, dashboard.sharePermissions) &&
        Objects.equals(this.systemDashboard, dashboard.systemDashboard) &&
        Objects.equals(this.view, dashboard.view);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticRefreshMs, description, editPermissions, id, isFavourite, isWritable, name, owner, popularity, rank, self, sharePermissions, systemDashboard, view);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dashboard {\n");
    sb.append("    automaticRefreshMs: ").append(toIndentedString(automaticRefreshMs)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isFavourite: ").append(toIndentedString(isFavourite)).append("\n");
    sb.append("    isWritable: ").append(toIndentedString(isWritable)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    popularity: ").append(toIndentedString(popularity)).append("\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    systemDashboard: ").append(toIndentedString(systemDashboard)).append("\n");
    sb.append("    view: ").append(toIndentedString(view)).append("\n");
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

