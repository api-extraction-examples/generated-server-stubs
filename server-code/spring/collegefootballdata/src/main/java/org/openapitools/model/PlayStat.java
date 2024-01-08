package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DriveEndTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayStat
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayStat {

  private Integer athleteId;

  private String athleteName;

  private DriveEndTime clock;

  private String conference;

  private Integer distance;

  private Integer down;

  private Integer driveId;

  private Integer gameId;

  private String opponent;

  private Integer opponentScore;

  private Integer period;

  private Integer playId;

  private Integer season;

  private Integer stat;

  private String statType;

  private String team;

  private Integer teamScore;

  private Integer week;

  private Integer yardsToGoal;

  public PlayStat athleteId(Integer athleteId) {
    this.athleteId = athleteId;
    return this;
  }

  /**
   * Get athleteId
   * @return athleteId
  */
  
  @Schema(name = "athleteId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("athleteId")
  public Integer getAthleteId() {
    return athleteId;
  }

  public void setAthleteId(Integer athleteId) {
    this.athleteId = athleteId;
  }

  public PlayStat athleteName(String athleteName) {
    this.athleteName = athleteName;
    return this;
  }

  /**
   * Get athleteName
   * @return athleteName
  */
  
  @Schema(name = "athleteName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("athleteName")
  public String getAthleteName() {
    return athleteName;
  }

  public void setAthleteName(String athleteName) {
    this.athleteName = athleteName;
  }

  public PlayStat clock(DriveEndTime clock) {
    this.clock = clock;
    return this;
  }

  /**
   * Get clock
   * @return clock
  */
  @Valid 
  @Schema(name = "clock", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clock")
  public DriveEndTime getClock() {
    return clock;
  }

  public void setClock(DriveEndTime clock) {
    this.clock = clock;
  }

  public PlayStat conference(String conference) {
    this.conference = conference;
    return this;
  }

  /**
   * Get conference
   * @return conference
  */
  
  @Schema(name = "conference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conference")
  public String getConference() {
    return conference;
  }

  public void setConference(String conference) {
    this.conference = conference;
  }

  public PlayStat distance(Integer distance) {
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

  public PlayStat down(Integer down) {
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

  public PlayStat driveId(Integer driveId) {
    this.driveId = driveId;
    return this;
  }

  /**
   * Get driveId
   * @return driveId
  */
  
  @Schema(name = "driveId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("driveId")
  public Integer getDriveId() {
    return driveId;
  }

  public void setDriveId(Integer driveId) {
    this.driveId = driveId;
  }

  public PlayStat gameId(Integer gameId) {
    this.gameId = gameId;
    return this;
  }

  /**
   * Get gameId
   * @return gameId
  */
  
  @Schema(name = "gameId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gameId")
  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public PlayStat opponent(String opponent) {
    this.opponent = opponent;
    return this;
  }

  /**
   * Get opponent
   * @return opponent
  */
  
  @Schema(name = "opponent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opponent")
  public String getOpponent() {
    return opponent;
  }

  public void setOpponent(String opponent) {
    this.opponent = opponent;
  }

  public PlayStat opponentScore(Integer opponentScore) {
    this.opponentScore = opponentScore;
    return this;
  }

  /**
   * Get opponentScore
   * @return opponentScore
  */
  
  @Schema(name = "opponentScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opponentScore")
  public Integer getOpponentScore() {
    return opponentScore;
  }

  public void setOpponentScore(Integer opponentScore) {
    this.opponentScore = opponentScore;
  }

  public PlayStat period(Integer period) {
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

  public PlayStat playId(Integer playId) {
    this.playId = playId;
    return this;
  }

  /**
   * Get playId
   * @return playId
  */
  
  @Schema(name = "playId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playId")
  public Integer getPlayId() {
    return playId;
  }

  public void setPlayId(Integer playId) {
    this.playId = playId;
  }

  public PlayStat season(Integer season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
  */
  
  @Schema(name = "season", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("season")
  public Integer getSeason() {
    return season;
  }

  public void setSeason(Integer season) {
    this.season = season;
  }

  public PlayStat stat(Integer stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
  */
  
  @Schema(name = "stat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stat")
  public Integer getStat() {
    return stat;
  }

  public void setStat(Integer stat) {
    this.stat = stat;
  }

  public PlayStat statType(String statType) {
    this.statType = statType;
    return this;
  }

  /**
   * Get statType
   * @return statType
  */
  
  @Schema(name = "statType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statType")
  public String getStatType() {
    return statType;
  }

  public void setStatType(String statType) {
    this.statType = statType;
  }

  public PlayStat team(String team) {
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

  public PlayStat teamScore(Integer teamScore) {
    this.teamScore = teamScore;
    return this;
  }

  /**
   * Get teamScore
   * @return teamScore
  */
  
  @Schema(name = "teamScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teamScore")
  public Integer getTeamScore() {
    return teamScore;
  }

  public void setTeamScore(Integer teamScore) {
    this.teamScore = teamScore;
  }

  public PlayStat week(Integer week) {
    this.week = week;
    return this;
  }

  /**
   * Get week
   * @return week
  */
  
  @Schema(name = "week", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("week")
  public Integer getWeek() {
    return week;
  }

  public void setWeek(Integer week) {
    this.week = week;
  }

  public PlayStat yardsToGoal(Integer yardsToGoal) {
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
    PlayStat playStat = (PlayStat) o;
    return Objects.equals(this.athleteId, playStat.athleteId) &&
        Objects.equals(this.athleteName, playStat.athleteName) &&
        Objects.equals(this.clock, playStat.clock) &&
        Objects.equals(this.conference, playStat.conference) &&
        Objects.equals(this.distance, playStat.distance) &&
        Objects.equals(this.down, playStat.down) &&
        Objects.equals(this.driveId, playStat.driveId) &&
        Objects.equals(this.gameId, playStat.gameId) &&
        Objects.equals(this.opponent, playStat.opponent) &&
        Objects.equals(this.opponentScore, playStat.opponentScore) &&
        Objects.equals(this.period, playStat.period) &&
        Objects.equals(this.playId, playStat.playId) &&
        Objects.equals(this.season, playStat.season) &&
        Objects.equals(this.stat, playStat.stat) &&
        Objects.equals(this.statType, playStat.statType) &&
        Objects.equals(this.team, playStat.team) &&
        Objects.equals(this.teamScore, playStat.teamScore) &&
        Objects.equals(this.week, playStat.week) &&
        Objects.equals(this.yardsToGoal, playStat.yardsToGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(athleteId, athleteName, clock, conference, distance, down, driveId, gameId, opponent, opponentScore, period, playId, season, stat, statType, team, teamScore, week, yardsToGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayStat {\n");
    sb.append("    athleteId: ").append(toIndentedString(athleteId)).append("\n");
    sb.append("    athleteName: ").append(toIndentedString(athleteName)).append("\n");
    sb.append("    clock: ").append(toIndentedString(clock)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    driveId: ").append(toIndentedString(driveId)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    opponent: ").append(toIndentedString(opponent)).append("\n");
    sb.append("    opponentScore: ").append(toIndentedString(opponentScore)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    playId: ").append(toIndentedString(playId)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    teamScore: ").append(toIndentedString(teamScore)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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

