package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.SellingLimit;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type is used by the base response of the &lt;b&gt;getPrivileges&lt;/b&gt; method.
 */

@Schema(name = "SellingPrivileges", description = "This type is used by the base response of the <b>getPrivileges</b> method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SellingPrivileges {

  private Boolean sellerRegistrationCompleted;

  private SellingLimit sellingLimit;

  public SellingPrivileges sellerRegistrationCompleted(Boolean sellerRegistrationCompleted) {
    this.sellerRegistrationCompleted = sellerRegistrationCompleted;
    return this;
  }

  /**
   * If this field is returned as <code>true</code>, the seller's registration is completed. If this field is returned as <code>false</code>, the registration process is not complete.
   * @return sellerRegistrationCompleted
  */
  
  @Schema(name = "sellerRegistrationCompleted", description = "If this field is returned as <code>true</code>, the seller's registration is completed. If this field is returned as <code>false</code>, the registration process is not complete.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sellerRegistrationCompleted")
  public Boolean getSellerRegistrationCompleted() {
    return sellerRegistrationCompleted;
  }

  public void setSellerRegistrationCompleted(Boolean sellerRegistrationCompleted) {
    this.sellerRegistrationCompleted = sellerRegistrationCompleted;
  }

  public SellingPrivileges sellingLimit(SellingLimit sellingLimit) {
    this.sellingLimit = sellingLimit;
    return this;
  }

  /**
   * Get sellingLimit
   * @return sellingLimit
  */
  @Valid 
  @Schema(name = "sellingLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sellingLimit")
  public SellingLimit getSellingLimit() {
    return sellingLimit;
  }

  public void setSellingLimit(SellingLimit sellingLimit) {
    this.sellingLimit = sellingLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellingPrivileges sellingPrivileges = (SellingPrivileges) o;
    return Objects.equals(this.sellerRegistrationCompleted, sellingPrivileges.sellerRegistrationCompleted) &&
        Objects.equals(this.sellingLimit, sellingPrivileges.sellingLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sellerRegistrationCompleted, sellingLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellingPrivileges {\n");
    sb.append("    sellerRegistrationCompleted: ").append(toIndentedString(sellerRegistrationCompleted)).append("\n");
    sb.append("    sellingLimit: ").append(toIndentedString(sellingLimit)).append("\n");
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

