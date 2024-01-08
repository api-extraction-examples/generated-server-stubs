package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo;
import org.openapitools.model.PostPaymentsSepaCreditTransfersOKBodyTransfer;
import org.openapitools.model.SepaPaymentConsent;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsSepaCreditTransfersOKBody
 */

@JsonTypeName("postPaymentsSepaCreditTransfersOKBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersOKBody {

  private SepaPaymentConsent consent;

  private PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo;

  private PostPaymentsSepaCreditTransfersOKBodyTransfer transfer;

  public PostPaymentsSepaCreditTransfersOKBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersOKBody(SepaPaymentConsent consent, PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo, PostPaymentsSepaCreditTransfersOKBodyTransfer transfer) {
    this.consent = consent;
    this.originalRequestInfo = originalRequestInfo;
    this.transfer = transfer;
  }

  public PostPaymentsSepaCreditTransfersOKBody consent(SepaPaymentConsent consent) {
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
  public SepaPaymentConsent getConsent() {
    return consent;
  }

  public void setConsent(SepaPaymentConsent consent) {
    this.consent = consent;
  }

  public PostPaymentsSepaCreditTransfersOKBody originalRequestInfo(PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo) {
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
  public PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo getOriginalRequestInfo() {
    return originalRequestInfo;
  }

  public void setOriginalRequestInfo(PostPaymentsSepaCreditTransfersOKBodyOriginalRequestInfo originalRequestInfo) {
    this.originalRequestInfo = originalRequestInfo;
  }

  public PostPaymentsSepaCreditTransfersOKBody transfer(PostPaymentsSepaCreditTransfersOKBodyTransfer transfer) {
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
  public PostPaymentsSepaCreditTransfersOKBodyTransfer getTransfer() {
    return transfer;
  }

  public void setTransfer(PostPaymentsSepaCreditTransfersOKBodyTransfer transfer) {
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
    PostPaymentsSepaCreditTransfersOKBody postPaymentsSepaCreditTransfersOKBody = (PostPaymentsSepaCreditTransfersOKBody) o;
    return Objects.equals(this.consent, postPaymentsSepaCreditTransfersOKBody.consent) &&
        Objects.equals(this.originalRequestInfo, postPaymentsSepaCreditTransfersOKBody.originalRequestInfo) &&
        Objects.equals(this.transfer, postPaymentsSepaCreditTransfersOKBody.transfer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consent, originalRequestInfo, transfer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersOKBody {\n");
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

