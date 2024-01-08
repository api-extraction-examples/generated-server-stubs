package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SimulatePrincipalPolicyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class SimulatePrincipalPolicyRequest {

  private String policySourceArn;

  private List policyInputList;

  private List permissionsBoundaryPolicyInputList;

  private List actionNames;

  private List resourceArns;

  private String resourcePolicy;

  private String resourceOwner;

  private String callerArn;

  private List contextEntries;

  private String resourceHandlingOption;

  private Integer maxItems;

  private String marker;

  public SimulatePrincipalPolicyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SimulatePrincipalPolicyRequest(String policySourceArn, List actionNames) {
    this.policySourceArn = policySourceArn;
    this.actionNames = actionNames;
  }

  public SimulatePrincipalPolicyRequest policySourceArn(String policySourceArn) {
    this.policySourceArn = policySourceArn;
    return this;
  }

  /**
   * Get policySourceArn
   * @return policySourceArn
  */
  @NotNull 
  @Schema(name = "PolicySourceArn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicySourceArn")
  public String getPolicySourceArn() {
    return policySourceArn;
  }

  public void setPolicySourceArn(String policySourceArn) {
    this.policySourceArn = policySourceArn;
  }

  public SimulatePrincipalPolicyRequest policyInputList(List policyInputList) {
    this.policyInputList = policyInputList;
    return this;
  }

  /**
   * Get policyInputList
   * @return policyInputList
  */
  @Valid 
  @Schema(name = "PolicyInputList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyInputList")
  public List getPolicyInputList() {
    return policyInputList;
  }

  public void setPolicyInputList(List policyInputList) {
    this.policyInputList = policyInputList;
  }

  public SimulatePrincipalPolicyRequest permissionsBoundaryPolicyInputList(List permissionsBoundaryPolicyInputList) {
    this.permissionsBoundaryPolicyInputList = permissionsBoundaryPolicyInputList;
    return this;
  }

  /**
   * Get permissionsBoundaryPolicyInputList
   * @return permissionsBoundaryPolicyInputList
  */
  @Valid 
  @Schema(name = "PermissionsBoundaryPolicyInputList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PermissionsBoundaryPolicyInputList")
  public List getPermissionsBoundaryPolicyInputList() {
    return permissionsBoundaryPolicyInputList;
  }

  public void setPermissionsBoundaryPolicyInputList(List permissionsBoundaryPolicyInputList) {
    this.permissionsBoundaryPolicyInputList = permissionsBoundaryPolicyInputList;
  }

  public SimulatePrincipalPolicyRequest actionNames(List actionNames) {
    this.actionNames = actionNames;
    return this;
  }

  /**
   * Get actionNames
   * @return actionNames
  */
  @NotNull @Valid 
  @Schema(name = "ActionNames", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ActionNames")
  public List getActionNames() {
    return actionNames;
  }

  public void setActionNames(List actionNames) {
    this.actionNames = actionNames;
  }

  public SimulatePrincipalPolicyRequest resourceArns(List resourceArns) {
    this.resourceArns = resourceArns;
    return this;
  }

  /**
   * Get resourceArns
   * @return resourceArns
  */
  @Valid 
  @Schema(name = "ResourceArns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResourceArns")
  public List getResourceArns() {
    return resourceArns;
  }

  public void setResourceArns(List resourceArns) {
    this.resourceArns = resourceArns;
  }

  public SimulatePrincipalPolicyRequest resourcePolicy(String resourcePolicy) {
    this.resourcePolicy = resourcePolicy;
    return this;
  }

  /**
   * Get resourcePolicy
   * @return resourcePolicy
  */
  
  @Schema(name = "ResourcePolicy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResourcePolicy")
  public String getResourcePolicy() {
    return resourcePolicy;
  }

  public void setResourcePolicy(String resourcePolicy) {
    this.resourcePolicy = resourcePolicy;
  }

  public SimulatePrincipalPolicyRequest resourceOwner(String resourceOwner) {
    this.resourceOwner = resourceOwner;
    return this;
  }

  /**
   * Get resourceOwner
   * @return resourceOwner
  */
  
  @Schema(name = "ResourceOwner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResourceOwner")
  public String getResourceOwner() {
    return resourceOwner;
  }

  public void setResourceOwner(String resourceOwner) {
    this.resourceOwner = resourceOwner;
  }

  public SimulatePrincipalPolicyRequest callerArn(String callerArn) {
    this.callerArn = callerArn;
    return this;
  }

  /**
   * Get callerArn
   * @return callerArn
  */
  
  @Schema(name = "CallerArn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CallerArn")
  public String getCallerArn() {
    return callerArn;
  }

  public void setCallerArn(String callerArn) {
    this.callerArn = callerArn;
  }

  public SimulatePrincipalPolicyRequest contextEntries(List contextEntries) {
    this.contextEntries = contextEntries;
    return this;
  }

  /**
   * Get contextEntries
   * @return contextEntries
  */
  @Valid 
  @Schema(name = "ContextEntries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContextEntries")
  public List getContextEntries() {
    return contextEntries;
  }

  public void setContextEntries(List contextEntries) {
    this.contextEntries = contextEntries;
  }

  public SimulatePrincipalPolicyRequest resourceHandlingOption(String resourceHandlingOption) {
    this.resourceHandlingOption = resourceHandlingOption;
    return this;
  }

  /**
   * Get resourceHandlingOption
   * @return resourceHandlingOption
  */
  
  @Schema(name = "ResourceHandlingOption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResourceHandlingOption")
  public String getResourceHandlingOption() {
    return resourceHandlingOption;
  }

  public void setResourceHandlingOption(String resourceHandlingOption) {
    this.resourceHandlingOption = resourceHandlingOption;
  }

  public SimulatePrincipalPolicyRequest maxItems(Integer maxItems) {
    this.maxItems = maxItems;
    return this;
  }

  /**
   * Get maxItems
   * @return maxItems
  */
  
  @Schema(name = "MaxItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxItems")
  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }

  public SimulatePrincipalPolicyRequest marker(String marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
  */
  
  @Schema(name = "Marker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Marker")
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest = (SimulatePrincipalPolicyRequest) o;
    return Objects.equals(this.policySourceArn, simulatePrincipalPolicyRequest.policySourceArn) &&
        Objects.equals(this.policyInputList, simulatePrincipalPolicyRequest.policyInputList) &&
        Objects.equals(this.permissionsBoundaryPolicyInputList, simulatePrincipalPolicyRequest.permissionsBoundaryPolicyInputList) &&
        Objects.equals(this.actionNames, simulatePrincipalPolicyRequest.actionNames) &&
        Objects.equals(this.resourceArns, simulatePrincipalPolicyRequest.resourceArns) &&
        Objects.equals(this.resourcePolicy, simulatePrincipalPolicyRequest.resourcePolicy) &&
        Objects.equals(this.resourceOwner, simulatePrincipalPolicyRequest.resourceOwner) &&
        Objects.equals(this.callerArn, simulatePrincipalPolicyRequest.callerArn) &&
        Objects.equals(this.contextEntries, simulatePrincipalPolicyRequest.contextEntries) &&
        Objects.equals(this.resourceHandlingOption, simulatePrincipalPolicyRequest.resourceHandlingOption) &&
        Objects.equals(this.maxItems, simulatePrincipalPolicyRequest.maxItems) &&
        Objects.equals(this.marker, simulatePrincipalPolicyRequest.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policySourceArn, policyInputList, permissionsBoundaryPolicyInputList, actionNames, resourceArns, resourcePolicy, resourceOwner, callerArn, contextEntries, resourceHandlingOption, maxItems, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulatePrincipalPolicyRequest {\n");
    sb.append("    policySourceArn: ").append(toIndentedString(policySourceArn)).append("\n");
    sb.append("    policyInputList: ").append(toIndentedString(policyInputList)).append("\n");
    sb.append("    permissionsBoundaryPolicyInputList: ").append(toIndentedString(permissionsBoundaryPolicyInputList)).append("\n");
    sb.append("    actionNames: ").append(toIndentedString(actionNames)).append("\n");
    sb.append("    resourceArns: ").append(toIndentedString(resourceArns)).append("\n");
    sb.append("    resourcePolicy: ").append(toIndentedString(resourcePolicy)).append("\n");
    sb.append("    resourceOwner: ").append(toIndentedString(resourceOwner)).append("\n");
    sb.append("    callerArn: ").append(toIndentedString(callerArn)).append("\n");
    sb.append("    contextEntries: ").append(toIndentedString(contextEntries)).append("\n");
    sb.append("    resourceHandlingOption: ").append(toIndentedString(resourceHandlingOption)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

