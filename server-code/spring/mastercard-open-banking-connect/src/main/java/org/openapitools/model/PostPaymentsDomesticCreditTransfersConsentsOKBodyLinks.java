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
 * PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersConsentsOKBodyLinks")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks {

  private String scaRedirect;

  public PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks scaRedirect(String scaRedirect) {
    this.scaRedirect = scaRedirect;
    return this;
  }

  /**
   * Redirect URL for SCA
   * @return scaRedirect
  */
  
  @Schema(name = "scaRedirect", example = "https://bank1.com/sca/login", description = "Redirect URL for SCA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scaRedirect")
  public String getScaRedirect() {
    return scaRedirect;
  }

  public void setScaRedirect(String scaRedirect) {
    this.scaRedirect = scaRedirect;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks postPaymentsDomesticCreditTransfersConsentsOKBodyLinks = (PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks) o;
    return Objects.equals(this.scaRedirect, postPaymentsDomesticCreditTransfersConsentsOKBodyLinks.scaRedirect);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scaRedirect);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersConsentsOKBodyLinks {\n");
    sb.append("    scaRedirect: ").append(toIndentedString(scaRedirect)).append("\n");
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

