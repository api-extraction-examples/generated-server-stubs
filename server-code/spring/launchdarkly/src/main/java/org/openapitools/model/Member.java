package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Links;
import org.openapitools.model.MemberLastSeenMetadata;
import org.openapitools.model.Role;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Member
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Member {

  private String id;

  private Long lastSeen;

  private MemberLastSeenMetadata lastSeenMetadata;

  private Links links;

  private Boolean pendingInvite;

  private Boolean verified;

  @Valid
  private List<@Valid String> customRoles;

  private String email;

  private String firstName;

  private Boolean isBeta;

  private String lastName;

  private Role role;

  public Member id(String id) {
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

  public Member lastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

  /**
   * A unix epoch time in milliseconds specifying the last time this member was active in LaunchDarkly.
   * @return lastSeen
  */
  
  @Schema(name = "_lastSeen", example = "1469326565348", description = "A unix epoch time in milliseconds specifying the last time this member was active in LaunchDarkly.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_lastSeen")
  public Long getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(Long lastSeen) {
    this.lastSeen = lastSeen;
  }

  public Member lastSeenMetadata(MemberLastSeenMetadata lastSeenMetadata) {
    this.lastSeenMetadata = lastSeenMetadata;
    return this;
  }

  /**
   * Get lastSeenMetadata
   * @return lastSeenMetadata
  */
  @Valid 
  @Schema(name = "_lastSeenMetadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_lastSeenMetadata")
  public MemberLastSeenMetadata getLastSeenMetadata() {
    return lastSeenMetadata;
  }

  public void setLastSeenMetadata(MemberLastSeenMetadata lastSeenMetadata) {
    this.lastSeenMetadata = lastSeenMetadata;
  }

  public Member links(Links links) {
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

  public Member pendingInvite(Boolean pendingInvite) {
    this.pendingInvite = pendingInvite;
    return this;
  }

  /**
   * Get pendingInvite
   * @return pendingInvite
  */
  
  @Schema(name = "_pendingInvite", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_pendingInvite")
  public Boolean getPendingInvite() {
    return pendingInvite;
  }

  public void setPendingInvite(Boolean pendingInvite) {
    this.pendingInvite = pendingInvite;
  }

  public Member verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Get verified
   * @return verified
  */
  
  @Schema(name = "_verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_verified")
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public Member customRoles(List<@Valid String> customRoles) {
    this.customRoles = customRoles;
    return this;
  }

  public Member addCustomRolesItem(String customRolesItem) {
    if (this.customRoles == null) {
      this.customRoles = new ArrayList<>();
    }
    this.customRoles.add(customRolesItem);
    return this;
  }

  /**
   * Get customRoles
   * @return customRoles
  */
  
  @Schema(name = "customRoles", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customRoles")
  public List<@Valid String> getCustomRoles() {
    return customRoles;
  }

  public void setCustomRoles(List<@Valid String> customRoles) {
    this.customRoles = customRoles;
  }

  public Member email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  
  @Schema(name = "email", example = "user@launchdarkly.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Member firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  
  @Schema(name = "firstName", example = "Alan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Member isBeta(Boolean isBeta) {
    this.isBeta = isBeta;
    return this;
  }

  /**
   * Get isBeta
   * @return isBeta
  */
  
  @Schema(name = "isBeta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isBeta")
  public Boolean getIsBeta() {
    return isBeta;
  }

  public void setIsBeta(Boolean isBeta) {
    this.isBeta = isBeta;
  }

  public Member lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  
  @Schema(name = "lastName", example = "Turing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Member role(Role role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @Valid 
  @Schema(name = "role", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("role")
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Member member = (Member) o;
    return Objects.equals(this.id, member.id) &&
        Objects.equals(this.lastSeen, member.lastSeen) &&
        Objects.equals(this.lastSeenMetadata, member.lastSeenMetadata) &&
        Objects.equals(this.links, member.links) &&
        Objects.equals(this.pendingInvite, member.pendingInvite) &&
        Objects.equals(this.verified, member.verified) &&
        Objects.equals(this.customRoles, member.customRoles) &&
        Objects.equals(this.email, member.email) &&
        Objects.equals(this.firstName, member.firstName) &&
        Objects.equals(this.isBeta, member.isBeta) &&
        Objects.equals(this.lastName, member.lastName) &&
        Objects.equals(this.role, member.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, lastSeen, lastSeenMetadata, links, pendingInvite, verified, customRoles, email, firstName, isBeta, lastName, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Member {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    lastSeenMetadata: ").append(toIndentedString(lastSeenMetadata)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    pendingInvite: ").append(toIndentedString(pendingInvite)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    customRoles: ").append(toIndentedString(customRoles)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    isBeta: ").append(toIndentedString(isBeta)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

