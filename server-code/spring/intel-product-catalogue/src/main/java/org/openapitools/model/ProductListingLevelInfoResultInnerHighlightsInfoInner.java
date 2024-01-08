package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductListingLevelInfoResultInnerHighlightsInfoInner
 */

@JsonTypeName("Product_listing_level_info_result_inner_highlights_info_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class ProductListingLevelInfoResultInnerHighlightsInfoInner {

  private String highlightKey;

  private String label;

  private String rawValue;

  private String value;

  public ProductListingLevelInfoResultInnerHighlightsInfoInner highlightKey(String highlightKey) {
    this.highlightKey = highlightKey;
    return this;
  }

  /**
   * Get highlightKey
   * @return highlightKey
  */
  
  @Schema(name = "highlight_key", example = "StatusCodeText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highlight_key")
  public String getHighlightKey() {
    return highlightKey;
  }

  public void setHighlightKey(String highlightKey) {
    this.highlightKey = highlightKey;
  }

  public ProductListingLevelInfoResultInnerHighlightsInfoInner label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", example = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ProductListingLevelInfoResultInnerHighlightsInfoInner rawValue(String rawValue) {
    this.rawValue = rawValue;
    return this;
  }

  /**
   * Get rawValue
   * @return rawValue
  */
  
  @Schema(name = "raw_value", example = "4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("raw_value")
  public String getRawValue() {
    return rawValue;
  }

  public void setRawValue(String rawValue) {
    this.rawValue = rawValue;
  }

  public ProductListingLevelInfoResultInnerHighlightsInfoInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", example = "Launched", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductListingLevelInfoResultInnerHighlightsInfoInner productListingLevelInfoResultInnerHighlightsInfoInner = (ProductListingLevelInfoResultInnerHighlightsInfoInner) o;
    return Objects.equals(this.highlightKey, productListingLevelInfoResultInnerHighlightsInfoInner.highlightKey) &&
        Objects.equals(this.label, productListingLevelInfoResultInnerHighlightsInfoInner.label) &&
        Objects.equals(this.rawValue, productListingLevelInfoResultInnerHighlightsInfoInner.rawValue) &&
        Objects.equals(this.value, productListingLevelInfoResultInnerHighlightsInfoInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highlightKey, label, rawValue, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductListingLevelInfoResultInnerHighlightsInfoInner {\n");
    sb.append("    highlightKey: ").append(toIndentedString(highlightKey)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    rawValue: ").append(toIndentedString(rawValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

