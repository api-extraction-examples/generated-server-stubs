package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Aws;
import org.openapitools.model.ProjectFeatureFlags;
import org.openapitools.model.Scope;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Project
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class Project {

  private Aws aws;

  private Object branches;

  private JsonNullable<String> campfireNotifyPrefs = JsonNullable.<String>undefined();

  private JsonNullable<String> campfireRoom = JsonNullable.<String>undefined();

  private JsonNullable<String> campfireSubdomain = JsonNullable.<String>undefined();

  private JsonNullable<String> campfireToken = JsonNullable.<String>undefined();

  private String compile;

  private String defaultBranch;

  private String dependencies;

  private String extra;

  private ProjectFeatureFlags featureFlags;

  private JsonNullable<String> flowdockApiToken = JsonNullable.<String>undefined();

  private Boolean followed;

  private Boolean hasUsableKey;

  private JsonNullable<String> herokuDeployUser = JsonNullable.<String>undefined();

  private JsonNullable<String> hipchatApiToken = JsonNullable.<String>undefined();

  private JsonNullable<String> hipchatNotify = JsonNullable.<String>undefined();

  private JsonNullable<String> hipchatNotifyPrefs = JsonNullable.<String>undefined();

  private JsonNullable<String> hipchatRoom = JsonNullable.<String>undefined();

  private JsonNullable<String> ircChannel = JsonNullable.<String>undefined();

  private JsonNullable<String> ircKeyword = JsonNullable.<String>undefined();

  private JsonNullable<String> ircNotifyPrefs = JsonNullable.<String>undefined();

  private JsonNullable<String> ircPassword = JsonNullable.<String>undefined();

  private JsonNullable<String> ircServer = JsonNullable.<String>undefined();

  private JsonNullable<String> ircUsername = JsonNullable.<String>undefined();

  private String language;

  private Boolean oss;

  private Integer parallel;

  private String reponame;

  @Valid
  private List<@Valid Scope> scopes;

  private String setup;

  private JsonNullable<String> slackApiToken = JsonNullable.<String>undefined();

  private JsonNullable<String> slackChannel = JsonNullable.<String>undefined();

  private JsonNullable<String> slackChannelOverride = JsonNullable.<String>undefined();

  private JsonNullable<String> slackNotifyPrefs = JsonNullable.<String>undefined();

  private JsonNullable<String> slackSubdomain = JsonNullable.<String>undefined();

  private URI slackWebhookUrl;

  @Valid
  private List<String> sshKeys;

  private String test;

  private String username;

  private String vcsType;

  private URI vcsUrl;

  public Project aws(Aws aws) {
    this.aws = aws;
    return this;
  }

  /**
   * Get aws
   * @return aws
  */
  @Valid 
  @Schema(name = "aws", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aws")
  public Aws getAws() {
    return aws;
  }

  public void setAws(Aws aws) {
    this.aws = aws;
  }

  public Project branches(Object branches) {
    this.branches = branches;
    return this;
  }

  /**
   * Get branches
   * @return branches
  */
  
  @Schema(name = "branches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("branches")
  public Object getBranches() {
    return branches;
  }

  public void setBranches(Object branches) {
    this.branches = branches;
  }

  public Project campfireNotifyPrefs(String campfireNotifyPrefs) {
    this.campfireNotifyPrefs = JsonNullable.of(campfireNotifyPrefs);
    return this;
  }

  /**
   * Get campfireNotifyPrefs
   * @return campfireNotifyPrefs
  */
  
  @Schema(name = "campfire_notify_prefs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campfire_notify_prefs")
  public JsonNullable<String> getCampfireNotifyPrefs() {
    return campfireNotifyPrefs;
  }

  public void setCampfireNotifyPrefs(JsonNullable<String> campfireNotifyPrefs) {
    this.campfireNotifyPrefs = campfireNotifyPrefs;
  }

  public Project campfireRoom(String campfireRoom) {
    this.campfireRoom = JsonNullable.of(campfireRoom);
    return this;
  }

  /**
   * Get campfireRoom
   * @return campfireRoom
  */
  
  @Schema(name = "campfire_room", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campfire_room")
  public JsonNullable<String> getCampfireRoom() {
    return campfireRoom;
  }

  public void setCampfireRoom(JsonNullable<String> campfireRoom) {
    this.campfireRoom = campfireRoom;
  }

  public Project campfireSubdomain(String campfireSubdomain) {
    this.campfireSubdomain = JsonNullable.of(campfireSubdomain);
    return this;
  }

  /**
   * Get campfireSubdomain
   * @return campfireSubdomain
  */
  
  @Schema(name = "campfire_subdomain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campfire_subdomain")
  public JsonNullable<String> getCampfireSubdomain() {
    return campfireSubdomain;
  }

  public void setCampfireSubdomain(JsonNullable<String> campfireSubdomain) {
    this.campfireSubdomain = campfireSubdomain;
  }

  public Project campfireToken(String campfireToken) {
    this.campfireToken = JsonNullable.of(campfireToken);
    return this;
  }

  /**
   * Get campfireToken
   * @return campfireToken
  */
  
  @Schema(name = "campfire_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campfire_token")
  public JsonNullable<String> getCampfireToken() {
    return campfireToken;
  }

  public void setCampfireToken(JsonNullable<String> campfireToken) {
    this.campfireToken = campfireToken;
  }

  public Project compile(String compile) {
    this.compile = compile;
    return this;
  }

  /**
   * Get compile
   * @return compile
  */
  
  @Schema(name = "compile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compile")
  public String getCompile() {
    return compile;
  }

  public void setCompile(String compile) {
    this.compile = compile;
  }

  public Project defaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
    return this;
  }

  /**
   * Get defaultBranch
   * @return defaultBranch
  */
  
  @Schema(name = "default_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_branch")
  public String getDefaultBranch() {
    return defaultBranch;
  }

  public void setDefaultBranch(String defaultBranch) {
    this.defaultBranch = defaultBranch;
  }

  public Project dependencies(String dependencies) {
    this.dependencies = dependencies;
    return this;
  }

  /**
   * Get dependencies
   * @return dependencies
  */
  
  @Schema(name = "dependencies", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependencies")
  public String getDependencies() {
    return dependencies;
  }

  public void setDependencies(String dependencies) {
    this.dependencies = dependencies;
  }

  public Project extra(String extra) {
    this.extra = extra;
    return this;
  }

  /**
   * Get extra
   * @return extra
  */
  
  @Schema(name = "extra", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra")
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }

  public Project featureFlags(ProjectFeatureFlags featureFlags) {
    this.featureFlags = featureFlags;
    return this;
  }

  /**
   * Get featureFlags
   * @return featureFlags
  */
  @Valid 
  @Schema(name = "feature_flags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("feature_flags")
  public ProjectFeatureFlags getFeatureFlags() {
    return featureFlags;
  }

  public void setFeatureFlags(ProjectFeatureFlags featureFlags) {
    this.featureFlags = featureFlags;
  }

  public Project flowdockApiToken(String flowdockApiToken) {
    this.flowdockApiToken = JsonNullable.of(flowdockApiToken);
    return this;
  }

  /**
   * Get flowdockApiToken
   * @return flowdockApiToken
  */
  
  @Schema(name = "flowdock_api_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("flowdock_api_token")
  public JsonNullable<String> getFlowdockApiToken() {
    return flowdockApiToken;
  }

  public void setFlowdockApiToken(JsonNullable<String> flowdockApiToken) {
    this.flowdockApiToken = flowdockApiToken;
  }

  public Project followed(Boolean followed) {
    this.followed = followed;
    return this;
  }

  /**
   * Get followed
   * @return followed
  */
  
  @Schema(name = "followed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("followed")
  public Boolean getFollowed() {
    return followed;
  }

  public void setFollowed(Boolean followed) {
    this.followed = followed;
  }

  public Project hasUsableKey(Boolean hasUsableKey) {
    this.hasUsableKey = hasUsableKey;
    return this;
  }

  /**
   * Get hasUsableKey
   * @return hasUsableKey
  */
  
  @Schema(name = "has_usable_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_usable_key")
  public Boolean getHasUsableKey() {
    return hasUsableKey;
  }

  public void setHasUsableKey(Boolean hasUsableKey) {
    this.hasUsableKey = hasUsableKey;
  }

  public Project herokuDeployUser(String herokuDeployUser) {
    this.herokuDeployUser = JsonNullable.of(herokuDeployUser);
    return this;
  }

  /**
   * Get herokuDeployUser
   * @return herokuDeployUser
  */
  
  @Schema(name = "heroku_deploy_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("heroku_deploy_user")
  public JsonNullable<String> getHerokuDeployUser() {
    return herokuDeployUser;
  }

  public void setHerokuDeployUser(JsonNullable<String> herokuDeployUser) {
    this.herokuDeployUser = herokuDeployUser;
  }

  public Project hipchatApiToken(String hipchatApiToken) {
    this.hipchatApiToken = JsonNullable.of(hipchatApiToken);
    return this;
  }

  /**
   * Get hipchatApiToken
   * @return hipchatApiToken
  */
  
  @Schema(name = "hipchat_api_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hipchat_api_token")
  public JsonNullable<String> getHipchatApiToken() {
    return hipchatApiToken;
  }

  public void setHipchatApiToken(JsonNullable<String> hipchatApiToken) {
    this.hipchatApiToken = hipchatApiToken;
  }

  public Project hipchatNotify(String hipchatNotify) {
    this.hipchatNotify = JsonNullable.of(hipchatNotify);
    return this;
  }

  /**
   * Get hipchatNotify
   * @return hipchatNotify
  */
  
  @Schema(name = "hipchat_notify", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hipchat_notify")
  public JsonNullable<String> getHipchatNotify() {
    return hipchatNotify;
  }

  public void setHipchatNotify(JsonNullable<String> hipchatNotify) {
    this.hipchatNotify = hipchatNotify;
  }

  public Project hipchatNotifyPrefs(String hipchatNotifyPrefs) {
    this.hipchatNotifyPrefs = JsonNullable.of(hipchatNotifyPrefs);
    return this;
  }

  /**
   * Get hipchatNotifyPrefs
   * @return hipchatNotifyPrefs
  */
  
  @Schema(name = "hipchat_notify_prefs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hipchat_notify_prefs")
  public JsonNullable<String> getHipchatNotifyPrefs() {
    return hipchatNotifyPrefs;
  }

  public void setHipchatNotifyPrefs(JsonNullable<String> hipchatNotifyPrefs) {
    this.hipchatNotifyPrefs = hipchatNotifyPrefs;
  }

  public Project hipchatRoom(String hipchatRoom) {
    this.hipchatRoom = JsonNullable.of(hipchatRoom);
    return this;
  }

  /**
   * Get hipchatRoom
   * @return hipchatRoom
  */
  
  @Schema(name = "hipchat_room", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hipchat_room")
  public JsonNullable<String> getHipchatRoom() {
    return hipchatRoom;
  }

  public void setHipchatRoom(JsonNullable<String> hipchatRoom) {
    this.hipchatRoom = hipchatRoom;
  }

  public Project ircChannel(String ircChannel) {
    this.ircChannel = JsonNullable.of(ircChannel);
    return this;
  }

  /**
   * Get ircChannel
   * @return ircChannel
  */
  
  @Schema(name = "irc_channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("irc_channel")
  public JsonNullable<String> getIrcChannel() {
    return ircChannel;
  }

  public void setIrcChannel(JsonNullable<String> ircChannel) {
    this.ircChannel = ircChannel;
  }

  public Project ircKeyword(String ircKeyword) {
    this.ircKeyword = JsonNullable.of(ircKeyword);
    return this;
  }

  /**
   * Get ircKeyword
   * @return ircKeyword
  */
  
  @Schema(name = "irc_keyword", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("irc_keyword")
  public JsonNullable<String> getIrcKeyword() {
    return ircKeyword;
  }

  public void setIrcKeyword(JsonNullable<String> ircKeyword) {
    this.ircKeyword = ircKeyword;
  }

  public Project ircNotifyPrefs(String ircNotifyPrefs) {
    this.ircNotifyPrefs = JsonNullable.of(ircNotifyPrefs);
    return this;
  }

  /**
   * Get ircNotifyPrefs
   * @return ircNotifyPrefs
  */
  
  @Schema(name = "irc_notify_prefs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("irc_notify_prefs")
  public JsonNullable<String> getIrcNotifyPrefs() {
    return ircNotifyPrefs;
  }

  public void setIrcNotifyPrefs(JsonNullable<String> ircNotifyPrefs) {
    this.ircNotifyPrefs = ircNotifyPrefs;
  }

  public Project ircPassword(String ircPassword) {
    this.ircPassword = JsonNullable.of(ircPassword);
    return this;
  }

  /**
   * Get ircPassword
   * @return ircPassword
  */
  
  @Schema(name = "irc_password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("irc_password")
  public JsonNullable<String> getIrcPassword() {
    return ircPassword;
  }

  public void setIrcPassword(JsonNullable<String> ircPassword) {
    this.ircPassword = ircPassword;
  }

  public Project ircServer(String ircServer) {
    this.ircServer = JsonNullable.of(ircServer);
    return this;
  }

  /**
   * Get ircServer
   * @return ircServer
  */
  
  @Schema(name = "irc_server", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("irc_server")
  public JsonNullable<String> getIrcServer() {
    return ircServer;
  }

  public void setIrcServer(JsonNullable<String> ircServer) {
    this.ircServer = ircServer;
  }

  public Project ircUsername(String ircUsername) {
    this.ircUsername = JsonNullable.of(ircUsername);
    return this;
  }

  /**
   * Get ircUsername
   * @return ircUsername
  */
  
  @Schema(name = "irc_username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("irc_username")
  public JsonNullable<String> getIrcUsername() {
    return ircUsername;
  }

  public void setIrcUsername(JsonNullable<String> ircUsername) {
    this.ircUsername = ircUsername;
  }

  public Project language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  */
  
  @Schema(name = "language", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Project oss(Boolean oss) {
    this.oss = oss;
    return this;
  }

  /**
   * Get oss
   * @return oss
  */
  
  @Schema(name = "oss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("oss")
  public Boolean getOss() {
    return oss;
  }

  public void setOss(Boolean oss) {
    this.oss = oss;
  }

  public Project parallel(Integer parallel) {
    this.parallel = parallel;
    return this;
  }

  /**
   * Get parallel
   * @return parallel
  */
  
  @Schema(name = "parallel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parallel")
  public Integer getParallel() {
    return parallel;
  }

  public void setParallel(Integer parallel) {
    this.parallel = parallel;
  }

  public Project reponame(String reponame) {
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

  public Project scopes(List<@Valid Scope> scopes) {
    this.scopes = scopes;
    return this;
  }

  public Project addScopesItem(Scope scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * Get scopes
   * @return scopes
  */
  @Valid 
  @Schema(name = "scopes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public List<@Valid Scope> getScopes() {
    return scopes;
  }

  public void setScopes(List<@Valid Scope> scopes) {
    this.scopes = scopes;
  }

  public Project setup(String setup) {
    this.setup = setup;
    return this;
  }

  /**
   * Get setup
   * @return setup
  */
  
  @Schema(name = "setup", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("setup")
  public String getSetup() {
    return setup;
  }

  public void setSetup(String setup) {
    this.setup = setup;
  }

  public Project slackApiToken(String slackApiToken) {
    this.slackApiToken = JsonNullable.of(slackApiToken);
    return this;
  }

  /**
   * Get slackApiToken
   * @return slackApiToken
  */
  
  @Schema(name = "slack_api_token", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slack_api_token")
  public JsonNullable<String> getSlackApiToken() {
    return slackApiToken;
  }

  public void setSlackApiToken(JsonNullable<String> slackApiToken) {
    this.slackApiToken = slackApiToken;
  }

  public Project slackChannel(String slackChannel) {
    this.slackChannel = JsonNullable.of(slackChannel);
    return this;
  }

  /**
   * Get slackChannel
   * @return slackChannel
  */
  
  @Schema(name = "slack_channel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slack_channel")
  public JsonNullable<String> getSlackChannel() {
    return slackChannel;
  }

  public void setSlackChannel(JsonNullable<String> slackChannel) {
    this.slackChannel = slackChannel;
  }

  public Project slackChannelOverride(String slackChannelOverride) {
    this.slackChannelOverride = JsonNullable.of(slackChannelOverride);
    return this;
  }

  /**
   * Get slackChannelOverride
   * @return slackChannelOverride
  */
  
  @Schema(name = "slack_channel_override", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slack_channel_override")
  public JsonNullable<String> getSlackChannelOverride() {
    return slackChannelOverride;
  }

  public void setSlackChannelOverride(JsonNullable<String> slackChannelOverride) {
    this.slackChannelOverride = slackChannelOverride;
  }

  public Project slackNotifyPrefs(String slackNotifyPrefs) {
    this.slackNotifyPrefs = JsonNullable.of(slackNotifyPrefs);
    return this;
  }

  /**
   * Get slackNotifyPrefs
   * @return slackNotifyPrefs
  */
  
  @Schema(name = "slack_notify_prefs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slack_notify_prefs")
  public JsonNullable<String> getSlackNotifyPrefs() {
    return slackNotifyPrefs;
  }

  public void setSlackNotifyPrefs(JsonNullable<String> slackNotifyPrefs) {
    this.slackNotifyPrefs = slackNotifyPrefs;
  }

  public Project slackSubdomain(String slackSubdomain) {
    this.slackSubdomain = JsonNullable.of(slackSubdomain);
    return this;
  }

  /**
   * Get slackSubdomain
   * @return slackSubdomain
  */
  
  @Schema(name = "slack_subdomain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slack_subdomain")
  public JsonNullable<String> getSlackSubdomain() {
    return slackSubdomain;
  }

  public void setSlackSubdomain(JsonNullable<String> slackSubdomain) {
    this.slackSubdomain = slackSubdomain;
  }

  public Project slackWebhookUrl(URI slackWebhookUrl) {
    this.slackWebhookUrl = slackWebhookUrl;
    return this;
  }

  /**
   * Get slackWebhookUrl
   * @return slackWebhookUrl
  */
  @Valid 
  @Schema(name = "slack_webhook_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slack_webhook_url")
  public URI getSlackWebhookUrl() {
    return slackWebhookUrl;
  }

  public void setSlackWebhookUrl(URI slackWebhookUrl) {
    this.slackWebhookUrl = slackWebhookUrl;
  }

  public Project sshKeys(List<String> sshKeys) {
    this.sshKeys = sshKeys;
    return this;
  }

  public Project addSshKeysItem(String sshKeysItem) {
    if (this.sshKeys == null) {
      this.sshKeys = new ArrayList<>();
    }
    this.sshKeys.add(sshKeysItem);
    return this;
  }

  /**
   * Get sshKeys
   * @return sshKeys
  */
  
  @Schema(name = "ssh_keys", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ssh_keys")
  public List<String> getSshKeys() {
    return sshKeys;
  }

  public void setSshKeys(List<String> sshKeys) {
    this.sshKeys = sshKeys;
  }

  public Project test(String test) {
    this.test = test;
    return this;
  }

  /**
   * Get test
   * @return test
  */
  
  @Schema(name = "test", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("test")
  public String getTest() {
    return test;
  }

  public void setTest(String test) {
    this.test = test;
  }

  public Project username(String username) {
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

  public Project vcsType(String vcsType) {
    this.vcsType = vcsType;
    return this;
  }

  /**
   * Get vcsType
   * @return vcsType
  */
  
  @Schema(name = "vcs_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vcs_type")
  public String getVcsType() {
    return vcsType;
  }

  public void setVcsType(String vcsType) {
    this.vcsType = vcsType;
  }

  public Project vcsUrl(URI vcsUrl) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.aws, project.aws) &&
        Objects.equals(this.branches, project.branches) &&
        equalsNullable(this.campfireNotifyPrefs, project.campfireNotifyPrefs) &&
        equalsNullable(this.campfireRoom, project.campfireRoom) &&
        equalsNullable(this.campfireSubdomain, project.campfireSubdomain) &&
        equalsNullable(this.campfireToken, project.campfireToken) &&
        Objects.equals(this.compile, project.compile) &&
        Objects.equals(this.defaultBranch, project.defaultBranch) &&
        Objects.equals(this.dependencies, project.dependencies) &&
        Objects.equals(this.extra, project.extra) &&
        Objects.equals(this.featureFlags, project.featureFlags) &&
        equalsNullable(this.flowdockApiToken, project.flowdockApiToken) &&
        Objects.equals(this.followed, project.followed) &&
        Objects.equals(this.hasUsableKey, project.hasUsableKey) &&
        equalsNullable(this.herokuDeployUser, project.herokuDeployUser) &&
        equalsNullable(this.hipchatApiToken, project.hipchatApiToken) &&
        equalsNullable(this.hipchatNotify, project.hipchatNotify) &&
        equalsNullable(this.hipchatNotifyPrefs, project.hipchatNotifyPrefs) &&
        equalsNullable(this.hipchatRoom, project.hipchatRoom) &&
        equalsNullable(this.ircChannel, project.ircChannel) &&
        equalsNullable(this.ircKeyword, project.ircKeyword) &&
        equalsNullable(this.ircNotifyPrefs, project.ircNotifyPrefs) &&
        equalsNullable(this.ircPassword, project.ircPassword) &&
        equalsNullable(this.ircServer, project.ircServer) &&
        equalsNullable(this.ircUsername, project.ircUsername) &&
        Objects.equals(this.language, project.language) &&
        Objects.equals(this.oss, project.oss) &&
        Objects.equals(this.parallel, project.parallel) &&
        Objects.equals(this.reponame, project.reponame) &&
        Objects.equals(this.scopes, project.scopes) &&
        Objects.equals(this.setup, project.setup) &&
        equalsNullable(this.slackApiToken, project.slackApiToken) &&
        equalsNullable(this.slackChannel, project.slackChannel) &&
        equalsNullable(this.slackChannelOverride, project.slackChannelOverride) &&
        equalsNullable(this.slackNotifyPrefs, project.slackNotifyPrefs) &&
        equalsNullable(this.slackSubdomain, project.slackSubdomain) &&
        Objects.equals(this.slackWebhookUrl, project.slackWebhookUrl) &&
        Objects.equals(this.sshKeys, project.sshKeys) &&
        Objects.equals(this.test, project.test) &&
        Objects.equals(this.username, project.username) &&
        Objects.equals(this.vcsType, project.vcsType) &&
        Objects.equals(this.vcsUrl, project.vcsUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(aws, branches, hashCodeNullable(campfireNotifyPrefs), hashCodeNullable(campfireRoom), hashCodeNullable(campfireSubdomain), hashCodeNullable(campfireToken), compile, defaultBranch, dependencies, extra, featureFlags, hashCodeNullable(flowdockApiToken), followed, hasUsableKey, hashCodeNullable(herokuDeployUser), hashCodeNullable(hipchatApiToken), hashCodeNullable(hipchatNotify), hashCodeNullable(hipchatNotifyPrefs), hashCodeNullable(hipchatRoom), hashCodeNullable(ircChannel), hashCodeNullable(ircKeyword), hashCodeNullable(ircNotifyPrefs), hashCodeNullable(ircPassword), hashCodeNullable(ircServer), hashCodeNullable(ircUsername), language, oss, parallel, reponame, scopes, setup, hashCodeNullable(slackApiToken), hashCodeNullable(slackChannel), hashCodeNullable(slackChannelOverride), hashCodeNullable(slackNotifyPrefs), hashCodeNullable(slackSubdomain), slackWebhookUrl, sshKeys, test, username, vcsType, vcsUrl);
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
    sb.append("class Project {\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
    sb.append("    branches: ").append(toIndentedString(branches)).append("\n");
    sb.append("    campfireNotifyPrefs: ").append(toIndentedString(campfireNotifyPrefs)).append("\n");
    sb.append("    campfireRoom: ").append(toIndentedString(campfireRoom)).append("\n");
    sb.append("    campfireSubdomain: ").append(toIndentedString(campfireSubdomain)).append("\n");
    sb.append("    campfireToken: ").append(toIndentedString(campfireToken)).append("\n");
    sb.append("    compile: ").append(toIndentedString(compile)).append("\n");
    sb.append("    defaultBranch: ").append(toIndentedString(defaultBranch)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    featureFlags: ").append(toIndentedString(featureFlags)).append("\n");
    sb.append("    flowdockApiToken: ").append(toIndentedString(flowdockApiToken)).append("\n");
    sb.append("    followed: ").append(toIndentedString(followed)).append("\n");
    sb.append("    hasUsableKey: ").append(toIndentedString(hasUsableKey)).append("\n");
    sb.append("    herokuDeployUser: ").append(toIndentedString(herokuDeployUser)).append("\n");
    sb.append("    hipchatApiToken: ").append(toIndentedString(hipchatApiToken)).append("\n");
    sb.append("    hipchatNotify: ").append(toIndentedString(hipchatNotify)).append("\n");
    sb.append("    hipchatNotifyPrefs: ").append(toIndentedString(hipchatNotifyPrefs)).append("\n");
    sb.append("    hipchatRoom: ").append(toIndentedString(hipchatRoom)).append("\n");
    sb.append("    ircChannel: ").append(toIndentedString(ircChannel)).append("\n");
    sb.append("    ircKeyword: ").append(toIndentedString(ircKeyword)).append("\n");
    sb.append("    ircNotifyPrefs: ").append(toIndentedString(ircNotifyPrefs)).append("\n");
    sb.append("    ircPassword: ").append(toIndentedString(ircPassword)).append("\n");
    sb.append("    ircServer: ").append(toIndentedString(ircServer)).append("\n");
    sb.append("    ircUsername: ").append(toIndentedString(ircUsername)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    oss: ").append(toIndentedString(oss)).append("\n");
    sb.append("    parallel: ").append(toIndentedString(parallel)).append("\n");
    sb.append("    reponame: ").append(toIndentedString(reponame)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    setup: ").append(toIndentedString(setup)).append("\n");
    sb.append("    slackApiToken: ").append(toIndentedString(slackApiToken)).append("\n");
    sb.append("    slackChannel: ").append(toIndentedString(slackChannel)).append("\n");
    sb.append("    slackChannelOverride: ").append(toIndentedString(slackChannelOverride)).append("\n");
    sb.append("    slackNotifyPrefs: ").append(toIndentedString(slackNotifyPrefs)).append("\n");
    sb.append("    slackSubdomain: ").append(toIndentedString(slackSubdomain)).append("\n");
    sb.append("    slackWebhookUrl: ").append(toIndentedString(slackWebhookUrl)).append("\n");
    sb.append("    sshKeys: ").append(toIndentedString(sshKeys)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vcsType: ").append(toIndentedString(vcsType)).append("\n");
    sb.append("    vcsUrl: ").append(toIndentedString(vcsUrl)).append("\n");
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

