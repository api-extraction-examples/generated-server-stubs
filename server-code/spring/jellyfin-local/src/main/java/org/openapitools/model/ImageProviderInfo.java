package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Class ImageProviderInfo.
 */

@Schema(name = "ImageProviderInfo", description = "Class ImageProviderInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ImageProviderInfo {

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid ImageType>> supportedImages = JsonNullable.<List<@Valid ImageType>>undefined();

  public ImageProviderInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets the name.
   * @return name
  */
  
  @Schema(name = "Name", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public ImageProviderInfo supportedImages(List<@Valid ImageType> supportedImages) {
    this.supportedImages = JsonNullable.of(supportedImages);
    return this;
  }

  public ImageProviderInfo addSupportedImagesItem(ImageType supportedImagesItem) {
    if (this.supportedImages == null || !this.supportedImages.isPresent()) {
      this.supportedImages = JsonNullable.of(new ArrayList<>());
    }
    this.supportedImages.get().add(supportedImagesItem);
    return this;
  }

  /**
   * Gets the supported image types.
   * @return supportedImages
  */
  @Valid 
  @Schema(name = "SupportedImages", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the supported image types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportedImages")
  public JsonNullable<List<@Valid ImageType>> getSupportedImages() {
    return supportedImages;
  }

  public void setSupportedImages(JsonNullable<List<@Valid ImageType>> supportedImages) {
    this.supportedImages = supportedImages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageProviderInfo imageProviderInfo = (ImageProviderInfo) o;
    return equalsNullable(this.name, imageProviderInfo.name) &&
        equalsNullable(this.supportedImages, imageProviderInfo.supportedImages);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(name), hashCodeNullable(supportedImages));
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
    sb.append("class ImageProviderInfo {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportedImages: ").append(toIndentedString(supportedImages)).append("\n");
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

