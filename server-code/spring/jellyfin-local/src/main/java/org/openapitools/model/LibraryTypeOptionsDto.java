package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageOption;
import org.openapitools.model.ImageType;
import org.openapitools.model.LibraryOptionInfoDto;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Library type options dto.
 */

@Schema(name = "LibraryTypeOptionsDto", description = "Library type options dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class LibraryTypeOptionsDto {

  @Valid
  private JsonNullable<List<@Valid ImageOption>> defaultImageOptions = JsonNullable.<List<@Valid ImageOption>>undefined();

  @Valid
  private JsonNullable<List<@Valid LibraryOptionInfoDto>> imageFetchers = JsonNullable.<List<@Valid LibraryOptionInfoDto>>undefined();

  @Valid
  private JsonNullable<List<@Valid LibraryOptionInfoDto>> metadataFetchers = JsonNullable.<List<@Valid LibraryOptionInfoDto>>undefined();

  @Valid
  private JsonNullable<List<@Valid ImageType>> supportedImageTypes = JsonNullable.<List<@Valid ImageType>>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public LibraryTypeOptionsDto defaultImageOptions(List<@Valid ImageOption> defaultImageOptions) {
    this.defaultImageOptions = JsonNullable.of(defaultImageOptions);
    return this;
  }

  public LibraryTypeOptionsDto addDefaultImageOptionsItem(ImageOption defaultImageOptionsItem) {
    if (this.defaultImageOptions == null || !this.defaultImageOptions.isPresent()) {
      this.defaultImageOptions = JsonNullable.of(new ArrayList<>());
    }
    this.defaultImageOptions.get().add(defaultImageOptionsItem);
    return this;
  }

  /**
   * Gets or sets the default image options.
   * @return defaultImageOptions
  */
  @Valid 
  @Schema(name = "DefaultImageOptions", description = "Gets or sets the default image options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultImageOptions")
  public JsonNullable<List<@Valid ImageOption>> getDefaultImageOptions() {
    return defaultImageOptions;
  }

  public void setDefaultImageOptions(JsonNullable<List<@Valid ImageOption>> defaultImageOptions) {
    this.defaultImageOptions = defaultImageOptions;
  }

  public LibraryTypeOptionsDto imageFetchers(List<@Valid LibraryOptionInfoDto> imageFetchers) {
    this.imageFetchers = JsonNullable.of(imageFetchers);
    return this;
  }

  public LibraryTypeOptionsDto addImageFetchersItem(LibraryOptionInfoDto imageFetchersItem) {
    if (this.imageFetchers == null || !this.imageFetchers.isPresent()) {
      this.imageFetchers = JsonNullable.of(new ArrayList<>());
    }
    this.imageFetchers.get().add(imageFetchersItem);
    return this;
  }

  /**
   * Gets or sets the image fetchers.
   * @return imageFetchers
  */
  @Valid 
  @Schema(name = "ImageFetchers", description = "Gets or sets the image fetchers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageFetchers")
  public JsonNullable<List<@Valid LibraryOptionInfoDto>> getImageFetchers() {
    return imageFetchers;
  }

  public void setImageFetchers(JsonNullable<List<@Valid LibraryOptionInfoDto>> imageFetchers) {
    this.imageFetchers = imageFetchers;
  }

  public LibraryTypeOptionsDto metadataFetchers(List<@Valid LibraryOptionInfoDto> metadataFetchers) {
    this.metadataFetchers = JsonNullable.of(metadataFetchers);
    return this;
  }

  public LibraryTypeOptionsDto addMetadataFetchersItem(LibraryOptionInfoDto metadataFetchersItem) {
    if (this.metadataFetchers == null || !this.metadataFetchers.isPresent()) {
      this.metadataFetchers = JsonNullable.of(new ArrayList<>());
    }
    this.metadataFetchers.get().add(metadataFetchersItem);
    return this;
  }

  /**
   * Gets or sets the metadata fetchers.
   * @return metadataFetchers
  */
  @Valid 
  @Schema(name = "MetadataFetchers", description = "Gets or sets the metadata fetchers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataFetchers")
  public JsonNullable<List<@Valid LibraryOptionInfoDto>> getMetadataFetchers() {
    return metadataFetchers;
  }

  public void setMetadataFetchers(JsonNullable<List<@Valid LibraryOptionInfoDto>> metadataFetchers) {
    this.metadataFetchers = metadataFetchers;
  }

  public LibraryTypeOptionsDto supportedImageTypes(List<@Valid ImageType> supportedImageTypes) {
    this.supportedImageTypes = JsonNullable.of(supportedImageTypes);
    return this;
  }

  public LibraryTypeOptionsDto addSupportedImageTypesItem(ImageType supportedImageTypesItem) {
    if (this.supportedImageTypes == null || !this.supportedImageTypes.isPresent()) {
      this.supportedImageTypes = JsonNullable.of(new ArrayList<>());
    }
    this.supportedImageTypes.get().add(supportedImageTypesItem);
    return this;
  }

  /**
   * Gets or sets the supported image types.
   * @return supportedImageTypes
  */
  @Valid 
  @Schema(name = "SupportedImageTypes", description = "Gets or sets the supported image types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportedImageTypes")
  public JsonNullable<List<@Valid ImageType>> getSupportedImageTypes() {
    return supportedImageTypes;
  }

  public void setSupportedImageTypes(JsonNullable<List<@Valid ImageType>> supportedImageTypes) {
    this.supportedImageTypes = supportedImageTypes;
  }

  public LibraryTypeOptionsDto type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Gets or sets the type.
   * @return type
  */
  
  @Schema(name = "Type", description = "Gets or sets the type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryTypeOptionsDto libraryTypeOptionsDto = (LibraryTypeOptionsDto) o;
    return equalsNullable(this.defaultImageOptions, libraryTypeOptionsDto.defaultImageOptions) &&
        equalsNullable(this.imageFetchers, libraryTypeOptionsDto.imageFetchers) &&
        equalsNullable(this.metadataFetchers, libraryTypeOptionsDto.metadataFetchers) &&
        equalsNullable(this.supportedImageTypes, libraryTypeOptionsDto.supportedImageTypes) &&
        equalsNullable(this.type, libraryTypeOptionsDto.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(defaultImageOptions), hashCodeNullable(imageFetchers), hashCodeNullable(metadataFetchers), hashCodeNullable(supportedImageTypes), hashCodeNullable(type));
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
    sb.append("class LibraryTypeOptionsDto {\n");
    sb.append("    defaultImageOptions: ").append(toIndentedString(defaultImageOptions)).append("\n");
    sb.append("    imageFetchers: ").append(toIndentedString(imageFetchers)).append("\n");
    sb.append("    metadataFetchers: ").append(toIndentedString(metadataFetchers)).append("\n");
    sb.append("    supportedImageTypes: ").append(toIndentedString(supportedImageTypes)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

