package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Game
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class Game {

  private Integer attendance;

  private String awayConference;

  private String awayDivision;

  private Integer awayId;

  @Valid
  private List<Integer> awayLineScores;

  private Integer awayPoints;

  private BigDecimal awayPostWinProb;

  private Integer awayPostgameElo;

  private Integer awayPregameElo;

  private String awayTeam;

  private Boolean completed;

  private Boolean conferenceGame;

  private BigDecimal excitementIndex;

  private String highlights;

  private String homeConference;

  private String homeDivision;

  private Integer homeId;

  @Valid
  private List<Integer> homeLineScores;

  private Integer homePoints;

  private BigDecimal homePostWinProb;

  private Integer homePostgameElo;

  private Integer homePregameElo;

  private String homeTeam;

  private Integer id;

  private Boolean neutralSite;

  private String notes;

  private Integer season;

  private String seasonType;

  private String startDate;

  private Boolean startTimeTbd;

  private String venue;

  private Integer venueId;

  private Integer week;

  public Game attendance(Integer attendance) {
    this.attendance = attendance;
    return this;
  }

  /**
   * Get attendance
   * @return attendance
  */
  
  @Schema(name = "attendance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attendance")
  public Integer getAttendance() {
    return attendance;
  }

  public void setAttendance(Integer attendance) {
    this.attendance = attendance;
  }

  public Game awayConference(String awayConference) {
    this.awayConference = awayConference;
    return this;
  }

  /**
   * Get awayConference
   * @return awayConference
  */
  
  @Schema(name = "away_conference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_conference")
  public String getAwayConference() {
    return awayConference;
  }

  public void setAwayConference(String awayConference) {
    this.awayConference = awayConference;
  }

  public Game awayDivision(String awayDivision) {
    this.awayDivision = awayDivision;
    return this;
  }

  /**
   * Get awayDivision
   * @return awayDivision
  */
  
  @Schema(name = "away_division", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_division")
  public String getAwayDivision() {
    return awayDivision;
  }

  public void setAwayDivision(String awayDivision) {
    this.awayDivision = awayDivision;
  }

  public Game awayId(Integer awayId) {
    this.awayId = awayId;
    return this;
  }

  /**
   * Get awayId
   * @return awayId
  */
  
  @Schema(name = "away_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_id")
  public Integer getAwayId() {
    return awayId;
  }

  public void setAwayId(Integer awayId) {
    this.awayId = awayId;
  }

  public Game awayLineScores(List<Integer> awayLineScores) {
    this.awayLineScores = awayLineScores;
    return this;
  }

  public Game addAwayLineScoresItem(Integer awayLineScoresItem) {
    if (this.awayLineScores == null) {
      this.awayLineScores = new ArrayList<>();
    }
    this.awayLineScores.add(awayLineScoresItem);
    return this;
  }

  /**
   * Get awayLineScores
   * @return awayLineScores
  */
  
  @Schema(name = "away_line_scores", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_line_scores")
  public List<Integer> getAwayLineScores() {
    return awayLineScores;
  }

  public void setAwayLineScores(List<Integer> awayLineScores) {
    this.awayLineScores = awayLineScores;
  }

  public Game awayPoints(Integer awayPoints) {
    this.awayPoints = awayPoints;
    return this;
  }

  /**
   * Get awayPoints
   * @return awayPoints
  */
  
  @Schema(name = "away_points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_points")
  public Integer getAwayPoints() {
    return awayPoints;
  }

  public void setAwayPoints(Integer awayPoints) {
    this.awayPoints = awayPoints;
  }

  public Game awayPostWinProb(BigDecimal awayPostWinProb) {
    this.awayPostWinProb = awayPostWinProb;
    return this;
  }

  /**
   * Get awayPostWinProb
   * @return awayPostWinProb
  */
  @Valid 
  @Schema(name = "away_post_win_prob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_post_win_prob")
  public BigDecimal getAwayPostWinProb() {
    return awayPostWinProb;
  }

  public void setAwayPostWinProb(BigDecimal awayPostWinProb) {
    this.awayPostWinProb = awayPostWinProb;
  }

  public Game awayPostgameElo(Integer awayPostgameElo) {
    this.awayPostgameElo = awayPostgameElo;
    return this;
  }

  /**
   * Get awayPostgameElo
   * @return awayPostgameElo
  */
  
  @Schema(name = "away_postgame_elo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_postgame_elo")
  public Integer getAwayPostgameElo() {
    return awayPostgameElo;
  }

  public void setAwayPostgameElo(Integer awayPostgameElo) {
    this.awayPostgameElo = awayPostgameElo;
  }

  public Game awayPregameElo(Integer awayPregameElo) {
    this.awayPregameElo = awayPregameElo;
    return this;
  }

  /**
   * Get awayPregameElo
   * @return awayPregameElo
  */
  
  @Schema(name = "away_pregame_elo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_pregame_elo")
  public Integer getAwayPregameElo() {
    return awayPregameElo;
  }

  public void setAwayPregameElo(Integer awayPregameElo) {
    this.awayPregameElo = awayPregameElo;
  }

  public Game awayTeam(String awayTeam) {
    this.awayTeam = awayTeam;
    return this;
  }

  /**
   * Get awayTeam
   * @return awayTeam
  */
  
  @Schema(name = "away_team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("away_team")
  public String getAwayTeam() {
    return awayTeam;
  }

  public void setAwayTeam(String awayTeam) {
    this.awayTeam = awayTeam;
  }

  public Game completed(Boolean completed) {
    this.completed = completed;
    return this;
  }

  /**
   * Get completed
   * @return completed
  */
  
  @Schema(name = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completed")
  public Boolean getCompleted() {
    return completed;
  }

  public void setCompleted(Boolean completed) {
    this.completed = completed;
  }

  public Game conferenceGame(Boolean conferenceGame) {
    this.conferenceGame = conferenceGame;
    return this;
  }

  /**
   * Get conferenceGame
   * @return conferenceGame
  */
  
  @Schema(name = "conference_game", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conference_game")
  public Boolean getConferenceGame() {
    return conferenceGame;
  }

  public void setConferenceGame(Boolean conferenceGame) {
    this.conferenceGame = conferenceGame;
  }

  public Game excitementIndex(BigDecimal excitementIndex) {
    this.excitementIndex = excitementIndex;
    return this;
  }

  /**
   * Get excitementIndex
   * @return excitementIndex
  */
  @Valid 
  @Schema(name = "excitement_index", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("excitement_index")
  public BigDecimal getExcitementIndex() {
    return excitementIndex;
  }

  public void setExcitementIndex(BigDecimal excitementIndex) {
    this.excitementIndex = excitementIndex;
  }

  public Game highlights(String highlights) {
    this.highlights = highlights;
    return this;
  }

  /**
   * Get highlights
   * @return highlights
  */
  
  @Schema(name = "highlights", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highlights")
  public String getHighlights() {
    return highlights;
  }

  public void setHighlights(String highlights) {
    this.highlights = highlights;
  }

  public Game homeConference(String homeConference) {
    this.homeConference = homeConference;
    return this;
  }

  /**
   * Get homeConference
   * @return homeConference
  */
  
  @Schema(name = "home_conference", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_conference")
  public String getHomeConference() {
    return homeConference;
  }

  public void setHomeConference(String homeConference) {
    this.homeConference = homeConference;
  }

  public Game homeDivision(String homeDivision) {
    this.homeDivision = homeDivision;
    return this;
  }

  /**
   * Get homeDivision
   * @return homeDivision
  */
  
  @Schema(name = "home_division", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_division")
  public String getHomeDivision() {
    return homeDivision;
  }

  public void setHomeDivision(String homeDivision) {
    this.homeDivision = homeDivision;
  }

  public Game homeId(Integer homeId) {
    this.homeId = homeId;
    return this;
  }

  /**
   * Get homeId
   * @return homeId
  */
  
  @Schema(name = "home_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_id")
  public Integer getHomeId() {
    return homeId;
  }

  public void setHomeId(Integer homeId) {
    this.homeId = homeId;
  }

  public Game homeLineScores(List<Integer> homeLineScores) {
    this.homeLineScores = homeLineScores;
    return this;
  }

  public Game addHomeLineScoresItem(Integer homeLineScoresItem) {
    if (this.homeLineScores == null) {
      this.homeLineScores = new ArrayList<>();
    }
    this.homeLineScores.add(homeLineScoresItem);
    return this;
  }

  /**
   * Get homeLineScores
   * @return homeLineScores
  */
  
  @Schema(name = "home_line_scores", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_line_scores")
  public List<Integer> getHomeLineScores() {
    return homeLineScores;
  }

  public void setHomeLineScores(List<Integer> homeLineScores) {
    this.homeLineScores = homeLineScores;
  }

  public Game homePoints(Integer homePoints) {
    this.homePoints = homePoints;
    return this;
  }

  /**
   * Get homePoints
   * @return homePoints
  */
  
  @Schema(name = "home_points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_points")
  public Integer getHomePoints() {
    return homePoints;
  }

  public void setHomePoints(Integer homePoints) {
    this.homePoints = homePoints;
  }

  public Game homePostWinProb(BigDecimal homePostWinProb) {
    this.homePostWinProb = homePostWinProb;
    return this;
  }

  /**
   * Get homePostWinProb
   * @return homePostWinProb
  */
  @Valid 
  @Schema(name = "home_post_win_prob", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_post_win_prob")
  public BigDecimal getHomePostWinProb() {
    return homePostWinProb;
  }

  public void setHomePostWinProb(BigDecimal homePostWinProb) {
    this.homePostWinProb = homePostWinProb;
  }

  public Game homePostgameElo(Integer homePostgameElo) {
    this.homePostgameElo = homePostgameElo;
    return this;
  }

  /**
   * Get homePostgameElo
   * @return homePostgameElo
  */
  
  @Schema(name = "home_postgame_elo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_postgame_elo")
  public Integer getHomePostgameElo() {
    return homePostgameElo;
  }

  public void setHomePostgameElo(Integer homePostgameElo) {
    this.homePostgameElo = homePostgameElo;
  }

  public Game homePregameElo(Integer homePregameElo) {
    this.homePregameElo = homePregameElo;
    return this;
  }

  /**
   * Get homePregameElo
   * @return homePregameElo
  */
  
  @Schema(name = "home_pregame_elo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_pregame_elo")
  public Integer getHomePregameElo() {
    return homePregameElo;
  }

  public void setHomePregameElo(Integer homePregameElo) {
    this.homePregameElo = homePregameElo;
  }

  public Game homeTeam(String homeTeam) {
    this.homeTeam = homeTeam;
    return this;
  }

  /**
   * Get homeTeam
   * @return homeTeam
  */
  
  @Schema(name = "home_team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("home_team")
  public String getHomeTeam() {
    return homeTeam;
  }

  public void setHomeTeam(String homeTeam) {
    this.homeTeam = homeTeam;
  }

  public Game id(Integer id) {
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

  public Game neutralSite(Boolean neutralSite) {
    this.neutralSite = neutralSite;
    return this;
  }

  /**
   * Get neutralSite
   * @return neutralSite
  */
  
  @Schema(name = "neutral_site", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("neutral_site")
  public Boolean getNeutralSite() {
    return neutralSite;
  }

  public void setNeutralSite(Boolean neutralSite) {
    this.neutralSite = neutralSite;
  }

  public Game notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Get notes
   * @return notes
  */
  
  @Schema(name = "notes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Game season(Integer season) {
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

  public Game seasonType(String seasonType) {
    this.seasonType = seasonType;
    return this;
  }

  /**
   * Get seasonType
   * @return seasonType
  */
  
  @Schema(name = "season_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("season_type")
  public String getSeasonType() {
    return seasonType;
  }

  public void setSeasonType(String seasonType) {
    this.seasonType = seasonType;
  }

  public Game startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "start_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public Game startTimeTbd(Boolean startTimeTbd) {
    this.startTimeTbd = startTimeTbd;
    return this;
  }

  /**
   * Get startTimeTbd
   * @return startTimeTbd
  */
  
  @Schema(name = "start_time_tbd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time_tbd")
  public Boolean getStartTimeTbd() {
    return startTimeTbd;
  }

  public void setStartTimeTbd(Boolean startTimeTbd) {
    this.startTimeTbd = startTimeTbd;
  }

  public Game venue(String venue) {
    this.venue = venue;
    return this;
  }

  /**
   * Get venue
   * @return venue
  */
  
  @Schema(name = "venue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("venue")
  public String getVenue() {
    return venue;
  }

  public void setVenue(String venue) {
    this.venue = venue;
  }

  public Game venueId(Integer venueId) {
    this.venueId = venueId;
    return this;
  }

  /**
   * Get venueId
   * @return venueId
  */
  
  @Schema(name = "venue_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("venue_id")
  public Integer getVenueId() {
    return venueId;
  }

  public void setVenueId(Integer venueId) {
    this.venueId = venueId;
  }

  public Game week(Integer week) {
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
    Game game = (Game) o;
    return Objects.equals(this.attendance, game.attendance) &&
        Objects.equals(this.awayConference, game.awayConference) &&
        Objects.equals(this.awayDivision, game.awayDivision) &&
        Objects.equals(this.awayId, game.awayId) &&
        Objects.equals(this.awayLineScores, game.awayLineScores) &&
        Objects.equals(this.awayPoints, game.awayPoints) &&
        Objects.equals(this.awayPostWinProb, game.awayPostWinProb) &&
        Objects.equals(this.awayPostgameElo, game.awayPostgameElo) &&
        Objects.equals(this.awayPregameElo, game.awayPregameElo) &&
        Objects.equals(this.awayTeam, game.awayTeam) &&
        Objects.equals(this.completed, game.completed) &&
        Objects.equals(this.conferenceGame, game.conferenceGame) &&
        Objects.equals(this.excitementIndex, game.excitementIndex) &&
        Objects.equals(this.highlights, game.highlights) &&
        Objects.equals(this.homeConference, game.homeConference) &&
        Objects.equals(this.homeDivision, game.homeDivision) &&
        Objects.equals(this.homeId, game.homeId) &&
        Objects.equals(this.homeLineScores, game.homeLineScores) &&
        Objects.equals(this.homePoints, game.homePoints) &&
        Objects.equals(this.homePostWinProb, game.homePostWinProb) &&
        Objects.equals(this.homePostgameElo, game.homePostgameElo) &&
        Objects.equals(this.homePregameElo, game.homePregameElo) &&
        Objects.equals(this.homeTeam, game.homeTeam) &&
        Objects.equals(this.id, game.id) &&
        Objects.equals(this.neutralSite, game.neutralSite) &&
        Objects.equals(this.notes, game.notes) &&
        Objects.equals(this.season, game.season) &&
        Objects.equals(this.seasonType, game.seasonType) &&
        Objects.equals(this.startDate, game.startDate) &&
        Objects.equals(this.startTimeTbd, game.startTimeTbd) &&
        Objects.equals(this.venue, game.venue) &&
        Objects.equals(this.venueId, game.venueId) &&
        Objects.equals(this.week, game.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attendance, awayConference, awayDivision, awayId, awayLineScores, awayPoints, awayPostWinProb, awayPostgameElo, awayPregameElo, awayTeam, completed, conferenceGame, excitementIndex, highlights, homeConference, homeDivision, homeId, homeLineScores, homePoints, homePostWinProb, homePostgameElo, homePregameElo, homeTeam, id, neutralSite, notes, season, seasonType, startDate, startTimeTbd, venue, venueId, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Game {\n");
    sb.append("    attendance: ").append(toIndentedString(attendance)).append("\n");
    sb.append("    awayConference: ").append(toIndentedString(awayConference)).append("\n");
    sb.append("    awayDivision: ").append(toIndentedString(awayDivision)).append("\n");
    sb.append("    awayId: ").append(toIndentedString(awayId)).append("\n");
    sb.append("    awayLineScores: ").append(toIndentedString(awayLineScores)).append("\n");
    sb.append("    awayPoints: ").append(toIndentedString(awayPoints)).append("\n");
    sb.append("    awayPostWinProb: ").append(toIndentedString(awayPostWinProb)).append("\n");
    sb.append("    awayPostgameElo: ").append(toIndentedString(awayPostgameElo)).append("\n");
    sb.append("    awayPregameElo: ").append(toIndentedString(awayPregameElo)).append("\n");
    sb.append("    awayTeam: ").append(toIndentedString(awayTeam)).append("\n");
    sb.append("    completed: ").append(toIndentedString(completed)).append("\n");
    sb.append("    conferenceGame: ").append(toIndentedString(conferenceGame)).append("\n");
    sb.append("    excitementIndex: ").append(toIndentedString(excitementIndex)).append("\n");
    sb.append("    highlights: ").append(toIndentedString(highlights)).append("\n");
    sb.append("    homeConference: ").append(toIndentedString(homeConference)).append("\n");
    sb.append("    homeDivision: ").append(toIndentedString(homeDivision)).append("\n");
    sb.append("    homeId: ").append(toIndentedString(homeId)).append("\n");
    sb.append("    homeLineScores: ").append(toIndentedString(homeLineScores)).append("\n");
    sb.append("    homePoints: ").append(toIndentedString(homePoints)).append("\n");
    sb.append("    homePostWinProb: ").append(toIndentedString(homePostWinProb)).append("\n");
    sb.append("    homePostgameElo: ").append(toIndentedString(homePostgameElo)).append("\n");
    sb.append("    homePregameElo: ").append(toIndentedString(homePregameElo)).append("\n");
    sb.append("    homeTeam: ").append(toIndentedString(homeTeam)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    neutralSite: ").append(toIndentedString(neutralSite)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    seasonType: ").append(toIndentedString(seasonType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startTimeTbd: ").append(toIndentedString(startTimeTbd)).append("\n");
    sb.append("    venue: ").append(toIndentedString(venue)).append("\n");
    sb.append("    venueId: ").append(toIndentedString(venueId)).append("\n");
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

