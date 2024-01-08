package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.BoxScorePlayers;
import org.openapitools.model.BoxScoreTeams;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoxScore
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScore {

  private BoxScorePlayers players;

  private BoxScoreTeams teams;

  public BoxScore players(BoxScorePlayers players) {
    this.players = players;
    return this;
  }

  /**
   * Get players
   * @return players
  */
  @Valid 
  @Schema(name = "players", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("players")
  public BoxScorePlayers getPlayers() {
    return players;
  }

  public void setPlayers(BoxScorePlayers players) {
    this.players = players;
  }

  public BoxScore teams(BoxScoreTeams teams) {
    this.teams = teams;
    return this;
  }

  /**
   * Get teams
   * @return teams
  */
  @Valid 
  @Schema(name = "teams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("teams")
  public BoxScoreTeams getTeams() {
    return teams;
  }

  public void setTeams(BoxScoreTeams teams) {
    this.teams = teams;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxScore boxScore = (BoxScore) o;
    return Objects.equals(this.players, boxScore.players) &&
        Objects.equals(this.teams, boxScore.teams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(players, teams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScore {\n");
    sb.append("    players: ").append(toIndentedString(players)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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

