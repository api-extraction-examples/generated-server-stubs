package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import java.util.Map;
import org.openapitools.model.PolicyEvaluationDecisionType;
import org.openapitools.model.ResourceSpecificResultPermissionsBoundaryDecisionDetail;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains the result of the simulation of a single API operation call on a single resource.&lt;/p&gt; &lt;p&gt;This data type is used by a member of the &lt;a&gt;EvaluationResult&lt;/a&gt; data type.&lt;/p&gt;
 */

@Schema(name = "ResourceSpecificResult", description = "<p>Contains the result of the simulation of a single API operation call on a single resource.</p> <p>This data type is used by a member of the <a>EvaluationResult</a> data type.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ResourceSpecificResult {

  private String evalResourceName;

  private PolicyEvaluationDecisionType evalResourceDecision;

  private List matchedStatements;

  private List missingContextValues;

  private Map evalDecisionDetails;

  private ResourceSpecificResultPermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail;

  public ResourceSpecificResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResourceSpecificResult(String evalResourceName, PolicyEvaluationDecisionType evalResourceDecision) {
    this.evalResourceName = evalResourceName;
    this.evalResourceDecision = evalResourceDecision;
  }

  public ResourceSpecificResult evalResourceName(String evalResourceName) {
    this.evalResourceName = evalResourceName;
    return this;
  }

  /**
   * Get evalResourceName
   * @return evalResourceName
  */
  @NotNull 
  @Schema(name = "EvalResourceName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EvalResourceName")
  public String getEvalResourceName() {
    return evalResourceName;
  }

  public void setEvalResourceName(String evalResourceName) {
    this.evalResourceName = evalResourceName;
  }

  public ResourceSpecificResult evalResourceDecision(PolicyEvaluationDecisionType evalResourceDecision) {
    this.evalResourceDecision = evalResourceDecision;
    return this;
  }

  /**
   * Get evalResourceDecision
   * @return evalResourceDecision
  */
  @NotNull @Valid 
  @Schema(name = "EvalResourceDecision", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EvalResourceDecision")
  public PolicyEvaluationDecisionType getEvalResourceDecision() {
    return evalResourceDecision;
  }

  public void setEvalResourceDecision(PolicyEvaluationDecisionType evalResourceDecision) {
    this.evalResourceDecision = evalResourceDecision;
  }

  public ResourceSpecificResult matchedStatements(List matchedStatements) {
    this.matchedStatements = matchedStatements;
    return this;
  }

  /**
   * Get matchedStatements
   * @return matchedStatements
  */
  @Valid 
  @Schema(name = "MatchedStatements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MatchedStatements")
  public List getMatchedStatements() {
    return matchedStatements;
  }

  public void setMatchedStatements(List matchedStatements) {
    this.matchedStatements = matchedStatements;
  }

  public ResourceSpecificResult missingContextValues(List missingContextValues) {
    this.missingContextValues = missingContextValues;
    return this;
  }

  /**
   * Get missingContextValues
   * @return missingContextValues
  */
  @Valid 
  @Schema(name = "MissingContextValues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MissingContextValues")
  public List getMissingContextValues() {
    return missingContextValues;
  }

  public void setMissingContextValues(List missingContextValues) {
    this.missingContextValues = missingContextValues;
  }

  public ResourceSpecificResult evalDecisionDetails(Map evalDecisionDetails) {
    this.evalDecisionDetails = evalDecisionDetails;
    return this;
  }

  /**
   * Get evalDecisionDetails
   * @return evalDecisionDetails
  */
  @Valid 
  @Schema(name = "EvalDecisionDetails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EvalDecisionDetails")
  public Map getEvalDecisionDetails() {
    return evalDecisionDetails;
  }

  public void setEvalDecisionDetails(Map evalDecisionDetails) {
    this.evalDecisionDetails = evalDecisionDetails;
  }

  public ResourceSpecificResult permissionsBoundaryDecisionDetail(ResourceSpecificResultPermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail) {
    this.permissionsBoundaryDecisionDetail = permissionsBoundaryDecisionDetail;
    return this;
  }

  /**
   * Get permissionsBoundaryDecisionDetail
   * @return permissionsBoundaryDecisionDetail
  */
  @Valid 
  @Schema(name = "PermissionsBoundaryDecisionDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundaryDecisionDetail")
  public ResourceSpecificResultPermissionsBoundaryDecisionDetail getPermissionsBoundaryDecisionDetail() {
    return permissionsBoundaryDecisionDetail;
  }

  public void setPermissionsBoundaryDecisionDetail(ResourceSpecificResultPermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail) {
    this.permissionsBoundaryDecisionDetail = permissionsBoundaryDecisionDetail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceSpecificResult resourceSpecificResult = (ResourceSpecificResult) o;
    return Objects.equals(this.evalResourceName, resourceSpecificResult.evalResourceName) &&
        Objects.equals(this.evalResourceDecision, resourceSpecificResult.evalResourceDecision) &&
        Objects.equals(this.matchedStatements, resourceSpecificResult.matchedStatements) &&
        Objects.equals(this.missingContextValues, resourceSpecificResult.missingContextValues) &&
        Objects.equals(this.evalDecisionDetails, resourceSpecificResult.evalDecisionDetails) &&
        Objects.equals(this.permissionsBoundaryDecisionDetail, resourceSpecificResult.permissionsBoundaryDecisionDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalResourceName, evalResourceDecision, matchedStatements, missingContextValues, evalDecisionDetails, permissionsBoundaryDecisionDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceSpecificResult {\n");
    sb.append("    evalResourceName: ").append(toIndentedString(evalResourceName)).append("\n");
    sb.append("    evalResourceDecision: ").append(toIndentedString(evalResourceDecision)).append("\n");
    sb.append("    matchedStatements: ").append(toIndentedString(matchedStatements)).append("\n");
    sb.append("    missingContextValues: ").append(toIndentedString(missingContextValues)).append("\n");
    sb.append("    evalDecisionDetails: ").append(toIndentedString(evalDecisionDetails)).append("\n");
    sb.append("    permissionsBoundaryDecisionDetail: ").append(toIndentedString(permissionsBoundaryDecisionDetail)).append("\n");
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

