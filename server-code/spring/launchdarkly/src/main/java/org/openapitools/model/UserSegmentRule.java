package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Clause;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserSegmentRule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class UserSegmentRule {

  private String bucketBy;

  @Valid
  private List<@Valid Clause> clauses;

  private Integer weight;

  public UserSegmentRule bucketBy(String bucketBy) {
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

  public UserSegmentRule clauses(List<@Valid Clause> clauses) {
    this.clauses = clauses;
    return this;
  }

  public UserSegmentRule addClausesItem(Clause clausesItem) {
    if (this.clauses == null) {
      this.clauses = new ArrayList<>();
    }
    this.clauses.add(clausesItem);
    return this;
  }

  /**
   * Get clauses
   * @return clauses
  */
  @Valid 
  @Schema(name = "clauses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("clauses")
  public List<@Valid Clause> getClauses() {
    return clauses;
  }

  public void setClauses(List<@Valid Clause> clauses) {
    this.clauses = clauses;
  }

  public UserSegmentRule weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * @return weight
  */
  
  @Schema(name = "weight", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSegmentRule userSegmentRule = (UserSegmentRule) o;
    return Objects.equals(this.bucketBy, userSegmentRule.bucketBy) &&
        Objects.equals(this.clauses, userSegmentRule.clauses) &&
        Objects.equals(this.weight, userSegmentRule.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bucketBy, clauses, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSegmentRule {\n");
    sb.append("    bucketBy: ").append(toIndentedString(bucketBy)).append("\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

