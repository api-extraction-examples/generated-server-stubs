package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Upload subtitles dto.
 */

@Schema(name = "UploadSubtitleDto", description = "Upload subtitles dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UploadSubtitleDto {

  private String data;

  private String format;

  private Boolean isForced;

  private String language;

  public UploadSubtitleDto() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadSubtitleDto(String data, String format, Boolean isForced, String language) {
    this.data = data;
    this.format = format;
    this.isForced = isForced;
    this.language = language;
  }

  public UploadSubtitleDto data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Gets or sets the subtitle data.
   * @return data
  */
  @NotNull 
  @Schema(name = "Data", description = "Gets or sets the subtitle data.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public UploadSubtitleDto format(String format) {
    this.format = format;
    return this;
  }

  /**
   * Gets or sets the subtitle format.
   * @return format
  */
  @NotNull 
  @Schema(name = "Format", description = "Gets or sets the subtitle format.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Format")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public UploadSubtitleDto isForced(Boolean isForced) {
    this.isForced = isForced;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the subtitle is forced.
   * @return isForced
  */
  @NotNull 
  @Schema(name = "IsForced", description = "Gets or sets a value indicating whether the subtitle is forced.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("IsForced")
  public Boolean getIsForced() {
    return isForced;
  }

  public void setIsForced(Boolean isForced) {
    this.isForced = isForced;
  }

  public UploadSubtitleDto language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Gets or sets the subtitle language.
   * @return language
  */
  @NotNull 
  @Schema(name = "Language", description = "Gets or sets the subtitle language.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSubtitleDto uploadSubtitleDto = (UploadSubtitleDto) o;
    return Objects.equals(this.data, uploadSubtitleDto.data) &&
        Objects.equals(this.format, uploadSubtitleDto.format) &&
        Objects.equals(this.isForced, uploadSubtitleDto.isForced) &&
        Objects.equals(this.language, uploadSubtitleDto.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, format, isForced, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSubtitleDto {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    isForced: ").append(toIndentedString(isForced)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

