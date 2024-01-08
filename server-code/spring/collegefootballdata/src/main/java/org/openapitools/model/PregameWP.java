package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PregameWP
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PregameWP {

  private String awayTeam;

  private Integer gameId;

  private String homeTeam;

  private BigDecimal homeWinProb;

  private Integer season;

  private String seasonType;

  private BigDecimal spread;

  private Integer week;

  public PregameWP awayTeam(String awayTeam) {
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

  public PregameWP gameId(Integer gameId) {
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

  public PregameWP homeTeam(String homeTeam) {
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

  public PregameWP homeWinProb(BigDecimal homeWinProb) {
    this.homeWinProb = homeWinProb;
    return this;
  }

  /**
   * Get homeWinProb
   * @return homeWinProb
  */
  @Valid 
  @Schema(name = "homeWinProb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeWinProb")
  public BigDecimal getHomeWinProb() {
    return homeWinProb;
  }

  public void setHomeWinProb(BigDecimal homeWinProb) {
    this.homeWinProb = homeWinProb;
  }

  public PregameWP season(Integer season) {
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

  public PregameWP seasonType(String seasonType) {
    this.seasonType = seasonType;
    return this;
  }

  /**
   * Get seasonType
   * @return seasonType
  */
  
  @Schema(name = "seasonType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seasonType")
  public String getSeasonType() {
    return seasonType;
  }

  public void setSeasonType(String seasonType) {
    this.seasonType = seasonType;
  }

  public PregameWP spread(BigDecimal spread) {
    this.spread = spread;
    return this;
  }

  /**
   * Get spread
   * @return spread
  */
  @Valid 
  @Schema(name = "spread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spread")
  public BigDecimal getSpread() {
    return spread;
  }

  public void setSpread(BigDecimal spread) {
    this.spread = spread;
  }

  public PregameWP week(Integer week) {
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
    PregameWP pregameWP = (PregameWP) o;
    return Objects.equals(this.awayTeam, pregameWP.awayTeam) &&
        Objects.equals(this.gameId, pregameWP.gameId) &&
        Objects.equals(this.homeTeam, pregameWP.homeTeam) &&
        Objects.equals(this.homeWinProb, pregameWP.homeWinProb) &&
        Objects.equals(this.season, pregameWP.season) &&
        Objects.equals(this.seasonType, pregameWP.seasonType) &&
        Objects.equals(this.spread, pregameWP.spread) &&
        Objects.equals(this.week, pregameWP.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayTeam, gameId, homeTeam, homeWinProb, season, seasonType, spread, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PregameWP {\n");
    sb.append("    awayTeam: ").append(toIndentedString(awayTeam)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    homeTeam: ").append(toIndentedString(homeTeam)).append("\n");
    sb.append("    homeWinProb: ").append(toIndentedString(homeWinProb)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonType: ").append(toIndentedString(seasonType)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
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

