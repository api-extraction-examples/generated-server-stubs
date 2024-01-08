package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments
 */

@JsonTypeName("postPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments {

  private String statusReasonCode;

  /**
   * Payment transaction status
   */
  public enum TransactionStatusEnum {
    ACCP("ACCP"),
    
    ACSC("ACSC"),
    
    ACSP("ACSP"),
    
    ACTC("ACTC"),
    
    ACWC("ACWC"),
    
    ACWP("ACWP"),
    
    PDNG("PDNG"),
    
    RCVD("RCVD"),
    
    RJCT("RJCT"),
    
    CANC("CANC");

    private String value;

    TransactionStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactionStatusEnum fromValue(String value) {
      for (TransactionStatusEnum b : TransactionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TransactionStatusEnum transactionStatus;

  public PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments statusReasonCode(String statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
    return this;
  }

  /**
   * Rejection reson code
   * @return statusReasonCode
  */
  
  @Schema(name = "statusReasonCode", example = "AM04", description = "Rejection reson code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusReasonCode")
  public String getStatusReasonCode() {
    return statusReasonCode;
  }

  public void setStatusReasonCode(String statusReasonCode) {
    this.statusReasonCode = statusReasonCode;
  }

  public PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments transactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

  /**
   * Payment transaction status
   * @return transactionStatus
  */
  @NotNull 
  @Schema(name = "transactionStatus", description = "Payment transaction status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("transactionStatus")
  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments postPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments = (PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments) o;
    return Objects.equals(this.statusReasonCode, postPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments.statusReasonCode) &&
        Objects.equals(this.transactionStatus, postPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments.transactionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusReasonCode, transactionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersPaymentStatusOKBodyPayments {\n");
    sb.append("    statusReasonCode: ").append(toIndentedString(statusReasonCode)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

