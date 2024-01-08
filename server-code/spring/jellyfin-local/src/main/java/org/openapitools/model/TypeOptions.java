package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ImageOption;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TypeOptions
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TypeOptions {

  @Valid
  private JsonNullable<List<String>> imageFetcherOrder = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> imageFetchers = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<@Valid ImageOption>> imageOptions = JsonNullable.<List<@Valid ImageOption>>undefined();

  @Valid
  private JsonNullable<List<String>> metadataFetcherOrder = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> metadataFetchers = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public TypeOptions imageFetcherOrder(List<String> imageFetcherOrder) {
    this.imageFetcherOrder = JsonNullable.of(imageFetcherOrder);
    return this;
  }

  public TypeOptions addImageFetcherOrderItem(String imageFetcherOrderItem) {
    if (this.imageFetcherOrder == null || !this.imageFetcherOrder.isPresent()) {
      this.imageFetcherOrder = JsonNullable.of(new ArrayList<>());
    }
    this.imageFetcherOrder.get().add(imageFetcherOrderItem);
    return this;
  }

  /**
   * Get imageFetcherOrder
   * @return imageFetcherOrder
  */
  
  @Schema(name = "ImageFetcherOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageFetcherOrder")
  public JsonNullable<List<String>> getImageFetcherOrder() {
    return imageFetcherOrder;
  }

  public void setImageFetcherOrder(JsonNullable<List<String>> imageFetcherOrder) {
    this.imageFetcherOrder = imageFetcherOrder;
  }

  public TypeOptions imageFetchers(List<String> imageFetchers) {
    this.imageFetchers = JsonNullable.of(imageFetchers);
    return this;
  }

  public TypeOptions addImageFetchersItem(String imageFetchersItem) {
    if (this.imageFetchers == null || !this.imageFetchers.isPresent()) {
      this.imageFetchers = JsonNullable.of(new ArrayList<>());
    }
    this.imageFetchers.get().add(imageFetchersItem);
    return this;
  }

  /**
   * Get imageFetchers
   * @return imageFetchers
  */
  
  @Schema(name = "ImageFetchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageFetchers")
  public JsonNullable<List<String>> getImageFetchers() {
    return imageFetchers;
  }

  public void setImageFetchers(JsonNullable<List<String>> imageFetchers) {
    this.imageFetchers = imageFetchers;
  }

  public TypeOptions imageOptions(List<@Valid ImageOption> imageOptions) {
    this.imageOptions = JsonNullable.of(imageOptions);
    return this;
  }

  public TypeOptions addImageOptionsItem(ImageOption imageOptionsItem) {
    if (this.imageOptions == null || !this.imageOptions.isPresent()) {
      this.imageOptions = JsonNullable.of(new ArrayList<>());
    }
    this.imageOptions.get().add(imageOptionsItem);
    return this;
  }

  /**
   * Get imageOptions
   * @return imageOptions
  */
  @Valid 
  @Schema(name = "ImageOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageOptions")
  public JsonNullable<List<@Valid ImageOption>> getImageOptions() {
    return imageOptions;
  }

  public void setImageOptions(JsonNullable<List<@Valid ImageOption>> imageOptions) {
    this.imageOptions = imageOptions;
  }

  public TypeOptions metadataFetcherOrder(List<String> metadataFetcherOrder) {
    this.metadataFetcherOrder = JsonNullable.of(metadataFetcherOrder);
    return this;
  }

  public TypeOptions addMetadataFetcherOrderItem(String metadataFetcherOrderItem) {
    if (this.metadataFetcherOrder == null || !this.metadataFetcherOrder.isPresent()) {
      this.metadataFetcherOrder = JsonNullable.of(new ArrayList<>());
    }
    this.metadataFetcherOrder.get().add(metadataFetcherOrderItem);
    return this;
  }

  /**
   * Get metadataFetcherOrder
   * @return metadataFetcherOrder
  */
  
  @Schema(name = "MetadataFetcherOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataFetcherOrder")
  public JsonNullable<List<String>> getMetadataFetcherOrder() {
    return metadataFetcherOrder;
  }

  public void setMetadataFetcherOrder(JsonNullable<List<String>> metadataFetcherOrder) {
    this.metadataFetcherOrder = metadataFetcherOrder;
  }

  public TypeOptions metadataFetchers(List<String> metadataFetchers) {
    this.metadataFetchers = JsonNullable.of(metadataFetchers);
    return this;
  }

  public TypeOptions addMetadataFetchersItem(String metadataFetchersItem) {
    if (this.metadataFetchers == null || !this.metadataFetchers.isPresent()) {
      this.metadataFetchers = JsonNullable.of(new ArrayList<>());
    }
    this.metadataFetchers.get().add(metadataFetchersItem);
    return this;
  }

  /**
   * Get metadataFetchers
   * @return metadataFetchers
  */
  
  @Schema(name = "MetadataFetchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataFetchers")
  public JsonNullable<List<String>> getMetadataFetchers() {
    return metadataFetchers;
  }

  public void setMetadataFetchers(JsonNullable<List<String>> metadataFetchers) {
    this.metadataFetchers = metadataFetchers;
  }

  public TypeOptions type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeOptions typeOptions = (TypeOptions) o;
    return equalsNullable(this.imageFetcherOrder, typeOptions.imageFetcherOrder) &&
        equalsNullable(this.imageFetchers, typeOptions.imageFetchers) &&
        equalsNullable(this.imageOptions, typeOptions.imageOptions) &&
        equalsNullable(this.metadataFetcherOrder, typeOptions.metadataFetcherOrder) &&
        equalsNullable(this.metadataFetchers, typeOptions.metadataFetchers) &&
        equalsNullable(this.type, typeOptions.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(imageFetcherOrder), hashCodeNullable(imageFetchers), hashCodeNullable(imageOptions), hashCodeNullable(metadataFetcherOrder), hashCodeNullable(metadataFetchers), hashCodeNullable(type));
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
    sb.append("class TypeOptions {\n");
    sb.append("    imageFetcherOrder: ").append(toIndentedString(imageFetcherOrder)).append("\n");
    sb.append("    imageFetchers: ").append(toIndentedString(imageFetchers)).append("\n");
    sb.append("    imageOptions: ").append(toIndentedString(imageOptions)).append("\n");
    sb.append("    metadataFetcherOrder: ").append(toIndentedString(metadataFetcherOrder)).append("\n");
    sb.append("    metadataFetchers: ").append(toIndentedString(metadataFetchers)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

