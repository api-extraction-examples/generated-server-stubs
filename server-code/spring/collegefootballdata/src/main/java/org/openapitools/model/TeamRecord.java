package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.model.TeamRecordAwayGames;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamRecord
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamRecord {

  private TeamRecordAwayGames awayGames;

  private String conference;

  private TeamRecordAwayGames conferenceGames;

  private String division;

  private BigDecimal expectedWins;

  private TeamRecordAwayGames homeGames;

  private String team;

  private TeamRecordAwayGames total;

  private Integer year;

  public TeamRecord awayGames(TeamRecordAwayGames awayGames) {
    this.awayGames = awayGames;
    return this;
  }

  /**
   * Get awayGames
   * @return awayGames
  */
  @Valid 
  @Schema(name = "awayGames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayGames")
  public TeamRecordAwayGames getAwayGames() {
    return awayGames;
  }

  public void setAwayGames(TeamRecordAwayGames awayGames) {
    this.awayGames = awayGames;
  }

  public TeamRecord conference(String conference) {
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

  public TeamRecord conferenceGames(TeamRecordAwayGames conferenceGames) {
    this.conferenceGames = conferenceGames;
    return this;
  }

  /**
   * Get conferenceGames
   * @return conferenceGames
  */
  @Valid 
  @Schema(name = "conferenceGames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conferenceGames")
  public TeamRecordAwayGames getConferenceGames() {
    return conferenceGames;
  }

  public void setConferenceGames(TeamRecordAwayGames conferenceGames) {
    this.conferenceGames = conferenceGames;
  }

  public TeamRecord division(String division) {
    this.division = division;
    return this;
  }

  /**
   * Get division
   * @return division
  */
  
  @Schema(name = "division", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("division")
  public String getDivision() {
    return division;
  }

  public void setDivision(String division) {
    this.division = division;
  }

  public TeamRecord expectedWins(BigDecimal expectedWins) {
    this.expectedWins = expectedWins;
    return this;
  }

  /**
   * Get expectedWins
   * @return expectedWins
  */
  @Valid 
  @Schema(name = "expectedWins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedWins")
  public BigDecimal getExpectedWins() {
    return expectedWins;
  }

  public void setExpectedWins(BigDecimal expectedWins) {
    this.expectedWins = expectedWins;
  }

  public TeamRecord homeGames(TeamRecordAwayGames homeGames) {
    this.homeGames = homeGames;
    return this;
  }

  /**
   * Get homeGames
   * @return homeGames
  */
  @Valid 
  @Schema(name = "homeGames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeGames")
  public TeamRecordAwayGames getHomeGames() {
    return homeGames;
  }

  public void setHomeGames(TeamRecordAwayGames homeGames) {
    this.homeGames = homeGames;
  }

  public TeamRecord team(String team) {
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

  public TeamRecord total(TeamRecordAwayGames total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @Valid 
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public TeamRecordAwayGames getTotal() {
    return total;
  }

  public void setTotal(TeamRecordAwayGames total) {
    this.total = total;
  }

  public TeamRecord year(Integer year) {
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
    TeamRecord teamRecord = (TeamRecord) o;
    return Objects.equals(this.awayGames, teamRecord.awayGames) &&
        Objects.equals(this.conference, teamRecord.conference) &&
        Objects.equals(this.conferenceGames, teamRecord.conferenceGames) &&
        Objects.equals(this.division, teamRecord.division) &&
        Objects.equals(this.expectedWins, teamRecord.expectedWins) &&
        Objects.equals(this.homeGames, teamRecord.homeGames) &&
        Objects.equals(this.team, teamRecord.team) &&
        Objects.equals(this.total, teamRecord.total) &&
        Objects.equals(this.year, teamRecord.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayGames, conference, conferenceGames, division, expectedWins, homeGames, team, total, year);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamRecord {\n");
    sb.append("    awayGames: ").append(toIndentedString(awayGames)).append("\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    conferenceGames: ").append(toIndentedString(conferenceGames)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    expectedWins: ").append(toIndentedString(expectedWins)).append("\n");
    sb.append("    homeGames: ").append(toIndentedString(homeGames)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

