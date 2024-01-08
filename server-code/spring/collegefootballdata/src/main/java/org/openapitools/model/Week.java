package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Week
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Week {

  private String firstGameStart;

  private String lastGameStart;

  private Integer season;

  private String seasonType;

  private Integer week;

  public Week firstGameStart(String firstGameStart) {
    this.firstGameStart = firstGameStart;
    return this;
  }

  /**
   * Get firstGameStart
   * @return firstGameStart
  */
  
  @Schema(name = "firstGameStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstGameStart")
  public String getFirstGameStart() {
    return firstGameStart;
  }

  public void setFirstGameStart(String firstGameStart) {
    this.firstGameStart = firstGameStart;
  }

  public Week lastGameStart(String lastGameStart) {
    this.lastGameStart = lastGameStart;
    return this;
  }

  /**
   * Get lastGameStart
   * @return lastGameStart
  */
  
  @Schema(name = "lastGameStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastGameStart")
  public String getLastGameStart() {
    return lastGameStart;
  }

  public void setLastGameStart(String lastGameStart) {
    this.lastGameStart = lastGameStart;
  }

  public Week season(Integer season) {
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

  public Week seasonType(String seasonType) {
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

  public Week week(Integer week) {
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
    Week week = (Week) o;
    return Objects.equals(this.firstGameStart, week.firstGameStart) &&
        Objects.equals(this.lastGameStart, week.lastGameStart) &&
        Objects.equals(this.season, week.season) &&
        Objects.equals(this.seasonType, week.seasonType) &&
        Objects.equals(this.week, week.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstGameStart, lastGameStart, season, seasonType, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Week {\n");
    sb.append("    firstGameStart: ").append(toIndentedString(firstGameStart)).append("\n");
    sb.append("    lastGameStart: ").append(toIndentedString(lastGameStart)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonType: ").append(toIndentedString(seasonType)).append("\n");
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

