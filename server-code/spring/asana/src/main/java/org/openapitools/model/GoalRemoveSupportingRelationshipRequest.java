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
 * GoalRemoveSupportingRelationshipRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalRemoveSupportingRelationshipRequest {

  private String supportingResource;

  public GoalRemoveSupportingRelationshipRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoalRemoveSupportingRelationshipRequest(String supportingResource) {
    this.supportingResource = supportingResource;
  }

  public GoalRemoveSupportingRelationshipRequest supportingResource(String supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  /**
   * The gid of the supporting resource to remove from the parent goal. Must be the gid of a goal, project, or portfolio.
   * @return supportingResource
  */
  @NotNull 
  @Schema(name = "supporting_resource", example = "12345", description = "The gid of the supporting resource to remove from the parent goal. Must be the gid of a goal, project, or portfolio.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    GoalRemoveSupportingRelationshipRequest goalRemoveSupportingRelationshipRequest = (GoalRemoveSupportingRelationshipRequest) o;
    return Objects.equals(this.supportingResource, goalRemoveSupportingRelationshipRequest.supportingResource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportingResource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalRemoveSupportingRelationshipRequest {\n");
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

