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
 * ListPoliciesGrantingServiceAccessResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListPoliciesGrantingServiceAccessResponse {

  private List policiesGrantingServiceAccess;

  private Boolean isTruncated;

  private String marker;

  public ListPoliciesGrantingServiceAccessResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListPoliciesGrantingServiceAccessResponse(List policiesGrantingServiceAccess) {
    this.policiesGrantingServiceAccess = policiesGrantingServiceAccess;
  }

  public ListPoliciesGrantingServiceAccessResponse policiesGrantingServiceAccess(List policiesGrantingServiceAccess) {
    this.policiesGrantingServiceAccess = policiesGrantingServiceAccess;
    return this;
  }

  /**
   * Get policiesGrantingServiceAccess
   * @return policiesGrantingServiceAccess
  */
  @NotNull @Valid 
  @Schema(name = "PoliciesGrantingServiceAccess", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PoliciesGrantingServiceAccess")
  public List getPoliciesGrantingServiceAccess() {
    return policiesGrantingServiceAccess;
  }

  public void setPoliciesGrantingServiceAccess(List policiesGrantingServiceAccess) {
    this.policiesGrantingServiceAccess = policiesGrantingServiceAccess;
  }

  public ListPoliciesGrantingServiceAccessResponse isTruncated(Boolean isTruncated) {
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

  public ListPoliciesGrantingServiceAccessResponse marker(String marker) {
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
    ListPoliciesGrantingServiceAccessResponse listPoliciesGrantingServiceAccessResponse = (ListPoliciesGrantingServiceAccessResponse) o;
    return Objects.equals(this.policiesGrantingServiceAccess, listPoliciesGrantingServiceAccessResponse.policiesGrantingServiceAccess) &&
        Objects.equals(this.isTruncated, listPoliciesGrantingServiceAccessResponse.isTruncated) &&
        Objects.equals(this.marker, listPoliciesGrantingServiceAccessResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policiesGrantingServiceAccess, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPoliciesGrantingServiceAccessResponse {\n");
    sb.append("    policiesGrantingServiceAccess: ").append(toIndentedString(policiesGrantingServiceAccess)).append("\n");
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

