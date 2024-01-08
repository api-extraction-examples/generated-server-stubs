package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductListingLevelInfoResultInnerHighlightsInfoInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductListingLevelInfoResultInner
 */

@JsonTypeName("Product_listing_level_info_result_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class ProductListingLevelInfoResultInner {

  private String createdDate;

  @Valid
  private List<@Valid ProductListingLevelInfoResultInnerHighlightsInfoInner> highlightsInfo;

  private String mktgPrdType;

  @Valid
  private List<String> productCategory;

  private String productDescription;

  private String productId;

  private String productManufacturer;

  private String productName;

  private String productNameRaw;

  private String productOnMarketDate;

  private String updatedDate;

  public ProductListingLevelInfoResultInner createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  
  @Schema(name = "created_date", example = "2018-04-17T08:29:13:770-0400", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public ProductListingLevelInfoResultInner highlightsInfo(List<@Valid ProductListingLevelInfoResultInnerHighlightsInfoInner> highlightsInfo) {
    this.highlightsInfo = highlightsInfo;
    return this;
  }

  public ProductListingLevelInfoResultInner addHighlightsInfoItem(ProductListingLevelInfoResultInnerHighlightsInfoInner highlightsInfoItem) {
    if (this.highlightsInfo == null) {
      this.highlightsInfo = new ArrayList<>();
    }
    this.highlightsInfo.add(highlightsInfoItem);
    return this;
  }

  /**
   * Get highlightsInfo
   * @return highlightsInfo
  */
  @Valid 
  @Schema(name = "highlights_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highlights_info")
  public List<@Valid ProductListingLevelInfoResultInnerHighlightsInfoInner> getHighlightsInfo() {
    return highlightsInfo;
  }

  public void setHighlightsInfo(List<@Valid ProductListingLevelInfoResultInnerHighlightsInfoInner> highlightsInfo) {
    this.highlightsInfo = highlightsInfo;
  }

  public ProductListingLevelInfoResultInner mktgPrdType(String mktgPrdType) {
    this.mktgPrdType = mktgPrdType;
    return this;
  }

  /**
   * Get mktgPrdType
   * @return mktgPrdType
  */
  
  @Schema(name = "mktg_prd_type", example = "18", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mktg_prd_type")
  public String getMktgPrdType() {
    return mktgPrdType;
  }

  public void setMktgPrdType(String mktgPrdType) {
    this.mktgPrdType = mktgPrdType;
  }

  public ProductListingLevelInfoResultInner productCategory(List<String> productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  public ProductListingLevelInfoResultInner addProductCategoryItem(String productCategoryItem) {
    if (this.productCategory == null) {
      this.productCategory = new ArrayList<>();
    }
    this.productCategory.add(productCategoryItem);
    return this;
  }

  /**
   * Multiple product category
   * @return productCategory
  */
  
  @Schema(name = "product_category", example = "[51163, 12201]", description = "Multiple product category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_category")
  public List<String> getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(List<String> productCategory) {
    this.productCategory = productCategory;
  }

  public ProductListingLevelInfoResultInner productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Get productDescription
   * @return productDescription
  */
  
  @Schema(name = "product_description", example = "Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_description")
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public ProductListingLevelInfoResultInner productId(String productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
  */
  
  @Schema(name = "product_id", example = "120475", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_id")
  public String getProductId() {
    return productId;
  }

  public void setProductId(String productId) {
    this.productId = productId;
  }

  public ProductListingLevelInfoResultInner productManufacturer(String productManufacturer) {
    this.productManufacturer = productManufacturer;
    return this;
  }

  /**
   * Get productManufacturer
   * @return productManufacturer
  */
  
  @Schema(name = "product_manufacturer", example = "Intel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_manufacturer")
  public String getProductManufacturer() {
    return productManufacturer;
  }

  public void setProductManufacturer(String productManufacturer) {
    this.productManufacturer = productManufacturer;
  }

  public ProductListingLevelInfoResultInner productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  
  @Schema(name = "product_name", example = "Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public ProductListingLevelInfoResultInner productNameRaw(String productNameRaw) {
    this.productNameRaw = productNameRaw;
    return this;
  }

  /**
   * Get productNameRaw
   * @return productNameRaw
  */
  
  @Schema(name = "product_name_raw", example = "Intel® Xeon® Gold 5122 Processor (16.5M Cache, 3.60 GHz)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_name_raw")
  public String getProductNameRaw() {
    return productNameRaw;
  }

  public void setProductNameRaw(String productNameRaw) {
    this.productNameRaw = productNameRaw;
  }

  public ProductListingLevelInfoResultInner productOnMarketDate(String productOnMarketDate) {
    this.productOnMarketDate = productOnMarketDate;
    return this;
  }

  /**
   * Get productOnMarketDate
   * @return productOnMarketDate
  */
  
  @Schema(name = "product_on_market_date", example = "2017-07-11T00:00:00:000-0400", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_on_market_date")
  public String getProductOnMarketDate() {
    return productOnMarketDate;
  }

  public void setProductOnMarketDate(String productOnMarketDate) {
    this.productOnMarketDate = productOnMarketDate;
  }

  public ProductListingLevelInfoResultInner updatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
  */
  
  @Schema(name = "updated_date", example = "2018-10-11T07:20:11:500-0400", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_date")
  public String getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductListingLevelInfoResultInner productListingLevelInfoResultInner = (ProductListingLevelInfoResultInner) o;
    return Objects.equals(this.createdDate, productListingLevelInfoResultInner.createdDate) &&
        Objects.equals(this.highlightsInfo, productListingLevelInfoResultInner.highlightsInfo) &&
        Objects.equals(this.mktgPrdType, productListingLevelInfoResultInner.mktgPrdType) &&
        Objects.equals(this.productCategory, productListingLevelInfoResultInner.productCategory) &&
        Objects.equals(this.productDescription, productListingLevelInfoResultInner.productDescription) &&
        Objects.equals(this.productId, productListingLevelInfoResultInner.productId) &&
        Objects.equals(this.productManufacturer, productListingLevelInfoResultInner.productManufacturer) &&
        Objects.equals(this.productName, productListingLevelInfoResultInner.productName) &&
        Objects.equals(this.productNameRaw, productListingLevelInfoResultInner.productNameRaw) &&
        Objects.equals(this.productOnMarketDate, productListingLevelInfoResultInner.productOnMarketDate) &&
        Objects.equals(this.updatedDate, productListingLevelInfoResultInner.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, highlightsInfo, mktgPrdType, productCategory, productDescription, productId, productManufacturer, productName, productNameRaw, productOnMarketDate, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductListingLevelInfoResultInner {\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    highlightsInfo: ").append(toIndentedString(highlightsInfo)).append("\n");
    sb.append("    mktgPrdType: ").append(toIndentedString(mktgPrdType)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productManufacturer: ").append(toIndentedString(productManufacturer)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productNameRaw: ").append(toIndentedString(productNameRaw)).append("\n");
    sb.append("    productOnMarketDate: ").append(toIndentedString(productOnMarketDate)).append("\n");
    sb.append("    updatedDate: ").append(toIndentedString(updatedDate)).append("\n");
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

