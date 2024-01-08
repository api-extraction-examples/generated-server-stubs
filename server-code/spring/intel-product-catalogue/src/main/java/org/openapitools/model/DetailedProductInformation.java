package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DetailedProductInformationResultInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DetailedProductInformation
 */

@JsonTypeName("Detailed_product_information")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:15.060829-04:00[America/Lower_Princes]")
public class DetailedProductInformation {

  @Valid
  private List<@Valid DetailedProductInformationResultInner> result;

  private String status;

  private Integer totalCount;

  public DetailedProductInformation result(List<@Valid DetailedProductInformationResultInner> result) {
    this.result = result;
    return this;
  }

  public DetailedProductInformation addResultItem(DetailedProductInformationResultInner resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<>();
    }
    this.result.add(resultItem);
    return this;
  }

  /**
   * Product info for a locale.
   * @return result
  */
  @Valid 
  @Schema(name = "result", description = "Product info for a locale.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result")
  public List<@Valid DetailedProductInformationResultInner> getResult() {
    return result;
  }

  public void setResult(List<@Valid DetailedProductInformationResultInner> result) {
    this.result = result;
  }

  public DetailedProductInformation status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", example = "success", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DetailedProductInformation totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * Get totalCount
   * @return totalCount
  */
  
  @Schema(name = "total_count", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DetailedProductInformation detailedProductInformation = (DetailedProductInformation) o;
    return Objects.equals(this.result, detailedProductInformation.result) &&
        Objects.equals(this.status, detailedProductInformation.status) &&
        Objects.equals(this.totalCount, detailedProductInformation.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, status, totalCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedProductInformation {\n");
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

