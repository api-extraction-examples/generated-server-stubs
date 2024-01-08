package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Return the consent data exchanged for PSU authorization
 */

@Schema(name = "SepaPaymentConsent", description = "Return the consent data exchanged for PSU authorization")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class SepaPaymentConsent {

  private String consentId;

  private String consentRequestId;

  public SepaPaymentConsent() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SepaPaymentConsent(String consentId, String consentRequestId) {
    this.consentId = consentId;
    this.consentRequestId = consentRequestId;
  }

  public SepaPaymentConsent consentId(String consentId) {
    this.consentId = consentId;
    return this;
  }

  /**
   * Consent Id
   * @return consentId
  */
  @NotNull 
  @Schema(name = "consentId", description = "Consent Id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consentId")
  public String getConsentId() {
    return consentId;
  }

  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }

  public SepaPaymentConsent consentRequestId(String consentRequestId) {
    this.consentRequestId = consentRequestId;
    return this;
  }

  /**
   * Consent Request Id, the same as received from /consent operations.
   * @return consentRequestId
  */
  @NotNull 
  @Schema(name = "consentRequestId", description = "Consent Request Id, the same as received from /consent operations.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("consentRequestId")
  public String getConsentRequestId() {
    return consentRequestId;
  }

  public void setConsentRequestId(String consentRequestId) {
    this.consentRequestId = consentRequestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SepaPaymentConsent sepaPaymentConsent = (SepaPaymentConsent) o;
    return Objects.equals(this.consentId, sepaPaymentConsent.consentId) &&
        Objects.equals(this.consentRequestId, sepaPaymentConsent.consentRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, consentRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SepaPaymentConsent {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    consentRequestId: ").append(toIndentedString(consentRequestId)).append("\n");
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

