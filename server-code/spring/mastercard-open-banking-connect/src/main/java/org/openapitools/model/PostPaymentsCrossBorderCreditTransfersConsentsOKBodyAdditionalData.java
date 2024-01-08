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
 * Returning additional data related to the consent
 */

@Schema(name = "postPaymentsCrossBorderCreditTransfersConsentsOKBody_additionalData", description = "Returning additional data related to the consent")
@JsonTypeName("postPaymentsCrossBorderCreditTransfersConsentsOKBody_additionalData")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData {

  private String rawConsent;

  public PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData rawConsent(String rawConsent) {
    this.rawConsent = rawConsent;
    return this;
  }

  /**
   * Raw Consent, available only for specific standards and returned only if requestInfo.flag contained 'Return.Raw.Consent'
   * @return rawConsent
  */
  
  @Schema(name = "rawConsent", description = "Raw Consent, available only for specific standards and returned only if requestInfo.flag contained 'Return.Raw.Consent'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rawConsent")
  public String getRawConsent() {
    return rawConsent;
  }

  public void setRawConsent(String rawConsent) {
    this.rawConsent = rawConsent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData postPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData = (PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData) o;
    return Objects.equals(this.rawConsent, postPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData.rawConsent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rawConsent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersConsentsOKBodyAdditionalData {\n");
    sb.append("    rawConsent: ").append(toIndentedString(rawConsent)).append("\n");
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

