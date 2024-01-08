package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsCrossBorderCreditTransfersParamsBody
 */

@JsonTypeName("postPaymentsCrossBorderCreditTransfersParamsBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsCrossBorderCreditTransfersParamsBody {

  private PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo requestInfo;

  public PostPaymentsCrossBorderCreditTransfersParamsBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsCrossBorderCreditTransfersParamsBody(PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public PostPaymentsCrossBorderCreditTransfersParamsBody requestInfo(PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
    return this;
  }

  /**
   * Get requestInfo
   * @return requestInfo
  */
  @NotNull @Valid 
  @Schema(name = "requestInfo", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requestInfo")
  public PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(PostPaymentsCrossBorderCreditTransfersParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostPaymentsCrossBorderCreditTransfersParamsBody postPaymentsCrossBorderCreditTransfersParamsBody = (PostPaymentsCrossBorderCreditTransfersParamsBody) o;
    return Objects.equals(this.requestInfo, postPaymentsCrossBorderCreditTransfersParamsBody.requestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsCrossBorderCreditTransfersParamsBody {\n");
    sb.append("    requestInfo: ").append(toIndentedString(requestInfo)).append("\n");
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

