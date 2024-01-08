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
 * PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo
 */

@JsonTypeName("postPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo {

  private String xRequestId;

  public PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo(String xRequestId) {
    this.xRequestId = xRequestId;
  }

  public PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo xRequestId(String xRequestId) {
    this.xRequestId = xRequestId;
    return this;
  }

  /**
   * Original xRequestId given by the client on request
   * @return xRequestId
  */
  @NotNull @Pattern(regexp = "^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") 
  @Schema(name = "xRequestId", example = "444e4567-e55b-12d3-a456-426655448888", description = "Original xRequestId given by the client on request", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("xRequestId")
  public String getxRequestId() {
    return xRequestId;
  }

  public void setxRequestId(String xRequestId) {
    this.xRequestId = xRequestId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo postPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo = (PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo) o;
    return Objects.equals(this.xRequestId, postPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo.xRequestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xRequestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsDomesticCreditTransfersConsentsOKBodyOriginalRequestInfo {\n");
    sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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

