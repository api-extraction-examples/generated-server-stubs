package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.Outcome;
import org.openapitools.model.Status;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildSummary
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class BuildSummary {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime addedAt;

  private Integer buildNum;

  private Outcome outcome;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime pushedAt;

  private Status status;

  private String vcsRevision;

  public BuildSummary addedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
    return this;
  }

  /**
   * Get addedAt
   * @return addedAt
  */
  @Valid 
  @Schema(name = "added_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("added_at")
  public OffsetDateTime getAddedAt() {
    return addedAt;
  }

  public void setAddedAt(OffsetDateTime addedAt) {
    this.addedAt = addedAt;
  }

  public BuildSummary buildNum(Integer buildNum) {
    this.buildNum = buildNum;
    return this;
  }

  /**
   * Get buildNum
   * @return buildNum
  */
  
  @Schema(name = "build_num", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_num")
  public Integer getBuildNum() {
    return buildNum;
  }

  public void setBuildNum(Integer buildNum) {
    this.buildNum = buildNum;
  }

  public BuildSummary outcome(Outcome outcome) {
    this.outcome = outcome;
    return this;
  }

  /**
   * Get outcome
   * @return outcome
  */
  @Valid 
  @Schema(name = "outcome", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("outcome")
  public Outcome getOutcome() {
    return outcome;
  }

  public void setOutcome(Outcome outcome) {
    this.outcome = outcome;
  }

  public BuildSummary pushedAt(OffsetDateTime pushedAt) {
    this.pushedAt = pushedAt;
    return this;
  }

  /**
   * Get pushedAt
   * @return pushedAt
  */
  @Valid 
  @Schema(name = "pushed_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pushed_at")
  public OffsetDateTime getPushedAt() {
    return pushedAt;
  }

  public void setPushedAt(OffsetDateTime pushedAt) {
    this.pushedAt = pushedAt;
  }

  public BuildSummary status(Status status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

  public BuildSummary vcsRevision(String vcsRevision) {
    this.vcsRevision = vcsRevision;
    return this;
  }

  /**
   * Get vcsRevision
   * @return vcsRevision
  */
  
  @Schema(name = "vcs_revision", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vcs_revision")
  public String getVcsRevision() {
    return vcsRevision;
  }

  public void setVcsRevision(String vcsRevision) {
    this.vcsRevision = vcsRevision;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildSummary buildSummary = (BuildSummary) o;
    return Objects.equals(this.addedAt, buildSummary.addedAt) &&
        Objects.equals(this.buildNum, buildSummary.buildNum) &&
        Objects.equals(this.outcome, buildSummary.outcome) &&
        Objects.equals(this.pushedAt, buildSummary.pushedAt) &&
        Objects.equals(this.status, buildSummary.status) &&
        Objects.equals(this.vcsRevision, buildSummary.vcsRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedAt, buildNum, outcome, pushedAt, status, vcsRevision);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildSummary {\n");
    sb.append("    addedAt: ").append(toIndentedString(addedAt)).append("\n");
    sb.append("    buildNum: ").append(toIndentedString(buildNum)).append("\n");
    sb.append("    outcome: ").append(toIndentedString(outcome)).append("\n");
    sb.append("    pushedAt: ").append(toIndentedString(pushedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    vcsRevision: ").append(toIndentedString(vcsRevision)).append("\n");
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

