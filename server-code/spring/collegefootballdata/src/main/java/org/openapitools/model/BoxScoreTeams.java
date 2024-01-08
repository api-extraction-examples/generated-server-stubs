package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BoxScoreTeamsCumulativePpaInner;
import org.openapitools.model.BoxScoreTeamsExplosivenessInner;
import org.openapitools.model.BoxScoreTeamsFieldPositionInner;
import org.openapitools.model.BoxScoreTeamsHavocInner;
import org.openapitools.model.BoxScoreTeamsRushingInner;
import org.openapitools.model.BoxScoreTeamsScoringOpportunitiesInner;
import org.openapitools.model.BoxScoreTeamsSuccessRatesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BoxScoreTeams
 */

@JsonTypeName("BoxScore_teams")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class BoxScoreTeams {

  @Valid
  private List<@Valid BoxScoreTeamsCumulativePpaInner> cumulativePpa;

  @Valid
  private List<@Valid BoxScoreTeamsExplosivenessInner> explosiveness;

  @Valid
  private List<@Valid BoxScoreTeamsFieldPositionInner> fieldPosition;

  @Valid
  private List<@Valid BoxScoreTeamsHavocInner> havoc;

  @Valid
  private List<@Valid BoxScoreTeamsCumulativePpaInner> ppa;

  @Valid
  private List<@Valid BoxScoreTeamsRushingInner> rushing;

  @Valid
  private List<@Valid BoxScoreTeamsScoringOpportunitiesInner> scoringOpportunities;

  @Valid
  private List<@Valid BoxScoreTeamsSuccessRatesInner> successRates;

  public BoxScoreTeams cumulativePpa(List<@Valid BoxScoreTeamsCumulativePpaInner> cumulativePpa) {
    this.cumulativePpa = cumulativePpa;
    return this;
  }

  public BoxScoreTeams addCumulativePpaItem(BoxScoreTeamsCumulativePpaInner cumulativePpaItem) {
    if (this.cumulativePpa == null) {
      this.cumulativePpa = new ArrayList<>();
    }
    this.cumulativePpa.add(cumulativePpaItem);
    return this;
  }

  /**
   * Get cumulativePpa
   * @return cumulativePpa
  */
  @Valid 
  @Schema(name = "cumulativePpa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cumulativePpa")
  public List<@Valid BoxScoreTeamsCumulativePpaInner> getCumulativePpa() {
    return cumulativePpa;
  }

  public void setCumulativePpa(List<@Valid BoxScoreTeamsCumulativePpaInner> cumulativePpa) {
    this.cumulativePpa = cumulativePpa;
  }

  public BoxScoreTeams explosiveness(List<@Valid BoxScoreTeamsExplosivenessInner> explosiveness) {
    this.explosiveness = explosiveness;
    return this;
  }

  public BoxScoreTeams addExplosivenessItem(BoxScoreTeamsExplosivenessInner explosivenessItem) {
    if (this.explosiveness == null) {
      this.explosiveness = new ArrayList<>();
    }
    this.explosiveness.add(explosivenessItem);
    return this;
  }

  /**
   * Get explosiveness
   * @return explosiveness
  */
  @Valid 
  @Schema(name = "explosiveness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explosiveness")
  public List<@Valid BoxScoreTeamsExplosivenessInner> getExplosiveness() {
    return explosiveness;
  }

  public void setExplosiveness(List<@Valid BoxScoreTeamsExplosivenessInner> explosiveness) {
    this.explosiveness = explosiveness;
  }

  public BoxScoreTeams fieldPosition(List<@Valid BoxScoreTeamsFieldPositionInner> fieldPosition) {
    this.fieldPosition = fieldPosition;
    return this;
  }

  public BoxScoreTeams addFieldPositionItem(BoxScoreTeamsFieldPositionInner fieldPositionItem) {
    if (this.fieldPosition == null) {
      this.fieldPosition = new ArrayList<>();
    }
    this.fieldPosition.add(fieldPositionItem);
    return this;
  }

  /**
   * Get fieldPosition
   * @return fieldPosition
  */
  @Valid 
  @Schema(name = "fieldPosition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldPosition")
  public List<@Valid BoxScoreTeamsFieldPositionInner> getFieldPosition() {
    return fieldPosition;
  }

  public void setFieldPosition(List<@Valid BoxScoreTeamsFieldPositionInner> fieldPosition) {
    this.fieldPosition = fieldPosition;
  }

  public BoxScoreTeams havoc(List<@Valid BoxScoreTeamsHavocInner> havoc) {
    this.havoc = havoc;
    return this;
  }

  public BoxScoreTeams addHavocItem(BoxScoreTeamsHavocInner havocItem) {
    if (this.havoc == null) {
      this.havoc = new ArrayList<>();
    }
    this.havoc.add(havocItem);
    return this;
  }

  /**
   * Get havoc
   * @return havoc
  */
  @Valid 
  @Schema(name = "havoc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("havoc")
  public List<@Valid BoxScoreTeamsHavocInner> getHavoc() {
    return havoc;
  }

  public void setHavoc(List<@Valid BoxScoreTeamsHavocInner> havoc) {
    this.havoc = havoc;
  }

  public BoxScoreTeams ppa(List<@Valid BoxScoreTeamsCumulativePpaInner> ppa) {
    this.ppa = ppa;
    return this;
  }

  public BoxScoreTeams addPpaItem(BoxScoreTeamsCumulativePpaInner ppaItem) {
    if (this.ppa == null) {
      this.ppa = new ArrayList<>();
    }
    this.ppa.add(ppaItem);
    return this;
  }

  /**
   * Get ppa
   * @return ppa
  */
  @Valid 
  @Schema(name = "ppa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ppa")
  public List<@Valid BoxScoreTeamsCumulativePpaInner> getPpa() {
    return ppa;
  }

  public void setPpa(List<@Valid BoxScoreTeamsCumulativePpaInner> ppa) {
    this.ppa = ppa;
  }

  public BoxScoreTeams rushing(List<@Valid BoxScoreTeamsRushingInner> rushing) {
    this.rushing = rushing;
    return this;
  }

  public BoxScoreTeams addRushingItem(BoxScoreTeamsRushingInner rushingItem) {
    if (this.rushing == null) {
      this.rushing = new ArrayList<>();
    }
    this.rushing.add(rushingItem);
    return this;
  }

  /**
   * Get rushing
   * @return rushing
  */
  @Valid 
  @Schema(name = "rushing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rushing")
  public List<@Valid BoxScoreTeamsRushingInner> getRushing() {
    return rushing;
  }

  public void setRushing(List<@Valid BoxScoreTeamsRushingInner> rushing) {
    this.rushing = rushing;
  }

  public BoxScoreTeams scoringOpportunities(List<@Valid BoxScoreTeamsScoringOpportunitiesInner> scoringOpportunities) {
    this.scoringOpportunities = scoringOpportunities;
    return this;
  }

  public BoxScoreTeams addScoringOpportunitiesItem(BoxScoreTeamsScoringOpportunitiesInner scoringOpportunitiesItem) {
    if (this.scoringOpportunities == null) {
      this.scoringOpportunities = new ArrayList<>();
    }
    this.scoringOpportunities.add(scoringOpportunitiesItem);
    return this;
  }

  /**
   * Get scoringOpportunities
   * @return scoringOpportunities
  */
  @Valid 
  @Schema(name = "scoringOpportunities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scoringOpportunities")
  public List<@Valid BoxScoreTeamsScoringOpportunitiesInner> getScoringOpportunities() {
    return scoringOpportunities;
  }

  public void setScoringOpportunities(List<@Valid BoxScoreTeamsScoringOpportunitiesInner> scoringOpportunities) {
    this.scoringOpportunities = scoringOpportunities;
  }

  public BoxScoreTeams successRates(List<@Valid BoxScoreTeamsSuccessRatesInner> successRates) {
    this.successRates = successRates;
    return this;
  }

  public BoxScoreTeams addSuccessRatesItem(BoxScoreTeamsSuccessRatesInner successRatesItem) {
    if (this.successRates == null) {
      this.successRates = new ArrayList<>();
    }
    this.successRates.add(successRatesItem);
    return this;
  }

  /**
   * Get successRates
   * @return successRates
  */
  @Valid 
  @Schema(name = "successRates", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successRates")
  public List<@Valid BoxScoreTeamsSuccessRatesInner> getSuccessRates() {
    return successRates;
  }

  public void setSuccessRates(List<@Valid BoxScoreTeamsSuccessRatesInner> successRates) {
    this.successRates = successRates;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoxScoreTeams boxScoreTeams = (BoxScoreTeams) o;
    return Objects.equals(this.cumulativePpa, boxScoreTeams.cumulativePpa) &&
        Objects.equals(this.explosiveness, boxScoreTeams.explosiveness) &&
        Objects.equals(this.fieldPosition, boxScoreTeams.fieldPosition) &&
        Objects.equals(this.havoc, boxScoreTeams.havoc) &&
        Objects.equals(this.ppa, boxScoreTeams.ppa) &&
        Objects.equals(this.rushing, boxScoreTeams.rushing) &&
        Objects.equals(this.scoringOpportunities, boxScoreTeams.scoringOpportunities) &&
        Objects.equals(this.successRates, boxScoreTeams.successRates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cumulativePpa, explosiveness, fieldPosition, havoc, ppa, rushing, scoringOpportunities, successRates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoxScoreTeams {\n");
    sb.append("    cumulativePpa: ").append(toIndentedString(cumulativePpa)).append("\n");
    sb.append("    explosiveness: ").append(toIndentedString(explosiveness)).append("\n");
    sb.append("    fieldPosition: ").append(toIndentedString(fieldPosition)).append("\n");
    sb.append("    havoc: ").append(toIndentedString(havoc)).append("\n");
    sb.append("    ppa: ").append(toIndentedString(ppa)).append("\n");
    sb.append("    rushing: ").append(toIndentedString(rushing)).append("\n");
    sb.append("    scoringOpportunities: ").append(toIndentedString(scoringOpportunities)).append("\n");
    sb.append("    successRates: ").append(toIndentedString(successRates)).append("\n");
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

