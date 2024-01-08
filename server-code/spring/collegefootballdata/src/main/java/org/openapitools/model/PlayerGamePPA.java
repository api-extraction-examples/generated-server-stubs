package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PlayerGamePPAAveragePPA;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayerGamePPA
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerGamePPA {

  private PlayerGamePPAAveragePPA averagePPA;

  private String name;

  private String opponent;

  private String position;

  private Integer season;

  private String team;

  private Integer week;

  public PlayerGamePPA averagePPA(PlayerGamePPAAveragePPA averagePPA) {
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
  public PlayerGamePPAAveragePPA getAveragePPA() {
    return averagePPA;
  }

  public void setAveragePPA(PlayerGamePPAAveragePPA averagePPA) {
    this.averagePPA = averagePPA;
  }

  public PlayerGamePPA name(String name) {
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

  public PlayerGamePPA opponent(String opponent) {
    this.opponent = opponent;
    return this;
  }

  /**
   * Get opponent
   * @return opponent
  */
  
  @Schema(name = "opponent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opponent")
  public String getOpponent() {
    return opponent;
  }

  public void setOpponent(String opponent) {
    this.opponent = opponent;
  }

  public PlayerGamePPA position(String position) {
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

  public PlayerGamePPA season(Integer season) {
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

  public PlayerGamePPA team(String team) {
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

  public PlayerGamePPA week(Integer week) {
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
    PlayerGamePPA playerGamePPA = (PlayerGamePPA) o;
    return Objects.equals(this.averagePPA, playerGamePPA.averagePPA) &&
        Objects.equals(this.name, playerGamePPA.name) &&
        Objects.equals(this.opponent, playerGamePPA.opponent) &&
        Objects.equals(this.position, playerGamePPA.position) &&
        Objects.equals(this.season, playerGamePPA.season) &&
        Objects.equals(this.team, playerGamePPA.team) &&
        Objects.equals(this.week, playerGamePPA.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averagePPA, name, opponent, position, season, team, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerGamePPA {\n");
    sb.append("    averagePPA: ").append(toIndentedString(averagePPA)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    opponent: ").append(toIndentedString(opponent)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

