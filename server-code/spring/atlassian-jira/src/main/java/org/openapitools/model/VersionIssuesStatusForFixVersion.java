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
 * If the expand option &#x60;issuesstatus&#x60; is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.
 */

@Schema(name = "Version_issuesStatusForFixVersion", description = "If the expand option `issuesstatus` is used, returns the count of issues in this version for each of the status categories *to do*, *in progress*, *done*, and *unmapped*. The *unmapped* property contains a count of issues with a status other than *to do*, *in progress*, and *done*.")
@JsonTypeName("Version_issuesStatusForFixVersion")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class VersionIssuesStatusForFixVersion {

  private Long done;

  private Long inProgress;

  private Long toDo;

  private Long unmapped;

  public VersionIssuesStatusForFixVersion done(Long done) {
    this.done = done;
    return this;
  }

  /**
   * Count of issues with status *done*.
   * @return done
  */
  
  @Schema(name = "done", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues with status *done*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("done")
  public Long getDone() {
    return done;
  }

  public void setDone(Long done) {
    this.done = done;
  }

  public VersionIssuesStatusForFixVersion inProgress(Long inProgress) {
    this.inProgress = inProgress;
    return this;
  }

  /**
   * Count of issues with status *in progress*.
   * @return inProgress
  */
  
  @Schema(name = "inProgress", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues with status *in progress*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("inProgress")
  public Long getInProgress() {
    return inProgress;
  }

  public void setInProgress(Long inProgress) {
    this.inProgress = inProgress;
  }

  public VersionIssuesStatusForFixVersion toDo(Long toDo) {
    this.toDo = toDo;
    return this;
  }

  /**
   * Count of issues with status *to do*.
   * @return toDo
  */
  
  @Schema(name = "toDo", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues with status *to do*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("toDo")
  public Long getToDo() {
    return toDo;
  }

  public void setToDo(Long toDo) {
    this.toDo = toDo;
  }

  public VersionIssuesStatusForFixVersion unmapped(Long unmapped) {
    this.unmapped = unmapped;
    return this;
  }

  /**
   * Count of issues with a status other than *to do*, *in progress*, and *done*.
   * @return unmapped
  */
  
  @Schema(name = "unmapped", accessMode = Schema.AccessMode.READ_ONLY, description = "Count of issues with a status other than *to do*, *in progress*, and *done*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unmapped")
  public Long getUnmapped() {
    return unmapped;
  }

  public void setUnmapped(Long unmapped) {
    this.unmapped = unmapped;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionIssuesStatusForFixVersion versionIssuesStatusForFixVersion = (VersionIssuesStatusForFixVersion) o;
    return Objects.equals(this.done, versionIssuesStatusForFixVersion.done) &&
        Objects.equals(this.inProgress, versionIssuesStatusForFixVersion.inProgress) &&
        Objects.equals(this.toDo, versionIssuesStatusForFixVersion.toDo) &&
        Objects.equals(this.unmapped, versionIssuesStatusForFixVersion.unmapped);
  }

  @Override
  public int hashCode() {
    return Objects.hash(done, inProgress, toDo, unmapped);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionIssuesStatusForFixVersion {\n");
    sb.append("    done: ").append(toIndentedString(done)).append("\n");
    sb.append("    inProgress: ").append(toIndentedString(inProgress)).append("\n");
    sb.append("    toDo: ").append(toIndentedString(toDo)).append("\n");
    sb.append("    unmapped: ").append(toIndentedString(unmapped)).append("\n");
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

