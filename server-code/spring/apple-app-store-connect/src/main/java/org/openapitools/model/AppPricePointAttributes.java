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
 * AppPricePointAttributes
 */

@JsonTypeName("AppPricePoint_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPricePointAttributes {

  private String customerPrice;

  private String proceeds;

  public AppPricePointAttributes customerPrice(String customerPrice) {
    this.customerPrice = customerPrice;
    return this;
  }

  /**
   * Get customerPrice
   * @return customerPrice
  */
  
  @Schema(name = "customerPrice", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerPrice")
  public String getCustomerPrice() {
    return customerPrice;
  }

  public void setCustomerPrice(String customerPrice) {
    this.customerPrice = customerPrice;
  }

  public AppPricePointAttributes proceeds(String proceeds) {
    this.proceeds = proceeds;
    return this;
  }

  /**
   * Get proceeds
   * @return proceeds
  */
  
  @Schema(name = "proceeds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proceeds")
  public String getProceeds() {
    return proceeds;
  }

  public void setProceeds(String proceeds) {
    this.proceeds = proceeds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPricePointAttributes appPricePointAttributes = (AppPricePointAttributes) o;
    return Objects.equals(this.customerPrice, appPricePointAttributes.customerPrice) &&
        Objects.equals(this.proceeds, appPricePointAttributes.proceeds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerPrice, proceeds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPricePointAttributes {\n");
    sb.append("    customerPrice: ").append(toIndentedString(customerPrice)).append("\n");
    sb.append("    proceeds: ").append(toIndentedString(proceeds)).append("\n");
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

