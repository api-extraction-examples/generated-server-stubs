package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.AccountUsageCapability;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AccountMembershipCapabilities
 */

@JsonTypeName("accountMembership_capabilities")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class AccountMembershipCapabilities {

  private AccountUsageCapability collaborators;

  private AccountUsageCapability sites;

  public AccountMembershipCapabilities collaborators(AccountUsageCapability collaborators) {
    this.collaborators = collaborators;
    return this;
  }

  /**
   * Get collaborators
   * @return collaborators
  */
  @Valid 
  @Schema(name = "collaborators", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("collaborators")
  public AccountUsageCapability getCollaborators() {
    return collaborators;
  }

  public void setCollaborators(AccountUsageCapability collaborators) {
    this.collaborators = collaborators;
  }

  public AccountMembershipCapabilities sites(AccountUsageCapability sites) {
    this.sites = sites;
    return this;
  }

  /**
   * Get sites
   * @return sites
  */
  @Valid 
  @Schema(name = "sites", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sites")
  public AccountUsageCapability getSites() {
    return sites;
  }

  public void setSites(AccountUsageCapability sites) {
    this.sites = sites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountMembershipCapabilities accountMembershipCapabilities = (AccountMembershipCapabilities) o;
    return Objects.equals(this.collaborators, accountMembershipCapabilities.collaborators) &&
        Objects.equals(this.sites, accountMembershipCapabilities.sites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(collaborators, sites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountMembershipCapabilities {\n");
    sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
    sb.append("    sites: ").append(toIndentedString(sites)).append("\n");
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

