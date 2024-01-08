package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import java.util.Map;
import org.openapitools.model.EvaluationResultOrganizationsDecisionDetail;
import org.openapitools.model.EvaluationResultPermissionsBoundaryDecisionDetail;
import org.openapitools.model.PolicyEvaluationDecisionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains the results of a simulation.&lt;/p&gt; &lt;p&gt;This data type is used by the return parameter of &lt;code&gt; &lt;a&gt;SimulateCustomPolicy&lt;/a&gt; &lt;/code&gt; and &lt;code&gt; &lt;a&gt;SimulatePrincipalPolicy&lt;/a&gt; &lt;/code&gt;.&lt;/p&gt;
 */

@Schema(name = "EvaluationResult", description = "<p>Contains the results of a simulation.</p> <p>This data type is used by the return parameter of <code> <a>SimulateCustomPolicy</a> </code> and <code> <a>SimulatePrincipalPolicy</a> </code>.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class EvaluationResult {

  private String evalActionName;

  private String evalResourceName;

  private PolicyEvaluationDecisionType evalDecision;

  private List matchedStatements;

  private List missingContextValues;

  private EvaluationResultOrganizationsDecisionDetail organizationsDecisionDetail;

  private EvaluationResultPermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail;

  private Map evalDecisionDetails;

  private List resourceSpecificResults;

  public EvaluationResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EvaluationResult(String evalActionName, PolicyEvaluationDecisionType evalDecision) {
    this.evalActionName = evalActionName;
    this.evalDecision = evalDecision;
  }

  public EvaluationResult evalActionName(String evalActionName) {
    this.evalActionName = evalActionName;
    return this;
  }

  /**
   * Get evalActionName
   * @return evalActionName
  */
  @NotNull 
  @Schema(name = "EvalActionName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EvalActionName")
  public String getEvalActionName() {
    return evalActionName;
  }

  public void setEvalActionName(String evalActionName) {
    this.evalActionName = evalActionName;
  }

  public EvaluationResult evalResourceName(String evalResourceName) {
    this.evalResourceName = evalResourceName;
    return this;
  }

  /**
   * Get evalResourceName
   * @return evalResourceName
  */
  
  @Schema(name = "EvalResourceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EvalResourceName")
  public String getEvalResourceName() {
    return evalResourceName;
  }

  public void setEvalResourceName(String evalResourceName) {
    this.evalResourceName = evalResourceName;
  }

  public EvaluationResult evalDecision(PolicyEvaluationDecisionType evalDecision) {
    this.evalDecision = evalDecision;
    return this;
  }

  /**
   * Get evalDecision
   * @return evalDecision
  */
  @NotNull @Valid 
  @Schema(name = "EvalDecision", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EvalDecision")
  public PolicyEvaluationDecisionType getEvalDecision() {
    return evalDecision;
  }

  public void setEvalDecision(PolicyEvaluationDecisionType evalDecision) {
    this.evalDecision = evalDecision;
  }

  public EvaluationResult matchedStatements(List matchedStatements) {
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

  public EvaluationResult missingContextValues(List missingContextValues) {
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

  public EvaluationResult organizationsDecisionDetail(EvaluationResultOrganizationsDecisionDetail organizationsDecisionDetail) {
    this.organizationsDecisionDetail = organizationsDecisionDetail;
    return this;
  }

  /**
   * Get organizationsDecisionDetail
   * @return organizationsDecisionDetail
  */
  @Valid 
  @Schema(name = "OrganizationsDecisionDetail", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrganizationsDecisionDetail")
  public EvaluationResultOrganizationsDecisionDetail getOrganizationsDecisionDetail() {
    return organizationsDecisionDetail;
  }

  public void setOrganizationsDecisionDetail(EvaluationResultOrganizationsDecisionDetail organizationsDecisionDetail) {
    this.organizationsDecisionDetail = organizationsDecisionDetail;
  }

  public EvaluationResult permissionsBoundaryDecisionDetail(EvaluationResultPermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail) {
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
  public EvaluationResultPermissionsBoundaryDecisionDetail getPermissionsBoundaryDecisionDetail() {
    return permissionsBoundaryDecisionDetail;
  }

  public void setPermissionsBoundaryDecisionDetail(EvaluationResultPermissionsBoundaryDecisionDetail permissionsBoundaryDecisionDetail) {
    this.permissionsBoundaryDecisionDetail = permissionsBoundaryDecisionDetail;
  }

  public EvaluationResult evalDecisionDetails(Map evalDecisionDetails) {
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

  public EvaluationResult resourceSpecificResults(List resourceSpecificResults) {
    this.resourceSpecificResults = resourceSpecificResults;
    return this;
  }

  /**
   * Get resourceSpecificResults
   * @return resourceSpecificResults
  */
  @Valid 
  @Schema(name = "ResourceSpecificResults", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResourceSpecificResults")
  public List getResourceSpecificResults() {
    return resourceSpecificResults;
  }

  public void setResourceSpecificResults(List resourceSpecificResults) {
    this.resourceSpecificResults = resourceSpecificResults;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationResult evaluationResult = (EvaluationResult) o;
    return Objects.equals(this.evalActionName, evaluationResult.evalActionName) &&
        Objects.equals(this.evalResourceName, evaluationResult.evalResourceName) &&
        Objects.equals(this.evalDecision, evaluationResult.evalDecision) &&
        Objects.equals(this.matchedStatements, evaluationResult.matchedStatements) &&
        Objects.equals(this.missingContextValues, evaluationResult.missingContextValues) &&
        Objects.equals(this.organizationsDecisionDetail, evaluationResult.organizationsDecisionDetail) &&
        Objects.equals(this.permissionsBoundaryDecisionDetail, evaluationResult.permissionsBoundaryDecisionDetail) &&
        Objects.equals(this.evalDecisionDetails, evaluationResult.evalDecisionDetails) &&
        Objects.equals(this.resourceSpecificResults, evaluationResult.resourceSpecificResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evalActionName, evalResourceName, evalDecision, matchedStatements, missingContextValues, organizationsDecisionDetail, permissionsBoundaryDecisionDetail, evalDecisionDetails, resourceSpecificResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationResult {\n");
    sb.append("    evalActionName: ").append(toIndentedString(evalActionName)).append("\n");
    sb.append("    evalResourceName: ").append(toIndentedString(evalResourceName)).append("\n");
    sb.append("    evalDecision: ").append(toIndentedString(evalDecision)).append("\n");
    sb.append("    matchedStatements: ").append(toIndentedString(matchedStatements)).append("\n");
    sb.append("    missingContextValues: ").append(toIndentedString(missingContextValues)).append("\n");
    sb.append("    organizationsDecisionDetail: ").append(toIndentedString(organizationsDecisionDetail)).append("\n");
    sb.append("    permissionsBoundaryDecisionDetail: ").append(toIndentedString(permissionsBoundaryDecisionDetail)).append("\n");
    sb.append("    evalDecisionDetails: ").append(toIndentedString(evalDecisionDetails)).append("\n");
    sb.append("    resourceSpecificResults: ").append(toIndentedString(resourceSpecificResults)).append("\n");
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

