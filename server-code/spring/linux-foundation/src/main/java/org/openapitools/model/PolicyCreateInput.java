package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Reimbursement creation information
 */

@Schema(name = "policy-create-input", description = "Reimbursement creation information")
@JsonTypeName("policy-create-input")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:46.390673-04:00[America/Lower_Princes]")
public class PolicyCreateInput {

  private String projectName;

  public PolicyCreateInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PolicyCreateInput(String projectName) {
    this.projectName = projectName;
  }

  public PolicyCreateInput projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

  /**
   * Get projectName
   * @return projectName
  */
  @NotNull 
  @Schema(name = "ProjectName", example = "The Looney Tunes Show", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ProjectName")
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyCreateInput policyCreateInput = (PolicyCreateInput) o;
    return Objects.equals(this.projectName, policyCreateInput.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyCreateInput {\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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

