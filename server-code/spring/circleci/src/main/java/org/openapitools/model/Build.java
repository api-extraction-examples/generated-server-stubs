package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Lifecycle;
import org.openapitools.model.PreviousBuild;
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
 * Build
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class Build {

  private String body;

  private String branch;

  private Integer buildTimeMillis;

  private URI buildUrl;

  private String committerEmail;

  private String committerName;

  private JsonNullable<String> dontBuild = JsonNullable.<String>undefined();

  private Lifecycle lifecycle;

  private PreviousBuild previous;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime queuedAt;

  private String reponame;

  private JsonNullable<Integer> retryOf = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startTime;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime stopTime;

  private String subject;

  private String username;

  private URI vcsUrl;

  private String why;

  public Build body(String body) {
    this.body = body;
    return this;
  }

  /**
   * commit message body
   * @return body
  */
  
  @Schema(name = "body", description = "commit message body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public Build branch(String branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
  */
  
  @Schema(name = "branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branch")
  public String getBranch() {
    return branch;
  }

  public void setBranch(String branch) {
    this.branch = branch;
  }

  public Build buildTimeMillis(Integer buildTimeMillis) {
    this.buildTimeMillis = buildTimeMillis;
    return this;
  }

  /**
   * Get buildTimeMillis
   * @return buildTimeMillis
  */
  
  @Schema(name = "build_time_millis", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_time_millis")
  public Integer getBuildTimeMillis() {
    return buildTimeMillis;
  }

  public void setBuildTimeMillis(Integer buildTimeMillis) {
    this.buildTimeMillis = buildTimeMillis;
  }

  public Build buildUrl(URI buildUrl) {
    this.buildUrl = buildUrl;
    return this;
  }

  /**
   * Get buildUrl
   * @return buildUrl
  */
  @Valid 
  @Schema(name = "build_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_url")
  public URI getBuildUrl() {
    return buildUrl;
  }

  public void setBuildUrl(URI buildUrl) {
    this.buildUrl = buildUrl;
  }

  public Build committerEmail(String committerEmail) {
    this.committerEmail = committerEmail;
    return this;
  }

  /**
   * Get committerEmail
   * @return committerEmail
  */
  @javax.validation.constraints.Email 
  @Schema(name = "committer_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("committer_email")
  public String getCommitterEmail() {
    return committerEmail;
  }

  public void setCommitterEmail(String committerEmail) {
    this.committerEmail = committerEmail;
  }

  public Build committerName(String committerName) {
    this.committerName = committerName;
    return this;
  }

  /**
   * Get committerName
   * @return committerName
  */
  
  @Schema(name = "committer_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("committer_name")
  public String getCommitterName() {
    return committerName;
  }

  public void setCommitterName(String committerName) {
    this.committerName = committerName;
  }

  public Build dontBuild(String dontBuild) {
    this.dontBuild = JsonNullable.of(dontBuild);
    return this;
  }

  /**
   * reason why we didn't build, if we didn't build
   * @return dontBuild
  */
  
  @Schema(name = "dont_build", description = "reason why we didn't build, if we didn't build", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dont_build")
  public JsonNullable<String> getDontBuild() {
    return dontBuild;
  }

  public void setDontBuild(JsonNullable<String> dontBuild) {
    this.dontBuild = dontBuild;
  }

  public Build lifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
    return this;
  }

  /**
   * Get lifecycle
   * @return lifecycle
  */
  @Valid 
  @Schema(name = "lifecycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifecycle")
  public Lifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(Lifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }

  public Build previous(PreviousBuild previous) {
    this.previous = previous;
    return this;
  }

  /**
   * Get previous
   * @return previous
  */
  @Valid 
  @Schema(name = "previous", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previous")
  public PreviousBuild getPrevious() {
    return previous;
  }

  public void setPrevious(PreviousBuild previous) {
    this.previous = previous;
  }

  public Build queuedAt(OffsetDateTime queuedAt) {
    this.queuedAt = queuedAt;
    return this;
  }

  /**
   * time build was queued
   * @return queuedAt
  */
  @Valid 
  @Schema(name = "queued_at", description = "time build was queued", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queued_at")
  public OffsetDateTime getQueuedAt() {
    return queuedAt;
  }

  public void setQueuedAt(OffsetDateTime queuedAt) {
    this.queuedAt = queuedAt;
  }

  public Build reponame(String reponame) {
    this.reponame = reponame;
    return this;
  }

  /**
   * Get reponame
   * @return reponame
  */
  
  @Schema(name = "reponame", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reponame")
  public String getReponame() {
    return reponame;
  }

  public void setReponame(String reponame) {
    this.reponame = reponame;
  }

  public Build retryOf(Integer retryOf) {
    this.retryOf = JsonNullable.of(retryOf);
    return this;
  }

  /**
   * build_num of the build this is a retry of
   * @return retryOf
  */
  
  @Schema(name = "retry_of", description = "build_num of the build this is a retry of", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("retry_of")
  public JsonNullable<Integer> getRetryOf() {
    return retryOf;
  }

  public void setRetryOf(JsonNullable<Integer> retryOf) {
    this.retryOf = retryOf;
  }

  public Build startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * time build started
   * @return startTime
  */
  @Valid 
  @Schema(name = "start_time", description = "time build started", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public Build stopTime(OffsetDateTime stopTime) {
    this.stopTime = stopTime;
    return this;
  }

  /**
   * time build finished
   * @return stopTime
  */
  @Valid 
  @Schema(name = "stop_time", description = "time build finished", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stop_time")
  public OffsetDateTime getStopTime() {
    return stopTime;
  }

  public void setStopTime(OffsetDateTime stopTime) {
    this.stopTime = stopTime;
  }

  public Build subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Get subject
   * @return subject
  */
  
  @Schema(name = "subject", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("subject")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public Build username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Build vcsUrl(URI vcsUrl) {
    this.vcsUrl = vcsUrl;
    return this;
  }

  /**
   * Get vcsUrl
   * @return vcsUrl
  */
  @Valid 
  @Schema(name = "vcs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vcs_url")
  public URI getVcsUrl() {
    return vcsUrl;
  }

  public void setVcsUrl(URI vcsUrl) {
    this.vcsUrl = vcsUrl;
  }

  public Build why(String why) {
    this.why = why;
    return this;
  }

  /**
   * short string explaining the reason we built
   * @return why
  */
  
  @Schema(name = "why", description = "short string explaining the reason we built", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("why")
  public String getWhy() {
    return why;
  }

  public void setWhy(String why) {
    this.why = why;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Build build = (Build) o;
    return Objects.equals(this.body, build.body) &&
        Objects.equals(this.branch, build.branch) &&
        Objects.equals(this.buildTimeMillis, build.buildTimeMillis) &&
        Objects.equals(this.buildUrl, build.buildUrl) &&
        Objects.equals(this.committerEmail, build.committerEmail) &&
        Objects.equals(this.committerName, build.committerName) &&
        equalsNullable(this.dontBuild, build.dontBuild) &&
        Objects.equals(this.lifecycle, build.lifecycle) &&
        Objects.equals(this.previous, build.previous) &&
        Objects.equals(this.queuedAt, build.queuedAt) &&
        Objects.equals(this.reponame, build.reponame) &&
        equalsNullable(this.retryOf, build.retryOf) &&
        Objects.equals(this.startTime, build.startTime) &&
        Objects.equals(this.stopTime, build.stopTime) &&
        Objects.equals(this.subject, build.subject) &&
        Objects.equals(this.username, build.username) &&
        Objects.equals(this.vcsUrl, build.vcsUrl) &&
        Objects.equals(this.why, build.why);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, branch, buildTimeMillis, buildUrl, committerEmail, committerName, hashCodeNullable(dontBuild), lifecycle, previous, queuedAt, reponame, hashCodeNullable(retryOf), startTime, stopTime, subject, username, vcsUrl, why);
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
    sb.append("class Build {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    buildTimeMillis: ").append(toIndentedString(buildTimeMillis)).append("\n");
    sb.append("    buildUrl: ").append(toIndentedString(buildUrl)).append("\n");
    sb.append("    committerEmail: ").append(toIndentedString(committerEmail)).append("\n");
    sb.append("    committerName: ").append(toIndentedString(committerName)).append("\n");
    sb.append("    dontBuild: ").append(toIndentedString(dontBuild)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    queuedAt: ").append(toIndentedString(queuedAt)).append("\n");
    sb.append("    reponame: ").append(toIndentedString(reponame)).append("\n");
    sb.append("    retryOf: ").append(toIndentedString(retryOf)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    stopTime: ").append(toIndentedString(stopTime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vcsUrl: ").append(toIndentedString(vcsUrl)).append("\n");
    sb.append("    why: ").append(toIndentedString(why)).append("\n");
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

