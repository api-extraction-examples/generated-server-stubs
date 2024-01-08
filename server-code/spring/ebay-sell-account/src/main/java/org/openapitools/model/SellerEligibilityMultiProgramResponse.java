package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SellerEligibilityResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The base response of the &lt;b&gt;getAdvertisingEligibility&lt;/b&gt; method that contains the seller eligibility information for one or more advertising programs.
 */

@Schema(name = "SellerEligibilityMultiProgramResponse", description = "The base response of the <b>getAdvertisingEligibility</b> method that contains the seller eligibility information for one or more advertising programs.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SellerEligibilityMultiProgramResponse {

  @Valid
  private List<@Valid SellerEligibilityResponse> advertisingEligibility;

  public SellerEligibilityMultiProgramResponse advertisingEligibility(List<@Valid SellerEligibilityResponse> advertisingEligibility) {
    this.advertisingEligibility = advertisingEligibility;
    return this;
  }

  public SellerEligibilityMultiProgramResponse addAdvertisingEligibilityItem(SellerEligibilityResponse advertisingEligibilityItem) {
    if (this.advertisingEligibility == null) {
      this.advertisingEligibility = new ArrayList<>();
    }
    this.advertisingEligibility.add(advertisingEligibilityItem);
    return this;
  }

  /**
   * An array of response fields that define the seller eligibility for eBay adverstising programs.
   * @return advertisingEligibility
  */
  @Valid 
  @Schema(name = "advertisingEligibility", description = "An array of response fields that define the seller eligibility for eBay adverstising programs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("advertisingEligibility")
  public List<@Valid SellerEligibilityResponse> getAdvertisingEligibility() {
    return advertisingEligibility;
  }

  public void setAdvertisingEligibility(List<@Valid SellerEligibilityResponse> advertisingEligibility) {
    this.advertisingEligibility = advertisingEligibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerEligibilityMultiProgramResponse sellerEligibilityMultiProgramResponse = (SellerEligibilityMultiProgramResponse) o;
    return Objects.equals(this.advertisingEligibility, sellerEligibilityMultiProgramResponse.advertisingEligibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertisingEligibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerEligibilityMultiProgramResponse {\n");
    sb.append("    advertisingEligibility: ").append(toIndentedString(advertisingEligibility)).append("\n");
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

