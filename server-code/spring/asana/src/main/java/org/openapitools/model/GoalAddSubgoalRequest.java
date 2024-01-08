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
 * GoalAddSubgoalRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalAddSubgoalRequest {

  private String insertAfter;

  private String insertBefore;

  private String subgoal;

  public GoalAddSubgoalRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoalAddSubgoalRequest(String subgoal) {
    this.subgoal = subgoal;
  }

  public GoalAddSubgoalRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * An id of a subgoal of this parent goal. The new subgoal will be added after the one specified here. `insert_before` and `insert_after` parameters cannot both be specified.
   * @return insertAfter
  */
  
  @Schema(name = "insert_after", example = "1331", description = "An id of a subgoal of this parent goal. The new subgoal will be added after the one specified here. `insert_before` and `insert_after` parameters cannot both be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public GoalAddSubgoalRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * An id of a subgoal of this parent goal. The new subgoal will be added before the one specified here. `insert_before` and `insert_after` parameters cannot both be specified.
   * @return insertBefore
  */
  
  @Schema(name = "insert_before", example = "1331", description = "An id of a subgoal of this parent goal. The new subgoal will be added before the one specified here. `insert_before` and `insert_after` parameters cannot both be specified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public GoalAddSubgoalRequest subgoal(String subgoal) {
    this.subgoal = subgoal;
    return this;
  }

  /**
   * The goal gid to add as subgoal to a parent goal
   * @return subgoal
  */
  @NotNull 
  @Schema(name = "subgoal", example = "1331", description = "The goal gid to add as subgoal to a parent goal", requiredMode = Schema.RequiredMode.REQUIRED)
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
    GoalAddSubgoalRequest goalAddSubgoalRequest = (GoalAddSubgoalRequest) o;
    return Objects.equals(this.insertAfter, goalAddSubgoalRequest.insertAfter) &&
        Objects.equals(this.insertBefore, goalAddSubgoalRequest.insertBefore) &&
        Objects.equals(this.subgoal, goalAddSubgoalRequest.subgoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insertAfter, insertBefore, subgoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalAddSubgoalRequest {\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
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

