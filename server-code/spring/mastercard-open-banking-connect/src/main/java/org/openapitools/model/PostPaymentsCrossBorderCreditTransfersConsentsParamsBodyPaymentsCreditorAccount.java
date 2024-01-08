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
 * PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount {

  private String identification;

  /**
   * Scheme for the account identification
   */
  public enum SchemeNameEnum {
    IBAN("IBAN"),
    
    SORTCODEACCOUNTNUMBER("SortCodeAccountNumber");

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

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount(String identification, SchemeNameEnum schemeName) {
    this.identification = identification;
    this.schemeName = schemeName;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Account identification
   * @return identification
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "identification", example = "PL06884573292356737845125375", description = "Account identification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount schemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Scheme for the account identification
   * @return schemeName
  */
  @NotNull 
  @Schema(name = "schemeName", example = "IBAN", description = "Scheme for the account identification", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount = (PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount) o;
    return Objects.equals(this.identification, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount.identification) &&
        Objects.equals(this.schemeName, postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount.schemeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, schemeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount {\n");
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

