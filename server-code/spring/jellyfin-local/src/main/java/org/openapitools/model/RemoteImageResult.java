package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RemoteImageInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class RemoteImageResult.
 */

@Schema(name = "RemoteImageResult", description = "Class RemoteImageResult.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class RemoteImageResult {

  @Valid
  private JsonNullable<List<@Valid RemoteImageInfo>> images = JsonNullable.<List<@Valid RemoteImageInfo>>undefined();

  @Valid
  private JsonNullable<List<String>> providers = JsonNullable.<List<String>>undefined();

  private Integer totalRecordCount;

  public RemoteImageResult images(List<@Valid RemoteImageInfo> images) {
    this.images = JsonNullable.of(images);
    return this;
  }

  public RemoteImageResult addImagesItem(RemoteImageInfo imagesItem) {
    if (this.images == null || !this.images.isPresent()) {
      this.images = JsonNullable.of(new ArrayList<>());
    }
    this.images.get().add(imagesItem);
    return this;
  }

  /**
   * Gets or sets the images.
   * @return images
  */
  @Valid 
  @Schema(name = "Images", description = "Gets or sets the images.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Images")
  public JsonNullable<List<@Valid RemoteImageInfo>> getImages() {
    return images;
  }

  public void setImages(JsonNullable<List<@Valid RemoteImageInfo>> images) {
    this.images = images;
  }

  public RemoteImageResult providers(List<String> providers) {
    this.providers = JsonNullable.of(providers);
    return this;
  }

  public RemoteImageResult addProvidersItem(String providersItem) {
    if (this.providers == null || !this.providers.isPresent()) {
      this.providers = JsonNullable.of(new ArrayList<>());
    }
    this.providers.get().add(providersItem);
    return this;
  }

  /**
   * Gets or sets the providers.
   * @return providers
  */
  
  @Schema(name = "Providers", description = "Gets or sets the providers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Providers")
  public JsonNullable<List<String>> getProviders() {
    return providers;
  }

  public void setProviders(JsonNullable<List<String>> providers) {
    this.providers = providers;
  }

  public RemoteImageResult totalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
    return this;
  }

  /**
   * Gets or sets the total record count.
   * @return totalRecordCount
  */
  
  @Schema(name = "TotalRecordCount", description = "Gets or sets the total record count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TotalRecordCount")
  public Integer getTotalRecordCount() {
    return totalRecordCount;
  }

  public void setTotalRecordCount(Integer totalRecordCount) {
    this.totalRecordCount = totalRecordCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RemoteImageResult remoteImageResult = (RemoteImageResult) o;
    return equalsNullable(this.images, remoteImageResult.images) &&
        equalsNullable(this.providers, remoteImageResult.providers) &&
        Objects.equals(this.totalRecordCount, remoteImageResult.totalRecordCount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(images), hashCodeNullable(providers), totalRecordCount);
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
    sb.append("class RemoteImageResult {\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    totalRecordCount: ").append(toIndentedString(totalRecordCount)).append("\n");
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

