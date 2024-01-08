package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GameLinesLinesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GameLines
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class GameLines {

  private String awayConference;

  private Integer awayScore;

  private String awayTeam;

  private String homeConference;

  private Integer homeScore;

  private String homeTeam;

  private Integer id;

  @Valid
  private List<@Valid GameLinesLinesInner> lines;

  private Integer season;

  private String seasonType;

  private String startDate;

  private Integer week;

  public GameLines awayConference(String awayConference) {
    this.awayConference = awayConference;
    return this;
  }

  /**
   * Get awayConference
   * @return awayConference
  */
  
  @Schema(name = "awayConference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayConference")
  public String getAwayConference() {
    return awayConference;
  }

  public void setAwayConference(String awayConference) {
    this.awayConference = awayConference;
  }

  public GameLines awayScore(Integer awayScore) {
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

  public GameLines awayTeam(String awayTeam) {
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

  public GameLines homeConference(String homeConference) {
    this.homeConference = homeConference;
    return this;
  }

  /**
   * Get homeConference
   * @return homeConference
  */
  
  @Schema(name = "homeConference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeConference")
  public String getHomeConference() {
    return homeConference;
  }

  public void setHomeConference(String homeConference) {
    this.homeConference = homeConference;
  }

  public GameLines homeScore(Integer homeScore) {
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

  public GameLines homeTeam(String homeTeam) {
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

  public GameLines id(Integer id) {
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

  public GameLines lines(List<@Valid GameLinesLinesInner> lines) {
    this.lines = lines;
    return this;
  }

  public GameLines addLinesItem(GameLinesLinesInner linesItem) {
    if (this.lines == null) {
      this.lines = new ArrayList<>();
    }
    this.lines.add(linesItem);
    return this;
  }

  /**
   * Get lines
   * @return lines
  */
  @Valid 
  @Schema(name = "lines", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lines")
  public List<@Valid GameLinesLinesInner> getLines() {
    return lines;
  }

  public void setLines(List<@Valid GameLinesLinesInner> lines) {
    this.lines = lines;
  }

  public GameLines season(Integer season) {
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

  public GameLines seasonType(String seasonType) {
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

  public GameLines startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public GameLines week(Integer week) {
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
    GameLines gameLines = (GameLines) o;
    return Objects.equals(this.awayConference, gameLines.awayConference) &&
        Objects.equals(this.awayScore, gameLines.awayScore) &&
        Objects.equals(this.awayTeam, gameLines.awayTeam) &&
        Objects.equals(this.homeConference, gameLines.homeConference) &&
        Objects.equals(this.homeScore, gameLines.homeScore) &&
        Objects.equals(this.homeTeam, gameLines.homeTeam) &&
        Objects.equals(this.id, gameLines.id) &&
        Objects.equals(this.lines, gameLines.lines) &&
        Objects.equals(this.season, gameLines.season) &&
        Objects.equals(this.seasonType, gameLines.seasonType) &&
        Objects.equals(this.startDate, gameLines.startDate) &&
        Objects.equals(this.week, gameLines.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayConference, awayScore, awayTeam, homeConference, homeScore, homeTeam, id, lines, season, seasonType, startDate, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameLines {\n");
    sb.append("    awayConference: ").append(toIndentedString(awayConference)).append("\n");
    sb.append("    awayScore: ").append(toIndentedString(awayScore)).append("\n");
    sb.append("    awayTeam: ").append(toIndentedString(awayTeam)).append("\n");
    sb.append("    homeConference: ").append(toIndentedString(homeConference)).append("\n");
    sb.append("    homeScore: ").append(toIndentedString(homeScore)).append("\n");
    sb.append("    homeTeam: ").append(toIndentedString(homeTeam)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lines: ").append(toIndentedString(lines)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonType: ").append(toIndentedString(seasonType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

