package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * WorkspaceResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class WorkspaceResponse {

  private String gid;

  private String resourceType;

  private String name;

  @Valid
  private List<URI> emailDomains;

  private Boolean isOrganization;

  public WorkspaceResponse gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public WorkspaceResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public WorkspaceResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workspace.
   * @return name
  */
  
  @Schema(name = "name", example = "My Company Workspace", description = "The name of the workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkspaceResponse emailDomains(List<URI> emailDomains) {
    this.emailDomains = emailDomains;
    return this;
  }

  public WorkspaceResponse addEmailDomainsItem(URI emailDomainsItem) {
    if (this.emailDomains == null) {
      this.emailDomains = new ArrayList<>();
    }
    this.emailDomains.add(emailDomainsItem);
    return this;
  }

  /**
   * The email domains that are associated with this workspace.
   * @return emailDomains
  */
  @Valid 
  @Schema(name = "email_domains", example = "[\"asana.com\"]", description = "The email domains that are associated with this workspace.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("email_domains")
  public List<URI> getEmailDomains() {
    return emailDomains;
  }

  public void setEmailDomains(List<URI> emailDomains) {
    this.emailDomains = emailDomains;
  }

  public WorkspaceResponse isOrganization(Boolean isOrganization) {
    this.isOrganization = isOrganization;
    return this;
  }

  /**
   * Whether the workspace is an *organization*.
   * @return isOrganization
  */
  
  @Schema(name = "is_organization", example = "false", description = "Whether the workspace is an *organization*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_organization")
  public Boolean getIsOrganization() {
    return isOrganization;
  }

  public void setIsOrganization(Boolean isOrganization) {
    this.isOrganization = isOrganization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceResponse workspaceResponse = (WorkspaceResponse) o;
    return Objects.equals(this.gid, workspaceResponse.gid) &&
        Objects.equals(this.resourceType, workspaceResponse.resourceType) &&
        Objects.equals(this.name, workspaceResponse.name) &&
        Objects.equals(this.emailDomains, workspaceResponse.emailDomains) &&
        Objects.equals(this.isOrganization, workspaceResponse.isOrganization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, name, emailDomains, isOrganization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceResponse {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailDomains: ").append(toIndentedString(emailDomains)).append("\n");
    sb.append("    isOrganization: ").append(toIndentedString(isOrganization)).append("\n");
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

