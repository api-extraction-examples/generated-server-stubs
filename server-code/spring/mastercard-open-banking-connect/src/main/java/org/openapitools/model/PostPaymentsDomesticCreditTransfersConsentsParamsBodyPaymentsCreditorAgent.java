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
 * PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent {

  /**
   * System identification:   * 'UK.SortCode' - UK FPS 
   */
  public enum ClearingSystemIdentificationEnum {
    UK_SORTCODE("UK.SortCode");

    private String value;

    ClearingSystemIdentificationEnum(String value) {
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
    public static ClearingSystemIdentificationEnum fromValue(String value) {
      for (ClearingSystemIdentificationEnum b : ClearingSystemIdentificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ClearingSystemIdentificationEnum clearingSystemIdentification;

  private String memberIdentification;

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent(ClearingSystemIdentificationEnum clearingSystemIdentification, String memberIdentification) {
    this.clearingSystemIdentification = clearingSystemIdentification;
    this.memberIdentification = memberIdentification;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent clearingSystemIdentification(ClearingSystemIdentificationEnum clearingSystemIdentification) {
    this.clearingSystemIdentification = clearingSystemIdentification;
    return this;
  }

  /**
   * System identification:   * 'UK.SortCode' - UK FPS 
   * @return clearingSystemIdentification
  */
  @NotNull 
  @Schema(name = "clearingSystemIdentification", example = "UK.SortCode", description = "System identification:   * 'UK.SortCode' - UK FPS ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("clearingSystemIdentification")
  public ClearingSystemIdentificationEnum getClearingSystemIdentification() {
    return clearingSystemIdentification;
  }

  public void setClearingSystemIdentification(ClearingSystemIdentificationEnum clearingSystemIdentification) {
    this.clearingSystemIdentification = clearingSystemIdentification;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent memberIdentification(String memberIdentification) {
    this.memberIdentification = memberIdentification;
    return this;
  }

  /**
   * Sort code
   * @return memberIdentification
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "memberIdentification", example = "283746", description = "Sort code", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("memberIdentification")
  public String getMemberIdentification() {
    return memberIdentification;
  }

  public void setMemberIdentification(String memberIdentification) {
    this.memberIdentification = memberIdentification;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent = (PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent) o;
    return Objects.equals(this.clearingSystemIdentification, postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.clearingSystemIdentification) &&
        Objects.equals(this.memberIdentification, postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.memberIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearingSystemIdentification, memberIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAgent {\n");
    sb.append("    clearingSystemIdentification: ").append(toIndentedString(clearingSystemIdentification)).append("\n");
    sb.append("    memberIdentification: ").append(toIndentedString(memberIdentification)).append("\n");
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

