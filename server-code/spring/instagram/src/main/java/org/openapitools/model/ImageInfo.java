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
 * ImageInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class ImageInfo {

  private Integer height;

  private String url;

  private Integer width;

  public ImageInfo height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Image/video height in pixels
   * @return height
  */
  
  @Schema(name = "height", description = "Image/video height in pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImageInfo url(String url) {
    this.url = url;
    return this;
  }

  /**
   * URL of the image/video resource
   * @return url
  */
  
  @Schema(name = "url", description = "URL of the image/video resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ImageInfo width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Image/video width in pixels
   * @return width
  */
  
  @Schema(name = "width", description = "Image/video width in pixels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ImageInfo imageInfo = (ImageInfo) o;
    return Objects.equals(this.height, imageInfo.height) &&
        Objects.equals(this.url, imageInfo.url) &&
        Objects.equals(this.width, imageInfo.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageInfo {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

