package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeploySiteCapabilities;
import org.openapitools.model.FunctionSchedule;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Deploy
 */

@JsonTypeName("deploy")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class Deploy {

  private String adminUrl;

  private String branch;

  private String buildId;

  private String commitRef;

  private String commitUrl;

  private String context;

  private String createdAt;

  private String deploySslUrl;

  private String deployUrl;

  private Boolean draft;

  private String errorMessage;

  private String framework;

  @Valid
  private List<@Valid FunctionSchedule> functionSchedules;

  private String id;

  private Boolean locked;

  private String name;

  private String publishedAt;

  @Valid
  private List<String> required;

  @Valid
  private List<String> requiredFunctions;

  private BigDecimal reviewId;

  private String reviewUrl;

  private String screenshotUrl;

  private DeploySiteCapabilities siteCapabilities;

  private String siteId;

  private Boolean skipped;

  private String sslUrl;

  private String state;

  private String title;

  private String updatedAt;

  private String url;

  private String userId;

  public Deploy adminUrl(String adminUrl) {
    this.adminUrl = adminUrl;
    return this;
  }

  /**
   * Get adminUrl
   * @return adminUrl
  */
  
  @Schema(name = "admin_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("admin_url")
  public String getAdminUrl() {
    return adminUrl;
  }

  public void setAdminUrl(String adminUrl) {
    this.adminUrl = adminUrl;
  }

  public Deploy branch(String branch) {
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

  public Deploy buildId(String buildId) {
    this.buildId = buildId;
    return this;
  }

  /**
   * Get buildId
   * @return buildId
  */
  
  @Schema(name = "build_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_id")
  public String getBuildId() {
    return buildId;
  }

  public void setBuildId(String buildId) {
    this.buildId = buildId;
  }

  public Deploy commitRef(String commitRef) {
    this.commitRef = commitRef;
    return this;
  }

  /**
   * Get commitRef
   * @return commitRef
  */
  
  @Schema(name = "commit_ref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commit_ref")
  public String getCommitRef() {
    return commitRef;
  }

  public void setCommitRef(String commitRef) {
    this.commitRef = commitRef;
  }

  public Deploy commitUrl(String commitUrl) {
    this.commitUrl = commitUrl;
    return this;
  }

  /**
   * Get commitUrl
   * @return commitUrl
  */
  
  @Schema(name = "commit_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("commit_url")
  public String getCommitUrl() {
    return commitUrl;
  }

  public void setCommitUrl(String commitUrl) {
    this.commitUrl = commitUrl;
  }

  public Deploy context(String context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  
  @Schema(name = "context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public Deploy createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Deploy deploySslUrl(String deploySslUrl) {
    this.deploySslUrl = deploySslUrl;
    return this;
  }

  /**
   * Get deploySslUrl
   * @return deploySslUrl
  */
  
  @Schema(name = "deploy_ssl_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploy_ssl_url")
  public String getDeploySslUrl() {
    return deploySslUrl;
  }

  public void setDeploySslUrl(String deploySslUrl) {
    this.deploySslUrl = deploySslUrl;
  }

  public Deploy deployUrl(String deployUrl) {
    this.deployUrl = deployUrl;
    return this;
  }

  /**
   * Get deployUrl
   * @return deployUrl
  */
  
  @Schema(name = "deploy_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploy_url")
  public String getDeployUrl() {
    return deployUrl;
  }

  public void setDeployUrl(String deployUrl) {
    this.deployUrl = deployUrl;
  }

  public Deploy draft(Boolean draft) {
    this.draft = draft;
    return this;
  }

  /**
   * Get draft
   * @return draft
  */
  
  @Schema(name = "draft", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("draft")
  public Boolean getDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public Deploy errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Get errorMessage
   * @return errorMessage
  */
  
  @Schema(name = "error_message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("error_message")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public Deploy framework(String framework) {
    this.framework = framework;
    return this;
  }

  /**
   * Get framework
   * @return framework
  */
  
  @Schema(name = "framework", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("framework")
  public String getFramework() {
    return framework;
  }

  public void setFramework(String framework) {
    this.framework = framework;
  }

  public Deploy functionSchedules(List<@Valid FunctionSchedule> functionSchedules) {
    this.functionSchedules = functionSchedules;
    return this;
  }

  public Deploy addFunctionSchedulesItem(FunctionSchedule functionSchedulesItem) {
    if (this.functionSchedules == null) {
      this.functionSchedules = new ArrayList<>();
    }
    this.functionSchedules.add(functionSchedulesItem);
    return this;
  }

  /**
   * Get functionSchedules
   * @return functionSchedules
  */
  @Valid 
  @Schema(name = "function_schedules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("function_schedules")
  public List<@Valid FunctionSchedule> getFunctionSchedules() {
    return functionSchedules;
  }

  public void setFunctionSchedules(List<@Valid FunctionSchedule> functionSchedules) {
    this.functionSchedules = functionSchedules;
  }

  public Deploy id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Deploy locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

  /**
   * Get locked
   * @return locked
  */
  
  @Schema(name = "locked", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("locked")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public Deploy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Deploy publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Get publishedAt
   * @return publishedAt
  */
  
  @Schema(name = "published_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("published_at")
  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public Deploy required(List<String> required) {
    this.required = required;
    return this;
  }

  public Deploy addRequiredItem(String requiredItem) {
    if (this.required == null) {
      this.required = new ArrayList<>();
    }
    this.required.add(requiredItem);
    return this;
  }

  /**
   * Get required
   * @return required
  */
  
  @Schema(name = "required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required")
  public List<String> getRequired() {
    return required;
  }

  public void setRequired(List<String> required) {
    this.required = required;
  }

  public Deploy requiredFunctions(List<String> requiredFunctions) {
    this.requiredFunctions = requiredFunctions;
    return this;
  }

  public Deploy addRequiredFunctionsItem(String requiredFunctionsItem) {
    if (this.requiredFunctions == null) {
      this.requiredFunctions = new ArrayList<>();
    }
    this.requiredFunctions.add(requiredFunctionsItem);
    return this;
  }

  /**
   * Get requiredFunctions
   * @return requiredFunctions
  */
  
  @Schema(name = "required_functions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("required_functions")
  public List<String> getRequiredFunctions() {
    return requiredFunctions;
  }

  public void setRequiredFunctions(List<String> requiredFunctions) {
    this.requiredFunctions = requiredFunctions;
  }

  public Deploy reviewId(BigDecimal reviewId) {
    this.reviewId = reviewId;
    return this;
  }

  /**
   * Get reviewId
   * @return reviewId
  */
  @Valid 
  @Schema(name = "review_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("review_id")
  public BigDecimal getReviewId() {
    return reviewId;
  }

  public void setReviewId(BigDecimal reviewId) {
    this.reviewId = reviewId;
  }

  public Deploy reviewUrl(String reviewUrl) {
    this.reviewUrl = reviewUrl;
    return this;
  }

  /**
   * Get reviewUrl
   * @return reviewUrl
  */
  
  @Schema(name = "review_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("review_url")
  public String getReviewUrl() {
    return reviewUrl;
  }

  public void setReviewUrl(String reviewUrl) {
    this.reviewUrl = reviewUrl;
  }

  public Deploy screenshotUrl(String screenshotUrl) {
    this.screenshotUrl = screenshotUrl;
    return this;
  }

  /**
   * Get screenshotUrl
   * @return screenshotUrl
  */
  
  @Schema(name = "screenshot_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("screenshot_url")
  public String getScreenshotUrl() {
    return screenshotUrl;
  }

  public void setScreenshotUrl(String screenshotUrl) {
    this.screenshotUrl = screenshotUrl;
  }

  public Deploy siteCapabilities(DeploySiteCapabilities siteCapabilities) {
    this.siteCapabilities = siteCapabilities;
    return this;
  }

  /**
   * Get siteCapabilities
   * @return siteCapabilities
  */
  @Valid 
  @Schema(name = "site_capabilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site_capabilities")
  public DeploySiteCapabilities getSiteCapabilities() {
    return siteCapabilities;
  }

  public void setSiteCapabilities(DeploySiteCapabilities siteCapabilities) {
    this.siteCapabilities = siteCapabilities;
  }

  public Deploy siteId(String siteId) {
    this.siteId = siteId;
    return this;
  }

  /**
   * Get siteId
   * @return siteId
  */
  
  @Schema(name = "site_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("site_id")
  public String getSiteId() {
    return siteId;
  }

  public void setSiteId(String siteId) {
    this.siteId = siteId;
  }

  public Deploy skipped(Boolean skipped) {
    this.skipped = skipped;
    return this;
  }

  /**
   * Get skipped
   * @return skipped
  */
  
  @Schema(name = "skipped", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("skipped")
  public Boolean getSkipped() {
    return skipped;
  }

  public void setSkipped(Boolean skipped) {
    this.skipped = skipped;
  }

  public Deploy sslUrl(String sslUrl) {
    this.sslUrl = sslUrl;
    return this;
  }

  /**
   * Get sslUrl
   * @return sslUrl
  */
  
  @Schema(name = "ssl_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssl_url")
  public String getSslUrl() {
    return sslUrl;
  }

  public void setSslUrl(String sslUrl) {
    this.sslUrl = sslUrl;
  }

  public Deploy state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Deploy title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Deploy updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  
  @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Deploy url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Deploy userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deploy deploy = (Deploy) o;
    return Objects.equals(this.adminUrl, deploy.adminUrl) &&
        Objects.equals(this.branch, deploy.branch) &&
        Objects.equals(this.buildId, deploy.buildId) &&
        Objects.equals(this.commitRef, deploy.commitRef) &&
        Objects.equals(this.commitUrl, deploy.commitUrl) &&
        Objects.equals(this.context, deploy.context) &&
        Objects.equals(this.createdAt, deploy.createdAt) &&
        Objects.equals(this.deploySslUrl, deploy.deploySslUrl) &&
        Objects.equals(this.deployUrl, deploy.deployUrl) &&
        Objects.equals(this.draft, deploy.draft) &&
        Objects.equals(this.errorMessage, deploy.errorMessage) &&
        Objects.equals(this.framework, deploy.framework) &&
        Objects.equals(this.functionSchedules, deploy.functionSchedules) &&
        Objects.equals(this.id, deploy.id) &&
        Objects.equals(this.locked, deploy.locked) &&
        Objects.equals(this.name, deploy.name) &&
        Objects.equals(this.publishedAt, deploy.publishedAt) &&
        Objects.equals(this.required, deploy.required) &&
        Objects.equals(this.requiredFunctions, deploy.requiredFunctions) &&
        Objects.equals(this.reviewId, deploy.reviewId) &&
        Objects.equals(this.reviewUrl, deploy.reviewUrl) &&
        Objects.equals(this.screenshotUrl, deploy.screenshotUrl) &&
        Objects.equals(this.siteCapabilities, deploy.siteCapabilities) &&
        Objects.equals(this.siteId, deploy.siteId) &&
        Objects.equals(this.skipped, deploy.skipped) &&
        Objects.equals(this.sslUrl, deploy.sslUrl) &&
        Objects.equals(this.state, deploy.state) &&
        Objects.equals(this.title, deploy.title) &&
        Objects.equals(this.updatedAt, deploy.updatedAt) &&
        Objects.equals(this.url, deploy.url) &&
        Objects.equals(this.userId, deploy.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adminUrl, branch, buildId, commitRef, commitUrl, context, createdAt, deploySslUrl, deployUrl, draft, errorMessage, framework, functionSchedules, id, locked, name, publishedAt, required, requiredFunctions, reviewId, reviewUrl, screenshotUrl, siteCapabilities, siteId, skipped, sslUrl, state, title, updatedAt, url, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deploy {\n");
    sb.append("    adminUrl: ").append(toIndentedString(adminUrl)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
    sb.append("    commitRef: ").append(toIndentedString(commitRef)).append("\n");
    sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deploySslUrl: ").append(toIndentedString(deploySslUrl)).append("\n");
    sb.append("    deployUrl: ").append(toIndentedString(deployUrl)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    framework: ").append(toIndentedString(framework)).append("\n");
    sb.append("    functionSchedules: ").append(toIndentedString(functionSchedules)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requiredFunctions: ").append(toIndentedString(requiredFunctions)).append("\n");
    sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
    sb.append("    reviewUrl: ").append(toIndentedString(reviewUrl)).append("\n");
    sb.append("    screenshotUrl: ").append(toIndentedString(screenshotUrl)).append("\n");
    sb.append("    siteCapabilities: ").append(toIndentedString(siteCapabilities)).append("\n");
    sb.append("    siteId: ").append(toIndentedString(siteId)).append("\n");
    sb.append("    skipped: ").append(toIndentedString(skipped)).append("\n");
    sb.append("    sslUrl: ").append(toIndentedString(sslUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

