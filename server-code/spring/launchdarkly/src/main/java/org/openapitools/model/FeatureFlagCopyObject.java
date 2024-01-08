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
 * FeatureFlagCopyObject
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class FeatureFlagCopyObject {

  private Integer currentVersion;

  private String key;

  public FeatureFlagCopyObject() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FeatureFlagCopyObject(String key) {
    this.key = key;
  }

  public FeatureFlagCopyObject currentVersion(Integer currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * If the latest version of the flag matches provided version it will copy, otherwise it will return a conflict.
   * @return currentVersion
  */
  
  @Schema(name = "currentVersion", example = "65", description = "If the latest version of the flag matches provided version it will copy, otherwise it will return a conflict.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentVersion")
  public Integer getCurrentVersion() {
    return currentVersion;
  }

  public void setCurrentVersion(Integer currentVersion) {
    this.currentVersion = currentVersion;
  }

  public FeatureFlagCopyObject key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The environment key to be used.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "staging", description = "The environment key to be used.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagCopyObject featureFlagCopyObject = (FeatureFlagCopyObject) o;
    return Objects.equals(this.currentVersion, featureFlagCopyObject.currentVersion) &&
        Objects.equals(this.key, featureFlagCopyObject.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentVersion, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagCopyObject {\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

