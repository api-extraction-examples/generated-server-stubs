package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.IconAssetType;
import org.openapitools.model.ImageAsset;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildIconAttributes
 */

@JsonTypeName("BuildIcon_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildIconAttributes {

  private ImageAsset iconAsset;

  private IconAssetType iconType;

  public BuildIconAttributes iconAsset(ImageAsset iconAsset) {
    this.iconAsset = iconAsset;
    return this;
  }

  /**
   * Get iconAsset
   * @return iconAsset
  */
  @Valid 
  @Schema(name = "iconAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconAsset")
  public ImageAsset getIconAsset() {
    return iconAsset;
  }

  public void setIconAsset(ImageAsset iconAsset) {
    this.iconAsset = iconAsset;
  }

  public BuildIconAttributes iconType(IconAssetType iconType) {
    this.iconType = iconType;
    return this;
  }

  /**
   * Get iconType
   * @return iconType
  */
  @Valid 
  @Schema(name = "iconType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconType")
  public IconAssetType getIconType() {
    return iconType;
  }

  public void setIconType(IconAssetType iconType) {
    this.iconType = iconType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildIconAttributes buildIconAttributes = (BuildIconAttributes) o;
    return Objects.equals(this.iconAsset, buildIconAttributes.iconAsset) &&
        Objects.equals(this.iconType, buildIconAttributes.iconType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconAsset, iconType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildIconAttributes {\n");
    sb.append("    iconAsset: ").append(toIndentedString(iconAsset)).append("\n");
    sb.append("    iconType: ").append(toIndentedString(iconType)).append("\n");
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

