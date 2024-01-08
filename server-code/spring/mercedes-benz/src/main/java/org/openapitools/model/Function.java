package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ActivityOfAFunction;
import org.openapitools.model.Brand;
import org.openapitools.model.ProductGroupOfAFunction;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Function
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class Function {

  private ActivityOfAFunction activity;

  private Brand brand;

  private ProductGroupOfAFunction productGroup;

  public Function() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Function(ActivityOfAFunction activity, Brand brand, ProductGroupOfAFunction productGroup) {
    this.activity = activity;
    this.brand = brand;
    this.productGroup = productGroup;
  }

  public Function activity(ActivityOfAFunction activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @NotNull @Valid 
  @Schema(name = "activity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("activity")
  public ActivityOfAFunction getActivity() {
    return activity;
  }

  public void setActivity(ActivityOfAFunction activity) {
    this.activity = activity;
  }

  public Function brand(Brand brand) {
    this.brand = brand;
    return this;
  }

  /**
   * Get brand
   * @return brand
  */
  @NotNull @Valid 
  @Schema(name = "brand", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("brand")
  public Brand getBrand() {
    return brand;
  }

  public void setBrand(Brand brand) {
    this.brand = brand;
  }

  public Function productGroup(ProductGroupOfAFunction productGroup) {
    this.productGroup = productGroup;
    return this;
  }

  /**
   * Get productGroup
   * @return productGroup
  */
  @NotNull @Valid 
  @Schema(name = "productGroup", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("productGroup")
  public ProductGroupOfAFunction getProductGroup() {
    return productGroup;
  }

  public void setProductGroup(ProductGroupOfAFunction productGroup) {
    this.productGroup = productGroup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Function function = (Function) o;
    return Objects.equals(this.activity, function.activity) &&
        Objects.equals(this.brand, function.brand) &&
        Objects.equals(this.productGroup, function.productGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activity, brand, productGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Function {\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    productGroup: ").append(toIndentedString(productGroup)).append("\n");
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

