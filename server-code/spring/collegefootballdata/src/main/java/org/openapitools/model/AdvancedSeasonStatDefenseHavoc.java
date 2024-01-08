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
 * AdvancedSeasonStatDefenseHavoc
 */

@JsonTypeName("AdvancedSeasonStat_defense_havoc")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class AdvancedSeasonStatDefenseHavoc {

  private BigDecimal db;

  private BigDecimal frontSeven;

  private BigDecimal total;

  public AdvancedSeasonStatDefenseHavoc db(BigDecimal db) {
    this.db = db;
    return this;
  }

  /**
   * Get db
   * @return db
  */
  @Valid 
  @Schema(name = "db", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("db")
  public BigDecimal getDb() {
    return db;
  }

  public void setDb(BigDecimal db) {
    this.db = db;
  }

  public AdvancedSeasonStatDefenseHavoc frontSeven(BigDecimal frontSeven) {
    this.frontSeven = frontSeven;
    return this;
  }

  /**
   * Get frontSeven
   * @return frontSeven
  */
  @Valid 
  @Schema(name = "frontSeven", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("frontSeven")
  public BigDecimal getFrontSeven() {
    return frontSeven;
  }

  public void setFrontSeven(BigDecimal frontSeven) {
    this.frontSeven = frontSeven;
  }

  public AdvancedSeasonStatDefenseHavoc total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * @return total
  */
  @Valid 
  @Schema(name = "total", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvancedSeasonStatDefenseHavoc advancedSeasonStatDefenseHavoc = (AdvancedSeasonStatDefenseHavoc) o;
    return Objects.equals(this.db, advancedSeasonStatDefenseHavoc.db) &&
        Objects.equals(this.frontSeven, advancedSeasonStatDefenseHavoc.frontSeven) &&
        Objects.equals(this.total, advancedSeasonStatDefenseHavoc.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(db, frontSeven, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvancedSeasonStatDefenseHavoc {\n");
    sb.append("    db: ").append(toIndentedString(db)).append("\n");
    sb.append("    frontSeven: ").append(toIndentedString(frontSeven)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

