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
 * A type that is used to provide the seller&#39;s eligibility status for an eBay advertising program.
 */

@Schema(name = "SellerEligibilityResponse", description = "A type that is used to provide the seller's eligibility status for an eBay advertising program.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class SellerEligibilityResponse {

  private String programType;

  private String reason;

  private String status;

  public SellerEligibilityResponse programType(String programType) {
    this.programType = programType;
    return this;
  }

  /**
   * The eBay advertising program for which a seller may be eligible. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:AdvertisingProgramEnum'>eBay API documentation</a>
   * @return programType
  */
  
  @Schema(name = "programType", description = "The eBay advertising program for which a seller may be eligible. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:AdvertisingProgramEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("programType")
  public String getProgramType() {
    return programType;
  }

  public void setProgramType(String programType) {
    this.programType = programType;
  }

  public SellerEligibilityResponse reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason why a seller is ineligible for the specified eBay advertising program.<br /><br />This field is only returned if the seller is ineligible for the eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:SellerIneligibleReasonEnum'>eBay API documentation</a>
   * @return reason
  */
  
  @Schema(name = "reason", description = "The reason why a seller is ineligible for the specified eBay advertising program.<br /><br />This field is only returned if the seller is ineligible for the eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/plser:SellerIneligibleReasonEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public SellerEligibilityResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The seller elibibilty status for the specified eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/cmlib:SellerEligibilityEnum'>eBay API documentation</a>
   * @return status
  */
  
  @Schema(name = "status", description = "The seller elibibilty status for the specified eBay advertising program. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/cmlib:SellerEligibilityEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SellerEligibilityResponse sellerEligibilityResponse = (SellerEligibilityResponse) o;
    return Objects.equals(this.programType, sellerEligibilityResponse.programType) &&
        Objects.equals(this.reason, sellerEligibilityResponse.reason) &&
        Objects.equals(this.status, sellerEligibilityResponse.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(programType, reason, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SellerEligibilityResponse {\n");
    sb.append("    programType: ").append(toIndentedString(programType)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

