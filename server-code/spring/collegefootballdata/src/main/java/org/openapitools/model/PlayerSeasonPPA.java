package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PlayerSeasonPPAAveragePPA;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayerSeasonPPA
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerSeasonPPA {

  private PlayerSeasonPPAAveragePPA averagePPA;

  private String conference;

  private Integer id;

  private String name;

  private String position;

  private Integer season;

  private String team;

  private PlayerSeasonPPAAveragePPA totalPPA;

  public PlayerSeasonPPA averagePPA(PlayerSeasonPPAAveragePPA averagePPA) {
    this.averagePPA = averagePPA;
    return this;
  }

  /**
   * Get averagePPA
   * @return averagePPA
  */
  @Valid 
  @Schema(name = "averagePPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averagePPA")
  public PlayerSeasonPPAAveragePPA getAveragePPA() {
    return averagePPA;
  }

  public void setAveragePPA(PlayerSeasonPPAAveragePPA averagePPA) {
    this.averagePPA = averagePPA;
  }

  public PlayerSeasonPPA conference(String conference) {
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

  public PlayerSeasonPPA id(Integer id) {
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

  public PlayerSeasonPPA name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlayerSeasonPPA position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  
  @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("position")
  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public PlayerSeasonPPA season(Integer season) {
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

  public PlayerSeasonPPA team(String team) {
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

  public PlayerSeasonPPA totalPPA(PlayerSeasonPPAAveragePPA totalPPA) {
    this.totalPPA = totalPPA;
    return this;
  }

  /**
   * Get totalPPA
   * @return totalPPA
  */
  @Valid 
  @Schema(name = "totalPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPPA")
  public PlayerSeasonPPAAveragePPA getTotalPPA() {
    return totalPPA;
  }

  public void setTotalPPA(PlayerSeasonPPAAveragePPA totalPPA) {
    this.totalPPA = totalPPA;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerSeasonPPA playerSeasonPPA = (PlayerSeasonPPA) o;
    return Objects.equals(this.averagePPA, playerSeasonPPA.averagePPA) &&
        Objects.equals(this.conference, playerSeasonPPA.conference) &&
        Objects.equals(this.id, playerSeasonPPA.id) &&
        Objects.equals(this.name, playerSeasonPPA.name) &&
        Objects.equals(this.position, playerSeasonPPA.position) &&
        Objects.equals(this.season, playerSeasonPPA.season) &&
        Objects.equals(this.team, playerSeasonPPA.team) &&
        Objects.equals(this.totalPPA, playerSeasonPPA.totalPPA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averagePPA, conference, id, name, position, season, team, totalPPA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerSeasonPPA {\n");
    sb.append("    averagePPA: ").append(toIndentedString(averagePPA)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    totalPPA: ").append(toIndentedString(totalPPA)).append("\n");
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

