package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ErrorCollection;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BulkOperationErrorResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class BulkOperationErrorResult {

  private ErrorCollection elementErrors;

  private Integer failedElementNumber;

  private Integer status;

  public BulkOperationErrorResult elementErrors(ErrorCollection elementErrors) {
    this.elementErrors = elementErrors;
    return this;
  }

  /**
   * Get elementErrors
   * @return elementErrors
  */
  @Valid 
  @Schema(name = "elementErrors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elementErrors")
  public ErrorCollection getElementErrors() {
    return elementErrors;
  }

  public void setElementErrors(ErrorCollection elementErrors) {
    this.elementErrors = elementErrors;
  }

  public BulkOperationErrorResult failedElementNumber(Integer failedElementNumber) {
    this.failedElementNumber = failedElementNumber;
    return this;
  }

  /**
   * Get failedElementNumber
   * @return failedElementNumber
  */
  
  @Schema(name = "failedElementNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("failedElementNumber")
  public Integer getFailedElementNumber() {
    return failedElementNumber;
  }

  public void setFailedElementNumber(Integer failedElementNumber) {
    this.failedElementNumber = failedElementNumber;
  }

  public BulkOperationErrorResult status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOperationErrorResult bulkOperationErrorResult = (BulkOperationErrorResult) o;
    return Objects.equals(this.elementErrors, bulkOperationErrorResult.elementErrors) &&
        Objects.equals(this.failedElementNumber, bulkOperationErrorResult.failedElementNumber) &&
        Objects.equals(this.status, bulkOperationErrorResult.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementErrors, failedElementNumber, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOperationErrorResult {\n");
    sb.append("    elementErrors: ").append(toIndentedString(elementErrors)).append("\n");
    sb.append("    failedElementNumber: ").append(toIndentedString(failedElementNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

