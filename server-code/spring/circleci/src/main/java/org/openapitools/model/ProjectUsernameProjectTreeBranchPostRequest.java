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
 * ProjectUsernameProjectTreeBranchPostRequest
 */

@JsonTypeName("_project__username___project__tree__branch__post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class ProjectUsernameProjectTreeBranchPostRequest {

  private Object buildParameters;

  private String parallel;

  private String revision;

  public ProjectUsernameProjectTreeBranchPostRequest buildParameters(Object buildParameters) {
    this.buildParameters = buildParameters;
    return this;
  }

  /**
   * Additional environment variables to inject into the build environment. A map of names to values. 
   * @return buildParameters
  */
  
  @Schema(name = "build_parameters", description = "Additional environment variables to inject into the build environment. A map of names to values. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_parameters")
  public Object getBuildParameters() {
    return buildParameters;
  }

  public void setBuildParameters(Object buildParameters) {
    this.buildParameters = buildParameters;
  }

  public ProjectUsernameProjectTreeBranchPostRequest parallel(String parallel) {
    this.parallel = parallel;
    return this;
  }

  /**
   * The number of containers to use to run the build. Default is null and the project default is used. 
   * @return parallel
  */
  
  @Schema(name = "parallel", description = "The number of containers to use to run the build. Default is null and the project default is used. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parallel")
  public String getParallel() {
    return parallel;
  }

  public void setParallel(String parallel) {
    this.parallel = parallel;
  }

  public ProjectUsernameProjectTreeBranchPostRequest revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The specific revision to build. Default is null and the head of the branch is used. Cannot be used with tag parameter. 
   * @return revision
  */
  
  @Schema(name = "revision", description = "The specific revision to build. Default is null and the head of the branch is used. Cannot be used with tag parameter. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revision")
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUsernameProjectTreeBranchPostRequest projectUsernameProjectTreeBranchPostRequest = (ProjectUsernameProjectTreeBranchPostRequest) o;
    return Objects.equals(this.buildParameters, projectUsernameProjectTreeBranchPostRequest.buildParameters) &&
        Objects.equals(this.parallel, projectUsernameProjectTreeBranchPostRequest.parallel) &&
        Objects.equals(this.revision, projectUsernameProjectTreeBranchPostRequest.revision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(buildParameters, parallel, revision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUsernameProjectTreeBranchPostRequest {\n");
    sb.append("    buildParameters: ").append(toIndentedString(buildParameters)).append("\n");
    sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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

