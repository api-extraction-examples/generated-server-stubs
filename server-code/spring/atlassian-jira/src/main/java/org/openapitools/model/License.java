package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LicensedApplication;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a license for the Jira instance.
 */

@Schema(name = "License", description = "Details about a license for the Jira instance.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class License {

  @Valid
  private List<@Valid LicensedApplication> applications = new ArrayList<>();

  public License() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public License(List<@Valid LicensedApplication> applications) {
    this.applications = applications;
  }

  public License applications(List<@Valid LicensedApplication> applications) {
    this.applications = applications;
    return this;
  }

  public License addApplicationsItem(LicensedApplication applicationsItem) {
    if (this.applications == null) {
      this.applications = new ArrayList<>();
    }
    this.applications.add(applicationsItem);
    return this;
  }

  /**
   * The applications under this license.
   * @return applications
  */
  @Valid 
  @Schema(name = "applications", accessMode = Schema.AccessMode.READ_ONLY, description = "The applications under this license.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("applications")
  public List<@Valid LicensedApplication> getApplications() {
    return applications;
  }

  public void setApplications(List<@Valid LicensedApplication> applications) {
    this.applications = applications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    License license = (License) o;
    return Objects.equals(this.applications, license.applications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class License {\n");
    sb.append("    applications: ").append(toIndentedString(applications)).append("\n");
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

