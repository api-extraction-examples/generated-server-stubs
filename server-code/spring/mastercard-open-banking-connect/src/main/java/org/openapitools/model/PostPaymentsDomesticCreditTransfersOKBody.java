package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PaymentConsent;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo;
import org.openapitools.model.PostPaymentsDomesticCreditTransfersOKBodyTransfer;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsDomesticCreditTransfersOKBody
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersOKBody {

  private PaymentConsent consent;

  private PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo;

  private PostPaymentsDomesticCreditTransfersOKBodyTransfer transfer;

  public PostPaymentsDomesticCreditTransfersOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersOKBody(PaymentConsent consent, PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo, PostPaymentsDomesticCreditTransfersOKBodyTransfer transfer) {
    this.consent = consent;
    this.originalRequestInfo = originalRequestInfo;
    this.transfer = transfer;
  }

  public PostPaymentsDomesticCreditTransfersOKBody consent(PaymentConsent consent) {
    this.consent = consent;
    return this;
  }

  /**
   * Get consent
   * @return consent
  */
  @NotNull @Valid 
  @Schema(name = "consent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consent")
  public PaymentConsent getConsent() {
    return consent;
  }

  public void setConsent(PaymentConsent consent) {
    this.consent = consent;
  }

  public PostPaymentsDomesticCreditTransfersOKBody originalRequestInfo(PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
    return this;
  }

  /**
   * Get originalRequestInfo
   * @return originalRequestInfo
  */
  @NotNull @Valid 
  @Schema(name = "originalRequestInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("originalRequestInfo")
  public PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostPaymentsDomesticCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsDomesticCreditTransfersOKBody transfer(PostPaymentsDomesticCreditTransfersOKBodyTransfer transfer) {
    this.transfer = transfer;
    return this;
  }

  /**
   * Get transfer
   * @return transfer
  */
  @NotNull @Valid 
  @Schema(name = "transfer", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transfer")
  public PostPaymentsDomesticCreditTransfersOKBodyTransfer getTransfer() {
    return transfer;
  }

  public void setTransfer(PostPaymentsDomesticCreditTransfersOKBodyTransfer transfer) {
    this.transfer = transfer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsDomesticCreditTransfersOKBody postPaymentsDomesticCreditTransfersOKBody = (PostPaymentsDomesticCreditTransfersOKBody) o;
    return Objects.equals(this.consent, postPaymentsDomesticCreditTransfersOKBody.consent) &&
        Objects.equals(this.originalRequestInfo, postPaymentsDomesticCreditTransfersOKBody.originalRequestInfo) &&
        Objects.equals(this.transfer, postPaymentsDomesticCreditTransfersOKBody.transfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consent, originalRequestInfo, transfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersOKBody {\n");
    sb.append("    consent: ").append(toIndentedString(consent)).append("\n");
    sb.append("    originalRequestInfo: ").append(toIndentedString(originalRequestInfo)).append("\n");
    sb.append("    transfer: ").append(toIndentedString(transfer)).append("\n");
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

