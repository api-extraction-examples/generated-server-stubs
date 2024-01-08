package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.model.ConferenceSPRatingSpecialTeams;
import org.openapitools.model.TeamSPRatingDefense;
import org.openapitools.model.TeamSPRatingOffense;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamSPRating
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamSPRating {

  private String conference;

  private TeamSPRatingDefense defense;

  private TeamSPRatingOffense offense;

  private BigDecimal ranking;

  private BigDecimal rating;

  private BigDecimal secondOrderWins;

  private BigDecimal sos;

  private ConferenceSPRatingSpecialTeams specialTeams;

  private String team;

  private Integer year;

  public TeamSPRating conference(String conference) {
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

  public TeamSPRating defense(TeamSPRatingDefense defense) {
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
  public TeamSPRatingDefense getDefense() {
    return defense;
  }

  public void setDefense(TeamSPRatingDefense defense) {
    this.defense = defense;
  }

  public TeamSPRating offense(TeamSPRatingOffense offense) {
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
  public TeamSPRatingOffense getOffense() {
    return offense;
  }

  public void setOffense(TeamSPRatingOffense offense) {
    this.offense = offense;
  }

  public TeamSPRating ranking(BigDecimal ranking) {
    this.ranking = ranking;
    return this;
  }

  /**
   * Get ranking
   * @return ranking
  */
  @Valid 
  @Schema(name = "ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranking")
  public BigDecimal getRanking() {
    return ranking;
  }

  public void setRanking(BigDecimal ranking) {
    this.ranking = ranking;
  }

  public TeamSPRating rating(BigDecimal rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  */
  @Valid 
  @Schema(name = "rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating")
  public BigDecimal getRating() {
    return rating;
  }

  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }

  public TeamSPRating secondOrderWins(BigDecimal secondOrderWins) {
    this.secondOrderWins = secondOrderWins;
    return this;
  }

  /**
   * Get secondOrderWins
   * @return secondOrderWins
  */
  @Valid 
  @Schema(name = "secondOrderWins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondOrderWins")
  public BigDecimal getSecondOrderWins() {
    return secondOrderWins;
  }

  public void setSecondOrderWins(BigDecimal secondOrderWins) {
    this.secondOrderWins = secondOrderWins;
  }

  public TeamSPRating sos(BigDecimal sos) {
    this.sos = sos;
    return this;
  }

  /**
   * Get sos
   * @return sos
  */
  @Valid 
  @Schema(name = "sos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sos")
  public BigDecimal getSos() {
    return sos;
  }

  public void setSos(BigDecimal sos) {
    this.sos = sos;
  }

  public TeamSPRating specialTeams(ConferenceSPRatingSpecialTeams specialTeams) {
    this.specialTeams = specialTeams;
    return this;
  }

  /**
   * Get specialTeams
   * @return specialTeams
  */
  @Valid 
  @Schema(name = "specialTeams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("specialTeams")
  public ConferenceSPRatingSpecialTeams getSpecialTeams() {
    return specialTeams;
  }

  public void setSpecialTeams(ConferenceSPRatingSpecialTeams specialTeams) {
    this.specialTeams = specialTeams;
  }

  public TeamSPRating team(String team) {
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

  public TeamSPRating year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  
  @Schema(name = "year", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSPRating teamSPRating = (TeamSPRating) o;
    return Objects.equals(this.conference, teamSPRating.conference) &&
        Objects.equals(this.defense, teamSPRating.defense) &&
        Objects.equals(this.offense, teamSPRating.offense) &&
        Objects.equals(this.ranking, teamSPRating.ranking) &&
        Objects.equals(this.rating, teamSPRating.rating) &&
        Objects.equals(this.secondOrderWins, teamSPRating.secondOrderWins) &&
        Objects.equals(this.sos, teamSPRating.sos) &&
        Objects.equals(this.specialTeams, teamSPRating.specialTeams) &&
        Objects.equals(this.team, teamSPRating.team) &&
        Objects.equals(this.year, teamSPRating.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, defense, offense, ranking, rating, secondOrderWins, sos, specialTeams, team, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSPRating {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    offense: ").append(toIndentedString(offense)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    secondOrderWins: ").append(toIndentedString(secondOrderWins)).append("\n");
    sb.append("    sos: ").append(toIndentedString(sos)).append("\n");
    sb.append("    specialTeams: ").append(toIndentedString(specialTeams)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
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

