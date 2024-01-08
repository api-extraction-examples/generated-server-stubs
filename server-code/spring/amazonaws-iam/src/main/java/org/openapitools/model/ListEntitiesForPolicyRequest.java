package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.EntityType;
import org.openapitools.model.PolicyUsageType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ListEntitiesForPolicyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListEntitiesForPolicyRequest {

  private String policyArn;

  private EntityType entityFilter;

  private String pathPrefix;

  private PolicyUsageType policyUsageFilter;

  private String marker;

  private Integer maxItems;

  public ListEntitiesForPolicyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListEntitiesForPolicyRequest(String policyArn) {
    this.policyArn = policyArn;
  }

  public ListEntitiesForPolicyRequest policyArn(String policyArn) {
    this.policyArn = policyArn;
    return this;
  }

  /**
   * Get policyArn
   * @return policyArn
  */
  @NotNull 
  @Schema(name = "PolicyArn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicyArn")
  public String getPolicyArn() {
    return policyArn;
  }

  public void setPolicyArn(String policyArn) {
    this.policyArn = policyArn;
  }

  public ListEntitiesForPolicyRequest entityFilter(EntityType entityFilter) {
    this.entityFilter = entityFilter;
    return this;
  }

  /**
   * Get entityFilter
   * @return entityFilter
  */
  @Valid 
  @Schema(name = "EntityFilter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EntityFilter")
  public EntityType getEntityFilter() {
    return entityFilter;
  }

  public void setEntityFilter(EntityType entityFilter) {
    this.entityFilter = entityFilter;
  }

  public ListEntitiesForPolicyRequest pathPrefix(String pathPrefix) {
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

  public ListEntitiesForPolicyRequest policyUsageFilter(PolicyUsageType policyUsageFilter) {
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

  public ListEntitiesForPolicyRequest marker(String marker) {
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

  public ListEntitiesForPolicyRequest maxItems(Integer maxItems) {
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
    ListEntitiesForPolicyRequest listEntitiesForPolicyRequest = (ListEntitiesForPolicyRequest) o;
    return Objects.equals(this.policyArn, listEntitiesForPolicyRequest.policyArn) &&
        Objects.equals(this.entityFilter, listEntitiesForPolicyRequest.entityFilter) &&
        Objects.equals(this.pathPrefix, listEntitiesForPolicyRequest.pathPrefix) &&
        Objects.equals(this.policyUsageFilter, listEntitiesForPolicyRequest.policyUsageFilter) &&
        Objects.equals(this.marker, listEntitiesForPolicyRequest.marker) &&
        Objects.equals(this.maxItems, listEntitiesForPolicyRequest.maxItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyArn, entityFilter, pathPrefix, policyUsageFilter, marker, maxItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListEntitiesForPolicyRequest {\n");
    sb.append("    policyArn: ").append(toIndentedString(policyArn)).append("\n");
    sb.append("    entityFilter: ").append(toIndentedString(entityFilter)).append("\n");
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

