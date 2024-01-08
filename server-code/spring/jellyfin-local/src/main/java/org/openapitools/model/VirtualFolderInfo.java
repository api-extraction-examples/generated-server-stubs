package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LibraryOptions;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Used to hold information about a user&#39;s list of configured virtual folders.
 */

@Schema(name = "VirtualFolderInfo", description = "Used to hold information about a user's list of configured virtual folders.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class VirtualFolderInfo {

  private JsonNullable<String> collectionType = JsonNullable.<String>undefined();

  private JsonNullable<String> itemId = JsonNullable.<String>undefined();

  private LibraryOptions libraryOptions;

  @Valid
  private JsonNullable<List<String>> locations = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> primaryImageItemId = JsonNullable.<String>undefined();

  private JsonNullable<Double> refreshProgress = JsonNullable.<Double>undefined();

  private JsonNullable<String> refreshStatus = JsonNullable.<String>undefined();

  public VirtualFolderInfo collectionType(String collectionType) {
    this.collectionType = JsonNullable.of(collectionType);
    return this;
  }

  /**
   * Gets or sets the type of the collection.
   * @return collectionType
  */
  
  @Schema(name = "CollectionType", description = "Gets or sets the type of the collection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CollectionType")
  public JsonNullable<String> getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(JsonNullable<String> collectionType) {
    this.collectionType = collectionType;
  }

  public VirtualFolderInfo itemId(String itemId) {
    this.itemId = JsonNullable.of(itemId);
    return this;
  }

  /**
   * Gets or sets the item identifier.
   * @return itemId
  */
  
  @Schema(name = "ItemId", description = "Gets or sets the item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemId")
  public JsonNullable<String> getItemId() {
    return itemId;
  }

  public void setItemId(JsonNullable<String> itemId) {
    this.itemId = itemId;
  }

  public VirtualFolderInfo libraryOptions(LibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
    return this;
  }

  /**
   * Get libraryOptions
   * @return libraryOptions
  */
  @Valid 
  @Schema(name = "LibraryOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LibraryOptions")
  public LibraryOptions getLibraryOptions() {
    return libraryOptions;
  }

  public void setLibraryOptions(LibraryOptions libraryOptions) {
    this.libraryOptions = libraryOptions;
  }

  public VirtualFolderInfo locations(List<String> locations) {
    this.locations = JsonNullable.of(locations);
    return this;
  }

  public VirtualFolderInfo addLocationsItem(String locationsItem) {
    if (this.locations == null || !this.locations.isPresent()) {
      this.locations = JsonNullable.of(new ArrayList<>());
    }
    this.locations.get().add(locationsItem);
    return this;
  }

  /**
   * Gets or sets the locations.
   * @return locations
  */
  
  @Schema(name = "Locations", description = "Gets or sets the locations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Locations")
  public JsonNullable<List<String>> getLocations() {
    return locations;
  }

  public void setLocations(JsonNullable<List<String>> locations) {
    this.locations = locations;
  }

  public VirtualFolderInfo name(String name) {
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

  public VirtualFolderInfo primaryImageItemId(String primaryImageItemId) {
    this.primaryImageItemId = JsonNullable.of(primaryImageItemId);
    return this;
  }

  /**
   * Gets or sets the primary image item identifier.
   * @return primaryImageItemId
  */
  
  @Schema(name = "PrimaryImageItemId", description = "Gets or sets the primary image item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrimaryImageItemId")
  public JsonNullable<String> getPrimaryImageItemId() {
    return primaryImageItemId;
  }

  public void setPrimaryImageItemId(JsonNullable<String> primaryImageItemId) {
    this.primaryImageItemId = primaryImageItemId;
  }

  public VirtualFolderInfo refreshProgress(Double refreshProgress) {
    this.refreshProgress = JsonNullable.of(refreshProgress);
    return this;
  }

  /**
   * Get refreshProgress
   * @return refreshProgress
  */
  
  @Schema(name = "RefreshProgress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RefreshProgress")
  public JsonNullable<Double> getRefreshProgress() {
    return refreshProgress;
  }

  public void setRefreshProgress(JsonNullable<Double> refreshProgress) {
    this.refreshProgress = refreshProgress;
  }

  public VirtualFolderInfo refreshStatus(String refreshStatus) {
    this.refreshStatus = JsonNullable.of(refreshStatus);
    return this;
  }

  /**
   * Get refreshStatus
   * @return refreshStatus
  */
  
  @Schema(name = "RefreshStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RefreshStatus")
  public JsonNullable<String> getRefreshStatus() {
    return refreshStatus;
  }

  public void setRefreshStatus(JsonNullable<String> refreshStatus) {
    this.refreshStatus = refreshStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualFolderInfo virtualFolderInfo = (VirtualFolderInfo) o;
    return equalsNullable(this.collectionType, virtualFolderInfo.collectionType) &&
        equalsNullable(this.itemId, virtualFolderInfo.itemId) &&
        Objects.equals(this.libraryOptions, virtualFolderInfo.libraryOptions) &&
        equalsNullable(this.locations, virtualFolderInfo.locations) &&
        equalsNullable(this.name, virtualFolderInfo.name) &&
        equalsNullable(this.primaryImageItemId, virtualFolderInfo.primaryImageItemId) &&
        equalsNullable(this.refreshProgress, virtualFolderInfo.refreshProgress) &&
        equalsNullable(this.refreshStatus, virtualFolderInfo.refreshStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(collectionType), hashCodeNullable(itemId), libraryOptions, hashCodeNullable(locations), hashCodeNullable(name), hashCodeNullable(primaryImageItemId), hashCodeNullable(refreshProgress), hashCodeNullable(refreshStatus));
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
    sb.append("class VirtualFolderInfo {\n");
    sb.append("    collectionType: ").append(toIndentedString(collectionType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    libraryOptions: ").append(toIndentedString(libraryOptions)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    primaryImageItemId: ").append(toIndentedString(primaryImageItemId)).append("\n");
    sb.append("    refreshProgress: ").append(toIndentedString(refreshProgress)).append("\n");
    sb.append("    refreshStatus: ").append(toIndentedString(refreshStatus)).append("\n");
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

