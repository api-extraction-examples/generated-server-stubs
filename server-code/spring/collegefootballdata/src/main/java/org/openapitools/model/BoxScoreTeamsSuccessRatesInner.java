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
 * BoxScoreTeamsSuccessRatesInner
 */

@JsonTypeName("BoxScore_teams_successRates_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScoreTeamsSuccessRatesInner {

  private BoxScoreTeamsCumulativePpaInnerOverall overall;

  private BoxScoreTeamsCumulativePpaInnerOverall passingDowns;

  private BoxScoreTeamsCumulativePpaInnerOverall standardDowns;

  private String team;

  public BoxScoreTeamsSuccessRatesInner overall(BoxScoreTeamsCumulativePpaInnerOverall overall) {
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

  public BoxScoreTeamsSuccessRatesInner passingDowns(BoxScoreTeamsCumulativePpaInnerOverall passingDowns) {
    this.passingDowns = passingDowns;
    return this;
  }

  /**
   * Get passingDowns
   * @return passingDowns
  */
  @Valid 
  @Schema(name = "passingDowns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passingDowns")
  public BoxScoreTeamsCumulativePpaInnerOverall getPassingDowns() {
    return passingDowns;
  }

  public void setPassingDowns(BoxScoreTeamsCumulativePpaInnerOverall passingDowns) {
    this.passingDowns = passingDowns;
  }

  public BoxScoreTeamsSuccessRatesInner standardDowns(BoxScoreTeamsCumulativePpaInnerOverall standardDowns) {
    this.standardDowns = standardDowns;
    return this;
  }

  /**
   * Get standardDowns
   * @return standardDowns
  */
  @Valid 
  @Schema(name = "standardDowns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("standardDowns")
  public BoxScoreTeamsCumulativePpaInnerOverall getStandardDowns() {
    return standardDowns;
  }

  public void setStandardDowns(BoxScoreTeamsCumulativePpaInnerOverall standardDowns) {
    this.standardDowns = standardDowns;
  }

  public BoxScoreTeamsSuccessRatesInner team(String team) {
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
    BoxScoreTeamsSuccessRatesInner boxScoreTeamsSuccessRatesInner = (BoxScoreTeamsSuccessRatesInner) o;
    return Objects.equals(this.overall, boxScoreTeamsSuccessRatesInner.overall) &&
        Objects.equals(this.passingDowns, boxScoreTeamsSuccessRatesInner.passingDowns) &&
        Objects.equals(this.standardDowns, boxScoreTeamsSuccessRatesInner.standardDowns) &&
        Objects.equals(this.team, boxScoreTeamsSuccessRatesInner.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overall, passingDowns, standardDowns, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScoreTeamsSuccessRatesInner {\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    passingDowns: ").append(toIndentedString(passingDowns)).append("\n");
    sb.append("    standardDowns: ").append(toIndentedString(standardDowns)).append("\n");
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

