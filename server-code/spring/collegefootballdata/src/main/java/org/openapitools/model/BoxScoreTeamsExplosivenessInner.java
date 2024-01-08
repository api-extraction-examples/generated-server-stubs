package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.BoxScoreTeamsCumulativePpaInnerOverall;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoxScoreTeamsExplosivenessInner
 */

@JsonTypeName("BoxScore_teams_explosiveness_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScoreTeamsExplosivenessInner {

  private BoxScoreTeamsCumulativePpaInnerOverall overall;

  private String team;

  public BoxScoreTeamsExplosivenessInner overall(BoxScoreTeamsCumulativePpaInnerOverall overall) {
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

  public BoxScoreTeamsExplosivenessInner team(String team) {
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
    BoxScoreTeamsExplosivenessInner boxScoreTeamsExplosivenessInner = (BoxScoreTeamsExplosivenessInner) o;
    return Objects.equals(this.overall, boxScoreTeamsExplosivenessInner.overall) &&
        Objects.equals(this.team, boxScoreTeamsExplosivenessInner.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overall, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScoreTeamsExplosivenessInner {\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
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

