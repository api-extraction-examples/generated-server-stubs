package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Member;
import org.openapitools.model.Policy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RelayProxyConfig
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class RelayProxyConfig {

  private Member creator;

  private String id;

  private Long creationDate;

  private String displayKey;

  private String fullKey;

  private Long lastModified;

  private String name;

  @Valid
  private List<@Valid Policy> policy = new ArrayList<>();

  public RelayProxyConfig() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelayProxyConfig(Member creator, String id, Long creationDate, String displayKey, Long lastModified, String name, List<@Valid Policy> policy) {
    this.creator = creator;
    this.id = id;
    this.creationDate = creationDate;
    this.displayKey = displayKey;
    this.lastModified = lastModified;
    this.name = name;
    this.policy = policy;
  }

  public RelayProxyConfig creator(Member creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * @return creator
  */
  @NotNull @Valid 
  @Schema(name = "_creator", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("_creator")
  public Member getCreator() {
    return creator;
  }

  public void setCreator(Member creator) {
    this.creator = creator;
  }

  public RelayProxyConfig id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique resource id.
   * @return id
  */
  @NotNull 
  @Schema(name = "_id", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RelayProxyConfig creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the creation time of this relay proxy configuration
   * @return creationDate
  */
  @NotNull 
  @Schema(name = "creationDate", example = "1443652232590", description = "A unix epoch time in milliseconds specifying the creation time of this relay proxy configuration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("creationDate")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public RelayProxyConfig displayKey(String displayKey) {
    this.displayKey = displayKey;
    return this;
  }

  /**
   * The last 4 digits of the unique secret key for this relay proxy configuration
   * @return displayKey
  */
  @NotNull 
  @Schema(name = "displayKey", example = "66eo", description = "The last 4 digits of the unique secret key for this relay proxy configuration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("displayKey")
  public String getDisplayKey() {
    return displayKey;
  }

  public void setDisplayKey(String displayKey) {
    this.displayKey = displayKey;
  }

  public RelayProxyConfig fullKey(String fullKey) {
    this.fullKey = fullKey;
    return this;
  }

  /**
   * Full secret key. Only included if creating or resetting the relay proxy configuration
   * @return fullKey
  */
  
  @Schema(name = "fullKey", example = "rel-8a3a773d-b75e-48eb-a850-492cda9266eo", description = "Full secret key. Only included if creating or resetting the relay proxy configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fullKey")
  public String getFullKey() {
    return fullKey;
  }

  public void setFullKey(String fullKey) {
    this.fullKey = fullKey;
  }

  public RelayProxyConfig lastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the last time this relay proxy configuration was modified
   * @return lastModified
  */
  @NotNull 
  @Schema(name = "lastModified", example = "1469326565348", description = "A unix epoch time in milliseconds specifying the last time this relay proxy configuration was modified", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("lastModified")
  public Long getLastModified() {
    return lastModified;
  }

  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }

  public RelayProxyConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name for the relay proxy configuration
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "My relay proxy config", description = "A human-friendly name for the relay proxy configuration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RelayProxyConfig policy(List<@Valid Policy> policy) {
    this.policy = policy;
    return this;
  }

  public RelayProxyConfig addPolicyItem(Policy policyItem) {
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
    RelayProxyConfig relayProxyConfig = (RelayProxyConfig) o;
    return Objects.equals(this.creator, relayProxyConfig.creator) &&
        Objects.equals(this.id, relayProxyConfig.id) &&
        Objects.equals(this.creationDate, relayProxyConfig.creationDate) &&
        Objects.equals(this.displayKey, relayProxyConfig.displayKey) &&
        Objects.equals(this.fullKey, relayProxyConfig.fullKey) &&
        Objects.equals(this.lastModified, relayProxyConfig.lastModified) &&
        Objects.equals(this.name, relayProxyConfig.name) &&
        Objects.equals(this.policy, relayProxyConfig.policy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creator, id, creationDate, displayKey, fullKey, lastModified, name, policy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelayProxyConfig {\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    displayKey: ").append(toIndentedString(displayKey)).append("\n");
    sb.append("    fullKey: ").append(toIndentedString(fullKey)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
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

