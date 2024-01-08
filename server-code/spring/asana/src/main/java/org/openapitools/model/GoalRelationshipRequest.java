package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.GoalRelationshipBaseAllOfSupportedGoal;
import org.openapitools.model.GoalRelationshipCompactAllOfSupportingResource;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoalRelationshipRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalRelationshipRequest {

  private String gid;

  private String resourceType;

  private BigDecimal contributionWeight;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   */
  public enum ResourceSubtypeEnum {
    SUBGOAL("subgoal"),
    
    SUPPORTING_WORK("supporting_work");

    private String value;

    ResourceSubtypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResourceSubtypeEnum resourceSubtype;

  private GoalRelationshipCompactAllOfSupportingResource supportingResource;

  private GoalRelationshipBaseAllOfSupportedGoal supportedGoal;

  public GoalRelationshipRequest gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public GoalRelationshipRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public GoalRelationshipRequest contributionWeight(BigDecimal contributionWeight) {
    this.contributionWeight = contributionWeight;
    return this;
  }

  /**
   * The weight that the supporting resource's progress contributes to the supported goal's progress. This can only be 0 or 1.
   * @return contributionWeight
  */
  @Valid 
  @Schema(name = "contribution_weight", example = "1", description = "The weight that the supporting resource's progress contributes to the supported goal's progress. This can only be 0 or 1.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contribution_weight")
  public BigDecimal getContributionWeight() {
    return contributionWeight;
  }

  public void setContributionWeight(BigDecimal contributionWeight) {
    this.contributionWeight = contributionWeight;
  }

  public GoalRelationshipRequest resourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "subgoal", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public GoalRelationshipRequest supportingResource(GoalRelationshipCompactAllOfSupportingResource supportingResource) {
    this.supportingResource = supportingResource;
    return this;
  }

  /**
   * Get supportingResource
   * @return supportingResource
  */
  @Valid 
  @Schema(name = "supporting_resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supporting_resource")
  public GoalRelationshipCompactAllOfSupportingResource getSupportingResource() {
    return supportingResource;
  }

  public void setSupportingResource(GoalRelationshipCompactAllOfSupportingResource supportingResource) {
    this.supportingResource = supportingResource;
  }

  public GoalRelationshipRequest supportedGoal(GoalRelationshipBaseAllOfSupportedGoal supportedGoal) {
    this.supportedGoal = supportedGoal;
    return this;
  }

  /**
   * Get supportedGoal
   * @return supportedGoal
  */
  @Valid 
  @Schema(name = "supported_goal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supported_goal")
  public GoalRelationshipBaseAllOfSupportedGoal getSupportedGoal() {
    return supportedGoal;
  }

  public void setSupportedGoal(GoalRelationshipBaseAllOfSupportedGoal supportedGoal) {
    this.supportedGoal = supportedGoal;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalRelationshipRequest goalRelationshipRequest = (GoalRelationshipRequest) o;
    return Objects.equals(this.gid, goalRelationshipRequest.gid) &&
        Objects.equals(this.resourceType, goalRelationshipRequest.resourceType) &&
        Objects.equals(this.contributionWeight, goalRelationshipRequest.contributionWeight) &&
        Objects.equals(this.resourceSubtype, goalRelationshipRequest.resourceSubtype) &&
        Objects.equals(this.supportingResource, goalRelationshipRequest.supportingResource) &&
        Objects.equals(this.supportedGoal, goalRelationshipRequest.supportedGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, contributionWeight, resourceSubtype, supportingResource, supportedGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoalRelationshipRequest {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    contributionWeight: ").append(toIndentedString(contributionWeight)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    supportingResource: ").append(toIndentedString(supportingResource)).append("\n");
    sb.append("    supportedGoal: ").append(toIndentedString(supportedGoal)).append("\n");
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

