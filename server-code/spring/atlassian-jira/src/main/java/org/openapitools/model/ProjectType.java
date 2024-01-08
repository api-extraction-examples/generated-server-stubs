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
 * Details about a project type.
 */

@Schema(name = "ProjectType", description = "Details about a project type.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ProjectType {

  private String color;

  private String descriptionI18nKey;

  private String formattedKey;

  private String icon;

  private String key;

  public ProjectType color(String color) {
    this.color = color;
    return this;
  }

  /**
   * The color of the project type.
   * @return color
  */
  
  @Schema(name = "color", accessMode = Schema.AccessMode.READ_ONLY, description = "The color of the project type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("color")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ProjectType descriptionI18nKey(String descriptionI18nKey) {
    this.descriptionI18nKey = descriptionI18nKey;
    return this;
  }

  /**
   * The key of the project type's description.
   * @return descriptionI18nKey
  */
  
  @Schema(name = "descriptionI18nKey", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the project type's description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("descriptionI18nKey")
  public String getDescriptionI18nKey() {
    return descriptionI18nKey;
  }

  public void setDescriptionI18nKey(String descriptionI18nKey) {
    this.descriptionI18nKey = descriptionI18nKey;
  }

  public ProjectType formattedKey(String formattedKey) {
    this.formattedKey = formattedKey;
    return this;
  }

  /**
   * The formatted key of the project type.
   * @return formattedKey
  */
  
  @Schema(name = "formattedKey", accessMode = Schema.AccessMode.READ_ONLY, description = "The formatted key of the project type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formattedKey")
  public String getFormattedKey() {
    return formattedKey;
  }

  public void setFormattedKey(String formattedKey) {
    this.formattedKey = formattedKey;
  }

  public ProjectType icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * The icon of the project type.
   * @return icon
  */
  
  @Schema(name = "icon", accessMode = Schema.AccessMode.READ_ONLY, description = "The icon of the project type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("icon")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public ProjectType key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the project type.
   * @return key
  */
  
  @Schema(name = "key", accessMode = Schema.AccessMode.READ_ONLY, description = "The key of the project type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ProjectType projectType = (ProjectType) o;
    return Objects.equals(this.color, projectType.color) &&
        Objects.equals(this.descriptionI18nKey, projectType.descriptionI18nKey) &&
        Objects.equals(this.formattedKey, projectType.formattedKey) &&
        Objects.equals(this.icon, projectType.icon) &&
        Objects.equals(this.key, projectType.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, descriptionI18nKey, formattedKey, icon, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectType {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    descriptionI18nKey: ").append(toIndentedString(descriptionI18nKey)).append("\n");
    sb.append("    formattedKey: ").append(toIndentedString(formattedKey)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
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

