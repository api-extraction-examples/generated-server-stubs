package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ImageInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ImagesData
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:07.987869-04:00[America/Lower_Princes]")
public class ImagesData {

  private ImageInfo lowResolution;

  private ImageInfo standardResolution;

  private ImageInfo thumbnail;

  public ImagesData lowResolution(ImageInfo lowResolution) {
    this.lowResolution = lowResolution;
    return this;
  }

  /**
   * Get lowResolution
   * @return lowResolution
  */
  @Valid 
  @Schema(name = "low_resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("low_resolution")
  public ImageInfo getLowResolution() {
    return lowResolution;
  }

  public void setLowResolution(ImageInfo lowResolution) {
    this.lowResolution = lowResolution;
  }

  public ImagesData standardResolution(ImageInfo standardResolution) {
    this.standardResolution = standardResolution;
    return this;
  }

  /**
   * Get standardResolution
   * @return standardResolution
  */
  @Valid 
  @Schema(name = "standard_resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standard_resolution")
  public ImageInfo getStandardResolution() {
    return standardResolution;
  }

  public void setStandardResolution(ImageInfo standardResolution) {
    this.standardResolution = standardResolution;
  }

  public ImagesData thumbnail(ImageInfo thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Get thumbnail
   * @return thumbnail
  */
  @Valid 
  @Schema(name = "thumbnail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnail")
  public ImageInfo getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(ImageInfo thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImagesData imagesData = (ImagesData) o;
    return Objects.equals(this.lowResolution, imagesData.lowResolution) &&
        Objects.equals(this.standardResolution, imagesData.standardResolution) &&
        Objects.equals(this.thumbnail, imagesData.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lowResolution, standardResolution, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagesData {\n");
    sb.append("    lowResolution: ").append(toIndentedString(lowResolution)).append("\n");
    sb.append("    standardResolution: ").append(toIndentedString(standardResolution)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

