package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.model.AdvancedSeasonStatDefenseFieldPosition;
import org.openapitools.model.AdvancedSeasonStatDefenseHavoc;
import org.openapitools.model.AdvancedSeasonStatDefensePassingDowns;
import org.openapitools.model.AdvancedSeasonStatDefensePassingPlays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AdvancedSeasonStatDefense
 */

@JsonTypeName("AdvancedSeasonStat_defense")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class AdvancedSeasonStatDefense {

  private Integer drives;

  private BigDecimal explosiveness;

  private AdvancedSeasonStatDefenseFieldPosition fieldPosition;

  private AdvancedSeasonStatDefenseHavoc havoc;

  private BigDecimal lineYards;

  private BigDecimal lineYardsTotal;

  private BigDecimal openFieldYards;

  private Integer openFieldYardsTotal;

  private AdvancedSeasonStatDefensePassingDowns passingDowns;

  private AdvancedSeasonStatDefensePassingPlays passingPlays;

  private Integer plays;

  private BigDecimal pointsPerOpportunity;

  private BigDecimal powerSuccess;

  private BigDecimal ppa;

  private AdvancedSeasonStatDefensePassingPlays rushingPlays;

  private BigDecimal secondLevelYards;

  private Integer secondLevelYardsTotal;

  private AdvancedSeasonStatDefensePassingDowns standardDowns;

  private BigDecimal stuffRate;

  private BigDecimal successRate;

  private Integer totalOpportunies;

  private BigDecimal totalPPA;

  public AdvancedSeasonStatDefense drives(Integer drives) {
    this.drives = drives;
    return this;
  }

  /**
   * Get drives
   * @return drives
  */
  
  @Schema(name = "drives", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("drives")
  public Integer getDrives() {
    return drives;
  }

  public void setDrives(Integer drives) {
    this.drives = drives;
  }

  public AdvancedSeasonStatDefense explosiveness(BigDecimal explosiveness) {
    this.explosiveness = explosiveness;
    return this;
  }

  /**
   * Get explosiveness
   * @return explosiveness
  */
  @Valid 
  @Schema(name = "explosiveness", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("explosiveness")
  public BigDecimal getExplosiveness() {
    return explosiveness;
  }

  public void setExplosiveness(BigDecimal explosiveness) {
    this.explosiveness = explosiveness;
  }

  public AdvancedSeasonStatDefense fieldPosition(AdvancedSeasonStatDefenseFieldPosition fieldPosition) {
    this.fieldPosition = fieldPosition;
    return this;
  }

  /**
   * Get fieldPosition
   * @return fieldPosition
  */
  @Valid 
  @Schema(name = "fieldPosition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldPosition")
  public AdvancedSeasonStatDefenseFieldPosition getFieldPosition() {
    return fieldPosition;
  }

  public void setFieldPosition(AdvancedSeasonStatDefenseFieldPosition fieldPosition) {
    this.fieldPosition = fieldPosition;
  }

  public AdvancedSeasonStatDefense havoc(AdvancedSeasonStatDefenseHavoc havoc) {
    this.havoc = havoc;
    return this;
  }

  /**
   * Get havoc
   * @return havoc
  */
  @Valid 
  @Schema(name = "havoc", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("havoc")
  public AdvancedSeasonStatDefenseHavoc getHavoc() {
    return havoc;
  }

  public void setHavoc(AdvancedSeasonStatDefenseHavoc havoc) {
    this.havoc = havoc;
  }

  public AdvancedSeasonStatDefense lineYards(BigDecimal lineYards) {
    this.lineYards = lineYards;
    return this;
  }

  /**
   * Get lineYards
   * @return lineYards
  */
  @Valid 
  @Schema(name = "lineYards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineYards")
  public BigDecimal getLineYards() {
    return lineYards;
  }

  public void setLineYards(BigDecimal lineYards) {
    this.lineYards = lineYards;
  }

  public AdvancedSeasonStatDefense lineYardsTotal(BigDecimal lineYardsTotal) {
    this.lineYardsTotal = lineYardsTotal;
    return this;
  }

  /**
   * Get lineYardsTotal
   * @return lineYardsTotal
  */
  @Valid 
  @Schema(name = "lineYardsTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lineYardsTotal")
  public BigDecimal getLineYardsTotal() {
    return lineYardsTotal;
  }

  public void setLineYardsTotal(BigDecimal lineYardsTotal) {
    this.lineYardsTotal = lineYardsTotal;
  }

  public AdvancedSeasonStatDefense openFieldYards(BigDecimal openFieldYards) {
    this.openFieldYards = openFieldYards;
    return this;
  }

  /**
   * Get openFieldYards
   * @return openFieldYards
  */
  @Valid 
  @Schema(name = "openFieldYards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openFieldYards")
  public BigDecimal getOpenFieldYards() {
    return openFieldYards;
  }

  public void setOpenFieldYards(BigDecimal openFieldYards) {
    this.openFieldYards = openFieldYards;
  }

  public AdvancedSeasonStatDefense openFieldYardsTotal(Integer openFieldYardsTotal) {
    this.openFieldYardsTotal = openFieldYardsTotal;
    return this;
  }

  /**
   * Get openFieldYardsTotal
   * @return openFieldYardsTotal
  */
  
  @Schema(name = "openFieldYardsTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("openFieldYardsTotal")
  public Integer getOpenFieldYardsTotal() {
    return openFieldYardsTotal;
  }

  public void setOpenFieldYardsTotal(Integer openFieldYardsTotal) {
    this.openFieldYardsTotal = openFieldYardsTotal;
  }

  public AdvancedSeasonStatDefense passingDowns(AdvancedSeasonStatDefensePassingDowns passingDowns) {
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
  public AdvancedSeasonStatDefensePassingDowns getPassingDowns() {
    return passingDowns;
  }

  public void setPassingDowns(AdvancedSeasonStatDefensePassingDowns passingDowns) {
    this.passingDowns = passingDowns;
  }

  public AdvancedSeasonStatDefense passingPlays(AdvancedSeasonStatDefensePassingPlays passingPlays) {
    this.passingPlays = passingPlays;
    return this;
  }

  /**
   * Get passingPlays
   * @return passingPlays
  */
  @Valid 
  @Schema(name = "passingPlays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passingPlays")
  public AdvancedSeasonStatDefensePassingPlays getPassingPlays() {
    return passingPlays;
  }

  public void setPassingPlays(AdvancedSeasonStatDefensePassingPlays passingPlays) {
    this.passingPlays = passingPlays;
  }

  public AdvancedSeasonStatDefense plays(Integer plays) {
    this.plays = plays;
    return this;
  }

  /**
   * Get plays
   * @return plays
  */
  
  @Schema(name = "plays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plays")
  public Integer getPlays() {
    return plays;
  }

  public void setPlays(Integer plays) {
    this.plays = plays;
  }

  public AdvancedSeasonStatDefense pointsPerOpportunity(BigDecimal pointsPerOpportunity) {
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

  public AdvancedSeasonStatDefense powerSuccess(BigDecimal powerSuccess) {
    this.powerSuccess = powerSuccess;
    return this;
  }

  /**
   * Get powerSuccess
   * @return powerSuccess
  */
  @Valid 
  @Schema(name = "powerSuccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("powerSuccess")
  public BigDecimal getPowerSuccess() {
    return powerSuccess;
  }

  public void setPowerSuccess(BigDecimal powerSuccess) {
    this.powerSuccess = powerSuccess;
  }

  public AdvancedSeasonStatDefense ppa(BigDecimal ppa) {
    this.ppa = ppa;
    return this;
  }

  /**
   * Get ppa
   * @return ppa
  */
  @Valid 
  @Schema(name = "ppa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ppa")
  public BigDecimal getPpa() {
    return ppa;
  }

  public void setPpa(BigDecimal ppa) {
    this.ppa = ppa;
  }

  public AdvancedSeasonStatDefense rushingPlays(AdvancedSeasonStatDefensePassingPlays rushingPlays) {
    this.rushingPlays = rushingPlays;
    return this;
  }

  /**
   * Get rushingPlays
   * @return rushingPlays
  */
  @Valid 
  @Schema(name = "rushingPlays", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rushingPlays")
  public AdvancedSeasonStatDefensePassingPlays getRushingPlays() {
    return rushingPlays;
  }

  public void setRushingPlays(AdvancedSeasonStatDefensePassingPlays rushingPlays) {
    this.rushingPlays = rushingPlays;
  }

  public AdvancedSeasonStatDefense secondLevelYards(BigDecimal secondLevelYards) {
    this.secondLevelYards = secondLevelYards;
    return this;
  }

  /**
   * Get secondLevelYards
   * @return secondLevelYards
  */
  @Valid 
  @Schema(name = "secondLevelYards", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondLevelYards")
  public BigDecimal getSecondLevelYards() {
    return secondLevelYards;
  }

  public void setSecondLevelYards(BigDecimal secondLevelYards) {
    this.secondLevelYards = secondLevelYards;
  }

  public AdvancedSeasonStatDefense secondLevelYardsTotal(Integer secondLevelYardsTotal) {
    this.secondLevelYardsTotal = secondLevelYardsTotal;
    return this;
  }

  /**
   * Get secondLevelYardsTotal
   * @return secondLevelYardsTotal
  */
  
  @Schema(name = "secondLevelYardsTotal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondLevelYardsTotal")
  public Integer getSecondLevelYardsTotal() {
    return secondLevelYardsTotal;
  }

  public void setSecondLevelYardsTotal(Integer secondLevelYardsTotal) {
    this.secondLevelYardsTotal = secondLevelYardsTotal;
  }

  public AdvancedSeasonStatDefense standardDowns(AdvancedSeasonStatDefensePassingDowns standardDowns) {
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
  public AdvancedSeasonStatDefensePassingDowns getStandardDowns() {
    return standardDowns;
  }

  public void setStandardDowns(AdvancedSeasonStatDefensePassingDowns standardDowns) {
    this.standardDowns = standardDowns;
  }

  public AdvancedSeasonStatDefense stuffRate(BigDecimal stuffRate) {
    this.stuffRate = stuffRate;
    return this;
  }

  /**
   * Get stuffRate
   * @return stuffRate
  */
  @Valid 
  @Schema(name = "stuffRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stuffRate")
  public BigDecimal getStuffRate() {
    return stuffRate;
  }

  public void setStuffRate(BigDecimal stuffRate) {
    this.stuffRate = stuffRate;
  }

  public AdvancedSeasonStatDefense successRate(BigDecimal successRate) {
    this.successRate = successRate;
    return this;
  }

  /**
   * Get successRate
   * @return successRate
  */
  @Valid 
  @Schema(name = "successRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("successRate")
  public BigDecimal getSuccessRate() {
    return successRate;
  }

  public void setSuccessRate(BigDecimal successRate) {
    this.successRate = successRate;
  }

  public AdvancedSeasonStatDefense totalOpportunies(Integer totalOpportunies) {
    this.totalOpportunies = totalOpportunies;
    return this;
  }

  /**
   * Get totalOpportunies
   * @return totalOpportunies
  */
  
  @Schema(name = "totalOpportunies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalOpportunies")
  public Integer getTotalOpportunies() {
    return totalOpportunies;
  }

  public void setTotalOpportunies(Integer totalOpportunies) {
    this.totalOpportunies = totalOpportunies;
  }

  public AdvancedSeasonStatDefense totalPPA(BigDecimal totalPPA) {
    this.totalPPA = totalPPA;
    return this;
  }

  /**
   * Get totalPPA
   * @return totalPPA
  */
  @Valid 
  @Schema(name = "totalPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPPA")
  public BigDecimal getTotalPPA() {
    return totalPPA;
  }

  public void setTotalPPA(BigDecimal totalPPA) {
    this.totalPPA = totalPPA;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedSeasonStatDefense advancedSeasonStatDefense = (AdvancedSeasonStatDefense) o;
    return Objects.equals(this.drives, advancedSeasonStatDefense.drives) &&
        Objects.equals(this.explosiveness, advancedSeasonStatDefense.explosiveness) &&
        Objects.equals(this.fieldPosition, advancedSeasonStatDefense.fieldPosition) &&
        Objects.equals(this.havoc, advancedSeasonStatDefense.havoc) &&
        Objects.equals(this.lineYards, advancedSeasonStatDefense.lineYards) &&
        Objects.equals(this.lineYardsTotal, advancedSeasonStatDefense.lineYardsTotal) &&
        Objects.equals(this.openFieldYards, advancedSeasonStatDefense.openFieldYards) &&
        Objects.equals(this.openFieldYardsTotal, advancedSeasonStatDefense.openFieldYardsTotal) &&
        Objects.equals(this.passingDowns, advancedSeasonStatDefense.passingDowns) &&
        Objects.equals(this.passingPlays, advancedSeasonStatDefense.passingPlays) &&
        Objects.equals(this.plays, advancedSeasonStatDefense.plays) &&
        Objects.equals(this.pointsPerOpportunity, advancedSeasonStatDefense.pointsPerOpportunity) &&
        Objects.equals(this.powerSuccess, advancedSeasonStatDefense.powerSuccess) &&
        Objects.equals(this.ppa, advancedSeasonStatDefense.ppa) &&
        Objects.equals(this.rushingPlays, advancedSeasonStatDefense.rushingPlays) &&
        Objects.equals(this.secondLevelYards, advancedSeasonStatDefense.secondLevelYards) &&
        Objects.equals(this.secondLevelYardsTotal, advancedSeasonStatDefense.secondLevelYardsTotal) &&
        Objects.equals(this.standardDowns, advancedSeasonStatDefense.standardDowns) &&
        Objects.equals(this.stuffRate, advancedSeasonStatDefense.stuffRate) &&
        Objects.equals(this.successRate, advancedSeasonStatDefense.successRate) &&
        Objects.equals(this.totalOpportunies, advancedSeasonStatDefense.totalOpportunies) &&
        Objects.equals(this.totalPPA, advancedSeasonStatDefense.totalPPA);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drives, explosiveness, fieldPosition, havoc, lineYards, lineYardsTotal, openFieldYards, openFieldYardsTotal, passingDowns, passingPlays, plays, pointsPerOpportunity, powerSuccess, ppa, rushingPlays, secondLevelYards, secondLevelYardsTotal, standardDowns, stuffRate, successRate, totalOpportunies, totalPPA);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedSeasonStatDefense {\n");
    sb.append("    drives: ").append(toIndentedString(drives)).append("\n");
    sb.append("    explosiveness: ").append(toIndentedString(explosiveness)).append("\n");
    sb.append("    fieldPosition: ").append(toIndentedString(fieldPosition)).append("\n");
    sb.append("    havoc: ").append(toIndentedString(havoc)).append("\n");
    sb.append("    lineYards: ").append(toIndentedString(lineYards)).append("\n");
    sb.append("    lineYardsTotal: ").append(toIndentedString(lineYardsTotal)).append("\n");
    sb.append("    openFieldYards: ").append(toIndentedString(openFieldYards)).append("\n");
    sb.append("    openFieldYardsTotal: ").append(toIndentedString(openFieldYardsTotal)).append("\n");
    sb.append("    passingDowns: ").append(toIndentedString(passingDowns)).append("\n");
    sb.append("    passingPlays: ").append(toIndentedString(passingPlays)).append("\n");
    sb.append("    plays: ").append(toIndentedString(plays)).append("\n");
    sb.append("    pointsPerOpportunity: ").append(toIndentedString(pointsPerOpportunity)).append("\n");
    sb.append("    powerSuccess: ").append(toIndentedString(powerSuccess)).append("\n");
    sb.append("    ppa: ").append(toIndentedString(ppa)).append("\n");
    sb.append("    rushingPlays: ").append(toIndentedString(rushingPlays)).append("\n");
    sb.append("    secondLevelYards: ").append(toIndentedString(secondLevelYards)).append("\n");
    sb.append("    secondLevelYardsTotal: ").append(toIndentedString(secondLevelYardsTotal)).append("\n");
    sb.append("    standardDowns: ").append(toIndentedString(standardDowns)).append("\n");
    sb.append("    stuffRate: ").append(toIndentedString(stuffRate)).append("\n");
    sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
    sb.append("    totalOpportunies: ").append(toIndentedString(totalOpportunies)).append("\n");
    sb.append("    totalPPA: ").append(toIndentedString(totalPPA)).append("\n");
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

