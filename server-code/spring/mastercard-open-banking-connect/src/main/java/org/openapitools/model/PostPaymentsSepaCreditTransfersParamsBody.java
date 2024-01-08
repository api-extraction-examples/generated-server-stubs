package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsSepaCreditTransfersParamsBodyRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsSepaCreditTransfersParamsBody
 */

@JsonTypeName("postPaymentsSepaCreditTransfersParamsBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsSepaCreditTransfersParamsBody {

  private PostPaymentsSepaCreditTransfersParamsBodyRequestInfo requestInfo;

  public PostPaymentsSepaCreditTransfersParamsBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsSepaCreditTransfersParamsBody(PostPaymentsSepaCreditTransfersParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public PostPaymentsSepaCreditTransfersParamsBody requestInfo(PostPaymentsSepaCreditTransfersParamsBodyRequestInfo requestInfo) {
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
  public PostPaymentsSepaCreditTransfersParamsBodyRequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(PostPaymentsSepaCreditTransfersParamsBodyRequestInfo requestInfo) {
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
    PostPaymentsSepaCreditTransfersParamsBody postPaymentsSepaCreditTransfersParamsBody = (PostPaymentsSepaCreditTransfersParamsBody) o;
    return Objects.equals(this.requestInfo, postPaymentsSepaCreditTransfersParamsBody.requestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsSepaCreditTransfersParamsBody {\n");
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

