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
 * ConferenceSPRatingOffense
 */

@JsonTypeName("ConferenceSPRating_offense")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class ConferenceSPRatingOffense {

  private BigDecimal explosiveness;

  private BigDecimal pace;

  private BigDecimal passing;

  private BigDecimal passingDowns;

  private BigDecimal rating;

  private BigDecimal runRate;

  private BigDecimal rushing;

  private BigDecimal standardDowns;

  private BigDecimal success;

  public ConferenceSPRatingOffense explosiveness(BigDecimal explosiveness) {
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

  public ConferenceSPRatingOffense pace(BigDecimal pace) {
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

  public ConferenceSPRatingOffense passing(BigDecimal passing) {
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

  public ConferenceSPRatingOffense passingDowns(BigDecimal passingDowns) {
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

  public ConferenceSPRatingOffense rating(BigDecimal rating) {
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

  public ConferenceSPRatingOffense runRate(BigDecimal runRate) {
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

  public ConferenceSPRatingOffense rushing(BigDecimal rushing) {
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

  public ConferenceSPRatingOffense standardDowns(BigDecimal standardDowns) {
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

  public ConferenceSPRatingOffense success(BigDecimal success) {
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
    ConferenceSPRatingOffense conferenceSPRatingOffense = (ConferenceSPRatingOffense) o;
    return Objects.equals(this.explosiveness, conferenceSPRatingOffense.explosiveness) &&
        Objects.equals(this.pace, conferenceSPRatingOffense.pace) &&
        Objects.equals(this.passing, conferenceSPRatingOffense.passing) &&
        Objects.equals(this.passingDowns, conferenceSPRatingOffense.passingDowns) &&
        Objects.equals(this.rating, conferenceSPRatingOffense.rating) &&
        Objects.equals(this.runRate, conferenceSPRatingOffense.runRate) &&
        Objects.equals(this.rushing, conferenceSPRatingOffense.rushing) &&
        Objects.equals(this.standardDowns, conferenceSPRatingOffense.standardDowns) &&
        Objects.equals(this.success, conferenceSPRatingOffense.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(explosiveness, pace, passing, passingDowns, rating, runRate, rushing, standardDowns, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceSPRatingOffense {\n");
    sb.append("    explosiveness: ").append(toIndentedString(explosiveness)).append("\n");
    sb.append("    pace: ").append(toIndentedString(pace)).append("\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
    sb.append("    passingDowns: ").append(toIndentedString(passingDowns)).append("\n");
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

