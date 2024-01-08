package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class LibraryUpdateInfo.
 */

@Schema(name = "LibraryUpdateInfo", description = "Class LibraryUpdateInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class LibraryUpdateInfo {

  @Valid
  private JsonNullable<List<String>> collectionFolders = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> foldersAddedTo = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> foldersRemovedFrom = JsonNullable.<List<String>>undefined();

  private Boolean isEmpty;

  @Valid
  private JsonNullable<List<String>> itemsAdded = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> itemsRemoved = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> itemsUpdated = JsonNullable.<List<String>>undefined();

  public LibraryUpdateInfo collectionFolders(List<String> collectionFolders) {
    this.collectionFolders = JsonNullable.of(collectionFolders);
    return this;
  }

  public LibraryUpdateInfo addCollectionFoldersItem(String collectionFoldersItem) {
    if (this.collectionFolders == null || !this.collectionFolders.isPresent()) {
      this.collectionFolders = JsonNullable.of(new ArrayList<>());
    }
    this.collectionFolders.get().add(collectionFoldersItem);
    return this;
  }

  /**
   * Get collectionFolders
   * @return collectionFolders
  */
  
  @Schema(name = "CollectionFolders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CollectionFolders")
  public JsonNullable<List<String>> getCollectionFolders() {
    return collectionFolders;
  }

  public void setCollectionFolders(JsonNullable<List<String>> collectionFolders) {
    this.collectionFolders = collectionFolders;
  }

  public LibraryUpdateInfo foldersAddedTo(List<String> foldersAddedTo) {
    this.foldersAddedTo = JsonNullable.of(foldersAddedTo);
    return this;
  }

  public LibraryUpdateInfo addFoldersAddedToItem(String foldersAddedToItem) {
    if (this.foldersAddedTo == null || !this.foldersAddedTo.isPresent()) {
      this.foldersAddedTo = JsonNullable.of(new ArrayList<>());
    }
    this.foldersAddedTo.get().add(foldersAddedToItem);
    return this;
  }

  /**
   * Gets or sets the folders added to.
   * @return foldersAddedTo
  */
  
  @Schema(name = "FoldersAddedTo", description = "Gets or sets the folders added to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FoldersAddedTo")
  public JsonNullable<List<String>> getFoldersAddedTo() {
    return foldersAddedTo;
  }

  public void setFoldersAddedTo(JsonNullable<List<String>> foldersAddedTo) {
    this.foldersAddedTo = foldersAddedTo;
  }

  public LibraryUpdateInfo foldersRemovedFrom(List<String> foldersRemovedFrom) {
    this.foldersRemovedFrom = JsonNullable.of(foldersRemovedFrom);
    return this;
  }

  public LibraryUpdateInfo addFoldersRemovedFromItem(String foldersRemovedFromItem) {
    if (this.foldersRemovedFrom == null || !this.foldersRemovedFrom.isPresent()) {
      this.foldersRemovedFrom = JsonNullable.of(new ArrayList<>());
    }
    this.foldersRemovedFrom.get().add(foldersRemovedFromItem);
    return this;
  }

  /**
   * Gets or sets the folders removed from.
   * @return foldersRemovedFrom
  */
  
  @Schema(name = "FoldersRemovedFrom", description = "Gets or sets the folders removed from.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FoldersRemovedFrom")
  public JsonNullable<List<String>> getFoldersRemovedFrom() {
    return foldersRemovedFrom;
  }

  public void setFoldersRemovedFrom(JsonNullable<List<String>> foldersRemovedFrom) {
    this.foldersRemovedFrom = foldersRemovedFrom;
  }

  public LibraryUpdateInfo isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }

  /**
   * Get isEmpty
   * @return isEmpty
  */
  
  @Schema(name = "IsEmpty", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsEmpty")
  public Boolean getIsEmpty() {
    return isEmpty;
  }

  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  public LibraryUpdateInfo itemsAdded(List<String> itemsAdded) {
    this.itemsAdded = JsonNullable.of(itemsAdded);
    return this;
  }

  public LibraryUpdateInfo addItemsAddedItem(String itemsAddedItem) {
    if (this.itemsAdded == null || !this.itemsAdded.isPresent()) {
      this.itemsAdded = JsonNullable.of(new ArrayList<>());
    }
    this.itemsAdded.get().add(itemsAddedItem);
    return this;
  }

  /**
   * Gets or sets the items added.
   * @return itemsAdded
  */
  
  @Schema(name = "ItemsAdded", description = "Gets or sets the items added.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemsAdded")
  public JsonNullable<List<String>> getItemsAdded() {
    return itemsAdded;
  }

  public void setItemsAdded(JsonNullable<List<String>> itemsAdded) {
    this.itemsAdded = itemsAdded;
  }

  public LibraryUpdateInfo itemsRemoved(List<String> itemsRemoved) {
    this.itemsRemoved = JsonNullable.of(itemsRemoved);
    return this;
  }

  public LibraryUpdateInfo addItemsRemovedItem(String itemsRemovedItem) {
    if (this.itemsRemoved == null || !this.itemsRemoved.isPresent()) {
      this.itemsRemoved = JsonNullable.of(new ArrayList<>());
    }
    this.itemsRemoved.get().add(itemsRemovedItem);
    return this;
  }

  /**
   * Gets or sets the items removed.
   * @return itemsRemoved
  */
  
  @Schema(name = "ItemsRemoved", description = "Gets or sets the items removed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemsRemoved")
  public JsonNullable<List<String>> getItemsRemoved() {
    return itemsRemoved;
  }

  public void setItemsRemoved(JsonNullable<List<String>> itemsRemoved) {
    this.itemsRemoved = itemsRemoved;
  }

  public LibraryUpdateInfo itemsUpdated(List<String> itemsUpdated) {
    this.itemsUpdated = JsonNullable.of(itemsUpdated);
    return this;
  }

  public LibraryUpdateInfo addItemsUpdatedItem(String itemsUpdatedItem) {
    if (this.itemsUpdated == null || !this.itemsUpdated.isPresent()) {
      this.itemsUpdated = JsonNullable.of(new ArrayList<>());
    }
    this.itemsUpdated.get().add(itemsUpdatedItem);
    return this;
  }

  /**
   * Gets or sets the items updated.
   * @return itemsUpdated
  */
  
  @Schema(name = "ItemsUpdated", description = "Gets or sets the items updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemsUpdated")
  public JsonNullable<List<String>> getItemsUpdated() {
    return itemsUpdated;
  }

  public void setItemsUpdated(JsonNullable<List<String>> itemsUpdated) {
    this.itemsUpdated = itemsUpdated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryUpdateInfo libraryUpdateInfo = (LibraryUpdateInfo) o;
    return equalsNullable(this.collectionFolders, libraryUpdateInfo.collectionFolders) &&
        equalsNullable(this.foldersAddedTo, libraryUpdateInfo.foldersAddedTo) &&
        equalsNullable(this.foldersRemovedFrom, libraryUpdateInfo.foldersRemovedFrom) &&
        Objects.equals(this.isEmpty, libraryUpdateInfo.isEmpty) &&
        equalsNullable(this.itemsAdded, libraryUpdateInfo.itemsAdded) &&
        equalsNullable(this.itemsRemoved, libraryUpdateInfo.itemsRemoved) &&
        equalsNullable(this.itemsUpdated, libraryUpdateInfo.itemsUpdated);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(collectionFolders), hashCodeNullable(foldersAddedTo), hashCodeNullable(foldersRemovedFrom), isEmpty, hashCodeNullable(itemsAdded), hashCodeNullable(itemsRemoved), hashCodeNullable(itemsUpdated));
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
    sb.append("class LibraryUpdateInfo {\n");
    sb.append("    collectionFolders: ").append(toIndentedString(collectionFolders)).append("\n");
    sb.append("    foldersAddedTo: ").append(toIndentedString(foldersAddedTo)).append("\n");
    sb.append("    foldersRemovedFrom: ").append(toIndentedString(foldersRemovedFrom)).append("\n");
    sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
    sb.append("    itemsAdded: ").append(toIndentedString(itemsAdded)).append("\n");
    sb.append("    itemsRemoved: ").append(toIndentedString(itemsRemoved)).append("\n");
    sb.append("    itemsUpdated: ").append(toIndentedString(itemsUpdated)).append("\n");
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

