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
 * TeamSPRatingOffense
 */

@JsonTypeName("TeamSPRating_offense")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class TeamSPRatingOffense {

  private BigDecimal explosiveness;

  private BigDecimal pace;

  private BigDecimal passing;

  private BigDecimal passingDowns;

  private BigDecimal ranking;

  private BigDecimal rating;

  private BigDecimal runRate;

  private BigDecimal rushing;

  private BigDecimal standardDowns;

  private BigDecimal success;

  public TeamSPRatingOffense explosiveness(BigDecimal explosiveness) {
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

  public TeamSPRatingOffense pace(BigDecimal pace) {
    this.pace = pace;
    return this;
  }

  /**
   * Get pace
   * @return pace
  */
  @Valid 
  @Schema(name = "pace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pace")
  public BigDecimal getPace() {
    return pace;
  }

  public void setPace(BigDecimal pace) {
    this.pace = pace;
  }

  public TeamSPRatingOffense passing(BigDecimal passing) {
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
  public BigDecimal getPassing() {
    return passing;
  }

  public void setPassing(BigDecimal passing) {
    this.passing = passing;
  }

  public TeamSPRatingOffense passingDowns(BigDecimal passingDowns) {
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
  public BigDecimal getPassingDowns() {
    return passingDowns;
  }

  public void setPassingDowns(BigDecimal passingDowns) {
    this.passingDowns = passingDowns;
  }

  public TeamSPRatingOffense ranking(BigDecimal ranking) {
    this.ranking = ranking;
    return this;
  }

  /**
   * Get ranking
   * @return ranking
  */
  @Valid 
  @Schema(name = "ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ranking")
  public BigDecimal getRanking() {
    return ranking;
  }

  public void setRanking(BigDecimal ranking) {
    this.ranking = ranking;
  }

  public TeamSPRatingOffense rating(BigDecimal rating) {
    this.rating = rating;
    return this;
  }

  /**
   * Get rating
   * @return rating
  */
  @Valid 
  @Schema(name = "rating", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rating")
  public BigDecimal getRating() {
    return rating;
  }

  public void setRating(BigDecimal rating) {
    this.rating = rating;
  }

  public TeamSPRatingOffense runRate(BigDecimal runRate) {
    this.runRate = runRate;
    return this;
  }

  /**
   * Get runRate
   * @return runRate
  */
  @Valid 
  @Schema(name = "runRate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("runRate")
  public BigDecimal getRunRate() {
    return runRate;
  }

  public void setRunRate(BigDecimal runRate) {
    this.runRate = runRate;
  }

  public TeamSPRatingOffense rushing(BigDecimal rushing) {
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
  public BigDecimal getRushing() {
    return rushing;
  }

  public void setRushing(BigDecimal rushing) {
    this.rushing = rushing;
  }

  public TeamSPRatingOffense standardDowns(BigDecimal standardDowns) {
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
  public BigDecimal getStandardDowns() {
    return standardDowns;
  }

  public void setStandardDowns(BigDecimal standardDowns) {
    this.standardDowns = standardDowns;
  }

  public TeamSPRatingOffense success(BigDecimal success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
  */
  @Valid 
  @Schema(name = "success", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("success")
  public BigDecimal getSuccess() {
    return success;
  }

  public void setSuccess(BigDecimal success) {
    this.success = success;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSPRatingOffense teamSPRatingOffense = (TeamSPRatingOffense) o;
    return Objects.equals(this.explosiveness, teamSPRatingOffense.explosiveness) &&
        Objects.equals(this.pace, teamSPRatingOffense.pace) &&
        Objects.equals(this.passing, teamSPRatingOffense.passing) &&
        Objects.equals(this.passingDowns, teamSPRatingOffense.passingDowns) &&
        Objects.equals(this.ranking, teamSPRatingOffense.ranking) &&
        Objects.equals(this.rating, teamSPRatingOffense.rating) &&
        Objects.equals(this.runRate, teamSPRatingOffense.runRate) &&
        Objects.equals(this.rushing, teamSPRatingOffense.rushing) &&
        Objects.equals(this.standardDowns, teamSPRatingOffense.standardDowns) &&
        Objects.equals(this.success, teamSPRatingOffense.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(explosiveness, pace, passing, passingDowns, ranking, rating, runRate, rushing, standardDowns, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSPRatingOffense {\n");
    sb.append("    explosiveness: ").append(toIndentedString(explosiveness)).append("\n");
    sb.append("    pace: ").append(toIndentedString(pace)).append("\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
    sb.append("    passingDowns: ").append(toIndentedString(passingDowns)).append("\n");
    sb.append("    ranking: ").append(toIndentedString(ranking)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    runRate: ").append(toIndentedString(runRate)).append("\n");
    sb.append("    rushing: ").append(toIndentedString(rushing)).append("\n");
    sb.append("    standardDowns: ").append(toIndentedString(standardDowns)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

