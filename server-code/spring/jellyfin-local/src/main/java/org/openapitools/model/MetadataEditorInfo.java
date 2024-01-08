package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CountryInfo;
import org.openapitools.model.CultureDto;
import org.openapitools.model.ExternalIdInfo;
import org.openapitools.model.NameValuePair;
import org.openapitools.model.ParentalRating;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MetadataEditorInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MetadataEditorInfo {

  private JsonNullable<String> contentType = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid NameValuePair>> contentTypeOptions = JsonNullable.<List<@Valid NameValuePair>>undefined();

  @Valid
  private JsonNullable<List<@Valid CountryInfo>> countries = JsonNullable.<List<@Valid CountryInfo>>undefined();

  @Valid
  private JsonNullable<List<@Valid CultureDto>> cultures = JsonNullable.<List<@Valid CultureDto>>undefined();

  @Valid
  private JsonNullable<List<@Valid ExternalIdInfo>> externalIdInfos = JsonNullable.<List<@Valid ExternalIdInfo>>undefined();

  @Valid
  private JsonNullable<List<@Valid ParentalRating>> parentalRatingOptions = JsonNullable.<List<@Valid ParentalRating>>undefined();

  public MetadataEditorInfo contentType(String contentType) {
    this.contentType = JsonNullable.of(contentType);
    return this;
  }

  /**
   * Get contentType
   * @return contentType
  */
  
  @Schema(name = "ContentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContentType")
  public JsonNullable<String> getContentType() {
    return contentType;
  }

  public void setContentType(JsonNullable<String> contentType) {
    this.contentType = contentType;
  }

  public MetadataEditorInfo contentTypeOptions(List<@Valid NameValuePair> contentTypeOptions) {
    this.contentTypeOptions = JsonNullable.of(contentTypeOptions);
    return this;
  }

  public MetadataEditorInfo addContentTypeOptionsItem(NameValuePair contentTypeOptionsItem) {
    if (this.contentTypeOptions == null || !this.contentTypeOptions.isPresent()) {
      this.contentTypeOptions = JsonNullable.of(new ArrayList<>());
    }
    this.contentTypeOptions.get().add(contentTypeOptionsItem);
    return this;
  }

  /**
   * Get contentTypeOptions
   * @return contentTypeOptions
  */
  @Valid 
  @Schema(name = "ContentTypeOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContentTypeOptions")
  public JsonNullable<List<@Valid NameValuePair>> getContentTypeOptions() {
    return contentTypeOptions;
  }

  public void setContentTypeOptions(JsonNullable<List<@Valid NameValuePair>> contentTypeOptions) {
    this.contentTypeOptions = contentTypeOptions;
  }

  public MetadataEditorInfo countries(List<@Valid CountryInfo> countries) {
    this.countries = JsonNullable.of(countries);
    return this;
  }

  public MetadataEditorInfo addCountriesItem(CountryInfo countriesItem) {
    if (this.countries == null || !this.countries.isPresent()) {
      this.countries = JsonNullable.of(new ArrayList<>());
    }
    this.countries.get().add(countriesItem);
    return this;
  }

  /**
   * Get countries
   * @return countries
  */
  @Valid 
  @Schema(name = "Countries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Countries")
  public JsonNullable<List<@Valid CountryInfo>> getCountries() {
    return countries;
  }

  public void setCountries(JsonNullable<List<@Valid CountryInfo>> countries) {
    this.countries = countries;
  }

  public MetadataEditorInfo cultures(List<@Valid CultureDto> cultures) {
    this.cultures = JsonNullable.of(cultures);
    return this;
  }

  public MetadataEditorInfo addCulturesItem(CultureDto culturesItem) {
    if (this.cultures == null || !this.cultures.isPresent()) {
      this.cultures = JsonNullable.of(new ArrayList<>());
    }
    this.cultures.get().add(culturesItem);
    return this;
  }

  /**
   * Get cultures
   * @return cultures
  */
  @Valid 
  @Schema(name = "Cultures", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Cultures")
  public JsonNullable<List<@Valid CultureDto>> getCultures() {
    return cultures;
  }

  public void setCultures(JsonNullable<List<@Valid CultureDto>> cultures) {
    this.cultures = cultures;
  }

  public MetadataEditorInfo externalIdInfos(List<@Valid ExternalIdInfo> externalIdInfos) {
    this.externalIdInfos = JsonNullable.of(externalIdInfos);
    return this;
  }

  public MetadataEditorInfo addExternalIdInfosItem(ExternalIdInfo externalIdInfosItem) {
    if (this.externalIdInfos == null || !this.externalIdInfos.isPresent()) {
      this.externalIdInfos = JsonNullable.of(new ArrayList<>());
    }
    this.externalIdInfos.get().add(externalIdInfosItem);
    return this;
  }

  /**
   * Get externalIdInfos
   * @return externalIdInfos
  */
  @Valid 
  @Schema(name = "ExternalIdInfos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExternalIdInfos")
  public JsonNullable<List<@Valid ExternalIdInfo>> getExternalIdInfos() {
    return externalIdInfos;
  }

  public void setExternalIdInfos(JsonNullable<List<@Valid ExternalIdInfo>> externalIdInfos) {
    this.externalIdInfos = externalIdInfos;
  }

  public MetadataEditorInfo parentalRatingOptions(List<@Valid ParentalRating> parentalRatingOptions) {
    this.parentalRatingOptions = JsonNullable.of(parentalRatingOptions);
    return this;
  }

  public MetadataEditorInfo addParentalRatingOptionsItem(ParentalRating parentalRatingOptionsItem) {
    if (this.parentalRatingOptions == null || !this.parentalRatingOptions.isPresent()) {
      this.parentalRatingOptions = JsonNullable.of(new ArrayList<>());
    }
    this.parentalRatingOptions.get().add(parentalRatingOptionsItem);
    return this;
  }

  /**
   * Get parentalRatingOptions
   * @return parentalRatingOptions
  */
  @Valid 
  @Schema(name = "ParentalRatingOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentalRatingOptions")
  public JsonNullable<List<@Valid ParentalRating>> getParentalRatingOptions() {
    return parentalRatingOptions;
  }

  public void setParentalRatingOptions(JsonNullable<List<@Valid ParentalRating>> parentalRatingOptions) {
    this.parentalRatingOptions = parentalRatingOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataEditorInfo metadataEditorInfo = (MetadataEditorInfo) o;
    return equalsNullable(this.contentType, metadataEditorInfo.contentType) &&
        equalsNullable(this.contentTypeOptions, metadataEditorInfo.contentTypeOptions) &&
        equalsNullable(this.countries, metadataEditorInfo.countries) &&
        equalsNullable(this.cultures, metadataEditorInfo.cultures) &&
        equalsNullable(this.externalIdInfos, metadataEditorInfo.externalIdInfos) &&
        equalsNullable(this.parentalRatingOptions, metadataEditorInfo.parentalRatingOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(contentType), hashCodeNullable(contentTypeOptions), hashCodeNullable(countries), hashCodeNullable(cultures), hashCodeNullable(externalIdInfos), hashCodeNullable(parentalRatingOptions));
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
    sb.append("class MetadataEditorInfo {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    contentTypeOptions: ").append(toIndentedString(contentTypeOptions)).append("\n");
    sb.append("    countries: ").append(toIndentedString(countries)).append("\n");
    sb.append("    cultures: ").append(toIndentedString(cultures)).append("\n");
    sb.append("    externalIdInfos: ").append(toIndentedString(externalIdInfos)).append("\n");
    sb.append("    parentalRatingOptions: ").append(toIndentedString(parentalRatingOptions)).append("\n");
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

