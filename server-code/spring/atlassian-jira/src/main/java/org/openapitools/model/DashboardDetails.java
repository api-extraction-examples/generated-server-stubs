package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

@Schema(name = "DashboardDetails", description = "Details of a dashboard.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DashboardDetails {

  private String description;

  @Valid
  private List<@Valid SharePermission> editPermissions = new ArrayList<>();

  private String name;

  @Valid
  private List<@Valid SharePermission> sharePermissions = new ArrayList<>();

  public DashboardDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DashboardDetails(List<@Valid SharePermission> editPermissions, String name, List<@Valid SharePermission> sharePermissions) {
    this.editPermissions = editPermissions;
    this.name = name;
    this.sharePermissions = sharePermissions;
  }

  public DashboardDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the dashboard.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the dashboard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DashboardDetails editPermissions(List<@Valid SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

  public DashboardDetails addEditPermissionsItem(SharePermission editPermissionsItem) {
    if (this.editPermissions == null) {
      this.editPermissions = new ArrayList<>();
    }
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

  /**
   * The edit permissions for the dashboard.
   * @return editPermissions
  */
  @NotNull @Valid 
  @Schema(name = "editPermissions", description = "The edit permissions for the dashboard.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("editPermissions")
  public List<@Valid SharePermission> getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(List<@Valid SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }

  public DashboardDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the dashboard.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the dashboard.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DashboardDetails sharePermissions(List<@Valid SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public DashboardDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

  /**
   * The share permissions for the dashboard.
   * @return sharePermissions
  */
  @NotNull @Valid 
  @Schema(name = "sharePermissions", description = "The share permissions for the dashboard.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("sharePermissions")
  public List<@Valid SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<@Valid SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardDetails dashboardDetails = (DashboardDetails) o;
    return Objects.equals(this.description, dashboardDetails.description) &&
        Objects.equals(this.editPermissions, dashboardDetails.editPermissions) &&
        Objects.equals(this.name, dashboardDetails.name) &&
        Objects.equals(this.sharePermissions, dashboardDetails.sharePermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, editPermissions, name, sharePermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
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

