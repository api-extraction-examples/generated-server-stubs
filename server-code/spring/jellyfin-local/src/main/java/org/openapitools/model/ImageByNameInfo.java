package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
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
 * ImageByNameInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ImageByNameInfo {

  private JsonNullable<String> context = JsonNullable.<String>undefined();

  private Long fileLength;

  private JsonNullable<String> format = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> theme = JsonNullable.<String>undefined();

  public ImageByNameInfo context(String context) {
    this.context = JsonNullable.of(context);
    return this;
  }

  /**
   * Gets or sets the context.
   * @return context
  */
  
  @Schema(name = "Context", description = "Gets or sets the context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Context")
  public JsonNullable<String> getContext() {
    return context;
  }

  public void setContext(JsonNullable<String> context) {
    this.context = context;
  }

  public ImageByNameInfo fileLength(Long fileLength) {
    this.fileLength = fileLength;
    return this;
  }

  /**
   * Gets or sets the length of the file.
   * @return fileLength
  */
  
  @Schema(name = "FileLength", description = "Gets or sets the length of the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FileLength")
  public Long getFileLength() {
    return fileLength;
  }

  public void setFileLength(Long fileLength) {
    this.fileLength = fileLength;
  }

  public ImageByNameInfo format(String format) {
    this.format = JsonNullable.of(format);
    return this;
  }

  /**
   * Gets or sets the format.
   * @return format
  */
  
  @Schema(name = "Format", description = "Gets or sets the format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Format")
  public JsonNullable<String> getFormat() {
    return format;
  }

  public void setFormat(JsonNullable<String> format) {
    this.format = format;
  }

  public ImageByNameInfo name(String name) {
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

  public ImageByNameInfo theme(String theme) {
    this.theme = JsonNullable.of(theme);
    return this;
  }

  /**
   * Gets or sets the theme.
   * @return theme
  */
  
  @Schema(name = "Theme", description = "Gets or sets the theme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Theme")
  public JsonNullable<String> getTheme() {
    return theme;
  }

  public void setTheme(JsonNullable<String> theme) {
    this.theme = theme;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageByNameInfo imageByNameInfo = (ImageByNameInfo) o;
    return equalsNullable(this.context, imageByNameInfo.context) &&
        Objects.equals(this.fileLength, imageByNameInfo.fileLength) &&
        equalsNullable(this.format, imageByNameInfo.format) &&
        equalsNullable(this.name, imageByNameInfo.name) &&
        equalsNullable(this.theme, imageByNameInfo.theme);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(context), fileLength, hashCodeNullable(format), hashCodeNullable(name), hashCodeNullable(theme));
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
    sb.append("class ImageByNameInfo {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    fileLength: ").append(toIndentedString(fileLength)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    theme: ").append(toIndentedString(theme)).append("\n");
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

