package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TimeDuration;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This type defines the fields for a seller&#39;s international return policy. Sellers have the ability to set separate domestic and international return policies, but if an international return policy is not set, the same return policy settings specified for the domestic return policy are also used for returns for international buyers. 
 */

@Schema(name = "InternationalReturnOverrideType", description = "This type defines the fields for a seller's international return policy. Sellers have the ability to set separate domestic and international return policies, but if an international return policy is not set, the same return policy settings specified for the domestic return policy are also used for returns for international buyers. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class InternationalReturnOverrideType {

  private String returnMethod;

  private TimeDuration returnPeriod;

  private String returnShippingCostPayer;

  private Boolean returnsAccepted;

  public InternationalReturnOverrideType returnMethod(String returnMethod) {
    this.returnMethod = returnMethod;
    return this;
  }

  /**
   * This field sets/indicates if the seller offers replacement items to the buyer in the case of an international return. The buyer must be willing to accept a replacement item; otherwise, the seller will need to issue a refund for a return. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>
   * @return returnMethod
  */
  
  @Schema(name = "returnMethod", description = "This field sets/indicates if the seller offers replacement items to the buyer in the case of an international return. The buyer must be willing to accept a replacement item; otherwise, the seller will need to issue a refund for a return. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnMethodEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnMethod")
  public String getReturnMethod() {
    return returnMethod;
  }

  public void setReturnMethod(String returnMethod) {
    this.returnMethod = returnMethod;
  }

  public InternationalReturnOverrideType returnPeriod(TimeDuration returnPeriod) {
    this.returnPeriod = returnPeriod;
    return this;
  }

  /**
   * Get returnPeriod
   * @return returnPeriod
  */
  @Valid 
  @Schema(name = "returnPeriod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnPeriod")
  public TimeDuration getReturnPeriod() {
    return returnPeriod;
  }

  public void setReturnPeriod(TimeDuration returnPeriod) {
    this.returnPeriod = returnPeriod;
  }

  public InternationalReturnOverrideType returnShippingCostPayer(String returnShippingCostPayer) {
    this.returnShippingCostPayer = returnShippingCostPayer;
    return this;
  }

  /**
   * This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for 'significantly not as described' (SNAD) issues.  <br/><br/>This field is conditionally required if the <b>internationalOverride.returnsAccepted</b> field is set to <code>true</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>
   * @return returnShippingCostPayer
  */
  
  @Schema(name = "returnShippingCostPayer", description = "This field indicates who is responsible for paying for the shipping charges for returned items. The field can be set to either <code>BUYER</code> or <code>SELLER</code>.  <br/><br/>Depending on the return policy and specifics of the return, either the buyer or the seller can be responsible for the return shipping costs. Note that the seller is always responsible for return shipping costs for 'significantly not as described' (SNAD) issues.  <br/><br/>This field is conditionally required if the <b>internationalOverride.returnsAccepted</b> field is set to <code>true</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:ReturnShippingCostPayerEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnShippingCostPayer")
  public String getReturnShippingCostPayer() {
    return returnShippingCostPayer;
  }

  public void setReturnShippingCostPayer(String returnShippingCostPayer) {
    this.returnShippingCostPayer = returnShippingCostPayer;
  }

  public InternationalReturnOverrideType returnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
    return this;
  }

  /**
   * If set to <code>true</code>, the seller accepts international returns. If set to <code>false</code>, the seller does not accept international returns.  <br/><br/>This field is conditionally required if the seller chooses to have a separate international return policy.
   * @return returnsAccepted
  */
  
  @Schema(name = "returnsAccepted", description = "If set to <code>true</code>, the seller accepts international returns. If set to <code>false</code>, the seller does not accept international returns.  <br/><br/>This field is conditionally required if the seller chooses to have a separate international return policy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnsAccepted")
  public Boolean getReturnsAccepted() {
    return returnsAccepted;
  }

  public void setReturnsAccepted(Boolean returnsAccepted) {
    this.returnsAccepted = returnsAccepted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InternationalReturnOverrideType internationalReturnOverrideType = (InternationalReturnOverrideType) o;
    return Objects.equals(this.returnMethod, internationalReturnOverrideType.returnMethod) &&
        Objects.equals(this.returnPeriod, internationalReturnOverrideType.returnPeriod) &&
        Objects.equals(this.returnShippingCostPayer, internationalReturnOverrideType.returnShippingCostPayer) &&
        Objects.equals(this.returnsAccepted, internationalReturnOverrideType.returnsAccepted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnMethod, returnPeriod, returnShippingCostPayer, returnsAccepted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternationalReturnOverrideType {\n");
    sb.append("    returnMethod: ").append(toIndentedString(returnMethod)).append("\n");
    sb.append("    returnPeriod: ").append(toIndentedString(returnPeriod)).append("\n");
    sb.append("    returnShippingCostPayer: ").append(toIndentedString(returnShippingCostPayer)).append("\n");
    sb.append("    returnsAccepted: ").append(toIndentedString(returnsAccepted)).append("\n");
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

