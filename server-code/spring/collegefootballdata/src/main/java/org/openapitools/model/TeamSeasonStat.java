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
 * TeamSeasonStat
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamSeasonStat {

  private String conference;

  private Integer season;

  private String statName;

  private Integer statValue;

  private String team;

  public TeamSeasonStat conference(String conference) {
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

  public TeamSeasonStat season(Integer season) {
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

  public TeamSeasonStat statName(String statName) {
    this.statName = statName;
    return this;
  }

  /**
   * Get statName
   * @return statName
  */
  
  @Schema(name = "statName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statName")
  public String getStatName() {
    return statName;
  }

  public void setStatName(String statName) {
    this.statName = statName;
  }

  public TeamSeasonStat statValue(Integer statValue) {
    this.statValue = statValue;
    return this;
  }

  /**
   * Get statValue
   * @return statValue
  */
  
  @Schema(name = "statValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statValue")
  public Integer getStatValue() {
    return statValue;
  }

  public void setStatValue(Integer statValue) {
    this.statValue = statValue;
  }

  public TeamSeasonStat team(String team) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSeasonStat teamSeasonStat = (TeamSeasonStat) o;
    return Objects.equals(this.conference, teamSeasonStat.conference) &&
        Objects.equals(this.season, teamSeasonStat.season) &&
        Objects.equals(this.statName, teamSeasonStat.statName) &&
        Objects.equals(this.statValue, teamSeasonStat.statValue) &&
        Objects.equals(this.team, teamSeasonStat.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, season, statName, statValue, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSeasonStat {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    statName: ").append(toIndentedString(statName)).append("\n");
    sb.append("    statValue: ").append(toIndentedString(statValue)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

