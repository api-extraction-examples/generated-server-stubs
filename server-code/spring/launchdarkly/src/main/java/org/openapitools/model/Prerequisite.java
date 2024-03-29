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
 * Prerequisite
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Prerequisite {

  private String key;

  private Integer variation;

  public Prerequisite key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public Prerequisite variation(Integer variation) {
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
    Prerequisite prerequisite = (Prerequisite) o;
    return Objects.equals(this.key, prerequisite.key) &&
        Objects.equals(this.variation, prerequisite.variation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, variation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prerequisite {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

