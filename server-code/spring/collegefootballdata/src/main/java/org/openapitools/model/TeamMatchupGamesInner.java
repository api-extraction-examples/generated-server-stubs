package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamMatchupGamesInner
 */

@JsonTypeName("TeamMatchup_games_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamMatchupGamesInner {

  private Integer awayScore;

  private String awayTeam;

  private String date;

  private Integer homeScore;

  private String homeTeam;

  private Boolean neutralSite;

  private Integer season;

  private String seasonType;

  private String venue;

  private Integer week;

  private String winner;

  public TeamMatchupGamesInner awayScore(Integer awayScore) {
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

  public TeamMatchupGamesInner awayTeam(String awayTeam) {
    this.awayTeam = awayTeam;
    return this;
  }

  /**
   * Get awayTeam
   * @return awayTeam
  */
  
  @Schema(name = "awayTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayTeam")
  public String getAwayTeam() {
    return awayTeam;
  }

  public void setAwayTeam(String awayTeam) {
    this.awayTeam = awayTeam;
  }

  public TeamMatchupGamesInner date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  */
  
  @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public TeamMatchupGamesInner homeScore(Integer homeScore) {
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

  public TeamMatchupGamesInner homeTeam(String homeTeam) {
    this.homeTeam = homeTeam;
    return this;
  }

  /**
   * Get homeTeam
   * @return homeTeam
  */
  
  @Schema(name = "homeTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeTeam")
  public String getHomeTeam() {
    return homeTeam;
  }

  public void setHomeTeam(String homeTeam) {
    this.homeTeam = homeTeam;
  }

  public TeamMatchupGamesInner neutralSite(Boolean neutralSite) {
    this.neutralSite = neutralSite;
    return this;
  }

  /**
   * Get neutralSite
   * @return neutralSite
  */
  
  @Schema(name = "neutralSite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("neutralSite")
  public Boolean getNeutralSite() {
    return neutralSite;
  }

  public void setNeutralSite(Boolean neutralSite) {
    this.neutralSite = neutralSite;
  }

  public TeamMatchupGamesInner season(Integer season) {
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

  public TeamMatchupGamesInner seasonType(String seasonType) {
    this.seasonType = seasonType;
    return this;
  }

  /**
   * Get seasonType
   * @return seasonType
  */
  
  @Schema(name = "season_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("season_type")
  public String getSeasonType() {
    return seasonType;
  }

  public void setSeasonType(String seasonType) {
    this.seasonType = seasonType;
  }

  public TeamMatchupGamesInner venue(String venue) {
    this.venue = venue;
    return this;
  }

  /**
   * Get venue
   * @return venue
  */
  
  @Schema(name = "venue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("venue")
  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public TeamMatchupGamesInner week(Integer week) {
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

  public TeamMatchupGamesInner winner(String winner) {
    this.winner = winner;
    return this;
  }

  /**
   * Get winner
   * @return winner
  */
  
  @Schema(name = "winner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("winner")
  public String getWinner() {
    return winner;
  }

  public void setWinner(String winner) {
    this.winner = winner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMatchupGamesInner teamMatchupGamesInner = (TeamMatchupGamesInner) o;
    return Objects.equals(this.awayScore, teamMatchupGamesInner.awayScore) &&
        Objects.equals(this.awayTeam, teamMatchupGamesInner.awayTeam) &&
        Objects.equals(this.date, teamMatchupGamesInner.date) &&
        Objects.equals(this.homeScore, teamMatchupGamesInner.homeScore) &&
        Objects.equals(this.homeTeam, teamMatchupGamesInner.homeTeam) &&
        Objects.equals(this.neutralSite, teamMatchupGamesInner.neutralSite) &&
        Objects.equals(this.season, teamMatchupGamesInner.season) &&
        Objects.equals(this.seasonType, teamMatchupGamesInner.seasonType) &&
        Objects.equals(this.venue, teamMatchupGamesInner.venue) &&
        Objects.equals(this.week, teamMatchupGamesInner.week) &&
        Objects.equals(this.winner, teamMatchupGamesInner.winner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayScore, awayTeam, date, homeScore, homeTeam, neutralSite, season, seasonType, venue, week, winner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMatchupGamesInner {\n");
    sb.append("    awayScore: ").append(toIndentedString(awayScore)).append("\n");
    sb.append("    awayTeam: ").append(toIndentedString(awayTeam)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    homeScore: ").append(toIndentedString(homeScore)).append("\n");
    sb.append("    homeTeam: ").append(toIndentedString(homeTeam)).append("\n");
    sb.append("    neutralSite: ").append(toIndentedString(neutralSite)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonType: ").append(toIndentedString(seasonType)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
    sb.append("    winner: ").append(toIndentedString(winner)).append("\n");
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

