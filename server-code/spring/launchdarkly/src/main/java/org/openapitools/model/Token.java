package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Links;
import org.openapitools.model.Member;
import org.openapitools.model.Statement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Token
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Token {

  private String id;

  private Links links;

  private Member member;

  private Long creationDate;

  @Valid
  private List<String> customRoleIds;

  private Integer defaultApiVersion;

  @Valid
  private List<@Valid Statement> inlineRole;

  private Long lastModified;

  private Long lastUsed;

  private String memberId;

  private String name;

  private String ownerId;

  private String role;

  private Boolean serviceToken;

  private String token;

  public Token id(String id) {
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

  public Token links(Links links) {
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

  public Token member(Member member) {
    this.member = member;
    return this;
  }

  /**
   * Get member
   * @return member
  */
  @Valid 
  @Schema(name = "_member", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_member")
  public Member getMember() {
    return member;
  }

  public void setMember(Member member) {
    this.member = member;
  }

  public Token creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the creation time of this access token.
   * @return creationDate
  */
  
  @Schema(name = "creationDate", example = "1443652232590", description = "A unix epoch time in milliseconds specifying the creation time of this access token.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public Long getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }

  public Token customRoleIds(List<String> customRoleIds) {
    this.customRoleIds = customRoleIds;
    return this;
  }

  public Token addCustomRoleIdsItem(String customRoleIdsItem) {
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

  public Token defaultApiVersion(Integer defaultApiVersion) {
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

  public Token inlineRole(List<@Valid Statement> inlineRole) {
    this.inlineRole = inlineRole;
    return this;
  }

  public Token addInlineRoleItem(Statement inlineRoleItem) {
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

  public Token lastModified(Long lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the last time this access token was modified.
   * @return lastModified
  */
  
  @Schema(name = "lastModified", example = "1469326565348", description = "A unix epoch time in milliseconds specifying the last time this access token was modified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModified")
  public Long getLastModified() {
    return lastModified;
  }

  public void setLastModified(Long lastModified) {
    this.lastModified = lastModified;
  }

  public Token lastUsed(Long lastUsed) {
    this.lastUsed = lastUsed;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the last time this access token was used to authorize access to the LaunchDarkly REST API.
   * @return lastUsed
  */
  
  @Schema(name = "lastUsed", example = "1469326565348", description = "A unix epoch time in milliseconds specifying the last time this access token was used to authorize access to the LaunchDarkly REST API.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastUsed")
  public Long getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(Long lastUsed) {
    this.lastUsed = lastUsed;
  }

  public Token memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * The unique resource id.
   * @return memberId
  */
  
  @Schema(name = "memberId", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("memberId")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public Token name(String name) {
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

  public Token ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The unique resource id.
   * @return ownerId
  */
  
  @Schema(name = "ownerId", example = "5a580a01b4ff89217bdf9dc1", description = "The unique resource id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ownerId")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public Token role(String role) {
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

  public Token serviceToken(Boolean serviceToken) {
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

  public Token token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The last 4 digits of the unique secret key for this access token. If creating or resetting the token, this will be the full token secret.
   * @return token
  */
  
  @Schema(name = "token", example = "3243", description = "The last 4 digits of the unique secret key for this access token. If creating or resetting the token, this will be the full token secret.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Token token = (Token) o;
    return Objects.equals(this.id, token.id) &&
        Objects.equals(this.links, token.links) &&
        Objects.equals(this.member, token.member) &&
        Objects.equals(this.creationDate, token.creationDate) &&
        Objects.equals(this.customRoleIds, token.customRoleIds) &&
        Objects.equals(this.defaultApiVersion, token.defaultApiVersion) &&
        Objects.equals(this.inlineRole, token.inlineRole) &&
        Objects.equals(this.lastModified, token.lastModified) &&
        Objects.equals(this.lastUsed, token.lastUsed) &&
        Objects.equals(this.memberId, token.memberId) &&
        Objects.equals(this.name, token.name) &&
        Objects.equals(this.ownerId, token.ownerId) &&
        Objects.equals(this.role, token.role) &&
        Objects.equals(this.serviceToken, token.serviceToken) &&
        Objects.equals(this.token, token.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, links, member, creationDate, customRoleIds, defaultApiVersion, inlineRole, lastModified, lastUsed, memberId, name, ownerId, role, serviceToken, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Token {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    customRoleIds: ").append(toIndentedString(customRoleIds)).append("\n");
    sb.append("    defaultApiVersion: ").append(toIndentedString(defaultApiVersion)).append("\n");
    sb.append("    inlineRole: ").append(toIndentedString(inlineRole)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    serviceToken: ").append(toIndentedString(serviceToken)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

