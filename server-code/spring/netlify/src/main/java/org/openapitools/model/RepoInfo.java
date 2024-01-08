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
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RepoInfo
 */

@JsonTypeName("repoInfo")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class RepoInfo {

  @Valid
  private List<String> allowedBranches;

  private String cmd;

  private String deployKeyId;

  private String dir;

  @Valid
  private Map<String, String> env = new HashMap<>();

  private String functionsDir;

  private Integer id;

  private Integer installationId;

  private Boolean privateLogs;

  private String provider;

  private Boolean publicRepo;

  private String repoBranch;

  private String repoPath;

  private String repoUrl;

  private Boolean stopBuilds;

  public RepoInfo allowedBranches(List<String> allowedBranches) {
    this.allowedBranches = allowedBranches;
    return this;
  }

  public RepoInfo addAllowedBranchesItem(String allowedBranchesItem) {
    if (this.allowedBranches == null) {
      this.allowedBranches = new ArrayList<>();
    }
    this.allowedBranches.add(allowedBranchesItem);
    return this;
  }

  /**
   * Get allowedBranches
   * @return allowedBranches
  */
  
  @Schema(name = "allowed_branches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowed_branches")
  public List<String> getAllowedBranches() {
    return allowedBranches;
  }

  public void setAllowedBranches(List<String> allowedBranches) {
    this.allowedBranches = allowedBranches;
  }

  public RepoInfo cmd(String cmd) {
    this.cmd = cmd;
    return this;
  }

  /**
   * Get cmd
   * @return cmd
  */
  
  @Schema(name = "cmd", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cmd")
  public String getCmd() {
    return cmd;
  }

  public void setCmd(String cmd) {
    this.cmd = cmd;
  }

  public RepoInfo deployKeyId(String deployKeyId) {
    this.deployKeyId = deployKeyId;
    return this;
  }

  /**
   * Get deployKeyId
   * @return deployKeyId
  */
  
  @Schema(name = "deploy_key_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploy_key_id")
  public String getDeployKeyId() {
    return deployKeyId;
  }

  public void setDeployKeyId(String deployKeyId) {
    this.deployKeyId = deployKeyId;
  }

  public RepoInfo dir(String dir) {
    this.dir = dir;
    return this;
  }

  /**
   * Get dir
   * @return dir
  */
  
  @Schema(name = "dir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dir")
  public String getDir() {
    return dir;
  }

  public void setDir(String dir) {
    this.dir = dir;
  }

  public RepoInfo env(Map<String, String> env) {
    this.env = env;
    return this;
  }

  public RepoInfo putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<>();
    }
    this.env.put(key, envItem);
    return this;
  }

  /**
   * Get env
   * @return env
  */
  
  @Schema(name = "env", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("env")
  public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public RepoInfo functionsDir(String functionsDir) {
    this.functionsDir = functionsDir;
    return this;
  }

  /**
   * Get functionsDir
   * @return functionsDir
  */
  
  @Schema(name = "functions_dir", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functions_dir")
  public String getFunctionsDir() {
    return functionsDir;
  }

  public void setFunctionsDir(String functionsDir) {
    this.functionsDir = functionsDir;
  }

  public RepoInfo id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public RepoInfo installationId(Integer installationId) {
    this.installationId = installationId;
    return this;
  }

  /**
   * Get installationId
   * @return installationId
  */
  
  @Schema(name = "installation_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("installation_id")
  public Integer getInstallationId() {
    return installationId;
  }

  public void setInstallationId(Integer installationId) {
    this.installationId = installationId;
  }

  public RepoInfo privateLogs(Boolean privateLogs) {
    this.privateLogs = privateLogs;
    return this;
  }

  /**
   * Get privateLogs
   * @return privateLogs
  */
  
  @Schema(name = "private_logs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("private_logs")
  public Boolean getPrivateLogs() {
    return privateLogs;
  }

  public void setPrivateLogs(Boolean privateLogs) {
    this.privateLogs = privateLogs;
  }

  public RepoInfo provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Get provider
   * @return provider
  */
  
  @Schema(name = "provider", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public RepoInfo publicRepo(Boolean publicRepo) {
    this.publicRepo = publicRepo;
    return this;
  }

  /**
   * Get publicRepo
   * @return publicRepo
  */
  
  @Schema(name = "public_repo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("public_repo")
  public Boolean getPublicRepo() {
    return publicRepo;
  }

  public void setPublicRepo(Boolean publicRepo) {
    this.publicRepo = publicRepo;
  }

  public RepoInfo repoBranch(String repoBranch) {
    this.repoBranch = repoBranch;
    return this;
  }

  /**
   * Get repoBranch
   * @return repoBranch
  */
  
  @Schema(name = "repo_branch", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repo_branch")
  public String getRepoBranch() {
    return repoBranch;
  }

  public void setRepoBranch(String repoBranch) {
    this.repoBranch = repoBranch;
  }

  public RepoInfo repoPath(String repoPath) {
    this.repoPath = repoPath;
    return this;
  }

  /**
   * Get repoPath
   * @return repoPath
  */
  
  @Schema(name = "repo_path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repo_path")
  public String getRepoPath() {
    return repoPath;
  }

  public void setRepoPath(String repoPath) {
    this.repoPath = repoPath;
  }

  public RepoInfo repoUrl(String repoUrl) {
    this.repoUrl = repoUrl;
    return this;
  }

  /**
   * Get repoUrl
   * @return repoUrl
  */
  
  @Schema(name = "repo_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("repo_url")
  public String getRepoUrl() {
    return repoUrl;
  }

  public void setRepoUrl(String repoUrl) {
    this.repoUrl = repoUrl;
  }

  public RepoInfo stopBuilds(Boolean stopBuilds) {
    this.stopBuilds = stopBuilds;
    return this;
  }

  /**
   * Get stopBuilds
   * @return stopBuilds
  */
  
  @Schema(name = "stop_builds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stop_builds")
  public Boolean getStopBuilds() {
    return stopBuilds;
  }

  public void setStopBuilds(Boolean stopBuilds) {
    this.stopBuilds = stopBuilds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoInfo repoInfo = (RepoInfo) o;
    return Objects.equals(this.allowedBranches, repoInfo.allowedBranches) &&
        Objects.equals(this.cmd, repoInfo.cmd) &&
        Objects.equals(this.deployKeyId, repoInfo.deployKeyId) &&
        Objects.equals(this.dir, repoInfo.dir) &&
        Objects.equals(this.env, repoInfo.env) &&
        Objects.equals(this.functionsDir, repoInfo.functionsDir) &&
        Objects.equals(this.id, repoInfo.id) &&
        Objects.equals(this.installationId, repoInfo.installationId) &&
        Objects.equals(this.privateLogs, repoInfo.privateLogs) &&
        Objects.equals(this.provider, repoInfo.provider) &&
        Objects.equals(this.publicRepo, repoInfo.publicRepo) &&
        Objects.equals(this.repoBranch, repoInfo.repoBranch) &&
        Objects.equals(this.repoPath, repoInfo.repoPath) &&
        Objects.equals(this.repoUrl, repoInfo.repoUrl) &&
        Objects.equals(this.stopBuilds, repoInfo.stopBuilds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedBranches, cmd, deployKeyId, dir, env, functionsDir, id, installationId, privateLogs, provider, publicRepo, repoBranch, repoPath, repoUrl, stopBuilds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoInfo {\n");
    sb.append("    allowedBranches: ").append(toIndentedString(allowedBranches)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    deployKeyId: ").append(toIndentedString(deployKeyId)).append("\n");
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    functionsDir: ").append(toIndentedString(functionsDir)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    installationId: ").append(toIndentedString(installationId)).append("\n");
    sb.append("    privateLogs: ").append(toIndentedString(privateLogs)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    publicRepo: ").append(toIndentedString(publicRepo)).append("\n");
    sb.append("    repoBranch: ").append(toIndentedString(repoBranch)).append("\n");
    sb.append("    repoPath: ").append(toIndentedString(repoPath)).append("\n");
    sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
    sb.append("    stopBuilds: ").append(toIndentedString(stopBuilds)).append("\n");
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

