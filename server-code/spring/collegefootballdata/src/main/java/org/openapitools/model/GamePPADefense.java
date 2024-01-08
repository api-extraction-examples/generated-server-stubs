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
 * GamePPADefense
 */

@JsonTypeName("GamePPA_defense")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class GamePPADefense {

  private BigDecimal firstDown;

  private BigDecimal overall;

  private BigDecimal passing;

  private BigDecimal rushing;

  private BigDecimal secondDown;

  private BigDecimal thirdDown;

  public GamePPADefense firstDown(BigDecimal firstDown) {
    this.firstDown = firstDown;
    return this;
  }

  /**
   * Get firstDown
   * @return firstDown
  */
  @Valid 
  @Schema(name = "firstDown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstDown")
  public BigDecimal getFirstDown() {
    return firstDown;
  }

  public void setFirstDown(BigDecimal firstDown) {
    this.firstDown = firstDown;
  }

  public GamePPADefense overall(BigDecimal overall) {
    this.overall = overall;
    return this;
  }

  /**
   * Get overall
   * @return overall
  */
  @Valid 
  @Schema(name = "overall", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("overall")
  public BigDecimal getOverall() {
    return overall;
  }

  public void setOverall(BigDecimal overall) {
    this.overall = overall;
  }

  public GamePPADefense passing(BigDecimal passing) {
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

  public GamePPADefense rushing(BigDecimal rushing) {
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

  public GamePPADefense secondDown(BigDecimal secondDown) {
    this.secondDown = secondDown;
    return this;
  }

  /**
   * Get secondDown
   * @return secondDown
  */
  @Valid 
  @Schema(name = "secondDown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("secondDown")
  public BigDecimal getSecondDown() {
    return secondDown;
  }

  public void setSecondDown(BigDecimal secondDown) {
    this.secondDown = secondDown;
  }

  public GamePPADefense thirdDown(BigDecimal thirdDown) {
    this.thirdDown = thirdDown;
    return this;
  }

  /**
   * Get thirdDown
   * @return thirdDown
  */
  @Valid 
  @Schema(name = "thirdDown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thirdDown")
  public BigDecimal getThirdDown() {
    return thirdDown;
  }

  public void setThirdDown(BigDecimal thirdDown) {
    this.thirdDown = thirdDown;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GamePPADefense gamePPADefense = (GamePPADefense) o;
    return Objects.equals(this.firstDown, gamePPADefense.firstDown) &&
        Objects.equals(this.overall, gamePPADefense.overall) &&
        Objects.equals(this.passing, gamePPADefense.passing) &&
        Objects.equals(this.rushing, gamePPADefense.rushing) &&
        Objects.equals(this.secondDown, gamePPADefense.secondDown) &&
        Objects.equals(this.thirdDown, gamePPADefense.thirdDown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstDown, overall, passing, rushing, secondDown, thirdDown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GamePPADefense {\n");
    sb.append("    firstDown: ").append(toIndentedString(firstDown)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    passing: ").append(toIndentedString(passing)).append("\n");
    sb.append("    rushing: ").append(toIndentedString(rushing)).append("\n");
    sb.append("    secondDown: ").append(toIndentedString(secondDown)).append("\n");
    sb.append("    thirdDown: ").append(toIndentedString(thirdDown)).append("\n");
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

