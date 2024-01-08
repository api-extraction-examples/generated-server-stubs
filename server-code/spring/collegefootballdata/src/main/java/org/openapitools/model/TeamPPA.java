package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.TeamPPADefense;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamPPA
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamPPA {

  private String conference;

  private TeamPPADefense defense;

  private TeamPPADefense offense;

  private Integer season;

  private String team;

  public TeamPPA conference(String conference) {
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

  public TeamPPA defense(TeamPPADefense defense) {
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
  public TeamPPADefense getDefense() {
    return defense;
  }

  public void setDefense(TeamPPADefense defense) {
    this.defense = defense;
  }

  public TeamPPA offense(TeamPPADefense offense) {
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
  public TeamPPADefense getOffense() {
    return offense;
  }

  public void setOffense(TeamPPADefense offense) {
    this.offense = offense;
  }

  public TeamPPA season(Integer season) {
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

  public TeamPPA team(String team) {
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
    TeamPPA teamPPA = (TeamPPA) o;
    return Objects.equals(this.conference, teamPPA.conference) &&
        Objects.equals(this.defense, teamPPA.defense) &&
        Objects.equals(this.offense, teamPPA.offense) &&
        Objects.equals(this.season, teamPPA.season) &&
        Objects.equals(this.team, teamPPA.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, defense, offense, season, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamPPA {\n");
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

