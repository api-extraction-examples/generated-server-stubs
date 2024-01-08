package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Clause;
import org.openapitools.model.Rollout;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Rule
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Rule {

  private String id;

  @Valid
  private List<@Valid Clause> clauses;

  private String description;

  private Rollout rollout;

  private Boolean trackEvents;

  private Integer variation;

  public Rule id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Rule clauses(List<@Valid Clause> clauses) {
    this.clauses = clauses;
    return this;
  }

  public Rule addClausesItem(Clause clausesItem) {
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

  public Rule description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Rule rollout(Rollout rollout) {
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

  public Rule trackEvents(Boolean trackEvents) {
    this.trackEvents = trackEvents;
    return this;
  }

  /**
   * Get trackEvents
   * @return trackEvents
  */
  
  @Schema(name = "trackEvents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trackEvents")
  public Boolean getTrackEvents() {
    return trackEvents;
  }

  public void setTrackEvents(Boolean trackEvents) {
    this.trackEvents = trackEvents;
  }

  public Rule variation(Integer variation) {
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
    Rule rule = (Rule) o;
    return Objects.equals(this.id, rule.id) &&
        Objects.equals(this.clauses, rule.clauses) &&
        Objects.equals(this.description, rule.description) &&
        Objects.equals(this.rollout, rule.rollout) &&
        Objects.equals(this.trackEvents, rule.trackEvents) &&
        Objects.equals(this.variation, rule.variation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, clauses, description, rollout, trackEvents, variation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    clauses: ").append(toIndentedString(clauses)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rollout: ").append(toIndentedString(rollout)).append("\n");
    sb.append("    trackEvents: ").append(toIndentedString(trackEvents)).append("\n");
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

