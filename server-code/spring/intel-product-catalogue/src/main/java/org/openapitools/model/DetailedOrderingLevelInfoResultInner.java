package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DetailedOrderingLevelInfoResultInnerAttributesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DetailedOrderingLevelInfoResultInner
 */

@JsonTypeName("Detailed_ordering_level_info_result_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class DetailedOrderingLevelInfoResultInner {

  @Valid
  private List<@Valid DetailedOrderingLevelInfoResultInnerAttributesInner> attributes;

  private String productId;

  public DetailedOrderingLevelInfoResultInner attributes(List<@Valid DetailedOrderingLevelInfoResultInnerAttributesInner> attributes) {
    this.attributes = attributes;
    return this;
  }

  public DetailedOrderingLevelInfoResultInner addAttributesItem(DetailedOrderingLevelInfoResultInnerAttributesInner attributesItem) {
    if (this.attributes == null) {
      this.attributes = new ArrayList<>();
    }
    this.attributes.add(attributesItem);
    return this;
  }

  /**
   * Get attributes
   * @return attributes
  */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public List<@Valid DetailedOrderingLevelInfoResultInnerAttributesInner> getAttributes() {
    return attributes;
  }

  public void setAttributes(List<@Valid DetailedOrderingLevelInfoResultInnerAttributesInner> attributes) {
    this.attributes = attributes;
  }

  public DetailedOrderingLevelInfoResultInner productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "product_id", example = "123003", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_id")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedOrderingLevelInfoResultInner detailedOrderingLevelInfoResultInner = (DetailedOrderingLevelInfoResultInner) o;
    return Objects.equals(this.attributes, detailedOrderingLevelInfoResultInner.attributes) &&
        Objects.equals(this.productId, detailedOrderingLevelInfoResultInner.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedOrderingLevelInfoResultInner {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

