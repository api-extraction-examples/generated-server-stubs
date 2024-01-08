package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoalAddSupportingRelationshipRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalAddSupportingRelationshipRequest {

  private BigDecimal contributionWeight;

  private String insertAfter;

  private String insertBefore;

  private String supportingResource;

  public GoalAddSupportingRelationshipRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoalAddSupportingRelationshipRequest(String supportingResource) {
    this.supportingResource = supportingResource;
  }

  public GoalAddSupportingRelationshipRequest contributionWeight(BigDecimal contributionWeight) {
    this.contributionWeight = contributionWeight;
    return this;
  }

  /**
   * The weight that the supporting resource's progress will contribute to the supported goal's progress. This can only be 0 or 1.
   * @return contributionWeight
  */
  @Valid 
  @Schema(name = "contribution_weight", example = "1", description = "The weight that the supporting resource's progress will contribute to the supported goal's progress. This can only be 0 or 1.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contribution_weight")
  public BigDecimal getContributionWeight() {
    return contributionWeight;
  }

  public void setContributionWeight(BigDecimal contributionWeight) {
    this.contributionWeight = contributionWeight;
  }

  public GoalAddSupportingRelationshipRequest insertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
    return this;
  }

  /**
   * An id of a subgoal of this parent goal. The new subgoal will be added after the one specified here. `insert_before` and `insert_after` parameters cannot both be specified. Currently only supported when adding a subgoal.
   * @return insertAfter
  */
  
  @Schema(name = "insert_after", example = "1331", description = "An id of a subgoal of this parent goal. The new subgoal will be added after the one specified here. `insert_before` and `insert_after` parameters cannot both be specified. Currently only supported when adding a subgoal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_after")
  public String getInsertAfter() {
    return insertAfter;
  }

  public void setInsertAfter(String insertAfter) {
    this.insertAfter = insertAfter;
  }

  public GoalAddSupportingRelationshipRequest insertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
    return this;
  }

  /**
   * An id of a subgoal of this parent goal. The new subgoal will be added before the one specified here. `insert_before` and `insert_after` parameters cannot both be specified. Currently only supported when adding a subgoal.
   * @return insertBefore
  */
  
  @Schema(name = "insert_before", example = "1331", description = "An id of a subgoal of this parent goal. The new subgoal will be added before the one specified here. `insert_before` and `insert_after` parameters cannot both be specified. Currently only supported when adding a subgoal.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("insert_before")
  public String getInsertBefore() {
    return insertBefore;
  }

  public void setInsertBefore(String insertBefore) {
    this.insertBefore = insertBefore;
  }

  public GoalAddSupportingRelationshipRequest supportingResource(String supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  /**
   * The gid of the supporting resource to add to the parent goal. Must be the gid of a goal, project, or portfolio.
   * @return supportingResource
  */
  @NotNull 
  @Schema(name = "supporting_resource", example = "12345", description = "The gid of the supporting resource to add to the parent goal. Must be the gid of a goal, project, or portfolio.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("supporting_resource")
  public String getSupportingResource() {
    return supportingResource;
  }

  public void setSupportingResource(String supportingResource) {
    this.supportingResource = supportingResource;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalAddSupportingRelationshipRequest goalAddSupportingRelationshipRequest = (GoalAddSupportingRelationshipRequest) o;
    return Objects.equals(this.contributionWeight, goalAddSupportingRelationshipRequest.contributionWeight) &&
        Objects.equals(this.insertAfter, goalAddSupportingRelationshipRequest.insertAfter) &&
        Objects.equals(this.insertBefore, goalAddSupportingRelationshipRequest.insertBefore) &&
        Objects.equals(this.supportingResource, goalAddSupportingRelationshipRequest.supportingResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contributionWeight, insertAfter, insertBefore, supportingResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalAddSupportingRelationshipRequest {\n");
    sb.append("    contributionWeight: ").append(toIndentedString(contributionWeight)).append("\n");
    sb.append("    insertAfter: ").append(toIndentedString(insertAfter)).append("\n");
    sb.append("    insertBefore: ").append(toIndentedString(insertBefore)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
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

