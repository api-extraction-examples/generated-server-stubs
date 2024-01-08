package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SalesTax;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used by the root response of the &lt;b&gt;getSalesTaxes&lt;/b&gt; method.
 */

@Schema(name = "SalesTaxes", description = "This type is used by the root response of the <b>getSalesTaxes</b> method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SalesTaxes {

  @Valid
  private List<@Valid SalesTax> salesTaxes;

  public SalesTaxes salesTaxes(List<@Valid SalesTax> salesTaxes) {
    this.salesTaxes = salesTaxes;
    return this;
  }

  public SalesTaxes addSalesTaxesItem(SalesTax salesTaxesItem) {
    if (this.salesTaxes == null) {
      this.salesTaxes = new ArrayList<>();
    }
    this.salesTaxes.add(salesTaxesItem);
    return this;
  }

  /**
   * An array of one or more sales tax rate entries for a specific marketplace (or all applicable marketplaces if the <b>country_code</b> query parameter is not used.<br><br>If no sales tax rate entries are set up, no response payload is returned, but only an HTTP status code of <code>204 No Content</code>.
   * @return salesTaxes
  */
  @Valid 
  @Schema(name = "salesTaxes", description = "An array of one or more sales tax rate entries for a specific marketplace (or all applicable marketplaces if the <b>country_code</b> query parameter is not used.<br><br>If no sales tax rate entries are set up, no response payload is returned, but only an HTTP status code of <code>204 No Content</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("salesTaxes")
  public List<@Valid SalesTax> getSalesTaxes() {
    return salesTaxes;
  }

  public void setSalesTaxes(List<@Valid SalesTax> salesTaxes) {
    this.salesTaxes = salesTaxes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SalesTaxes salesTaxes = (SalesTaxes) o;
    return Objects.equals(this.salesTaxes, salesTaxes.salesTaxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(salesTaxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesTaxes {\n");
    sb.append("    salesTaxes: ").append(toIndentedString(salesTaxes)).append("\n");
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

