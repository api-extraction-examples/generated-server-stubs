package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreatePolicyResponsePolicy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;CreatePolicy&lt;/a&gt; request. 
 */

@Schema(name = "CreatePolicyResponse", description = "Contains the response to a successful <a>CreatePolicy</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreatePolicyResponse {

  private CreatePolicyResponsePolicy policy;

  public CreatePolicyResponse policy(CreatePolicyResponsePolicy policy) {
    this.policy = policy;
    return this;
  }

  /**
   * Get policy
   * @return policy
  */
  @Valid 
  @Schema(name = "Policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Policy")
  public CreatePolicyResponsePolicy getPolicy() {
    return policy;
  }

  public void setPolicy(CreatePolicyResponsePolicy policy) {
    this.policy = policy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePolicyResponse createPolicyResponse = (CreatePolicyResponse) o;
    return Objects.equals(this.policy, createPolicyResponse.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePolicyResponse {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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

