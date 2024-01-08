package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseItemDto;
import org.openapitools.model.RecommendationType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RecommendationDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class RecommendationDto {

  private JsonNullable<String> baselineItemName = JsonNullable.<String>undefined();

  private UUID categoryId;

  @Valid
  private JsonNullable<List<@Valid BaseItemDto>> items = JsonNullable.<List<@Valid BaseItemDto>>undefined();

  private RecommendationType recommendationType;

  public RecommendationDto baselineItemName(String baselineItemName) {
    this.baselineItemName = JsonNullable.of(baselineItemName);
    return this;
  }

  /**
   * Get baselineItemName
   * @return baselineItemName
  */
  
  @Schema(name = "BaselineItemName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BaselineItemName")
  public JsonNullable<String> getBaselineItemName() {
    return baselineItemName;
  }

  public void setBaselineItemName(JsonNullable<String> baselineItemName) {
    this.baselineItemName = baselineItemName;
  }

  public RecommendationDto categoryId(UUID categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Get categoryId
   * @return categoryId
  */
  @Valid 
  @Schema(name = "CategoryId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CategoryId")
  public UUID getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(UUID categoryId) {
    this.categoryId = categoryId;
  }

  public RecommendationDto items(List<@Valid BaseItemDto> items) {
    this.items = JsonNullable.of(items);
    return this;
  }

  public RecommendationDto addItemsItem(BaseItemDto itemsItem) {
    if (this.items == null || !this.items.isPresent()) {
      this.items = JsonNullable.of(new ArrayList<>());
    }
    this.items.get().add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
  */
  @Valid 
  @Schema(name = "Items", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Items")
  public JsonNullable<List<@Valid BaseItemDto>> getItems() {
    return items;
  }

  public void setItems(JsonNullable<List<@Valid BaseItemDto>> items) {
    this.items = items;
  }

  public RecommendationDto recommendationType(RecommendationType recommendationType) {
    this.recommendationType = recommendationType;
    return this;
  }

  /**
   * Get recommendationType
   * @return recommendationType
  */
  @Valid 
  @Schema(name = "RecommendationType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RecommendationType")
  public RecommendationType getRecommendationType() {
    return recommendationType;
  }

  public void setRecommendationType(RecommendationType recommendationType) {
    this.recommendationType = recommendationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationDto recommendationDto = (RecommendationDto) o;
    return equalsNullable(this.baselineItemName, recommendationDto.baselineItemName) &&
        Objects.equals(this.categoryId, recommendationDto.categoryId) &&
        equalsNullable(this.items, recommendationDto.items) &&
        Objects.equals(this.recommendationType, recommendationDto.recommendationType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(baselineItemName), categoryId, hashCodeNullable(items), recommendationType);
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
    sb.append("class RecommendationDto {\n");
    sb.append("    baselineItemName: ").append(toIndentedString(baselineItemName)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    recommendationType: ").append(toIndentedString(recommendationType)).append("\n");
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

