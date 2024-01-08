package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamRecordAwayGames
 */

@JsonTypeName("TeamRecord_awayGames")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamRecordAwayGames {

  private Integer games;

  private Integer losses;

  private Integer ties;

  private Integer wins;

  public TeamRecordAwayGames games(Integer games) {
    this.games = games;
    return this;
  }

  /**
   * Get games
   * @return games
  */
  
  @Schema(name = "games", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("games")
  public Integer getGames() {
    return games;
  }

  public void setGames(Integer games) {
    this.games = games;
  }

  public TeamRecordAwayGames losses(Integer losses) {
    this.losses = losses;
    return this;
  }

  /**
   * Get losses
   * @return losses
  */
  
  @Schema(name = "losses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("losses")
  public Integer getLosses() {
    return losses;
  }

  public void setLosses(Integer losses) {
    this.losses = losses;
  }

  public TeamRecordAwayGames ties(Integer ties) {
    this.ties = ties;
    return this;
  }

  /**
   * Get ties
   * @return ties
  */
  
  @Schema(name = "ties", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ties")
  public Integer getTies() {
    return ties;
  }

  public void setTies(Integer ties) {
    this.ties = ties;
  }

  public TeamRecordAwayGames wins(Integer wins) {
    this.wins = wins;
    return this;
  }

  /**
   * Get wins
   * @return wins
  */
  
  @Schema(name = "wins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wins")
  public Integer getWins() {
    return wins;
  }

  public void setWins(Integer wins) {
    this.wins = wins;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamRecordAwayGames teamRecordAwayGames = (TeamRecordAwayGames) o;
    return Objects.equals(this.games, teamRecordAwayGames.games) &&
        Objects.equals(this.losses, teamRecordAwayGames.losses) &&
        Objects.equals(this.ties, teamRecordAwayGames.ties) &&
        Objects.equals(this.wins, teamRecordAwayGames.wins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(games, losses, ties, wins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRecordAwayGames {\n");
    sb.append("    games: ").append(toIndentedString(games)).append("\n");
    sb.append("    losses: ").append(toIndentedString(losses)).append("\n");
    sb.append("    ties: ").append(toIndentedString(ties)).append("\n");
    sb.append("    wins: ").append(toIndentedString(wins)).append("\n");
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

