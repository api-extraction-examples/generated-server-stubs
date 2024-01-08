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
 * TeamPPADefenseCumulative
 */

@JsonTypeName("TeamPPA_defense_cumulative")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamPPADefenseCumulative {

  private BigDecimal passing;

  private BigDecimal rushing;

  private BigDecimal total;

  public TeamPPADefenseCumulative passing(BigDecimal passing) {
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

  public TeamPPADefenseCumulative rushing(BigDecimal rushing) {
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

  public TeamPPADefenseCumulative total(BigDecimal total) {
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
    TeamPPADefenseCumulative teamPPADefenseCumulative = (TeamPPADefenseCumulative) o;
    return Objects.equals(this.passing, teamPPADefenseCumulative.passing) &&
        Objects.equals(this.rushing, teamPPADefenseCumulative.rushing) &&
        Objects.equals(this.total, teamPPADefenseCumulative.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passing, rushing, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamPPADefenseCumulative {\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
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

