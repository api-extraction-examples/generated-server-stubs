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
 * RichText
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class RichText {

  private Boolean empty;

  private Boolean emptyAdf;

  private Boolean finalised;

  private Boolean valueSet;

  public RichText empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   * @return empty
  */
  
  @Schema(name = "empty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("empty")
  public Boolean getEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public RichText emptyAdf(Boolean emptyAdf) {
    this.emptyAdf = emptyAdf;
    return this;
  }

  /**
   * Get emptyAdf
   * @return emptyAdf
  */
  
  @Schema(name = "emptyAdf", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("emptyAdf")
  public Boolean getEmptyAdf() {
    return emptyAdf;
  }

  public void setEmptyAdf(Boolean emptyAdf) {
    this.emptyAdf = emptyAdf;
  }

  public RichText finalised(Boolean finalised) {
    this.finalised = finalised;
    return this;
  }

  /**
   * Get finalised
   * @return finalised
  */
  
  @Schema(name = "finalised", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("finalised")
  public Boolean getFinalised() {
    return finalised;
  }

  public void setFinalised(Boolean finalised) {
    this.finalised = finalised;
  }

  public RichText valueSet(Boolean valueSet) {
    this.valueSet = valueSet;
    return this;
  }

  /**
   * Get valueSet
   * @return valueSet
  */
  
  @Schema(name = "valueSet", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueSet")
  public Boolean getValueSet() {
    return valueSet;
  }

  public void setValueSet(Boolean valueSet) {
    this.valueSet = valueSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RichText richText = (RichText) o;
    return Objects.equals(this.empty, richText.empty) &&
        Objects.equals(this.emptyAdf, richText.emptyAdf) &&
        Objects.equals(this.finalised, richText.finalised) &&
        Objects.equals(this.valueSet, richText.valueSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(empty, emptyAdf, finalised, valueSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RichText {\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    emptyAdf: ").append(toIndentedString(emptyAdf)).append("\n");
    sb.append("    finalised: ").append(toIndentedString(finalised)).append("\n");
    sb.append("    valueSet: ").append(toIndentedString(valueSet)).append("\n");
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

