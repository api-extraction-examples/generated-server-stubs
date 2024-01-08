package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LibraryOptionInfoDto;
import org.openapitools.model.LibraryTypeOptionsDto;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Library options result dto.
 */

@Schema(name = "LibraryOptionsResultDto", description = "Library options result dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class LibraryOptionsResultDto {

  @Valid
  private JsonNullable<List<@Valid LibraryOptionInfoDto>> metadataReaders = JsonNullable.<List<@Valid LibraryOptionInfoDto>>undefined();

  @Valid
  private JsonNullable<List<@Valid LibraryOptionInfoDto>> metadataSavers = JsonNullable.<List<@Valid LibraryOptionInfoDto>>undefined();

  @Valid
  private JsonNullable<List<@Valid LibraryOptionInfoDto>> subtitleFetchers = JsonNullable.<List<@Valid LibraryOptionInfoDto>>undefined();

  @Valid
  private JsonNullable<List<@Valid LibraryTypeOptionsDto>> typeOptions = JsonNullable.<List<@Valid LibraryTypeOptionsDto>>undefined();

  public LibraryOptionsResultDto metadataReaders(List<@Valid LibraryOptionInfoDto> metadataReaders) {
    this.metadataReaders = JsonNullable.of(metadataReaders);
    return this;
  }

  public LibraryOptionsResultDto addMetadataReadersItem(LibraryOptionInfoDto metadataReadersItem) {
    if (this.metadataReaders == null || !this.metadataReaders.isPresent()) {
      this.metadataReaders = JsonNullable.of(new ArrayList<>());
    }
    this.metadataReaders.get().add(metadataReadersItem);
    return this;
  }

  /**
   * Gets or sets the metadata readers.
   * @return metadataReaders
  */
  @Valid 
  @Schema(name = "MetadataReaders", description = "Gets or sets the metadata readers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataReaders")
  public JsonNullable<List<@Valid LibraryOptionInfoDto>> getMetadataReaders() {
    return metadataReaders;
  }

  public void setMetadataReaders(JsonNullable<List<@Valid LibraryOptionInfoDto>> metadataReaders) {
    this.metadataReaders = metadataReaders;
  }

  public LibraryOptionsResultDto metadataSavers(List<@Valid LibraryOptionInfoDto> metadataSavers) {
    this.metadataSavers = JsonNullable.of(metadataSavers);
    return this;
  }

  public LibraryOptionsResultDto addMetadataSaversItem(LibraryOptionInfoDto metadataSaversItem) {
    if (this.metadataSavers == null || !this.metadataSavers.isPresent()) {
      this.metadataSavers = JsonNullable.of(new ArrayList<>());
    }
    this.metadataSavers.get().add(metadataSaversItem);
    return this;
  }

  /**
   * Gets or sets the metadata savers.
   * @return metadataSavers
  */
  @Valid 
  @Schema(name = "MetadataSavers", description = "Gets or sets the metadata savers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataSavers")
  public JsonNullable<List<@Valid LibraryOptionInfoDto>> getMetadataSavers() {
    return metadataSavers;
  }

  public void setMetadataSavers(JsonNullable<List<@Valid LibraryOptionInfoDto>> metadataSavers) {
    this.metadataSavers = metadataSavers;
  }

  public LibraryOptionsResultDto subtitleFetchers(List<@Valid LibraryOptionInfoDto> subtitleFetchers) {
    this.subtitleFetchers = JsonNullable.of(subtitleFetchers);
    return this;
  }

  public LibraryOptionsResultDto addSubtitleFetchersItem(LibraryOptionInfoDto subtitleFetchersItem) {
    if (this.subtitleFetchers == null || !this.subtitleFetchers.isPresent()) {
      this.subtitleFetchers = JsonNullable.of(new ArrayList<>());
    }
    this.subtitleFetchers.get().add(subtitleFetchersItem);
    return this;
  }

  /**
   * Gets or sets the subtitle fetchers.
   * @return subtitleFetchers
  */
  @Valid 
  @Schema(name = "SubtitleFetchers", description = "Gets or sets the subtitle fetchers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleFetchers")
  public JsonNullable<List<@Valid LibraryOptionInfoDto>> getSubtitleFetchers() {
    return subtitleFetchers;
  }

  public void setSubtitleFetchers(JsonNullable<List<@Valid LibraryOptionInfoDto>> subtitleFetchers) {
    this.subtitleFetchers = subtitleFetchers;
  }

  public LibraryOptionsResultDto typeOptions(List<@Valid LibraryTypeOptionsDto> typeOptions) {
    this.typeOptions = JsonNullable.of(typeOptions);
    return this;
  }

  public LibraryOptionsResultDto addTypeOptionsItem(LibraryTypeOptionsDto typeOptionsItem) {
    if (this.typeOptions == null || !this.typeOptions.isPresent()) {
      this.typeOptions = JsonNullable.of(new ArrayList<>());
    }
    this.typeOptions.get().add(typeOptionsItem);
    return this;
  }

  /**
   * Gets or sets the type options.
   * @return typeOptions
  */
  @Valid 
  @Schema(name = "TypeOptions", description = "Gets or sets the type options.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TypeOptions")
  public JsonNullable<List<@Valid LibraryTypeOptionsDto>> getTypeOptions() {
    return typeOptions;
  }

  public void setTypeOptions(JsonNullable<List<@Valid LibraryTypeOptionsDto>> typeOptions) {
    this.typeOptions = typeOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LibraryOptionsResultDto libraryOptionsResultDto = (LibraryOptionsResultDto) o;
    return equalsNullable(this.metadataReaders, libraryOptionsResultDto.metadataReaders) &&
        equalsNullable(this.metadataSavers, libraryOptionsResultDto.metadataSavers) &&
        equalsNullable(this.subtitleFetchers, libraryOptionsResultDto.subtitleFetchers) &&
        equalsNullable(this.typeOptions, libraryOptionsResultDto.typeOptions);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(metadataReaders), hashCodeNullable(metadataSavers), hashCodeNullable(subtitleFetchers), hashCodeNullable(typeOptions));
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
    sb.append("class LibraryOptionsResultDto {\n");
    sb.append("    metadataReaders: ").append(toIndentedString(metadataReaders)).append("\n");
    sb.append("    metadataSavers: ").append(toIndentedString(metadataSavers)).append("\n");
    sb.append("    subtitleFetchers: ").append(toIndentedString(subtitleFetchers)).append("\n");
    sb.append("    typeOptions: ").append(toIndentedString(typeOptions)).append("\n");
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

