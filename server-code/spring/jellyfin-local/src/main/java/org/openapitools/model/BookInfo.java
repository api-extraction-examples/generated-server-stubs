package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
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
 * BookInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class BookInfo {

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

  private JsonNullable<String> seriesName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> year = JsonNullable.<Integer>undefined();

  public BookInfo indexNumber(Integer indexNumber) {
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

  public BookInfo isAutomated(Boolean isAutomated) {
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

  public BookInfo metadataCountryCode(String metadataCountryCode) {
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

  public BookInfo metadataLanguage(String metadataLanguage) {
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

  public BookInfo name(String name) {
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

  public BookInfo parentIndexNumber(Integer parentIndexNumber) {
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

  public BookInfo path(String path) {
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

  public BookInfo premiereDate(OffsetDateTime premiereDate) {
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

  public BookInfo providerIds(Map<String, String> providerIds) {
    this.providerIds = JsonNullable.of(providerIds);
    return this;
  }

  public BookInfo putProviderIdsItem(String key, String providerIdsItem) {
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

  public BookInfo seriesName(String seriesName) {
    this.seriesName = JsonNullable.of(seriesName);
    return this;
  }

  /**
   * Get seriesName
   * @return seriesName
  */
  
  @Schema(name = "SeriesName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesName")
  public JsonNullable<String> getSeriesName() {
    return seriesName;
  }

  public void setSeriesName(JsonNullable<String> seriesName) {
    this.seriesName = seriesName;
  }

  public BookInfo year(Integer year) {
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
    BookInfo bookInfo = (BookInfo) o;
    return equalsNullable(this.indexNumber, bookInfo.indexNumber) &&
        Objects.equals(this.isAutomated, bookInfo.isAutomated) &&
        equalsNullable(this.metadataCountryCode, bookInfo.metadataCountryCode) &&
        equalsNullable(this.metadataLanguage, bookInfo.metadataLanguage) &&
        equalsNullable(this.name, bookInfo.name) &&
        equalsNullable(this.parentIndexNumber, bookInfo.parentIndexNumber) &&
        equalsNullable(this.path, bookInfo.path) &&
        equalsNullable(this.premiereDate, bookInfo.premiereDate) &&
        equalsNullable(this.providerIds, bookInfo.providerIds) &&
        equalsNullable(this.seriesName, bookInfo.seriesName) &&
        equalsNullable(this.year, bookInfo.year);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(indexNumber), isAutomated, hashCodeNullable(metadataCountryCode), hashCodeNullable(metadataLanguage), hashCodeNullable(name), hashCodeNullable(parentIndexNumber), hashCodeNullable(path), hashCodeNullable(premiereDate), hashCodeNullable(providerIds), hashCodeNullable(seriesName), hashCodeNullable(year));
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
    sb.append("class BookInfo {\n");
    sb.append("    indexNumber: ").append(toIndentedString(indexNumber)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    metadataLanguage: ").append(toIndentedString(metadataLanguage)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentIndexNumber: ").append(toIndentedString(parentIndexNumber)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    premiereDate: ").append(toIndentedString(premiereDate)).append("\n");
    sb.append("    providerIds: ").append(toIndentedString(providerIds)).append("\n");
    sb.append("    seriesName: ").append(toIndentedString(seriesName)).append("\n");
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

