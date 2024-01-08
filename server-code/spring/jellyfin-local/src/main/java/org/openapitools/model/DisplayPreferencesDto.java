package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ScrollDirection;
import org.openapitools.model.SortOrder;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Defines the display preferences for any item that supports them (usually Folders).
 */

@Schema(name = "DisplayPreferencesDto", description = "Defines the display preferences for any item that supports them (usually Folders).")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class DisplayPreferencesDto {

  private JsonNullable<String> client = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<Map<String, String>> customPrefs = JsonNullable.<Map<String, String>>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private JsonNullable<String> indexBy = JsonNullable.<String>undefined();

  private Integer primaryImageHeight;

  private Integer primaryImageWidth;

  private Boolean rememberIndexing;

  private Boolean rememberSorting;

  private ScrollDirection scrollDirection;

  private Boolean showBackdrop;

  private Boolean showSidebar;

  private JsonNullable<String> sortBy = JsonNullable.<String>undefined();

  private SortOrder sortOrder;

  private JsonNullable<String> viewType = JsonNullable.<String>undefined();

  public DisplayPreferencesDto client(String client) {
    this.client = JsonNullable.of(client);
    return this;
  }

  /**
   * Gets or sets the client.
   * @return client
  */
  
  @Schema(name = "Client", description = "Gets or sets the client.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Client")
  public JsonNullable<String> getClient() {
    return client;
  }

  public void setClient(JsonNullable<String> client) {
    this.client = client;
  }

  public DisplayPreferencesDto customPrefs(Map<String, String> customPrefs) {
    this.customPrefs = JsonNullable.of(customPrefs);
    return this;
  }

  public DisplayPreferencesDto putCustomPrefsItem(String key, String customPrefsItem) {
    if (this.customPrefs == null || !this.customPrefs.isPresent()) {
      this.customPrefs = JsonNullable.of(new HashMap<>());
    }
    this.customPrefs.get().put(key, customPrefsItem);
    return this;
  }

  /**
   * Gets or sets the custom prefs.
   * @return customPrefs
  */
  
  @Schema(name = "CustomPrefs", description = "Gets or sets the custom prefs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomPrefs")
  public JsonNullable<Map<String, String>> getCustomPrefs() {
    return customPrefs;
  }

  public void setCustomPrefs(JsonNullable<Map<String, String>> customPrefs) {
    this.customPrefs = customPrefs;
  }

  public DisplayPreferencesDto id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the user id.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the user id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public DisplayPreferencesDto indexBy(String indexBy) {
    this.indexBy = JsonNullable.of(indexBy);
    return this;
  }

  /**
   * Gets or sets the index by.
   * @return indexBy
  */
  
  @Schema(name = "IndexBy", description = "Gets or sets the index by.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndexBy")
  public JsonNullable<String> getIndexBy() {
    return indexBy;
  }

  public void setIndexBy(JsonNullable<String> indexBy) {
    this.indexBy = indexBy;
  }

  public DisplayPreferencesDto primaryImageHeight(Integer primaryImageHeight) {
    this.primaryImageHeight = primaryImageHeight;
    return this;
  }

  /**
   * Gets or sets the height of the primary image.
   * @return primaryImageHeight
  */
  
  @Schema(name = "PrimaryImageHeight", description = "Gets or sets the height of the primary image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageHeight")
  public Integer getPrimaryImageHeight() {
    return primaryImageHeight;
  }

  public void setPrimaryImageHeight(Integer primaryImageHeight) {
    this.primaryImageHeight = primaryImageHeight;
  }

  public DisplayPreferencesDto primaryImageWidth(Integer primaryImageWidth) {
    this.primaryImageWidth = primaryImageWidth;
    return this;
  }

  /**
   * Gets or sets the width of the primary image.
   * @return primaryImageWidth
  */
  
  @Schema(name = "PrimaryImageWidth", description = "Gets or sets the width of the primary image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageWidth")
  public Integer getPrimaryImageWidth() {
    return primaryImageWidth;
  }

  public void setPrimaryImageWidth(Integer primaryImageWidth) {
    this.primaryImageWidth = primaryImageWidth;
  }

  public DisplayPreferencesDto rememberIndexing(Boolean rememberIndexing) {
    this.rememberIndexing = rememberIndexing;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [remember indexing].
   * @return rememberIndexing
  */
  
  @Schema(name = "RememberIndexing", description = "Gets or sets a value indicating whether [remember indexing].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RememberIndexing")
  public Boolean getRememberIndexing() {
    return rememberIndexing;
  }

  public void setRememberIndexing(Boolean rememberIndexing) {
    this.rememberIndexing = rememberIndexing;
  }

  public DisplayPreferencesDto rememberSorting(Boolean rememberSorting) {
    this.rememberSorting = rememberSorting;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [remember sorting].
   * @return rememberSorting
  */
  
  @Schema(name = "RememberSorting", description = "Gets or sets a value indicating whether [remember sorting].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RememberSorting")
  public Boolean getRememberSorting() {
    return rememberSorting;
  }

  public void setRememberSorting(Boolean rememberSorting) {
    this.rememberSorting = rememberSorting;
  }

  public DisplayPreferencesDto scrollDirection(ScrollDirection scrollDirection) {
    this.scrollDirection = scrollDirection;
    return this;
  }

  /**
   * Get scrollDirection
   * @return scrollDirection
  */
  @Valid 
  @Schema(name = "ScrollDirection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ScrollDirection")
  public ScrollDirection getScrollDirection() {
    return scrollDirection;
  }

  public void setScrollDirection(ScrollDirection scrollDirection) {
    this.scrollDirection = scrollDirection;
  }

  public DisplayPreferencesDto showBackdrop(Boolean showBackdrop) {
    this.showBackdrop = showBackdrop;
    return this;
  }

  /**
   * Gets or sets a value indicating whether to show backdrops on this item.
   * @return showBackdrop
  */
  
  @Schema(name = "ShowBackdrop", description = "Gets or sets a value indicating whether to show backdrops on this item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ShowBackdrop")
  public Boolean getShowBackdrop() {
    return showBackdrop;
  }

  public void setShowBackdrop(Boolean showBackdrop) {
    this.showBackdrop = showBackdrop;
  }

  public DisplayPreferencesDto showSidebar(Boolean showSidebar) {
    this.showSidebar = showSidebar;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [show sidebar].
   * @return showSidebar
  */
  
  @Schema(name = "ShowSidebar", description = "Gets or sets a value indicating whether [show sidebar].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ShowSidebar")
  public Boolean getShowSidebar() {
    return showSidebar;
  }

  public void setShowSidebar(Boolean showSidebar) {
    this.showSidebar = showSidebar;
  }

  public DisplayPreferencesDto sortBy(String sortBy) {
    this.sortBy = JsonNullable.of(sortBy);
    return this;
  }

  /**
   * Gets or sets the sort by.
   * @return sortBy
  */
  
  @Schema(name = "SortBy", description = "Gets or sets the sort by.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortBy")
  public JsonNullable<String> getSortBy() {
    return sortBy;
  }

  public void setSortBy(JsonNullable<String> sortBy) {
    this.sortBy = sortBy;
  }

  public DisplayPreferencesDto sortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Get sortOrder
   * @return sortOrder
  */
  @Valid 
  @Schema(name = "SortOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortOrder")
  public SortOrder getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrder sortOrder) {
    this.sortOrder = sortOrder;
  }

  public DisplayPreferencesDto viewType(String viewType) {
    this.viewType = JsonNullable.of(viewType);
    return this;
  }

  /**
   * Gets or sets the type of the view.
   * @return viewType
  */
  
  @Schema(name = "ViewType", description = "Gets or sets the type of the view.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ViewType")
  public JsonNullable<String> getViewType() {
    return viewType;
  }

  public void setViewType(JsonNullable<String> viewType) {
    this.viewType = viewType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplayPreferencesDto displayPreferencesDto = (DisplayPreferencesDto) o;
    return equalsNullable(this.client, displayPreferencesDto.client) &&
        equalsNullable(this.customPrefs, displayPreferencesDto.customPrefs) &&
        equalsNullable(this.id, displayPreferencesDto.id) &&
        equalsNullable(this.indexBy, displayPreferencesDto.indexBy) &&
        Objects.equals(this.primaryImageHeight, displayPreferencesDto.primaryImageHeight) &&
        Objects.equals(this.primaryImageWidth, displayPreferencesDto.primaryImageWidth) &&
        Objects.equals(this.rememberIndexing, displayPreferencesDto.rememberIndexing) &&
        Objects.equals(this.rememberSorting, displayPreferencesDto.rememberSorting) &&
        Objects.equals(this.scrollDirection, displayPreferencesDto.scrollDirection) &&
        Objects.equals(this.showBackdrop, displayPreferencesDto.showBackdrop) &&
        Objects.equals(this.showSidebar, displayPreferencesDto.showSidebar) &&
        equalsNullable(this.sortBy, displayPreferencesDto.sortBy) &&
        Objects.equals(this.sortOrder, displayPreferencesDto.sortOrder) &&
        equalsNullable(this.viewType, displayPreferencesDto.viewType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(client), hashCodeNullable(customPrefs), hashCodeNullable(id), hashCodeNullable(indexBy), primaryImageHeight, primaryImageWidth, rememberIndexing, rememberSorting, scrollDirection, showBackdrop, showSidebar, hashCodeNullable(sortBy), sortOrder, hashCodeNullable(viewType));
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
    sb.append("class DisplayPreferencesDto {\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    customPrefs: ").append(toIndentedString(customPrefs)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    indexBy: ").append(toIndentedString(indexBy)).append("\n");
    sb.append("    primaryImageHeight: ").append(toIndentedString(primaryImageHeight)).append("\n");
    sb.append("    primaryImageWidth: ").append(toIndentedString(primaryImageWidth)).append("\n");
    sb.append("    rememberIndexing: ").append(toIndentedString(rememberIndexing)).append("\n");
    sb.append("    rememberSorting: ").append(toIndentedString(rememberSorting)).append("\n");
    sb.append("    scrollDirection: ").append(toIndentedString(scrollDirection)).append("\n");
    sb.append("    showBackdrop: ").append(toIndentedString(showBackdrop)).append("\n");
    sb.append("    showSidebar: ").append(toIndentedString(showSidebar)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    viewType: ").append(toIndentedString(viewType)).append("\n");
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

