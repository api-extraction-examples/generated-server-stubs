package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody {

  private String paymentId;

  private PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequestInfo requestInfo;

  public PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody(String paymentId, PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequestInfo requestInfo) {
    this.paymentId = paymentId;
    this.requestInfo = requestInfo;
  }

  public PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

  /**
   * Payment identification
   * @return paymentId
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "paymentId", example = "258aFR415:22Aa:6asdC", description = "Payment identification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("paymentId")
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody requestInfo(PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

  /**
   * Get requestInfo
   * @return requestInfo
  */
  @NotNull @Valid 
  @Schema(name = "requestInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestInfo")
  public PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody postPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody = (PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody) o;
    return Objects.equals(this.paymentId, postPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody.paymentId) &&
        Objects.equals(this.requestInfo, postPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody.requestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, requestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersPaymentStatusParamsBody {\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
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

