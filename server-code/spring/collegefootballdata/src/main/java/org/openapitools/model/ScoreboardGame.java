package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ScoreboardGameAwayTeam;
import org.openapitools.model.ScoreboardGameBetting;
import org.openapitools.model.ScoreboardGameVenue;
import org.openapitools.model.ScoreboardGameWeather;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ScoreboardGame
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class ScoreboardGame {

  private ScoreboardGameAwayTeam awayTeam;

  private ScoreboardGameBetting betting;

  private String clock;

  private Boolean conferenceGame;

  private ScoreboardGameAwayTeam homeTeam;

  private Integer id;

  private Boolean neutralSite;

  private Integer period;

  private String possession;

  private String situation;

  private String startDate;

  private Boolean startTimeTBD;

  private String status;

  private String tv;

  private ScoreboardGameVenue venue;

  private ScoreboardGameWeather weather;

  public ScoreboardGame awayTeam(ScoreboardGameAwayTeam awayTeam) {
    this.awayTeam = awayTeam;
    return this;
  }

  /**
   * Get awayTeam
   * @return awayTeam
  */
  @Valid 
  @Schema(name = "awayTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayTeam")
  public ScoreboardGameAwayTeam getAwayTeam() {
    return awayTeam;
  }

  public void setAwayTeam(ScoreboardGameAwayTeam awayTeam) {
    this.awayTeam = awayTeam;
  }

  public ScoreboardGame betting(ScoreboardGameBetting betting) {
    this.betting = betting;
    return this;
  }

  /**
   * Get betting
   * @return betting
  */
  @Valid 
  @Schema(name = "betting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("betting")
  public ScoreboardGameBetting getBetting() {
    return betting;
  }

  public void setBetting(ScoreboardGameBetting betting) {
    this.betting = betting;
  }

  public ScoreboardGame clock(String clock) {
    this.clock = clock;
    return this;
  }

  /**
   * Get clock
   * @return clock
  */
  
  @Schema(name = "clock", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clock")
  public String getClock() {
    return clock;
  }

  public void setClock(String clock) {
    this.clock = clock;
  }

  public ScoreboardGame conferenceGame(Boolean conferenceGame) {
    this.conferenceGame = conferenceGame;
    return this;
  }

  /**
   * Get conferenceGame
   * @return conferenceGame
  */
  
  @Schema(name = "conferenceGame", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conferenceGame")
  public Boolean getConferenceGame() {
    return conferenceGame;
  }

  public void setConferenceGame(Boolean conferenceGame) {
    this.conferenceGame = conferenceGame;
  }

  public ScoreboardGame homeTeam(ScoreboardGameAwayTeam homeTeam) {
    this.homeTeam = homeTeam;
    return this;
  }

  /**
   * Get homeTeam
   * @return homeTeam
  */
  @Valid 
  @Schema(name = "homeTeam", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeTeam")
  public ScoreboardGameAwayTeam getHomeTeam() {
    return homeTeam;
  }

  public void setHomeTeam(ScoreboardGameAwayTeam homeTeam) {
    this.homeTeam = homeTeam;
  }

  public ScoreboardGame id(Integer id) {
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

  public ScoreboardGame neutralSite(Boolean neutralSite) {
    this.neutralSite = neutralSite;
    return this;
  }

  /**
   * Get neutralSite
   * @return neutralSite
  */
  
  @Schema(name = "neutralSite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("neutralSite")
  public Boolean getNeutralSite() {
    return neutralSite;
  }

  public void setNeutralSite(Boolean neutralSite) {
    this.neutralSite = neutralSite;
  }

  public ScoreboardGame period(Integer period) {
    this.period = period;
    return this;
  }

  /**
   * Get period
   * @return period
  */
  
  @Schema(name = "period", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("period")
  public Integer getPeriod() {
    return period;
  }

  public void setPeriod(Integer period) {
    this.period = period;
  }

  public ScoreboardGame possession(String possession) {
    this.possession = possession;
    return this;
  }

  /**
   * Get possession
   * @return possession
  */
  
  @Schema(name = "possession", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("possession")
  public String getPossession() {
    return possession;
  }

  public void setPossession(String possession) {
    this.possession = possession;
  }

  public ScoreboardGame situation(String situation) {
    this.situation = situation;
    return this;
  }

  /**
   * Get situation
   * @return situation
  */
  
  @Schema(name = "situation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("situation")
  public String getSituation() {
    return situation;
  }

  public void setSituation(String situation) {
    this.situation = situation;
  }

  public ScoreboardGame startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "startDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startDate")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ScoreboardGame startTimeTBD(Boolean startTimeTBD) {
    this.startTimeTBD = startTimeTBD;
    return this;
  }

  /**
   * Get startTimeTBD
   * @return startTimeTBD
  */
  
  @Schema(name = "startTimeTBD", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("startTimeTBD")
  public Boolean getStartTimeTBD() {
    return startTimeTBD;
  }

  public void setStartTimeTBD(Boolean startTimeTBD) {
    this.startTimeTBD = startTimeTBD;
  }

  public ScoreboardGame status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ScoreboardGame tv(String tv) {
    this.tv = tv;
    return this;
  }

  /**
   * Get tv
   * @return tv
  */
  
  @Schema(name = "tv", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tv")
  public String getTv() {
    return tv;
  }

  public void setTv(String tv) {
    this.tv = tv;
  }

  public ScoreboardGame venue(ScoreboardGameVenue venue) {
    this.venue = venue;
    return this;
  }

  /**
   * Get venue
   * @return venue
  */
  @Valid 
  @Schema(name = "venue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("venue")
  public ScoreboardGameVenue getVenue() {
    return venue;
  }

  public void setVenue(ScoreboardGameVenue venue) {
    this.venue = venue;
  }

  public ScoreboardGame weather(ScoreboardGameWeather weather) {
    this.weather = weather;
    return this;
  }

  /**
   * Get weather
   * @return weather
  */
  @Valid 
  @Schema(name = "weather", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weather")
  public ScoreboardGameWeather getWeather() {
    return weather;
  }

  public void setWeather(ScoreboardGameWeather weather) {
    this.weather = weather;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreboardGame scoreboardGame = (ScoreboardGame) o;
    return Objects.equals(this.awayTeam, scoreboardGame.awayTeam) &&
        Objects.equals(this.betting, scoreboardGame.betting) &&
        Objects.equals(this.clock, scoreboardGame.clock) &&
        Objects.equals(this.conferenceGame, scoreboardGame.conferenceGame) &&
        Objects.equals(this.homeTeam, scoreboardGame.homeTeam) &&
        Objects.equals(this.id, scoreboardGame.id) &&
        Objects.equals(this.neutralSite, scoreboardGame.neutralSite) &&
        Objects.equals(this.period, scoreboardGame.period) &&
        Objects.equals(this.possession, scoreboardGame.possession) &&
        Objects.equals(this.situation, scoreboardGame.situation) &&
        Objects.equals(this.startDate, scoreboardGame.startDate) &&
        Objects.equals(this.startTimeTBD, scoreboardGame.startTimeTBD) &&
        Objects.equals(this.status, scoreboardGame.status) &&
        Objects.equals(this.tv, scoreboardGame.tv) &&
        Objects.equals(this.venue, scoreboardGame.venue) &&
        Objects.equals(this.weather, scoreboardGame.weather);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayTeam, betting, clock, conferenceGame, homeTeam, id, neutralSite, period, possession, situation, startDate, startTimeTBD, status, tv, venue, weather);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreboardGame {\n");
    sb.append("    awayTeam: ").append(toIndentedString(awayTeam)).append("\n");
    sb.append("    betting: ").append(toIndentedString(betting)).append("\n");
    sb.append("    clock: ").append(toIndentedString(clock)).append("\n");
    sb.append("    conferenceGame: ").append(toIndentedString(conferenceGame)).append("\n");
    sb.append("    homeTeam: ").append(toIndentedString(homeTeam)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    neutralSite: ").append(toIndentedString(neutralSite)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    possession: ").append(toIndentedString(possession)).append("\n");
    sb.append("    situation: ").append(toIndentedString(situation)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTimeTBD: ").append(toIndentedString(startTimeTBD)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tv: ").append(toIndentedString(tv)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
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

