package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DetailedProductInformationResultInnerAllOfReferenceInner
 */

@JsonTypeName("Detailed_product_information_result_inner_allOf_reference_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class DetailedProductInformationResultInnerAllOfReferenceInner {

  @Valid
  private List<String> categoryId;

  private String referenceId;

  private String referenceType;

  public DetailedProductInformationResultInnerAllOfReferenceInner categoryId(List<String> categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  public DetailedProductInformationResultInnerAllOfReferenceInner addCategoryIdItem(String categoryIdItem) {
    if (this.categoryId == null) {
      this.categoryId = new ArrayList<>();
    }
    this.categoryId.add(categoryIdItem);
    return this;
  }

  /**
   * Array of category id's to which the product belong to.
   * @return categoryId
  */
  
  @Schema(name = "category_id", description = "Array of category id's to which the product belong to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category_id")
  public List<String> getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(List<String> categoryId) {
    this.categoryId = categoryId;
  }

  public DetailedProductInformationResultInnerAllOfReferenceInner referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Get referenceId
   * @return referenceId
  */
  
  @Schema(name = "reference_id", example = "2345", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference_id")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public DetailedProductInformationResultInnerAllOfReferenceInner referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }

  /**
   * Get referenceType
   * @return referenceType
  */
  
  @Schema(name = "reference_type", example = "Compatible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference_type")
  public String getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedProductInformationResultInnerAllOfReferenceInner detailedProductInformationResultInnerAllOfReferenceInner = (DetailedProductInformationResultInnerAllOfReferenceInner) o;
    return Objects.equals(this.categoryId, detailedProductInformationResultInnerAllOfReferenceInner.categoryId) &&
        Objects.equals(this.referenceId, detailedProductInformationResultInnerAllOfReferenceInner.referenceId) &&
        Objects.equals(this.referenceType, detailedProductInformationResultInnerAllOfReferenceInner.referenceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, referenceId, referenceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedProductInformationResultInnerAllOfReferenceInner {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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

