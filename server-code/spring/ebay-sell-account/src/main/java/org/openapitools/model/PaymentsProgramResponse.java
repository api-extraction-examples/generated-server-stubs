package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The response object containing the sellers status with regards to the specified payment program.
 */

@Schema(name = "PaymentsProgramResponse", description = "The response object containing the sellers status with regards to the specified payment program.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class PaymentsProgramResponse {

  private String marketplaceId;

  private String paymentsProgramType;

  private String status;

  private Boolean wasPreviouslyOptedIn;

  public PaymentsProgramResponse marketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
    return this;
  }

  /**
   * The ID of the eBay marketplace to which the payment program applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>
   * @return marketplaceId
  */
  
  @Schema(name = "marketplaceId", description = "The ID of the eBay marketplace to which the payment program applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketplaceId")
  public String getMarketplaceId() {
    return marketplaceId;
  }

  public void setMarketplaceId(String marketplaceId) {
    this.marketplaceId = marketplaceId;
  }

  public PaymentsProgramResponse paymentsProgramType(String paymentsProgramType) {
    this.paymentsProgramType = paymentsProgramType;
    return this;
  }

  /**
   * This parameter specifies the payment program whose status is returned by the call.  <br><br>Currently the only supported payments program is <code>EBAY_PAYMENTS</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramType'>eBay API documentation</a>
   * @return paymentsProgramType
  */
  
  @Schema(name = "paymentsProgramType", description = "This parameter specifies the payment program whose status is returned by the call.  <br><br>Currently the only supported payments program is <code>EBAY_PAYMENTS</code>. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramType'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paymentsProgramType")
  public String getPaymentsProgramType() {
    return paymentsProgramType;
  }

  public void setPaymentsProgramType(String paymentsProgramType) {
    this.paymentsProgramType = paymentsProgramType;
  }

  public PaymentsProgramResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The enumeration value returned in this field indicates whether or not the seller's account is enabled for the payments program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramStatus'>eBay API documentation</a>
   * @return status
  */
  
  @Schema(name = "status", description = "The enumeration value returned in this field indicates whether or not the seller's account is enabled for the payments program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:PaymentsProgramStatus'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentsProgramResponse wasPreviouslyOptedIn(Boolean wasPreviouslyOptedIn) {
    this.wasPreviouslyOptedIn = wasPreviouslyOptedIn;
    return this;
  }

  /**
   * If returned as <code>true</code>, the seller was at one point opted-in to the associated payment program, but they later opted out of the program. A value of <code>false</code> indicates the seller never opted-in to the program or if they did opt-in to the program, they never opted-out of it.  <br><br>It's important to note that the setting of this field does not indicate the seller's current status regarding the payment program. It is possible for this field to return <code>true</code> while the <b>status</b> field returns <code>OPTED_IN</code>.
   * @return wasPreviouslyOptedIn
  */
  
  @Schema(name = "wasPreviouslyOptedIn", description = "If returned as <code>true</code>, the seller was at one point opted-in to the associated payment program, but they later opted out of the program. A value of <code>false</code> indicates the seller never opted-in to the program or if they did opt-in to the program, they never opted-out of it.  <br><br>It's important to note that the setting of this field does not indicate the seller's current status regarding the payment program. It is possible for this field to return <code>true</code> while the <b>status</b> field returns <code>OPTED_IN</code>.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wasPreviouslyOptedIn")
  public Boolean getWasPreviouslyOptedIn() {
    return wasPreviouslyOptedIn;
  }

  public void setWasPreviouslyOptedIn(Boolean wasPreviouslyOptedIn) {
    this.wasPreviouslyOptedIn = wasPreviouslyOptedIn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentsProgramResponse paymentsProgramResponse = (PaymentsProgramResponse) o;
    return Objects.equals(this.marketplaceId, paymentsProgramResponse.marketplaceId) &&
        Objects.equals(this.paymentsProgramType, paymentsProgramResponse.paymentsProgramType) &&
        Objects.equals(this.status, paymentsProgramResponse.status) &&
        Objects.equals(this.wasPreviouslyOptedIn, paymentsProgramResponse.wasPreviouslyOptedIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketplaceId, paymentsProgramType, status, wasPreviouslyOptedIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentsProgramResponse {\n");
    sb.append("    marketplaceId: ").append(toIndentedString(marketplaceId)).append("\n");
    sb.append("    paymentsProgramType: ").append(toIndentedString(paymentsProgramType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    wasPreviouslyOptedIn: ").append(toIndentedString(wasPreviouslyOptedIn)).append("\n");
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

