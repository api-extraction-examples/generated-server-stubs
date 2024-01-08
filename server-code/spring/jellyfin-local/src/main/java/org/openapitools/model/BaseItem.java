package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MediaUrl;
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
 * Class BaseItem.
 */

@Schema(name = "BaseItem", description = "Class BaseItem.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class BaseItem {

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime dateLastSaved;

  @Valid
  private JsonNullable<List<UUID>> extraIds = JsonNullable.<List<UUID>>undefined();

  private Integer height;

  private Boolean isHD;

  private Boolean isShortcut;

  @Valid
  private JsonNullable<List<@Valid MediaUrl>> remoteTrailers = JsonNullable.<List<@Valid MediaUrl>>undefined();

  private JsonNullable<String> shortcutPath = JsonNullable.<String>undefined();

  private JsonNullable<Long> size = JsonNullable.<Long>undefined();

  private Boolean supportsExternalTransfer;

  private Integer width;

  public BaseItem container(String container) {
    this.container = JsonNullable.of(container);
    return this;
  }

  /**
   * Get container
   * @return container
  */
  
  @Schema(name = "Container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public JsonNullable<String> getContainer() {
    return container;
  }

  public void setContainer(JsonNullable<String> container) {
    this.container = container;
  }

  public BaseItem dateLastSaved(OffsetDateTime dateLastSaved) {
    this.dateLastSaved = dateLastSaved;
    return this;
  }

  /**
   * Get dateLastSaved
   * @return dateLastSaved
  */
  @Valid 
  @Schema(name = "DateLastSaved", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DateLastSaved")
  public OffsetDateTime getDateLastSaved() {
    return dateLastSaved;
  }

  public void setDateLastSaved(OffsetDateTime dateLastSaved) {
    this.dateLastSaved = dateLastSaved;
  }

  public BaseItem extraIds(List<UUID> extraIds) {
    this.extraIds = JsonNullable.of(extraIds);
    return this;
  }

  public BaseItem addExtraIdsItem(UUID extraIdsItem) {
    if (this.extraIds == null || !this.extraIds.isPresent()) {
      this.extraIds = JsonNullable.of(new ArrayList<>());
    }
    this.extraIds.get().add(extraIdsItem);
    return this;
  }

  /**
   * Get extraIds
   * @return extraIds
  */
  @Valid 
  @Schema(name = "ExtraIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExtraIds")
  public JsonNullable<List<UUID>> getExtraIds() {
    return extraIds;
  }

  public void setExtraIds(JsonNullable<List<UUID>> extraIds) {
    this.extraIds = extraIds;
  }

  public BaseItem height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  
  @Schema(name = "Height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public BaseItem isHD(Boolean isHD) {
    this.isHD = isHD;
    return this;
  }

  /**
   * Get isHD
   * @return isHD
  */
  
  @Schema(name = "IsHD", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsHD")
  public Boolean getIsHD() {
    return isHD;
  }

  public void setIsHD(Boolean isHD) {
    this.isHD = isHD;
  }

  public BaseItem isShortcut(Boolean isShortcut) {
    this.isShortcut = isShortcut;
    return this;
  }

  /**
   * Get isShortcut
   * @return isShortcut
  */
  
  @Schema(name = "IsShortcut", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsShortcut")
  public Boolean getIsShortcut() {
    return isShortcut;
  }

  public void setIsShortcut(Boolean isShortcut) {
    this.isShortcut = isShortcut;
  }

  public BaseItem remoteTrailers(List<@Valid MediaUrl> remoteTrailers) {
    this.remoteTrailers = JsonNullable.of(remoteTrailers);
    return this;
  }

  public BaseItem addRemoteTrailersItem(MediaUrl remoteTrailersItem) {
    if (this.remoteTrailers == null || !this.remoteTrailers.isPresent()) {
      this.remoteTrailers = JsonNullable.of(new ArrayList<>());
    }
    this.remoteTrailers.get().add(remoteTrailersItem);
    return this;
  }

  /**
   * Gets or sets the remote trailers.
   * @return remoteTrailers
  */
  @Valid 
  @Schema(name = "RemoteTrailers", description = "Gets or sets the remote trailers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemoteTrailers")
  public JsonNullable<List<@Valid MediaUrl>> getRemoteTrailers() {
    return remoteTrailers;
  }

  public void setRemoteTrailers(JsonNullable<List<@Valid MediaUrl>> remoteTrailers) {
    this.remoteTrailers = remoteTrailers;
  }

  public BaseItem shortcutPath(String shortcutPath) {
    this.shortcutPath = JsonNullable.of(shortcutPath);
    return this;
  }

  /**
   * Get shortcutPath
   * @return shortcutPath
  */
  
  @Schema(name = "ShortcutPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ShortcutPath")
  public JsonNullable<String> getShortcutPath() {
    return shortcutPath;
  }

  public void setShortcutPath(JsonNullable<String> shortcutPath) {
    this.shortcutPath = shortcutPath;
  }

  public BaseItem size(Long size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * Get size
   * @return size
  */
  
  @Schema(name = "Size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Size")
  public JsonNullable<Long> getSize() {
    return size;
  }

  public void setSize(JsonNullable<Long> size) {
    this.size = size;
  }

  public BaseItem supportsExternalTransfer(Boolean supportsExternalTransfer) {
    this.supportsExternalTransfer = supportsExternalTransfer;
    return this;
  }

  /**
   * Get supportsExternalTransfer
   * @return supportsExternalTransfer
  */
  
  @Schema(name = "SupportsExternalTransfer", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsExternalTransfer")
  public Boolean getSupportsExternalTransfer() {
    return supportsExternalTransfer;
  }

  public void setSupportsExternalTransfer(Boolean supportsExternalTransfer) {
    this.supportsExternalTransfer = supportsExternalTransfer;
  }

  public BaseItem width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  */
  
  @Schema(name = "Width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseItem baseItem = (BaseItem) o;
    return equalsNullable(this.container, baseItem.container) &&
        Objects.equals(this.dateLastSaved, baseItem.dateLastSaved) &&
        equalsNullable(this.extraIds, baseItem.extraIds) &&
        Objects.equals(this.height, baseItem.height) &&
        Objects.equals(this.isHD, baseItem.isHD) &&
        Objects.equals(this.isShortcut, baseItem.isShortcut) &&
        equalsNullable(this.remoteTrailers, baseItem.remoteTrailers) &&
        equalsNullable(this.shortcutPath, baseItem.shortcutPath) &&
        equalsNullable(this.size, baseItem.size) &&
        Objects.equals(this.supportsExternalTransfer, baseItem.supportsExternalTransfer) &&
        Objects.equals(this.width, baseItem.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(container), dateLastSaved, hashCodeNullable(extraIds), height, isHD, isShortcut, hashCodeNullable(remoteTrailers), hashCodeNullable(shortcutPath), hashCodeNullable(size), supportsExternalTransfer, width);
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
    sb.append("class BaseItem {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    dateLastSaved: ").append(toIndentedString(dateLastSaved)).append("\n");
    sb.append("    extraIds: ").append(toIndentedString(extraIds)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isHD: ").append(toIndentedString(isHD)).append("\n");
    sb.append("    isShortcut: ").append(toIndentedString(isShortcut)).append("\n");
    sb.append("    remoteTrailers: ").append(toIndentedString(remoteTrailers)).append("\n");
    sb.append("    shortcutPath: ").append(toIndentedString(shortcutPath)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    supportsExternalTransfer: ").append(toIndentedString(supportsExternalTransfer)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

