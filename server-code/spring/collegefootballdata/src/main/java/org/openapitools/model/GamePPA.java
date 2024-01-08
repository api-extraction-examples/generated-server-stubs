package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GamePPADefense;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GamePPA
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class GamePPA {

  private String conference;

  private GamePPADefense defense;

  private Integer gameId;

  private GamePPADefense offense;

  private String opponent;

  private Integer season;

  private String team;

  private Integer week;

  public GamePPA conference(String conference) {
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

  public GamePPA defense(GamePPADefense defense) {
    this.defense = defense;
    return this;
  }

  /**
   * Get defense
   * @return defense
  */
  @Valid 
  @Schema(name = "defense", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defense")
  public GamePPADefense getDefense() {
    return defense;
  }

  public void setDefense(GamePPADefense defense) {
    this.defense = defense;
  }

  public GamePPA gameId(Integer gameId) {
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

  public GamePPA offense(GamePPADefense offense) {
    this.offense = offense;
    return this;
  }

  /**
   * Get offense
   * @return offense
  */
  @Valid 
  @Schema(name = "offense", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offense")
  public GamePPADefense getOffense() {
    return offense;
  }

  public void setOffense(GamePPADefense offense) {
    this.offense = offense;
  }

  public GamePPA opponent(String opponent) {
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

  public GamePPA season(Integer season) {
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

  public GamePPA team(String team) {
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

  public GamePPA week(Integer week) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamePPA gamePPA = (GamePPA) o;
    return Objects.equals(this.conference, gamePPA.conference) &&
        Objects.equals(this.defense, gamePPA.defense) &&
        Objects.equals(this.gameId, gamePPA.gameId) &&
        Objects.equals(this.offense, gamePPA.offense) &&
        Objects.equals(this.opponent, gamePPA.opponent) &&
        Objects.equals(this.season, gamePPA.season) &&
        Objects.equals(this.team, gamePPA.team) &&
        Objects.equals(this.week, gamePPA.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, defense, gameId, offense, opponent, season, team, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamePPA {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    offense: ").append(toIndentedString(offense)).append("\n");
    sb.append("    opponent: ").append(toIndentedString(opponent)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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

