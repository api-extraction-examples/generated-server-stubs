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
 * LivePlayByPlayTeamsInner
 */

@JsonTypeName("LivePlayByPlay_teams_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class LivePlayByPlayTeamsInner {

  private Integer drives;

  private BigDecimal epaPerPass;

  private BigDecimal epaPerPlay;

  private BigDecimal epaPerRush;

  private BigDecimal explosiveness;

  private String homeAway;

  private Integer lineYards;

  private BigDecimal lineYardsPerRush;

  private Integer openFieldYards;

  private BigDecimal openFieldYardsPerRush;

  private BigDecimal passingDownSuccessRate;

  private BigDecimal passingEpa;

  private Integer plays;

  private Integer points;

  private BigDecimal pointsPerOpportunity;

  private BigDecimal rushingEpa;

  private Integer scoringOpportunities;

  private Integer secondLevelYards;

  private BigDecimal secondLevelYardsPerRush;

  private BigDecimal standardDownSuccessRate;

  private BigDecimal successRate;

  private String team;

  private Integer teamId;

  private BigDecimal totalEpa;

  public LivePlayByPlayTeamsInner drives(Integer drives) {
    this.drives = drives;
    return this;
  }

  /**
   * Get drives
   * @return drives
  */
  
  @Schema(name = "drives", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drives")
  public Integer getDrives() {
    return drives;
  }

  public void setDrives(Integer drives) {
    this.drives = drives;
  }

  public LivePlayByPlayTeamsInner epaPerPass(BigDecimal epaPerPass) {
    this.epaPerPass = epaPerPass;
    return this;
  }

  /**
   * Get epaPerPass
   * @return epaPerPass
  */
  @Valid 
  @Schema(name = "epaPerPass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("epaPerPass")
  public BigDecimal getEpaPerPass() {
    return epaPerPass;
  }

  public void setEpaPerPass(BigDecimal epaPerPass) {
    this.epaPerPass = epaPerPass;
  }

  public LivePlayByPlayTeamsInner epaPerPlay(BigDecimal epaPerPlay) {
    this.epaPerPlay = epaPerPlay;
    return this;
  }

  /**
   * Get epaPerPlay
   * @return epaPerPlay
  */
  @Valid 
  @Schema(name = "epaPerPlay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("epaPerPlay")
  public BigDecimal getEpaPerPlay() {
    return epaPerPlay;
  }

  public void setEpaPerPlay(BigDecimal epaPerPlay) {
    this.epaPerPlay = epaPerPlay;
  }

  public LivePlayByPlayTeamsInner epaPerRush(BigDecimal epaPerRush) {
    this.epaPerRush = epaPerRush;
    return this;
  }

  /**
   * Get epaPerRush
   * @return epaPerRush
  */
  @Valid 
  @Schema(name = "epaPerRush", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("epaPerRush")
  public BigDecimal getEpaPerRush() {
    return epaPerRush;
  }

  public void setEpaPerRush(BigDecimal epaPerRush) {
    this.epaPerRush = epaPerRush;
  }

  public LivePlayByPlayTeamsInner explosiveness(BigDecimal explosiveness) {
    this.explosiveness = explosiveness;
    return this;
  }

  /**
   * Get explosiveness
   * @return explosiveness
  */
  @Valid 
  @Schema(name = "explosiveness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explosiveness")
  public BigDecimal getExplosiveness() {
    return explosiveness;
  }

  public void setExplosiveness(BigDecimal explosiveness) {
    this.explosiveness = explosiveness;
  }

  public LivePlayByPlayTeamsInner homeAway(String homeAway) {
    this.homeAway = homeAway;
    return this;
  }

  /**
   * Get homeAway
   * @return homeAway
  */
  
  @Schema(name = "homeAway", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeAway")
  public String getHomeAway() {
    return homeAway;
  }

  public void setHomeAway(String homeAway) {
    this.homeAway = homeAway;
  }

  public LivePlayByPlayTeamsInner lineYards(Integer lineYards) {
    this.lineYards = lineYards;
    return this;
  }

  /**
   * Get lineYards
   * @return lineYards
  */
  
  @Schema(name = "lineYards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineYards")
  public Integer getLineYards() {
    return lineYards;
  }

  public void setLineYards(Integer lineYards) {
    this.lineYards = lineYards;
  }

  public LivePlayByPlayTeamsInner lineYardsPerRush(BigDecimal lineYardsPerRush) {
    this.lineYardsPerRush = lineYardsPerRush;
    return this;
  }

  /**
   * Get lineYardsPerRush
   * @return lineYardsPerRush
  */
  @Valid 
  @Schema(name = "lineYardsPerRush", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineYardsPerRush")
  public BigDecimal getLineYardsPerRush() {
    return lineYardsPerRush;
  }

  public void setLineYardsPerRush(BigDecimal lineYardsPerRush) {
    this.lineYardsPerRush = lineYardsPerRush;
  }

  public LivePlayByPlayTeamsInner openFieldYards(Integer openFieldYards) {
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

  public LivePlayByPlayTeamsInner openFieldYardsPerRush(BigDecimal openFieldYardsPerRush) {
    this.openFieldYardsPerRush = openFieldYardsPerRush;
    return this;
  }

  /**
   * Get openFieldYardsPerRush
   * @return openFieldYardsPerRush
  */
  @Valid 
  @Schema(name = "openFieldYardsPerRush", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openFieldYardsPerRush")
  public BigDecimal getOpenFieldYardsPerRush() {
    return openFieldYardsPerRush;
  }

  public void setOpenFieldYardsPerRush(BigDecimal openFieldYardsPerRush) {
    this.openFieldYardsPerRush = openFieldYardsPerRush;
  }

  public LivePlayByPlayTeamsInner passingDownSuccessRate(BigDecimal passingDownSuccessRate) {
    this.passingDownSuccessRate = passingDownSuccessRate;
    return this;
  }

  /**
   * Get passingDownSuccessRate
   * @return passingDownSuccessRate
  */
  @Valid 
  @Schema(name = "passingDownSuccessRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passingDownSuccessRate")
  public BigDecimal getPassingDownSuccessRate() {
    return passingDownSuccessRate;
  }

  public void setPassingDownSuccessRate(BigDecimal passingDownSuccessRate) {
    this.passingDownSuccessRate = passingDownSuccessRate;
  }

  public LivePlayByPlayTeamsInner passingEpa(BigDecimal passingEpa) {
    this.passingEpa = passingEpa;
    return this;
  }

  /**
   * Get passingEpa
   * @return passingEpa
  */
  @Valid 
  @Schema(name = "passingEpa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passingEpa")
  public BigDecimal getPassingEpa() {
    return passingEpa;
  }

  public void setPassingEpa(BigDecimal passingEpa) {
    this.passingEpa = passingEpa;
  }

  public LivePlayByPlayTeamsInner plays(Integer plays) {
    this.plays = plays;
    return this;
  }

  /**
   * Get plays
   * @return plays
  */
  
  @Schema(name = "plays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plays")
  public Integer getPlays() {
    return plays;
  }

  public void setPlays(Integer plays) {
    this.plays = plays;
  }

  public LivePlayByPlayTeamsInner points(Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
  */
  
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public LivePlayByPlayTeamsInner pointsPerOpportunity(BigDecimal pointsPerOpportunity) {
    this.pointsPerOpportunity = pointsPerOpportunity;
    return this;
  }

  /**
   * Get pointsPerOpportunity
   * @return pointsPerOpportunity
  */
  @Valid 
  @Schema(name = "pointsPerOpportunity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointsPerOpportunity")
  public BigDecimal getPointsPerOpportunity() {
    return pointsPerOpportunity;
  }

  public void setPointsPerOpportunity(BigDecimal pointsPerOpportunity) {
    this.pointsPerOpportunity = pointsPerOpportunity;
  }

  public LivePlayByPlayTeamsInner rushingEpa(BigDecimal rushingEpa) {
    this.rushingEpa = rushingEpa;
    return this;
  }

  /**
   * Get rushingEpa
   * @return rushingEpa
  */
  @Valid 
  @Schema(name = "rushingEpa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rushingEpa")
  public BigDecimal getRushingEpa() {
    return rushingEpa;
  }

  public void setRushingEpa(BigDecimal rushingEpa) {
    this.rushingEpa = rushingEpa;
  }

  public LivePlayByPlayTeamsInner scoringOpportunities(Integer scoringOpportunities) {
    this.scoringOpportunities = scoringOpportunities;
    return this;
  }

  /**
   * Get scoringOpportunities
   * @return scoringOpportunities
  */
  
  @Schema(name = "scoringOpportunities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoringOpportunities")
  public Integer getScoringOpportunities() {
    return scoringOpportunities;
  }

  public void setScoringOpportunities(Integer scoringOpportunities) {
    this.scoringOpportunities = scoringOpportunities;
  }

  public LivePlayByPlayTeamsInner secondLevelYards(Integer secondLevelYards) {
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

  public LivePlayByPlayTeamsInner secondLevelYardsPerRush(BigDecimal secondLevelYardsPerRush) {
    this.secondLevelYardsPerRush = secondLevelYardsPerRush;
    return this;
  }

  /**
   * Get secondLevelYardsPerRush
   * @return secondLevelYardsPerRush
  */
  @Valid 
  @Schema(name = "secondLevelYardsPerRush", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondLevelYardsPerRush")
  public BigDecimal getSecondLevelYardsPerRush() {
    return secondLevelYardsPerRush;
  }

  public void setSecondLevelYardsPerRush(BigDecimal secondLevelYardsPerRush) {
    this.secondLevelYardsPerRush = secondLevelYardsPerRush;
  }

  public LivePlayByPlayTeamsInner standardDownSuccessRate(BigDecimal standardDownSuccessRate) {
    this.standardDownSuccessRate = standardDownSuccessRate;
    return this;
  }

  /**
   * Get standardDownSuccessRate
   * @return standardDownSuccessRate
  */
  @Valid 
  @Schema(name = "standardDownSuccessRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standardDownSuccessRate")
  public BigDecimal getStandardDownSuccessRate() {
    return standardDownSuccessRate;
  }

  public void setStandardDownSuccessRate(BigDecimal standardDownSuccessRate) {
    this.standardDownSuccessRate = standardDownSuccessRate;
  }

  public LivePlayByPlayTeamsInner successRate(BigDecimal successRate) {
    this.successRate = successRate;
    return this;
  }

  /**
   * Get successRate
   * @return successRate
  */
  @Valid 
  @Schema(name = "successRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successRate")
  public BigDecimal getSuccessRate() {
    return successRate;
  }

  public void setSuccessRate(BigDecimal successRate) {
    this.successRate = successRate;
  }

  public LivePlayByPlayTeamsInner team(String team) {
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

  public LivePlayByPlayTeamsInner teamId(Integer teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * Get teamId
   * @return teamId
  */
  
  @Schema(name = "teamId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teamId")
  public Integer getTeamId() {
    return teamId;
  }

  public void setTeamId(Integer teamId) {
    this.teamId = teamId;
  }

  public LivePlayByPlayTeamsInner totalEpa(BigDecimal totalEpa) {
    this.totalEpa = totalEpa;
    return this;
  }

  /**
   * Get totalEpa
   * @return totalEpa
  */
  @Valid 
  @Schema(name = "totalEpa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalEpa")
  public BigDecimal getTotalEpa() {
    return totalEpa;
  }

  public void setTotalEpa(BigDecimal totalEpa) {
    this.totalEpa = totalEpa;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivePlayByPlayTeamsInner livePlayByPlayTeamsInner = (LivePlayByPlayTeamsInner) o;
    return Objects.equals(this.drives, livePlayByPlayTeamsInner.drives) &&
        Objects.equals(this.epaPerPass, livePlayByPlayTeamsInner.epaPerPass) &&
        Objects.equals(this.epaPerPlay, livePlayByPlayTeamsInner.epaPerPlay) &&
        Objects.equals(this.epaPerRush, livePlayByPlayTeamsInner.epaPerRush) &&
        Objects.equals(this.explosiveness, livePlayByPlayTeamsInner.explosiveness) &&
        Objects.equals(this.homeAway, livePlayByPlayTeamsInner.homeAway) &&
        Objects.equals(this.lineYards, livePlayByPlayTeamsInner.lineYards) &&
        Objects.equals(this.lineYardsPerRush, livePlayByPlayTeamsInner.lineYardsPerRush) &&
        Objects.equals(this.openFieldYards, livePlayByPlayTeamsInner.openFieldYards) &&
        Objects.equals(this.openFieldYardsPerRush, livePlayByPlayTeamsInner.openFieldYardsPerRush) &&
        Objects.equals(this.passingDownSuccessRate, livePlayByPlayTeamsInner.passingDownSuccessRate) &&
        Objects.equals(this.passingEpa, livePlayByPlayTeamsInner.passingEpa) &&
        Objects.equals(this.plays, livePlayByPlayTeamsInner.plays) &&
        Objects.equals(this.points, livePlayByPlayTeamsInner.points) &&
        Objects.equals(this.pointsPerOpportunity, livePlayByPlayTeamsInner.pointsPerOpportunity) &&
        Objects.equals(this.rushingEpa, livePlayByPlayTeamsInner.rushingEpa) &&
        Objects.equals(this.scoringOpportunities, livePlayByPlayTeamsInner.scoringOpportunities) &&
        Objects.equals(this.secondLevelYards, livePlayByPlayTeamsInner.secondLevelYards) &&
        Objects.equals(this.secondLevelYardsPerRush, livePlayByPlayTeamsInner.secondLevelYardsPerRush) &&
        Objects.equals(this.standardDownSuccessRate, livePlayByPlayTeamsInner.standardDownSuccessRate) &&
        Objects.equals(this.successRate, livePlayByPlayTeamsInner.successRate) &&
        Objects.equals(this.team, livePlayByPlayTeamsInner.team) &&
        Objects.equals(this.teamId, livePlayByPlayTeamsInner.teamId) &&
        Objects.equals(this.totalEpa, livePlayByPlayTeamsInner.totalEpa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drives, epaPerPass, epaPerPlay, epaPerRush, explosiveness, homeAway, lineYards, lineYardsPerRush, openFieldYards, openFieldYardsPerRush, passingDownSuccessRate, passingEpa, plays, points, pointsPerOpportunity, rushingEpa, scoringOpportunities, secondLevelYards, secondLevelYardsPerRush, standardDownSuccessRate, successRate, team, teamId, totalEpa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivePlayByPlayTeamsInner {\n");
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    epaPerPass: ").append(toIndentedString(epaPerPass)).append("\n");
    sb.append("    epaPerPlay: ").append(toIndentedString(epaPerPlay)).append("\n");
    sb.append("    epaPerRush: ").append(toIndentedString(epaPerRush)).append("\n");
    sb.append("    explosiveness: ").append(toIndentedString(explosiveness)).append("\n");
    sb.append("    homeAway: ").append(toIndentedString(homeAway)).append("\n");
    sb.append("    lineYards: ").append(toIndentedString(lineYards)).append("\n");
    sb.append("    lineYardsPerRush: ").append(toIndentedString(lineYardsPerRush)).append("\n");
    sb.append("    openFieldYards: ").append(toIndentedString(openFieldYards)).append("\n");
    sb.append("    openFieldYardsPerRush: ").append(toIndentedString(openFieldYardsPerRush)).append("\n");
    sb.append("    passingDownSuccessRate: ").append(toIndentedString(passingDownSuccessRate)).append("\n");
    sb.append("    passingEpa: ").append(toIndentedString(passingEpa)).append("\n");
    sb.append("    plays: ").append(toIndentedString(plays)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    pointsPerOpportunity: ").append(toIndentedString(pointsPerOpportunity)).append("\n");
    sb.append("    rushingEpa: ").append(toIndentedString(rushingEpa)).append("\n");
    sb.append("    scoringOpportunities: ").append(toIndentedString(scoringOpportunities)).append("\n");
    sb.append("    secondLevelYards: ").append(toIndentedString(secondLevelYards)).append("\n");
    sb.append("    secondLevelYardsPerRush: ").append(toIndentedString(secondLevelYardsPerRush)).append("\n");
    sb.append("    standardDownSuccessRate: ").append(toIndentedString(standardDownSuccessRate)).append("\n");
    sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    totalEpa: ").append(toIndentedString(totalEpa)).append("\n");
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

