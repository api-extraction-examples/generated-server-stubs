package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.KycCheck;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * This is the base response type of the &lt;b&gt;getKYC&lt;/b&gt; method.
 */

@Schema(name = "KycResponse", description = "This is the base response type of the <b>getKYC</b> method.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class KycResponse {

  @Valid
  private List<@Valid KycCheck> kycChecks;

  public KycResponse kycChecks(List<@Valid KycCheck> kycChecks) {
    this.kycChecks = kycChecks;
    return this;
  }

  public KycResponse addKycChecksItem(KycCheck kycChecksItem) {
    if (this.kycChecks == null) {
      this.kycChecks = new ArrayList<>();
    }
    this.kycChecks.add(kycChecksItem);
    return this;
  }

  /**
   * This array contains one or more KYC checks required from a managed payments seller. The seller may need to provide more documentation and/or information about themselves, their company, or the bank account they are using for seller payouts.<br/><br/>If no KYC checks are currently required from the seller, this array is not returned, and the seller only receives a <code>204 No Content</code> HTTP status code.
   * @return kycChecks
  */
  @Valid 
  @Schema(name = "kycChecks", description = "This array contains one or more KYC checks required from a managed payments seller. The seller may need to provide more documentation and/or information about themselves, their company, or the bank account they are using for seller payouts.<br/><br/>If no KYC checks are currently required from the seller, this array is not returned, and the seller only receives a <code>204 No Content</code> HTTP status code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kycChecks")
  public List<@Valid KycCheck> getKycChecks() {
    return kycChecks;
  }

  public void setKycChecks(List<@Valid KycCheck> kycChecks) {
    this.kycChecks = kycChecks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KycResponse kycResponse = (KycResponse) o;
    return Objects.equals(this.kycChecks, kycResponse.kycChecks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kycChecks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KycResponse {\n");
    sb.append("    kycChecks: ").append(toIndentedString(kycChecks)).append("\n");
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

