package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ErrorCollection;
import org.openapitools.model.WarningCollection;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NestedResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class NestedResponse {

  private ErrorCollection errorCollection;

  private Integer status;

  private WarningCollection warningCollection;

  public NestedResponse errorCollection(ErrorCollection errorCollection) {
    this.errorCollection = errorCollection;
    return this;
  }

  /**
   * Get errorCollection
   * @return errorCollection
  */
  @Valid 
  @Schema(name = "errorCollection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCollection")
  public ErrorCollection getErrorCollection() {
    return errorCollection;
  }

  public void setErrorCollection(ErrorCollection errorCollection) {
    this.errorCollection = errorCollection;
  }

  public NestedResponse status(Integer status) {
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

  public NestedResponse warningCollection(WarningCollection warningCollection) {
    this.warningCollection = warningCollection;
    return this;
  }

  /**
   * Get warningCollection
   * @return warningCollection
  */
  @Valid 
  @Schema(name = "warningCollection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warningCollection")
  public WarningCollection getWarningCollection() {
    return warningCollection;
  }

  public void setWarningCollection(WarningCollection warningCollection) {
    this.warningCollection = warningCollection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NestedResponse nestedResponse = (NestedResponse) o;
    return Objects.equals(this.errorCollection, nestedResponse.errorCollection) &&
        Objects.equals(this.status, nestedResponse.status) &&
        Objects.equals(this.warningCollection, nestedResponse.warningCollection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCollection, status, warningCollection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NestedResponse {\n");
    sb.append("    errorCollection: ").append(toIndentedString(errorCollection)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warningCollection: ").append(toIndentedString(warningCollection)).append("\n");
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

