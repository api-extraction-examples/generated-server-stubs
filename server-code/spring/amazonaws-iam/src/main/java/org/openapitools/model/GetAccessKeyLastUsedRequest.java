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
 * GetAccessKeyLastUsedRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetAccessKeyLastUsedRequest {

  private String accessKeyId;

  public GetAccessKeyLastUsedRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetAccessKeyLastUsedRequest(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public GetAccessKeyLastUsedRequest accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * Get accessKeyId
   * @return accessKeyId
  */
  @NotNull 
  @Schema(name = "AccessKeyId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccessKeyId")
  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccessKeyLastUsedRequest getAccessKeyLastUsedRequest = (GetAccessKeyLastUsedRequest) o;
    return Objects.equals(this.accessKeyId, getAccessKeyLastUsedRequest.accessKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccessKeyLastUsedRequest {\n");
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
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

