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
 * DetailedOrderingLevelInfoResultInnerAttributesInner
 */

@JsonTypeName("Detailed_ordering_level_info_result_inner_attributes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class DetailedOrderingLevelInfoResultInnerAttributesInner {

  private String highlightKey;

  private String label;

  private String rawValue;

  private String toolTip;

  private String value;

  public DetailedOrderingLevelInfoResultInnerAttributesInner highlightKey(String highlightKey) {
    this.highlightKey = highlightKey;
    return this;
  }

  /**
   * Get highlightKey
   * @return highlightKey
  */
  
  @Schema(name = "highlight_key", example = "OrderingCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highlight_key")
  public String getHighlightKey() {
    return highlightKey;
  }

  public void setHighlightKey(String highlightKey) {
    this.highlightKey = highlightKey;
  }

  public DetailedOrderingLevelInfoResultInnerAttributesInner label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", example = "Ordering Code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DetailedOrderingLevelInfoResultInnerAttributesInner rawValue(String rawValue) {
    this.rawValue = rawValue;
    return this;
  }

  /**
   * Get rawValue
   * @return rawValue
  */
  
  @Schema(name = "raw_value", example = "CM8068403377111", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("raw_value")
  public String getRawValue() {
    return rawValue;
  }

  public void setRawValue(String rawValue) {
    this.rawValue = rawValue;
  }

  public DetailedOrderingLevelInfoResultInnerAttributesInner toolTip(String toolTip) {
    this.toolTip = toolTip;
    return this;
  }

  /**
   * Get toolTip
   * @return toolTip
  */
  
  @Schema(name = "tool_tip", example = "tool tip", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tool_tip")
  public String getToolTip() {
    return toolTip;
  }

  public void setToolTip(String toolTip) {
    this.toolTip = toolTip;
  }

  public DetailedOrderingLevelInfoResultInnerAttributesInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", example = "CM8068403377111", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DetailedOrderingLevelInfoResultInnerAttributesInner detailedOrderingLevelInfoResultInnerAttributesInner = (DetailedOrderingLevelInfoResultInnerAttributesInner) o;
    return Objects.equals(this.highlightKey, detailedOrderingLevelInfoResultInnerAttributesInner.highlightKey) &&
        Objects.equals(this.label, detailedOrderingLevelInfoResultInnerAttributesInner.label) &&
        Objects.equals(this.rawValue, detailedOrderingLevelInfoResultInnerAttributesInner.rawValue) &&
        Objects.equals(this.toolTip, detailedOrderingLevelInfoResultInnerAttributesInner.toolTip) &&
        Objects.equals(this.value, detailedOrderingLevelInfoResultInnerAttributesInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(highlightKey, label, rawValue, toolTip, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedOrderingLevelInfoResultInnerAttributesInner {\n");
    sb.append("    highlightKey: ").append(toIndentedString(highlightKey)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    rawValue: ").append(toIndentedString(rawValue)).append("\n");
    sb.append("    toolTip: ").append(toIndentedString(toolTip)).append("\n");
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

