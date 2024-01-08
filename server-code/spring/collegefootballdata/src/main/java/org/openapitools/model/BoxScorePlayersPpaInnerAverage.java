package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoxScorePlayersPpaInnerAverage
 */

@JsonTypeName("BoxScore_players_ppa_inner_average")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScorePlayersPpaInnerAverage {

  private BigDecimal passing;

  private BigDecimal quarter1;

  private BigDecimal quarter2;

  private BigDecimal quarter3;

  private BigDecimal quarter4;

  private BigDecimal rushing;

  private BigDecimal total;

  public BoxScorePlayersPpaInnerAverage passing(BigDecimal passing) {
    this.passing = passing;
    return this;
  }

  /**
   * Get passing
   * @return passing
  */
  @Valid 
  @Schema(name = "passing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passing")
  public BigDecimal getPassing() {
    return passing;
  }

  public void setPassing(BigDecimal passing) {
    this.passing = passing;
  }

  public BoxScorePlayersPpaInnerAverage quarter1(BigDecimal quarter1) {
    this.quarter1 = quarter1;
    return this;
  }

  /**
   * Get quarter1
   * @return quarter1
  */
  @Valid 
  @Schema(name = "quarter1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quarter1")
  public BigDecimal getQuarter1() {
    return quarter1;
  }

  public void setQuarter1(BigDecimal quarter1) {
    this.quarter1 = quarter1;
  }

  public BoxScorePlayersPpaInnerAverage quarter2(BigDecimal quarter2) {
    this.quarter2 = quarter2;
    return this;
  }

  /**
   * Get quarter2
   * @return quarter2
  */
  @Valid 
  @Schema(name = "quarter2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quarter2")
  public BigDecimal getQuarter2() {
    return quarter2;
  }

  public void setQuarter2(BigDecimal quarter2) {
    this.quarter2 = quarter2;
  }

  public BoxScorePlayersPpaInnerAverage quarter3(BigDecimal quarter3) {
    this.quarter3 = quarter3;
    return this;
  }

  /**
   * Get quarter3
   * @return quarter3
  */
  @Valid 
  @Schema(name = "quarter3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quarter3")
  public BigDecimal getQuarter3() {
    return quarter3;
  }

  public void setQuarter3(BigDecimal quarter3) {
    this.quarter3 = quarter3;
  }

  public BoxScorePlayersPpaInnerAverage quarter4(BigDecimal quarter4) {
    this.quarter4 = quarter4;
    return this;
  }

  /**
   * Get quarter4
   * @return quarter4
  */
  @Valid 
  @Schema(name = "quarter4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quarter4")
  public BigDecimal getQuarter4() {
    return quarter4;
  }

  public void setQuarter4(BigDecimal quarter4) {
    this.quarter4 = quarter4;
  }

  public BoxScorePlayersPpaInnerAverage rushing(BigDecimal rushing) {
    this.rushing = rushing;
    return this;
  }

  /**
   * Get rushing
   * @return rushing
  */
  @Valid 
  @Schema(name = "rushing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rushing")
  public BigDecimal getRushing() {
    return rushing;
  }

  public void setRushing(BigDecimal rushing) {
    this.rushing = rushing;
  }

  public BoxScorePlayersPpaInnerAverage total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @Valid 
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxScorePlayersPpaInnerAverage boxScorePlayersPpaInnerAverage = (BoxScorePlayersPpaInnerAverage) o;
    return Objects.equals(this.passing, boxScorePlayersPpaInnerAverage.passing) &&
        Objects.equals(this.quarter1, boxScorePlayersPpaInnerAverage.quarter1) &&
        Objects.equals(this.quarter2, boxScorePlayersPpaInnerAverage.quarter2) &&
        Objects.equals(this.quarter3, boxScorePlayersPpaInnerAverage.quarter3) &&
        Objects.equals(this.quarter4, boxScorePlayersPpaInnerAverage.quarter4) &&
        Objects.equals(this.rushing, boxScorePlayersPpaInnerAverage.rushing) &&
        Objects.equals(this.total, boxScorePlayersPpaInnerAverage.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passing, quarter1, quarter2, quarter3, quarter4, rushing, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScorePlayersPpaInnerAverage {\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
    sb.append("    quarter1: ").append(toIndentedString(quarter1)).append("\n");
    sb.append("    quarter2: ").append(toIndentedString(quarter2)).append("\n");
    sb.append("    quarter3: ").append(toIndentedString(quarter3)).append("\n");
    sb.append("    quarter4: ").append(toIndentedString(quarter4)).append("\n");
    sb.append("    rushing: ").append(toIndentedString(rushing)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

