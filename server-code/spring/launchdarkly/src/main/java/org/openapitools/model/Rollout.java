package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WeightedVariation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Rollout
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Rollout {

  private String bucketBy;

  @Valid
  private List<@Valid WeightedVariation> variations;

  public Rollout bucketBy(String bucketBy) {
    this.bucketBy = bucketBy;
    return this;
  }

  /**
   * Get bucketBy
   * @return bucketBy
  */
  
  @Schema(name = "bucketBy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bucketBy")
  public String getBucketBy() {
    return bucketBy;
  }

  public void setBucketBy(String bucketBy) {
    this.bucketBy = bucketBy;
  }

  public Rollout variations(List<@Valid WeightedVariation> variations) {
    this.variations = variations;
    return this;
  }

  public Rollout addVariationsItem(WeightedVariation variationsItem) {
    if (this.variations == null) {
      this.variations = new ArrayList<>();
    }
    this.variations.add(variationsItem);
    return this;
  }

  /**
   * Get variations
   * @return variations
  */
  @Valid 
  @Schema(name = "variations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variations")
  public List<@Valid WeightedVariation> getVariations() {
    return variations;
  }

  public void setVariations(List<@Valid WeightedVariation> variations) {
    this.variations = variations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rollout rollout = (Rollout) o;
    return Objects.equals(this.bucketBy, rollout.bucketBy) &&
        Objects.equals(this.variations, rollout.variations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketBy, variations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rollout {\n");
    sb.append("    bucketBy: ").append(toIndentedString(bucketBy)).append("\n");
    sb.append("    variations: ").append(toIndentedString(variations)).append("\n");
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

