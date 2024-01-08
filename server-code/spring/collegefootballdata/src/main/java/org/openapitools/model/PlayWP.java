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
 * PlayWP
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayWP {

  private String away;

  private Integer awayId;

  private Integer awayScore;

  private Integer distance;

  private Integer down;

  private Integer gamesId;

  private String home;

  private Boolean homeBall;

  private Integer homeId;

  private Integer homeScore;

  private BigDecimal homeWinProb;

  private Integer playId;

  private Integer playNumber;

  private String playText;

  private BigDecimal spread;

  private Integer timeRemaining;

  private Integer yardLine;

  public PlayWP away(String away) {
    this.away = away;
    return this;
  }

  /**
   * Get away
   * @return away
  */
  
  @Schema(name = "away", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away")
  public String getAway() {
    return away;
  }

  public void setAway(String away) {
    this.away = away;
  }

  public PlayWP awayId(Integer awayId) {
    this.awayId = awayId;
    return this;
  }

  /**
   * Get awayId
   * @return awayId
  */
  
  @Schema(name = "awayId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayId")
  public Integer getAwayId() {
    return awayId;
  }

  public void setAwayId(Integer awayId) {
    this.awayId = awayId;
  }

  public PlayWP awayScore(Integer awayScore) {
    this.awayScore = awayScore;
    return this;
  }

  /**
   * Get awayScore
   * @return awayScore
  */
  
  @Schema(name = "awayScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayScore")
  public Integer getAwayScore() {
    return awayScore;
  }

  public void setAwayScore(Integer awayScore) {
    this.awayScore = awayScore;
  }

  public PlayWP distance(Integer distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  */
  
  @Schema(name = "distance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("distance")
  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public PlayWP down(Integer down) {
    this.down = down;
    return this;
  }

  /**
   * Get down
   * @return down
  */
  
  @Schema(name = "down", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("down")
  public Integer getDown() {
    return down;
  }

  public void setDown(Integer down) {
    this.down = down;
  }

  public PlayWP gamesId(Integer gamesId) {
    this.gamesId = gamesId;
    return this;
  }

  /**
   * Get gamesId
   * @return gamesId
  */
  
  @Schema(name = "gamesId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gamesId")
  public Integer getGamesId() {
    return gamesId;
  }

  public void setGamesId(Integer gamesId) {
    this.gamesId = gamesId;
  }

  public PlayWP home(String home) {
    this.home = home;
    return this;
  }

  /**
   * Get home
   * @return home
  */
  
  @Schema(name = "home", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home")
  public String getHome() {
    return home;
  }

  public void setHome(String home) {
    this.home = home;
  }

  public PlayWP homeBall(Boolean homeBall) {
    this.homeBall = homeBall;
    return this;
  }

  /**
   * Get homeBall
   * @return homeBall
  */
  
  @Schema(name = "homeBall", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeBall")
  public Boolean getHomeBall() {
    return homeBall;
  }

  public void setHomeBall(Boolean homeBall) {
    this.homeBall = homeBall;
  }

  public PlayWP homeId(Integer homeId) {
    this.homeId = homeId;
    return this;
  }

  /**
   * Get homeId
   * @return homeId
  */
  
  @Schema(name = "homeId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeId")
  public Integer getHomeId() {
    return homeId;
  }

  public void setHomeId(Integer homeId) {
    this.homeId = homeId;
  }

  public PlayWP homeScore(Integer homeScore) {
    this.homeScore = homeScore;
    return this;
  }

  /**
   * Get homeScore
   * @return homeScore
  */
  
  @Schema(name = "homeScore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeScore")
  public Integer getHomeScore() {
    return homeScore;
  }

  public void setHomeScore(Integer homeScore) {
    this.homeScore = homeScore;
  }

  public PlayWP homeWinProb(BigDecimal homeWinProb) {
    this.homeWinProb = homeWinProb;
    return this;
  }

  /**
   * Get homeWinProb
   * @return homeWinProb
  */
  @Valid 
  @Schema(name = "homeWinProb", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeWinProb")
  public BigDecimal getHomeWinProb() {
    return homeWinProb;
  }

  public void setHomeWinProb(BigDecimal homeWinProb) {
    this.homeWinProb = homeWinProb;
  }

  public PlayWP playId(Integer playId) {
    this.playId = playId;
    return this;
  }

  /**
   * Get playId
   * @return playId
  */
  
  @Schema(name = "playId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playId")
  public Integer getPlayId() {
    return playId;
  }

  public void setPlayId(Integer playId) {
    this.playId = playId;
  }

  public PlayWP playNumber(Integer playNumber) {
    this.playNumber = playNumber;
    return this;
  }

  /**
   * Get playNumber
   * @return playNumber
  */
  
  @Schema(name = "playNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playNumber")
  public Integer getPlayNumber() {
    return playNumber;
  }

  public void setPlayNumber(Integer playNumber) {
    this.playNumber = playNumber;
  }

  public PlayWP playText(String playText) {
    this.playText = playText;
    return this;
  }

  /**
   * Get playText
   * @return playText
  */
  
  @Schema(name = "playText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("playText")
  public String getPlayText() {
    return playText;
  }

  public void setPlayText(String playText) {
    this.playText = playText;
  }

  public PlayWP spread(BigDecimal spread) {
    this.spread = spread;
    return this;
  }

  /**
   * Get spread
   * @return spread
  */
  @Valid 
  @Schema(name = "spread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spread")
  public BigDecimal getSpread() {
    return spread;
  }

  public void setSpread(BigDecimal spread) {
    this.spread = spread;
  }

  public PlayWP timeRemaining(Integer timeRemaining) {
    this.timeRemaining = timeRemaining;
    return this;
  }

  /**
   * Get timeRemaining
   * @return timeRemaining
  */
  
  @Schema(name = "timeRemaining", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeRemaining")
  public Integer getTimeRemaining() {
    return timeRemaining;
  }

  public void setTimeRemaining(Integer timeRemaining) {
    this.timeRemaining = timeRemaining;
  }

  public PlayWP yardLine(Integer yardLine) {
    this.yardLine = yardLine;
    return this;
  }

  /**
   * Get yardLine
   * @return yardLine
  */
  
  @Schema(name = "yardLine", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("yardLine")
  public Integer getYardLine() {
    return yardLine;
  }

  public void setYardLine(Integer yardLine) {
    this.yardLine = yardLine;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayWP playWP = (PlayWP) o;
    return Objects.equals(this.away, playWP.away) &&
        Objects.equals(this.awayId, playWP.awayId) &&
        Objects.equals(this.awayScore, playWP.awayScore) &&
        Objects.equals(this.distance, playWP.distance) &&
        Objects.equals(this.down, playWP.down) &&
        Objects.equals(this.gamesId, playWP.gamesId) &&
        Objects.equals(this.home, playWP.home) &&
        Objects.equals(this.homeBall, playWP.homeBall) &&
        Objects.equals(this.homeId, playWP.homeId) &&
        Objects.equals(this.homeScore, playWP.homeScore) &&
        Objects.equals(this.homeWinProb, playWP.homeWinProb) &&
        Objects.equals(this.playId, playWP.playId) &&
        Objects.equals(this.playNumber, playWP.playNumber) &&
        Objects.equals(this.playText, playWP.playText) &&
        Objects.equals(this.spread, playWP.spread) &&
        Objects.equals(this.timeRemaining, playWP.timeRemaining) &&
        Objects.equals(this.yardLine, playWP.yardLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(away, awayId, awayScore, distance, down, gamesId, home, homeBall, homeId, homeScore, homeWinProb, playId, playNumber, playText, spread, timeRemaining, yardLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayWP {\n");
    sb.append("    away: ").append(toIndentedString(away)).append("\n");
    sb.append("    awayId: ").append(toIndentedString(awayId)).append("\n");
    sb.append("    awayScore: ").append(toIndentedString(awayScore)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    down: ").append(toIndentedString(down)).append("\n");
    sb.append("    gamesId: ").append(toIndentedString(gamesId)).append("\n");
    sb.append("    home: ").append(toIndentedString(home)).append("\n");
    sb.append("    homeBall: ").append(toIndentedString(homeBall)).append("\n");
    sb.append("    homeId: ").append(toIndentedString(homeId)).append("\n");
    sb.append("    homeScore: ").append(toIndentedString(homeScore)).append("\n");
    sb.append("    homeWinProb: ").append(toIndentedString(homeWinProb)).append("\n");
    sb.append("    playId: ").append(toIndentedString(playId)).append("\n");
    sb.append("    playNumber: ").append(toIndentedString(playNumber)).append("\n");
    sb.append("    playText: ").append(toIndentedString(playText)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
    sb.append("    timeRemaining: ").append(toIndentedString(timeRemaining)).append("\n");
    sb.append("    yardLine: ").append(toIndentedString(yardLine)).append("\n");
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

