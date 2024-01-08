package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FilterOwner;
import org.openapitools.model.FilterSharedUsers;
import org.openapitools.model.FilterSubscriptions;
import org.openapitools.model.SharePermission;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a filter.
 */

@Schema(name = "Filter", description = "Details about a filter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Filter {

  private String description;

  @Valid
  private List<@Valid SharePermission> editPermissions;

  private Boolean favourite;

  private Long favouritedCount;

  private String id;

  private String jql;

  private String name;

  private FilterOwner owner;

  private URI searchUrl;

  private URI self;

  @Valid
  private List<@Valid SharePermission> sharePermissions;

  private FilterSharedUsers sharedUsers;

  private FilterSubscriptions subscriptions;

  private URI viewUrl;

  public Filter() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Filter(String name) {
    this.name = name;
  }

  public Filter description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the filter.
   * @return description
  */
  
  @Schema(name = "description", description = "A description of the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Filter editPermissions(List<@Valid SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

  public Filter addEditPermissionsItem(SharePermission editPermissionsItem) {
    if (this.editPermissions == null) {
      this.editPermissions = new ArrayList<>();
    }
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

  /**
   * The groups and projects that can edit the filter.
   * @return editPermissions
  */
  @Valid 
  @Schema(name = "editPermissions", description = "The groups and projects that can edit the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editPermissions")
  public List<@Valid SharePermission> getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(List<@Valid SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }

  public Filter favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

  /**
   * Whether the filter is selected as a favorite.
   * @return favourite
  */
  
  @Schema(name = "favourite", description = "Whether the filter is selected as a favorite.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favourite")
  public Boolean getFavourite() {
    return favourite;
  }

  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }

  public Filter favouritedCount(Long favouritedCount) {
    this.favouritedCount = favouritedCount;
    return this;
  }

  /**
   * The count of how many users have selected this filter as a favorite, including the filter owner.
   * @return favouritedCount
  */
  
  @Schema(name = "favouritedCount", accessMode = Schema.AccessMode.READ_ONLY, description = "The count of how many users have selected this filter as a favorite, including the filter owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favouritedCount")
  public Long getFavouritedCount() {
    return favouritedCount;
  }

  public void setFavouritedCount(Long favouritedCount) {
    this.favouritedCount = favouritedCount;
  }

  public Filter id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the filter.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The unique identifier for the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Filter jql(String jql) {
    this.jql = jql;
    return this;
  }

  /**
   * The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.
   * @return jql
  */
  
  @Schema(name = "jql", description = "The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jql")
  public String getJql() {
    return jql;
  }

  public void setJql(String jql) {
    this.jql = jql;
  }

  public Filter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the filter. Must be unique.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the filter. Must be unique.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Filter owner(FilterOwner owner) {
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
  public FilterOwner getOwner() {
    return owner;
  }

  public void setOwner(FilterOwner owner) {
    this.owner = owner;
  }

  public Filter searchUrl(URI searchUrl) {
    this.searchUrl = searchUrl;
    return this;
  }

  /**
   * A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.
   * @return searchUrl
  */
  @Valid 
  @Schema(name = "searchUrl", accessMode = Schema.AccessMode.READ_ONLY, description = "A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchUrl")
  public URI getSearchUrl() {
    return searchUrl;
  }

  public void setSearchUrl(URI searchUrl) {
    this.searchUrl = searchUrl;
  }

  public Filter self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the filter.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public Filter sharePermissions(List<@Valid SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public Filter addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

  /**
   * The groups and projects that the filter is shared with.
   * @return sharePermissions
  */
  @Valid 
  @Schema(name = "sharePermissions", description = "The groups and projects that the filter is shared with.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sharePermissions")
  public List<@Valid SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<@Valid SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }

  public Filter sharedUsers(FilterSharedUsers sharedUsers) {
    this.sharedUsers = sharedUsers;
    return this;
  }

  /**
   * Get sharedUsers
   * @return sharedUsers
  */
  @Valid 
  @Schema(name = "sharedUsers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sharedUsers")
  public FilterSharedUsers getSharedUsers() {
    return sharedUsers;
  }

  public void setSharedUsers(FilterSharedUsers sharedUsers) {
    this.sharedUsers = sharedUsers;
  }

  public Filter subscriptions(FilterSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  /**
   * Get subscriptions
   * @return subscriptions
  */
  @Valid 
  @Schema(name = "subscriptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptions")
  public FilterSubscriptions getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(FilterSubscriptions subscriptions) {
    this.subscriptions = subscriptions;
  }

  public Filter viewUrl(URI viewUrl) {
    this.viewUrl = viewUrl;
    return this;
  }

  /**
   * A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.
   * @return viewUrl
  */
  @Valid 
  @Schema(name = "viewUrl", accessMode = Schema.AccessMode.READ_ONLY, description = "A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("viewUrl")
  public URI getViewUrl() {
    return viewUrl;
  }

  public void setViewUrl(URI viewUrl) {
    this.viewUrl = viewUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this.description, filter.description) &&
        Objects.equals(this.editPermissions, filter.editPermissions) &&
        Objects.equals(this.favourite, filter.favourite) &&
        Objects.equals(this.favouritedCount, filter.favouritedCount) &&
        Objects.equals(this.id, filter.id) &&
        Objects.equals(this.jql, filter.jql) &&
        Objects.equals(this.name, filter.name) &&
        Objects.equals(this.owner, filter.owner) &&
        Objects.equals(this.searchUrl, filter.searchUrl) &&
        Objects.equals(this.self, filter.self) &&
        Objects.equals(this.sharePermissions, filter.sharePermissions) &&
        Objects.equals(this.sharedUsers, filter.sharedUsers) &&
        Objects.equals(this.subscriptions, filter.subscriptions) &&
        Objects.equals(this.viewUrl, filter.viewUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, editPermissions, favourite, favouritedCount, id, jql, name, owner, searchUrl, self, sharePermissions, sharedUsers, subscriptions, viewUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    favouritedCount: ").append(toIndentedString(favouritedCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
    sb.append("    sharedUsers: ").append(toIndentedString(sharedUsers)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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

