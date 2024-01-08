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
 * User
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class User {

  private Boolean admin;

  @Valid
  private List<@Email String> allEmails;

  private String analyticsId;

  private URI avatarUrl;

  private String basicEmailPrefs;

  private JsonNullable<Integer> bitbucket = JsonNullable.<Integer>undefined();

  private Boolean bitbucketAuthorized;

  private Integer containers;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private Integer daysLeftInTrial;

  private Boolean devAdmin;

  @Valid
  private List<String> enrolledBetas;

  private JsonNullable<Integer> githubId = JsonNullable.<Integer>undefined();

  @Valid
  private List<String> githubOauthScopes;

  private JsonNullable<Integer> gravatarId = JsonNullable.<Integer>undefined();

  private JsonNullable<String> herokuApiKey = JsonNullable.<String>undefined();

  private Boolean inBetaProgram;

  private String login;

  private String name;

  private Object organizationPrefs;

  private Integer parallelism;

  private JsonNullable<String> plan = JsonNullable.<String>undefined();

  private Object projects;

  private String pusherId;

  private String selectedEmail;

  private Integer signInCount;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime trialEnd;

  public User admin(Boolean admin) {
    this.admin = admin;
    return this;
  }

  /**
   * Get admin
   * @return admin
  */
  
  @Schema(name = "admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("admin")
  public Boolean getAdmin() {
    return admin;
  }

  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }

  public User allEmails(List<@Email String> allEmails) {
    this.allEmails = allEmails;
    return this;
  }

  public User addAllEmailsItem(String allEmailsItem) {
    if (this.allEmails == null) {
      this.allEmails = new ArrayList<>();
    }
    this.allEmails.add(allEmailsItem);
    return this;
  }

  /**
   * Get allEmails
   * @return allEmails
  */
  
  @Schema(name = "all_emails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("all_emails")
  public List<@Email String> getAllEmails() {
    return allEmails;
  }

  public void setAllEmails(List<@Email String> allEmails) {
    this.allEmails = allEmails;
  }

  public User analyticsId(String analyticsId) {
    this.analyticsId = analyticsId;
    return this;
  }

  /**
   * Get analyticsId
   * @return analyticsId
  */
  
  @Schema(name = "analytics_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("analytics_id")
  public String getAnalyticsId() {
    return analyticsId;
  }

  public void setAnalyticsId(String analyticsId) {
    this.analyticsId = analyticsId;
  }

  public User avatarUrl(URI avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

  /**
   * Get avatarUrl
   * @return avatarUrl
  */
  @Valid 
  @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("avatar_url")
  public URI getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(URI avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public User basicEmailPrefs(String basicEmailPrefs) {
    this.basicEmailPrefs = basicEmailPrefs;
    return this;
  }

  /**
   * Get basicEmailPrefs
   * @return basicEmailPrefs
  */
  
  @Schema(name = "basic_email_prefs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("basic_email_prefs")
  public String getBasicEmailPrefs() {
    return basicEmailPrefs;
  }

  public void setBasicEmailPrefs(String basicEmailPrefs) {
    this.basicEmailPrefs = basicEmailPrefs;
  }

  public User bitbucket(Integer bitbucket) {
    this.bitbucket = JsonNullable.of(bitbucket);
    return this;
  }

  /**
   * Get bitbucket
   * @return bitbucket
  */
  
  @Schema(name = "bitbucket", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bitbucket")
  public JsonNullable<Integer> getBitbucket() {
    return bitbucket;
  }

  public void setBitbucket(JsonNullable<Integer> bitbucket) {
    this.bitbucket = bitbucket;
  }

  public User bitbucketAuthorized(Boolean bitbucketAuthorized) {
    this.bitbucketAuthorized = bitbucketAuthorized;
    return this;
  }

  /**
   * Get bitbucketAuthorized
   * @return bitbucketAuthorized
  */
  
  @Schema(name = "bitbucket_authorized", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bitbucket_authorized")
  public Boolean getBitbucketAuthorized() {
    return bitbucketAuthorized;
  }

  public void setBitbucketAuthorized(Boolean bitbucketAuthorized) {
    this.bitbucketAuthorized = bitbucketAuthorized;
  }

  public User containers(Integer containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Get containers
   * @return containers
  */
  
  @Schema(name = "containers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containers")
  public Integer getContainers() {
    return containers;
  }

  public void setContainers(Integer containers) {
    this.containers = containers;
  }

  public User createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_at")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public User daysLeftInTrial(Integer daysLeftInTrial) {
    this.daysLeftInTrial = daysLeftInTrial;
    return this;
  }

  /**
   * Get daysLeftInTrial
   * @return daysLeftInTrial
  */
  
  @Schema(name = "days_left_in_trial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("days_left_in_trial")
  public Integer getDaysLeftInTrial() {
    return daysLeftInTrial;
  }

  public void setDaysLeftInTrial(Integer daysLeftInTrial) {
    this.daysLeftInTrial = daysLeftInTrial;
  }

  public User devAdmin(Boolean devAdmin) {
    this.devAdmin = devAdmin;
    return this;
  }

  /**
   * Get devAdmin
   * @return devAdmin
  */
  
  @Schema(name = "dev_admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dev_admin")
  public Boolean getDevAdmin() {
    return devAdmin;
  }

  public void setDevAdmin(Boolean devAdmin) {
    this.devAdmin = devAdmin;
  }

  public User enrolledBetas(List<String> enrolledBetas) {
    this.enrolledBetas = enrolledBetas;
    return this;
  }

  public User addEnrolledBetasItem(String enrolledBetasItem) {
    if (this.enrolledBetas == null) {
      this.enrolledBetas = new ArrayList<>();
    }
    this.enrolledBetas.add(enrolledBetasItem);
    return this;
  }

  /**
   * Get enrolledBetas
   * @return enrolledBetas
  */
  
  @Schema(name = "enrolled_betas", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enrolled_betas")
  public List<String> getEnrolledBetas() {
    return enrolledBetas;
  }

  public void setEnrolledBetas(List<String> enrolledBetas) {
    this.enrolledBetas = enrolledBetas;
  }

  public User githubId(Integer githubId) {
    this.githubId = JsonNullable.of(githubId);
    return this;
  }

  /**
   * Get githubId
   * @return githubId
  */
  
  @Schema(name = "github_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("github_id")
  public JsonNullable<Integer> getGithubId() {
    return githubId;
  }

  public void setGithubId(JsonNullable<Integer> githubId) {
    this.githubId = githubId;
  }

  public User githubOauthScopes(List<String> githubOauthScopes) {
    this.githubOauthScopes = githubOauthScopes;
    return this;
  }

  public User addGithubOauthScopesItem(String githubOauthScopesItem) {
    if (this.githubOauthScopes == null) {
      this.githubOauthScopes = new ArrayList<>();
    }
    this.githubOauthScopes.add(githubOauthScopesItem);
    return this;
  }

  /**
   * Get githubOauthScopes
   * @return githubOauthScopes
  */
  
  @Schema(name = "github_oauth_scopes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("github_oauth_scopes")
  public List<String> getGithubOauthScopes() {
    return githubOauthScopes;
  }

  public void setGithubOauthScopes(List<String> githubOauthScopes) {
    this.githubOauthScopes = githubOauthScopes;
  }

  public User gravatarId(Integer gravatarId) {
    this.gravatarId = JsonNullable.of(gravatarId);
    return this;
  }

  /**
   * Get gravatarId
   * @return gravatarId
  */
  
  @Schema(name = "gravatar_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gravatar_id")
  public JsonNullable<Integer> getGravatarId() {
    return gravatarId;
  }

  public void setGravatarId(JsonNullable<Integer> gravatarId) {
    this.gravatarId = gravatarId;
  }

  public User herokuApiKey(String herokuApiKey) {
    this.herokuApiKey = JsonNullable.of(herokuApiKey);
    return this;
  }

  /**
   * Get herokuApiKey
   * @return herokuApiKey
  */
  
  @Schema(name = "heroku_api_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heroku_api_key")
  public JsonNullable<String> getHerokuApiKey() {
    return herokuApiKey;
  }

  public void setHerokuApiKey(JsonNullable<String> herokuApiKey) {
    this.herokuApiKey = herokuApiKey;
  }

  public User inBetaProgram(Boolean inBetaProgram) {
    this.inBetaProgram = inBetaProgram;
    return this;
  }

  /**
   * Get inBetaProgram
   * @return inBetaProgram
  */
  
  @Schema(name = "in_beta_program", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("in_beta_program")
  public Boolean getInBetaProgram() {
    return inBetaProgram;
  }

  public void setInBetaProgram(Boolean inBetaProgram) {
    this.inBetaProgram = inBetaProgram;
  }

  public User login(String login) {
    this.login = login;
    return this;
  }

  /**
   * Get login
   * @return login
  */
  
  @Schema(name = "login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login")
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public User name(String name) {
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

  public User organizationPrefs(Object organizationPrefs) {
    this.organizationPrefs = organizationPrefs;
    return this;
  }

  /**
   * Get organizationPrefs
   * @return organizationPrefs
  */
  
  @Schema(name = "organization_prefs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("organization_prefs")
  public Object getOrganizationPrefs() {
    return organizationPrefs;
  }

  public void setOrganizationPrefs(Object organizationPrefs) {
    this.organizationPrefs = organizationPrefs;
  }

  public User parallelism(Integer parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  /**
   * Get parallelism
   * @return parallelism
  */
  
  @Schema(name = "parallelism", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parallelism")
  public Integer getParallelism() {
    return parallelism;
  }

  public void setParallelism(Integer parallelism) {
    this.parallelism = parallelism;
  }

  public User plan(String plan) {
    this.plan = JsonNullable.of(plan);
    return this;
  }

  /**
   * Get plan
   * @return plan
  */
  
  @Schema(name = "plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plan")
  public JsonNullable<String> getPlan() {
    return plan;
  }

  public void setPlan(JsonNullable<String> plan) {
    this.plan = plan;
  }

  public User projects(Object projects) {
    this.projects = projects;
    return this;
  }

  /**
   * Get projects
   * @return projects
  */
  
  @Schema(name = "projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projects")
  public Object getProjects() {
    return projects;
  }

  public void setProjects(Object projects) {
    this.projects = projects;
  }

  public User pusherId(String pusherId) {
    this.pusherId = pusherId;
    return this;
  }

  /**
   * Get pusherId
   * @return pusherId
  */
  
  @Schema(name = "pusher_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pusher_id")
  public String getPusherId() {
    return pusherId;
  }

  public void setPusherId(String pusherId) {
    this.pusherId = pusherId;
  }

  public User selectedEmail(String selectedEmail) {
    this.selectedEmail = selectedEmail;
    return this;
  }

  /**
   * Get selectedEmail
   * @return selectedEmail
  */
  @javax.validation.constraints.Email 
  @Schema(name = "selected_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("selected_email")
  public String getSelectedEmail() {
    return selectedEmail;
  }

  public void setSelectedEmail(String selectedEmail) {
    this.selectedEmail = selectedEmail;
  }

  public User signInCount(Integer signInCount) {
    this.signInCount = signInCount;
    return this;
  }

  /**
   * Get signInCount
   * @return signInCount
  */
  
  @Schema(name = "sign_in_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sign_in_count")
  public Integer getSignInCount() {
    return signInCount;
  }

  public void setSignInCount(Integer signInCount) {
    this.signInCount = signInCount;
  }

  public User trialEnd(OffsetDateTime trialEnd) {
    this.trialEnd = trialEnd;
    return this;
  }

  /**
   * Get trialEnd
   * @return trialEnd
  */
  @Valid 
  @Schema(name = "trial_end", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trial_end")
  public OffsetDateTime getTrialEnd() {
    return trialEnd;
  }

  public void setTrialEnd(OffsetDateTime trialEnd) {
    this.trialEnd = trialEnd;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.admin, user.admin) &&
        Objects.equals(this.allEmails, user.allEmails) &&
        Objects.equals(this.analyticsId, user.analyticsId) &&
        Objects.equals(this.avatarUrl, user.avatarUrl) &&
        Objects.equals(this.basicEmailPrefs, user.basicEmailPrefs) &&
        equalsNullable(this.bitbucket, user.bitbucket) &&
        Objects.equals(this.bitbucketAuthorized, user.bitbucketAuthorized) &&
        Objects.equals(this.containers, user.containers) &&
        Objects.equals(this.createdAt, user.createdAt) &&
        Objects.equals(this.daysLeftInTrial, user.daysLeftInTrial) &&
        Objects.equals(this.devAdmin, user.devAdmin) &&
        Objects.equals(this.enrolledBetas, user.enrolledBetas) &&
        equalsNullable(this.githubId, user.githubId) &&
        Objects.equals(this.githubOauthScopes, user.githubOauthScopes) &&
        equalsNullable(this.gravatarId, user.gravatarId) &&
        equalsNullable(this.herokuApiKey, user.herokuApiKey) &&
        Objects.equals(this.inBetaProgram, user.inBetaProgram) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.organizationPrefs, user.organizationPrefs) &&
        Objects.equals(this.parallelism, user.parallelism) &&
        equalsNullable(this.plan, user.plan) &&
        Objects.equals(this.projects, user.projects) &&
        Objects.equals(this.pusherId, user.pusherId) &&
        Objects.equals(this.selectedEmail, user.selectedEmail) &&
        Objects.equals(this.signInCount, user.signInCount) &&
        Objects.equals(this.trialEnd, user.trialEnd);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(admin, allEmails, analyticsId, avatarUrl, basicEmailPrefs, hashCodeNullable(bitbucket), bitbucketAuthorized, containers, createdAt, daysLeftInTrial, devAdmin, enrolledBetas, hashCodeNullable(githubId), githubOauthScopes, hashCodeNullable(gravatarId), hashCodeNullable(herokuApiKey), inBetaProgram, login, name, organizationPrefs, parallelism, hashCodeNullable(plan), projects, pusherId, selectedEmail, signInCount, trialEnd);
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
    sb.append("class User {\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    allEmails: ").append(toIndentedString(allEmails)).append("\n");
    sb.append("    analyticsId: ").append(toIndentedString(analyticsId)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    basicEmailPrefs: ").append(toIndentedString(basicEmailPrefs)).append("\n");
    sb.append("    bitbucket: ").append(toIndentedString(bitbucket)).append("\n");
    sb.append("    bitbucketAuthorized: ").append(toIndentedString(bitbucketAuthorized)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    daysLeftInTrial: ").append(toIndentedString(daysLeftInTrial)).append("\n");
    sb.append("    devAdmin: ").append(toIndentedString(devAdmin)).append("\n");
    sb.append("    enrolledBetas: ").append(toIndentedString(enrolledBetas)).append("\n");
    sb.append("    githubId: ").append(toIndentedString(githubId)).append("\n");
    sb.append("    githubOauthScopes: ").append(toIndentedString(githubOauthScopes)).append("\n");
    sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
    sb.append("    herokuApiKey: ").append(toIndentedString(herokuApiKey)).append("\n");
    sb.append("    inBetaProgram: ").append(toIndentedString(inBetaProgram)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    organizationPrefs: ").append(toIndentedString(organizationPrefs)).append("\n");
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    pusherId: ").append(toIndentedString(pusherId)).append("\n");
    sb.append("    selectedEmail: ").append(toIndentedString(selectedEmail)).append("\n");
    sb.append("    signInCount: ").append(toIndentedString(signInCount)).append("\n");
    sb.append("    trialEnd: ").append(toIndentedString(trialEnd)).append("\n");
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

