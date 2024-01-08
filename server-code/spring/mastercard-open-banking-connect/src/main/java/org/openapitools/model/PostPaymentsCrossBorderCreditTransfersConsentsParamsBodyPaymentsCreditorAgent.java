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
 * PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent {

  private String identification;

  /**
   * Scheme for the agent/bank identification
   */
  public enum SchemeNameEnum {
    BIC("BIC");

    private String value;

    SchemeNameEnum(String value) {
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
    public static SchemeNameEnum fromValue(String value) {
      for (SchemeNameEnum b : SchemeNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SchemeNameEnum schemeName;

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent(String identification, SchemeNameEnum schemeName) {
    this.identification = identification;
    this.schemeName = schemeName;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Agent identification
   * @return identification
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "identification", example = "BARCGB22XXX", description = "Agent identification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent schemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Scheme for the agent/bank identification
   * @return schemeName
  */
  @NotNull 
  @Schema(name = "schemeName", example = "BIC", description = "Scheme for the agent/bank identification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("schemeName")
  public SchemeNameEnum getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent = (PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent) o;
    return Objects.equals(this.identification, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.identification) &&
        Objects.equals(this.schemeName, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent.schemeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, schemeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent {\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
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

