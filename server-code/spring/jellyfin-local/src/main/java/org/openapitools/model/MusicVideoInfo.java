package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
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
 * MusicVideoInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MusicVideoInfo {

  @Valid
  private JsonNullable<List<String>> artists = JsonNullable.<List<String>>undefined();

  private JsonNullable<Integer> indexNumber = JsonNullable.<Integer>undefined();

  private Boolean isAutomated;

  private JsonNullable<String> metadataCountryCode = JsonNullable.<String>undefined();

  private JsonNullable<String> metadataLanguage = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<Integer> parentIndexNumber = JsonNullable.<Integer>undefined();

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> premiereDate = JsonNullable.<OffsetDateTime>undefined();

  @Valid
  private JsonNullable<Map<String, String>> providerIds = JsonNullable.<Map<String, String>>undefined();

  private JsonNullable<Integer> year = JsonNullable.<Integer>undefined();

  public MusicVideoInfo artists(List<String> artists) {
    this.artists = JsonNullable.of(artists);
    return this;
  }

  public MusicVideoInfo addArtistsItem(String artistsItem) {
    if (this.artists == null || !this.artists.isPresent()) {
      this.artists = JsonNullable.of(new ArrayList<>());
    }
    this.artists.get().add(artistsItem);
    return this;
  }

  /**
   * Get artists
   * @return artists
  */
  
  @Schema(name = "Artists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Artists")
  public JsonNullable<List<String>> getArtists() {
    return artists;
  }

  public void setArtists(JsonNullable<List<String>> artists) {
    this.artists = artists;
  }

  public MusicVideoInfo indexNumber(Integer indexNumber) {
    this.indexNumber = JsonNullable.of(indexNumber);
    return this;
  }

  /**
   * Get indexNumber
   * @return indexNumber
  */
  
  @Schema(name = "IndexNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IndexNumber")
  public JsonNullable<Integer> getIndexNumber() {
    return indexNumber;
  }

  public void setIndexNumber(JsonNullable<Integer> indexNumber) {
    this.indexNumber = indexNumber;
  }

  public MusicVideoInfo isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

  /**
   * Get isAutomated
   * @return isAutomated
  */
  
  @Schema(name = "IsAutomated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAutomated")
  public Boolean getIsAutomated() {
    return isAutomated;
  }

  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }

  public MusicVideoInfo metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = JsonNullable.of(metadataCountryCode);
    return this;
  }

  /**
   * Gets or sets the metadata country code.
   * @return metadataCountryCode
  */
  
  @Schema(name = "MetadataCountryCode", description = "Gets or sets the metadata country code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataCountryCode")
  public JsonNullable<String> getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(JsonNullable<String> metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public MusicVideoInfo metadataLanguage(String metadataLanguage) {
    this.metadataLanguage = JsonNullable.of(metadataLanguage);
    return this;
  }

  /**
   * Gets or sets the metadata language.
   * @return metadataLanguage
  */
  
  @Schema(name = "MetadataLanguage", description = "Gets or sets the metadata language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataLanguage")
  public JsonNullable<String> getMetadataLanguage() {
    return metadataLanguage;
  }

  public void setMetadataLanguage(JsonNullable<String> metadataLanguage) {
    this.metadataLanguage = metadataLanguage;
  }

  public MusicVideoInfo name(String name) {
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

  public MusicVideoInfo parentIndexNumber(Integer parentIndexNumber) {
    this.parentIndexNumber = JsonNullable.of(parentIndexNumber);
    return this;
  }

  /**
   * Get parentIndexNumber
   * @return parentIndexNumber
  */
  
  @Schema(name = "ParentIndexNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentIndexNumber")
  public JsonNullable<Integer> getParentIndexNumber() {
    return parentIndexNumber;
  }

  public void setParentIndexNumber(JsonNullable<Integer> parentIndexNumber) {
    this.parentIndexNumber = parentIndexNumber;
  }

  public MusicVideoInfo path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Gets or sets the path.
   * @return path
  */
  
  @Schema(name = "Path", description = "Gets or sets the path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public MusicVideoInfo premiereDate(OffsetDateTime premiereDate) {
    this.premiereDate = JsonNullable.of(premiereDate);
    return this;
  }

  /**
   * Get premiereDate
   * @return premiereDate
  */
  @Valid 
  @Schema(name = "PremiereDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PremiereDate")
  public JsonNullable<OffsetDateTime> getPremiereDate() {
    return premiereDate;
  }

  public void setPremiereDate(JsonNullable<OffsetDateTime> premiereDate) {
    this.premiereDate = premiereDate;
  }

  public MusicVideoInfo providerIds(Map<String, String> providerIds) {
    this.providerIds = JsonNullable.of(providerIds);
    return this;
  }

  public MusicVideoInfo putProviderIdsItem(String key, String providerIdsItem) {
    if (this.providerIds == null || !this.providerIds.isPresent()) {
      this.providerIds = JsonNullable.of(new HashMap<>());
    }
    this.providerIds.get().put(key, providerIdsItem);
    return this;
  }

  /**
   * Gets or sets the provider ids.
   * @return providerIds
  */
  
  @Schema(name = "ProviderIds", description = "Gets or sets the provider ids.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProviderIds")
  public JsonNullable<Map<String, String>> getProviderIds() {
    return providerIds;
  }

  public void setProviderIds(JsonNullable<Map<String, String>> providerIds) {
    this.providerIds = providerIds;
  }

  public MusicVideoInfo year(Integer year) {
    this.year = JsonNullable.of(year);
    return this;
  }

  /**
   * Gets or sets the year.
   * @return year
  */
  
  @Schema(name = "Year", description = "Gets or sets the year.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Year")
  public JsonNullable<Integer> getYear() {
    return year;
  }

  public void setYear(JsonNullable<Integer> year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicVideoInfo musicVideoInfo = (MusicVideoInfo) o;
    return equalsNullable(this.artists, musicVideoInfo.artists) &&
        equalsNullable(this.indexNumber, musicVideoInfo.indexNumber) &&
        Objects.equals(this.isAutomated, musicVideoInfo.isAutomated) &&
        equalsNullable(this.metadataCountryCode, musicVideoInfo.metadataCountryCode) &&
        equalsNullable(this.metadataLanguage, musicVideoInfo.metadataLanguage) &&
        equalsNullable(this.name, musicVideoInfo.name) &&
        equalsNullable(this.parentIndexNumber, musicVideoInfo.parentIndexNumber) &&
        equalsNullable(this.path, musicVideoInfo.path) &&
        equalsNullable(this.premiereDate, musicVideoInfo.premiereDate) &&
        equalsNullable(this.providerIds, musicVideoInfo.providerIds) &&
        equalsNullable(this.year, musicVideoInfo.year);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(artists), hashCodeNullable(indexNumber), isAutomated, hashCodeNullable(metadataCountryCode), hashCodeNullable(metadataLanguage), hashCodeNullable(name), hashCodeNullable(parentIndexNumber), hashCodeNullable(path), hashCodeNullable(premiereDate), hashCodeNullable(providerIds), hashCodeNullable(year));
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
    sb.append("class MusicVideoInfo {\n");
    sb.append("    artists: ").append(toIndentedString(artists)).append("\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    metadataLanguage: ").append(toIndentedString(metadataLanguage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentIndexNumber: ").append(toIndentedString(parentIndexNumber)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    premiereDate: ").append(toIndentedString(premiereDate)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

