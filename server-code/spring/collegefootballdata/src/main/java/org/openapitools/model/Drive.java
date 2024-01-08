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
 * Drive
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Drive {

  private String defense;

  private String defenseConference;

  private Integer driveNumber;

  private String driveResult;

  private Integer endDefenseScore;

  private Integer endOffenseScore;

  private Integer endPeriod;

  private DriveEndTime endTime;

  private Integer endYardline;

  private Integer endYardsToGoal;

  private Integer gameId;

  private Integer id;

  private Boolean isHomeOffense;

  private String offense;

  private String offenseConference;

  private Integer plays;

  private Boolean scoring;

  private Integer startDefenseScore;

  private Integer startOffenseScore;

  private Integer startPeriod;

  private DriveEndTime startTime;

  private Integer startYardline;

  private Integer startYardsToGoal;

  private Integer yards;

  public Drive defense(String defense) {
    this.defense = defense;
    return this;
  }

  /**
   * Get defense
   * @return defense
  */
  
  @Schema(name = "defense", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defense")
  public String getDefense() {
    return defense;
  }

  public void setDefense(String defense) {
    this.defense = defense;
  }

  public Drive defenseConference(String defenseConference) {
    this.defenseConference = defenseConference;
    return this;
  }

  /**
   * Get defenseConference
   * @return defenseConference
  */
  
  @Schema(name = "defense_conference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defense_conference")
  public String getDefenseConference() {
    return defenseConference;
  }

  public void setDefenseConference(String defenseConference) {
    this.defenseConference = defenseConference;
  }

  public Drive driveNumber(Integer driveNumber) {
    this.driveNumber = driveNumber;
    return this;
  }

  /**
   * Get driveNumber
   * @return driveNumber
  */
  
  @Schema(name = "drive_number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drive_number")
  public Integer getDriveNumber() {
    return driveNumber;
  }

  public void setDriveNumber(Integer driveNumber) {
    this.driveNumber = driveNumber;
  }

  public Drive driveResult(String driveResult) {
    this.driveResult = driveResult;
    return this;
  }

  /**
   * Get driveResult
   * @return driveResult
  */
  
  @Schema(name = "drive_result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drive_result")
  public String getDriveResult() {
    return driveResult;
  }

  public void setDriveResult(String driveResult) {
    this.driveResult = driveResult;
  }

  public Drive endDefenseScore(Integer endDefenseScore) {
    this.endDefenseScore = endDefenseScore;
    return this;
  }

  /**
   * Get endDefenseScore
   * @return endDefenseScore
  */
  
  @Schema(name = "end_defense_score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_defense_score")
  public Integer getEndDefenseScore() {
    return endDefenseScore;
  }

  public void setEndDefenseScore(Integer endDefenseScore) {
    this.endDefenseScore = endDefenseScore;
  }

  public Drive endOffenseScore(Integer endOffenseScore) {
    this.endOffenseScore = endOffenseScore;
    return this;
  }

  /**
   * Get endOffenseScore
   * @return endOffenseScore
  */
  
  @Schema(name = "end_offense_score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_offense_score")
  public Integer getEndOffenseScore() {
    return endOffenseScore;
  }

  public void setEndOffenseScore(Integer endOffenseScore) {
    this.endOffenseScore = endOffenseScore;
  }

  public Drive endPeriod(Integer endPeriod) {
    this.endPeriod = endPeriod;
    return this;
  }

  /**
   * Get endPeriod
   * @return endPeriod
  */
  
  @Schema(name = "end_period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_period")
  public Integer getEndPeriod() {
    return endPeriod;
  }

  public void setEndPeriod(Integer endPeriod) {
    this.endPeriod = endPeriod;
  }

  public Drive endTime(DriveEndTime endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Get endTime
   * @return endTime
  */
  @Valid 
  @Schema(name = "end_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public DriveEndTime getEndTime() {
    return endTime;
  }

  public void setEndTime(DriveEndTime endTime) {
    this.endTime = endTime;
  }

  public Drive endYardline(Integer endYardline) {
    this.endYardline = endYardline;
    return this;
  }

  /**
   * Get endYardline
   * @return endYardline
  */
  
  @Schema(name = "end_yardline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_yardline")
  public Integer getEndYardline() {
    return endYardline;
  }

  public void setEndYardline(Integer endYardline) {
    this.endYardline = endYardline;
  }

  public Drive endYardsToGoal(Integer endYardsToGoal) {
    this.endYardsToGoal = endYardsToGoal;
    return this;
  }

  /**
   * Get endYardsToGoal
   * @return endYardsToGoal
  */
  
  @Schema(name = "end_yards_to_goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_yards_to_goal")
  public Integer getEndYardsToGoal() {
    return endYardsToGoal;
  }

  public void setEndYardsToGoal(Integer endYardsToGoal) {
    this.endYardsToGoal = endYardsToGoal;
  }

  public Drive gameId(Integer gameId) {
    this.gameId = gameId;
    return this;
  }

  /**
   * Get gameId
   * @return gameId
  */
  
  @Schema(name = "game_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("game_id")
  public Integer getGameId() {
    return gameId;
  }

  public void setGameId(Integer gameId) {
    this.gameId = gameId;
  }

  public Drive id(Integer id) {
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

  public Drive isHomeOffense(Boolean isHomeOffense) {
    this.isHomeOffense = isHomeOffense;
    return this;
  }

  /**
   * Get isHomeOffense
   * @return isHomeOffense
  */
  
  @Schema(name = "is_home_offense", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_home_offense")
  public Boolean getIsHomeOffense() {
    return isHomeOffense;
  }

  public void setIsHomeOffense(Boolean isHomeOffense) {
    this.isHomeOffense = isHomeOffense;
  }

  public Drive offense(String offense) {
    this.offense = offense;
    return this;
  }

  /**
   * Get offense
   * @return offense
  */
  
  @Schema(name = "offense", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offense")
  public String getOffense() {
    return offense;
  }

  public void setOffense(String offense) {
    this.offense = offense;
  }

  public Drive offenseConference(String offenseConference) {
    this.offenseConference = offenseConference;
    return this;
  }

  /**
   * Get offenseConference
   * @return offenseConference
  */
  
  @Schema(name = "offense_conference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offense_conference")
  public String getOffenseConference() {
    return offenseConference;
  }

  public void setOffenseConference(String offenseConference) {
    this.offenseConference = offenseConference;
  }

  public Drive plays(Integer plays) {
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

  public Drive scoring(Boolean scoring) {
    this.scoring = scoring;
    return this;
  }

  /**
   * Get scoring
   * @return scoring
  */
  
  @Schema(name = "scoring", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoring")
  public Boolean getScoring() {
    return scoring;
  }

  public void setScoring(Boolean scoring) {
    this.scoring = scoring;
  }

  public Drive startDefenseScore(Integer startDefenseScore) {
    this.startDefenseScore = startDefenseScore;
    return this;
  }

  /**
   * Get startDefenseScore
   * @return startDefenseScore
  */
  
  @Schema(name = "start_defense_score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_defense_score")
  public Integer getStartDefenseScore() {
    return startDefenseScore;
  }

  public void setStartDefenseScore(Integer startDefenseScore) {
    this.startDefenseScore = startDefenseScore;
  }

  public Drive startOffenseScore(Integer startOffenseScore) {
    this.startOffenseScore = startOffenseScore;
    return this;
  }

  /**
   * Get startOffenseScore
   * @return startOffenseScore
  */
  
  @Schema(name = "start_offense_score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_offense_score")
  public Integer getStartOffenseScore() {
    return startOffenseScore;
  }

  public void setStartOffenseScore(Integer startOffenseScore) {
    this.startOffenseScore = startOffenseScore;
  }

  public Drive startPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
    return this;
  }

  /**
   * Get startPeriod
   * @return startPeriod
  */
  
  @Schema(name = "start_period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_period")
  public Integer getStartPeriod() {
    return startPeriod;
  }

  public void setStartPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
  }

  public Drive startTime(DriveEndTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  @Valid 
  @Schema(name = "start_time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public DriveEndTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DriveEndTime startTime) {
    this.startTime = startTime;
  }

  public Drive startYardline(Integer startYardline) {
    this.startYardline = startYardline;
    return this;
  }

  /**
   * Get startYardline
   * @return startYardline
  */
  
  @Schema(name = "start_yardline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_yardline")
  public Integer getStartYardline() {
    return startYardline;
  }

  public void setStartYardline(Integer startYardline) {
    this.startYardline = startYardline;
  }

  public Drive startYardsToGoal(Integer startYardsToGoal) {
    this.startYardsToGoal = startYardsToGoal;
    return this;
  }

  /**
   * Get startYardsToGoal
   * @return startYardsToGoal
  */
  
  @Schema(name = "start_yards_to_goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_yards_to_goal")
  public Integer getStartYardsToGoal() {
    return startYardsToGoal;
  }

  public void setStartYardsToGoal(Integer startYardsToGoal) {
    this.startYardsToGoal = startYardsToGoal;
  }

  public Drive yards(Integer yards) {
    this.yards = yards;
    return this;
  }

  /**
   * Get yards
   * @return yards
  */
  
  @Schema(name = "yards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yards")
  public Integer getYards() {
    return yards;
  }

  public void setYards(Integer yards) {
    this.yards = yards;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Drive drive = (Drive) o;
    return Objects.equals(this.defense, drive.defense) &&
        Objects.equals(this.defenseConference, drive.defenseConference) &&
        Objects.equals(this.driveNumber, drive.driveNumber) &&
        Objects.equals(this.driveResult, drive.driveResult) &&
        Objects.equals(this.endDefenseScore, drive.endDefenseScore) &&
        Objects.equals(this.endOffenseScore, drive.endOffenseScore) &&
        Objects.equals(this.endPeriod, drive.endPeriod) &&
        Objects.equals(this.endTime, drive.endTime) &&
        Objects.equals(this.endYardline, drive.endYardline) &&
        Objects.equals(this.endYardsToGoal, drive.endYardsToGoal) &&
        Objects.equals(this.gameId, drive.gameId) &&
        Objects.equals(this.id, drive.id) &&
        Objects.equals(this.isHomeOffense, drive.isHomeOffense) &&
        Objects.equals(this.offense, drive.offense) &&
        Objects.equals(this.offenseConference, drive.offenseConference) &&
        Objects.equals(this.plays, drive.plays) &&
        Objects.equals(this.scoring, drive.scoring) &&
        Objects.equals(this.startDefenseScore, drive.startDefenseScore) &&
        Objects.equals(this.startOffenseScore, drive.startOffenseScore) &&
        Objects.equals(this.startPeriod, drive.startPeriod) &&
        Objects.equals(this.startTime, drive.startTime) &&
        Objects.equals(this.startYardline, drive.startYardline) &&
        Objects.equals(this.startYardsToGoal, drive.startYardsToGoal) &&
        Objects.equals(this.yards, drive.yards);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defense, defenseConference, driveNumber, driveResult, endDefenseScore, endOffenseScore, endPeriod, endTime, endYardline, endYardsToGoal, gameId, id, isHomeOffense, offense, offenseConference, plays, scoring, startDefenseScore, startOffenseScore, startPeriod, startTime, startYardline, startYardsToGoal, yards);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Drive {\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    defenseConference: ").append(toIndentedString(defenseConference)).append("\n");
    sb.append("    driveNumber: ").append(toIndentedString(driveNumber)).append("\n");
    sb.append("    driveResult: ").append(toIndentedString(driveResult)).append("\n");
    sb.append("    endDefenseScore: ").append(toIndentedString(endDefenseScore)).append("\n");
    sb.append("    endOffenseScore: ").append(toIndentedString(endOffenseScore)).append("\n");
    sb.append("    endPeriod: ").append(toIndentedString(endPeriod)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    endYardline: ").append(toIndentedString(endYardline)).append("\n");
    sb.append("    endYardsToGoal: ").append(toIndentedString(endYardsToGoal)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isHomeOffense: ").append(toIndentedString(isHomeOffense)).append("\n");
    sb.append("    offense: ").append(toIndentedString(offense)).append("\n");
    sb.append("    offenseConference: ").append(toIndentedString(offenseConference)).append("\n");
    sb.append("    plays: ").append(toIndentedString(plays)).append("\n");
    sb.append("    scoring: ").append(toIndentedString(scoring)).append("\n");
    sb.append("    startDefenseScore: ").append(toIndentedString(startDefenseScore)).append("\n");
    sb.append("    startOffenseScore: ").append(toIndentedString(startOffenseScore)).append("\n");
    sb.append("    startPeriod: ").append(toIndentedString(startPeriod)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    startYardline: ").append(toIndentedString(startYardline)).append("\n");
    sb.append("    startYardsToGoal: ").append(toIndentedString(startYardsToGoal)).append("\n");
    sb.append("    yards: ").append(toIndentedString(yards)).append("\n");
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

