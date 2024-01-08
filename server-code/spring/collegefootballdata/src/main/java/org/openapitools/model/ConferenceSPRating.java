package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.model.ConferenceSPRatingDefense;
import org.openapitools.model.ConferenceSPRatingOffense;
import org.openapitools.model.ConferenceSPRatingSpecialTeams;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConferenceSPRating
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class ConferenceSPRating {

  private String conference;

  private ConferenceSPRatingDefense defense;

  private ConferenceSPRatingOffense offense;

  private BigDecimal rating;

  private BigDecimal secondOrderWins;

  private BigDecimal sos;

  private ConferenceSPRatingSpecialTeams specialTeams;

  private Integer year;

  public ConferenceSPRating conference(String conference) {
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

  public ConferenceSPRating defense(ConferenceSPRatingDefense defense) {
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
  public ConferenceSPRatingDefense getDefense() {
    return defense;
  }

  public void setDefense(ConferenceSPRatingDefense defense) {
    this.defense = defense;
  }

  public ConferenceSPRating offense(ConferenceSPRatingOffense offense) {
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
  public ConferenceSPRatingOffense getOffense() {
    return offense;
  }

  public void setOffense(ConferenceSPRatingOffense offense) {
    this.offense = offense;
  }

  public ConferenceSPRating rating(BigDecimal rating) {
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

  public ConferenceSPRating secondOrderWins(BigDecimal secondOrderWins) {
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

  public ConferenceSPRating sos(BigDecimal sos) {
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

  public ConferenceSPRating specialTeams(ConferenceSPRatingSpecialTeams specialTeams) {
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

  public ConferenceSPRating year(Integer year) {
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
    ConferenceSPRating conferenceSPRating = (ConferenceSPRating) o;
    return Objects.equals(this.conference, conferenceSPRating.conference) &&
        Objects.equals(this.defense, conferenceSPRating.defense) &&
        Objects.equals(this.offense, conferenceSPRating.offense) &&
        Objects.equals(this.rating, conferenceSPRating.rating) &&
        Objects.equals(this.secondOrderWins, conferenceSPRating.secondOrderWins) &&
        Objects.equals(this.sos, conferenceSPRating.sos) &&
        Objects.equals(this.specialTeams, conferenceSPRating.specialTeams) &&
        Objects.equals(this.year, conferenceSPRating.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, defense, offense, rating, secondOrderWins, sos, specialTeams, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceSPRating {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    defense: ").append(toIndentedString(defense)).append("\n");
    sb.append("    offense: ").append(toIndentedString(offense)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    secondOrderWins: ").append(toIndentedString(secondOrderWins)).append("\n");
    sb.append("    sos: ").append(toIndentedString(sos)).append("\n");
    sb.append("    specialTeams: ").append(toIndentedString(specialTeams)).append("\n");
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

