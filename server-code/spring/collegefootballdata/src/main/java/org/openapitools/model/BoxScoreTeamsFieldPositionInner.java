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
 * BoxScoreTeamsFieldPositionInner
 */

@JsonTypeName("BoxScore_teams_fieldPosition_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScoreTeamsFieldPositionInner {

  private BigDecimal averageStart;

  private BigDecimal averageStartingPredictedPoints;

  private String team;

  public BoxScoreTeamsFieldPositionInner averageStart(BigDecimal averageStart) {
    this.averageStart = averageStart;
    return this;
  }

  /**
   * Get averageStart
   * @return averageStart
  */
  @Valid 
  @Schema(name = "averageStart", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageStart")
  public BigDecimal getAverageStart() {
    return averageStart;
  }

  public void setAverageStart(BigDecimal averageStart) {
    this.averageStart = averageStart;
  }

  public BoxScoreTeamsFieldPositionInner averageStartingPredictedPoints(BigDecimal averageStartingPredictedPoints) {
    this.averageStartingPredictedPoints = averageStartingPredictedPoints;
    return this;
  }

  /**
   * Get averageStartingPredictedPoints
   * @return averageStartingPredictedPoints
  */
  @Valid 
  @Schema(name = "averageStartingPredictedPoints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("averageStartingPredictedPoints")
  public BigDecimal getAverageStartingPredictedPoints() {
    return averageStartingPredictedPoints;
  }

  public void setAverageStartingPredictedPoints(BigDecimal averageStartingPredictedPoints) {
    this.averageStartingPredictedPoints = averageStartingPredictedPoints;
  }

  public BoxScoreTeamsFieldPositionInner team(String team) {
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
    BoxScoreTeamsFieldPositionInner boxScoreTeamsFieldPositionInner = (BoxScoreTeamsFieldPositionInner) o;
    return Objects.equals(this.averageStart, boxScoreTeamsFieldPositionInner.averageStart) &&
        Objects.equals(this.averageStartingPredictedPoints, boxScoreTeamsFieldPositionInner.averageStartingPredictedPoints) &&
        Objects.equals(this.team, boxScoreTeamsFieldPositionInner.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageStart, averageStartingPredictedPoints, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScoreTeamsFieldPositionInner {\n");
    sb.append("    averageStart: ").append(toIndentedString(averageStart)).append("\n");
    sb.append("    averageStartingPredictedPoints: ").append(toIndentedString(averageStartingPredictedPoints)).append("\n");
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

