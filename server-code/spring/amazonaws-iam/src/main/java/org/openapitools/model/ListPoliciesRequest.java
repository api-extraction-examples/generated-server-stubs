package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.PolicyScopeType;
import org.openapitools.model.PolicyUsageType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListPoliciesRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListPoliciesRequest {

  private PolicyScopeType scope;

  private Boolean onlyAttached;

  private String pathPrefix;

  private PolicyUsageType policyUsageFilter;

  private String marker;

  private Integer maxItems;

  public ListPoliciesRequest scope(PolicyScopeType scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "Scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Scope")
  public PolicyScopeType getScope() {
    return scope;
  }

  public void setScope(PolicyScopeType scope) {
    this.scope = scope;
  }

  public ListPoliciesRequest onlyAttached(Boolean onlyAttached) {
    this.onlyAttached = onlyAttached;
    return this;
  }

  /**
   * Get onlyAttached
   * @return onlyAttached
  */
  
  @Schema(name = "OnlyAttached", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OnlyAttached")
  public Boolean getOnlyAttached() {
    return onlyAttached;
  }

  public void setOnlyAttached(Boolean onlyAttached) {
    this.onlyAttached = onlyAttached;
  }

  public ListPoliciesRequest pathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  /**
   * Get pathPrefix
   * @return pathPrefix
  */
  
  @Schema(name = "PathPrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathPrefix")
  public String getPathPrefix() {
    return pathPrefix;
  }

  public void setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
  }

  public ListPoliciesRequest policyUsageFilter(PolicyUsageType policyUsageFilter) {
    this.policyUsageFilter = policyUsageFilter;
    return this;
  }

  /**
   * Get policyUsageFilter
   * @return policyUsageFilter
  */
  @Valid 
  @Schema(name = "PolicyUsageFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyUsageFilter")
  public PolicyUsageType getPolicyUsageFilter() {
    return policyUsageFilter;
  }

  public void setPolicyUsageFilter(PolicyUsageType policyUsageFilter) {
    this.policyUsageFilter = policyUsageFilter;
  }

  public ListPoliciesRequest marker(String marker) {
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

  public ListPoliciesRequest maxItems(Integer maxItems) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPoliciesRequest listPoliciesRequest = (ListPoliciesRequest) o;
    return Objects.equals(this.scope, listPoliciesRequest.scope) &&
        Objects.equals(this.onlyAttached, listPoliciesRequest.onlyAttached) &&
        Objects.equals(this.pathPrefix, listPoliciesRequest.pathPrefix) &&
        Objects.equals(this.policyUsageFilter, listPoliciesRequest.policyUsageFilter) &&
        Objects.equals(this.marker, listPoliciesRequest.marker) &&
        Objects.equals(this.maxItems, listPoliciesRequest.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, onlyAttached, pathPrefix, policyUsageFilter, marker, maxItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPoliciesRequest {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    onlyAttached: ").append(toIndentedString(onlyAttached)).append("\n");
    sb.append("    pathPrefix: ").append(toIndentedString(pathPrefix)).append("\n");
    sb.append("    policyUsageFilter: ").append(toIndentedString(policyUsageFilter)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    maxItems: ").append(toIndentedString(maxItems)).append("\n");
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

