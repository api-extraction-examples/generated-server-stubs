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
 * AdvancedGameStatDefensePassingDowns
 */

@JsonTypeName("AdvancedGameStat_defense_passingDowns")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class AdvancedGameStatDefensePassingDowns {

  private BigDecimal explosiveness;

  private BigDecimal ppa;

  private BigDecimal successRate;

  public AdvancedGameStatDefensePassingDowns explosiveness(BigDecimal explosiveness) {
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

  public AdvancedGameStatDefensePassingDowns ppa(BigDecimal ppa) {
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

  public AdvancedGameStatDefensePassingDowns successRate(BigDecimal successRate) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedGameStatDefensePassingDowns advancedGameStatDefensePassingDowns = (AdvancedGameStatDefensePassingDowns) o;
    return Objects.equals(this.explosiveness, advancedGameStatDefensePassingDowns.explosiveness) &&
        Objects.equals(this.ppa, advancedGameStatDefensePassingDowns.ppa) &&
        Objects.equals(this.successRate, advancedGameStatDefensePassingDowns.successRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(explosiveness, ppa, successRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedGameStatDefensePassingDowns {\n");
    sb.append("    explosiveness: ").append(toIndentedString(explosiveness)).append("\n");
    sb.append("    ppa: ").append(toIndentedString(ppa)).append("\n");
    sb.append("    successRate: ").append(toIndentedString(successRate)).append("\n");
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

