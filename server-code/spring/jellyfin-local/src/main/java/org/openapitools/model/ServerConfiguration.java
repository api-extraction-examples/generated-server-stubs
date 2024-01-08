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
import org.openapitools.model.ImageSavingConvention;
import org.openapitools.model.MetadataOptions;
import org.openapitools.model.NameValuePair;
import org.openapitools.model.PathSubstitution;
import org.openapitools.model.RepositoryInfo;
import org.openapitools.model.Version;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents the server configuration.
 */

@Schema(name = "ServerConfiguration", description = "Represents the server configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ServerConfiguration {

  private JsonNullable<Integer> activityLogRetentionDays = JsonNullable.<Integer>undefined();

  private Boolean autoDiscovery;

  private Boolean autoDiscoveryTracing;

  private JsonNullable<String> baseUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> cachePath = JsonNullable.<String>undefined();

  private JsonNullable<String> certificatePassword = JsonNullable.<String>undefined();

  private JsonNullable<String> certificatePath = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> codecsUsed = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<@Valid NameValuePair>> contentTypes = JsonNullable.<List<@Valid NameValuePair>>undefined();

  @Valid
  private JsonNullable<List<String>> corsHosts = JsonNullable.<List<String>>undefined();

  private Boolean disableLiveTvChannelUserDataName;

  private Boolean disablePluginImages;

  private Boolean displaySpecialsWithinSeasons;

  private Boolean enableCaseSensitiveItemIds;

  private Boolean enableDashboardResponseCaching;

  private Boolean enableExternalContentInSuggestions;

  private Boolean enableFolderView;

  private Boolean enableGroupingIntoCollections;

  private Boolean enableHttps;

  private Boolean enableIPV4;

  private Boolean enableIPV6;

  private Boolean enableMetrics;

  private Boolean enableMultiSocketBinding;

  private Boolean enableNewOmdbSupport;

  private Boolean enableNormalizedItemByNameIds;

  private Boolean enableRemoteAccess;

  private Boolean enableSSDPTracing;

  private Boolean enableSimpleArtistDetection;

  private Boolean enableSlowResponseWarning;

  private Boolean enableUPnP;

  private Integer gatewayMonitorPeriod;

  private JsonNullable<String> hdHomerunPortRange = JsonNullable.<String>undefined();

  private Integer httpServerPortNumber;

  private Integer httpsPortNumber;

  private Boolean ignoreVirtualInterfaces;

  private Integer imageExtractionTimeoutMs;

  private ImageSavingConvention imageSavingConvention;

  private Boolean isPortAuthorized;

  private Boolean isRemoteIPFilterBlacklist;

  private Boolean isStartupWizardCompleted;

  @Valid
  private JsonNullable<List<String>> knownProxies = JsonNullable.<List<String>>undefined();

  private Integer libraryMetadataRefreshConcurrency;

  private Integer libraryMonitorDelay;

  private Integer libraryScanFanoutConcurrency;

  @Valid
  private JsonNullable<List<String>> localNetworkAddresses = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> localNetworkSubnets = JsonNullable.<List<String>>undefined();

  private Integer logFileRetentionDays;

  private Integer maxAudiobookResume;

  private Integer maxResumePct;

  private JsonNullable<String> metadataCountryCode = JsonNullable.<String>undefined();

  private JsonNullable<String> metadataNetworkPath = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid MetadataOptions>> metadataOptions = JsonNullable.<List<@Valid MetadataOptions>>undefined();

  private JsonNullable<String> metadataPath = JsonNullable.<String>undefined();

  private Integer minAudiobookResume;

  private Integer minResumeDurationSeconds;

  private Integer minResumePct;

  @Valid
  private JsonNullable<List<@Valid PathSubstitution>> pathSubstitutions = JsonNullable.<List<@Valid PathSubstitution>>undefined();

  @Valid
  private JsonNullable<List<@Valid RepositoryInfo>> pluginRepositories = JsonNullable.<List<@Valid RepositoryInfo>>undefined();

  private JsonNullable<String> preferredMetadataLanguage = JsonNullable.<String>undefined();

  private Version previousVersion;

  private JsonNullable<String> previousVersionStr = JsonNullable.<String>undefined();

  private Integer publicHttpsPort;

  private Integer publicPort;

  @Valid
  private JsonNullable<List<String>> publishedServerUriBySubnet = JsonNullable.<List<String>>undefined();

  private Boolean quickConnectAvailable;

  private Integer remoteClientBitrateLimit;

  @Valid
  private JsonNullable<List<String>> remoteIPFilter = JsonNullable.<List<String>>undefined();

  private Boolean removeOldPlugins;

  private Boolean requireHttps;

  private JsonNullable<String> ssDPTracingFilter = JsonNullable.<String>undefined();

  private Boolean saveMetadataHidden;

  private JsonNullable<String> serverName = JsonNullable.<String>undefined();

  private Boolean skipDeserializationForBasicTypes;

  private Long slowResponseThresholdMs;

  @Valid
  private JsonNullable<List<String>> sortRemoveCharacters = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> sortRemoveWords = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> sortReplaceCharacters = JsonNullable.<List<String>>undefined();

  private Boolean trustAllIP6Interfaces;

  private JsonNullable<String> udPPortRange = JsonNullable.<String>undefined();

  private Integer udPSendCount;

  private Integer udPSendDelay;

  private JsonNullable<String> uiCulture = JsonNullable.<String>undefined();

  private Boolean upnPCreateHttpPortMap;

  @Valid
  private JsonNullable<List<String>> uninstalledPlugins = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> virtualInterfaceNames = JsonNullable.<String>undefined();

  public ServerConfiguration activityLogRetentionDays(Integer activityLogRetentionDays) {
    this.activityLogRetentionDays = JsonNullable.of(activityLogRetentionDays);
    return this;
  }

  /**
   * Gets or sets the number of days we should retain activity logs.
   * @return activityLogRetentionDays
  */
  
  @Schema(name = "ActivityLogRetentionDays", description = "Gets or sets the number of days we should retain activity logs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ActivityLogRetentionDays")
  public JsonNullable<Integer> getActivityLogRetentionDays() {
    return activityLogRetentionDays;
  }

  public void setActivityLogRetentionDays(JsonNullable<Integer> activityLogRetentionDays) {
    this.activityLogRetentionDays = activityLogRetentionDays;
  }

  public ServerConfiguration autoDiscovery(Boolean autoDiscovery) {
    this.autoDiscovery = autoDiscovery;
    return this;
  }

  /**
   * Gets or sets a value indicating whether Autodiscovery is enabled.
   * @return autoDiscovery
  */
  
  @Schema(name = "AutoDiscovery", description = "Gets or sets a value indicating whether Autodiscovery is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AutoDiscovery")
  public Boolean getAutoDiscovery() {
    return autoDiscovery;
  }

  public void setAutoDiscovery(Boolean autoDiscovery) {
    this.autoDiscovery = autoDiscovery;
  }

  public ServerConfiguration autoDiscoveryTracing(Boolean autoDiscoveryTracing) {
    this.autoDiscoveryTracing = autoDiscoveryTracing;
    return this;
  }

  /**
   * Gets or sets a value indicating whether Autodiscovery tracing is enabled.
   * @return autoDiscoveryTracing
  */
  
  @Schema(name = "AutoDiscoveryTracing", description = "Gets or sets a value indicating whether Autodiscovery tracing is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AutoDiscoveryTracing")
  public Boolean getAutoDiscoveryTracing() {
    return autoDiscoveryTracing;
  }

  public void setAutoDiscoveryTracing(Boolean autoDiscoveryTracing) {
    this.autoDiscoveryTracing = autoDiscoveryTracing;
  }

  public ServerConfiguration baseUrl(String baseUrl) {
    this.baseUrl = JsonNullable.of(baseUrl);
    return this;
  }

  /**
   * Get baseUrl
   * @return baseUrl
  */
  
  @Schema(name = "BaseUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BaseUrl")
  public JsonNullable<String> getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(JsonNullable<String> baseUrl) {
    this.baseUrl = baseUrl;
  }

  public ServerConfiguration cachePath(String cachePath) {
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

  public ServerConfiguration certificatePassword(String certificatePassword) {
    this.certificatePassword = JsonNullable.of(certificatePassword);
    return this;
  }

  /**
   * Gets or sets the password required to access the X.509 certificate data in the file specified by MediaBrowser.Model.Configuration.ServerConfiguration.CertificatePath.
   * @return certificatePassword
  */
  
  @Schema(name = "CertificatePassword", description = "Gets or sets the password required to access the X.509 certificate data in the file specified by MediaBrowser.Model.Configuration.ServerConfiguration.CertificatePath.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CertificatePassword")
  public JsonNullable<String> getCertificatePassword() {
    return certificatePassword;
  }

  public void setCertificatePassword(JsonNullable<String> certificatePassword) {
    this.certificatePassword = certificatePassword;
  }

  public ServerConfiguration certificatePath(String certificatePath) {
    this.certificatePath = JsonNullable.of(certificatePath);
    return this;
  }

  /**
   * Gets or sets the filesystem path of an X.509 certificate to use for SSL.
   * @return certificatePath
  */
  
  @Schema(name = "CertificatePath", description = "Gets or sets the filesystem path of an X.509 certificate to use for SSL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CertificatePath")
  public JsonNullable<String> getCertificatePath() {
    return certificatePath;
  }

  public void setCertificatePath(JsonNullable<String> certificatePath) {
    this.certificatePath = certificatePath;
  }

  public ServerConfiguration codecsUsed(List<String> codecsUsed) {
    this.codecsUsed = JsonNullable.of(codecsUsed);
    return this;
  }

  public ServerConfiguration addCodecsUsedItem(String codecsUsedItem) {
    if (this.codecsUsed == null || !this.codecsUsed.isPresent()) {
      this.codecsUsed = JsonNullable.of(new ArrayList<>());
    }
    this.codecsUsed.get().add(codecsUsedItem);
    return this;
  }

  /**
   * Get codecsUsed
   * @return codecsUsed
  */
  
  @Schema(name = "CodecsUsed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodecsUsed")
  public JsonNullable<List<String>> getCodecsUsed() {
    return codecsUsed;
  }

  public void setCodecsUsed(JsonNullable<List<String>> codecsUsed) {
    this.codecsUsed = codecsUsed;
  }

  public ServerConfiguration contentTypes(List<@Valid NameValuePair> contentTypes) {
    this.contentTypes = JsonNullable.of(contentTypes);
    return this;
  }

  public ServerConfiguration addContentTypesItem(NameValuePair contentTypesItem) {
    if (this.contentTypes == null || !this.contentTypes.isPresent()) {
      this.contentTypes = JsonNullable.of(new ArrayList<>());
    }
    this.contentTypes.get().add(contentTypesItem);
    return this;
  }

  /**
   * Get contentTypes
   * @return contentTypes
  */
  @Valid 
  @Schema(name = "ContentTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ContentTypes")
  public JsonNullable<List<@Valid NameValuePair>> getContentTypes() {
    return contentTypes;
  }

  public void setContentTypes(JsonNullable<List<@Valid NameValuePair>> contentTypes) {
    this.contentTypes = contentTypes;
  }

  public ServerConfiguration corsHosts(List<String> corsHosts) {
    this.corsHosts = JsonNullable.of(corsHosts);
    return this;
  }

  public ServerConfiguration addCorsHostsItem(String corsHostsItem) {
    if (this.corsHosts == null || !this.corsHosts.isPresent()) {
      this.corsHosts = JsonNullable.of(new ArrayList<>());
    }
    this.corsHosts.get().add(corsHostsItem);
    return this;
  }

  /**
   * Gets or sets the cors hosts.
   * @return corsHosts
  */
  
  @Schema(name = "CorsHosts", description = "Gets or sets the cors hosts.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CorsHosts")
  public JsonNullable<List<String>> getCorsHosts() {
    return corsHosts;
  }

  public void setCorsHosts(JsonNullable<List<String>> corsHosts) {
    this.corsHosts = corsHosts;
  }

  public ServerConfiguration disableLiveTvChannelUserDataName(Boolean disableLiveTvChannelUserDataName) {
    this.disableLiveTvChannelUserDataName = disableLiveTvChannelUserDataName;
    return this;
  }

  /**
   * Get disableLiveTvChannelUserDataName
   * @return disableLiveTvChannelUserDataName
  */
  
  @Schema(name = "DisableLiveTvChannelUserDataName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisableLiveTvChannelUserDataName")
  public Boolean getDisableLiveTvChannelUserDataName() {
    return disableLiveTvChannelUserDataName;
  }

  public void setDisableLiveTvChannelUserDataName(Boolean disableLiveTvChannelUserDataName) {
    this.disableLiveTvChannelUserDataName = disableLiveTvChannelUserDataName;
  }

  public ServerConfiguration disablePluginImages(Boolean disablePluginImages) {
    this.disablePluginImages = disablePluginImages;
    return this;
  }

  /**
   * Gets or sets a value indicating whether plugin image should be disabled.
   * @return disablePluginImages
  */
  
  @Schema(name = "DisablePluginImages", description = "Gets or sets a value indicating whether plugin image should be disabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisablePluginImages")
  public Boolean getDisablePluginImages() {
    return disablePluginImages;
  }

  public void setDisablePluginImages(Boolean disablePluginImages) {
    this.disablePluginImages = disablePluginImages;
  }

  public ServerConfiguration displaySpecialsWithinSeasons(Boolean displaySpecialsWithinSeasons) {
    this.displaySpecialsWithinSeasons = displaySpecialsWithinSeasons;
    return this;
  }

  /**
   * Get displaySpecialsWithinSeasons
   * @return displaySpecialsWithinSeasons
  */
  
  @Schema(name = "DisplaySpecialsWithinSeasons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisplaySpecialsWithinSeasons")
  public Boolean getDisplaySpecialsWithinSeasons() {
    return displaySpecialsWithinSeasons;
  }

  public void setDisplaySpecialsWithinSeasons(Boolean displaySpecialsWithinSeasons) {
    this.displaySpecialsWithinSeasons = displaySpecialsWithinSeasons;
  }

  public ServerConfiguration enableCaseSensitiveItemIds(Boolean enableCaseSensitiveItemIds) {
    this.enableCaseSensitiveItemIds = enableCaseSensitiveItemIds;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [enable case sensitive item ids].
   * @return enableCaseSensitiveItemIds
  */
  
  @Schema(name = "EnableCaseSensitiveItemIds", description = "Gets or sets a value indicating whether [enable case sensitive item ids].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableCaseSensitiveItemIds")
  public Boolean getEnableCaseSensitiveItemIds() {
    return enableCaseSensitiveItemIds;
  }

  public void setEnableCaseSensitiveItemIds(Boolean enableCaseSensitiveItemIds) {
    this.enableCaseSensitiveItemIds = enableCaseSensitiveItemIds;
  }

  public ServerConfiguration enableDashboardResponseCaching(Boolean enableDashboardResponseCaching) {
    this.enableDashboardResponseCaching = enableDashboardResponseCaching;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [enable dashboard response caching].  Allows potential contributors without visual studio to modify production dashboard code and test changes.
   * @return enableDashboardResponseCaching
  */
  
  @Schema(name = "EnableDashboardResponseCaching", description = "Gets or sets a value indicating whether [enable dashboard response caching].  Allows potential contributors without visual studio to modify production dashboard code and test changes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableDashboardResponseCaching")
  public Boolean getEnableDashboardResponseCaching() {
    return enableDashboardResponseCaching;
  }

  public void setEnableDashboardResponseCaching(Boolean enableDashboardResponseCaching) {
    this.enableDashboardResponseCaching = enableDashboardResponseCaching;
  }

  public ServerConfiguration enableExternalContentInSuggestions(Boolean enableExternalContentInSuggestions) {
    this.enableExternalContentInSuggestions = enableExternalContentInSuggestions;
    return this;
  }

  /**
   * Get enableExternalContentInSuggestions
   * @return enableExternalContentInSuggestions
  */
  
  @Schema(name = "EnableExternalContentInSuggestions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableExternalContentInSuggestions")
  public Boolean getEnableExternalContentInSuggestions() {
    return enableExternalContentInSuggestions;
  }

  public void setEnableExternalContentInSuggestions(Boolean enableExternalContentInSuggestions) {
    this.enableExternalContentInSuggestions = enableExternalContentInSuggestions;
  }

  public ServerConfiguration enableFolderView(Boolean enableFolderView) {
    this.enableFolderView = enableFolderView;
    return this;
  }

  /**
   * Get enableFolderView
   * @return enableFolderView
  */
  
  @Schema(name = "EnableFolderView", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableFolderView")
  public Boolean getEnableFolderView() {
    return enableFolderView;
  }

  public void setEnableFolderView(Boolean enableFolderView) {
    this.enableFolderView = enableFolderView;
  }

  public ServerConfiguration enableGroupingIntoCollections(Boolean enableGroupingIntoCollections) {
    this.enableGroupingIntoCollections = enableGroupingIntoCollections;
    return this;
  }

  /**
   * Get enableGroupingIntoCollections
   * @return enableGroupingIntoCollections
  */
  
  @Schema(name = "EnableGroupingIntoCollections", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableGroupingIntoCollections")
  public Boolean getEnableGroupingIntoCollections() {
    return enableGroupingIntoCollections;
  }

  public void setEnableGroupingIntoCollections(Boolean enableGroupingIntoCollections) {
    this.enableGroupingIntoCollections = enableGroupingIntoCollections;
  }

  public ServerConfiguration enableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
    return this;
  }

  /**
   * Gets or sets a value indicating whether to use HTTPS.
   * @return enableHttps
  */
  
  @Schema(name = "EnableHttps", description = "Gets or sets a value indicating whether to use HTTPS.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableHttps")
  public Boolean getEnableHttps() {
    return enableHttps;
  }

  public void setEnableHttps(Boolean enableHttps) {
    this.enableHttps = enableHttps;
  }

  public ServerConfiguration enableIPV4(Boolean enableIPV4) {
    this.enableIPV4 = enableIPV4;
    return this;
  }

  /**
   * Gets or sets a value indicating whether IPV4 capability is enabled.
   * @return enableIPV4
  */
  
  @Schema(name = "EnableIPV4", description = "Gets or sets a value indicating whether IPV4 capability is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableIPV4")
  public Boolean getEnableIPV4() {
    return enableIPV4;
  }

  public void setEnableIPV4(Boolean enableIPV4) {
    this.enableIPV4 = enableIPV4;
  }

  public ServerConfiguration enableIPV6(Boolean enableIPV6) {
    this.enableIPV6 = enableIPV6;
    return this;
  }

  /**
   * Gets or sets a value indicating whether IPV6 capability is enabled.
   * @return enableIPV6
  */
  
  @Schema(name = "EnableIPV6", description = "Gets or sets a value indicating whether IPV6 capability is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableIPV6")
  public Boolean getEnableIPV6() {
    return enableIPV6;
  }

  public void setEnableIPV6(Boolean enableIPV6) {
    this.enableIPV6 = enableIPV6;
  }

  public ServerConfiguration enableMetrics(Boolean enableMetrics) {
    this.enableMetrics = enableMetrics;
    return this;
  }

  /**
   * Gets or sets a value indicating whether to enable prometheus metrics exporting.
   * @return enableMetrics
  */
  
  @Schema(name = "EnableMetrics", description = "Gets or sets a value indicating whether to enable prometheus metrics exporting.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableMetrics")
  public Boolean getEnableMetrics() {
    return enableMetrics;
  }

  public void setEnableMetrics(Boolean enableMetrics) {
    this.enableMetrics = enableMetrics;
  }

  public ServerConfiguration enableMultiSocketBinding(Boolean enableMultiSocketBinding) {
    this.enableMultiSocketBinding = enableMultiSocketBinding;
    return this;
  }

  /**
   * Gets a value indicating whether multi-socket binding is available.
   * @return enableMultiSocketBinding
  */
  
  @Schema(name = "EnableMultiSocketBinding", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets a value indicating whether multi-socket binding is available.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableMultiSocketBinding")
  public Boolean getEnableMultiSocketBinding() {
    return enableMultiSocketBinding;
  }

  public void setEnableMultiSocketBinding(Boolean enableMultiSocketBinding) {
    this.enableMultiSocketBinding = enableMultiSocketBinding;
  }

  public ServerConfiguration enableNewOmdbSupport(Boolean enableNewOmdbSupport) {
    this.enableNewOmdbSupport = enableNewOmdbSupport;
    return this;
  }

  /**
   * Get enableNewOmdbSupport
   * @return enableNewOmdbSupport
  */
  
  @Schema(name = "EnableNewOmdbSupport", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableNewOmdbSupport")
  public Boolean getEnableNewOmdbSupport() {
    return enableNewOmdbSupport;
  }

  public void setEnableNewOmdbSupport(Boolean enableNewOmdbSupport) {
    this.enableNewOmdbSupport = enableNewOmdbSupport;
  }

  public ServerConfiguration enableNormalizedItemByNameIds(Boolean enableNormalizedItemByNameIds) {
    this.enableNormalizedItemByNameIds = enableNormalizedItemByNameIds;
    return this;
  }

  /**
   * Get enableNormalizedItemByNameIds
   * @return enableNormalizedItemByNameIds
  */
  
  @Schema(name = "EnableNormalizedItemByNameIds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableNormalizedItemByNameIds")
  public Boolean getEnableNormalizedItemByNameIds() {
    return enableNormalizedItemByNameIds;
  }

  public void setEnableNormalizedItemByNameIds(Boolean enableNormalizedItemByNameIds) {
    this.enableNormalizedItemByNameIds = enableNormalizedItemByNameIds;
  }

  public ServerConfiguration enableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
    return this;
  }

  /**
   * Gets or sets a value indicating whether access outside of the LAN is permitted.
   * @return enableRemoteAccess
  */
  
  @Schema(name = "EnableRemoteAccess", description = "Gets or sets a value indicating whether access outside of the LAN is permitted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableRemoteAccess")
  public Boolean getEnableRemoteAccess() {
    return enableRemoteAccess;
  }

  public void setEnableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
  }

  public ServerConfiguration enableSSDPTracing(Boolean enableSSDPTracing) {
    this.enableSSDPTracing = enableSSDPTracing;
    return this;
  }

  /**
   * Gets or sets a value indicating whether detailed ssdp logs are sent to the console/log.  \"Emby.Dlna\": \"Debug\" must be set in logging.default.json for this property to work.
   * @return enableSSDPTracing
  */
  
  @Schema(name = "EnableSSDPTracing", description = "Gets or sets a value indicating whether detailed ssdp logs are sent to the console/log.  \"Emby.Dlna\": \"Debug\" must be set in logging.default.json for this property to work.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableSSDPTracing")
  public Boolean getEnableSSDPTracing() {
    return enableSSDPTracing;
  }

  public void setEnableSSDPTracing(Boolean enableSSDPTracing) {
    this.enableSSDPTracing = enableSSDPTracing;
  }

  public ServerConfiguration enableSimpleArtistDetection(Boolean enableSimpleArtistDetection) {
    this.enableSimpleArtistDetection = enableSimpleArtistDetection;
    return this;
  }

  /**
   * Get enableSimpleArtistDetection
   * @return enableSimpleArtistDetection
  */
  
  @Schema(name = "EnableSimpleArtistDetection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableSimpleArtistDetection")
  public Boolean getEnableSimpleArtistDetection() {
    return enableSimpleArtistDetection;
  }

  public void setEnableSimpleArtistDetection(Boolean enableSimpleArtistDetection) {
    this.enableSimpleArtistDetection = enableSimpleArtistDetection;
  }

  public ServerConfiguration enableSlowResponseWarning(Boolean enableSlowResponseWarning) {
    this.enableSlowResponseWarning = enableSlowResponseWarning;
    return this;
  }

  /**
   * Gets or sets a value indicating whether slow server responses should be logged as a warning.
   * @return enableSlowResponseWarning
  */
  
  @Schema(name = "EnableSlowResponseWarning", description = "Gets or sets a value indicating whether slow server responses should be logged as a warning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableSlowResponseWarning")
  public Boolean getEnableSlowResponseWarning() {
    return enableSlowResponseWarning;
  }

  public void setEnableSlowResponseWarning(Boolean enableSlowResponseWarning) {
    this.enableSlowResponseWarning = enableSlowResponseWarning;
  }

  public ServerConfiguration enableUPnP(Boolean enableUPnP) {
    this.enableUPnP = enableUPnP;
    return this;
  }

  /**
   * Gets or sets a value indicating whether to enable automatic port forwarding.
   * @return enableUPnP
  */
  
  @Schema(name = "EnableUPnP", description = "Gets or sets a value indicating whether to enable automatic port forwarding.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableUPnP")
  public Boolean getEnableUPnP() {
    return enableUPnP;
  }

  public void setEnableUPnP(Boolean enableUPnP) {
    this.enableUPnP = enableUPnP;
  }

  public ServerConfiguration gatewayMonitorPeriod(Integer gatewayMonitorPeriod) {
    this.gatewayMonitorPeriod = gatewayMonitorPeriod;
    return this;
  }

  /**
   * Gets or sets the time (in seconds) between the pings of SSDP gateway monitor.
   * @return gatewayMonitorPeriod
  */
  
  @Schema(name = "GatewayMonitorPeriod", description = "Gets or sets the time (in seconds) between the pings of SSDP gateway monitor.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GatewayMonitorPeriod")
  public Integer getGatewayMonitorPeriod() {
    return gatewayMonitorPeriod;
  }

  public void setGatewayMonitorPeriod(Integer gatewayMonitorPeriod) {
    this.gatewayMonitorPeriod = gatewayMonitorPeriod;
  }

  public ServerConfiguration hdHomerunPortRange(String hdHomerunPortRange) {
    this.hdHomerunPortRange = JsonNullable.of(hdHomerunPortRange);
    return this;
  }

  /**
   * Gets or sets the ports that HDHomerun uses.
   * @return hdHomerunPortRange
  */
  
  @Schema(name = "HDHomerunPortRange", description = "Gets or sets the ports that HDHomerun uses.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HDHomerunPortRange")
  public JsonNullable<String> getHdHomerunPortRange() {
    return hdHomerunPortRange;
  }

  public void setHdHomerunPortRange(JsonNullable<String> hdHomerunPortRange) {
    this.hdHomerunPortRange = hdHomerunPortRange;
  }

  public ServerConfiguration httpServerPortNumber(Integer httpServerPortNumber) {
    this.httpServerPortNumber = httpServerPortNumber;
    return this;
  }

  /**
   * Gets or sets the HTTP server port number.
   * @return httpServerPortNumber
  */
  
  @Schema(name = "HttpServerPortNumber", description = "Gets or sets the HTTP server port number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HttpServerPortNumber")
  public Integer getHttpServerPortNumber() {
    return httpServerPortNumber;
  }

  public void setHttpServerPortNumber(Integer httpServerPortNumber) {
    this.httpServerPortNumber = httpServerPortNumber;
  }

  public ServerConfiguration httpsPortNumber(Integer httpsPortNumber) {
    this.httpsPortNumber = httpsPortNumber;
    return this;
  }

  /**
   * Gets or sets the HTTPS server port number.
   * @return httpsPortNumber
  */
  
  @Schema(name = "HttpsPortNumber", description = "Gets or sets the HTTPS server port number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HttpsPortNumber")
  public Integer getHttpsPortNumber() {
    return httpsPortNumber;
  }

  public void setHttpsPortNumber(Integer httpsPortNumber) {
    this.httpsPortNumber = httpsPortNumber;
  }

  public ServerConfiguration ignoreVirtualInterfaces(Boolean ignoreVirtualInterfaces) {
    this.ignoreVirtualInterfaces = ignoreVirtualInterfaces;
    return this;
  }

  /**
   * Gets or sets a value indicating whether address names that match MediaBrowser.Model.Configuration.ServerConfiguration.VirtualInterfaceNames should be Ignore for the purposes of binding.
   * @return ignoreVirtualInterfaces
  */
  
  @Schema(name = "IgnoreVirtualInterfaces", description = "Gets or sets a value indicating whether address names that match MediaBrowser.Model.Configuration.ServerConfiguration.VirtualInterfaceNames should be Ignore for the purposes of binding.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IgnoreVirtualInterfaces")
  public Boolean getIgnoreVirtualInterfaces() {
    return ignoreVirtualInterfaces;
  }

  public void setIgnoreVirtualInterfaces(Boolean ignoreVirtualInterfaces) {
    this.ignoreVirtualInterfaces = ignoreVirtualInterfaces;
  }

  public ServerConfiguration imageExtractionTimeoutMs(Integer imageExtractionTimeoutMs) {
    this.imageExtractionTimeoutMs = imageExtractionTimeoutMs;
    return this;
  }

  /**
   * Get imageExtractionTimeoutMs
   * @return imageExtractionTimeoutMs
  */
  
  @Schema(name = "ImageExtractionTimeoutMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageExtractionTimeoutMs")
  public Integer getImageExtractionTimeoutMs() {
    return imageExtractionTimeoutMs;
  }

  public void setImageExtractionTimeoutMs(Integer imageExtractionTimeoutMs) {
    this.imageExtractionTimeoutMs = imageExtractionTimeoutMs;
  }

  public ServerConfiguration imageSavingConvention(ImageSavingConvention imageSavingConvention) {
    this.imageSavingConvention = imageSavingConvention;
    return this;
  }

  /**
   * Get imageSavingConvention
   * @return imageSavingConvention
  */
  @Valid 
  @Schema(name = "ImageSavingConvention", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageSavingConvention")
  public ImageSavingConvention getImageSavingConvention() {
    return imageSavingConvention;
  }

  public void setImageSavingConvention(ImageSavingConvention imageSavingConvention) {
    this.imageSavingConvention = imageSavingConvention;
  }

  public ServerConfiguration isPortAuthorized(Boolean isPortAuthorized) {
    this.isPortAuthorized = isPortAuthorized;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is port authorized.
   * @return isPortAuthorized
  */
  
  @Schema(name = "IsPortAuthorized", description = "Gets or sets a value indicating whether this instance is port authorized.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPortAuthorized")
  public Boolean getIsPortAuthorized() {
    return isPortAuthorized;
  }

  public void setIsPortAuthorized(Boolean isPortAuthorized) {
    this.isPortAuthorized = isPortAuthorized;
  }

  public ServerConfiguration isRemoteIPFilterBlacklist(Boolean isRemoteIPFilterBlacklist) {
    this.isRemoteIPFilterBlacklist = isRemoteIPFilterBlacklist;
    return this;
  }

  /**
   * Gets or sets a value indicating whether <seealso cref=\"P:MediaBrowser.Model.Configuration.ServerConfiguration.RemoteIPFilter\" /> contains a blacklist or a whitelist. Default is a whitelist.
   * @return isRemoteIPFilterBlacklist
  */
  
  @Schema(name = "IsRemoteIPFilterBlacklist", description = "Gets or sets a value indicating whether <seealso cref=\"P:MediaBrowser.Model.Configuration.ServerConfiguration.RemoteIPFilter\" /> contains a blacklist or a whitelist. Default is a whitelist.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsRemoteIPFilterBlacklist")
  public Boolean getIsRemoteIPFilterBlacklist() {
    return isRemoteIPFilterBlacklist;
  }

  public void setIsRemoteIPFilterBlacklist(Boolean isRemoteIPFilterBlacklist) {
    this.isRemoteIPFilterBlacklist = isRemoteIPFilterBlacklist;
  }

  public ServerConfiguration isStartupWizardCompleted(Boolean isStartupWizardCompleted) {
    this.isStartupWizardCompleted = isStartupWizardCompleted;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is first run.
   * @return isStartupWizardCompleted
  */
  
  @Schema(name = "IsStartupWizardCompleted", description = "Gets or sets a value indicating whether this instance is first run.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsStartupWizardCompleted")
  public Boolean getIsStartupWizardCompleted() {
    return isStartupWizardCompleted;
  }

  public void setIsStartupWizardCompleted(Boolean isStartupWizardCompleted) {
    this.isStartupWizardCompleted = isStartupWizardCompleted;
  }

  public ServerConfiguration knownProxies(List<String> knownProxies) {
    this.knownProxies = JsonNullable.of(knownProxies);
    return this;
  }

  public ServerConfiguration addKnownProxiesItem(String knownProxiesItem) {
    if (this.knownProxies == null || !this.knownProxies.isPresent()) {
      this.knownProxies = JsonNullable.of(new ArrayList<>());
    }
    this.knownProxies.get().add(knownProxiesItem);
    return this;
  }

  /**
   * Gets or sets the known proxies.
   * @return knownProxies
  */
  
  @Schema(name = "KnownProxies", description = "Gets or sets the known proxies.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KnownProxies")
  public JsonNullable<List<String>> getKnownProxies() {
    return knownProxies;
  }

  public void setKnownProxies(JsonNullable<List<String>> knownProxies) {
    this.knownProxies = knownProxies;
  }

  public ServerConfiguration libraryMetadataRefreshConcurrency(Integer libraryMetadataRefreshConcurrency) {
    this.libraryMetadataRefreshConcurrency = libraryMetadataRefreshConcurrency;
    return this;
  }

  /**
   * Gets or sets the how many metadata refreshes can run concurrently.
   * @return libraryMetadataRefreshConcurrency
  */
  
  @Schema(name = "LibraryMetadataRefreshConcurrency", description = "Gets or sets the how many metadata refreshes can run concurrently.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LibraryMetadataRefreshConcurrency")
  public Integer getLibraryMetadataRefreshConcurrency() {
    return libraryMetadataRefreshConcurrency;
  }

  public void setLibraryMetadataRefreshConcurrency(Integer libraryMetadataRefreshConcurrency) {
    this.libraryMetadataRefreshConcurrency = libraryMetadataRefreshConcurrency;
  }

  public ServerConfiguration libraryMonitorDelay(Integer libraryMonitorDelay) {
    this.libraryMonitorDelay = libraryMonitorDelay;
    return this;
  }

  /**
   * Gets or sets the delay in seconds that we will wait after a file system change to try and discover what has been added/removed  Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several  different directories and files.
   * @return libraryMonitorDelay
  */
  
  @Schema(name = "LibraryMonitorDelay", description = "Gets or sets the delay in seconds that we will wait after a file system change to try and discover what has been added/removed  Some delay is necessary with some items because their creation is not atomic.  It involves the creation of several  different directories and files.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LibraryMonitorDelay")
  public Integer getLibraryMonitorDelay() {
    return libraryMonitorDelay;
  }

  public void setLibraryMonitorDelay(Integer libraryMonitorDelay) {
    this.libraryMonitorDelay = libraryMonitorDelay;
  }

  public ServerConfiguration libraryScanFanoutConcurrency(Integer libraryScanFanoutConcurrency) {
    this.libraryScanFanoutConcurrency = libraryScanFanoutConcurrency;
    return this;
  }

  /**
   * Gets or sets the how the library scan fans out.
   * @return libraryScanFanoutConcurrency
  */
  
  @Schema(name = "LibraryScanFanoutConcurrency", description = "Gets or sets the how the library scan fans out.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LibraryScanFanoutConcurrency")
  public Integer getLibraryScanFanoutConcurrency() {
    return libraryScanFanoutConcurrency;
  }

  public void setLibraryScanFanoutConcurrency(Integer libraryScanFanoutConcurrency) {
    this.libraryScanFanoutConcurrency = libraryScanFanoutConcurrency;
  }

  public ServerConfiguration localNetworkAddresses(List<String> localNetworkAddresses) {
    this.localNetworkAddresses = JsonNullable.of(localNetworkAddresses);
    return this;
  }

  public ServerConfiguration addLocalNetworkAddressesItem(String localNetworkAddressesItem) {
    if (this.localNetworkAddresses == null || !this.localNetworkAddresses.isPresent()) {
      this.localNetworkAddresses = JsonNullable.of(new ArrayList<>());
    }
    this.localNetworkAddresses.get().add(localNetworkAddressesItem);
    return this;
  }

  /**
   * Gets or sets the interface addresses which Jellyfin will bind to. If empty, all interfaces will be used.
   * @return localNetworkAddresses
  */
  
  @Schema(name = "LocalNetworkAddresses", description = "Gets or sets the interface addresses which Jellyfin will bind to. If empty, all interfaces will be used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalNetworkAddresses")
  public JsonNullable<List<String>> getLocalNetworkAddresses() {
    return localNetworkAddresses;
  }

  public void setLocalNetworkAddresses(JsonNullable<List<String>> localNetworkAddresses) {
    this.localNetworkAddresses = localNetworkAddresses;
  }

  public ServerConfiguration localNetworkSubnets(List<String> localNetworkSubnets) {
    this.localNetworkSubnets = JsonNullable.of(localNetworkSubnets);
    return this;
  }

  public ServerConfiguration addLocalNetworkSubnetsItem(String localNetworkSubnetsItem) {
    if (this.localNetworkSubnets == null || !this.localNetworkSubnets.isPresent()) {
      this.localNetworkSubnets = JsonNullable.of(new ArrayList<>());
    }
    this.localNetworkSubnets.get().add(localNetworkSubnetsItem);
    return this;
  }

  /**
   * Gets or sets the subnets that are deemed to make up the LAN.
   * @return localNetworkSubnets
  */
  
  @Schema(name = "LocalNetworkSubnets", description = "Gets or sets the subnets that are deemed to make up the LAN.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LocalNetworkSubnets")
  public JsonNullable<List<String>> getLocalNetworkSubnets() {
    return localNetworkSubnets;
  }

  public void setLocalNetworkSubnets(JsonNullable<List<String>> localNetworkSubnets) {
    this.localNetworkSubnets = localNetworkSubnets;
  }

  public ServerConfiguration logFileRetentionDays(Integer logFileRetentionDays) {
    this.logFileRetentionDays = logFileRetentionDays;
    return this;
  }

  /**
   * Gets or sets the number of days we should retain log files.
   * @return logFileRetentionDays
  */
  
  @Schema(name = "LogFileRetentionDays", description = "Gets or sets the number of days we should retain log files.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LogFileRetentionDays")
  public Integer getLogFileRetentionDays() {
    return logFileRetentionDays;
  }

  public void setLogFileRetentionDays(Integer logFileRetentionDays) {
    this.logFileRetentionDays = logFileRetentionDays;
  }

  public ServerConfiguration maxAudiobookResume(Integer maxAudiobookResume) {
    this.maxAudiobookResume = maxAudiobookResume;
    return this;
  }

  /**
   * Gets or sets the remaining minutes of a book that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.
   * @return maxAudiobookResume
  */
  
  @Schema(name = "MaxAudiobookResume", description = "Gets or sets the remaining minutes of a book that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxAudiobookResume")
  public Integer getMaxAudiobookResume() {
    return maxAudiobookResume;
  }

  public void setMaxAudiobookResume(Integer maxAudiobookResume) {
    this.maxAudiobookResume = maxAudiobookResume;
  }

  public ServerConfiguration maxResumePct(Integer maxResumePct) {
    this.maxResumePct = maxResumePct;
    return this;
  }

  /**
   * Gets or sets the maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.
   * @return maxResumePct
  */
  
  @Schema(name = "MaxResumePct", description = "Gets or sets the maximum percentage of an item that can be played while still saving playstate. If this percentage is crossed playstate will be reset to the beginning and the item will be marked watched.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxResumePct")
  public Integer getMaxResumePct() {
    return maxResumePct;
  }

  public void setMaxResumePct(Integer maxResumePct) {
    this.maxResumePct = maxResumePct;
  }

  public ServerConfiguration metadataCountryCode(String metadataCountryCode) {
    this.metadataCountryCode = JsonNullable.of(metadataCountryCode);
    return this;
  }

  /**
   * Gets or sets the metadata country code.
   * @return metadataCountryCode
  */
  
  @Schema(name = "MetadataCountryCode", description = "Gets or sets the metadata country code.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataCountryCode")
  public JsonNullable<String> getMetadataCountryCode() {
    return metadataCountryCode;
  }

  public void setMetadataCountryCode(JsonNullable<String> metadataCountryCode) {
    this.metadataCountryCode = metadataCountryCode;
  }

  public ServerConfiguration metadataNetworkPath(String metadataNetworkPath) {
    this.metadataNetworkPath = JsonNullable.of(metadataNetworkPath);
    return this;
  }

  /**
   * Get metadataNetworkPath
   * @return metadataNetworkPath
  */
  
  @Schema(name = "MetadataNetworkPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataNetworkPath")
  public JsonNullable<String> getMetadataNetworkPath() {
    return metadataNetworkPath;
  }

  public void setMetadataNetworkPath(JsonNullable<String> metadataNetworkPath) {
    this.metadataNetworkPath = metadataNetworkPath;
  }

  public ServerConfiguration metadataOptions(List<@Valid MetadataOptions> metadataOptions) {
    this.metadataOptions = JsonNullable.of(metadataOptions);
    return this;
  }

  public ServerConfiguration addMetadataOptionsItem(MetadataOptions metadataOptionsItem) {
    if (this.metadataOptions == null || !this.metadataOptions.isPresent()) {
      this.metadataOptions = JsonNullable.of(new ArrayList<>());
    }
    this.metadataOptions.get().add(metadataOptionsItem);
    return this;
  }

  /**
   * Get metadataOptions
   * @return metadataOptions
  */
  @Valid 
  @Schema(name = "MetadataOptions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataOptions")
  public JsonNullable<List<@Valid MetadataOptions>> getMetadataOptions() {
    return metadataOptions;
  }

  public void setMetadataOptions(JsonNullable<List<@Valid MetadataOptions>> metadataOptions) {
    this.metadataOptions = metadataOptions;
  }

  public ServerConfiguration metadataPath(String metadataPath) {
    this.metadataPath = JsonNullable.of(metadataPath);
    return this;
  }

  /**
   * Gets or sets the metadata path.
   * @return metadataPath
  */
  
  @Schema(name = "MetadataPath", description = "Gets or sets the metadata path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MetadataPath")
  public JsonNullable<String> getMetadataPath() {
    return metadataPath;
  }

  public void setMetadataPath(JsonNullable<String> metadataPath) {
    this.metadataPath = metadataPath;
  }

  public ServerConfiguration minAudiobookResume(Integer minAudiobookResume) {
    this.minAudiobookResume = minAudiobookResume;
    return this;
  }

  /**
   * Gets or sets the minimum minutes of a book that must be played in order for playstate to be updated.
   * @return minAudiobookResume
  */
  
  @Schema(name = "MinAudiobookResume", description = "Gets or sets the minimum minutes of a book that must be played in order for playstate to be updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinAudiobookResume")
  public Integer getMinAudiobookResume() {
    return minAudiobookResume;
  }

  public void setMinAudiobookResume(Integer minAudiobookResume) {
    this.minAudiobookResume = minAudiobookResume;
  }

  public ServerConfiguration minResumeDurationSeconds(Integer minResumeDurationSeconds) {
    this.minResumeDurationSeconds = minResumeDurationSeconds;
    return this;
  }

  /**
   * Gets or sets the minimum duration that an item must have in order to be eligible for playstate updates..
   * @return minResumeDurationSeconds
  */
  
  @Schema(name = "MinResumeDurationSeconds", description = "Gets or sets the minimum duration that an item must have in order to be eligible for playstate updates..", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinResumeDurationSeconds")
  public Integer getMinResumeDurationSeconds() {
    return minResumeDurationSeconds;
  }

  public void setMinResumeDurationSeconds(Integer minResumeDurationSeconds) {
    this.minResumeDurationSeconds = minResumeDurationSeconds;
  }

  public ServerConfiguration minResumePct(Integer minResumePct) {
    this.minResumePct = minResumePct;
    return this;
  }

  /**
   * Gets or sets the minimum percentage of an item that must be played in order for playstate to be updated.
   * @return minResumePct
  */
  
  @Schema(name = "MinResumePct", description = "Gets or sets the minimum percentage of an item that must be played in order for playstate to be updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinResumePct")
  public Integer getMinResumePct() {
    return minResumePct;
  }

  public void setMinResumePct(Integer minResumePct) {
    this.minResumePct = minResumePct;
  }

  public ServerConfiguration pathSubstitutions(List<@Valid PathSubstitution> pathSubstitutions) {
    this.pathSubstitutions = JsonNullable.of(pathSubstitutions);
    return this;
  }

  public ServerConfiguration addPathSubstitutionsItem(PathSubstitution pathSubstitutionsItem) {
    if (this.pathSubstitutions == null || !this.pathSubstitutions.isPresent()) {
      this.pathSubstitutions = JsonNullable.of(new ArrayList<>());
    }
    this.pathSubstitutions.get().add(pathSubstitutionsItem);
    return this;
  }

  /**
   * Get pathSubstitutions
   * @return pathSubstitutions
  */
  @Valid 
  @Schema(name = "PathSubstitutions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PathSubstitutions")
  public JsonNullable<List<@Valid PathSubstitution>> getPathSubstitutions() {
    return pathSubstitutions;
  }

  public void setPathSubstitutions(JsonNullable<List<@Valid PathSubstitution>> pathSubstitutions) {
    this.pathSubstitutions = pathSubstitutions;
  }

  public ServerConfiguration pluginRepositories(List<@Valid RepositoryInfo> pluginRepositories) {
    this.pluginRepositories = JsonNullable.of(pluginRepositories);
    return this;
  }

  public ServerConfiguration addPluginRepositoriesItem(RepositoryInfo pluginRepositoriesItem) {
    if (this.pluginRepositories == null || !this.pluginRepositories.isPresent()) {
      this.pluginRepositories = JsonNullable.of(new ArrayList<>());
    }
    this.pluginRepositories.get().add(pluginRepositoriesItem);
    return this;
  }

  /**
   * Get pluginRepositories
   * @return pluginRepositories
  */
  @Valid 
  @Schema(name = "PluginRepositories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PluginRepositories")
  public JsonNullable<List<@Valid RepositoryInfo>> getPluginRepositories() {
    return pluginRepositories;
  }

  public void setPluginRepositories(JsonNullable<List<@Valid RepositoryInfo>> pluginRepositories) {
    this.pluginRepositories = pluginRepositories;
  }

  public ServerConfiguration preferredMetadataLanguage(String preferredMetadataLanguage) {
    this.preferredMetadataLanguage = JsonNullable.of(preferredMetadataLanguage);
    return this;
  }

  /**
   * Gets or sets the preferred metadata language.
   * @return preferredMetadataLanguage
  */
  
  @Schema(name = "PreferredMetadataLanguage", description = "Gets or sets the preferred metadata language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreferredMetadataLanguage")
  public JsonNullable<String> getPreferredMetadataLanguage() {
    return preferredMetadataLanguage;
  }

  public void setPreferredMetadataLanguage(JsonNullable<String> preferredMetadataLanguage) {
    this.preferredMetadataLanguage = preferredMetadataLanguage;
  }

  public ServerConfiguration previousVersion(Version previousVersion) {
    this.previousVersion = previousVersion;
    return this;
  }

  /**
   * Get previousVersion
   * @return previousVersion
  */
  @Valid 
  @Schema(name = "PreviousVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreviousVersion")
  public Version getPreviousVersion() {
    return previousVersion;
  }

  public void setPreviousVersion(Version previousVersion) {
    this.previousVersion = previousVersion;
  }

  public ServerConfiguration previousVersionStr(String previousVersionStr) {
    this.previousVersionStr = JsonNullable.of(previousVersionStr);
    return this;
  }

  /**
   * Gets or sets the stringified PreviousVersion to be stored/loaded,  because System.Version itself isn't xml-serializable.
   * @return previousVersionStr
  */
  
  @Schema(name = "PreviousVersionStr", description = "Gets or sets the stringified PreviousVersion to be stored/loaded,  because System.Version itself isn't xml-serializable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PreviousVersionStr")
  public JsonNullable<String> getPreviousVersionStr() {
    return previousVersionStr;
  }

  public void setPreviousVersionStr(JsonNullable<String> previousVersionStr) {
    this.previousVersionStr = previousVersionStr;
  }

  public ServerConfiguration publicHttpsPort(Integer publicHttpsPort) {
    this.publicHttpsPort = publicHttpsPort;
    return this;
  }

  /**
   * Gets or sets the public HTTPS port.
   * @return publicHttpsPort
  */
  
  @Schema(name = "PublicHttpsPort", description = "Gets or sets the public HTTPS port.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PublicHttpsPort")
  public Integer getPublicHttpsPort() {
    return publicHttpsPort;
  }

  public void setPublicHttpsPort(Integer publicHttpsPort) {
    this.publicHttpsPort = publicHttpsPort;
  }

  public ServerConfiguration publicPort(Integer publicPort) {
    this.publicPort = publicPort;
    return this;
  }

  /**
   * Gets or sets the public mapped port.
   * @return publicPort
  */
  
  @Schema(name = "PublicPort", description = "Gets or sets the public mapped port.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PublicPort")
  public Integer getPublicPort() {
    return publicPort;
  }

  public void setPublicPort(Integer publicPort) {
    this.publicPort = publicPort;
  }

  public ServerConfiguration publishedServerUriBySubnet(List<String> publishedServerUriBySubnet) {
    this.publishedServerUriBySubnet = JsonNullable.of(publishedServerUriBySubnet);
    return this;
  }

  public ServerConfiguration addPublishedServerUriBySubnetItem(String publishedServerUriBySubnetItem) {
    if (this.publishedServerUriBySubnet == null || !this.publishedServerUriBySubnet.isPresent()) {
      this.publishedServerUriBySubnet = JsonNullable.of(new ArrayList<>());
    }
    this.publishedServerUriBySubnet.get().add(publishedServerUriBySubnetItem);
    return this;
  }

  /**
   * Gets or sets PublishedServerUri to advertise for specific subnets.
   * @return publishedServerUriBySubnet
  */
  
  @Schema(name = "PublishedServerUriBySubnet", description = "Gets or sets PublishedServerUri to advertise for specific subnets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PublishedServerUriBySubnet")
  public JsonNullable<List<String>> getPublishedServerUriBySubnet() {
    return publishedServerUriBySubnet;
  }

  public void setPublishedServerUriBySubnet(JsonNullable<List<String>> publishedServerUriBySubnet) {
    this.publishedServerUriBySubnet = publishedServerUriBySubnet;
  }

  public ServerConfiguration quickConnectAvailable(Boolean quickConnectAvailable) {
    this.quickConnectAvailable = quickConnectAvailable;
    return this;
  }

  /**
   * Gets or sets a value indicating whether quick connect is available for use on this server.
   * @return quickConnectAvailable
  */
  
  @Schema(name = "QuickConnectAvailable", description = "Gets or sets a value indicating whether quick connect is available for use on this server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("QuickConnectAvailable")
  public Boolean getQuickConnectAvailable() {
    return quickConnectAvailable;
  }

  public void setQuickConnectAvailable(Boolean quickConnectAvailable) {
    this.quickConnectAvailable = quickConnectAvailable;
  }

  public ServerConfiguration remoteClientBitrateLimit(Integer remoteClientBitrateLimit) {
    this.remoteClientBitrateLimit = remoteClientBitrateLimit;
    return this;
  }

  /**
   * Get remoteClientBitrateLimit
   * @return remoteClientBitrateLimit
  */
  
  @Schema(name = "RemoteClientBitrateLimit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemoteClientBitrateLimit")
  public Integer getRemoteClientBitrateLimit() {
    return remoteClientBitrateLimit;
  }

  public void setRemoteClientBitrateLimit(Integer remoteClientBitrateLimit) {
    this.remoteClientBitrateLimit = remoteClientBitrateLimit;
  }

  public ServerConfiguration remoteIPFilter(List<String> remoteIPFilter) {
    this.remoteIPFilter = JsonNullable.of(remoteIPFilter);
    return this;
  }

  public ServerConfiguration addRemoteIPFilterItem(String remoteIPFilterItem) {
    if (this.remoteIPFilter == null || !this.remoteIPFilter.isPresent()) {
      this.remoteIPFilter = JsonNullable.of(new ArrayList<>());
    }
    this.remoteIPFilter.get().add(remoteIPFilterItem);
    return this;
  }

  /**
   * Gets or sets the filter for remote IP connectivity. Used in conjuntion with <seealso cref=\"P:MediaBrowser.Model.Configuration.ServerConfiguration.IsRemoteIPFilterBlacklist\" />.
   * @return remoteIPFilter
  */
  
  @Schema(name = "RemoteIPFilter", description = "Gets or sets the filter for remote IP connectivity. Used in conjuntion with <seealso cref=\"P:MediaBrowser.Model.Configuration.ServerConfiguration.IsRemoteIPFilterBlacklist\" />.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemoteIPFilter")
  public JsonNullable<List<String>> getRemoteIPFilter() {
    return remoteIPFilter;
  }

  public void setRemoteIPFilter(JsonNullable<List<String>> remoteIPFilter) {
    this.remoteIPFilter = remoteIPFilter;
  }

  public ServerConfiguration removeOldPlugins(Boolean removeOldPlugins) {
    this.removeOldPlugins = removeOldPlugins;
    return this;
  }

  /**
   * Gets or sets a value indicating whether older plugins should automatically be deleted from the plugin folder.
   * @return removeOldPlugins
  */
  
  @Schema(name = "RemoveOldPlugins", description = "Gets or sets a value indicating whether older plugins should automatically be deleted from the plugin folder.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemoveOldPlugins")
  public Boolean getRemoveOldPlugins() {
    return removeOldPlugins;
  }

  public void setRemoveOldPlugins(Boolean removeOldPlugins) {
    this.removeOldPlugins = removeOldPlugins;
  }

  public ServerConfiguration requireHttps(Boolean requireHttps) {
    this.requireHttps = requireHttps;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the server should force connections over HTTPS.
   * @return requireHttps
  */
  
  @Schema(name = "RequireHttps", description = "Gets or sets a value indicating whether the server should force connections over HTTPS.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequireHttps")
  public Boolean getRequireHttps() {
    return requireHttps;
  }

  public void setRequireHttps(Boolean requireHttps) {
    this.requireHttps = requireHttps;
  }

  public ServerConfiguration ssDPTracingFilter(String ssDPTracingFilter) {
    this.ssDPTracingFilter = JsonNullable.of(ssDPTracingFilter);
    return this;
  }

  /**
   * Gets or sets a value indicating whether an IP address is to be used to filter the detailed ssdp logs that are being sent to the console/log.  If the setting \"Emby.Dlna\": \"Debug\" msut be set in logging.default.json for this property to work.
   * @return ssDPTracingFilter
  */
  
  @Schema(name = "SSDPTracingFilter", description = "Gets or sets a value indicating whether an IP address is to be used to filter the detailed ssdp logs that are being sent to the console/log.  If the setting \"Emby.Dlna\": \"Debug\" msut be set in logging.default.json for this property to work.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SSDPTracingFilter")
  public JsonNullable<String> getSsDPTracingFilter() {
    return ssDPTracingFilter;
  }

  public void setSsDPTracingFilter(JsonNullable<String> ssDPTracingFilter) {
    this.ssDPTracingFilter = ssDPTracingFilter;
  }

  public ServerConfiguration saveMetadataHidden(Boolean saveMetadataHidden) {
    this.saveMetadataHidden = saveMetadataHidden;
    return this;
  }

  /**
   * Get saveMetadataHidden
   * @return saveMetadataHidden
  */
  
  @Schema(name = "SaveMetadataHidden", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SaveMetadataHidden")
  public Boolean getSaveMetadataHidden() {
    return saveMetadataHidden;
  }

  public void setSaveMetadataHidden(Boolean saveMetadataHidden) {
    this.saveMetadataHidden = saveMetadataHidden;
  }

  public ServerConfiguration serverName(String serverName) {
    this.serverName = JsonNullable.of(serverName);
    return this;
  }

  /**
   * Get serverName
   * @return serverName
  */
  
  @Schema(name = "ServerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerName")
  public JsonNullable<String> getServerName() {
    return serverName;
  }

  public void setServerName(JsonNullable<String> serverName) {
    this.serverName = serverName;
  }

  public ServerConfiguration skipDeserializationForBasicTypes(Boolean skipDeserializationForBasicTypes) {
    this.skipDeserializationForBasicTypes = skipDeserializationForBasicTypes;
    return this;
  }

  /**
   * Get skipDeserializationForBasicTypes
   * @return skipDeserializationForBasicTypes
  */
  
  @Schema(name = "SkipDeserializationForBasicTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SkipDeserializationForBasicTypes")
  public Boolean getSkipDeserializationForBasicTypes() {
    return skipDeserializationForBasicTypes;
  }

  public void setSkipDeserializationForBasicTypes(Boolean skipDeserializationForBasicTypes) {
    this.skipDeserializationForBasicTypes = skipDeserializationForBasicTypes;
  }

  public ServerConfiguration slowResponseThresholdMs(Long slowResponseThresholdMs) {
    this.slowResponseThresholdMs = slowResponseThresholdMs;
    return this;
  }

  /**
   * Gets or sets the threshold for the slow response time warning in ms.
   * @return slowResponseThresholdMs
  */
  
  @Schema(name = "SlowResponseThresholdMs", description = "Gets or sets the threshold for the slow response time warning in ms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SlowResponseThresholdMs")
  public Long getSlowResponseThresholdMs() {
    return slowResponseThresholdMs;
  }

  public void setSlowResponseThresholdMs(Long slowResponseThresholdMs) {
    this.slowResponseThresholdMs = slowResponseThresholdMs;
  }

  public ServerConfiguration sortRemoveCharacters(List<String> sortRemoveCharacters) {
    this.sortRemoveCharacters = JsonNullable.of(sortRemoveCharacters);
    return this;
  }

  public ServerConfiguration addSortRemoveCharactersItem(String sortRemoveCharactersItem) {
    if (this.sortRemoveCharacters == null || !this.sortRemoveCharacters.isPresent()) {
      this.sortRemoveCharacters = JsonNullable.of(new ArrayList<>());
    }
    this.sortRemoveCharacters.get().add(sortRemoveCharactersItem);
    return this;
  }

  /**
   * Gets or sets characters to be removed from strings to create a sort name.
   * @return sortRemoveCharacters
  */
  
  @Schema(name = "SortRemoveCharacters", description = "Gets or sets characters to be removed from strings to create a sort name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortRemoveCharacters")
  public JsonNullable<List<String>> getSortRemoveCharacters() {
    return sortRemoveCharacters;
  }

  public void setSortRemoveCharacters(JsonNullable<List<String>> sortRemoveCharacters) {
    this.sortRemoveCharacters = sortRemoveCharacters;
  }

  public ServerConfiguration sortRemoveWords(List<String> sortRemoveWords) {
    this.sortRemoveWords = JsonNullable.of(sortRemoveWords);
    return this;
  }

  public ServerConfiguration addSortRemoveWordsItem(String sortRemoveWordsItem) {
    if (this.sortRemoveWords == null || !this.sortRemoveWords.isPresent()) {
      this.sortRemoveWords = JsonNullable.of(new ArrayList<>());
    }
    this.sortRemoveWords.get().add(sortRemoveWordsItem);
    return this;
  }

  /**
   * Gets or sets words to be removed from strings to create a sort name.
   * @return sortRemoveWords
  */
  
  @Schema(name = "SortRemoveWords", description = "Gets or sets words to be removed from strings to create a sort name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortRemoveWords")
  public JsonNullable<List<String>> getSortRemoveWords() {
    return sortRemoveWords;
  }

  public void setSortRemoveWords(JsonNullable<List<String>> sortRemoveWords) {
    this.sortRemoveWords = sortRemoveWords;
  }

  public ServerConfiguration sortReplaceCharacters(List<String> sortReplaceCharacters) {
    this.sortReplaceCharacters = JsonNullable.of(sortReplaceCharacters);
    return this;
  }

  public ServerConfiguration addSortReplaceCharactersItem(String sortReplaceCharactersItem) {
    if (this.sortReplaceCharacters == null || !this.sortReplaceCharacters.isPresent()) {
      this.sortReplaceCharacters = JsonNullable.of(new ArrayList<>());
    }
    this.sortReplaceCharacters.get().add(sortReplaceCharactersItem);
    return this;
  }

  /**
   * Gets or sets characters to be replaced with a ' ' in strings to create a sort name.
   * @return sortReplaceCharacters
  */
  
  @Schema(name = "SortReplaceCharacters", description = "Gets or sets characters to be replaced with a ' ' in strings to create a sort name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SortReplaceCharacters")
  public JsonNullable<List<String>> getSortReplaceCharacters() {
    return sortReplaceCharacters;
  }

  public void setSortReplaceCharacters(JsonNullable<List<String>> sortReplaceCharacters) {
    this.sortReplaceCharacters = sortReplaceCharacters;
  }

  public ServerConfiguration trustAllIP6Interfaces(Boolean trustAllIP6Interfaces) {
    this.trustAllIP6Interfaces = trustAllIP6Interfaces;
    return this;
  }

  /**
   * Gets or sets a value indicating whether all IPv6 interfaces should be treated as on the internal network.  Depending on the address range implemented ULA ranges might not be used.
   * @return trustAllIP6Interfaces
  */
  
  @Schema(name = "TrustAllIP6Interfaces", description = "Gets or sets a value indicating whether all IPv6 interfaces should be treated as on the internal network.  Depending on the address range implemented ULA ranges might not be used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TrustAllIP6Interfaces")
  public Boolean getTrustAllIP6Interfaces() {
    return trustAllIP6Interfaces;
  }

  public void setTrustAllIP6Interfaces(Boolean trustAllIP6Interfaces) {
    this.trustAllIP6Interfaces = trustAllIP6Interfaces;
  }

  public ServerConfiguration udPPortRange(String udPPortRange) {
    this.udPPortRange = JsonNullable.of(udPPortRange);
    return this;
  }

  /**
   * Gets or sets client udp port range.
   * @return udPPortRange
  */
  
  @Schema(name = "UDPPortRange", description = "Gets or sets client udp port range.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UDPPortRange")
  public JsonNullable<String> getUdPPortRange() {
    return udPPortRange;
  }

  public void setUdPPortRange(JsonNullable<String> udPPortRange) {
    this.udPPortRange = udPPortRange;
  }

  public ServerConfiguration udPSendCount(Integer udPSendCount) {
    this.udPSendCount = udPSendCount;
    return this;
  }

  /**
   * Gets or sets the number of times SSDP UDP messages are sent.
   * @return udPSendCount
  */
  
  @Schema(name = "UDPSendCount", description = "Gets or sets the number of times SSDP UDP messages are sent.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UDPSendCount")
  public Integer getUdPSendCount() {
    return udPSendCount;
  }

  public void setUdPSendCount(Integer udPSendCount) {
    this.udPSendCount = udPSendCount;
  }

  public ServerConfiguration udPSendDelay(Integer udPSendDelay) {
    this.udPSendDelay = udPSendDelay;
    return this;
  }

  /**
   * Gets or sets the delay between each groups of SSDP messages (in ms).
   * @return udPSendDelay
  */
  
  @Schema(name = "UDPSendDelay", description = "Gets or sets the delay between each groups of SSDP messages (in ms).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UDPSendDelay")
  public Integer getUdPSendDelay() {
    return udPSendDelay;
  }

  public void setUdPSendDelay(Integer udPSendDelay) {
    this.udPSendDelay = udPSendDelay;
  }

  public ServerConfiguration uiCulture(String uiCulture) {
    this.uiCulture = JsonNullable.of(uiCulture);
    return this;
  }

  /**
   * Get uiCulture
   * @return uiCulture
  */
  
  @Schema(name = "UICulture", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UICulture")
  public JsonNullable<String> getUiCulture() {
    return uiCulture;
  }

  public void setUiCulture(JsonNullable<String> uiCulture) {
    this.uiCulture = uiCulture;
  }

  public ServerConfiguration upnPCreateHttpPortMap(Boolean upnPCreateHttpPortMap) {
    this.upnPCreateHttpPortMap = upnPCreateHttpPortMap;
    return this;
  }

  /**
   * Gets or sets a value indicating whether the http port should be mapped as part of UPnP automatic port forwarding.
   * @return upnPCreateHttpPortMap
  */
  
  @Schema(name = "UPnPCreateHttpPortMap", description = "Gets or sets a value indicating whether the http port should be mapped as part of UPnP automatic port forwarding.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UPnPCreateHttpPortMap")
  public Boolean getUpnPCreateHttpPortMap() {
    return upnPCreateHttpPortMap;
  }

  public void setUpnPCreateHttpPortMap(Boolean upnPCreateHttpPortMap) {
    this.upnPCreateHttpPortMap = upnPCreateHttpPortMap;
  }

  public ServerConfiguration uninstalledPlugins(List<String> uninstalledPlugins) {
    this.uninstalledPlugins = JsonNullable.of(uninstalledPlugins);
    return this;
  }

  public ServerConfiguration addUninstalledPluginsItem(String uninstalledPluginsItem) {
    if (this.uninstalledPlugins == null || !this.uninstalledPlugins.isPresent()) {
      this.uninstalledPlugins = JsonNullable.of(new ArrayList<>());
    }
    this.uninstalledPlugins.get().add(uninstalledPluginsItem);
    return this;
  }

  /**
   * Get uninstalledPlugins
   * @return uninstalledPlugins
  */
  
  @Schema(name = "UninstalledPlugins", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UninstalledPlugins")
  public JsonNullable<List<String>> getUninstalledPlugins() {
    return uninstalledPlugins;
  }

  public void setUninstalledPlugins(JsonNullable<List<String>> uninstalledPlugins) {
    this.uninstalledPlugins = uninstalledPlugins;
  }

  public ServerConfiguration virtualInterfaceNames(String virtualInterfaceNames) {
    this.virtualInterfaceNames = JsonNullable.of(virtualInterfaceNames);
    return this;
  }

  /**
   * Gets or sets a value indicating the interfaces that should be ignored. The list can be comma separated. <seealso cref=\"P:MediaBrowser.Model.Configuration.ServerConfiguration.IgnoreVirtualInterfaces\" />.
   * @return virtualInterfaceNames
  */
  
  @Schema(name = "VirtualInterfaceNames", description = "Gets or sets a value indicating the interfaces that should be ignored. The list can be comma separated. <seealso cref=\"P:MediaBrowser.Model.Configuration.ServerConfiguration.IgnoreVirtualInterfaces\" />.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VirtualInterfaceNames")
  public JsonNullable<String> getVirtualInterfaceNames() {
    return virtualInterfaceNames;
  }

  public void setVirtualInterfaceNames(JsonNullable<String> virtualInterfaceNames) {
    this.virtualInterfaceNames = virtualInterfaceNames;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerConfiguration serverConfiguration = (ServerConfiguration) o;
    return equalsNullable(this.activityLogRetentionDays, serverConfiguration.activityLogRetentionDays) &&
        Objects.equals(this.autoDiscovery, serverConfiguration.autoDiscovery) &&
        Objects.equals(this.autoDiscoveryTracing, serverConfiguration.autoDiscoveryTracing) &&
        equalsNullable(this.baseUrl, serverConfiguration.baseUrl) &&
        equalsNullable(this.cachePath, serverConfiguration.cachePath) &&
        equalsNullable(this.certificatePassword, serverConfiguration.certificatePassword) &&
        equalsNullable(this.certificatePath, serverConfiguration.certificatePath) &&
        equalsNullable(this.codecsUsed, serverConfiguration.codecsUsed) &&
        equalsNullable(this.contentTypes, serverConfiguration.contentTypes) &&
        equalsNullable(this.corsHosts, serverConfiguration.corsHosts) &&
        Objects.equals(this.disableLiveTvChannelUserDataName, serverConfiguration.disableLiveTvChannelUserDataName) &&
        Objects.equals(this.disablePluginImages, serverConfiguration.disablePluginImages) &&
        Objects.equals(this.displaySpecialsWithinSeasons, serverConfiguration.displaySpecialsWithinSeasons) &&
        Objects.equals(this.enableCaseSensitiveItemIds, serverConfiguration.enableCaseSensitiveItemIds) &&
        Objects.equals(this.enableDashboardResponseCaching, serverConfiguration.enableDashboardResponseCaching) &&
        Objects.equals(this.enableExternalContentInSuggestions, serverConfiguration.enableExternalContentInSuggestions) &&
        Objects.equals(this.enableFolderView, serverConfiguration.enableFolderView) &&
        Objects.equals(this.enableGroupingIntoCollections, serverConfiguration.enableGroupingIntoCollections) &&
        Objects.equals(this.enableHttps, serverConfiguration.enableHttps) &&
        Objects.equals(this.enableIPV4, serverConfiguration.enableIPV4) &&
        Objects.equals(this.enableIPV6, serverConfiguration.enableIPV6) &&
        Objects.equals(this.enableMetrics, serverConfiguration.enableMetrics) &&
        Objects.equals(this.enableMultiSocketBinding, serverConfiguration.enableMultiSocketBinding) &&
        Objects.equals(this.enableNewOmdbSupport, serverConfiguration.enableNewOmdbSupport) &&
        Objects.equals(this.enableNormalizedItemByNameIds, serverConfiguration.enableNormalizedItemByNameIds) &&
        Objects.equals(this.enableRemoteAccess, serverConfiguration.enableRemoteAccess) &&
        Objects.equals(this.enableSSDPTracing, serverConfiguration.enableSSDPTracing) &&
        Objects.equals(this.enableSimpleArtistDetection, serverConfiguration.enableSimpleArtistDetection) &&
        Objects.equals(this.enableSlowResponseWarning, serverConfiguration.enableSlowResponseWarning) &&
        Objects.equals(this.enableUPnP, serverConfiguration.enableUPnP) &&
        Objects.equals(this.gatewayMonitorPeriod, serverConfiguration.gatewayMonitorPeriod) &&
        equalsNullable(this.hdHomerunPortRange, serverConfiguration.hdHomerunPortRange) &&
        Objects.equals(this.httpServerPortNumber, serverConfiguration.httpServerPortNumber) &&
        Objects.equals(this.httpsPortNumber, serverConfiguration.httpsPortNumber) &&
        Objects.equals(this.ignoreVirtualInterfaces, serverConfiguration.ignoreVirtualInterfaces) &&
        Objects.equals(this.imageExtractionTimeoutMs, serverConfiguration.imageExtractionTimeoutMs) &&
        Objects.equals(this.imageSavingConvention, serverConfiguration.imageSavingConvention) &&
        Objects.equals(this.isPortAuthorized, serverConfiguration.isPortAuthorized) &&
        Objects.equals(this.isRemoteIPFilterBlacklist, serverConfiguration.isRemoteIPFilterBlacklist) &&
        Objects.equals(this.isStartupWizardCompleted, serverConfiguration.isStartupWizardCompleted) &&
        equalsNullable(this.knownProxies, serverConfiguration.knownProxies) &&
        Objects.equals(this.libraryMetadataRefreshConcurrency, serverConfiguration.libraryMetadataRefreshConcurrency) &&
        Objects.equals(this.libraryMonitorDelay, serverConfiguration.libraryMonitorDelay) &&
        Objects.equals(this.libraryScanFanoutConcurrency, serverConfiguration.libraryScanFanoutConcurrency) &&
        equalsNullable(this.localNetworkAddresses, serverConfiguration.localNetworkAddresses) &&
        equalsNullable(this.localNetworkSubnets, serverConfiguration.localNetworkSubnets) &&
        Objects.equals(this.logFileRetentionDays, serverConfiguration.logFileRetentionDays) &&
        Objects.equals(this.maxAudiobookResume, serverConfiguration.maxAudiobookResume) &&
        Objects.equals(this.maxResumePct, serverConfiguration.maxResumePct) &&
        equalsNullable(this.metadataCountryCode, serverConfiguration.metadataCountryCode) &&
        equalsNullable(this.metadataNetworkPath, serverConfiguration.metadataNetworkPath) &&
        equalsNullable(this.metadataOptions, serverConfiguration.metadataOptions) &&
        equalsNullable(this.metadataPath, serverConfiguration.metadataPath) &&
        Objects.equals(this.minAudiobookResume, serverConfiguration.minAudiobookResume) &&
        Objects.equals(this.minResumeDurationSeconds, serverConfiguration.minResumeDurationSeconds) &&
        Objects.equals(this.minResumePct, serverConfiguration.minResumePct) &&
        equalsNullable(this.pathSubstitutions, serverConfiguration.pathSubstitutions) &&
        equalsNullable(this.pluginRepositories, serverConfiguration.pluginRepositories) &&
        equalsNullable(this.preferredMetadataLanguage, serverConfiguration.preferredMetadataLanguage) &&
        Objects.equals(this.previousVersion, serverConfiguration.previousVersion) &&
        equalsNullable(this.previousVersionStr, serverConfiguration.previousVersionStr) &&
        Objects.equals(this.publicHttpsPort, serverConfiguration.publicHttpsPort) &&
        Objects.equals(this.publicPort, serverConfiguration.publicPort) &&
        equalsNullable(this.publishedServerUriBySubnet, serverConfiguration.publishedServerUriBySubnet) &&
        Objects.equals(this.quickConnectAvailable, serverConfiguration.quickConnectAvailable) &&
        Objects.equals(this.remoteClientBitrateLimit, serverConfiguration.remoteClientBitrateLimit) &&
        equalsNullable(this.remoteIPFilter, serverConfiguration.remoteIPFilter) &&
        Objects.equals(this.removeOldPlugins, serverConfiguration.removeOldPlugins) &&
        Objects.equals(this.requireHttps, serverConfiguration.requireHttps) &&
        equalsNullable(this.ssDPTracingFilter, serverConfiguration.ssDPTracingFilter) &&
        Objects.equals(this.saveMetadataHidden, serverConfiguration.saveMetadataHidden) &&
        equalsNullable(this.serverName, serverConfiguration.serverName) &&
        Objects.equals(this.skipDeserializationForBasicTypes, serverConfiguration.skipDeserializationForBasicTypes) &&
        Objects.equals(this.slowResponseThresholdMs, serverConfiguration.slowResponseThresholdMs) &&
        equalsNullable(this.sortRemoveCharacters, serverConfiguration.sortRemoveCharacters) &&
        equalsNullable(this.sortRemoveWords, serverConfiguration.sortRemoveWords) &&
        equalsNullable(this.sortReplaceCharacters, serverConfiguration.sortReplaceCharacters) &&
        Objects.equals(this.trustAllIP6Interfaces, serverConfiguration.trustAllIP6Interfaces) &&
        equalsNullable(this.udPPortRange, serverConfiguration.udPPortRange) &&
        Objects.equals(this.udPSendCount, serverConfiguration.udPSendCount) &&
        Objects.equals(this.udPSendDelay, serverConfiguration.udPSendDelay) &&
        equalsNullable(this.uiCulture, serverConfiguration.uiCulture) &&
        Objects.equals(this.upnPCreateHttpPortMap, serverConfiguration.upnPCreateHttpPortMap) &&
        equalsNullable(this.uninstalledPlugins, serverConfiguration.uninstalledPlugins) &&
        equalsNullable(this.virtualInterfaceNames, serverConfiguration.virtualInterfaceNames);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(activityLogRetentionDays), autoDiscovery, autoDiscoveryTracing, hashCodeNullable(baseUrl), hashCodeNullable(cachePath), hashCodeNullable(certificatePassword), hashCodeNullable(certificatePath), hashCodeNullable(codecsUsed), hashCodeNullable(contentTypes), hashCodeNullable(corsHosts), disableLiveTvChannelUserDataName, disablePluginImages, displaySpecialsWithinSeasons, enableCaseSensitiveItemIds, enableDashboardResponseCaching, enableExternalContentInSuggestions, enableFolderView, enableGroupingIntoCollections, enableHttps, enableIPV4, enableIPV6, enableMetrics, enableMultiSocketBinding, enableNewOmdbSupport, enableNormalizedItemByNameIds, enableRemoteAccess, enableSSDPTracing, enableSimpleArtistDetection, enableSlowResponseWarning, enableUPnP, gatewayMonitorPeriod, hashCodeNullable(hdHomerunPortRange), httpServerPortNumber, httpsPortNumber, ignoreVirtualInterfaces, imageExtractionTimeoutMs, imageSavingConvention, isPortAuthorized, isRemoteIPFilterBlacklist, isStartupWizardCompleted, hashCodeNullable(knownProxies), libraryMetadataRefreshConcurrency, libraryMonitorDelay, libraryScanFanoutConcurrency, hashCodeNullable(localNetworkAddresses), hashCodeNullable(localNetworkSubnets), logFileRetentionDays, maxAudiobookResume, maxResumePct, hashCodeNullable(metadataCountryCode), hashCodeNullable(metadataNetworkPath), hashCodeNullable(metadataOptions), hashCodeNullable(metadataPath), minAudiobookResume, minResumeDurationSeconds, minResumePct, hashCodeNullable(pathSubstitutions), hashCodeNullable(pluginRepositories), hashCodeNullable(preferredMetadataLanguage), previousVersion, hashCodeNullable(previousVersionStr), publicHttpsPort, publicPort, hashCodeNullable(publishedServerUriBySubnet), quickConnectAvailable, remoteClientBitrateLimit, hashCodeNullable(remoteIPFilter), removeOldPlugins, requireHttps, hashCodeNullable(ssDPTracingFilter), saveMetadataHidden, hashCodeNullable(serverName), skipDeserializationForBasicTypes, slowResponseThresholdMs, hashCodeNullable(sortRemoveCharacters), hashCodeNullable(sortRemoveWords), hashCodeNullable(sortReplaceCharacters), trustAllIP6Interfaces, hashCodeNullable(udPPortRange), udPSendCount, udPSendDelay, hashCodeNullable(uiCulture), upnPCreateHttpPortMap, hashCodeNullable(uninstalledPlugins), hashCodeNullable(virtualInterfaceNames));
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
    sb.append("class ServerConfiguration {\n");
    sb.append("    activityLogRetentionDays: ").append(toIndentedString(activityLogRetentionDays)).append("\n");
    sb.append("    autoDiscovery: ").append(toIndentedString(autoDiscovery)).append("\n");
    sb.append("    autoDiscoveryTracing: ").append(toIndentedString(autoDiscoveryTracing)).append("\n");
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
    sb.append("    cachePath: ").append(toIndentedString(cachePath)).append("\n");
    sb.append("    certificatePassword: ").append(toIndentedString(certificatePassword)).append("\n");
    sb.append("    certificatePath: ").append(toIndentedString(certificatePath)).append("\n");
    sb.append("    codecsUsed: ").append(toIndentedString(codecsUsed)).append("\n");
    sb.append("    contentTypes: ").append(toIndentedString(contentTypes)).append("\n");
    sb.append("    corsHosts: ").append(toIndentedString(corsHosts)).append("\n");
    sb.append("    disableLiveTvChannelUserDataName: ").append(toIndentedString(disableLiveTvChannelUserDataName)).append("\n");
    sb.append("    disablePluginImages: ").append(toIndentedString(disablePluginImages)).append("\n");
    sb.append("    displaySpecialsWithinSeasons: ").append(toIndentedString(displaySpecialsWithinSeasons)).append("\n");
    sb.append("    enableCaseSensitiveItemIds: ").append(toIndentedString(enableCaseSensitiveItemIds)).append("\n");
    sb.append("    enableDashboardResponseCaching: ").append(toIndentedString(enableDashboardResponseCaching)).append("\n");
    sb.append("    enableExternalContentInSuggestions: ").append(toIndentedString(enableExternalContentInSuggestions)).append("\n");
    sb.append("    enableFolderView: ").append(toIndentedString(enableFolderView)).append("\n");
    sb.append("    enableGroupingIntoCollections: ").append(toIndentedString(enableGroupingIntoCollections)).append("\n");
    sb.append("    enableHttps: ").append(toIndentedString(enableHttps)).append("\n");
    sb.append("    enableIPV4: ").append(toIndentedString(enableIPV4)).append("\n");
    sb.append("    enableIPV6: ").append(toIndentedString(enableIPV6)).append("\n");
    sb.append("    enableMetrics: ").append(toIndentedString(enableMetrics)).append("\n");
    sb.append("    enableMultiSocketBinding: ").append(toIndentedString(enableMultiSocketBinding)).append("\n");
    sb.append("    enableNewOmdbSupport: ").append(toIndentedString(enableNewOmdbSupport)).append("\n");
    sb.append("    enableNormalizedItemByNameIds: ").append(toIndentedString(enableNormalizedItemByNameIds)).append("\n");
    sb.append("    enableRemoteAccess: ").append(toIndentedString(enableRemoteAccess)).append("\n");
    sb.append("    enableSSDPTracing: ").append(toIndentedString(enableSSDPTracing)).append("\n");
    sb.append("    enableSimpleArtistDetection: ").append(toIndentedString(enableSimpleArtistDetection)).append("\n");
    sb.append("    enableSlowResponseWarning: ").append(toIndentedString(enableSlowResponseWarning)).append("\n");
    sb.append("    enableUPnP: ").append(toIndentedString(enableUPnP)).append("\n");
    sb.append("    gatewayMonitorPeriod: ").append(toIndentedString(gatewayMonitorPeriod)).append("\n");
    sb.append("    hdHomerunPortRange: ").append(toIndentedString(hdHomerunPortRange)).append("\n");
    sb.append("    httpServerPortNumber: ").append(toIndentedString(httpServerPortNumber)).append("\n");
    sb.append("    httpsPortNumber: ").append(toIndentedString(httpsPortNumber)).append("\n");
    sb.append("    ignoreVirtualInterfaces: ").append(toIndentedString(ignoreVirtualInterfaces)).append("\n");
    sb.append("    imageExtractionTimeoutMs: ").append(toIndentedString(imageExtractionTimeoutMs)).append("\n");
    sb.append("    imageSavingConvention: ").append(toIndentedString(imageSavingConvention)).append("\n");
    sb.append("    isPortAuthorized: ").append(toIndentedString(isPortAuthorized)).append("\n");
    sb.append("    isRemoteIPFilterBlacklist: ").append(toIndentedString(isRemoteIPFilterBlacklist)).append("\n");
    sb.append("    isStartupWizardCompleted: ").append(toIndentedString(isStartupWizardCompleted)).append("\n");
    sb.append("    knownProxies: ").append(toIndentedString(knownProxies)).append("\n");
    sb.append("    libraryMetadataRefreshConcurrency: ").append(toIndentedString(libraryMetadataRefreshConcurrency)).append("\n");
    sb.append("    libraryMonitorDelay: ").append(toIndentedString(libraryMonitorDelay)).append("\n");
    sb.append("    libraryScanFanoutConcurrency: ").append(toIndentedString(libraryScanFanoutConcurrency)).append("\n");
    sb.append("    localNetworkAddresses: ").append(toIndentedString(localNetworkAddresses)).append("\n");
    sb.append("    localNetworkSubnets: ").append(toIndentedString(localNetworkSubnets)).append("\n");
    sb.append("    logFileRetentionDays: ").append(toIndentedString(logFileRetentionDays)).append("\n");
    sb.append("    maxAudiobookResume: ").append(toIndentedString(maxAudiobookResume)).append("\n");
    sb.append("    maxResumePct: ").append(toIndentedString(maxResumePct)).append("\n");
    sb.append("    metadataCountryCode: ").append(toIndentedString(metadataCountryCode)).append("\n");
    sb.append("    metadataNetworkPath: ").append(toIndentedString(metadataNetworkPath)).append("\n");
    sb.append("    metadataOptions: ").append(toIndentedString(metadataOptions)).append("\n");
    sb.append("    metadataPath: ").append(toIndentedString(metadataPath)).append("\n");
    sb.append("    minAudiobookResume: ").append(toIndentedString(minAudiobookResume)).append("\n");
    sb.append("    minResumeDurationSeconds: ").append(toIndentedString(minResumeDurationSeconds)).append("\n");
    sb.append("    minResumePct: ").append(toIndentedString(minResumePct)).append("\n");
    sb.append("    pathSubstitutions: ").append(toIndentedString(pathSubstitutions)).append("\n");
    sb.append("    pluginRepositories: ").append(toIndentedString(pluginRepositories)).append("\n");
    sb.append("    preferredMetadataLanguage: ").append(toIndentedString(preferredMetadataLanguage)).append("\n");
    sb.append("    previousVersion: ").append(toIndentedString(previousVersion)).append("\n");
    sb.append("    previousVersionStr: ").append(toIndentedString(previousVersionStr)).append("\n");
    sb.append("    publicHttpsPort: ").append(toIndentedString(publicHttpsPort)).append("\n");
    sb.append("    publicPort: ").append(toIndentedString(publicPort)).append("\n");
    sb.append("    publishedServerUriBySubnet: ").append(toIndentedString(publishedServerUriBySubnet)).append("\n");
    sb.append("    quickConnectAvailable: ").append(toIndentedString(quickConnectAvailable)).append("\n");
    sb.append("    remoteClientBitrateLimit: ").append(toIndentedString(remoteClientBitrateLimit)).append("\n");
    sb.append("    remoteIPFilter: ").append(toIndentedString(remoteIPFilter)).append("\n");
    sb.append("    removeOldPlugins: ").append(toIndentedString(removeOldPlugins)).append("\n");
    sb.append("    requireHttps: ").append(toIndentedString(requireHttps)).append("\n");
    sb.append("    ssDPTracingFilter: ").append(toIndentedString(ssDPTracingFilter)).append("\n");
    sb.append("    saveMetadataHidden: ").append(toIndentedString(saveMetadataHidden)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    skipDeserializationForBasicTypes: ").append(toIndentedString(skipDeserializationForBasicTypes)).append("\n");
    sb.append("    slowResponseThresholdMs: ").append(toIndentedString(slowResponseThresholdMs)).append("\n");
    sb.append("    sortRemoveCharacters: ").append(toIndentedString(sortRemoveCharacters)).append("\n");
    sb.append("    sortRemoveWords: ").append(toIndentedString(sortRemoveWords)).append("\n");
    sb.append("    sortReplaceCharacters: ").append(toIndentedString(sortReplaceCharacters)).append("\n");
    sb.append("    trustAllIP6Interfaces: ").append(toIndentedString(trustAllIP6Interfaces)).append("\n");
    sb.append("    udPPortRange: ").append(toIndentedString(udPPortRange)).append("\n");
    sb.append("    udPSendCount: ").append(toIndentedString(udPSendCount)).append("\n");
    sb.append("    udPSendDelay: ").append(toIndentedString(udPSendDelay)).append("\n");
    sb.append("    uiCulture: ").append(toIndentedString(uiCulture)).append("\n");
    sb.append("    upnPCreateHttpPortMap: ").append(toIndentedString(upnPCreateHttpPortMap)).append("\n");
    sb.append("    uninstalledPlugins: ").append(toIndentedString(uninstalledPlugins)).append("\n");
    sb.append("    virtualInterfaceNames: ").append(toIndentedString(virtualInterfaceNames)).append("\n");
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

