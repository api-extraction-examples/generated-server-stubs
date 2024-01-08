package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BoxScorePlayersPpaInnerAverage;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoxScorePlayersPpaInner
 */

@JsonTypeName("BoxScore_players_ppa_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScorePlayersPpaInner {

  private BoxScorePlayersPpaInnerAverage average;

  private BoxScorePlayersPpaInnerAverage cumulative;

  private String player;

  private String position;

  private String team;

  public BoxScorePlayersPpaInner average(BoxScorePlayersPpaInnerAverage average) {
    this.average = average;
    return this;
  }

  /**
   * Get average
   * @return average
  */
  @Valid 
  @Schema(name = "average", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("average")
  public BoxScorePlayersPpaInnerAverage getAverage() {
    return average;
  }

  public void setAverage(BoxScorePlayersPpaInnerAverage average) {
    this.average = average;
  }

  public BoxScorePlayersPpaInner cumulative(BoxScorePlayersPpaInnerAverage cumulative) {
    this.cumulative = cumulative;
    return this;
  }

  /**
   * Get cumulative
   * @return cumulative
  */
  @Valid 
  @Schema(name = "cumulative", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cumulative")
  public BoxScorePlayersPpaInnerAverage getCumulative() {
    return cumulative;
  }

  public void setCumulative(BoxScorePlayersPpaInnerAverage cumulative) {
    this.cumulative = cumulative;
  }

  public BoxScorePlayersPpaInner player(String player) {
    this.player = player;
    return this;
  }

  /**
   * Get player
   * @return player
  */
  
  @Schema(name = "player", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("player")
  public String getPlayer() {
    return player;
  }

  public void setPlayer(String player) {
    this.player = player;
  }

  public BoxScorePlayersPpaInner position(String position) {
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

  public BoxScorePlayersPpaInner team(String team) {
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
    BoxScorePlayersPpaInner boxScorePlayersPpaInner = (BoxScorePlayersPpaInner) o;
    return Objects.equals(this.average, boxScorePlayersPpaInner.average) &&
        Objects.equals(this.cumulative, boxScorePlayersPpaInner.cumulative) &&
        Objects.equals(this.player, boxScorePlayersPpaInner.player) &&
        Objects.equals(this.position, boxScorePlayersPpaInner.position) &&
        Objects.equals(this.team, boxScorePlayersPpaInner.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(average, cumulative, player, position, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScorePlayersPpaInner {\n");
    sb.append("    average: ").append(toIndentedString(average)).append("\n");
    sb.append("    cumulative: ").append(toIndentedString(cumulative)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

