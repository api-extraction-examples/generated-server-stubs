package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import org.openapitools.model.AdvancedSeasonStatDefenseHavoc;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConferenceSPRatingDefense
 */

@JsonTypeName("ConferenceSPRating_defense")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class ConferenceSPRatingDefense {

  private BigDecimal explosiveness;

  private AdvancedSeasonStatDefenseHavoc havoc;

  private BigDecimal pasing;

  private BigDecimal passingDowns;

  private BigDecimal rating;

  private BigDecimal rushing;

  private BigDecimal standardDowns;

  private BigDecimal success;

  public ConferenceSPRatingDefense explosiveness(BigDecimal explosiveness) {
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

  public ConferenceSPRatingDefense havoc(AdvancedSeasonStatDefenseHavoc havoc) {
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

  public ConferenceSPRatingDefense pasing(BigDecimal pasing) {
    this.pasing = pasing;
    return this;
  }

  /**
   * Get pasing
   * @return pasing
  */
  @Valid 
  @Schema(name = "pasing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pasing")
  public BigDecimal getPasing() {
    return pasing;
  }

  public void setPasing(BigDecimal pasing) {
    this.pasing = pasing;
  }

  public ConferenceSPRatingDefense passingDowns(BigDecimal passingDowns) {
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

  public ConferenceSPRatingDefense rating(BigDecimal rating) {
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

  public ConferenceSPRatingDefense rushing(BigDecimal rushing) {
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

  public ConferenceSPRatingDefense standardDowns(BigDecimal standardDowns) {
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

  public ConferenceSPRatingDefense success(BigDecimal success) {
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
    ConferenceSPRatingDefense conferenceSPRatingDefense = (ConferenceSPRatingDefense) o;
    return Objects.equals(this.explosiveness, conferenceSPRatingDefense.explosiveness) &&
        Objects.equals(this.havoc, conferenceSPRatingDefense.havoc) &&
        Objects.equals(this.pasing, conferenceSPRatingDefense.pasing) &&
        Objects.equals(this.passingDowns, conferenceSPRatingDefense.passingDowns) &&
        Objects.equals(this.rating, conferenceSPRatingDefense.rating) &&
        Objects.equals(this.rushing, conferenceSPRatingDefense.rushing) &&
        Objects.equals(this.standardDowns, conferenceSPRatingDefense.standardDowns) &&
        Objects.equals(this.success, conferenceSPRatingDefense.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(explosiveness, havoc, pasing, passingDowns, rating, rushing, standardDowns, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConferenceSPRatingDefense {\n");
    sb.append("    explosiveness: ").append(toIndentedString(explosiveness)).append("\n");
    sb.append("    havoc: ").append(toIndentedString(havoc)).append("\n");
    sb.append("    pasing: ").append(toIndentedString(pasing)).append("\n");
    sb.append("    passingDowns: ").append(toIndentedString(passingDowns)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

