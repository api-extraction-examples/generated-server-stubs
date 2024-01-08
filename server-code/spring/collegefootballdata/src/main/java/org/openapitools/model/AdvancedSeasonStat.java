package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AdvancedSeasonStatDefense;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdvancedSeasonStat
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class AdvancedSeasonStat {

  private String conference;

  private AdvancedSeasonStatDefense defense;

  private AdvancedSeasonStatDefense offense;

  private Integer season;

  private String team;

  public AdvancedSeasonStat conference(String conference) {
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

  public AdvancedSeasonStat defense(AdvancedSeasonStatDefense defense) {
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
  public AdvancedSeasonStatDefense getDefense() {
    return defense;
  }

  public void setDefense(AdvancedSeasonStatDefense defense) {
    this.defense = defense;
  }

  public AdvancedSeasonStat offense(AdvancedSeasonStatDefense offense) {
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
  public AdvancedSeasonStatDefense getOffense() {
    return offense;
  }

  public void setOffense(AdvancedSeasonStatDefense offense) {
    this.offense = offense;
  }

  public AdvancedSeasonStat season(Integer season) {
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

  public AdvancedSeasonStat team(String team) {
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
    AdvancedSeasonStat advancedSeasonStat = (AdvancedSeasonStat) o;
    return Objects.equals(this.conference, advancedSeasonStat.conference) &&
        Objects.equals(this.defense, advancedSeasonStat.defense) &&
        Objects.equals(this.offense, advancedSeasonStat.offense) &&
        Objects.equals(this.season, advancedSeasonStat.season) &&
        Objects.equals(this.team, advancedSeasonStat.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, defense, offense, season, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedSeasonStat {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    offense: ").append(toIndentedString(offense)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
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

