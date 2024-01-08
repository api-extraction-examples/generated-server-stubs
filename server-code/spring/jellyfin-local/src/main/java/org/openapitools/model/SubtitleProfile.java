package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SubtitleDeliveryMethod;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SubtitleProfile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SubtitleProfile {

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  private JsonNullable<String> didlMode = JsonNullable.<String>undefined();

  private JsonNullable<String> format = JsonNullable.<String>undefined();

  private JsonNullable<String> language = JsonNullable.<String>undefined();

  private SubtitleDeliveryMethod method;

  public SubtitleProfile container(String container) {
    this.container = JsonNullable.of(container);
    return this;
  }

  /**
   * Get container
   * @return container
  */
  
  @Schema(name = "Container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public JsonNullable<String> getContainer() {
    return container;
  }

  public void setContainer(JsonNullable<String> container) {
    this.container = container;
  }

  public SubtitleProfile didlMode(String didlMode) {
    this.didlMode = JsonNullable.of(didlMode);
    return this;
  }

  /**
   * Get didlMode
   * @return didlMode
  */
  
  @Schema(name = "DidlMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DidlMode")
  public JsonNullable<String> getDidlMode() {
    return didlMode;
  }

  public void setDidlMode(JsonNullable<String> didlMode) {
    this.didlMode = didlMode;
  }

  public SubtitleProfile format(String format) {
    this.format = JsonNullable.of(format);
    return this;
  }

  /**
   * Get format
   * @return format
  */
  
  @Schema(name = "Format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Format")
  public JsonNullable<String> getFormat() {
    return format;
  }

  public void setFormat(JsonNullable<String> format) {
    this.format = format;
  }

  public SubtitleProfile language(String language) {
    this.language = JsonNullable.of(language);
    return this;
  }

  /**
   * Get language
   * @return language
  */
  
  @Schema(name = "Language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Language")
  public JsonNullable<String> getLanguage() {
    return language;
  }

  public void setLanguage(JsonNullable<String> language) {
    this.language = language;
  }

  public SubtitleProfile method(SubtitleDeliveryMethod method) {
    this.method = method;
    return this;
  }

  /**
   * Get method
   * @return method
  */
  @Valid 
  @Schema(name = "Method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Method")
  public SubtitleDeliveryMethod getMethod() {
    return method;
  }

  public void setMethod(SubtitleDeliveryMethod method) {
    this.method = method;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubtitleProfile subtitleProfile = (SubtitleProfile) o;
    return equalsNullable(this.container, subtitleProfile.container) &&
        equalsNullable(this.didlMode, subtitleProfile.didlMode) &&
        equalsNullable(this.format, subtitleProfile.format) &&
        equalsNullable(this.language, subtitleProfile.language) &&
        Objects.equals(this.method, subtitleProfile.method);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(container), hashCodeNullable(didlMode), hashCodeNullable(format), hashCodeNullable(language), method);
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
    sb.append("class SubtitleProfile {\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    didlMode: ").append(toIndentedString(didlMode)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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

