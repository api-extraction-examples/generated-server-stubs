package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Statement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PostTokenRequest
 */

@JsonTypeName("postToken_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class PostTokenRequest {

  @Valid
  private List<String> customRoleIds;

  private Integer defaultApiVersion;

  @Valid
  private List<@Valid Statement> inlineRole;

  private String name;

  private String role;

  private Boolean serviceToken;

  public PostTokenRequest customRoleIds(List<String> customRoleIds) {
    this.customRoleIds = customRoleIds;
    return this;
  }

  public PostTokenRequest addCustomRoleIdsItem(String customRoleIdsItem) {
    if (this.customRoleIds == null) {
      this.customRoleIds = new ArrayList<>();
    }
    this.customRoleIds.add(customRoleIdsItem);
    return this;
  }

  /**
   * A list of custom role IDs to use as access limits for the access token
   * @return customRoleIds
  */
  
  @Schema(name = "customRoleIds", description = "A list of custom role IDs to use as access limits for the access token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customRoleIds")
  public List<String> getCustomRoleIds() {
    return customRoleIds;
  }

  public void setCustomRoleIds(List<String> customRoleIds) {
    this.customRoleIds = customRoleIds;
  }

  public PostTokenRequest defaultApiVersion(Integer defaultApiVersion) {
    this.defaultApiVersion = defaultApiVersion;
    return this;
  }

  /**
   * The default API version for this token
   * @return defaultApiVersion
  */
  
  @Schema(name = "defaultApiVersion", description = "The default API version for this token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultApiVersion")
  public Integer getDefaultApiVersion() {
    return defaultApiVersion;
  }

  public void setDefaultApiVersion(Integer defaultApiVersion) {
    this.defaultApiVersion = defaultApiVersion;
  }

  public PostTokenRequest inlineRole(List<@Valid Statement> inlineRole) {
    this.inlineRole = inlineRole;
    return this;
  }

  public PostTokenRequest addInlineRoleItem(Statement inlineRoleItem) {
    if (this.inlineRole == null) {
      this.inlineRole = new ArrayList<>();
    }
    this.inlineRole.add(inlineRoleItem);
    return this;
  }

  /**
   * Get inlineRole
   * @return inlineRole
  */
  @Valid 
  @Schema(name = "inlineRole", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inlineRole")
  public List<@Valid Statement> getInlineRole() {
    return inlineRole;
  }

  public void setInlineRole(List<@Valid Statement> inlineRole) {
    this.inlineRole = inlineRole;
  }

  public PostTokenRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name for the access token
   * @return name
  */
  
  @Schema(name = "name", example = "My access token", description = "A human-friendly name for the access token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PostTokenRequest role(String role) {
    this.role = role;
    return this;
  }

  /**
   * The name of a built-in role for the token
   * @return role
  */
  
  @Schema(name = "role", example = "writer", description = "The name of a built-in role for the token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public PostTokenRequest serviceToken(Boolean serviceToken) {
    this.serviceToken = serviceToken;
    return this;
  }

  /**
   * Whether the token will be a service token https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens
   * @return serviceToken
  */
  
  @Schema(name = "serviceToken", description = "Whether the token will be a service token https://docs.launchdarkly.com/home/account-security/api-access-tokens#service-tokens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceToken")
  public Boolean getServiceToken() {
    return serviceToken;
  }

  public void setServiceToken(Boolean serviceToken) {
    this.serviceToken = serviceToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostTokenRequest postTokenRequest = (PostTokenRequest) o;
    return Objects.equals(this.customRoleIds, postTokenRequest.customRoleIds) &&
        Objects.equals(this.defaultApiVersion, postTokenRequest.defaultApiVersion) &&
        Objects.equals(this.inlineRole, postTokenRequest.inlineRole) &&
        Objects.equals(this.name, postTokenRequest.name) &&
        Objects.equals(this.role, postTokenRequest.role) &&
        Objects.equals(this.serviceToken, postTokenRequest.serviceToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customRoleIds, defaultApiVersion, inlineRole, name, role, serviceToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostTokenRequest {\n");
    sb.append("    customRoleIds: ").append(toIndentedString(customRoleIds)).append("\n");
    sb.append("    defaultApiVersion: ").append(toIndentedString(defaultApiVersion)).append("\n");
    sb.append("    inlineRole: ").append(toIndentedString(inlineRole)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceToken: ").append(toIndentedString(serviceToken)).append("\n");
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

