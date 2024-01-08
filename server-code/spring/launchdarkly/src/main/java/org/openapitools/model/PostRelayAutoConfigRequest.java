package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Policy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostRelayAutoConfigRequest
 */

@JsonTypeName("postRelayAutoConfig_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostRelayAutoConfigRequest {

  private String name;

  @Valid
  private List<@Valid Policy> policy;

  public PostRelayAutoConfigRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name for the relay proxy configuration
   * @return name
  */
  
  @Schema(name = "name", example = "My relay proxy config", description = "A human-friendly name for the relay proxy configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostRelayAutoConfigRequest policy(List<@Valid Policy> policy) {
    this.policy = policy;
    return this;
  }

  public PostRelayAutoConfigRequest addPolicyItem(Policy policyItem) {
    if (this.policy == null) {
      this.policy = new ArrayList<>();
    }
    this.policy.add(policyItem);
    return this;
  }

  /**
   * Get policy
   * @return policy
  */
  @Valid 
  @Schema(name = "policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policy")
  public List<@Valid Policy> getPolicy() {
    return policy;
  }

  public void setPolicy(List<@Valid Policy> policy) {
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
    PostRelayAutoConfigRequest postRelayAutoConfigRequest = (PostRelayAutoConfigRequest) o;
    return Objects.equals(this.name, postRelayAutoConfigRequest.name) &&
        Objects.equals(this.policy, postRelayAutoConfigRequest.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRelayAutoConfigRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

