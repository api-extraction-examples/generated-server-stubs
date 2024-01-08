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
 * ReturningProduction
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class ReturningProduction {

  private String conference;

  private BigDecimal passingUsage;

  private BigDecimal percentPPA;

  private BigDecimal percentPassingPPA;

  private BigDecimal percentReceivingPPA;

  private BigDecimal percentRushingPPA;

  private BigDecimal receivingUsage;

  private BigDecimal rushingUsage;

  private Integer season;

  private String team;

  private BigDecimal totalPPA;

  private BigDecimal totalPassingPPA;

  private BigDecimal totalReceivingPPA;

  private BigDecimal totalRushingPPA;

  private BigDecimal usage;

  public ReturningProduction conference(String conference) {
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

  public ReturningProduction passingUsage(BigDecimal passingUsage) {
    this.passingUsage = passingUsage;
    return this;
  }

  /**
   * Get passingUsage
   * @return passingUsage
  */
  @Valid 
  @Schema(name = "passingUsage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("passingUsage")
  public BigDecimal getPassingUsage() {
    return passingUsage;
  }

  public void setPassingUsage(BigDecimal passingUsage) {
    this.passingUsage = passingUsage;
  }

  public ReturningProduction percentPPA(BigDecimal percentPPA) {
    this.percentPPA = percentPPA;
    return this;
  }

  /**
   * Get percentPPA
   * @return percentPPA
  */
  @Valid 
  @Schema(name = "percentPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentPPA")
  public BigDecimal getPercentPPA() {
    return percentPPA;
  }

  public void setPercentPPA(BigDecimal percentPPA) {
    this.percentPPA = percentPPA;
  }

  public ReturningProduction percentPassingPPA(BigDecimal percentPassingPPA) {
    this.percentPassingPPA = percentPassingPPA;
    return this;
  }

  /**
   * Get percentPassingPPA
   * @return percentPassingPPA
  */
  @Valid 
  @Schema(name = "percentPassingPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentPassingPPA")
  public BigDecimal getPercentPassingPPA() {
    return percentPassingPPA;
  }

  public void setPercentPassingPPA(BigDecimal percentPassingPPA) {
    this.percentPassingPPA = percentPassingPPA;
  }

  public ReturningProduction percentReceivingPPA(BigDecimal percentReceivingPPA) {
    this.percentReceivingPPA = percentReceivingPPA;
    return this;
  }

  /**
   * Get percentReceivingPPA
   * @return percentReceivingPPA
  */
  @Valid 
  @Schema(name = "percentReceivingPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentReceivingPPA")
  public BigDecimal getPercentReceivingPPA() {
    return percentReceivingPPA;
  }

  public void setPercentReceivingPPA(BigDecimal percentReceivingPPA) {
    this.percentReceivingPPA = percentReceivingPPA;
  }

  public ReturningProduction percentRushingPPA(BigDecimal percentRushingPPA) {
    this.percentRushingPPA = percentRushingPPA;
    return this;
  }

  /**
   * Get percentRushingPPA
   * @return percentRushingPPA
  */
  @Valid 
  @Schema(name = "percentRushingPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percentRushingPPA")
  public BigDecimal getPercentRushingPPA() {
    return percentRushingPPA;
  }

  public void setPercentRushingPPA(BigDecimal percentRushingPPA) {
    this.percentRushingPPA = percentRushingPPA;
  }

  public ReturningProduction receivingUsage(BigDecimal receivingUsage) {
    this.receivingUsage = receivingUsage;
    return this;
  }

  /**
   * Get receivingUsage
   * @return receivingUsage
  */
  @Valid 
  @Schema(name = "receivingUsage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("receivingUsage")
  public BigDecimal getReceivingUsage() {
    return receivingUsage;
  }

  public void setReceivingUsage(BigDecimal receivingUsage) {
    this.receivingUsage = receivingUsage;
  }

  public ReturningProduction rushingUsage(BigDecimal rushingUsage) {
    this.rushingUsage = rushingUsage;
    return this;
  }

  /**
   * Get rushingUsage
   * @return rushingUsage
  */
  @Valid 
  @Schema(name = "rushingUsage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rushingUsage")
  public BigDecimal getRushingUsage() {
    return rushingUsage;
  }

  public void setRushingUsage(BigDecimal rushingUsage) {
    this.rushingUsage = rushingUsage;
  }

  public ReturningProduction season(Integer season) {
    this.season = season;
    return this;
  }

  /**
   * Get season
   * @return season
  */
  
  @Schema(name = "season", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("season")
  public Integer getSeason() {
    return season;
  }

  public void setSeason(Integer season) {
    this.season = season;
  }

  public ReturningProduction team(String team) {
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

  public ReturningProduction totalPPA(BigDecimal totalPPA) {
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

  public ReturningProduction totalPassingPPA(BigDecimal totalPassingPPA) {
    this.totalPassingPPA = totalPassingPPA;
    return this;
  }

  /**
   * Get totalPassingPPA
   * @return totalPassingPPA
  */
  @Valid 
  @Schema(name = "totalPassingPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalPassingPPA")
  public BigDecimal getTotalPassingPPA() {
    return totalPassingPPA;
  }

  public void setTotalPassingPPA(BigDecimal totalPassingPPA) {
    this.totalPassingPPA = totalPassingPPA;
  }

  public ReturningProduction totalReceivingPPA(BigDecimal totalReceivingPPA) {
    this.totalReceivingPPA = totalReceivingPPA;
    return this;
  }

  /**
   * Get totalReceivingPPA
   * @return totalReceivingPPA
  */
  @Valid 
  @Schema(name = "totalReceivingPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalReceivingPPA")
  public BigDecimal getTotalReceivingPPA() {
    return totalReceivingPPA;
  }

  public void setTotalReceivingPPA(BigDecimal totalReceivingPPA) {
    this.totalReceivingPPA = totalReceivingPPA;
  }

  public ReturningProduction totalRushingPPA(BigDecimal totalRushingPPA) {
    this.totalRushingPPA = totalRushingPPA;
    return this;
  }

  /**
   * Get totalRushingPPA
   * @return totalRushingPPA
  */
  @Valid 
  @Schema(name = "totalRushingPPA", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRushingPPA")
  public BigDecimal getTotalRushingPPA() {
    return totalRushingPPA;
  }

  public void setTotalRushingPPA(BigDecimal totalRushingPPA) {
    this.totalRushingPPA = totalRushingPPA;
  }

  public ReturningProduction usage(BigDecimal usage) {
    this.usage = usage;
    return this;
  }

  /**
   * Get usage
   * @return usage
  */
  @Valid 
  @Schema(name = "usage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage")
  public BigDecimal getUsage() {
    return usage;
  }

  public void setUsage(BigDecimal usage) {
    this.usage = usage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturningProduction returningProduction = (ReturningProduction) o;
    return Objects.equals(this.conference, returningProduction.conference) &&
        Objects.equals(this.passingUsage, returningProduction.passingUsage) &&
        Objects.equals(this.percentPPA, returningProduction.percentPPA) &&
        Objects.equals(this.percentPassingPPA, returningProduction.percentPassingPPA) &&
        Objects.equals(this.percentReceivingPPA, returningProduction.percentReceivingPPA) &&
        Objects.equals(this.percentRushingPPA, returningProduction.percentRushingPPA) &&
        Objects.equals(this.receivingUsage, returningProduction.receivingUsage) &&
        Objects.equals(this.rushingUsage, returningProduction.rushingUsage) &&
        Objects.equals(this.season, returningProduction.season) &&
        Objects.equals(this.team, returningProduction.team) &&
        Objects.equals(this.totalPPA, returningProduction.totalPPA) &&
        Objects.equals(this.totalPassingPPA, returningProduction.totalPassingPPA) &&
        Objects.equals(this.totalReceivingPPA, returningProduction.totalReceivingPPA) &&
        Objects.equals(this.totalRushingPPA, returningProduction.totalRushingPPA) &&
        Objects.equals(this.usage, returningProduction.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conference, passingUsage, percentPPA, percentPassingPPA, percentReceivingPPA, percentRushingPPA, receivingUsage, rushingUsage, season, team, totalPPA, totalPassingPPA, totalReceivingPPA, totalRushingPPA, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReturningProduction {\n");
    sb.append("    conference: ").append(toIndentedString(conference)).append("\n");
    sb.append("    passingUsage: ").append(toIndentedString(passingUsage)).append("\n");
    sb.append("    percentPPA: ").append(toIndentedString(percentPPA)).append("\n");
    sb.append("    percentPassingPPA: ").append(toIndentedString(percentPassingPPA)).append("\n");
    sb.append("    percentReceivingPPA: ").append(toIndentedString(percentReceivingPPA)).append("\n");
    sb.append("    percentRushingPPA: ").append(toIndentedString(percentRushingPPA)).append("\n");
    sb.append("    receivingUsage: ").append(toIndentedString(receivingUsage)).append("\n");
    sb.append("    rushingUsage: ").append(toIndentedString(rushingUsage)).append("\n");
    sb.append("    season: ").append(toIndentedString(season)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
    sb.append("    totalPPA: ").append(toIndentedString(totalPPA)).append("\n");
    sb.append("    totalPassingPPA: ").append(toIndentedString(totalPassingPPA)).append("\n");
    sb.append("    totalReceivingPPA: ").append(toIndentedString(totalReceivingPPA)).append("\n");
    sb.append("    totalRushingPPA: ").append(toIndentedString(totalRushingPPA)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

