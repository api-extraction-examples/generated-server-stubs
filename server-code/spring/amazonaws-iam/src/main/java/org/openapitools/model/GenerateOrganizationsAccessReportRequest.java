package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GenerateOrganizationsAccessReportRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GenerateOrganizationsAccessReportRequest {

  private String entityPath;

  private String organizationsPolicyId;

  public GenerateOrganizationsAccessReportRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GenerateOrganizationsAccessReportRequest(String entityPath) {
    this.entityPath = entityPath;
  }

  public GenerateOrganizationsAccessReportRequest entityPath(String entityPath) {
    this.entityPath = entityPath;
    return this;
  }

  /**
   * Get entityPath
   * @return entityPath
  */
  @NotNull 
  @Schema(name = "EntityPath", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EntityPath")
  public String getEntityPath() {
    return entityPath;
  }

  public void setEntityPath(String entityPath) {
    this.entityPath = entityPath;
  }

  public GenerateOrganizationsAccessReportRequest organizationsPolicyId(String organizationsPolicyId) {
    this.organizationsPolicyId = organizationsPolicyId;
    return this;
  }

  /**
   * Get organizationsPolicyId
   * @return organizationsPolicyId
  */
  
  @Schema(name = "OrganizationsPolicyId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OrganizationsPolicyId")
  public String getOrganizationsPolicyId() {
    return organizationsPolicyId;
  }

  public void setOrganizationsPolicyId(String organizationsPolicyId) {
    this.organizationsPolicyId = organizationsPolicyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenerateOrganizationsAccessReportRequest generateOrganizationsAccessReportRequest = (GenerateOrganizationsAccessReportRequest) o;
    return Objects.equals(this.entityPath, generateOrganizationsAccessReportRequest.entityPath) &&
        Objects.equals(this.organizationsPolicyId, generateOrganizationsAccessReportRequest.organizationsPolicyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityPath, organizationsPolicyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateOrganizationsAccessReportRequest {\n");
    sb.append("    entityPath: ").append(toIndentedString(entityPath)).append("\n");
    sb.append("    organizationsPolicyId: ").append(toIndentedString(organizationsPolicyId)).append("\n");
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

