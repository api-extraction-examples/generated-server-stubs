package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.model.BoxScoreTeamsCumulativePpaInnerOverall;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoxScoreTeamsCumulativePpaInner
 */

@JsonTypeName("BoxScore_teams_cumulativePpa_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScoreTeamsCumulativePpaInner {

  private BoxScoreTeamsCumulativePpaInnerOverall overall;

  private BoxScoreTeamsCumulativePpaInnerOverall passing;

  private BigDecimal plays;

  private BoxScoreTeamsCumulativePpaInnerOverall rushing;

  private String team;

  public BoxScoreTeamsCumulativePpaInner overall(BoxScoreTeamsCumulativePpaInnerOverall overall) {
    this.overall = overall;
    return this;
  }

  /**
   * Get overall
   * @return overall
  */
  @Valid 
  @Schema(name = "overall", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overall")
  public BoxScoreTeamsCumulativePpaInnerOverall getOverall() {
    return overall;
  }

  public void setOverall(BoxScoreTeamsCumulativePpaInnerOverall overall) {
    this.overall = overall;
  }

  public BoxScoreTeamsCumulativePpaInner passing(BoxScoreTeamsCumulativePpaInnerOverall passing) {
    this.passing = passing;
    return this;
  }

  /**
   * Get passing
   * @return passing
  */
  @Valid 
  @Schema(name = "passing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passing")
  public BoxScoreTeamsCumulativePpaInnerOverall getPassing() {
    return passing;
  }

  public void setPassing(BoxScoreTeamsCumulativePpaInnerOverall passing) {
    this.passing = passing;
  }

  public BoxScoreTeamsCumulativePpaInner plays(BigDecimal plays) {
    this.plays = plays;
    return this;
  }

  /**
   * Get plays
   * @return plays
  */
  @Valid 
  @Schema(name = "plays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plays")
  public BigDecimal getPlays() {
    return plays;
  }

  public void setPlays(BigDecimal plays) {
    this.plays = plays;
  }

  public BoxScoreTeamsCumulativePpaInner rushing(BoxScoreTeamsCumulativePpaInnerOverall rushing) {
    this.rushing = rushing;
    return this;
  }

  /**
   * Get rushing
   * @return rushing
  */
  @Valid 
  @Schema(name = "rushing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rushing")
  public BoxScoreTeamsCumulativePpaInnerOverall getRushing() {
    return rushing;
  }

  public void setRushing(BoxScoreTeamsCumulativePpaInnerOverall rushing) {
    this.rushing = rushing;
  }

  public BoxScoreTeamsCumulativePpaInner team(String team) {
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
    BoxScoreTeamsCumulativePpaInner boxScoreTeamsCumulativePpaInner = (BoxScoreTeamsCumulativePpaInner) o;
    return Objects.equals(this.overall, boxScoreTeamsCumulativePpaInner.overall) &&
        Objects.equals(this.passing, boxScoreTeamsCumulativePpaInner.passing) &&
        Objects.equals(this.plays, boxScoreTeamsCumulativePpaInner.plays) &&
        Objects.equals(this.rushing, boxScoreTeamsCumulativePpaInner.rushing) &&
        Objects.equals(this.team, boxScoreTeamsCumulativePpaInner.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overall, passing, plays, rushing, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScoreTeamsCumulativePpaInner {\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
    sb.append("    plays: ").append(toIndentedString(plays)).append("\n");
    sb.append("    rushing: ").append(toIndentedString(rushing)).append("\n");
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

