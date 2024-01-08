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
 * GoalRemoveSubgoalRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalRemoveSubgoalRequest {

  private String subgoal;

  public GoalRemoveSubgoalRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoalRemoveSubgoalRequest(String subgoal) {
    this.subgoal = subgoal;
  }

  public GoalRemoveSubgoalRequest subgoal(String subgoal) {
    this.subgoal = subgoal;
    return this;
  }

  /**
   * The goal gid to remove as subgoal from the parent goal
   * @return subgoal
  */
  @NotNull 
  @Schema(name = "subgoal", example = "1331", description = "The goal gid to remove as subgoal from the parent goal", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("subgoal")
  public String getSubgoal() {
    return subgoal;
  }

  public void setSubgoal(String subgoal) {
    this.subgoal = subgoal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalRemoveSubgoalRequest goalRemoveSubgoalRequest = (GoalRemoveSubgoalRequest) o;
    return Objects.equals(this.subgoal, goalRemoveSubgoalRequest.subgoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subgoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalRemoveSubgoalRequest {\n");
    sb.append("    subgoal: ").append(toIndentedString(subgoal)).append("\n");
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

