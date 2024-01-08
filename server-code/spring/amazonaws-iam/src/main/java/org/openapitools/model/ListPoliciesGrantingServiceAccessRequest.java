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
 * ListPoliciesGrantingServiceAccessRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListPoliciesGrantingServiceAccessRequest {

  private String marker;

  private String arn;

  private List serviceNamespaces;

  public ListPoliciesGrantingServiceAccessRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListPoliciesGrantingServiceAccessRequest(String arn, List serviceNamespaces) {
    this.arn = arn;
    this.serviceNamespaces = serviceNamespaces;
  }

  public ListPoliciesGrantingServiceAccessRequest marker(String marker) {
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

  public ListPoliciesGrantingServiceAccessRequest arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
  */
  @NotNull 
  @Schema(name = "Arn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public ListPoliciesGrantingServiceAccessRequest serviceNamespaces(List serviceNamespaces) {
    this.serviceNamespaces = serviceNamespaces;
    return this;
  }

  /**
   * Get serviceNamespaces
   * @return serviceNamespaces
  */
  @NotNull @Valid 
  @Schema(name = "ServiceNamespaces", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServiceNamespaces")
  public List getServiceNamespaces() {
    return serviceNamespaces;
  }

  public void setServiceNamespaces(List serviceNamespaces) {
    this.serviceNamespaces = serviceNamespaces;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPoliciesGrantingServiceAccessRequest listPoliciesGrantingServiceAccessRequest = (ListPoliciesGrantingServiceAccessRequest) o;
    return Objects.equals(this.marker, listPoliciesGrantingServiceAccessRequest.marker) &&
        Objects.equals(this.arn, listPoliciesGrantingServiceAccessRequest.arn) &&
        Objects.equals(this.serviceNamespaces, listPoliciesGrantingServiceAccessRequest.serviceNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marker, arn, serviceNamespaces);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPoliciesGrantingServiceAccessRequest {\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    serviceNamespaces: ").append(toIndentedString(serviceNamespaces)).append("\n");
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

