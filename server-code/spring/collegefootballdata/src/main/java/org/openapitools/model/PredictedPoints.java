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
 * PredictedPoints
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PredictedPoints {

  private BigDecimal predictedPoints;

  private Integer yardLine;

  public PredictedPoints predictedPoints(BigDecimal predictedPoints) {
    this.predictedPoints = predictedPoints;
    return this;
  }

  /**
   * Get predictedPoints
   * @return predictedPoints
  */
  @Valid 
  @Schema(name = "predictedPoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("predictedPoints")
  public BigDecimal getPredictedPoints() {
    return predictedPoints;
  }

  public void setPredictedPoints(BigDecimal predictedPoints) {
    this.predictedPoints = predictedPoints;
  }

  public PredictedPoints yardLine(Integer yardLine) {
    this.yardLine = yardLine;
    return this;
  }

  /**
   * Get yardLine
   * @return yardLine
  */
  
  @Schema(name = "yardLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yardLine")
  public Integer getYardLine() {
    return yardLine;
  }

  public void setYardLine(Integer yardLine) {
    this.yardLine = yardLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictedPoints predictedPoints = (PredictedPoints) o;
    return Objects.equals(this.predictedPoints, predictedPoints.predictedPoints) &&
        Objects.equals(this.yardLine, predictedPoints.yardLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predictedPoints, yardLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictedPoints {\n");
    sb.append("    predictedPoints: ").append(toIndentedString(predictedPoints)).append("\n");
    sb.append("    yardLine: ").append(toIndentedString(yardLine)).append("\n");
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

