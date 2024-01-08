package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoalMetricCurrentValueRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalMetricCurrentValueRequest {

  private String gid;

  private String resourceType;

  private BigDecimal currentNumberValue;

  public GoalMetricCurrentValueRequest gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public GoalMetricCurrentValueRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public GoalMetricCurrentValueRequest currentNumberValue(BigDecimal currentNumberValue) {
    this.currentNumberValue = currentNumberValue;
    return this;
  }

  /**
   * *Conditional*. This number is the current value of a goal metric of type number.
   * @return currentNumberValue
  */
  @Valid 
  @Schema(name = "current_number_value", example = "8.12", description = "*Conditional*. This number is the current value of a goal metric of type number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_number_value")
  public BigDecimal getCurrentNumberValue() {
    return currentNumberValue;
  }

  public void setCurrentNumberValue(BigDecimal currentNumberValue) {
    this.currentNumberValue = currentNumberValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalMetricCurrentValueRequest goalMetricCurrentValueRequest = (GoalMetricCurrentValueRequest) o;
    return Objects.equals(this.gid, goalMetricCurrentValueRequest.gid) &&
        Objects.equals(this.resourceType, goalMetricCurrentValueRequest.resourceType) &&
        Objects.equals(this.currentNumberValue, goalMetricCurrentValueRequest.currentNumberValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, currentNumberValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalMetricCurrentValueRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    currentNumberValue: ").append(toIndentedString(currentNumberValue)).append("\n");
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

