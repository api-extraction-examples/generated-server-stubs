package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlayerSeasonStat
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerSeasonStat {

  private String category;

  private String conference;

  private String player;

  private Integer playerId;

  private Integer season;

  private BigDecimal stat;

  private String statType;

  private String team;

  public PlayerSeasonStat category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Get category
   * @return category
  */
  
  @Schema(name = "category", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public PlayerSeasonStat conference(String conference) {
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

  public PlayerSeasonStat player(String player) {
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

  public PlayerSeasonStat playerId(Integer playerId) {
    this.playerId = playerId;
    return this;
  }

  /**
   * Get playerId
   * @return playerId
  */
  
  @Schema(name = "playerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playerId")
  public Integer getPlayerId() {
    return playerId;
  }

  public void setPlayerId(Integer playerId) {
    this.playerId = playerId;
  }

  public PlayerSeasonStat season(Integer season) {
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

  public PlayerSeasonStat stat(BigDecimal stat) {
    this.stat = stat;
    return this;
  }

  /**
   * Get stat
   * @return stat
  */
  @Valid 
  @Schema(name = "stat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stat")
  public BigDecimal getStat() {
    return stat;
  }

  public void setStat(BigDecimal stat) {
    this.stat = stat;
  }

  public PlayerSeasonStat statType(String statType) {
    this.statType = statType;
    return this;
  }

  /**
   * Get statType
   * @return statType
  */
  
  @Schema(name = "statType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statType")
  public String getStatType() {
    return statType;
  }

  public void setStatType(String statType) {
    this.statType = statType;
  }

  public PlayerSeasonStat team(String team) {
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
    PlayerSeasonStat playerSeasonStat = (PlayerSeasonStat) o;
    return Objects.equals(this.category, playerSeasonStat.category) &&
        Objects.equals(this.conference, playerSeasonStat.conference) &&
        Objects.equals(this.player, playerSeasonStat.player) &&
        Objects.equals(this.playerId, playerSeasonStat.playerId) &&
        Objects.equals(this.season, playerSeasonStat.season) &&
        Objects.equals(this.stat, playerSeasonStat.stat) &&
        Objects.equals(this.statType, playerSeasonStat.statType) &&
        Objects.equals(this.team, playerSeasonStat.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, conference, player, playerId, season, stat, statType, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerSeasonStat {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    playerId: ").append(toIndentedString(playerId)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    stat: ").append(toIndentedString(stat)).append("\n");
    sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
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

