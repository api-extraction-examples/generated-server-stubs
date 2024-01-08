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
 * The startup configuration DTO.
 */

@Schema(name = "StartupConfigurationDto", description = "The startup configuration DTO.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class StartupConfigurationDto {

  private JsonNullable<String> metadataCountryCode = JsonNullable.<String>undefined();

  private JsonNullable<String> preferredMetadataLanguage = JsonNullable.<String>undefined();

  private JsonNullable<String> uiCulture = JsonNullable.<String>undefined();

  public StartupConfigurationDto metadataCountryCode(String metadataCountryCode) {
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

  public StartupConfigurationDto preferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = JsonNullable.of(preferredMetadataLanguage);
    return this;
  }

  /**
   * Gets or sets the preferred language for the metadata.
   * @return preferredMetadataLanguage
  */
  
  @Schema(name = "PreferredMetadataLanguage", description = "Gets or sets the preferred language for the metadata.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreferredMetadataLanguage")
  public JsonNullable<String> getPreferredMetadataLanguage() {
    return preferredMetadataLanguage;
  }

  public void setPreferredMetadataLanguage(JsonNullable<String> preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
  }

  public StartupConfigurationDto uiCulture(String uiCulture) {
    this.uiCulture = JsonNullable.of(uiCulture);
    return this;
  }

  /**
   * Gets or sets UI language culture.
   * @return uiCulture
  */
  
  @Schema(name = "UICulture", description = "Gets or sets UI language culture.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UICulture")
  public JsonNullable<String> getUiCulture() {
    return uiCulture;
  }

  public void setUiCulture(JsonNullable<String> uiCulture) {
    this.uiCulture = uiCulture;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartupConfigurationDto startupConfigurationDto = (StartupConfigurationDto) o;
    return equalsNullable(this.metadataCountryCode, startupConfigurationDto.metadataCountryCode) &&
        equalsNullable(this.preferredMetadataLanguage, startupConfigurationDto.preferredMetadataLanguage) &&
        equalsNullable(this.uiCulture, startupConfigurationDto.uiCulture);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(metadataCountryCode), hashCodeNullable(preferredMetadataLanguage), hashCodeNullable(uiCulture));
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
    sb.append("class StartupConfigurationDto {\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    preferredMetadataLanguage: ").append(toIndentedString(preferredMetadataLanguage)).append("\n");
    sb.append("    uiCulture: ").append(toIndentedString(uiCulture)).append("\n");
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

