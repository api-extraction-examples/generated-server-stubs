package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ChannelItemSortField;
import org.openapitools.model.ChannelMediaContentType;
import org.openapitools.model.ChannelMediaType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ChannelFeatures
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ChannelFeatures {

  private JsonNullable<Integer> autoRefreshLevels = JsonNullable.<Integer>undefined();

  private Boolean canFilter;

  private Boolean canSearch;

  @Valid
  private JsonNullable<List<@Valid ChannelMediaContentType>> contentTypes = JsonNullable.<List<@Valid ChannelMediaContentType>>undefined();

  @Valid
  private JsonNullable<List<@Valid ChannelItemSortField>> defaultSortFields = JsonNullable.<List<@Valid ChannelItemSortField>>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private JsonNullable<Integer> maxPageSize = JsonNullable.<Integer>undefined();

  @Valid
  private JsonNullable<List<@Valid ChannelMediaType>> mediaTypes = JsonNullable.<List<@Valid ChannelMediaType>>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private Boolean supportsContentDownloading;

  private Boolean supportsLatestMedia;

  private Boolean supportsSortOrderToggle;

  public ChannelFeatures autoRefreshLevels(Integer autoRefreshLevels) {
    this.autoRefreshLevels = JsonNullable.of(autoRefreshLevels);
    return this;
  }

  /**
   * Gets or sets the automatic refresh levels.
   * @return autoRefreshLevels
  */
  
  @Schema(name = "AutoRefreshLevels", description = "Gets or sets the automatic refresh levels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AutoRefreshLevels")
  public JsonNullable<Integer> getAutoRefreshLevels() {
    return autoRefreshLevels;
  }

  public void setAutoRefreshLevels(JsonNullable<Integer> autoRefreshLevels) {
    this.autoRefreshLevels = autoRefreshLevels;
  }

  public ChannelFeatures canFilter(Boolean canFilter) {
    this.canFilter = canFilter;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance can filter.
   * @return canFilter
  */
  
  @Schema(name = "CanFilter", description = "Gets or sets a value indicating whether this instance can filter.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanFilter")
  public Boolean getCanFilter() {
    return canFilter;
  }

  public void setCanFilter(Boolean canFilter) {
    this.canFilter = canFilter;
  }

  public ChannelFeatures canSearch(Boolean canSearch) {
    this.canSearch = canSearch;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance can search.
   * @return canSearch
  */
  
  @Schema(name = "CanSearch", description = "Gets or sets a value indicating whether this instance can search.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanSearch")
  public Boolean getCanSearch() {
    return canSearch;
  }

  public void setCanSearch(Boolean canSearch) {
    this.canSearch = canSearch;
  }

  public ChannelFeatures contentTypes(List<@Valid ChannelMediaContentType> contentTypes) {
    this.contentTypes = JsonNullable.of(contentTypes);
    return this;
  }

  public ChannelFeatures addContentTypesItem(ChannelMediaContentType contentTypesItem) {
    if (this.contentTypes == null || !this.contentTypes.isPresent()) {
      this.contentTypes = JsonNullable.of(new ArrayList<>());
    }
    this.contentTypes.get().add(contentTypesItem);
    return this;
  }

  /**
   * Gets or sets the content types.
   * @return contentTypes
  */
  @Valid 
  @Schema(name = "ContentTypes", description = "Gets or sets the content types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContentTypes")
  public JsonNullable<List<@Valid ChannelMediaContentType>> getContentTypes() {
    return contentTypes;
  }

  public void setContentTypes(JsonNullable<List<@Valid ChannelMediaContentType>> contentTypes) {
    this.contentTypes = contentTypes;
  }

  public ChannelFeatures defaultSortFields(List<@Valid ChannelItemSortField> defaultSortFields) {
    this.defaultSortFields = JsonNullable.of(defaultSortFields);
    return this;
  }

  public ChannelFeatures addDefaultSortFieldsItem(ChannelItemSortField defaultSortFieldsItem) {
    if (this.defaultSortFields == null || !this.defaultSortFields.isPresent()) {
      this.defaultSortFields = JsonNullable.of(new ArrayList<>());
    }
    this.defaultSortFields.get().add(defaultSortFieldsItem);
    return this;
  }

  /**
   * Gets or sets the default sort orders.
   * @return defaultSortFields
  */
  @Valid 
  @Schema(name = "DefaultSortFields", description = "Gets or sets the default sort orders.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultSortFields")
  public JsonNullable<List<@Valid ChannelItemSortField>> getDefaultSortFields() {
    return defaultSortFields;
  }

  public void setDefaultSortFields(JsonNullable<List<@Valid ChannelItemSortField>> defaultSortFields) {
    this.defaultSortFields = defaultSortFields;
  }

  public ChannelFeatures id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the identifier.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public ChannelFeatures maxPageSize(Integer maxPageSize) {
    this.maxPageSize = JsonNullable.of(maxPageSize);
    return this;
  }

  /**
   * Represents the maximum number of records the channel allows retrieving at a time.
   * @return maxPageSize
  */
  
  @Schema(name = "MaxPageSize", description = "Represents the maximum number of records the channel allows retrieving at a time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxPageSize")
  public JsonNullable<Integer> getMaxPageSize() {
    return maxPageSize;
  }

  public void setMaxPageSize(JsonNullable<Integer> maxPageSize) {
    this.maxPageSize = maxPageSize;
  }

  public ChannelFeatures mediaTypes(List<@Valid ChannelMediaType> mediaTypes) {
    this.mediaTypes = JsonNullable.of(mediaTypes);
    return this;
  }

  public ChannelFeatures addMediaTypesItem(ChannelMediaType mediaTypesItem) {
    if (this.mediaTypes == null || !this.mediaTypes.isPresent()) {
      this.mediaTypes = JsonNullable.of(new ArrayList<>());
    }
    this.mediaTypes.get().add(mediaTypesItem);
    return this;
  }

  /**
   * Gets or sets the media types.
   * @return mediaTypes
  */
  @Valid 
  @Schema(name = "MediaTypes", description = "Gets or sets the media types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaTypes")
  public JsonNullable<List<@Valid ChannelMediaType>> getMediaTypes() {
    return mediaTypes;
  }

  public void setMediaTypes(JsonNullable<List<@Valid ChannelMediaType>> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  public ChannelFeatures name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public ChannelFeatures supportsContentDownloading(Boolean supportsContentDownloading) {
    this.supportsContentDownloading = supportsContentDownloading;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [supports content downloading].
   * @return supportsContentDownloading
  */
  
  @Schema(name = "SupportsContentDownloading", description = "Gets or sets a value indicating whether [supports content downloading].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsContentDownloading")
  public Boolean getSupportsContentDownloading() {
    return supportsContentDownloading;
  }

  public void setSupportsContentDownloading(Boolean supportsContentDownloading) {
    this.supportsContentDownloading = supportsContentDownloading;
  }

  public ChannelFeatures supportsLatestMedia(Boolean supportsLatestMedia) {
    this.supportsLatestMedia = supportsLatestMedia;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [supports latest media].
   * @return supportsLatestMedia
  */
  
  @Schema(name = "SupportsLatestMedia", description = "Gets or sets a value indicating whether [supports latest media].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsLatestMedia")
  public Boolean getSupportsLatestMedia() {
    return supportsLatestMedia;
  }

  public void setSupportsLatestMedia(Boolean supportsLatestMedia) {
    this.supportsLatestMedia = supportsLatestMedia;
  }

  public ChannelFeatures supportsSortOrderToggle(Boolean supportsSortOrderToggle) {
    this.supportsSortOrderToggle = supportsSortOrderToggle;
    return this;
  }

  /**
   * Indicates if a sort ascending/descending toggle is supported or not.
   * @return supportsSortOrderToggle
  */
  
  @Schema(name = "SupportsSortOrderToggle", description = "Indicates if a sort ascending/descending toggle is supported or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsSortOrderToggle")
  public Boolean getSupportsSortOrderToggle() {
    return supportsSortOrderToggle;
  }

  public void setSupportsSortOrderToggle(Boolean supportsSortOrderToggle) {
    this.supportsSortOrderToggle = supportsSortOrderToggle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelFeatures channelFeatures = (ChannelFeatures) o;
    return equalsNullable(this.autoRefreshLevels, channelFeatures.autoRefreshLevels) &&
        Objects.equals(this.canFilter, channelFeatures.canFilter) &&
        Objects.equals(this.canSearch, channelFeatures.canSearch) &&
        equalsNullable(this.contentTypes, channelFeatures.contentTypes) &&
        equalsNullable(this.defaultSortFields, channelFeatures.defaultSortFields) &&
        equalsNullable(this.id, channelFeatures.id) &&
        equalsNullable(this.maxPageSize, channelFeatures.maxPageSize) &&
        equalsNullable(this.mediaTypes, channelFeatures.mediaTypes) &&
        equalsNullable(this.name, channelFeatures.name) &&
        Objects.equals(this.supportsContentDownloading, channelFeatures.supportsContentDownloading) &&
        Objects.equals(this.supportsLatestMedia, channelFeatures.supportsLatestMedia) &&
        Objects.equals(this.supportsSortOrderToggle, channelFeatures.supportsSortOrderToggle);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(autoRefreshLevels), canFilter, canSearch, hashCodeNullable(contentTypes), hashCodeNullable(defaultSortFields), hashCodeNullable(id), hashCodeNullable(maxPageSize), hashCodeNullable(mediaTypes), hashCodeNullable(name), supportsContentDownloading, supportsLatestMedia, supportsSortOrderToggle);
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
    sb.append("class ChannelFeatures {\n");
    sb.append("    autoRefreshLevels: ").append(toIndentedString(autoRefreshLevels)).append("\n");
    sb.append("    canFilter: ").append(toIndentedString(canFilter)).append("\n");
    sb.append("    canSearch: ").append(toIndentedString(canSearch)).append("\n");
    sb.append("    contentTypes: ").append(toIndentedString(contentTypes)).append("\n");
    sb.append("    defaultSortFields: ").append(toIndentedString(defaultSortFields)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxPageSize: ").append(toIndentedString(maxPageSize)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportsContentDownloading: ").append(toIndentedString(supportsContentDownloading)).append("\n");
    sb.append("    supportsLatestMedia: ").append(toIndentedString(supportsLatestMedia)).append("\n");
    sb.append("    supportsSortOrderToggle: ").append(toIndentedString(supportsSortOrderToggle)).append("\n");
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

