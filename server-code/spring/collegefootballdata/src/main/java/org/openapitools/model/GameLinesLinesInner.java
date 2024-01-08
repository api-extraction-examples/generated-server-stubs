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
 * GameLinesLinesInner
 */

@JsonTypeName("GameLines_lines_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class GameLinesLinesInner {

  private BigDecimal awayMoneyline;

  private String formattedSpread;

  private BigDecimal homeMoneyline;

  private BigDecimal overUnder;

  private BigDecimal overUnderOpen;

  private String provider;

  private BigDecimal spread;

  private BigDecimal spreadOpen;

  public GameLinesLinesInner awayMoneyline(BigDecimal awayMoneyline) {
    this.awayMoneyline = awayMoneyline;
    return this;
  }

  /**
   * Get awayMoneyline
   * @return awayMoneyline
  */
  @Valid 
  @Schema(name = "awayMoneyline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("awayMoneyline")
  public BigDecimal getAwayMoneyline() {
    return awayMoneyline;
  }

  public void setAwayMoneyline(BigDecimal awayMoneyline) {
    this.awayMoneyline = awayMoneyline;
  }

  public GameLinesLinesInner formattedSpread(String formattedSpread) {
    this.formattedSpread = formattedSpread;
    return this;
  }

  /**
   * Get formattedSpread
   * @return formattedSpread
  */
  
  @Schema(name = "formattedSpread", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("formattedSpread")
  public String getFormattedSpread() {
    return formattedSpread;
  }

  public void setFormattedSpread(String formattedSpread) {
    this.formattedSpread = formattedSpread;
  }

  public GameLinesLinesInner homeMoneyline(BigDecimal homeMoneyline) {
    this.homeMoneyline = homeMoneyline;
    return this;
  }

  /**
   * Get homeMoneyline
   * @return homeMoneyline
  */
  @Valid 
  @Schema(name = "homeMoneyline", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("homeMoneyline")
  public BigDecimal getHomeMoneyline() {
    return homeMoneyline;
  }

  public void setHomeMoneyline(BigDecimal homeMoneyline) {
    this.homeMoneyline = homeMoneyline;
  }

  public GameLinesLinesInner overUnder(BigDecimal overUnder) {
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

  public GameLinesLinesInner overUnderOpen(BigDecimal overUnderOpen) {
    this.overUnderOpen = overUnderOpen;
    return this;
  }

  /**
   * Get overUnderOpen
   * @return overUnderOpen
  */
  @Valid 
  @Schema(name = "overUnderOpen", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overUnderOpen")
  public BigDecimal getOverUnderOpen() {
    return overUnderOpen;
  }

  public void setOverUnderOpen(BigDecimal overUnderOpen) {
    this.overUnderOpen = overUnderOpen;
  }

  public GameLinesLinesInner provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
  
  @Schema(name = "provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public GameLinesLinesInner spread(BigDecimal spread) {
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

  public GameLinesLinesInner spreadOpen(BigDecimal spreadOpen) {
    this.spreadOpen = spreadOpen;
    return this;
  }

  /**
   * Get spreadOpen
   * @return spreadOpen
  */
  @Valid 
  @Schema(name = "spreadOpen", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spreadOpen")
  public BigDecimal getSpreadOpen() {
    return spreadOpen;
  }

  public void setSpreadOpen(BigDecimal spreadOpen) {
    this.spreadOpen = spreadOpen;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GameLinesLinesInner gameLinesLinesInner = (GameLinesLinesInner) o;
    return Objects.equals(this.awayMoneyline, gameLinesLinesInner.awayMoneyline) &&
        Objects.equals(this.formattedSpread, gameLinesLinesInner.formattedSpread) &&
        Objects.equals(this.homeMoneyline, gameLinesLinesInner.homeMoneyline) &&
        Objects.equals(this.overUnder, gameLinesLinesInner.overUnder) &&
        Objects.equals(this.overUnderOpen, gameLinesLinesInner.overUnderOpen) &&
        Objects.equals(this.provider, gameLinesLinesInner.provider) &&
        Objects.equals(this.spread, gameLinesLinesInner.spread) &&
        Objects.equals(this.spreadOpen, gameLinesLinesInner.spreadOpen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awayMoneyline, formattedSpread, homeMoneyline, overUnder, overUnderOpen, provider, spread, spreadOpen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GameLinesLinesInner {\n");
    sb.append("    awayMoneyline: ").append(toIndentedString(awayMoneyline)).append("\n");
    sb.append("    formattedSpread: ").append(toIndentedString(formattedSpread)).append("\n");
    sb.append("    homeMoneyline: ").append(toIndentedString(homeMoneyline)).append("\n");
    sb.append("    overUnder: ").append(toIndentedString(overUnder)).append("\n");
    sb.append("    overUnderOpen: ").append(toIndentedString(overUnderOpen)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
    sb.append("    spreadOpen: ").append(toIndentedString(spreadOpen)).append("\n");
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

