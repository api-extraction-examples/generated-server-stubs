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
 * ImageAsset
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class ImageAsset {

  private Integer height;

  private String templateUrl;

  private Integer width;

  public ImageAsset height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Get height
   * @return height
  */
  
  @Schema(name = "height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImageAsset templateUrl(String templateUrl) {
    this.templateUrl = templateUrl;
    return this;
  }

  /**
   * Get templateUrl
   * @return templateUrl
  */
  
  @Schema(name = "templateUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("templateUrl")
  public String getTemplateUrl() {
    return templateUrl;
  }

  public void setTemplateUrl(String templateUrl) {
    this.templateUrl = templateUrl;
  }

  public ImageAsset width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Get width
   * @return width
  */
  
  @Schema(name = "width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageAsset imageAsset = (ImageAsset) o;
    return Objects.equals(this.height, imageAsset.height) &&
        Objects.equals(this.templateUrl, imageAsset.templateUrl) &&
        Objects.equals(this.width, imageAsset.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, templateUrl, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageAsset {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    templateUrl: ").append(toIndentedString(templateUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

