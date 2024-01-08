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
 * &lt;p&gt;Contains details about the permissions policies that are attached to the specified identity (user, group, or role).&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;ListPoliciesGrantingServiceAccess&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "ListPoliciesGrantingServiceAccessEntry", description = "<p>Contains details about the permissions policies that are attached to the specified identity (user, group, or role).</p> <p>This data type is used as a response element in the <a>ListPoliciesGrantingServiceAccess</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListPoliciesGrantingServiceAccessEntry {

  private String serviceNamespace;

  private List policies;

  public ListPoliciesGrantingServiceAccessEntry serviceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
    return this;
  }

  /**
   * Get serviceNamespace
   * @return serviceNamespace
  */
  
  @Schema(name = "ServiceNamespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceNamespace")
  public String getServiceNamespace() {
    return serviceNamespace;
  }

  public void setServiceNamespace(String serviceNamespace) {
    this.serviceNamespace = serviceNamespace;
  }

  public ListPoliciesGrantingServiceAccessEntry policies(List policies) {
    this.policies = policies;
    return this;
  }

  /**
   * Get policies
   * @return policies
  */
  @Valid 
  @Schema(name = "Policies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Policies")
  public List getPolicies() {
    return policies;
  }

  public void setPolicies(List policies) {
    this.policies = policies;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPoliciesGrantingServiceAccessEntry listPoliciesGrantingServiceAccessEntry = (ListPoliciesGrantingServiceAccessEntry) o;
    return Objects.equals(this.serviceNamespace, listPoliciesGrantingServiceAccessEntry.serviceNamespace) &&
        Objects.equals(this.policies, listPoliciesGrantingServiceAccessEntry.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceNamespace, policies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPoliciesGrantingServiceAccessEntry {\n");
    sb.append("    serviceNamespace: ").append(toIndentedString(serviceNamespace)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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

