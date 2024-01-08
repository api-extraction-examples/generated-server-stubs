package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.VersionInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class PackageInfo.
 */

@Schema(name = "PackageInfo", description = "Class PackageInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PackageInfo {

  private JsonNullable<String> category = JsonNullable.<String>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> guid = JsonNullable.<String>undefined();

  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> overview = JsonNullable.<String>undefined();

  private JsonNullable<String> owner = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid VersionInfo>> versions = JsonNullable.<List<@Valid VersionInfo>>undefined();

  public PackageInfo category(String category) {
    this.category = JsonNullable.of(category);
    return this;
  }

  /**
   * Gets or sets the category.
   * @return category
  */
  
  @Schema(name = "category", description = "Gets or sets the category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public JsonNullable<String> getCategory() {
    return category;
  }

  public void setCategory(JsonNullable<String> category) {
    this.category = category;
  }

  public PackageInfo description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Gets or sets a long description of the plugin containing features or helpful explanations.
   * @return description
  */
  
  @Schema(name = "description", description = "Gets or sets a long description of the plugin containing features or helpful explanations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public PackageInfo guid(String guid) {
    this.guid = JsonNullable.of(guid);
    return this;
  }

  /**
   * Gets or sets the guid of the assembly associated with this plugin.  This is used to identify the proper item for automatic updates.
   * @return guid
  */
  
  @Schema(name = "guid", description = "Gets or sets the guid of the assembly associated with this plugin.  This is used to identify the proper item for automatic updates.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("guid")
  public JsonNullable<String> getGuid() {
    return guid;
  }

  public void setGuid(JsonNullable<String> guid) {
    this.guid = guid;
  }

  public PackageInfo imageUrl(String imageUrl) {
    this.imageUrl = JsonNullable.of(imageUrl);
    return this;
  }

  /**
   * Gets or sets the image url for the package.
   * @return imageUrl
  */
  
  @Schema(name = "imageUrl", description = "Gets or sets the image url for the package.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageUrl")
  public JsonNullable<String> getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(JsonNullable<String> imageUrl) {
    this.imageUrl = imageUrl;
  }

  public PackageInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public PackageInfo overview(String overview) {
    this.overview = JsonNullable.of(overview);
    return this;
  }

  /**
   * Gets or sets a short overview of what the plugin does.
   * @return overview
  */
  
  @Schema(name = "overview", description = "Gets or sets a short overview of what the plugin does.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overview")
  public JsonNullable<String> getOverview() {
    return overview;
  }

  public void setOverview(JsonNullable<String> overview) {
    this.overview = overview;
  }

  public PackageInfo owner(String owner) {
    this.owner = JsonNullable.of(owner);
    return this;
  }

  /**
   * Gets or sets the owner.
   * @return owner
  */
  
  @Schema(name = "owner", description = "Gets or sets the owner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owner")
  public JsonNullable<String> getOwner() {
    return owner;
  }

  public void setOwner(JsonNullable<String> owner) {
    this.owner = owner;
  }

  public PackageInfo versions(List<@Valid VersionInfo> versions) {
    this.versions = JsonNullable.of(versions);
    return this;
  }

  public PackageInfo addVersionsItem(VersionInfo versionsItem) {
    if (this.versions == null || !this.versions.isPresent()) {
      this.versions = JsonNullable.of(new ArrayList<>());
    }
    this.versions.get().add(versionsItem);
    return this;
  }

  /**
   * Gets or sets the versions.
   * @return versions
  */
  @Valid 
  @Schema(name = "versions", description = "Gets or sets the versions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versions")
  public JsonNullable<List<@Valid VersionInfo>> getVersions() {
    return versions;
  }

  public void setVersions(JsonNullable<List<@Valid VersionInfo>> versions) {
    this.versions = versions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageInfo packageInfo = (PackageInfo) o;
    return equalsNullable(this.category, packageInfo.category) &&
        equalsNullable(this.description, packageInfo.description) &&
        equalsNullable(this.guid, packageInfo.guid) &&
        equalsNullable(this.imageUrl, packageInfo.imageUrl) &&
        equalsNullable(this.name, packageInfo.name) &&
        equalsNullable(this.overview, packageInfo.overview) &&
        equalsNullable(this.owner, packageInfo.owner) &&
        equalsNullable(this.versions, packageInfo.versions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(category), hashCodeNullable(description), hashCodeNullable(guid), hashCodeNullable(imageUrl), hashCodeNullable(name), hashCodeNullable(overview), hashCodeNullable(owner), hashCodeNullable(versions));
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
    sb.append("class PackageInfo {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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

