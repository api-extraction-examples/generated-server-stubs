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
 * Contains information about the effect that Organizations has on a policy simulation.
 */

@Schema(name = "OrganizationsDecisionDetail", description = "Contains information about the effect that Organizations has on a policy simulation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class OrganizationsDecisionDetail {

  private Boolean allowedByOrganizations;

  public OrganizationsDecisionDetail allowedByOrganizations(Boolean allowedByOrganizations) {
    this.allowedByOrganizations = allowedByOrganizations;
    return this;
  }

  /**
   * Get allowedByOrganizations
   * @return allowedByOrganizations
  */
  
  @Schema(name = "AllowedByOrganizations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AllowedByOrganizations")
  public Boolean getAllowedByOrganizations() {
    return allowedByOrganizations;
  }

  public void setAllowedByOrganizations(Boolean allowedByOrganizations) {
    this.allowedByOrganizations = allowedByOrganizations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationsDecisionDetail organizationsDecisionDetail = (OrganizationsDecisionDetail) o;
    return Objects.equals(this.allowedByOrganizations, organizationsDecisionDetail.allowedByOrganizations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedByOrganizations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationsDecisionDetail {\n");
    sb.append("    allowedByOrganizations: ").append(toIndentedString(allowedByOrganizations)).append("\n");
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

