package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TeamMatchupGamesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamMatchup
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamMatchup {

  private Integer endYear;

  @Valid
  private List<@Valid TeamMatchupGamesInner> games;

  private Integer startYear;

  private String team1;

  private Integer team1Wins;

  private String team2;

  private Integer team2Wins;

  private Integer ties;

  public TeamMatchup endYear(Integer endYear) {
    this.endYear = endYear;
    return this;
  }

  /**
   * Get endYear
   * @return endYear
  */
  
  @Schema(name = "endYear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("endYear")
  public Integer getEndYear() {
    return endYear;
  }

  public void setEndYear(Integer endYear) {
    this.endYear = endYear;
  }

  public TeamMatchup games(List<@Valid TeamMatchupGamesInner> games) {
    this.games = games;
    return this;
  }

  public TeamMatchup addGamesItem(TeamMatchupGamesInner gamesItem) {
    if (this.games == null) {
      this.games = new ArrayList<>();
    }
    this.games.add(gamesItem);
    return this;
  }

  /**
   * Get games
   * @return games
  */
  @Valid 
  @Schema(name = "games", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("games")
  public List<@Valid TeamMatchupGamesInner> getGames() {
    return games;
  }

  public void setGames(List<@Valid TeamMatchupGamesInner> games) {
    this.games = games;
  }

  public TeamMatchup startYear(Integer startYear) {
    this.startYear = startYear;
    return this;
  }

  /**
   * Get startYear
   * @return startYear
  */
  
  @Schema(name = "startYear", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startYear")
  public Integer getStartYear() {
    return startYear;
  }

  public void setStartYear(Integer startYear) {
    this.startYear = startYear;
  }

  public TeamMatchup team1(String team1) {
    this.team1 = team1;
    return this;
  }

  /**
   * Get team1
   * @return team1
  */
  
  @Schema(name = "team1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team1")
  public String getTeam1() {
    return team1;
  }

  public void setTeam1(String team1) {
    this.team1 = team1;
  }

  public TeamMatchup team1Wins(Integer team1Wins) {
    this.team1Wins = team1Wins;
    return this;
  }

  /**
   * Get team1Wins
   * @return team1Wins
  */
  
  @Schema(name = "team1Wins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team1Wins")
  public Integer getTeam1Wins() {
    return team1Wins;
  }

  public void setTeam1Wins(Integer team1Wins) {
    this.team1Wins = team1Wins;
  }

  public TeamMatchup team2(String team2) {
    this.team2 = team2;
    return this;
  }

  /**
   * Get team2
   * @return team2
  */
  
  @Schema(name = "team2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team2")
  public String getTeam2() {
    return team2;
  }

  public void setTeam2(String team2) {
    this.team2 = team2;
  }

  public TeamMatchup team2Wins(Integer team2Wins) {
    this.team2Wins = team2Wins;
    return this;
  }

  /**
   * Get team2Wins
   * @return team2Wins
  */
  
  @Schema(name = "team2Wins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("team2Wins")
  public Integer getTeam2Wins() {
    return team2Wins;
  }

  public void setTeam2Wins(Integer team2Wins) {
    this.team2Wins = team2Wins;
  }

  public TeamMatchup ties(Integer ties) {
    this.ties = ties;
    return this;
  }

  /**
   * Get ties
   * @return ties
  */
  
  @Schema(name = "ties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ties")
  public Integer getTies() {
    return ties;
  }

  public void setTies(Integer ties) {
    this.ties = ties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMatchup teamMatchup = (TeamMatchup) o;
    return Objects.equals(this.endYear, teamMatchup.endYear) &&
        Objects.equals(this.games, teamMatchup.games) &&
        Objects.equals(this.startYear, teamMatchup.startYear) &&
        Objects.equals(this.team1, teamMatchup.team1) &&
        Objects.equals(this.team1Wins, teamMatchup.team1Wins) &&
        Objects.equals(this.team2, teamMatchup.team2) &&
        Objects.equals(this.team2Wins, teamMatchup.team2Wins) &&
        Objects.equals(this.ties, teamMatchup.ties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endYear, games, startYear, team1, team1Wins, team2, team2Wins, ties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMatchup {\n");
    sb.append("    endYear: ").append(toIndentedString(endYear)).append("\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    startYear: ").append(toIndentedString(startYear)).append("\n");
    sb.append("    team1: ").append(toIndentedString(team1)).append("\n");
    sb.append("    team1Wins: ").append(toIndentedString(team1Wins)).append("\n");
    sb.append("    team2: ").append(toIndentedString(team2)).append("\n");
    sb.append("    team2Wins: ").append(toIndentedString(team2Wins)).append("\n");
    sb.append("    ties: ").append(toIndentedString(ties)).append("\n");
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

