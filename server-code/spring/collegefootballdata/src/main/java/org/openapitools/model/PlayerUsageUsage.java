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
 * PlayerUsageUsage
 */

@JsonTypeName("PlayerUsage_usage")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:23.773477-04:00[America/Lower_Princes]")
public class PlayerUsageUsage {

  private BigDecimal firstDown;

  private BigDecimal overall;

  private BigDecimal pass;

  private BigDecimal passingDowns;

  private BigDecimal rush;

  private BigDecimal secondDown;

  private BigDecimal standardDowns;

  private BigDecimal thirdDown;

  public PlayerUsageUsage firstDown(BigDecimal firstDown) {
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

  public PlayerUsageUsage overall(BigDecimal overall) {
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

  public PlayerUsageUsage pass(BigDecimal pass) {
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

  public PlayerUsageUsage passingDowns(BigDecimal passingDowns) {
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

  public PlayerUsageUsage rush(BigDecimal rush) {
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

  public PlayerUsageUsage secondDown(BigDecimal secondDown) {
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

  public PlayerUsageUsage standardDowns(BigDecimal standardDowns) {
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

  public PlayerUsageUsage thirdDown(BigDecimal thirdDown) {
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
    PlayerUsageUsage playerUsageUsage = (PlayerUsageUsage) o;
    return Objects.equals(this.firstDown, playerUsageUsage.firstDown) &&
        Objects.equals(this.overall, playerUsageUsage.overall) &&
        Objects.equals(this.pass, playerUsageUsage.pass) &&
        Objects.equals(this.passingDowns, playerUsageUsage.passingDowns) &&
        Objects.equals(this.rush, playerUsageUsage.rush) &&
        Objects.equals(this.secondDown, playerUsageUsage.secondDown) &&
        Objects.equals(this.standardDowns, playerUsageUsage.standardDowns) &&
        Objects.equals(this.thirdDown, playerUsageUsage.thirdDown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstDown, overall, pass, passingDowns, rush, secondDown, standardDowns, thirdDown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayerUsageUsage {\n");
    sb.append("    firstDown: ").append(toIndentedString(firstDown)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    pass: ").append(toIndentedString(pass)).append("\n");
    sb.append("    passingDowns: ").append(toIndentedString(passingDowns)).append("\n");
    sb.append("    rush: ").append(toIndentedString(rush)).append("\n");
    sb.append("    secondDown: ").append(toIndentedString(secondDown)).append("\n");
    sb.append("    standardDowns: ").append(toIndentedString(standardDowns)).append("\n");
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

