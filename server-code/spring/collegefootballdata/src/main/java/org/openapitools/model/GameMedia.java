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
 * GameMedia
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class GameMedia {

  private String awayConference;

  private String awayTeam;

  private String homeConference;

  private String homeTeam;

  private Integer id;

  private Boolean isStartTimeTBD;

  private String mediaType;

  private String outlet;

  private Integer season;

  private String seasonType;

  private String startTime;

  private Integer week;

  public GameMedia awayConference(String awayConference) {
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

  public GameMedia awayTeam(String awayTeam) {
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

  public GameMedia homeConference(String homeConference) {
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

  public GameMedia homeTeam(String homeTeam) {
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

  public GameMedia id(Integer id) {
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

  public GameMedia isStartTimeTBD(Boolean isStartTimeTBD) {
    this.isStartTimeTBD = isStartTimeTBD;
    return this;
  }

  /**
   * Get isStartTimeTBD
   * @return isStartTimeTBD
  */
  
  @Schema(name = "isStartTimeTBD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isStartTimeTBD")
  public Boolean getIsStartTimeTBD() {
    return isStartTimeTBD;
  }

  public void setIsStartTimeTBD(Boolean isStartTimeTBD) {
    this.isStartTimeTBD = isStartTimeTBD;
  }

  public GameMedia mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
  */
  
  @Schema(name = "mediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public GameMedia outlet(String outlet) {
    this.outlet = outlet;
    return this;
  }

  /**
   * Get outlet
   * @return outlet
  */
  
  @Schema(name = "outlet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outlet")
  public String getOutlet() {
    return outlet;
  }

  public void setOutlet(String outlet) {
    this.outlet = outlet;
  }

  public GameMedia season(Integer season) {
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

  public GameMedia seasonType(String seasonType) {
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

  public GameMedia startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
  */
  
  @Schema(name = "startTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTime")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public GameMedia week(Integer week) {
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
    GameMedia gameMedia = (GameMedia) o;
    return Objects.equals(this.awayConference, gameMedia.awayConference) &&
        Objects.equals(this.awayTeam, gameMedia.awayTeam) &&
        Objects.equals(this.homeConference, gameMedia.homeConference) &&
        Objects.equals(this.homeTeam, gameMedia.homeTeam) &&
        Objects.equals(this.id, gameMedia.id) &&
        Objects.equals(this.isStartTimeTBD, gameMedia.isStartTimeTBD) &&
        Objects.equals(this.mediaType, gameMedia.mediaType) &&
        Objects.equals(this.outlet, gameMedia.outlet) &&
        Objects.equals(this.season, gameMedia.season) &&
        Objects.equals(this.seasonType, gameMedia.seasonType) &&
        Objects.equals(this.startTime, gameMedia.startTime) &&
        Objects.equals(this.week, gameMedia.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayConference, awayTeam, homeConference, homeTeam, id, isStartTimeTBD, mediaType, outlet, season, seasonType, startTime, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameMedia {\n");
    sb.append("    awayConference: ").append(toIndentedString(awayConference)).append("\n");
    sb.append("    awayTeam: ").append(toIndentedString(awayTeam)).append("\n");
    sb.append("    homeConference: ").append(toIndentedString(homeConference)).append("\n");
    sb.append("    homeTeam: ").append(toIndentedString(homeTeam)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isStartTimeTBD: ").append(toIndentedString(isStartTimeTBD)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    outlet: ").append(toIndentedString(outlet)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonType: ").append(toIndentedString(seasonType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

