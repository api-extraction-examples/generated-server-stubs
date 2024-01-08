package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AdvancedGameStatDefense;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdvancedGameStat
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class AdvancedGameStat {

  private AdvancedGameStatDefense defense;

  private Integer gameId;

  private AdvancedGameStatDefense offense;

  private String opponent;

  private Integer season;

  private String team;

  private Integer week;

  public AdvancedGameStat defense(AdvancedGameStatDefense defense) {
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
  public AdvancedGameStatDefense getDefense() {
    return defense;
  }

  public void setDefense(AdvancedGameStatDefense defense) {
    this.defense = defense;
  }

  public AdvancedGameStat gameId(Integer gameId) {
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

  public AdvancedGameStat offense(AdvancedGameStatDefense offense) {
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
  public AdvancedGameStatDefense getOffense() {
    return offense;
  }

  public void setOffense(AdvancedGameStatDefense offense) {
    this.offense = offense;
  }

  public AdvancedGameStat opponent(String opponent) {
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

  public AdvancedGameStat season(Integer season) {
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

  public AdvancedGameStat team(String team) {
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

  public AdvancedGameStat week(Integer week) {
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
    AdvancedGameStat advancedGameStat = (AdvancedGameStat) o;
    return Objects.equals(this.defense, advancedGameStat.defense) &&
        Objects.equals(this.gameId, advancedGameStat.gameId) &&
        Objects.equals(this.offense, advancedGameStat.offense) &&
        Objects.equals(this.opponent, advancedGameStat.opponent) &&
        Objects.equals(this.season, advancedGameStat.season) &&
        Objects.equals(this.team, advancedGameStat.team) &&
        Objects.equals(this.week, advancedGameStat.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defense, gameId, offense, opponent, season, team, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedGameStat {\n");
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

