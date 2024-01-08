package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Links;
import org.openapitools.model.Policy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomRole
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class CustomRole {

  private String id;

  private Links links;

  private String description;

  private String key;

  private String name;

  @Valid
  private List<@Valid Policy> policy;

  public CustomRole id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique resource id.
   * @return id
  */
  
  @Schema(name = "_id", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomRole links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_links")
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public CustomRole description(String description) {
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

  public CustomRole key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The 20-hexdigit id or the key for a custom role.
   * @return key
  */
  
  @Schema(name = "key", example = "revenue-team", description = "The 20-hexdigit id or the key for a custom role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CustomRole name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the custom role.
   * @return name
  */
  
  @Schema(name = "name", example = "revenue team", description = "Name of the custom role.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomRole policy(List<@Valid Policy> policy) {
    this.policy = policy;
    return this;
  }

  public CustomRole addPolicyItem(Policy policyItem) {
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
    CustomRole customRole = (CustomRole) o;
    return Objects.equals(this.id, customRole.id) &&
        Objects.equals(this.links, customRole.links) &&
        Objects.equals(this.description, customRole.description) &&
        Objects.equals(this.key, customRole.key) &&
        Objects.equals(this.name, customRole.name) &&
        Objects.equals(this.policy, customRole.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, description, key, name, policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomRole {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

