package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.Deploy;
import org.openapitools.model.RepoInfo;
import org.openapitools.model.SiteDefaultHooksData;
import org.openapitools.model.SiteProcessingSettings;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Site
 */

@JsonTypeName("site")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class Site {

  private String accountName;

  private String accountSlug;

  private String adminUrl;

  private String buildImage;

  private RepoInfo buildSettings;

  @Valid
  private Map<String, Object> capabilities = new HashMap<>();

  private String createdAt;

  private String customDomain;

  private SiteDefaultHooksData defaultHooksData;

  private String deployHook;

  private String deployUrl;

  @Valid
  private List<String> domainAliases;

  private Boolean forceSsl;

  private String gitProvider;

  private String id;

  private String idDomain;

  private Boolean managedDns;

  private String name;

  private String notificationEmail;

  private String password;

  private String plan;

  private String prerender;

  private SiteProcessingSettings processingSettings;

  private Deploy publishedDeploy;

  private String screenshotUrl;

  private String sessionId;

  private Boolean ssl;

  private String sslUrl;

  private String state;

  private String updatedAt;

  private String url;

  private String userId;

  public Site accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Get accountName
   * @return accountName
  */
  
  @Schema(name = "account_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_name")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public Site accountSlug(String accountSlug) {
    this.accountSlug = accountSlug;
    return this;
  }

  /**
   * Get accountSlug
   * @return accountSlug
  */
  
  @Schema(name = "account_slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_slug")
  public String getAccountSlug() {
    return accountSlug;
  }

  public void setAccountSlug(String accountSlug) {
    this.accountSlug = accountSlug;
  }

  public Site adminUrl(String adminUrl) {
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

  public Site buildImage(String buildImage) {
    this.buildImage = buildImage;
    return this;
  }

  /**
   * Get buildImage
   * @return buildImage
  */
  
  @Schema(name = "build_image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_image")
  public String getBuildImage() {
    return buildImage;
  }

  public void setBuildImage(String buildImage) {
    this.buildImage = buildImage;
  }

  public Site buildSettings(RepoInfo buildSettings) {
    this.buildSettings = buildSettings;
    return this;
  }

  /**
   * Get buildSettings
   * @return buildSettings
  */
  @Valid 
  @Schema(name = "build_settings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("build_settings")
  public RepoInfo getBuildSettings() {
    return buildSettings;
  }

  public void setBuildSettings(RepoInfo buildSettings) {
    this.buildSettings = buildSettings;
  }

  public Site capabilities(Map<String, Object> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public Site putCapabilitiesItem(String key, Object capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new HashMap<>();
    }
    this.capabilities.put(key, capabilitiesItem);
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  */
  
  @Schema(name = "capabilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capabilities")
  public Map<String, Object> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(Map<String, Object> capabilities) {
    this.capabilities = capabilities;
  }

  public Site createdAt(String createdAt) {
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

  public Site customDomain(String customDomain) {
    this.customDomain = customDomain;
    return this;
  }

  /**
   * Get customDomain
   * @return customDomain
  */
  
  @Schema(name = "custom_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_domain")
  public String getCustomDomain() {
    return customDomain;
  }

  public void setCustomDomain(String customDomain) {
    this.customDomain = customDomain;
  }

  public Site defaultHooksData(SiteDefaultHooksData defaultHooksData) {
    this.defaultHooksData = defaultHooksData;
    return this;
  }

  /**
   * Get defaultHooksData
   * @return defaultHooksData
  */
  @Valid 
  @Schema(name = "default_hooks_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_hooks_data")
  public SiteDefaultHooksData getDefaultHooksData() {
    return defaultHooksData;
  }

  public void setDefaultHooksData(SiteDefaultHooksData defaultHooksData) {
    this.defaultHooksData = defaultHooksData;
  }

  public Site deployHook(String deployHook) {
    this.deployHook = deployHook;
    return this;
  }

  /**
   * Get deployHook
   * @return deployHook
  */
  
  @Schema(name = "deploy_hook", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploy_hook")
  public String getDeployHook() {
    return deployHook;
  }

  public void setDeployHook(String deployHook) {
    this.deployHook = deployHook;
  }

  public Site deployUrl(String deployUrl) {
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

  public Site domainAliases(List<String> domainAliases) {
    this.domainAliases = domainAliases;
    return this;
  }

  public Site addDomainAliasesItem(String domainAliasesItem) {
    if (this.domainAliases == null) {
      this.domainAliases = new ArrayList<>();
    }
    this.domainAliases.add(domainAliasesItem);
    return this;
  }

  /**
   * Get domainAliases
   * @return domainAliases
  */
  
  @Schema(name = "domain_aliases", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("domain_aliases")
  public List<String> getDomainAliases() {
    return domainAliases;
  }

  public void setDomainAliases(List<String> domainAliases) {
    this.domainAliases = domainAliases;
  }

  public Site forceSsl(Boolean forceSsl) {
    this.forceSsl = forceSsl;
    return this;
  }

  /**
   * Get forceSsl
   * @return forceSsl
  */
  
  @Schema(name = "force_ssl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("force_ssl")
  public Boolean getForceSsl() {
    return forceSsl;
  }

  public void setForceSsl(Boolean forceSsl) {
    this.forceSsl = forceSsl;
  }

  public Site gitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
    return this;
  }

  /**
   * Get gitProvider
   * @return gitProvider
  */
  
  @Schema(name = "git_provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("git_provider")
  public String getGitProvider() {
    return gitProvider;
  }

  public void setGitProvider(String gitProvider) {
    this.gitProvider = gitProvider;
  }

  public Site id(String id) {
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

  public Site idDomain(String idDomain) {
    this.idDomain = idDomain;
    return this;
  }

  /**
   * Get idDomain
   * @return idDomain
  */
  
  @Schema(name = "id_domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id_domain")
  public String getIdDomain() {
    return idDomain;
  }

  public void setIdDomain(String idDomain) {
    this.idDomain = idDomain;
  }

  public Site managedDns(Boolean managedDns) {
    this.managedDns = managedDns;
    return this;
  }

  /**
   * Get managedDns
   * @return managedDns
  */
  
  @Schema(name = "managed_dns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("managed_dns")
  public Boolean getManagedDns() {
    return managedDns;
  }

  public void setManagedDns(Boolean managedDns) {
    this.managedDns = managedDns;
  }

  public Site name(String name) {
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

  public Site notificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
    return this;
  }

  /**
   * Get notificationEmail
   * @return notificationEmail
  */
  
  @Schema(name = "notification_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notification_email")
  public String getNotificationEmail() {
    return notificationEmail;
  }

  public void setNotificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
  }

  public Site password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  
  @Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Site plan(String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Get plan
   * @return plan
  */
  
  @Schema(name = "plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plan")
  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public Site prerender(String prerender) {
    this.prerender = prerender;
    return this;
  }

  /**
   * Get prerender
   * @return prerender
  */
  
  @Schema(name = "prerender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("prerender")
  public String getPrerender() {
    return prerender;
  }

  public void setPrerender(String prerender) {
    this.prerender = prerender;
  }

  public Site processingSettings(SiteProcessingSettings processingSettings) {
    this.processingSettings = processingSettings;
    return this;
  }

  /**
   * Get processingSettings
   * @return processingSettings
  */
  @Valid 
  @Schema(name = "processing_settings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processing_settings")
  public SiteProcessingSettings getProcessingSettings() {
    return processingSettings;
  }

  public void setProcessingSettings(SiteProcessingSettings processingSettings) {
    this.processingSettings = processingSettings;
  }

  public Site publishedDeploy(Deploy publishedDeploy) {
    this.publishedDeploy = publishedDeploy;
    return this;
  }

  /**
   * Get publishedDeploy
   * @return publishedDeploy
  */
  @Valid 
  @Schema(name = "published_deploy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("published_deploy")
  public Deploy getPublishedDeploy() {
    return publishedDeploy;
  }

  public void setPublishedDeploy(Deploy publishedDeploy) {
    this.publishedDeploy = publishedDeploy;
  }

  public Site screenshotUrl(String screenshotUrl) {
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

  public Site sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * Get sessionId
   * @return sessionId
  */
  
  @Schema(name = "session_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("session_id")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public Site ssl(Boolean ssl) {
    this.ssl = ssl;
    return this;
  }

  /**
   * Get ssl
   * @return ssl
  */
  
  @Schema(name = "ssl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssl")
  public Boolean getSsl() {
    return ssl;
  }

  public void setSsl(Boolean ssl) {
    this.ssl = ssl;
  }

  public Site sslUrl(String sslUrl) {
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

  public Site state(String state) {
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

  public Site updatedAt(String updatedAt) {
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

  public Site url(String url) {
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

  public Site userId(String userId) {
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
    Site site = (Site) o;
    return Objects.equals(this.accountName, site.accountName) &&
        Objects.equals(this.accountSlug, site.accountSlug) &&
        Objects.equals(this.adminUrl, site.adminUrl) &&
        Objects.equals(this.buildImage, site.buildImage) &&
        Objects.equals(this.buildSettings, site.buildSettings) &&
        Objects.equals(this.capabilities, site.capabilities) &&
        Objects.equals(this.createdAt, site.createdAt) &&
        Objects.equals(this.customDomain, site.customDomain) &&
        Objects.equals(this.defaultHooksData, site.defaultHooksData) &&
        Objects.equals(this.deployHook, site.deployHook) &&
        Objects.equals(this.deployUrl, site.deployUrl) &&
        Objects.equals(this.domainAliases, site.domainAliases) &&
        Objects.equals(this.forceSsl, site.forceSsl) &&
        Objects.equals(this.gitProvider, site.gitProvider) &&
        Objects.equals(this.id, site.id) &&
        Objects.equals(this.idDomain, site.idDomain) &&
        Objects.equals(this.managedDns, site.managedDns) &&
        Objects.equals(this.name, site.name) &&
        Objects.equals(this.notificationEmail, site.notificationEmail) &&
        Objects.equals(this.password, site.password) &&
        Objects.equals(this.plan, site.plan) &&
        Objects.equals(this.prerender, site.prerender) &&
        Objects.equals(this.processingSettings, site.processingSettings) &&
        Objects.equals(this.publishedDeploy, site.publishedDeploy) &&
        Objects.equals(this.screenshotUrl, site.screenshotUrl) &&
        Objects.equals(this.sessionId, site.sessionId) &&
        Objects.equals(this.ssl, site.ssl) &&
        Objects.equals(this.sslUrl, site.sslUrl) &&
        Objects.equals(this.state, site.state) &&
        Objects.equals(this.updatedAt, site.updatedAt) &&
        Objects.equals(this.url, site.url) &&
        Objects.equals(this.userId, site.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, accountSlug, adminUrl, buildImage, buildSettings, capabilities, createdAt, customDomain, defaultHooksData, deployHook, deployUrl, domainAliases, forceSsl, gitProvider, id, idDomain, managedDns, name, notificationEmail, password, plan, prerender, processingSettings, publishedDeploy, screenshotUrl, sessionId, ssl, sslUrl, state, updatedAt, url, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Site {\n");
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    accountSlug: ").append(toIndentedString(accountSlug)).append("\n");
    sb.append("    adminUrl: ").append(toIndentedString(adminUrl)).append("\n");
    sb.append("    buildImage: ").append(toIndentedString(buildImage)).append("\n");
    sb.append("    buildSettings: ").append(toIndentedString(buildSettings)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customDomain: ").append(toIndentedString(customDomain)).append("\n");
    sb.append("    defaultHooksData: ").append(toIndentedString(defaultHooksData)).append("\n");
    sb.append("    deployHook: ").append(toIndentedString(deployHook)).append("\n");
    sb.append("    deployUrl: ").append(toIndentedString(deployUrl)).append("\n");
    sb.append("    domainAliases: ").append(toIndentedString(domainAliases)).append("\n");
    sb.append("    forceSsl: ").append(toIndentedString(forceSsl)).append("\n");
    sb.append("    gitProvider: ").append(toIndentedString(gitProvider)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idDomain: ").append(toIndentedString(idDomain)).append("\n");
    sb.append("    managedDns: ").append(toIndentedString(managedDns)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationEmail: ").append(toIndentedString(notificationEmail)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    prerender: ").append(toIndentedString(prerender)).append("\n");
    sb.append("    processingSettings: ").append(toIndentedString(processingSettings)).append("\n");
    sb.append("    publishedDeploy: ").append(toIndentedString(publishedDeploy)).append("\n");
    sb.append("    screenshotUrl: ").append(toIndentedString(screenshotUrl)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    sslUrl: ").append(toIndentedString(sslUrl)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

