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
 * PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount {

  private String identification;

  /**
   * Account scheme name
   */
  public enum SchemeNameEnum {
    UK_ACCOUNTNUMBER("UK.AccountNumber"),
    
    PL_ACCOUNTNUMBER("PL.AccountNumber");

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

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount(String identification) {
    this.identification = identification;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount identification(String identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Account number
   * @return identification
  */
  @NotNull @Size(min = 1, max = 256) 
  @Schema(name = "identification", example = "30087236", description = "Account number", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("identification")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount schemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
    return this;
  }

  /**
   * Account scheme name
   * @return schemeName
  */
  
  @Schema(name = "schemeName", example = "UK.AccountNumber", description = "Account scheme name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount = (PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount) o;
    return Objects.equals(this.identification, postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount.identification) &&
        Objects.equals(this.schemeName, postPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount.schemeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, schemeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersConsentsParamsBodyPaymentsCreditorAccount {\n");
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

