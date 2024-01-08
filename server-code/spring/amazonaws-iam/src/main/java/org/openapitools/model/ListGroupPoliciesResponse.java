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
 * Contains the response to a successful &lt;a&gt;ListGroupPolicies&lt;/a&gt; request. 
 */

@Schema(name = "ListGroupPoliciesResponse", description = "Contains the response to a successful <a>ListGroupPolicies</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListGroupPoliciesResponse {

  private List policyNames;

  private Boolean isTruncated;

  private String marker;

  public ListGroupPoliciesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListGroupPoliciesResponse(List policyNames) {
    this.policyNames = policyNames;
  }

  public ListGroupPoliciesResponse policyNames(List policyNames) {
    this.policyNames = policyNames;
    return this;
  }

  /**
   * Get policyNames
   * @return policyNames
  */
  @NotNull @Valid 
  @Schema(name = "PolicyNames", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicyNames")
  public List getPolicyNames() {
    return policyNames;
  }

  public void setPolicyNames(List policyNames) {
    this.policyNames = policyNames;
  }

  public ListGroupPoliciesResponse isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  /**
   * Get isTruncated
   * @return isTruncated
  */
  
  @Schema(name = "IsTruncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsTruncated")
  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public void setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
  }

  public ListGroupPoliciesResponse marker(String marker) {
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
    ListGroupPoliciesResponse listGroupPoliciesResponse = (ListGroupPoliciesResponse) o;
    return Objects.equals(this.policyNames, listGroupPoliciesResponse.policyNames) &&
        Objects.equals(this.isTruncated, listGroupPoliciesResponse.isTruncated) &&
        Objects.equals(this.marker, listGroupPoliciesResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyNames, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListGroupPoliciesResponse {\n");
    sb.append("    policyNames: ").append(toIndentedString(policyNames)).append("\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
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

