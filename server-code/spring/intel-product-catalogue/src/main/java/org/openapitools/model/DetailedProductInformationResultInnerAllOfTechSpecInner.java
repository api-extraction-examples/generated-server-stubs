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
 * DetailedProductInformationResultInnerAllOfTechSpecInner
 */

@JsonTypeName("Detailed_product_information_result_inner_allOf_tech_spec_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class DetailedProductInformationResultInnerAllOfTechSpecInner {

  private String disclaimer;

  private String highlightKey;

  private String label;

  private String rawValue;

  private String toolTip;

  private String value;

  public DetailedProductInformationResultInnerAllOfTechSpecInner disclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
    return this;
  }

  /**
   * Get disclaimer
   * @return disclaimer
  */
  
  @Schema(name = "disclaimer", example = "Max Turbo Frequency refers to the maximum single-core processor frequency that can be achieved with Intel® Turbo Boost Technology.  See <a href=\"http://www.intel.com/technology/turboboost/\">www.intel.com/technology/turboboost/</a> for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disclaimer")
  public String getDisclaimer() {
    return disclaimer;
  }

  public void setDisclaimer(String disclaimer) {
    this.disclaimer = disclaimer;
  }

  public DetailedProductInformationResultInnerAllOfTechSpecInner highlightKey(String highlightKey) {
    this.highlightKey = highlightKey;
    return this;
  }

  /**
   * Get highlightKey
   * @return highlightKey
  */
  
  @Schema(name = "highlight_key", example = "TBTVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highlight_key")
  public String getHighlightKey() {
    return highlightKey;
  }

  public void setHighlightKey(String highlightKey) {
    this.highlightKey = highlightKey;
  }

  public DetailedProductInformationResultInnerAllOfTechSpecInner label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Get label
   * @return label
  */
  
  @Schema(name = "label", example = "Intel® Turbo Boost Technology <small><sup>‡</sup></small>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public DetailedProductInformationResultInnerAllOfTechSpecInner rawValue(String rawValue) {
    this.rawValue = rawValue;
    return this;
  }

  /**
   * Get rawValue
   * @return rawValue
  */
  
  @Schema(name = "raw_value", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("raw_value")
  public String getRawValue() {
    return rawValue;
  }

  public void setRawValue(String rawValue) {
    this.rawValue = rawValue;
  }

  public DetailedProductInformationResultInnerAllOfTechSpecInner toolTip(String toolTip) {
    this.toolTip = toolTip;
    return this;
  }

  /**
   * Get toolTip
   * @return toolTip
  */
  
  @Schema(name = "tool_tip", example = "Intel® Turbo Boost Technology dynamically increases the processor's frequency as needed by taking advantage of thermal and power headroom to give you a burst of speed when you need it, and increased energy efficiency when you don’t.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tool_tip")
  public String getToolTip() {
    return toolTip;
  }

  public void setToolTip(String toolTip) {
    this.toolTip = toolTip;
  }

  public DetailedProductInformationResultInnerAllOfTechSpecInner value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", example = "2.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DetailedProductInformationResultInnerAllOfTechSpecInner detailedProductInformationResultInnerAllOfTechSpecInner = (DetailedProductInformationResultInnerAllOfTechSpecInner) o;
    return Objects.equals(this.disclaimer, detailedProductInformationResultInnerAllOfTechSpecInner.disclaimer) &&
        Objects.equals(this.highlightKey, detailedProductInformationResultInnerAllOfTechSpecInner.highlightKey) &&
        Objects.equals(this.label, detailedProductInformationResultInnerAllOfTechSpecInner.label) &&
        Objects.equals(this.rawValue, detailedProductInformationResultInnerAllOfTechSpecInner.rawValue) &&
        Objects.equals(this.toolTip, detailedProductInformationResultInnerAllOfTechSpecInner.toolTip) &&
        Objects.equals(this.value, detailedProductInformationResultInnerAllOfTechSpecInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disclaimer, highlightKey, label, rawValue, toolTip, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedProductInformationResultInnerAllOfTechSpecInner {\n");
    sb.append("    disclaimer: ").append(toIndentedString(disclaimer)).append("\n");
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

