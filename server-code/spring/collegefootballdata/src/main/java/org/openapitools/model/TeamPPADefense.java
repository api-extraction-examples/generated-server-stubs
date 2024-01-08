package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.model.TeamPPADefenseCumulative;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamPPADefense
 */

@JsonTypeName("TeamPPA_defense")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamPPADefense {

  private TeamPPADefenseCumulative cumulative;

  private BigDecimal firstDown;

  private BigDecimal overall;

  private BigDecimal passing;

  private BigDecimal rushing;

  private BigDecimal secondDown;

  private BigDecimal thirdDown;

  public TeamPPADefense cumulative(TeamPPADefenseCumulative cumulative) {
    this.cumulative = cumulative;
    return this;
  }

  /**
   * Get cumulative
   * @return cumulative
  */
  @Valid 
  @Schema(name = "cumulative", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cumulative")
  public TeamPPADefenseCumulative getCumulative() {
    return cumulative;
  }

  public void setCumulative(TeamPPADefenseCumulative cumulative) {
    this.cumulative = cumulative;
  }

  public TeamPPADefense firstDown(BigDecimal firstDown) {
    this.firstDown = firstDown;
    return this;
  }

  /**
   * Get firstDown
   * @return firstDown
  */
  @Valid 
  @Schema(name = "firstDown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstDown")
  public BigDecimal getFirstDown() {
    return firstDown;
  }

  public void setFirstDown(BigDecimal firstDown) {
    this.firstDown = firstDown;
  }

  public TeamPPADefense overall(BigDecimal overall) {
    this.overall = overall;
    return this;
  }

  /**
   * Get overall
   * @return overall
  */
  @Valid 
  @Schema(name = "overall", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overall")
  public BigDecimal getOverall() {
    return overall;
  }

  public void setOverall(BigDecimal overall) {
    this.overall = overall;
  }

  public TeamPPADefense passing(BigDecimal passing) {
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

  public TeamPPADefense rushing(BigDecimal rushing) {
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

  public TeamPPADefense secondDown(BigDecimal secondDown) {
    this.secondDown = secondDown;
    return this;
  }

  /**
   * Get secondDown
   * @return secondDown
  */
  @Valid 
  @Schema(name = "secondDown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondDown")
  public BigDecimal getSecondDown() {
    return secondDown;
  }

  public void setSecondDown(BigDecimal secondDown) {
    this.secondDown = secondDown;
  }

  public TeamPPADefense thirdDown(BigDecimal thirdDown) {
    this.thirdDown = thirdDown;
    return this;
  }

  /**
   * Get thirdDown
   * @return thirdDown
  */
  @Valid 
  @Schema(name = "thirdDown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdDown")
  public BigDecimal getThirdDown() {
    return thirdDown;
  }

  public void setThirdDown(BigDecimal thirdDown) {
    this.thirdDown = thirdDown;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamPPADefense teamPPADefense = (TeamPPADefense) o;
    return Objects.equals(this.cumulative, teamPPADefense.cumulative) &&
        Objects.equals(this.firstDown, teamPPADefense.firstDown) &&
        Objects.equals(this.overall, teamPPADefense.overall) &&
        Objects.equals(this.passing, teamPPADefense.passing) &&
        Objects.equals(this.rushing, teamPPADefense.rushing) &&
        Objects.equals(this.secondDown, teamPPADefense.secondDown) &&
        Objects.equals(this.thirdDown, teamPPADefense.thirdDown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cumulative, firstDown, overall, passing, rushing, secondDown, thirdDown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamPPADefense {\n");
    sb.append("    cumulative: ").append(toIndentedString(cumulative)).append("\n");
    sb.append("    firstDown: ").append(toIndentedString(firstDown)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
    sb.append("    rushing: ").append(toIndentedString(rushing)).append("\n");
    sb.append("    secondDown: ").append(toIndentedString(secondDown)).append("\n");
    sb.append("    thirdDown: ").append(toIndentedString(thirdDown)).append("\n");
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

