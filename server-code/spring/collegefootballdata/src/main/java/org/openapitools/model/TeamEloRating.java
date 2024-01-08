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
 * TeamEloRating
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamEloRating {

  private String conference;

  private BigDecimal elo;

  private String team;

  private Integer year;

  public TeamEloRating conference(String conference) {
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

  public TeamEloRating elo(BigDecimal elo) {
    this.elo = elo;
    return this;
  }

  /**
   * Get elo
   * @return elo
  */
  @Valid 
  @Schema(name = "elo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elo")
  public BigDecimal getElo() {
    return elo;
  }

  public void setElo(BigDecimal elo) {
    this.elo = elo;
  }

  public TeamEloRating team(String team) {
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

  public TeamEloRating year(Integer year) {
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
    TeamEloRating teamEloRating = (TeamEloRating) o;
    return Objects.equals(this.conference, teamEloRating.conference) &&
        Objects.equals(this.elo, teamEloRating.elo) &&
        Objects.equals(this.team, teamEloRating.team) &&
        Objects.equals(this.year, teamEloRating.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, elo, team, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamEloRating {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    elo: ").append(toIndentedString(elo)).append("\n");
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

