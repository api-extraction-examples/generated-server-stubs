package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductListingLevelInfoResultInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductListingLevelInfo
 */

@JsonTypeName("Product_listing_level_info")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class ProductListingLevelInfo {

  private String pageNo;

  private Integer perPage;

  @Valid
  private List<@Valid ProductListingLevelInfoResultInner> result = new ArrayList<>();

  private String status;

  private Integer totalCount;

  public ProductListingLevelInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProductListingLevelInfo(String pageNo, Integer perPage, List<@Valid ProductListingLevelInfoResultInner> result, String status, Integer totalCount) {
    this.pageNo = pageNo;
    this.perPage = perPage;
    this.result = result;
    this.status = status;
    this.totalCount = totalCount;
  }

  public ProductListingLevelInfo pageNo(String pageNo) {
    this.pageNo = pageNo;
    return this;
  }

  /**
   * Get pageNo
   * @return pageNo
  */
  @NotNull 
  @Schema(name = "page_no", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("page_no")
  public String getPageNo() {
    return pageNo;
  }

  public void setPageNo(String pageNo) {
    this.pageNo = pageNo;
  }

  public ProductListingLevelInfo perPage(Integer perPage) {
    this.perPage = perPage;
    return this;
  }

  /**
   * Get perPage
   * @return perPage
  */
  @NotNull 
  @Schema(name = "per_page", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("per_page")
  public Integer getPerPage() {
    return perPage;
  }

  public void setPerPage(Integer perPage) {
    this.perPage = perPage;
  }

  public ProductListingLevelInfo result(List<@Valid ProductListingLevelInfoResultInner> result) {
    this.result = result;
    return this;
  }

  public ProductListingLevelInfo addResultItem(ProductListingLevelInfoResultInner resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Multiple objects with product data.
   * @return result
  */
  @NotNull @Valid 
  @Schema(name = "result", description = "Multiple objects with product data.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("result")
  public List<@Valid ProductListingLevelInfoResultInner> getResult() {
    return result;
  }

  public void setResult(List<@Valid ProductListingLevelInfoResultInner> result) {
    this.result = result;
  }

  public ProductListingLevelInfo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", example = "success", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProductListingLevelInfo totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
  */
  @NotNull 
  @Schema(name = "total_count", example = "230", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total_count")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductListingLevelInfo productListingLevelInfo = (ProductListingLevelInfo) o;
    return Objects.equals(this.pageNo, productListingLevelInfo.pageNo) &&
        Objects.equals(this.perPage, productListingLevelInfo.perPage) &&
        Objects.equals(this.result, productListingLevelInfo.result) &&
        Objects.equals(this.status, productListingLevelInfo.status) &&
        Objects.equals(this.totalCount, productListingLevelInfo.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNo, perPage, result, status, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductListingLevelInfo {\n");
    sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

