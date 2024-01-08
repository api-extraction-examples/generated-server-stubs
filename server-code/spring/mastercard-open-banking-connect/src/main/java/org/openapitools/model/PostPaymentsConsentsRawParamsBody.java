package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.PostPaymentsConsentsRawParamsBodyRequestInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostPaymentsConsentsRawParamsBody
 */

@JsonTypeName("postPaymentsConsentsRawParamsBody")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class PostPaymentsConsentsRawParamsBody {

  private PostPaymentsConsentsRawParamsBodyRequestInfo requestInfo;

  public PostPaymentsConsentsRawParamsBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostPaymentsConsentsRawParamsBody(PostPaymentsConsentsRawParamsBodyRequestInfo requestInfo) {
    this.requestInfo = requestInfo;
  }

  public PostPaymentsConsentsRawParamsBody requestInfo(PostPaymentsConsentsRawParamsBodyRequestInfo requestInfo) {
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
  public PostPaymentsConsentsRawParamsBodyRequestInfo getRequestInfo() {
    return requestInfo;
  }

  public void setRequestInfo(PostPaymentsConsentsRawParamsBodyRequestInfo requestInfo) {
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
    PostPaymentsConsentsRawParamsBody postPaymentsConsentsRawParamsBody = (PostPaymentsConsentsRawParamsBody) o;
    return Objects.equals(this.requestInfo, postPaymentsConsentsRawParamsBody.requestInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostPaymentsConsentsRawParamsBody {\n");
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

