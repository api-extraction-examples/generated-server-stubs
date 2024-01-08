package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FilterDetailsOwner;
import org.openapitools.model.FilterSubscription;
import org.openapitools.model.SharePermission;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a filter.
 */

@Schema(name = "FilterDetails", description = "Details of a filter.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FilterDetails {

  private String description;

  @Valid
  private List<@Valid SharePermission> editPermissions;

  private String expand;

  private Boolean favourite;

  private Long favouritedCount;

  private String id;

  private String jql;

  private String name;

  private FilterDetailsOwner owner;

  private URI searchUrl;

  private URI self;

  @Valid
  private List<@Valid SharePermission> sharePermissions;

  @Valid
  private List<@Valid FilterSubscription> subscriptions;

  private URI viewUrl;

  public FilterDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FilterDetails(String name) {
    this.name = name;
  }

  public FilterDetails description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the filter.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FilterDetails editPermissions(List<@Valid SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
    return this;
  }

  public FilterDetails addEditPermissionsItem(SharePermission editPermissionsItem) {
    if (this.editPermissions == null) {
      this.editPermissions = new ArrayList<>();
    }
    this.editPermissions.add(editPermissionsItem);
    return this;
  }

  /**
   * The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.
   * @return editPermissions
  */
  @Valid 
  @Schema(name = "editPermissions", description = "The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("editPermissions")
  public List<@Valid SharePermission> getEditPermissions() {
    return editPermissions;
  }

  public void setEditPermissions(List<@Valid SharePermission> editPermissions) {
    this.editPermissions = editPermissions;
  }

  public FilterDetails expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * Expand options that include additional filter details in the response.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "Expand options that include additional filter details in the response.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public FilterDetails favourite(Boolean favourite) {
    this.favourite = favourite;
    return this;
  }

  /**
   * Whether the filter is selected as a favorite by any users, not including the filter owner.
   * @return favourite
  */
  
  @Schema(name = "favourite", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the filter is selected as a favorite by any users, not including the filter owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("favourite")
  public Boolean getFavourite() {
    return favourite;
  }

  public void setFavourite(Boolean favourite) {
    this.favourite = favourite;
  }

  public FilterDetails favouritedCount(Long favouritedCount) {
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

  public FilterDetails id(String id) {
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

  public FilterDetails jql(String jql) {
    this.jql = jql;
    return this;
  }

  /**
   * The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.
   * @return jql
  */
  
  @Schema(name = "jql", accessMode = Schema.AccessMode.READ_ONLY, description = "The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jql")
  public String getJql() {
    return jql;
  }

  public void setJql(String jql) {
    this.jql = jql;
  }

  public FilterDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the filter.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the filter.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FilterDetails owner(FilterDetailsOwner owner) {
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
  public FilterDetailsOwner getOwner() {
    return owner;
  }

  public void setOwner(FilterDetailsOwner owner) {
    this.owner = owner;
  }

  public FilterDetails searchUrl(URI searchUrl) {
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

  public FilterDetails self(URI self) {
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

  public FilterDetails sharePermissions(List<@Valid SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
    return this;
  }

  public FilterDetails addSharePermissionsItem(SharePermission sharePermissionsItem) {
    if (this.sharePermissions == null) {
      this.sharePermissions = new ArrayList<>();
    }
    this.sharePermissions.add(sharePermissionsItem);
    return this;
  }

  /**
   * The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.
   * @return sharePermissions
  */
  @Valid 
  @Schema(name = "sharePermissions", description = "The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sharePermissions")
  public List<@Valid SharePermission> getSharePermissions() {
    return sharePermissions;
  }

  public void setSharePermissions(List<@Valid SharePermission> sharePermissions) {
    this.sharePermissions = sharePermissions;
  }

  public FilterDetails subscriptions(List<@Valid FilterSubscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public FilterDetails addSubscriptionsItem(FilterSubscription subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

  /**
   * The users that are subscribed to the filter.
   * @return subscriptions
  */
  @Valid 
  @Schema(name = "subscriptions", accessMode = Schema.AccessMode.READ_ONLY, description = "The users that are subscribed to the filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subscriptions")
  public List<@Valid FilterSubscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<@Valid FilterSubscription> subscriptions) {
    this.subscriptions = subscriptions;
  }

  public FilterDetails viewUrl(URI viewUrl) {
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
    FilterDetails filterDetails = (FilterDetails) o;
    return Objects.equals(this.description, filterDetails.description) &&
        Objects.equals(this.editPermissions, filterDetails.editPermissions) &&
        Objects.equals(this.expand, filterDetails.expand) &&
        Objects.equals(this.favourite, filterDetails.favourite) &&
        Objects.equals(this.favouritedCount, filterDetails.favouritedCount) &&
        Objects.equals(this.id, filterDetails.id) &&
        Objects.equals(this.jql, filterDetails.jql) &&
        Objects.equals(this.name, filterDetails.name) &&
        Objects.equals(this.owner, filterDetails.owner) &&
        Objects.equals(this.searchUrl, filterDetails.searchUrl) &&
        Objects.equals(this.self, filterDetails.self) &&
        Objects.equals(this.sharePermissions, filterDetails.sharePermissions) &&
        Objects.equals(this.subscriptions, filterDetails.subscriptions) &&
        Objects.equals(this.viewUrl, filterDetails.viewUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, editPermissions, expand, favourite, favouritedCount, id, jql, name, owner, searchUrl, self, sharePermissions, subscriptions, viewUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilterDetails {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editPermissions: ").append(toIndentedString(editPermissions)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    favourite: ").append(toIndentedString(favourite)).append("\n");
    sb.append("    favouritedCount: ").append(toIndentedString(favouritedCount)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    searchUrl: ").append(toIndentedString(searchUrl)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    sharePermissions: ").append(toIndentedString(sharePermissions)).append("\n");
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

