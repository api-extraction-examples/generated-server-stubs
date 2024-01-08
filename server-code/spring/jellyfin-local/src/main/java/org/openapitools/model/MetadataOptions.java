package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class MetadataOptions.
 */

@Schema(name = "MetadataOptions", description = "Class MetadataOptions.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MetadataOptions {

  @Valid
  private JsonNullable<List<String>> disabledImageFetchers = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> disabledMetadataFetchers = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> disabledMetadataSavers = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> imageFetcherOrder = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> itemType = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> localMetadataReaderOrder = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> metadataFetcherOrder = JsonNullable.<List<String>>undefined();

  public MetadataOptions disabledImageFetchers(List<String> disabledImageFetchers) {
    this.disabledImageFetchers = JsonNullable.of(disabledImageFetchers);
    return this;
  }

  public MetadataOptions addDisabledImageFetchersItem(String disabledImageFetchersItem) {
    if (this.disabledImageFetchers == null || !this.disabledImageFetchers.isPresent()) {
      this.disabledImageFetchers = JsonNullable.of(new ArrayList<>());
    }
    this.disabledImageFetchers.get().add(disabledImageFetchersItem);
    return this;
  }

  /**
   * Get disabledImageFetchers
   * @return disabledImageFetchers
  */
  
  @Schema(name = "DisabledImageFetchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisabledImageFetchers")
  public JsonNullable<List<String>> getDisabledImageFetchers() {
    return disabledImageFetchers;
  }

  public void setDisabledImageFetchers(JsonNullable<List<String>> disabledImageFetchers) {
    this.disabledImageFetchers = disabledImageFetchers;
  }

  public MetadataOptions disabledMetadataFetchers(List<String> disabledMetadataFetchers) {
    this.disabledMetadataFetchers = JsonNullable.of(disabledMetadataFetchers);
    return this;
  }

  public MetadataOptions addDisabledMetadataFetchersItem(String disabledMetadataFetchersItem) {
    if (this.disabledMetadataFetchers == null || !this.disabledMetadataFetchers.isPresent()) {
      this.disabledMetadataFetchers = JsonNullable.of(new ArrayList<>());
    }
    this.disabledMetadataFetchers.get().add(disabledMetadataFetchersItem);
    return this;
  }

  /**
   * Get disabledMetadataFetchers
   * @return disabledMetadataFetchers
  */
  
  @Schema(name = "DisabledMetadataFetchers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisabledMetadataFetchers")
  public JsonNullable<List<String>> getDisabledMetadataFetchers() {
    return disabledMetadataFetchers;
  }

  public void setDisabledMetadataFetchers(JsonNullable<List<String>> disabledMetadataFetchers) {
    this.disabledMetadataFetchers = disabledMetadataFetchers;
  }

  public MetadataOptions disabledMetadataSavers(List<String> disabledMetadataSavers) {
    this.disabledMetadataSavers = JsonNullable.of(disabledMetadataSavers);
    return this;
  }

  public MetadataOptions addDisabledMetadataSaversItem(String disabledMetadataSaversItem) {
    if (this.disabledMetadataSavers == null || !this.disabledMetadataSavers.isPresent()) {
      this.disabledMetadataSavers = JsonNullable.of(new ArrayList<>());
    }
    this.disabledMetadataSavers.get().add(disabledMetadataSaversItem);
    return this;
  }

  /**
   * Get disabledMetadataSavers
   * @return disabledMetadataSavers
  */
  
  @Schema(name = "DisabledMetadataSavers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisabledMetadataSavers")
  public JsonNullable<List<String>> getDisabledMetadataSavers() {
    return disabledMetadataSavers;
  }

  public void setDisabledMetadataSavers(JsonNullable<List<String>> disabledMetadataSavers) {
    this.disabledMetadataSavers = disabledMetadataSavers;
  }

  public MetadataOptions imageFetcherOrder(List<String> imageFetcherOrder) {
    this.imageFetcherOrder = JsonNullable.of(imageFetcherOrder);
    return this;
  }

  public MetadataOptions addImageFetcherOrderItem(String imageFetcherOrderItem) {
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

  public MetadataOptions itemType(String itemType) {
    this.itemType = JsonNullable.of(itemType);
    return this;
  }

  /**
   * Get itemType
   * @return itemType
  */
  
  @Schema(name = "ItemType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemType")
  public JsonNullable<String> getItemType() {
    return itemType;
  }

  public void setItemType(JsonNullable<String> itemType) {
    this.itemType = itemType;
  }

  public MetadataOptions localMetadataReaderOrder(List<String> localMetadataReaderOrder) {
    this.localMetadataReaderOrder = JsonNullable.of(localMetadataReaderOrder);
    return this;
  }

  public MetadataOptions addLocalMetadataReaderOrderItem(String localMetadataReaderOrderItem) {
    if (this.localMetadataReaderOrder == null || !this.localMetadataReaderOrder.isPresent()) {
      this.localMetadataReaderOrder = JsonNullable.of(new ArrayList<>());
    }
    this.localMetadataReaderOrder.get().add(localMetadataReaderOrderItem);
    return this;
  }

  /**
   * Get localMetadataReaderOrder
   * @return localMetadataReaderOrder
  */
  
  @Schema(name = "LocalMetadataReaderOrder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalMetadataReaderOrder")
  public JsonNullable<List<String>> getLocalMetadataReaderOrder() {
    return localMetadataReaderOrder;
  }

  public void setLocalMetadataReaderOrder(JsonNullable<List<String>> localMetadataReaderOrder) {
    this.localMetadataReaderOrder = localMetadataReaderOrder;
  }

  public MetadataOptions metadataFetcherOrder(List<String> metadataFetcherOrder) {
    this.metadataFetcherOrder = JsonNullable.of(metadataFetcherOrder);
    return this;
  }

  public MetadataOptions addMetadataFetcherOrderItem(String metadataFetcherOrderItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataOptions metadataOptions = (MetadataOptions) o;
    return equalsNullable(this.disabledImageFetchers, metadataOptions.disabledImageFetchers) &&
        equalsNullable(this.disabledMetadataFetchers, metadataOptions.disabledMetadataFetchers) &&
        equalsNullable(this.disabledMetadataSavers, metadataOptions.disabledMetadataSavers) &&
        equalsNullable(this.imageFetcherOrder, metadataOptions.imageFetcherOrder) &&
        equalsNullable(this.itemType, metadataOptions.itemType) &&
        equalsNullable(this.localMetadataReaderOrder, metadataOptions.localMetadataReaderOrder) &&
        equalsNullable(this.metadataFetcherOrder, metadataOptions.metadataFetcherOrder);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(disabledImageFetchers), hashCodeNullable(disabledMetadataFetchers), hashCodeNullable(disabledMetadataSavers), hashCodeNullable(imageFetcherOrder), hashCodeNullable(itemType), hashCodeNullable(localMetadataReaderOrder), hashCodeNullable(metadataFetcherOrder));
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
    sb.append("class MetadataOptions {\n");
    sb.append("    disabledImageFetchers: ").append(toIndentedString(disabledImageFetchers)).append("\n");
    sb.append("    disabledMetadataFetchers: ").append(toIndentedString(disabledMetadataFetchers)).append("\n");
    sb.append("    disabledMetadataSavers: ").append(toIndentedString(disabledMetadataSavers)).append("\n");
    sb.append("    imageFetcherOrder: ").append(toIndentedString(imageFetcherOrder)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    localMetadataReaderOrder: ").append(toIndentedString(localMetadataReaderOrder)).append("\n");
    sb.append("    metadataFetcherOrder: ").append(toIndentedString(metadataFetcherOrder)).append("\n");
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

