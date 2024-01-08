package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Architecture;
import org.openapitools.model.FFmpegLocation;
import org.openapitools.model.InstallationInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class SystemInfo.
 */

@Schema(name = "SystemInfo", description = "Class SystemInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SystemInfo {

  private JsonNullable<String> cachePath = JsonNullable.<String>undefined();

  private Boolean canLaunchWebBrowser;

  private Boolean canSelfRestart;

  @Valid
  private JsonNullable<List<@Valid InstallationInfo>> completedInstallations = JsonNullable.<List<@Valid InstallationInfo>>undefined();

  private FFmpegLocation encoderLocation;

  private Boolean hasPendingRestart;

  private Boolean hasUpdateAvailable;

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private JsonNullable<String> internalMetadataPath = JsonNullable.<String>undefined();

  private Boolean isShuttingDown;

  private JsonNullable<String> itemsByNamePath = JsonNullable.<String>undefined();

  private JsonNullable<String> localAddress = JsonNullable.<String>undefined();

  private JsonNullable<String> logPath = JsonNullable.<String>undefined();

  private JsonNullable<String> operatingSystem = JsonNullable.<String>undefined();

  private JsonNullable<String> operatingSystemDisplayName = JsonNullable.<String>undefined();

  private JsonNullable<String> packageName = JsonNullable.<String>undefined();

  private JsonNullable<String> productName = JsonNullable.<String>undefined();

  private JsonNullable<String> programDataPath = JsonNullable.<String>undefined();

  private JsonNullable<String> serverName = JsonNullable.<String>undefined();

  private JsonNullable<Boolean> startupWizardCompleted = JsonNullable.<Boolean>undefined();

  private Boolean supportsLibraryMonitor;

  private Architecture systemArchitecture;

  private JsonNullable<String> transcodingTempPath = JsonNullable.<String>undefined();

  private JsonNullable<String> version = JsonNullable.<String>undefined();

  private JsonNullable<String> webPath = JsonNullable.<String>undefined();

  private Integer webSocketPortNumber;

  public SystemInfo cachePath(String cachePath) {
    this.cachePath = JsonNullable.of(cachePath);
    return this;
  }

  /**
   * Gets or sets the cache path.
   * @return cachePath
  */
  
  @Schema(name = "CachePath", description = "Gets or sets the cache path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CachePath")
  public JsonNullable<String> getCachePath() {
    return cachePath;
  }

  public void setCachePath(JsonNullable<String> cachePath) {
    this.cachePath = cachePath;
  }

  public SystemInfo canLaunchWebBrowser(Boolean canLaunchWebBrowser) {
    this.canLaunchWebBrowser = canLaunchWebBrowser;
    return this;
  }

  /**
   * Get canLaunchWebBrowser
   * @return canLaunchWebBrowser
  */
  
  @Schema(name = "CanLaunchWebBrowser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanLaunchWebBrowser")
  public Boolean getCanLaunchWebBrowser() {
    return canLaunchWebBrowser;
  }

  public void setCanLaunchWebBrowser(Boolean canLaunchWebBrowser) {
    this.canLaunchWebBrowser = canLaunchWebBrowser;
  }

  public SystemInfo canSelfRestart(Boolean canSelfRestart) {
    this.canSelfRestart = canSelfRestart;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance can self restart.
   * @return canSelfRestart
  */
  
  @Schema(name = "CanSelfRestart", description = "Gets or sets a value indicating whether this instance can self restart.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CanSelfRestart")
  public Boolean getCanSelfRestart() {
    return canSelfRestart;
  }

  public void setCanSelfRestart(Boolean canSelfRestart) {
    this.canSelfRestart = canSelfRestart;
  }

  public SystemInfo completedInstallations(List<@Valid InstallationInfo> completedInstallations) {
    this.completedInstallations = JsonNullable.of(completedInstallations);
    return this;
  }

  public SystemInfo addCompletedInstallationsItem(InstallationInfo completedInstallationsItem) {
    if (this.completedInstallations == null || !this.completedInstallations.isPresent()) {
      this.completedInstallations = JsonNullable.of(new ArrayList<>());
    }
    this.completedInstallations.get().add(completedInstallationsItem);
    return this;
  }

  /**
   * Gets or sets the completed installations.
   * @return completedInstallations
  */
  @Valid 
  @Schema(name = "CompletedInstallations", description = "Gets or sets the completed installations.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CompletedInstallations")
  public JsonNullable<List<@Valid InstallationInfo>> getCompletedInstallations() {
    return completedInstallations;
  }

  public void setCompletedInstallations(JsonNullable<List<@Valid InstallationInfo>> completedInstallations) {
    this.completedInstallations = completedInstallations;
  }

  public SystemInfo encoderLocation(FFmpegLocation encoderLocation) {
    this.encoderLocation = encoderLocation;
    return this;
  }

  /**
   * Get encoderLocation
   * @return encoderLocation
  */
  @Valid 
  @Schema(name = "EncoderLocation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EncoderLocation")
  public FFmpegLocation getEncoderLocation() {
    return encoderLocation;
  }

  public void setEncoderLocation(FFmpegLocation encoderLocation) {
    this.encoderLocation = encoderLocation;
  }

  public SystemInfo hasPendingRestart(Boolean hasPendingRestart) {
    this.hasPendingRestart = hasPendingRestart;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance has pending restart.
   * @return hasPendingRestart
  */
  
  @Schema(name = "HasPendingRestart", description = "Gets or sets a value indicating whether this instance has pending restart.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasPendingRestart")
  public Boolean getHasPendingRestart() {
    return hasPendingRestart;
  }

  public void setHasPendingRestart(Boolean hasPendingRestart) {
    this.hasPendingRestart = hasPendingRestart;
  }

  public SystemInfo hasUpdateAvailable(Boolean hasUpdateAvailable) {
    this.hasUpdateAvailable = hasUpdateAvailable;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance has update available.
   * @return hasUpdateAvailable
  */
  
  @Schema(name = "HasUpdateAvailable", description = "Gets or sets a value indicating whether this instance has update available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasUpdateAvailable")
  public Boolean getHasUpdateAvailable() {
    return hasUpdateAvailable;
  }

  public void setHasUpdateAvailable(Boolean hasUpdateAvailable) {
    this.hasUpdateAvailable = hasUpdateAvailable;
  }

  public SystemInfo id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the id.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public SystemInfo internalMetadataPath(String internalMetadataPath) {
    this.internalMetadataPath = JsonNullable.of(internalMetadataPath);
    return this;
  }

  /**
   * Gets or sets the internal metadata path.
   * @return internalMetadataPath
  */
  
  @Schema(name = "InternalMetadataPath", description = "Gets or sets the internal metadata path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("InternalMetadataPath")
  public JsonNullable<String> getInternalMetadataPath() {
    return internalMetadataPath;
  }

  public void setInternalMetadataPath(JsonNullable<String> internalMetadataPath) {
    this.internalMetadataPath = internalMetadataPath;
  }

  public SystemInfo isShuttingDown(Boolean isShuttingDown) {
    this.isShuttingDown = isShuttingDown;
    return this;
  }

  /**
   * Get isShuttingDown
   * @return isShuttingDown
  */
  
  @Schema(name = "IsShuttingDown", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsShuttingDown")
  public Boolean getIsShuttingDown() {
    return isShuttingDown;
  }

  public void setIsShuttingDown(Boolean isShuttingDown) {
    this.isShuttingDown = isShuttingDown;
  }

  public SystemInfo itemsByNamePath(String itemsByNamePath) {
    this.itemsByNamePath = JsonNullable.of(itemsByNamePath);
    return this;
  }

  /**
   * Gets or sets the items by name path.
   * @return itemsByNamePath
  */
  
  @Schema(name = "ItemsByNamePath", description = "Gets or sets the items by name path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemsByNamePath")
  public JsonNullable<String> getItemsByNamePath() {
    return itemsByNamePath;
  }

  public void setItemsByNamePath(JsonNullable<String> itemsByNamePath) {
    this.itemsByNamePath = itemsByNamePath;
  }

  public SystemInfo localAddress(String localAddress) {
    this.localAddress = JsonNullable.of(localAddress);
    return this;
  }

  /**
   * Gets or sets the local address.
   * @return localAddress
  */
  
  @Schema(name = "LocalAddress", description = "Gets or sets the local address.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalAddress")
  public JsonNullable<String> getLocalAddress() {
    return localAddress;
  }

  public void setLocalAddress(JsonNullable<String> localAddress) {
    this.localAddress = localAddress;
  }

  public SystemInfo logPath(String logPath) {
    this.logPath = JsonNullable.of(logPath);
    return this;
  }

  /**
   * Gets or sets the log path.
   * @return logPath
  */
  
  @Schema(name = "LogPath", description = "Gets or sets the log path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LogPath")
  public JsonNullable<String> getLogPath() {
    return logPath;
  }

  public void setLogPath(JsonNullable<String> logPath) {
    this.logPath = logPath;
  }

  public SystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = JsonNullable.of(operatingSystem);
    return this;
  }

  /**
   * Gets or sets the operating system.
   * @return operatingSystem
  */
  
  @Schema(name = "OperatingSystem", description = "Gets or sets the operating system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OperatingSystem")
  public JsonNullable<String> getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(JsonNullable<String> operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public SystemInfo operatingSystemDisplayName(String operatingSystemDisplayName) {
    this.operatingSystemDisplayName = JsonNullable.of(operatingSystemDisplayName);
    return this;
  }

  /**
   * Gets or sets the display name of the operating system.
   * @return operatingSystemDisplayName
  */
  
  @Schema(name = "OperatingSystemDisplayName", description = "Gets or sets the display name of the operating system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OperatingSystemDisplayName")
  public JsonNullable<String> getOperatingSystemDisplayName() {
    return operatingSystemDisplayName;
  }

  public void setOperatingSystemDisplayName(JsonNullable<String> operatingSystemDisplayName) {
    this.operatingSystemDisplayName = operatingSystemDisplayName;
  }

  public SystemInfo packageName(String packageName) {
    this.packageName = JsonNullable.of(packageName);
    return this;
  }

  /**
   * Get or sets the package name.
   * @return packageName
  */
  
  @Schema(name = "PackageName", description = "Get or sets the package name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PackageName")
  public JsonNullable<String> getPackageName() {
    return packageName;
  }

  public void setPackageName(JsonNullable<String> packageName) {
    this.packageName = packageName;
  }

  public SystemInfo productName(String productName) {
    this.productName = JsonNullable.of(productName);
    return this;
  }

  /**
   * Gets or sets the product name. This is the AssemblyProduct name.
   * @return productName
  */
  
  @Schema(name = "ProductName", description = "Gets or sets the product name. This is the AssemblyProduct name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProductName")
  public JsonNullable<String> getProductName() {
    return productName;
  }

  public void setProductName(JsonNullable<String> productName) {
    this.productName = productName;
  }

  public SystemInfo programDataPath(String programDataPath) {
    this.programDataPath = JsonNullable.of(programDataPath);
    return this;
  }

  /**
   * Gets or sets the program data path.
   * @return programDataPath
  */
  
  @Schema(name = "ProgramDataPath", description = "Gets or sets the program data path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProgramDataPath")
  public JsonNullable<String> getProgramDataPath() {
    return programDataPath;
  }

  public void setProgramDataPath(JsonNullable<String> programDataPath) {
    this.programDataPath = programDataPath;
  }

  public SystemInfo serverName(String serverName) {
    this.serverName = JsonNullable.of(serverName);
    return this;
  }

  /**
   * Gets or sets the name of the server.
   * @return serverName
  */
  
  @Schema(name = "ServerName", description = "Gets or sets the name of the server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerName")
  public JsonNullable<String> getServerName() {
    return serverName;
  }

  public void setServerName(JsonNullable<String> serverName) {
    this.serverName = serverName;
  }

  public SystemInfo startupWizardCompleted(Boolean startupWizardCompleted) {
    this.startupWizardCompleted = JsonNullable.of(startupWizardCompleted);
    return this;
  }

  /**
   * Gets or sets a value indicating whether the startup wizard is completed.
   * @return startupWizardCompleted
  */
  
  @Schema(name = "StartupWizardCompleted", description = "Gets or sets a value indicating whether the startup wizard is completed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartupWizardCompleted")
  public JsonNullable<Boolean> getStartupWizardCompleted() {
    return startupWizardCompleted;
  }

  public void setStartupWizardCompleted(JsonNullable<Boolean> startupWizardCompleted) {
    this.startupWizardCompleted = startupWizardCompleted;
  }

  public SystemInfo supportsLibraryMonitor(Boolean supportsLibraryMonitor) {
    this.supportsLibraryMonitor = supportsLibraryMonitor;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [supports library monitor].
   * @return supportsLibraryMonitor
  */
  
  @Schema(name = "SupportsLibraryMonitor", description = "Gets or sets a value indicating whether [supports library monitor].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsLibraryMonitor")
  public Boolean getSupportsLibraryMonitor() {
    return supportsLibraryMonitor;
  }

  public void setSupportsLibraryMonitor(Boolean supportsLibraryMonitor) {
    this.supportsLibraryMonitor = supportsLibraryMonitor;
  }

  public SystemInfo systemArchitecture(Architecture systemArchitecture) {
    this.systemArchitecture = systemArchitecture;
    return this;
  }

  /**
   * Get systemArchitecture
   * @return systemArchitecture
  */
  @Valid 
  @Schema(name = "SystemArchitecture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SystemArchitecture")
  public Architecture getSystemArchitecture() {
    return systemArchitecture;
  }

  public void setSystemArchitecture(Architecture systemArchitecture) {
    this.systemArchitecture = systemArchitecture;
  }

  public SystemInfo transcodingTempPath(String transcodingTempPath) {
    this.transcodingTempPath = JsonNullable.of(transcodingTempPath);
    return this;
  }

  /**
   * Gets or sets the transcode path.
   * @return transcodingTempPath
  */
  
  @Schema(name = "TranscodingTempPath", description = "Gets or sets the transcode path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TranscodingTempPath")
  public JsonNullable<String> getTranscodingTempPath() {
    return transcodingTempPath;
  }

  public void setTranscodingTempPath(JsonNullable<String> transcodingTempPath) {
    this.transcodingTempPath = transcodingTempPath;
  }

  public SystemInfo version(String version) {
    this.version = JsonNullable.of(version);
    return this;
  }

  /**
   * Gets or sets the server version.
   * @return version
  */
  
  @Schema(name = "Version", description = "Gets or sets the server version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Version")
  public JsonNullable<String> getVersion() {
    return version;
  }

  public void setVersion(JsonNullable<String> version) {
    this.version = version;
  }

  public SystemInfo webPath(String webPath) {
    this.webPath = JsonNullable.of(webPath);
    return this;
  }

  /**
   * Gets or sets the web UI resources path.
   * @return webPath
  */
  
  @Schema(name = "WebPath", description = "Gets or sets the web UI resources path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WebPath")
  public JsonNullable<String> getWebPath() {
    return webPath;
  }

  public void setWebPath(JsonNullable<String> webPath) {
    this.webPath = webPath;
  }

  public SystemInfo webSocketPortNumber(Integer webSocketPortNumber) {
    this.webSocketPortNumber = webSocketPortNumber;
    return this;
  }

  /**
   * Gets or sets the web socket port number.
   * @return webSocketPortNumber
  */
  
  @Schema(name = "WebSocketPortNumber", description = "Gets or sets the web socket port number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WebSocketPortNumber")
  public Integer getWebSocketPortNumber() {
    return webSocketPortNumber;
  }

  public void setWebSocketPortNumber(Integer webSocketPortNumber) {
    this.webSocketPortNumber = webSocketPortNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfo systemInfo = (SystemInfo) o;
    return equalsNullable(this.cachePath, systemInfo.cachePath) &&
        Objects.equals(this.canLaunchWebBrowser, systemInfo.canLaunchWebBrowser) &&
        Objects.equals(this.canSelfRestart, systemInfo.canSelfRestart) &&
        equalsNullable(this.completedInstallations, systemInfo.completedInstallations) &&
        Objects.equals(this.encoderLocation, systemInfo.encoderLocation) &&
        Objects.equals(this.hasPendingRestart, systemInfo.hasPendingRestart) &&
        Objects.equals(this.hasUpdateAvailable, systemInfo.hasUpdateAvailable) &&
        equalsNullable(this.id, systemInfo.id) &&
        equalsNullable(this.internalMetadataPath, systemInfo.internalMetadataPath) &&
        Objects.equals(this.isShuttingDown, systemInfo.isShuttingDown) &&
        equalsNullable(this.itemsByNamePath, systemInfo.itemsByNamePath) &&
        equalsNullable(this.localAddress, systemInfo.localAddress) &&
        equalsNullable(this.logPath, systemInfo.logPath) &&
        equalsNullable(this.operatingSystem, systemInfo.operatingSystem) &&
        equalsNullable(this.operatingSystemDisplayName, systemInfo.operatingSystemDisplayName) &&
        equalsNullable(this.packageName, systemInfo.packageName) &&
        equalsNullable(this.productName, systemInfo.productName) &&
        equalsNullable(this.programDataPath, systemInfo.programDataPath) &&
        equalsNullable(this.serverName, systemInfo.serverName) &&
        equalsNullable(this.startupWizardCompleted, systemInfo.startupWizardCompleted) &&
        Objects.equals(this.supportsLibraryMonitor, systemInfo.supportsLibraryMonitor) &&
        Objects.equals(this.systemArchitecture, systemInfo.systemArchitecture) &&
        equalsNullable(this.transcodingTempPath, systemInfo.transcodingTempPath) &&
        equalsNullable(this.version, systemInfo.version) &&
        equalsNullable(this.webPath, systemInfo.webPath) &&
        Objects.equals(this.webSocketPortNumber, systemInfo.webSocketPortNumber);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(cachePath), canLaunchWebBrowser, canSelfRestart, hashCodeNullable(completedInstallations), encoderLocation, hasPendingRestart, hasUpdateAvailable, hashCodeNullable(id), hashCodeNullable(internalMetadataPath), isShuttingDown, hashCodeNullable(itemsByNamePath), hashCodeNullable(localAddress), hashCodeNullable(logPath), hashCodeNullable(operatingSystem), hashCodeNullable(operatingSystemDisplayName), hashCodeNullable(packageName), hashCodeNullable(productName), hashCodeNullable(programDataPath), hashCodeNullable(serverName), hashCodeNullable(startupWizardCompleted), supportsLibraryMonitor, systemArchitecture, hashCodeNullable(transcodingTempPath), hashCodeNullable(version), hashCodeNullable(webPath), webSocketPortNumber);
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
    sb.append("class SystemInfo {\n");
    sb.append("    cachePath: ").append(toIndentedString(cachePath)).append("\n");
    sb.append("    canLaunchWebBrowser: ").append(toIndentedString(canLaunchWebBrowser)).append("\n");
    sb.append("    canSelfRestart: ").append(toIndentedString(canSelfRestart)).append("\n");
    sb.append("    completedInstallations: ").append(toIndentedString(completedInstallations)).append("\n");
    sb.append("    encoderLocation: ").append(toIndentedString(encoderLocation)).append("\n");
    sb.append("    hasPendingRestart: ").append(toIndentedString(hasPendingRestart)).append("\n");
    sb.append("    hasUpdateAvailable: ").append(toIndentedString(hasUpdateAvailable)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    internalMetadataPath: ").append(toIndentedString(internalMetadataPath)).append("\n");
    sb.append("    isShuttingDown: ").append(toIndentedString(isShuttingDown)).append("\n");
    sb.append("    itemsByNamePath: ").append(toIndentedString(itemsByNamePath)).append("\n");
    sb.append("    localAddress: ").append(toIndentedString(localAddress)).append("\n");
    sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    operatingSystemDisplayName: ").append(toIndentedString(operatingSystemDisplayName)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    programDataPath: ").append(toIndentedString(programDataPath)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    startupWizardCompleted: ").append(toIndentedString(startupWizardCompleted)).append("\n");
    sb.append("    supportsLibraryMonitor: ").append(toIndentedString(supportsLibraryMonitor)).append("\n");
    sb.append("    systemArchitecture: ").append(toIndentedString(systemArchitecture)).append("\n");
    sb.append("    transcodingTempPath: ").append(toIndentedString(transcodingTempPath)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    webPath: ").append(toIndentedString(webPath)).append("\n");
    sb.append("    webSocketPortNumber: ").append(toIndentedString(webSocketPortNumber)).append("\n");
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

