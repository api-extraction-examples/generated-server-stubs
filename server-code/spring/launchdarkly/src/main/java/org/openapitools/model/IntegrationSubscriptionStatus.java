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
 * IntegrationSubscriptionStatus
 */

@JsonTypeName("IntegrationSubscription__status")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class IntegrationSubscriptionStatus {

  private Integer errorCount;

  private Long lastSuccess;

  private Integer successCount;

  public IntegrationSubscriptionStatus errorCount(Integer errorCount) {
    this.errorCount = errorCount;
    return this;
  }

  /**
   * Get errorCount
   * @return errorCount
  */
  
  @Schema(name = "errorCount", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorCount")
  public Integer getErrorCount() {
    return errorCount;
  }

  public void setErrorCount(Integer errorCount) {
    this.errorCount = errorCount;
  }

  public IntegrationSubscriptionStatus lastSuccess(Long lastSuccess) {
    this.lastSuccess = lastSuccess;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the last time this integration was successfully used.
   * @return lastSuccess
  */
  
  @Schema(name = "lastSuccess", example = "1443652232590", description = "A unix epoch time in milliseconds specifying the last time this integration was successfully used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastSuccess")
  public Long getLastSuccess() {
    return lastSuccess;
  }

  public void setLastSuccess(Long lastSuccess) {
    this.lastSuccess = lastSuccess;
  }

  public IntegrationSubscriptionStatus successCount(Integer successCount) {
    this.successCount = successCount;
    return this;
  }

  /**
   * Get successCount
   * @return successCount
  */
  
  @Schema(name = "successCount", example = "6", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successCount")
  public Integer getSuccessCount() {
    return successCount;
  }

  public void setSuccessCount(Integer successCount) {
    this.successCount = successCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationSubscriptionStatus integrationSubscriptionStatus = (IntegrationSubscriptionStatus) o;
    return Objects.equals(this.errorCount, integrationSubscriptionStatus.errorCount) &&
        Objects.equals(this.lastSuccess, integrationSubscriptionStatus.lastSuccess) &&
        Objects.equals(this.successCount, integrationSubscriptionStatus.successCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCount, lastSuccess, successCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationSubscriptionStatus {\n");
    sb.append("    errorCount: ").append(toIndentedString(errorCount)).append("\n");
    sb.append("    lastSuccess: ").append(toIndentedString(lastSuccess)).append("\n");
    sb.append("    successCount: ").append(toIndentedString(successCount)).append("\n");
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

