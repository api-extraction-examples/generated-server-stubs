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
 * LivePlayByPlayDrivesInnerPlaysInner
 */

@JsonTypeName("LivePlayByPlay_drives_inner_plays_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class LivePlayByPlayDrivesInnerPlaysInner {

  private Integer awayScore;

  private String clock;

  private Integer distance;

  private Integer down;

  private String downType;

  private BigDecimal epa;

  private Boolean garbageTime;

  private Integer homeScore;

  private Integer id;

  private Integer period;

  private String playText;

  private String playType;

  private Integer playTypeId;

  private String rushPass;

  private Boolean success;

  private String team;

  private Integer teamId;

  private String wallclock;

  private Integer yardsGained;

  private Integer yardsToGoal;

  public LivePlayByPlayDrivesInnerPlaysInner awayScore(Integer awayScore) {
    this.awayScore = awayScore;
    return this;
  }

  /**
   * Get awayScore
   * @return awayScore
  */
  
  @Schema(name = "awayScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayScore")
  public Integer getAwayScore() {
    return awayScore;
  }

  public void setAwayScore(Integer awayScore) {
    this.awayScore = awayScore;
  }

  public LivePlayByPlayDrivesInnerPlaysInner clock(String clock) {
    this.clock = clock;
    return this;
  }

  /**
   * Get clock
   * @return clock
  */
  
  @Schema(name = "clock", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clock")
  public String getClock() {
    return clock;
  }

  public void setClock(String clock) {
    this.clock = clock;
  }

  public LivePlayByPlayDrivesInnerPlaysInner distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public LivePlayByPlayDrivesInnerPlaysInner down(Integer down) {
    this.down = down;
    return this;
  }

  /**
   * Get down
   * @return down
  */
  
  @Schema(name = "down", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("down")
  public Integer getDown() {
    return down;
  }

  public void setDown(Integer down) {
    this.down = down;
  }

  public LivePlayByPlayDrivesInnerPlaysInner downType(String downType) {
    this.downType = downType;
    return this;
  }

  /**
   * Get downType
   * @return downType
  */
  
  @Schema(name = "downType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downType")
  public String getDownType() {
    return downType;
  }

  public void setDownType(String downType) {
    this.downType = downType;
  }

  public LivePlayByPlayDrivesInnerPlaysInner epa(BigDecimal epa) {
    this.epa = epa;
    return this;
  }

  /**
   * Get epa
   * @return epa
  */
  @Valid 
  @Schema(name = "epa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("epa")
  public BigDecimal getEpa() {
    return epa;
  }

  public void setEpa(BigDecimal epa) {
    this.epa = epa;
  }

  public LivePlayByPlayDrivesInnerPlaysInner garbageTime(Boolean garbageTime) {
    this.garbageTime = garbageTime;
    return this;
  }

  /**
   * Get garbageTime
   * @return garbageTime
  */
  
  @Schema(name = "garbageTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("garbageTime")
  public Boolean getGarbageTime() {
    return garbageTime;
  }

  public void setGarbageTime(Boolean garbageTime) {
    this.garbageTime = garbageTime;
  }

  public LivePlayByPlayDrivesInnerPlaysInner homeScore(Integer homeScore) {
    this.homeScore = homeScore;
    return this;
  }

  /**
   * Get homeScore
   * @return homeScore
  */
  
  @Schema(name = "homeScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeScore")
  public Integer getHomeScore() {
    return homeScore;
  }

  public void setHomeScore(Integer homeScore) {
    this.homeScore = homeScore;
  }

  public LivePlayByPlayDrivesInnerPlaysInner id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LivePlayByPlayDrivesInnerPlaysInner period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  
  @Schema(name = "period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public LivePlayByPlayDrivesInnerPlaysInner playText(String playText) {
    this.playText = playText;
    return this;
  }

  /**
   * Get playText
   * @return playText
  */
  
  @Schema(name = "playText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playText")
  public String getPlayText() {
    return playText;
  }

  public void setPlayText(String playText) {
    this.playText = playText;
  }

  public LivePlayByPlayDrivesInnerPlaysInner playType(String playType) {
    this.playType = playType;
    return this;
  }

  /**
   * Get playType
   * @return playType
  */
  
  @Schema(name = "playType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playType")
  public String getPlayType() {
    return playType;
  }

  public void setPlayType(String playType) {
    this.playType = playType;
  }

  public LivePlayByPlayDrivesInnerPlaysInner playTypeId(Integer playTypeId) {
    this.playTypeId = playTypeId;
    return this;
  }

  /**
   * Get playTypeId
   * @return playTypeId
  */
  
  @Schema(name = "playTypeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playTypeId")
  public Integer getPlayTypeId() {
    return playTypeId;
  }

  public void setPlayTypeId(Integer playTypeId) {
    this.playTypeId = playTypeId;
  }

  public LivePlayByPlayDrivesInnerPlaysInner rushPass(String rushPass) {
    this.rushPass = rushPass;
    return this;
  }

  /**
   * Get rushPass
   * @return rushPass
  */
  
  @Schema(name = "rushPass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rushPass")
  public String getRushPass() {
    return rushPass;
  }

  public void setRushPass(String rushPass) {
    this.rushPass = rushPass;
  }

  public LivePlayByPlayDrivesInnerPlaysInner success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  */
  
  @Schema(name = "success", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public LivePlayByPlayDrivesInnerPlaysInner team(String team) {
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

  public LivePlayByPlayDrivesInnerPlaysInner teamId(Integer teamId) {
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

  public LivePlayByPlayDrivesInnerPlaysInner wallclock(String wallclock) {
    this.wallclock = wallclock;
    return this;
  }

  /**
   * Get wallclock
   * @return wallclock
  */
  
  @Schema(name = "wallclock", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wallclock")
  public String getWallclock() {
    return wallclock;
  }

  public void setWallclock(String wallclock) {
    this.wallclock = wallclock;
  }

  public LivePlayByPlayDrivesInnerPlaysInner yardsGained(Integer yardsGained) {
    this.yardsGained = yardsGained;
    return this;
  }

  /**
   * Get yardsGained
   * @return yardsGained
  */
  
  @Schema(name = "yardsGained", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yardsGained")
  public Integer getYardsGained() {
    return yardsGained;
  }

  public void setYardsGained(Integer yardsGained) {
    this.yardsGained = yardsGained;
  }

  public LivePlayByPlayDrivesInnerPlaysInner yardsToGoal(Integer yardsToGoal) {
    this.yardsToGoal = yardsToGoal;
    return this;
  }

  /**
   * Get yardsToGoal
   * @return yardsToGoal
  */
  
  @Schema(name = "yardsToGoal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yardsToGoal")
  public Integer getYardsToGoal() {
    return yardsToGoal;
  }

  public void setYardsToGoal(Integer yardsToGoal) {
    this.yardsToGoal = yardsToGoal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivePlayByPlayDrivesInnerPlaysInner livePlayByPlayDrivesInnerPlaysInner = (LivePlayByPlayDrivesInnerPlaysInner) o;
    return Objects.equals(this.awayScore, livePlayByPlayDrivesInnerPlaysInner.awayScore) &&
        Objects.equals(this.clock, livePlayByPlayDrivesInnerPlaysInner.clock) &&
        Objects.equals(this.distance, livePlayByPlayDrivesInnerPlaysInner.distance) &&
        Objects.equals(this.down, livePlayByPlayDrivesInnerPlaysInner.down) &&
        Objects.equals(this.downType, livePlayByPlayDrivesInnerPlaysInner.downType) &&
        Objects.equals(this.epa, livePlayByPlayDrivesInnerPlaysInner.epa) &&
        Objects.equals(this.garbageTime, livePlayByPlayDrivesInnerPlaysInner.garbageTime) &&
        Objects.equals(this.homeScore, livePlayByPlayDrivesInnerPlaysInner.homeScore) &&
        Objects.equals(this.id, livePlayByPlayDrivesInnerPlaysInner.id) &&
        Objects.equals(this.period, livePlayByPlayDrivesInnerPlaysInner.period) &&
        Objects.equals(this.playText, livePlayByPlayDrivesInnerPlaysInner.playText) &&
        Objects.equals(this.playType, livePlayByPlayDrivesInnerPlaysInner.playType) &&
        Objects.equals(this.playTypeId, livePlayByPlayDrivesInnerPlaysInner.playTypeId) &&
        Objects.equals(this.rushPass, livePlayByPlayDrivesInnerPlaysInner.rushPass) &&
        Objects.equals(this.success, livePlayByPlayDrivesInnerPlaysInner.success) &&
        Objects.equals(this.team, livePlayByPlayDrivesInnerPlaysInner.team) &&
        Objects.equals(this.teamId, livePlayByPlayDrivesInnerPlaysInner.teamId) &&
        Objects.equals(this.wallclock, livePlayByPlayDrivesInnerPlaysInner.wallclock) &&
        Objects.equals(this.yardsGained, livePlayByPlayDrivesInnerPlaysInner.yardsGained) &&
        Objects.equals(this.yardsToGoal, livePlayByPlayDrivesInnerPlaysInner.yardsToGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayScore, clock, distance, down, downType, epa, garbageTime, homeScore, id, period, playText, playType, playTypeId, rushPass, success, team, teamId, wallclock, yardsGained, yardsToGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivePlayByPlayDrivesInnerPlaysInner {\n");
    sb.append("    awayScore: ").append(toIndentedString(awayScore)).append("\n");
    sb.append("    clock: ").append(toIndentedString(clock)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    downType: ").append(toIndentedString(downType)).append("\n");
    sb.append("    epa: ").append(toIndentedString(epa)).append("\n");
    sb.append("    garbageTime: ").append(toIndentedString(garbageTime)).append("\n");
    sb.append("    homeScore: ").append(toIndentedString(homeScore)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    playText: ").append(toIndentedString(playText)).append("\n");
    sb.append("    playType: ").append(toIndentedString(playType)).append("\n");
    sb.append("    playTypeId: ").append(toIndentedString(playTypeId)).append("\n");
    sb.append("    rushPass: ").append(toIndentedString(rushPass)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    wallclock: ").append(toIndentedString(wallclock)).append("\n");
    sb.append("    yardsGained: ").append(toIndentedString(yardsGained)).append("\n");
    sb.append("    yardsToGoal: ").append(toIndentedString(yardsToGoal)).append("\n");
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

