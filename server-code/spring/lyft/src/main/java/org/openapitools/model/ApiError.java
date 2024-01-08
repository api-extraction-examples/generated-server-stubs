package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ErrorDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about why a request failed, such as missing or invalid parameters
 */

@Schema(name = "ApiError", description = "Details about why a request failed, such as missing or invalid parameters")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class ApiError {

  private String error;

  private String errorDescription;

  @Valid
  private List<@Valid ErrorDetail> errorDetail;

  public ApiError error(String error) {
    this.error = error;
    return this;
  }

  /**
   * A \"slug\" that serves as the error code (eg. \"bad_parameter\")
   * @return error
  */
  
  @Schema(name = "error", description = "A \"slug\" that serves as the error code (eg. \"bad_parameter\")", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ApiError errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

  /**
   * A user-friendly description of the error (appropriate to show to an end-user)
   * @return errorDescription
  */
  
  @Schema(name = "error_description", description = "A user-friendly description of the error (appropriate to show to an end-user)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_description")
  public String getErrorDescription() {
    return errorDescription;
  }

  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  public ApiError errorDetail(List<@Valid ErrorDetail> errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  public ApiError addErrorDetailItem(ErrorDetail errorDetailItem) {
    if (this.errorDetail == null) {
      this.errorDetail = new ArrayList<>();
    }
    this.errorDetail.add(errorDetailItem);
    return this;
  }

  /**
   * Get errorDetail
   * @return errorDetail
  */
  @Valid 
  @Schema(name = "error_detail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_detail")
  public List<@Valid ErrorDetail> getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(List<@Valid ErrorDetail> errorDetail) {
    this.errorDetail = errorDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.error, apiError.error) &&
        Objects.equals(this.errorDescription, apiError.errorDescription) &&
        Objects.equals(this.errorDetail, apiError.errorDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription, errorDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
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

