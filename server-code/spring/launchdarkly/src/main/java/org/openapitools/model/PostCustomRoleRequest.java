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
 * PostCustomRoleRequest
 */

@JsonTypeName("postCustomRole_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostCustomRoleRequest {

  private String description;

  private String key;

  private String name;

  @Valid
  private List<@Valid Policy> policy = new ArrayList<>();

  public PostCustomRoleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PostCustomRoleRequest(String key, String name, List<@Valid Policy> policy) {
    this.key = key;
    this.name = name;
    this.policy = policy;
  }

  public PostCustomRoleRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the custom role.
   * @return description
  */
  
  @Schema(name = "description", example = "Description of revenue team role here", description = "Description of the custom role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PostCustomRoleRequest key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The 20-hexdigit id or the key for a custom role.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "revenue-team", description = "The 20-hexdigit id or the key for a custom role.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public PostCustomRoleRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the custom role.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "revenue team", description = "Name of the custom role.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostCustomRoleRequest policy(List<@Valid Policy> policy) {
    this.policy = policy;
    return this;
  }

  public PostCustomRoleRequest addPolicyItem(Policy policyItem) {
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
  @NotNull @Valid 
  @Schema(name = "policy", requiredMode = Schema.RequiredMode.REQUIRED)
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
    PostCustomRoleRequest postCustomRoleRequest = (PostCustomRoleRequest) o;
    return Objects.equals(this.description, postCustomRoleRequest.description) &&
        Objects.equals(this.key, postCustomRoleRequest.key) &&
        Objects.equals(this.name, postCustomRoleRequest.name) &&
        Objects.equals(this.policy, postCustomRoleRequest.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, key, name, policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostCustomRoleRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

