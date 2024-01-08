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
 * PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersParamsBodyRequestInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo {

  private String aspspId;

  private String authorization;

  private Merchant merchant;

  private String xRequestId;

  public PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo(String aspspId, String authorization, String xRequestId) {
    this.aspspId = aspspId;
    this.authorization = authorization;
    this.xRequestId = xRequestId;
  }

  public PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo aspspId(String aspspId) {
    this.aspspId = aspspId;
    return this;
  }

  /**
   * Identification of ASPSP
   * @return aspspId
  */
  @NotNull @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") 
  @Schema(name = "aspspId", example = "420e5cff-0e2a-4156-991a-f6eeef0478cf", description = "Identification of ASPSP", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("aspspId")
  public String getAspspId() {
    return aspspId;
  }

  public void setAspspId(String aspspId) {
    this.aspspId = aspspId;
  }

  public PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo authorization(String authorization) {
    this.authorization = authorization;
    return this;
  }

  /**
   * The authorization query / data received after PSU has authorized the consent
   * @return authorization
  */
  @NotNull @Size(min = 1, max = 5000) 
  @Schema(name = "authorization", example = "code=UKdpVsbG8gQ2TP9kZWJleft53serYXV0aUK001&state=38948933-38ae-45af-953e-25a69fefa39e", description = "The authorization query / data received after PSU has authorized the consent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("authorization")
  public String getAuthorization() {
    return authorization;
  }

  public void setAuthorization(String authorization) {
    this.authorization = authorization;
  }

  public PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo merchant(Merchant merchant) {
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

  public PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo xRequestId(String xRequestId) {
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
    PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo postPaymentsDomesticCreditTransfersParamsBodyRequestInfo = (PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo) o;
    return Objects.equals(this.aspspId, postPaymentsDomesticCreditTransfersParamsBodyRequestInfo.aspspId) &&
        Objects.equals(this.authorization, postPaymentsDomesticCreditTransfersParamsBodyRequestInfo.authorization) &&
        Objects.equals(this.merchant, postPaymentsDomesticCreditTransfersParamsBodyRequestInfo.merchant) &&
        Objects.equals(this.xRequestId, postPaymentsDomesticCreditTransfersParamsBodyRequestInfo.xRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspspId, authorization, merchant, xRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersParamsBodyRequestInfo {\n");
    sb.append("    aspspId: ").append(toIndentedString(aspspId)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
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

