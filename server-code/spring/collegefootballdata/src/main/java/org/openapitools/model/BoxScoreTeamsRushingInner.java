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
 * BoxScoreTeamsRushingInner
 */

@JsonTypeName("BoxScore_teams_rushing_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScoreTeamsRushingInner {

  private BigDecimal lineYards;

  private BigDecimal lineYardsAverage;

  private Integer openFieldYards;

  private BigDecimal openFieldYardsAverage;

  private BigDecimal powerSuccess;

  private Integer secondLevelYards;

  private BigDecimal secondLevelYardsAverage;

  private BigDecimal stuffRate;

  private String team;

  public BoxScoreTeamsRushingInner lineYards(BigDecimal lineYards) {
    this.lineYards = lineYards;
    return this;
  }

  /**
   * Get lineYards
   * @return lineYards
  */
  @Valid 
  @Schema(name = "lineYards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineYards")
  public BigDecimal getLineYards() {
    return lineYards;
  }

  public void setLineYards(BigDecimal lineYards) {
    this.lineYards = lineYards;
  }

  public BoxScoreTeamsRushingInner lineYardsAverage(BigDecimal lineYardsAverage) {
    this.lineYardsAverage = lineYardsAverage;
    return this;
  }

  /**
   * Get lineYardsAverage
   * @return lineYardsAverage
  */
  @Valid 
  @Schema(name = "lineYardsAverage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineYardsAverage")
  public BigDecimal getLineYardsAverage() {
    return lineYardsAverage;
  }

  public void setLineYardsAverage(BigDecimal lineYardsAverage) {
    this.lineYardsAverage = lineYardsAverage;
  }

  public BoxScoreTeamsRushingInner openFieldYards(Integer openFieldYards) {
    this.openFieldYards = openFieldYards;
    return this;
  }

  /**
   * Get openFieldYards
   * @return openFieldYards
  */
  
  @Schema(name = "openFieldYards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openFieldYards")
  public Integer getOpenFieldYards() {
    return openFieldYards;
  }

  public void setOpenFieldYards(Integer openFieldYards) {
    this.openFieldYards = openFieldYards;
  }

  public BoxScoreTeamsRushingInner openFieldYardsAverage(BigDecimal openFieldYardsAverage) {
    this.openFieldYardsAverage = openFieldYardsAverage;
    return this;
  }

  /**
   * Get openFieldYardsAverage
   * @return openFieldYardsAverage
  */
  @Valid 
  @Schema(name = "openFieldYardsAverage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openFieldYardsAverage")
  public BigDecimal getOpenFieldYardsAverage() {
    return openFieldYardsAverage;
  }

  public void setOpenFieldYardsAverage(BigDecimal openFieldYardsAverage) {
    this.openFieldYardsAverage = openFieldYardsAverage;
  }

  public BoxScoreTeamsRushingInner powerSuccess(BigDecimal powerSuccess) {
    this.powerSuccess = powerSuccess;
    return this;
  }

  /**
   * Get powerSuccess
   * @return powerSuccess
  */
  @Valid 
  @Schema(name = "powerSuccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("powerSuccess")
  public BigDecimal getPowerSuccess() {
    return powerSuccess;
  }

  public void setPowerSuccess(BigDecimal powerSuccess) {
    this.powerSuccess = powerSuccess;
  }

  public BoxScoreTeamsRushingInner secondLevelYards(Integer secondLevelYards) {
    this.secondLevelYards = secondLevelYards;
    return this;
  }

  /**
   * Get secondLevelYards
   * @return secondLevelYards
  */
  
  @Schema(name = "secondLevelYards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondLevelYards")
  public Integer getSecondLevelYards() {
    return secondLevelYards;
  }

  public void setSecondLevelYards(Integer secondLevelYards) {
    this.secondLevelYards = secondLevelYards;
  }

  public BoxScoreTeamsRushingInner secondLevelYardsAverage(BigDecimal secondLevelYardsAverage) {
    this.secondLevelYardsAverage = secondLevelYardsAverage;
    return this;
  }

  /**
   * Get secondLevelYardsAverage
   * @return secondLevelYardsAverage
  */
  @Valid 
  @Schema(name = "secondLevelYardsAverage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondLevelYardsAverage")
  public BigDecimal getSecondLevelYardsAverage() {
    return secondLevelYardsAverage;
  }

  public void setSecondLevelYardsAverage(BigDecimal secondLevelYardsAverage) {
    this.secondLevelYardsAverage = secondLevelYardsAverage;
  }

  public BoxScoreTeamsRushingInner stuffRate(BigDecimal stuffRate) {
    this.stuffRate = stuffRate;
    return this;
  }

  /**
   * Get stuffRate
   * @return stuffRate
  */
  @Valid 
  @Schema(name = "stuffRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stuffRate")
  public BigDecimal getStuffRate() {
    return stuffRate;
  }

  public void setStuffRate(BigDecimal stuffRate) {
    this.stuffRate = stuffRate;
  }

  public BoxScoreTeamsRushingInner team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Get team
   * @return team
  */
  
  @Schema(name = "team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team")
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxScoreTeamsRushingInner boxScoreTeamsRushingInner = (BoxScoreTeamsRushingInner) o;
    return Objects.equals(this.lineYards, boxScoreTeamsRushingInner.lineYards) &&
        Objects.equals(this.lineYardsAverage, boxScoreTeamsRushingInner.lineYardsAverage) &&
        Objects.equals(this.openFieldYards, boxScoreTeamsRushingInner.openFieldYards) &&
        Objects.equals(this.openFieldYardsAverage, boxScoreTeamsRushingInner.openFieldYardsAverage) &&
        Objects.equals(this.powerSuccess, boxScoreTeamsRushingInner.powerSuccess) &&
        Objects.equals(this.secondLevelYards, boxScoreTeamsRushingInner.secondLevelYards) &&
        Objects.equals(this.secondLevelYardsAverage, boxScoreTeamsRushingInner.secondLevelYardsAverage) &&
        Objects.equals(this.stuffRate, boxScoreTeamsRushingInner.stuffRate) &&
        Objects.equals(this.team, boxScoreTeamsRushingInner.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lineYards, lineYardsAverage, openFieldYards, openFieldYardsAverage, powerSuccess, secondLevelYards, secondLevelYardsAverage, stuffRate, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScoreTeamsRushingInner {\n");
    sb.append("    lineYards: ").append(toIndentedString(lineYards)).append("\n");
    sb.append("    lineYardsAverage: ").append(toIndentedString(lineYardsAverage)).append("\n");
    sb.append("    openFieldYards: ").append(toIndentedString(openFieldYards)).append("\n");
    sb.append("    openFieldYardsAverage: ").append(toIndentedString(openFieldYardsAverage)).append("\n");
    sb.append("    powerSuccess: ").append(toIndentedString(powerSuccess)).append("\n");
    sb.append("    secondLevelYards: ").append(toIndentedString(secondLevelYards)).append("\n");
    sb.append("    secondLevelYardsAverage: ").append(toIndentedString(secondLevelYardsAverage)).append("\n");
    sb.append("    stuffRate: ").append(toIndentedString(stuffRate)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

