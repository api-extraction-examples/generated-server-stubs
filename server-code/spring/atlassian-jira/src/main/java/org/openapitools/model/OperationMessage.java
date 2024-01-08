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
 * OperationMessage
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class OperationMessage {

  private String message;

  private Integer statusCode;

  public OperationMessage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OperationMessage(String message, Integer statusCode) {
    this.message = message;
    this.statusCode = statusCode;
  }

  public OperationMessage message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The human-readable message that describes the result.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "The human-readable message that describes the result.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public OperationMessage statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * The status code of the response.
   * @return statusCode
  */
  @NotNull 
  @Schema(name = "statusCode", description = "The status code of the response.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusCode")
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OperationMessage operationMessage = (OperationMessage) o;
    return Objects.equals(this.message, operationMessage.message) &&
        Objects.equals(this.statusCode, operationMessage.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OperationMessage {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

