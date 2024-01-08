package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.TeamGameTeamsInnerStatsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TeamGameTeamsInner
 */

@JsonTypeName("TeamGame_teams_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamGameTeamsInner {

  private String conference;

  private String homeAway;

  private Integer points;

  private String school;

  @Valid
  private List<@Valid TeamGameTeamsInnerStatsInner> stats;

  public TeamGameTeamsInner conference(String conference) {
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

  public TeamGameTeamsInner homeAway(String homeAway) {
    this.homeAway = homeAway;
    return this;
  }

  /**
   * Get homeAway
   * @return homeAway
  */
  
  @Schema(name = "homeAway", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeAway")
  public String getHomeAway() {
    return homeAway;
  }

  public void setHomeAway(String homeAway) {
    this.homeAway = homeAway;
  }

  public TeamGameTeamsInner points(Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
  */
  
  @Schema(name = "points", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("points")
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public TeamGameTeamsInner school(String school) {
    this.school = school;
    return this;
  }

  /**
   * Get school
   * @return school
  */
  
  @Schema(name = "school", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("school")
  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public TeamGameTeamsInner stats(List<@Valid TeamGameTeamsInnerStatsInner> stats) {
    this.stats = stats;
    return this;
  }

  public TeamGameTeamsInner addStatsItem(TeamGameTeamsInnerStatsInner statsItem) {
    if (this.stats == null) {
      this.stats = new ArrayList<>();
    }
    this.stats.add(statsItem);
    return this;
  }

  /**
   * Get stats
   * @return stats
  */
  @Valid 
  @Schema(name = "stats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stats")
  public List<@Valid TeamGameTeamsInnerStatsInner> getStats() {
    return stats;
  }

  public void setStats(List<@Valid TeamGameTeamsInnerStatsInner> stats) {
    this.stats = stats;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamGameTeamsInner teamGameTeamsInner = (TeamGameTeamsInner) o;
    return Objects.equals(this.conference, teamGameTeamsInner.conference) &&
        Objects.equals(this.homeAway, teamGameTeamsInner.homeAway) &&
        Objects.equals(this.points, teamGameTeamsInner.points) &&
        Objects.equals(this.school, teamGameTeamsInner.school) &&
        Objects.equals(this.stats, teamGameTeamsInner.stats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, homeAway, points, school, stats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamGameTeamsInner {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    homeAway: ").append(toIndentedString(homeAway)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    school: ").append(toIndentedString(school)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
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

