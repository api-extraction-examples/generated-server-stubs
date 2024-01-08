package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.model.DriveEndTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Play
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Play {

  private String away;

  private DriveEndTime clock;

  private String defense;

  private String defenseConference;

  private Integer defenseScore;

  private Integer defenseTimeouts;

  private Integer distance;

  private Integer down;

  private Integer driveId;

  private Integer driveNumber;

  private Integer gameId;

  private String home;

  private Integer id;

  private String offense;

  private String offenseConference;

  private Integer offenseScore;

  private Integer offenseTimeouts;

  private Integer period;

  private Integer playNumber;

  private String playText;

  private String playType;

  private BigDecimal ppa;

  private Boolean scoring;

  private String wallclock;

  private Integer yardLine;

  private Integer yardsGained;

  private Integer yardsToGoal;

  public Play away(String away) {
    this.away = away;
    return this;
  }

  /**
   * Get away
   * @return away
  */
  
  @Schema(name = "away", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away")
  public String getAway() {
    return away;
  }

  public void setAway(String away) {
    this.away = away;
  }

  public Play clock(DriveEndTime clock) {
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

  public Play defense(String defense) {
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

  public Play defenseConference(String defenseConference) {
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

  public Play defenseScore(Integer defenseScore) {
    this.defenseScore = defenseScore;
    return this;
  }

  /**
   * Get defenseScore
   * @return defenseScore
  */
  
  @Schema(name = "defense_score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defense_score")
  public Integer getDefenseScore() {
    return defenseScore;
  }

  public void setDefenseScore(Integer defenseScore) {
    this.defenseScore = defenseScore;
  }

  public Play defenseTimeouts(Integer defenseTimeouts) {
    this.defenseTimeouts = defenseTimeouts;
    return this;
  }

  /**
   * Get defenseTimeouts
   * @return defenseTimeouts
  */
  
  @Schema(name = "defense_timeouts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defense_timeouts")
  public Integer getDefenseTimeouts() {
    return defenseTimeouts;
  }

  public void setDefenseTimeouts(Integer defenseTimeouts) {
    this.defenseTimeouts = defenseTimeouts;
  }

  public Play distance(Integer distance) {
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

  public Play down(Integer down) {
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

  public Play driveId(Integer driveId) {
    this.driveId = driveId;
    return this;
  }

  /**
   * Get driveId
   * @return driveId
  */
  
  @Schema(name = "drive_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drive_id")
  public Integer getDriveId() {
    return driveId;
  }

  public void setDriveId(Integer driveId) {
    this.driveId = driveId;
  }

  public Play driveNumber(Integer driveNumber) {
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

  public Play gameId(Integer gameId) {
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

  public Play home(String home) {
    this.home = home;
    return this;
  }

  /**
   * Get home
   * @return home
  */
  
  @Schema(name = "home", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home")
  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public Play id(Integer id) {
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

  public Play offense(String offense) {
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

  public Play offenseConference(String offenseConference) {
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

  public Play offenseScore(Integer offenseScore) {
    this.offenseScore = offenseScore;
    return this;
  }

  /**
   * Get offenseScore
   * @return offenseScore
  */
  
  @Schema(name = "offense_score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offense_score")
  public Integer getOffenseScore() {
    return offenseScore;
  }

  public void setOffenseScore(Integer offenseScore) {
    this.offenseScore = offenseScore;
  }

  public Play offenseTimeouts(Integer offenseTimeouts) {
    this.offenseTimeouts = offenseTimeouts;
    return this;
  }

  /**
   * Get offenseTimeouts
   * @return offenseTimeouts
  */
  
  @Schema(name = "offense_timeouts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offense_timeouts")
  public Integer getOffenseTimeouts() {
    return offenseTimeouts;
  }

  public void setOffenseTimeouts(Integer offenseTimeouts) {
    this.offenseTimeouts = offenseTimeouts;
  }

  public Play period(Integer period) {
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

  public Play playNumber(Integer playNumber) {
    this.playNumber = playNumber;
    return this;
  }

  /**
   * Get playNumber
   * @return playNumber
  */
  
  @Schema(name = "play_number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("play_number")
  public Integer getPlayNumber() {
    return playNumber;
  }

  public void setPlayNumber(Integer playNumber) {
    this.playNumber = playNumber;
  }

  public Play playText(String playText) {
    this.playText = playText;
    return this;
  }

  /**
   * Get playText
   * @return playText
  */
  
  @Schema(name = "play_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("play_text")
  public String getPlayText() {
    return playText;
  }

  public void setPlayText(String playText) {
    this.playText = playText;
  }

  public Play playType(String playType) {
    this.playType = playType;
    return this;
  }

  /**
   * Get playType
   * @return playType
  */
  
  @Schema(name = "play_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("play_type")
  public String getPlayType() {
    return playType;
  }

  public void setPlayType(String playType) {
    this.playType = playType;
  }

  public Play ppa(BigDecimal ppa) {
    this.ppa = ppa;
    return this;
  }

  /**
   * Get ppa
   * @return ppa
  */
  @Valid 
  @Schema(name = "ppa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ppa")
  public BigDecimal getPpa() {
    return ppa;
  }

  public void setPpa(BigDecimal ppa) {
    this.ppa = ppa;
  }

  public Play scoring(Boolean scoring) {
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

  public Play wallclock(String wallclock) {
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

  public Play yardLine(Integer yardLine) {
    this.yardLine = yardLine;
    return this;
  }

  /**
   * Get yardLine
   * @return yardLine
  */
  
  @Schema(name = "yard_line", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yard_line")
  public Integer getYardLine() {
    return yardLine;
  }

  public void setYardLine(Integer yardLine) {
    this.yardLine = yardLine;
  }

  public Play yardsGained(Integer yardsGained) {
    this.yardsGained = yardsGained;
    return this;
  }

  /**
   * Get yardsGained
   * @return yardsGained
  */
  
  @Schema(name = "yards_gained", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yards_gained")
  public Integer getYardsGained() {
    return yardsGained;
  }

  public void setYardsGained(Integer yardsGained) {
    this.yardsGained = yardsGained;
  }

  public Play yardsToGoal(Integer yardsToGoal) {
    this.yardsToGoal = yardsToGoal;
    return this;
  }

  /**
   * Get yardsToGoal
   * @return yardsToGoal
  */
  
  @Schema(name = "yards_to_goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yards_to_goal")
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
    Play play = (Play) o;
    return Objects.equals(this.away, play.away) &&
        Objects.equals(this.clock, play.clock) &&
        Objects.equals(this.defense, play.defense) &&
        Objects.equals(this.defenseConference, play.defenseConference) &&
        Objects.equals(this.defenseScore, play.defenseScore) &&
        Objects.equals(this.defenseTimeouts, play.defenseTimeouts) &&
        Objects.equals(this.distance, play.distance) &&
        Objects.equals(this.down, play.down) &&
        Objects.equals(this.driveId, play.driveId) &&
        Objects.equals(this.driveNumber, play.driveNumber) &&
        Objects.equals(this.gameId, play.gameId) &&
        Objects.equals(this.home, play.home) &&
        Objects.equals(this.id, play.id) &&
        Objects.equals(this.offense, play.offense) &&
        Objects.equals(this.offenseConference, play.offenseConference) &&
        Objects.equals(this.offenseScore, play.offenseScore) &&
        Objects.equals(this.offenseTimeouts, play.offenseTimeouts) &&
        Objects.equals(this.period, play.period) &&
        Objects.equals(this.playNumber, play.playNumber) &&
        Objects.equals(this.playText, play.playText) &&
        Objects.equals(this.playType, play.playType) &&
        Objects.equals(this.ppa, play.ppa) &&
        Objects.equals(this.scoring, play.scoring) &&
        Objects.equals(this.wallclock, play.wallclock) &&
        Objects.equals(this.yardLine, play.yardLine) &&
        Objects.equals(this.yardsGained, play.yardsGained) &&
        Objects.equals(this.yardsToGoal, play.yardsToGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(away, clock, defense, defenseConference, defenseScore, defenseTimeouts, distance, down, driveId, driveNumber, gameId, home, id, offense, offenseConference, offenseScore, offenseTimeouts, period, playNumber, playText, playType, ppa, scoring, wallclock, yardLine, yardsGained, yardsToGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Play {\n");
    sb.append("    away: ").append(toIndentedString(away)).append("\n");
    sb.append("    clock: ").append(toIndentedString(clock)).append("\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    defenseConference: ").append(toIndentedString(defenseConference)).append("\n");
    sb.append("    defenseScore: ").append(toIndentedString(defenseScore)).append("\n");
    sb.append("    defenseTimeouts: ").append(toIndentedString(defenseTimeouts)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    driveId: ").append(toIndentedString(driveId)).append("\n");
    sb.append("    driveNumber: ").append(toIndentedString(driveNumber)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    offense: ").append(toIndentedString(offense)).append("\n");
    sb.append("    offenseConference: ").append(toIndentedString(offenseConference)).append("\n");
    sb.append("    offenseScore: ").append(toIndentedString(offenseScore)).append("\n");
    sb.append("    offenseTimeouts: ").append(toIndentedString(offenseTimeouts)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    playNumber: ").append(toIndentedString(playNumber)).append("\n");
    sb.append("    playText: ").append(toIndentedString(playText)).append("\n");
    sb.append("    playType: ").append(toIndentedString(playType)).append("\n");
    sb.append("    ppa: ").append(toIndentedString(ppa)).append("\n");
    sb.append("    scoring: ").append(toIndentedString(scoring)).append("\n");
    sb.append("    wallclock: ").append(toIndentedString(wallclock)).append("\n");
    sb.append("    yardLine: ").append(toIndentedString(yardLine)).append("\n");
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

