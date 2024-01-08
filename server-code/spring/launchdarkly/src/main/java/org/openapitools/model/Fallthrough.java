package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.Rollout;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Fallthrough
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Fallthrough {

  private Rollout rollout;

  private Integer variation;

  public Fallthrough rollout(Rollout rollout) {
    this.rollout = rollout;
    return this;
  }

  /**
   * Get rollout
   * @return rollout
  */
  @Valid 
  @Schema(name = "rollout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("rollout")
  public Rollout getRollout() {
    return rollout;
  }

  public void setRollout(Rollout rollout) {
    this.rollout = rollout;
  }

  public Fallthrough variation(Integer variation) {
    this.variation = variation;
    return this;
  }

  /**
   * Get variation
   * @return variation
  */
  
  @Schema(name = "variation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variation")
  public Integer getVariation() {
    return variation;
  }

  public void setVariation(Integer variation) {
    this.variation = variation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fallthrough fallthrough = (Fallthrough) o;
    return Objects.equals(this.rollout, fallthrough.rollout) &&
        Objects.equals(this.variation, fallthrough.variation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollout, variation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fallthrough {\n");
    sb.append("    rollout: ").append(toIndentedString(rollout)).append("\n");
    sb.append("    variation: ").append(toIndentedString(variation)).append("\n");
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

