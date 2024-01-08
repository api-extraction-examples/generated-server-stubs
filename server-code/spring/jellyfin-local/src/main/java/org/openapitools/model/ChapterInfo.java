package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class ChapterInfo.
 */

@Schema(name = "ChapterInfo", description = "Class ChapterInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ChapterInfo {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime imageDateModified;

  private JsonNullable<String> imagePath = JsonNullable.<String>undefined();

  private JsonNullable<String> imageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private Long startPositionTicks;

  public ChapterInfo imageDateModified(OffsetDateTime imageDateModified) {
    this.imageDateModified = imageDateModified;
    return this;
  }

  /**
   * Get imageDateModified
   * @return imageDateModified
  */
  @Valid 
  @Schema(name = "ImageDateModified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageDateModified")
  public OffsetDateTime getImageDateModified() {
    return imageDateModified;
  }

  public void setImageDateModified(OffsetDateTime imageDateModified) {
    this.imageDateModified = imageDateModified;
  }

  public ChapterInfo imagePath(String imagePath) {
    this.imagePath = JsonNullable.of(imagePath);
    return this;
  }

  /**
   * Gets or sets the image path.
   * @return imagePath
  */
  
  @Schema(name = "ImagePath", description = "Gets or sets the image path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImagePath")
  public JsonNullable<String> getImagePath() {
    return imagePath;
  }

  public void setImagePath(JsonNullable<String> imagePath) {
    this.imagePath = imagePath;
  }

  public ChapterInfo imageTag(String imageTag) {
    this.imageTag = JsonNullable.of(imageTag);
    return this;
  }

  /**
   * Get imageTag
   * @return imageTag
  */
  
  @Schema(name = "ImageTag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageTag")
  public JsonNullable<String> getImageTag() {
    return imageTag;
  }

  public void setImageTag(JsonNullable<String> imageTag) {
    this.imageTag = imageTag;
  }

  public ChapterInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public ChapterInfo startPositionTicks(Long startPositionTicks) {
    this.startPositionTicks = startPositionTicks;
    return this;
  }

  /**
   * Gets or sets the start position ticks.
   * @return startPositionTicks
  */
  
  @Schema(name = "StartPositionTicks", description = "Gets or sets the start position ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartPositionTicks")
  public Long getStartPositionTicks() {
    return startPositionTicks;
  }

  public void setStartPositionTicks(Long startPositionTicks) {
    this.startPositionTicks = startPositionTicks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChapterInfo chapterInfo = (ChapterInfo) o;
    return Objects.equals(this.imageDateModified, chapterInfo.imageDateModified) &&
        equalsNullable(this.imagePath, chapterInfo.imagePath) &&
        equalsNullable(this.imageTag, chapterInfo.imageTag) &&
        equalsNullable(this.name, chapterInfo.name) &&
        Objects.equals(this.startPositionTicks, chapterInfo.startPositionTicks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageDateModified, hashCodeNullable(imagePath), hashCodeNullable(imageTag), hashCodeNullable(name), startPositionTicks);
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
    sb.append("class ChapterInfo {\n");
    sb.append("    imageDateModified: ").append(toIndentedString(imageDateModified)).append("\n");
    sb.append("    imagePath: ").append(toIndentedString(imagePath)).append("\n");
    sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startPositionTicks: ").append(toIndentedString(startPositionTicks)).append("\n");
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

