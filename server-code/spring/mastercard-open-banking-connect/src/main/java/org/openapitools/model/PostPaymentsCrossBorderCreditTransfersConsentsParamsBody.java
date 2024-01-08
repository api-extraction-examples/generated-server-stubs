package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsCrossBorderCreditTransfersConsentsParamsBody
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsParamsBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsParamsBody {

  private PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments payments;

  private PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo requestInfo;

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBody(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments payments, PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo requestInfo) {
    this.payments = payments;
    this.requestInfo = requestInfo;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBody payments(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments payments) {
    this.payments = payments;
    return this;
  }

  /**
   * Get payments
   * @return payments
  */
  @NotNull @Valid 
  @Schema(name = "payments", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("payments")
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments getPayments() {
    return payments;
  }

  public void setPayments(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments payments) {
    this.payments = payments;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBody requestInfo(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo requestInfo) {
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
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyRequestInfo requestInfo) {
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
    PostPaymentsCrossBorderCreditTransfersConsentsParamsBody postPaymentsCrossBorderCreditTransfersConsentsParamsBody = (PostPaymentsCrossBorderCreditTransfersConsentsParamsBody) o;
    return Objects.equals(this.payments, postPaymentsCrossBorderCreditTransfersConsentsParamsBody.payments) &&
        Objects.equals(this.requestInfo, postPaymentsCrossBorderCreditTransfersConsentsParamsBody.requestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments, requestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBody {\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

