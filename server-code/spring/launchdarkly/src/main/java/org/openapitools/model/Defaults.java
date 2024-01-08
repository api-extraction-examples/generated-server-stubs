package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Default values to be used when a new environment is created.
 */

@Schema(name = "Defaults", description = "Default values to be used when a new environment is created.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Defaults {

  private Integer offVariation;

  private Integer onVariation;

  public Defaults() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Defaults(Integer offVariation, Integer onVariation) {
    this.offVariation = offVariation;
    this.onVariation = onVariation;
  }

  public Defaults offVariation(Integer offVariation) {
    this.offVariation = offVariation;
    return this;
  }

  /**
   * The index of the variation to be served when a flag is off.
   * @return offVariation
  */
  @NotNull 
  @Schema(name = "offVariation", description = "The index of the variation to be served when a flag is off.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offVariation")
  public Integer getOffVariation() {
    return offVariation;
  }

  public void setOffVariation(Integer offVariation) {
    this.offVariation = offVariation;
  }

  public Defaults onVariation(Integer onVariation) {
    this.onVariation = onVariation;
    return this;
  }

  /**
   * The index of the variation to be served when a flag's targeting is on (default variation).
   * @return onVariation
  */
  @NotNull 
  @Schema(name = "onVariation", description = "The index of the variation to be served when a flag's targeting is on (default variation).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("onVariation")
  public Integer getOnVariation() {
    return onVariation;
  }

  public void setOnVariation(Integer onVariation) {
    this.onVariation = onVariation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Defaults defaults = (Defaults) o;
    return Objects.equals(this.offVariation, defaults.offVariation) &&
        Objects.equals(this.onVariation, defaults.onVariation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offVariation, onVariation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Defaults {\n");
    sb.append("    offVariation: ").append(toIndentedString(offVariation)).append("\n");
    sb.append("    onVariation: ").append(toIndentedString(onVariation)).append("\n");
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

