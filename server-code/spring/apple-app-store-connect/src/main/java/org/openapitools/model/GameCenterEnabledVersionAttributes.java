package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ImageAsset;
import org.openapitools.model.Platform;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameCenterEnabledVersionAttributes
 */

@JsonTypeName("GameCenterEnabledVersion_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class GameCenterEnabledVersionAttributes {

  private ImageAsset iconAsset;

  private Platform platform;

  private String versionString;

  public GameCenterEnabledVersionAttributes iconAsset(ImageAsset iconAsset) {
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

  public GameCenterEnabledVersionAttributes platform(Platform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @Valid 
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public GameCenterEnabledVersionAttributes versionString(String versionString) {
    this.versionString = versionString;
    return this;
  }

  /**
   * Get versionString
   * @return versionString
  */
  
  @Schema(name = "versionString", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionString")
  public String getVersionString() {
    return versionString;
  }

  public void setVersionString(String versionString) {
    this.versionString = versionString;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameCenterEnabledVersionAttributes gameCenterEnabledVersionAttributes = (GameCenterEnabledVersionAttributes) o;
    return Objects.equals(this.iconAsset, gameCenterEnabledVersionAttributes.iconAsset) &&
        Objects.equals(this.platform, gameCenterEnabledVersionAttributes.platform) &&
        Objects.equals(this.versionString, gameCenterEnabledVersionAttributes.versionString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconAsset, platform, versionString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameCenterEnabledVersionAttributes {\n");
    sb.append("    iconAsset: ").append(toIndentedString(iconAsset)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    versionString: ").append(toIndentedString(versionString)).append("\n");
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

