package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Status;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * previous build
 */

@Schema(name = "PreviousBuild", description = "previous build")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class PreviousBuild {

  private Integer buildNum;

  private Integer buildTimeMillis;

  private Status status;

  public PreviousBuild buildNum(Integer buildNum) {
    this.buildNum = buildNum;
    return this;
  }

  /**
   * Get buildNum
   * @return buildNum
  */
  
  @Schema(name = "build_num", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_num")
  public Integer getBuildNum() {
    return buildNum;
  }

  public void setBuildNum(Integer buildNum) {
    this.buildNum = buildNum;
  }

  public PreviousBuild buildTimeMillis(Integer buildTimeMillis) {
    this.buildTimeMillis = buildTimeMillis;
    return this;
  }

  /**
   * Get buildTimeMillis
   * @return buildTimeMillis
  */
  
  @Schema(name = "build_time_millis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_time_millis")
  public Integer getBuildTimeMillis() {
    return buildTimeMillis;
  }

  public void setBuildTimeMillis(Integer buildTimeMillis) {
    this.buildTimeMillis = buildTimeMillis;
  }

  public PreviousBuild status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
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
    PreviousBuild previousBuild = (PreviousBuild) o;
    return Objects.equals(this.buildNum, previousBuild.buildNum) &&
        Objects.equals(this.buildTimeMillis, previousBuild.buildTimeMillis) &&
        Objects.equals(this.status, previousBuild.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildNum, buildTimeMillis, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviousBuild {\n");
    sb.append("    buildNum: ").append(toIndentedString(buildNum)).append("\n");
    sb.append("    buildTimeMillis: ").append(toIndentedString(buildTimeMillis)).append("\n");
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

