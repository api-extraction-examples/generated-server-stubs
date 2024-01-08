package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AccessAdvisorUsageGranularityType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GenerateServiceLastAccessedDetailsRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GenerateServiceLastAccessedDetailsRequest {

  private String arn;

  private AccessAdvisorUsageGranularityType granularity;

  public GenerateServiceLastAccessedDetailsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateServiceLastAccessedDetailsRequest(String arn) {
    this.arn = arn;
  }

  public GenerateServiceLastAccessedDetailsRequest arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
  */
  @NotNull 
  @Schema(name = "Arn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public GenerateServiceLastAccessedDetailsRequest granularity(AccessAdvisorUsageGranularityType granularity) {
    this.granularity = granularity;
    return this;
  }

  /**
   * Get granularity
   * @return granularity
  */
  @Valid 
  @Schema(name = "Granularity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Granularity")
  public AccessAdvisorUsageGranularityType getGranularity() {
    return granularity;
  }

  public void setGranularity(AccessAdvisorUsageGranularityType granularity) {
    this.granularity = granularity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateServiceLastAccessedDetailsRequest generateServiceLastAccessedDetailsRequest = (GenerateServiceLastAccessedDetailsRequest) o;
    return Objects.equals(this.arn, generateServiceLastAccessedDetailsRequest.arn) &&
        Objects.equals(this.granularity, generateServiceLastAccessedDetailsRequest.granularity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arn, granularity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateServiceLastAccessedDetailsRequest {\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
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

