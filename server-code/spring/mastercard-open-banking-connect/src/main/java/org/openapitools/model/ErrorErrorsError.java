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
 * ErrorErrorsError
 */

@JsonTypeName("Error_Errors_Error")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class ErrorErrorsError {

  private String description;

  private String details;

  private String reasonCode;

  private Boolean recoverable;

  private String source;

  public ErrorErrorsError description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ErrorErrorsError details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Get details
   * @return details
  */
  
  @Schema(name = "Details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ErrorErrorsError reasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
    return this;
  }

  /**
   * Get reasonCode
   * @return reasonCode
  */
  
  @Schema(name = "ReasonCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReasonCode")
  public String getReasonCode() {
    return reasonCode;
  }

  public void setReasonCode(String reasonCode) {
    this.reasonCode = reasonCode;
  }

  public ErrorErrorsError recoverable(Boolean recoverable) {
    this.recoverable = recoverable;
    return this;
  }

  /**
   * Get recoverable
   * @return recoverable
  */
  
  @Schema(name = "Recoverable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Recoverable")
  public Boolean getRecoverable() {
    return recoverable;
  }

  public void setRecoverable(Boolean recoverable) {
    this.recoverable = recoverable;
  }

  public ErrorErrorsError source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  
  @Schema(name = "Source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Source")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorErrorsError errorErrorsError = (ErrorErrorsError) o;
    return Objects.equals(this.description, errorErrorsError.description) &&
        Objects.equals(this.details, errorErrorsError.details) &&
        Objects.equals(this.reasonCode, errorErrorsError.reasonCode) &&
        Objects.equals(this.recoverable, errorErrorsError.recoverable) &&
        Objects.equals(this.source, errorErrorsError.source);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, details, reasonCode, recoverable, source);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorErrorsError {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    reasonCode: ").append(toIndentedString(reasonCode)).append("\n");
    sb.append("    recoverable: ").append(toIndentedString(recoverable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

