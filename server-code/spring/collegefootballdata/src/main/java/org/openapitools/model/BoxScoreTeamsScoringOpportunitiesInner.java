package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoxScoreTeamsScoringOpportunitiesInner
 */

@JsonTypeName("BoxScore_teams_scoringOpportunities_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScoreTeamsScoringOpportunitiesInner {

  private Integer opportunities;

  private Integer points;

  private BigDecimal pointsPerOpportunity;

  private String team;

  public BoxScoreTeamsScoringOpportunitiesInner opportunities(Integer opportunities) {
    this.opportunities = opportunities;
    return this;
  }

  /**
   * Get opportunities
   * @return opportunities
  */
  
  @Schema(name = "opportunities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opportunities")
  public Integer getOpportunities() {
    return opportunities;
  }

  public void setOpportunities(Integer opportunities) {
    this.opportunities = opportunities;
  }

  public BoxScoreTeamsScoringOpportunitiesInner points(Integer points) {
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

  public BoxScoreTeamsScoringOpportunitiesInner pointsPerOpportunity(BigDecimal pointsPerOpportunity) {
    this.pointsPerOpportunity = pointsPerOpportunity;
    return this;
  }

  /**
   * Get pointsPerOpportunity
   * @return pointsPerOpportunity
  */
  @Valid 
  @Schema(name = "pointsPerOpportunity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pointsPerOpportunity")
  public BigDecimal getPointsPerOpportunity() {
    return pointsPerOpportunity;
  }

  public void setPointsPerOpportunity(BigDecimal pointsPerOpportunity) {
    this.pointsPerOpportunity = pointsPerOpportunity;
  }

  public BoxScoreTeamsScoringOpportunitiesInner team(String team) {
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
    BoxScoreTeamsScoringOpportunitiesInner boxScoreTeamsScoringOpportunitiesInner = (BoxScoreTeamsScoringOpportunitiesInner) o;
    return Objects.equals(this.opportunities, boxScoreTeamsScoringOpportunitiesInner.opportunities) &&
        Objects.equals(this.points, boxScoreTeamsScoringOpportunitiesInner.points) &&
        Objects.equals(this.pointsPerOpportunity, boxScoreTeamsScoringOpportunitiesInner.pointsPerOpportunity) &&
        Objects.equals(this.team, boxScoreTeamsScoringOpportunitiesInner.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(opportunities, points, pointsPerOpportunity, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScoreTeamsScoringOpportunitiesInner {\n");
    sb.append("    opportunities: ").append(toIndentedString(opportunities)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    pointsPerOpportunity: ").append(toIndentedString(pointsPerOpportunity)).append("\n");
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

