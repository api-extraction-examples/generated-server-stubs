package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.HealthCheckResult;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the Jira instance.
 */

@Schema(name = "ServerInformation", description = "Details about the Jira instance.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ServerInformation {

  private String baseUrl;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime buildDate;

  private Integer buildNumber;

  private String deploymentType;

  @Valid
  private List<@Valid HealthCheckResult> healthChecks;

  private String scmInfo;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime serverTime;

  private String serverTitle;

  private String version;

  @Valid
  private List<Integer> versionNumbers;

  public ServerInformation baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }

  /**
   * The base URL of the Jira instance.
   * @return baseUrl
  */
  
  @Schema(name = "baseUrl", description = "The base URL of the Jira instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("baseUrl")
  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  public ServerInformation buildDate(OffsetDateTime buildDate) {
    this.buildDate = buildDate;
    return this;
  }

  /**
   * The timestamp when the Jira version was built.
   * @return buildDate
  */
  @Valid 
  @Schema(name = "buildDate", description = "The timestamp when the Jira version was built.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buildDate")
  public OffsetDateTime getBuildDate() {
    return buildDate;
  }

  public void setBuildDate(OffsetDateTime buildDate) {
    this.buildDate = buildDate;
  }

  public ServerInformation buildNumber(Integer buildNumber) {
    this.buildNumber = buildNumber;
    return this;
  }

  /**
   * The build number of the Jira version.
   * @return buildNumber
  */
  
  @Schema(name = "buildNumber", description = "The build number of the Jira version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("buildNumber")
  public Integer getBuildNumber() {
    return buildNumber;
  }

  public void setBuildNumber(Integer buildNumber) {
    this.buildNumber = buildNumber;
  }

  public ServerInformation deploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
    return this;
  }

  /**
   * The type of server deployment. This is always returned as *Cloud*.
   * @return deploymentType
  */
  
  @Schema(name = "deploymentType", description = "The type of server deployment. This is always returned as *Cloud*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deploymentType")
  public String getDeploymentType() {
    return deploymentType;
  }

  public void setDeploymentType(String deploymentType) {
    this.deploymentType = deploymentType;
  }

  public ServerInformation healthChecks(List<@Valid HealthCheckResult> healthChecks) {
    this.healthChecks = healthChecks;
    return this;
  }

  public ServerInformation addHealthChecksItem(HealthCheckResult healthChecksItem) {
    if (this.healthChecks == null) {
      this.healthChecks = new ArrayList<>();
    }
    this.healthChecks.add(healthChecksItem);
    return this;
  }

  /**
   * Jira instance health check results. Deprecated and no longer returned.
   * @return healthChecks
  */
  @Valid 
  @Schema(name = "healthChecks", description = "Jira instance health check results. Deprecated and no longer returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("healthChecks")
  public List<@Valid HealthCheckResult> getHealthChecks() {
    return healthChecks;
  }

  public void setHealthChecks(List<@Valid HealthCheckResult> healthChecks) {
    this.healthChecks = healthChecks;
  }

  public ServerInformation scmInfo(String scmInfo) {
    this.scmInfo = scmInfo;
    return this;
  }

  /**
   * The unique identifier of the Jira version.
   * @return scmInfo
  */
  
  @Schema(name = "scmInfo", description = "The unique identifier of the Jira version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scmInfo")
  public String getScmInfo() {
    return scmInfo;
  }

  public void setScmInfo(String scmInfo) {
    this.scmInfo = scmInfo;
  }

  public ServerInformation serverTime(OffsetDateTime serverTime) {
    this.serverTime = serverTime;
    return this;
  }

  /**
   * The time in Jira when this request was responded to.
   * @return serverTime
  */
  @Valid 
  @Schema(name = "serverTime", description = "The time in Jira when this request was responded to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverTime")
  public OffsetDateTime getServerTime() {
    return serverTime;
  }

  public void setServerTime(OffsetDateTime serverTime) {
    this.serverTime = serverTime;
  }

  public ServerInformation serverTitle(String serverTitle) {
    this.serverTitle = serverTitle;
    return this;
  }

  /**
   * The name of the Jira instance.
   * @return serverTitle
  */
  
  @Schema(name = "serverTitle", description = "The name of the Jira instance.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serverTitle")
  public String getServerTitle() {
    return serverTitle;
  }

  public void setServerTitle(String serverTitle) {
    this.serverTitle = serverTitle;
  }

  public ServerInformation version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of Jira.
   * @return version
  */
  
  @Schema(name = "version", description = "The version of Jira.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ServerInformation versionNumbers(List<Integer> versionNumbers) {
    this.versionNumbers = versionNumbers;
    return this;
  }

  public ServerInformation addVersionNumbersItem(Integer versionNumbersItem) {
    if (this.versionNumbers == null) {
      this.versionNumbers = new ArrayList<>();
    }
    this.versionNumbers.add(versionNumbersItem);
    return this;
  }

  /**
   * The major, minor, and revision version numbers of the Jira version.
   * @return versionNumbers
  */
  
  @Schema(name = "versionNumbers", description = "The major, minor, and revision version numbers of the Jira version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("versionNumbers")
  public List<Integer> getVersionNumbers() {
    return versionNumbers;
  }

  public void setVersionNumbers(List<Integer> versionNumbers) {
    this.versionNumbers = versionNumbers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerInformation serverInformation = (ServerInformation) o;
    return Objects.equals(this.baseUrl, serverInformation.baseUrl) &&
        Objects.equals(this.buildDate, serverInformation.buildDate) &&
        Objects.equals(this.buildNumber, serverInformation.buildNumber) &&
        Objects.equals(this.deploymentType, serverInformation.deploymentType) &&
        Objects.equals(this.healthChecks, serverInformation.healthChecks) &&
        Objects.equals(this.scmInfo, serverInformation.scmInfo) &&
        Objects.equals(this.serverTime, serverInformation.serverTime) &&
        Objects.equals(this.serverTitle, serverInformation.serverTitle) &&
        Objects.equals(this.version, serverInformation.version) &&
        Objects.equals(this.versionNumbers, serverInformation.versionNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl, buildDate, buildNumber, deploymentType, healthChecks, scmInfo, serverTime, serverTitle, version, versionNumbers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerInformation {\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    buildDate: ").append(toIndentedString(buildDate)).append("\n");
    sb.append("    buildNumber: ").append(toIndentedString(buildNumber)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    healthChecks: ").append(toIndentedString(healthChecks)).append("\n");
    sb.append("    scmInfo: ").append(toIndentedString(scmInfo)).append("\n");
    sb.append("    serverTime: ").append(toIndentedString(serverTime)).append("\n");
    sb.append("    serverTitle: ").append(toIndentedString(serverTitle)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionNumbers: ").append(toIndentedString(versionNumbers)).append("\n");
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

