package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Merchant;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo
 */

@JsonTypeName("postPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo {

  private String aspspId;

  private String consentId;

  private Merchant merchant;

  private String xRequestId;

  public PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo(String aspspId, String consentId, String xRequestId) {
    this.aspspId = aspspId;
    this.consentId = consentId;
    this.xRequestId = xRequestId;
  }

  public PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo aspspId(String aspspId) {
    this.aspspId = aspspId;
    return this;
  }

  /**
   * Identification of ASPSP
   * @return aspspId
  */
  @NotNull @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") 
  @Schema(name = "aspspId", example = "b806ae68-a45b-49d6-b25a-69fdb81dede6", description = "Identification of ASPSP", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aspspId")
  public String getAspspId() {
    return aspspId;
  }

  public void setAspspId(String aspspId) {
    this.aspspId = aspspId;
  }

  public PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Consent identification
   * @return consentId
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "consentId", example = "SEPABJbqtZ8sPNznYtfV:5", description = "Consent identification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo merchant(Merchant merchant) {
    this.merchant = merchant;
    return this;
  }

  /**
   * Get merchant
   * @return merchant
  */
  @Valid 
  @Schema(name = "merchant", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("merchant")
  public Merchant getMerchant() {
    return merchant;
  }

  public void setMerchant(Merchant merchant) {
    this.merchant = merchant;
  }

  public PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo xRequestId(String xRequestId) {
    this.xRequestId = xRequestId;
    return this;
  }

  /**
   * Request id given by the client
   * @return xRequestId
  */
  @NotNull @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") 
  @Schema(name = "xRequestId", example = "123e4567-e89b-12d3-a456-426655440000", description = "Request id given by the client", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("xRequestId")
  public String getxRequestId() {
    return xRequestId;
  }

  public void setxRequestId(String xRequestId) {
    this.xRequestId = xRequestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo postPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo = (PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo) o;
    return Objects.equals(this.aspspId, postPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo.aspspId) &&
        Objects.equals(this.consentId, postPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo.consentId) &&
        Objects.equals(this.merchant, postPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo.merchant) &&
        Objects.equals(this.xRequestId, postPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo.xRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspspId, consentId, merchant, xRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersPaymentStatusParamsBodyRequestInfo {\n");
    sb.append("    aspspId: ").append(toIndentedString(aspspId)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

