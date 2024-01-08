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
 * PlayerGamePPAAveragePPA
 */

@JsonTypeName("PlayerGamePPA_averagePPA")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerGamePPAAveragePPA {

  private BigDecimal all;

  private BigDecimal pass;

  private BigDecimal rush;

  public PlayerGamePPAAveragePPA all(BigDecimal all) {
    this.all = all;
    return this;
  }

  /**
   * Get all
   * @return all
  */
  @Valid 
  @Schema(name = "all", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("all")
  public BigDecimal getAll() {
    return all;
  }

  public void setAll(BigDecimal all) {
    this.all = all;
  }

  public PlayerGamePPAAveragePPA pass(BigDecimal pass) {
    this.pass = pass;
    return this;
  }

  /**
   * Get pass
   * @return pass
  */
  @Valid 
  @Schema(name = "pass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pass")
  public BigDecimal getPass() {
    return pass;
  }

  public void setPass(BigDecimal pass) {
    this.pass = pass;
  }

  public PlayerGamePPAAveragePPA rush(BigDecimal rush) {
    this.rush = rush;
    return this;
  }

  /**
   * Get rush
   * @return rush
  */
  @Valid 
  @Schema(name = "rush", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rush")
  public BigDecimal getRush() {
    return rush;
  }

  public void setRush(BigDecimal rush) {
    this.rush = rush;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayerGamePPAAveragePPA playerGamePPAAveragePPA = (PlayerGamePPAAveragePPA) o;
    return Objects.equals(this.all, playerGamePPAAveragePPA.all) &&
        Objects.equals(this.pass, playerGamePPAAveragePPA.pass) &&
        Objects.equals(this.rush, playerGamePPAAveragePPA.rush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, pass, rush);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerGamePPAAveragePPA {\n");
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    rush: ").append(toIndentedString(rush)).append("\n");
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

