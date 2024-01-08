package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class ImageInfo.
 */

@Schema(name = "ImageInfo", description = "Class ImageInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ImageInfo {

  private JsonNullable<String> blurHash = JsonNullable.<String>undefined();

  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> imageIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<String> imageTag = JsonNullable.<String>undefined();

  private ImageType imageType;

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  private Long size;

  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public ImageInfo blurHash(String blurHash) {
    this.blurHash = JsonNullable.of(blurHash);
    return this;
  }

  /**
   * Gets or sets the blurhash.
   * @return blurHash
  */
  
  @Schema(name = "BlurHash", description = "Gets or sets the blurhash.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlurHash")
  public JsonNullable<String> getBlurHash() {
    return blurHash;
  }

  public void setBlurHash(JsonNullable<String> blurHash) {
    this.blurHash = blurHash;
  }

  public ImageInfo height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Gets or sets the height.
   * @return height
  */
  
  @Schema(name = "Height", description = "Gets or sets the height.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Height")
  public JsonNullable<Integer> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public ImageInfo imageIndex(Integer imageIndex) {
    this.imageIndex = JsonNullable.of(imageIndex);
    return this;
  }

  /**
   * Gets or sets the index of the image.
   * @return imageIndex
  */
  
  @Schema(name = "ImageIndex", description = "Gets or sets the index of the image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageIndex")
  public JsonNullable<Integer> getImageIndex() {
    return imageIndex;
  }

  public void setImageIndex(JsonNullable<Integer> imageIndex) {
    this.imageIndex = imageIndex;
  }

  public ImageInfo imageTag(String imageTag) {
    this.imageTag = JsonNullable.of(imageTag);
    return this;
  }

  /**
   * Gets or sets the image tag.
   * @return imageTag
  */
  
  @Schema(name = "ImageTag", description = "Gets or sets the image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageTag")
  public JsonNullable<String> getImageTag() {
    return imageTag;
  }

  public void setImageTag(JsonNullable<String> imageTag) {
    this.imageTag = imageTag;
  }

  public ImageInfo imageType(ImageType imageType) {
    this.imageType = imageType;
    return this;
  }

  /**
   * Get imageType
   * @return imageType
  */
  @Valid 
  @Schema(name = "ImageType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageType")
  public ImageType getImageType() {
    return imageType;
  }

  public void setImageType(ImageType imageType) {
    this.imageType = imageType;
  }

  public ImageInfo path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Gets or sets the path.
   * @return path
  */
  
  @Schema(name = "Path", description = "Gets or sets the path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public ImageInfo size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Gets or sets the size.
   * @return size
  */
  
  @Schema(name = "Size", description = "Gets or sets the size.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public ImageInfo width(Integer width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * Gets or sets the width.
   * @return width
  */
  
  @Schema(name = "Width", description = "Gets or sets the width.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Width")
  public JsonNullable<Integer> getWidth() {
    return width;
  }

  public void setWidth(JsonNullable<Integer> width) {
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
    return equalsNullable(this.blurHash, imageInfo.blurHash) &&
        equalsNullable(this.height, imageInfo.height) &&
        equalsNullable(this.imageIndex, imageInfo.imageIndex) &&
        equalsNullable(this.imageTag, imageInfo.imageTag) &&
        Objects.equals(this.imageType, imageInfo.imageType) &&
        equalsNullable(this.path, imageInfo.path) &&
        Objects.equals(this.size, imageInfo.size) &&
        equalsNullable(this.width, imageInfo.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(blurHash), hashCodeNullable(height), hashCodeNullable(imageIndex), hashCodeNullable(imageTag), imageType, hashCodeNullable(path), size, hashCodeNullable(width));
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
    sb.append("class ImageInfo {\n");
    sb.append("    blurHash: ").append(toIndentedString(blurHash)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageIndex: ").append(toIndentedString(imageIndex)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    imageType: ").append(toIndentedString(imageType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

