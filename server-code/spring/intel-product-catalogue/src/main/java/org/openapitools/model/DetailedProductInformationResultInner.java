package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DetailedProductInformationResultInnerAllOfMediaAsset;
import org.openapitools.model.DetailedProductInformationResultInnerAllOfReferenceInner;
import org.openapitools.model.DetailedProductInformationResultInnerAllOfTechSpecInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DetailedProductInformationResultInner
 */

@JsonTypeName("Detailed_product_information_result_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class DetailedProductInformationResultInner {

  private String createdDate;

  private DetailedProductInformationResultInnerAllOfMediaAsset mediaAsset;

  private String mktgPrdType;

  @Valid
  private List<String> productCategory;

  private String productDescription;

  private String productId;

  private String productManufacturer;

  private String productName;

  private String productNameRaw;

  private String productOnMarketDate;

  private String productPicture;

  @Valid
  private List<@Valid DetailedProductInformationResultInnerAllOfReferenceInner> reference;

  @Valid
  private List<@Valid DetailedProductInformationResultInnerAllOfTechSpecInner> techSpec;

  private String updatedDate;

  public DetailedProductInformationResultInner createdDate(String createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  /**
   * Get createdDate
   * @return createdDate
  */
  
  @Schema(name = "created_date", example = "2017-12-18T03:40:13:990-0500", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_date")
  public String getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(String createdDate) {
    this.createdDate = createdDate;
  }

  public DetailedProductInformationResultInner mediaAsset(DetailedProductInformationResultInnerAllOfMediaAsset mediaAsset) {
    this.mediaAsset = mediaAsset;
    return this;
  }

  /**
   * Get mediaAsset
   * @return mediaAsset
  */
  @Valid 
  @Schema(name = "media_asset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_asset")
  public DetailedProductInformationResultInnerAllOfMediaAsset getMediaAsset() {
    return mediaAsset;
  }

  public void setMediaAsset(DetailedProductInformationResultInnerAllOfMediaAsset mediaAsset) {
    this.mediaAsset = mediaAsset;
  }

  public DetailedProductInformationResultInner mktgPrdType(String mktgPrdType) {
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

  public DetailedProductInformationResultInner productCategory(List<String> productCategory) {
    this.productCategory = productCategory;
    return this;
  }

  public DetailedProductInformationResultInner addProductCategoryItem(String productCategoryItem) {
    if (this.productCategory == null) {
      this.productCategory = new ArrayList<>();
    }
    this.productCategory.add(productCategoryItem);
    return this;
  }

  /**
   * Product category
   * @return productCategory
  */
  
  @Schema(name = "product_category", description = "Product category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_category")
  public List<String> getProductCategory() {
    return productCategory;
  }

  public void setProductCategory(List<String> productCategory) {
    this.productCategory = productCategory;
  }

  public DetailedProductInformationResultInner productDescription(String productDescription) {
    this.productDescription = productDescription;
    return this;
  }

  /**
   * Get productDescription
   * @return productDescription
  */
  
  @Schema(name = "product_description", example = "Intel Atom® Processor C2316 (1M Cache, 1.50 GHz)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_description")
  public String getProductDescription() {
    return productDescription;
  }

  public void setProductDescription(String productDescription) {
    this.productDescription = productDescription;
  }

  public DetailedProductInformationResultInner productId(String productId) {
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

  public DetailedProductInformationResultInner productManufacturer(String productManufacturer) {
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

  public DetailedProductInformationResultInner productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  
  @Schema(name = "product_name", example = "Intel Atom® Processor C2316 (1M Cache, 1.50 GHz)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public DetailedProductInformationResultInner productNameRaw(String productNameRaw) {
    this.productNameRaw = productNameRaw;
    return this;
  }

  /**
   * Get productNameRaw
   * @return productNameRaw
  */
  
  @Schema(name = "product_name_raw", example = "Intel Atom® Processor C2316 (1M Cache, 1.50 GHz)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_name_raw")
  public String getProductNameRaw() {
    return productNameRaw;
  }

  public void setProductNameRaw(String productNameRaw) {
    this.productNameRaw = productNameRaw;
  }

  public DetailedProductInformationResultInner productOnMarketDate(String productOnMarketDate) {
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

  public DetailedProductInformationResultInner productPicture(String productPicture) {
    this.productPicture = productPicture;
    return this;
  }

  /**
   * Get productPicture
   * @return productPicture
  */
  
  @Schema(name = "product_picture", example = "https://www.intel.com/content/dam/www/global/ark/badges/36866_128.gif/jcr:content/renditions/_64.gif", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("product_picture")
  public String getProductPicture() {
    return productPicture;
  }

  public void setProductPicture(String productPicture) {
    this.productPicture = productPicture;
  }

  public DetailedProductInformationResultInner reference(List<@Valid DetailedProductInformationResultInnerAllOfReferenceInner> reference) {
    this.reference = reference;
    return this;
  }

  public DetailedProductInformationResultInner addReferenceItem(DetailedProductInformationResultInnerAllOfReferenceInner referenceItem) {
    if (this.reference == null) {
      this.reference = new ArrayList<>();
    }
    this.reference.add(referenceItem);
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @Valid 
  @Schema(name = "reference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reference")
  public List<@Valid DetailedProductInformationResultInnerAllOfReferenceInner> getReference() {
    return reference;
  }

  public void setReference(List<@Valid DetailedProductInformationResultInnerAllOfReferenceInner> reference) {
    this.reference = reference;
  }

  public DetailedProductInformationResultInner techSpec(List<@Valid DetailedProductInformationResultInnerAllOfTechSpecInner> techSpec) {
    this.techSpec = techSpec;
    return this;
  }

  public DetailedProductInformationResultInner addTechSpecItem(DetailedProductInformationResultInnerAllOfTechSpecInner techSpecItem) {
    if (this.techSpec == null) {
      this.techSpec = new ArrayList<>();
    }
    this.techSpec.add(techSpecItem);
    return this;
  }

  /**
   * tech spec
   * @return techSpec
  */
  @Valid 
  @Schema(name = "tech_spec", description = "tech spec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tech_spec")
  public List<@Valid DetailedProductInformationResultInnerAllOfTechSpecInner> getTechSpec() {
    return techSpec;
  }

  public void setTechSpec(List<@Valid DetailedProductInformationResultInnerAllOfTechSpecInner> techSpec) {
    this.techSpec = techSpec;
  }

  public DetailedProductInformationResultInner updatedDate(String updatedDate) {
    this.updatedDate = updatedDate;
    return this;
  }

  /**
   * Get updatedDate
   * @return updatedDate
  */
  
  @Schema(name = "updated_date", example = "2018-10-15T03:42:52:320-0400", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DetailedProductInformationResultInner detailedProductInformationResultInner = (DetailedProductInformationResultInner) o;
    return Objects.equals(this.createdDate, detailedProductInformationResultInner.createdDate) &&
        Objects.equals(this.mediaAsset, detailedProductInformationResultInner.mediaAsset) &&
        Objects.equals(this.mktgPrdType, detailedProductInformationResultInner.mktgPrdType) &&
        Objects.equals(this.productCategory, detailedProductInformationResultInner.productCategory) &&
        Objects.equals(this.productDescription, detailedProductInformationResultInner.productDescription) &&
        Objects.equals(this.productId, detailedProductInformationResultInner.productId) &&
        Objects.equals(this.productManufacturer, detailedProductInformationResultInner.productManufacturer) &&
        Objects.equals(this.productName, detailedProductInformationResultInner.productName) &&
        Objects.equals(this.productNameRaw, detailedProductInformationResultInner.productNameRaw) &&
        Objects.equals(this.productOnMarketDate, detailedProductInformationResultInner.productOnMarketDate) &&
        Objects.equals(this.productPicture, detailedProductInformationResultInner.productPicture) &&
        Objects.equals(this.reference, detailedProductInformationResultInner.reference) &&
        Objects.equals(this.techSpec, detailedProductInformationResultInner.techSpec) &&
        Objects.equals(this.updatedDate, detailedProductInformationResultInner.updatedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDate, mediaAsset, mktgPrdType, productCategory, productDescription, productId, productManufacturer, productName, productNameRaw, productOnMarketDate, productPicture, reference, techSpec, updatedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedProductInformationResultInner {\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    mediaAsset: ").append(toIndentedString(mediaAsset)).append("\n");
    sb.append("    mktgPrdType: ").append(toIndentedString(mktgPrdType)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productDescription: ").append(toIndentedString(productDescription)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    productManufacturer: ").append(toIndentedString(productManufacturer)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productNameRaw: ").append(toIndentedString(productNameRaw)).append("\n");
    sb.append("    productOnMarketDate: ").append(toIndentedString(productOnMarketDate)).append("\n");
    sb.append("    productPicture: ").append(toIndentedString(productPicture)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    techSpec: ").append(toIndentedString(techSpec)).append("\n");
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

