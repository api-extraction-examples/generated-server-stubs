package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PaymentConsent;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersOKBodyOriginalRequestInfo;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersOKBodyTransfer;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsCrossBorderCreditTransfersOKBody
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersOKBody {

  private PaymentConsent consent;

  private PostPaymentsCrossBorderCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo;

  private PostPaymentsCrossBorderCreditTransfersOKBodyTransfer transfer;

  public PostPaymentsCrossBorderCreditTransfersOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersOKBody(PaymentConsent consent, PostPaymentsCrossBorderCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo) {
    this.consent = consent;
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsCrossBorderCreditTransfersOKBody consent(PaymentConsent consent) {
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

  public PostPaymentsCrossBorderCreditTransfersOKBody originalRequestInfo(PostPaymentsCrossBorderCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo) {
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
  public PostPaymentsCrossBorderCreditTransfersOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostPaymentsCrossBorderCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsCrossBorderCreditTransfersOKBody transfer(PostPaymentsCrossBorderCreditTransfersOKBodyTransfer transfer) {
    this.transfer = transfer;
    return this;
  }

  /**
   * Get transfer
   * @return transfer
  */
  @Valid 
  @Schema(name = "transfer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("transfer")
  public PostPaymentsCrossBorderCreditTransfersOKBodyTransfer getTransfer() {
    return transfer;
  }

  public void setTransfer(PostPaymentsCrossBorderCreditTransfersOKBodyTransfer transfer) {
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
    PostPaymentsCrossBorderCreditTransfersOKBody postPaymentsCrossBorderCreditTransfersOKBody = (PostPaymentsCrossBorderCreditTransfersOKBody) o;
    return Objects.equals(this.consent, postPaymentsCrossBorderCreditTransfersOKBody.consent) &&
        Objects.equals(this.originalRequestInfo, postPaymentsCrossBorderCreditTransfersOKBody.originalRequestInfo) &&
        Objects.equals(this.transfer, postPaymentsCrossBorderCreditTransfersOKBody.transfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consent, originalRequestInfo, transfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersOKBody {\n");
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

