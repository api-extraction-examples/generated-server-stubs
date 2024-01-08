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
 * Jira instance health check results. Deprecated and no longer returned.
 */

@Schema(name = "HealthCheckResult", description = "Jira instance health check results. Deprecated and no longer returned.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class HealthCheckResult {

  private String description;

  private String name;

  private Boolean passed;

  public HealthCheckResult description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the Jira health check item.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the Jira health check item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public HealthCheckResult name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Jira health check item.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the Jira health check item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HealthCheckResult passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * Whether the Jira health check item passed or failed.
   * @return passed
  */
  
  @Schema(name = "passed", description = "Whether the Jira health check item passed or failed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passed")
  public Boolean getPassed() {
    return passed;
  }

  public void setPassed(Boolean passed) {
    this.passed = passed;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResult healthCheckResult = (HealthCheckResult) o;
    return Objects.equals(this.description, healthCheckResult.description) &&
        Objects.equals(this.name, healthCheckResult.name) &&
        Objects.equals(this.passed, healthCheckResult.passed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, passed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
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

