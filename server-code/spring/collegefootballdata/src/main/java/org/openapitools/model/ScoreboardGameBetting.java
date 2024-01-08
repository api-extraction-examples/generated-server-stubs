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
 * ScoreboardGameBetting
 */

@JsonTypeName("ScoreboardGame_betting")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class ScoreboardGameBetting {

  private Integer awayMoneyline;

  private Integer homeMoneyline;

  private BigDecimal overUnder;

  private BigDecimal spread;

  public ScoreboardGameBetting awayMoneyline(Integer awayMoneyline) {
    this.awayMoneyline = awayMoneyline;
    return this;
  }

  /**
   * Get awayMoneyline
   * @return awayMoneyline
  */
  
  @Schema(name = "awayMoneyline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayMoneyline")
  public Integer getAwayMoneyline() {
    return awayMoneyline;
  }

  public void setAwayMoneyline(Integer awayMoneyline) {
    this.awayMoneyline = awayMoneyline;
  }

  public ScoreboardGameBetting homeMoneyline(Integer homeMoneyline) {
    this.homeMoneyline = homeMoneyline;
    return this;
  }

  /**
   * Get homeMoneyline
   * @return homeMoneyline
  */
  
  @Schema(name = "homeMoneyline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeMoneyline")
  public Integer getHomeMoneyline() {
    return homeMoneyline;
  }

  public void setHomeMoneyline(Integer homeMoneyline) {
    this.homeMoneyline = homeMoneyline;
  }

  public ScoreboardGameBetting overUnder(BigDecimal overUnder) {
    this.overUnder = overUnder;
    return this;
  }

  /**
   * Get overUnder
   * @return overUnder
  */
  @Valid 
  @Schema(name = "overUnder", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overUnder")
  public BigDecimal getOverUnder() {
    return overUnder;
  }

  public void setOverUnder(BigDecimal overUnder) {
    this.overUnder = overUnder;
  }

  public ScoreboardGameBetting spread(BigDecimal spread) {
    this.spread = spread;
    return this;
  }

  /**
   * Get spread
   * @return spread
  */
  @Valid 
  @Schema(name = "spread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spread")
  public BigDecimal getSpread() {
    return spread;
  }

  public void setSpread(BigDecimal spread) {
    this.spread = spread;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreboardGameBetting scoreboardGameBetting = (ScoreboardGameBetting) o;
    return Objects.equals(this.awayMoneyline, scoreboardGameBetting.awayMoneyline) &&
        Objects.equals(this.homeMoneyline, scoreboardGameBetting.homeMoneyline) &&
        Objects.equals(this.overUnder, scoreboardGameBetting.overUnder) &&
        Objects.equals(this.spread, scoreboardGameBetting.spread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayMoneyline, homeMoneyline, overUnder, spread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreboardGameBetting {\n");
    sb.append("    awayMoneyline: ").append(toIndentedString(awayMoneyline)).append("\n");
    sb.append("    homeMoneyline: ").append(toIndentedString(homeMoneyline)).append("\n");
    sb.append("    overUnder: ").append(toIndentedString(overUnder)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
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

