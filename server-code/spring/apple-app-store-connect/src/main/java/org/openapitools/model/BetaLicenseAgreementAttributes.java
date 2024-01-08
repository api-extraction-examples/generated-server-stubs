package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BetaLicenseAgreementAttributes
 */

@JsonTypeName("BetaLicenseAgreement_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BetaLicenseAgreementAttributes {

  private String agreementText;

  public BetaLicenseAgreementAttributes agreementText(String agreementText) {
    this.agreementText = agreementText;
    return this;
  }

  /**
   * Get agreementText
   * @return agreementText
  */
  
  @Schema(name = "agreementText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("agreementText")
  public String getAgreementText() {
    return agreementText;
  }

  public void setAgreementText(String agreementText) {
    this.agreementText = agreementText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BetaLicenseAgreementAttributes betaLicenseAgreementAttributes = (BetaLicenseAgreementAttributes) o;
    return Objects.equals(this.agreementText, betaLicenseAgreementAttributes.agreementText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BetaLicenseAgreementAttributes {\n");
    sb.append("    agreementText: ").append(toIndentedString(agreementText)).append("\n");
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

