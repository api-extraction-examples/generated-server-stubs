package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CommitDetail;
import org.openapitools.model.PreviousBuild;
import org.openapitools.model.User;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * previous build
 */

@Schema(name = "BuildDetail", description = "previous build")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class BuildDetail {

  @Valid
  private List<@Valid CommitDetail> allCommitDetails;

  private JsonNullable<URI> compare = JsonNullable.<URI>undefined();

  private String jobName;

  private JsonNullable<Object> node = JsonNullable.<Object>undefined();

  private PreviousBuild previousSuccessfulBuild;

  private JsonNullable<Boolean> retries = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> sshEnabled = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> timedout = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime usageQueuedAt;

  private User user;

  public BuildDetail allCommitDetails(List<@Valid CommitDetail> allCommitDetails) {
    this.allCommitDetails = allCommitDetails;
    return this;
  }

  public BuildDetail addAllCommitDetailsItem(CommitDetail allCommitDetailsItem) {
    if (this.allCommitDetails == null) {
      this.allCommitDetails = new ArrayList<>();
    }
    this.allCommitDetails.add(allCommitDetailsItem);
    return this;
  }

  /**
   * Get allCommitDetails
   * @return allCommitDetails
  */
  @Valid 
  @Schema(name = "all_commit_details", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("all_commit_details")
  public List<@Valid CommitDetail> getAllCommitDetails() {
    return allCommitDetails;
  }

  public void setAllCommitDetails(List<@Valid CommitDetail> allCommitDetails) {
    this.allCommitDetails = allCommitDetails;
  }

  public BuildDetail compare(URI compare) {
    this.compare = JsonNullable.of(compare);
    return this;
  }

  /**
   * Get compare
   * @return compare
  */
  @Valid 
  @Schema(name = "compare", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compare")
  public JsonNullable<URI> getCompare() {
    return compare;
  }

  public void setCompare(JsonNullable<URI> compare) {
    this.compare = compare;
  }

  public BuildDetail jobName(String jobName) {
    this.jobName = jobName;
    return this;
  }

  /**
   * Get jobName
   * @return jobName
  */
  
  @Schema(name = "job_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job_name")
  public String getJobName() {
    return jobName;
  }

  public void setJobName(String jobName) {
    this.jobName = jobName;
  }

  public BuildDetail node(Object node) {
    this.node = JsonNullable.of(node);
    return this;
  }

  /**
   * Get node
   * @return node
  */
  
  @Schema(name = "node", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("node")
  public JsonNullable<Object> getNode() {
    return node;
  }

  public void setNode(JsonNullable<Object> node) {
    this.node = node;
  }

  public BuildDetail previousSuccessfulBuild(PreviousBuild previousSuccessfulBuild) {
    this.previousSuccessfulBuild = previousSuccessfulBuild;
    return this;
  }

  /**
   * Get previousSuccessfulBuild
   * @return previousSuccessfulBuild
  */
  @Valid 
  @Schema(name = "previous_successful_build", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous_successful_build")
  public PreviousBuild getPreviousSuccessfulBuild() {
    return previousSuccessfulBuild;
  }

  public void setPreviousSuccessfulBuild(PreviousBuild previousSuccessfulBuild) {
    this.previousSuccessfulBuild = previousSuccessfulBuild;
  }

  public BuildDetail retries(Boolean retries) {
    this.retries = JsonNullable.of(retries);
    return this;
  }

  /**
   * Get retries
   * @return retries
  */
  
  @Schema(name = "retries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retries")
  public JsonNullable<Boolean> getRetries() {
    return retries;
  }

  public void setRetries(JsonNullable<Boolean> retries) {
    this.retries = retries;
  }

  public BuildDetail sshEnabled(Boolean sshEnabled) {
    this.sshEnabled = JsonNullable.of(sshEnabled);
    return this;
  }

  /**
   * Get sshEnabled
   * @return sshEnabled
  */
  
  @Schema(name = "ssh_enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssh_enabled")
  public JsonNullable<Boolean> getSshEnabled() {
    return sshEnabled;
  }

  public void setSshEnabled(JsonNullable<Boolean> sshEnabled) {
    this.sshEnabled = sshEnabled;
  }

  public BuildDetail timedout(Boolean timedout) {
    this.timedout = JsonNullable.of(timedout);
    return this;
  }

  /**
   * Get timedout
   * @return timedout
  */
  
  @Schema(name = "timedout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timedout")
  public JsonNullable<Boolean> getTimedout() {
    return timedout;
  }

  public void setTimedout(JsonNullable<Boolean> timedout) {
    this.timedout = timedout;
  }

  public BuildDetail usageQueuedAt(OffsetDateTime usageQueuedAt) {
    this.usageQueuedAt = usageQueuedAt;
    return this;
  }

  /**
   * Get usageQueuedAt
   * @return usageQueuedAt
  */
  @Valid 
  @Schema(name = "usage_queued_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usage_queued_at")
  public OffsetDateTime getUsageQueuedAt() {
    return usageQueuedAt;
  }

  public void setUsageQueuedAt(OffsetDateTime usageQueuedAt) {
    this.usageQueuedAt = usageQueuedAt;
  }

  public BuildDetail user(User user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @Valid 
  @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildDetail buildDetail = (BuildDetail) o;
    return Objects.equals(this.allCommitDetails, buildDetail.allCommitDetails) &&
        equalsNullable(this.compare, buildDetail.compare) &&
        Objects.equals(this.jobName, buildDetail.jobName) &&
        equalsNullable(this.node, buildDetail.node) &&
        Objects.equals(this.previousSuccessfulBuild, buildDetail.previousSuccessfulBuild) &&
        equalsNullable(this.retries, buildDetail.retries) &&
        equalsNullable(this.sshEnabled, buildDetail.sshEnabled) &&
        equalsNullable(this.timedout, buildDetail.timedout) &&
        Objects.equals(this.usageQueuedAt, buildDetail.usageQueuedAt) &&
        Objects.equals(this.user, buildDetail.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allCommitDetails, hashCodeNullable(compare), jobName, hashCodeNullable(node), previousSuccessfulBuild, hashCodeNullable(retries), hashCodeNullable(sshEnabled), hashCodeNullable(timedout), usageQueuedAt, user);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildDetail {\n");
    sb.append("    allCommitDetails: ").append(toIndentedString(allCommitDetails)).append("\n");
    sb.append("    compare: ").append(toIndentedString(compare)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    node: ").append(toIndentedString(node)).append("\n");
    sb.append("    previousSuccessfulBuild: ").append(toIndentedString(previousSuccessfulBuild)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    sshEnabled: ").append(toIndentedString(sshEnabled)).append("\n");
    sb.append("    timedout: ").append(toIndentedString(timedout)).append("\n");
    sb.append("    usageQueuedAt: ").append(toIndentedString(usageQueuedAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

