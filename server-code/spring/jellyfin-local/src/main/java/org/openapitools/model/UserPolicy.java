package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AccessSchedule;
import org.openapitools.model.SyncPlayUserAccessType;
import org.openapitools.model.UnratedItem;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UserPolicy
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class UserPolicy {

  @Valid
  private JsonNullable<List<@Valid AccessSchedule>> accessSchedules = JsonNullable.<List<@Valid AccessSchedule>>undefined();

  private JsonNullable<String> authenticationProviderId = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid UnratedItem>> blockUnratedItems = JsonNullable.<List<@Valid UnratedItem>>undefined();

  @Valid
  private JsonNullable<List<UUID>> blockedChannels = JsonNullable.<List<UUID>>undefined();

  @Valid
  private JsonNullable<List<UUID>> blockedMediaFolders = JsonNullable.<List<UUID>>undefined();

  @Valid
  private JsonNullable<List<String>> blockedTags = JsonNullable.<List<String>>undefined();

  private Boolean enableAllChannels;

  private Boolean enableAllDevices;

  private Boolean enableAllFolders;

  private Boolean enableAudioPlaybackTranscoding;

  private Boolean enableContentDeletion;

  @Valid
  private JsonNullable<List<String>> enableContentDeletionFromFolders = JsonNullable.<List<String>>undefined();

  private Boolean enableContentDownloading;

  private Boolean enableLiveTvAccess;

  private Boolean enableLiveTvManagement;

  private Boolean enableMediaConversion;

  private Boolean enableMediaPlayback;

  private Boolean enablePlaybackRemuxing;

  private Boolean enablePublicSharing;

  private Boolean enableRemoteAccess;

  private Boolean enableRemoteControlOfOtherUsers;

  private Boolean enableSharedDeviceControl;

  private Boolean enableSyncTranscoding;

  private Boolean enableUserPreferenceAccess;

  private Boolean enableVideoPlaybackTranscoding;

  @Valid
  private JsonNullable<List<UUID>> enabledChannels = JsonNullable.<List<UUID>>undefined();

  @Valid
  private JsonNullable<List<String>> enabledDevices = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<UUID>> enabledFolders = JsonNullable.<List<UUID>>undefined();

  private Boolean forceRemoteSourceTranscoding;

  private Integer invalidLoginAttemptCount;

  private Boolean isAdministrator;

  private Boolean isDisabled;

  private Boolean isHidden;

  private Integer loginAttemptsBeforeLockout;

  private Integer maxActiveSessions;

  private JsonNullable<Integer> maxParentalRating = JsonNullable.<Integer>undefined();

  private JsonNullable<String> passwordResetProviderId = JsonNullable.<String>undefined();

  private Integer remoteClientBitrateLimit;

  private SyncPlayUserAccessType syncPlayAccess;

  public UserPolicy accessSchedules(List<@Valid AccessSchedule> accessSchedules) {
    this.accessSchedules = JsonNullable.of(accessSchedules);
    return this;
  }

  public UserPolicy addAccessSchedulesItem(AccessSchedule accessSchedulesItem) {
    if (this.accessSchedules == null || !this.accessSchedules.isPresent()) {
      this.accessSchedules = JsonNullable.of(new ArrayList<>());
    }
    this.accessSchedules.get().add(accessSchedulesItem);
    return this;
  }

  /**
   * Get accessSchedules
   * @return accessSchedules
  */
  @Valid 
  @Schema(name = "AccessSchedules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AccessSchedules")
  public JsonNullable<List<@Valid AccessSchedule>> getAccessSchedules() {
    return accessSchedules;
  }

  public void setAccessSchedules(JsonNullable<List<@Valid AccessSchedule>> accessSchedules) {
    this.accessSchedules = accessSchedules;
  }

  public UserPolicy authenticationProviderId(String authenticationProviderId) {
    this.authenticationProviderId = JsonNullable.of(authenticationProviderId);
    return this;
  }

  /**
   * Get authenticationProviderId
   * @return authenticationProviderId
  */
  
  @Schema(name = "AuthenticationProviderId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AuthenticationProviderId")
  public JsonNullable<String> getAuthenticationProviderId() {
    return authenticationProviderId;
  }

  public void setAuthenticationProviderId(JsonNullable<String> authenticationProviderId) {
    this.authenticationProviderId = authenticationProviderId;
  }

  public UserPolicy blockUnratedItems(List<@Valid UnratedItem> blockUnratedItems) {
    this.blockUnratedItems = JsonNullable.of(blockUnratedItems);
    return this;
  }

  public UserPolicy addBlockUnratedItemsItem(UnratedItem blockUnratedItemsItem) {
    if (this.blockUnratedItems == null || !this.blockUnratedItems.isPresent()) {
      this.blockUnratedItems = JsonNullable.of(new ArrayList<>());
    }
    this.blockUnratedItems.get().add(blockUnratedItemsItem);
    return this;
  }

  /**
   * Get blockUnratedItems
   * @return blockUnratedItems
  */
  @Valid 
  @Schema(name = "BlockUnratedItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlockUnratedItems")
  public JsonNullable<List<@Valid UnratedItem>> getBlockUnratedItems() {
    return blockUnratedItems;
  }

  public void setBlockUnratedItems(JsonNullable<List<@Valid UnratedItem>> blockUnratedItems) {
    this.blockUnratedItems = blockUnratedItems;
  }

  public UserPolicy blockedChannels(List<UUID> blockedChannels) {
    this.blockedChannels = JsonNullable.of(blockedChannels);
    return this;
  }

  public UserPolicy addBlockedChannelsItem(UUID blockedChannelsItem) {
    if (this.blockedChannels == null || !this.blockedChannels.isPresent()) {
      this.blockedChannels = JsonNullable.of(new ArrayList<>());
    }
    this.blockedChannels.get().add(blockedChannelsItem);
    return this;
  }

  /**
   * Get blockedChannels
   * @return blockedChannels
  */
  @Valid 
  @Schema(name = "BlockedChannels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlockedChannels")
  public JsonNullable<List<UUID>> getBlockedChannels() {
    return blockedChannels;
  }

  public void setBlockedChannels(JsonNullable<List<UUID>> blockedChannels) {
    this.blockedChannels = blockedChannels;
  }

  public UserPolicy blockedMediaFolders(List<UUID> blockedMediaFolders) {
    this.blockedMediaFolders = JsonNullable.of(blockedMediaFolders);
    return this;
  }

  public UserPolicy addBlockedMediaFoldersItem(UUID blockedMediaFoldersItem) {
    if (this.blockedMediaFolders == null || !this.blockedMediaFolders.isPresent()) {
      this.blockedMediaFolders = JsonNullable.of(new ArrayList<>());
    }
    this.blockedMediaFolders.get().add(blockedMediaFoldersItem);
    return this;
  }

  /**
   * Get blockedMediaFolders
   * @return blockedMediaFolders
  */
  @Valid 
  @Schema(name = "BlockedMediaFolders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlockedMediaFolders")
  public JsonNullable<List<UUID>> getBlockedMediaFolders() {
    return blockedMediaFolders;
  }

  public void setBlockedMediaFolders(JsonNullable<List<UUID>> blockedMediaFolders) {
    this.blockedMediaFolders = blockedMediaFolders;
  }

  public UserPolicy blockedTags(List<String> blockedTags) {
    this.blockedTags = JsonNullable.of(blockedTags);
    return this;
  }

  public UserPolicy addBlockedTagsItem(String blockedTagsItem) {
    if (this.blockedTags == null || !this.blockedTags.isPresent()) {
      this.blockedTags = JsonNullable.of(new ArrayList<>());
    }
    this.blockedTags.get().add(blockedTagsItem);
    return this;
  }

  /**
   * Get blockedTags
   * @return blockedTags
  */
  
  @Schema(name = "BlockedTags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BlockedTags")
  public JsonNullable<List<String>> getBlockedTags() {
    return blockedTags;
  }

  public void setBlockedTags(JsonNullable<List<String>> blockedTags) {
    this.blockedTags = blockedTags;
  }

  public UserPolicy enableAllChannels(Boolean enableAllChannels) {
    this.enableAllChannels = enableAllChannels;
    return this;
  }

  /**
   * Get enableAllChannels
   * @return enableAllChannels
  */
  
  @Schema(name = "EnableAllChannels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableAllChannels")
  public Boolean getEnableAllChannels() {
    return enableAllChannels;
  }

  public void setEnableAllChannels(Boolean enableAllChannels) {
    this.enableAllChannels = enableAllChannels;
  }

  public UserPolicy enableAllDevices(Boolean enableAllDevices) {
    this.enableAllDevices = enableAllDevices;
    return this;
  }

  /**
   * Get enableAllDevices
   * @return enableAllDevices
  */
  
  @Schema(name = "EnableAllDevices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableAllDevices")
  public Boolean getEnableAllDevices() {
    return enableAllDevices;
  }

  public void setEnableAllDevices(Boolean enableAllDevices) {
    this.enableAllDevices = enableAllDevices;
  }

  public UserPolicy enableAllFolders(Boolean enableAllFolders) {
    this.enableAllFolders = enableAllFolders;
    return this;
  }

  /**
   * Get enableAllFolders
   * @return enableAllFolders
  */
  
  @Schema(name = "EnableAllFolders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableAllFolders")
  public Boolean getEnableAllFolders() {
    return enableAllFolders;
  }

  public void setEnableAllFolders(Boolean enableAllFolders) {
    this.enableAllFolders = enableAllFolders;
  }

  public UserPolicy enableAudioPlaybackTranscoding(Boolean enableAudioPlaybackTranscoding) {
    this.enableAudioPlaybackTranscoding = enableAudioPlaybackTranscoding;
    return this;
  }

  /**
   * Get enableAudioPlaybackTranscoding
   * @return enableAudioPlaybackTranscoding
  */
  
  @Schema(name = "EnableAudioPlaybackTranscoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableAudioPlaybackTranscoding")
  public Boolean getEnableAudioPlaybackTranscoding() {
    return enableAudioPlaybackTranscoding;
  }

  public void setEnableAudioPlaybackTranscoding(Boolean enableAudioPlaybackTranscoding) {
    this.enableAudioPlaybackTranscoding = enableAudioPlaybackTranscoding;
  }

  public UserPolicy enableContentDeletion(Boolean enableContentDeletion) {
    this.enableContentDeletion = enableContentDeletion;
    return this;
  }

  /**
   * Get enableContentDeletion
   * @return enableContentDeletion
  */
  
  @Schema(name = "EnableContentDeletion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableContentDeletion")
  public Boolean getEnableContentDeletion() {
    return enableContentDeletion;
  }

  public void setEnableContentDeletion(Boolean enableContentDeletion) {
    this.enableContentDeletion = enableContentDeletion;
  }

  public UserPolicy enableContentDeletionFromFolders(List<String> enableContentDeletionFromFolders) {
    this.enableContentDeletionFromFolders = JsonNullable.of(enableContentDeletionFromFolders);
    return this;
  }

  public UserPolicy addEnableContentDeletionFromFoldersItem(String enableContentDeletionFromFoldersItem) {
    if (this.enableContentDeletionFromFolders == null || !this.enableContentDeletionFromFolders.isPresent()) {
      this.enableContentDeletionFromFolders = JsonNullable.of(new ArrayList<>());
    }
    this.enableContentDeletionFromFolders.get().add(enableContentDeletionFromFoldersItem);
    return this;
  }

  /**
   * Get enableContentDeletionFromFolders
   * @return enableContentDeletionFromFolders
  */
  
  @Schema(name = "EnableContentDeletionFromFolders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableContentDeletionFromFolders")
  public JsonNullable<List<String>> getEnableContentDeletionFromFolders() {
    return enableContentDeletionFromFolders;
  }

  public void setEnableContentDeletionFromFolders(JsonNullable<List<String>> enableContentDeletionFromFolders) {
    this.enableContentDeletionFromFolders = enableContentDeletionFromFolders;
  }

  public UserPolicy enableContentDownloading(Boolean enableContentDownloading) {
    this.enableContentDownloading = enableContentDownloading;
    return this;
  }

  /**
   * Get enableContentDownloading
   * @return enableContentDownloading
  */
  
  @Schema(name = "EnableContentDownloading", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableContentDownloading")
  public Boolean getEnableContentDownloading() {
    return enableContentDownloading;
  }

  public void setEnableContentDownloading(Boolean enableContentDownloading) {
    this.enableContentDownloading = enableContentDownloading;
  }

  public UserPolicy enableLiveTvAccess(Boolean enableLiveTvAccess) {
    this.enableLiveTvAccess = enableLiveTvAccess;
    return this;
  }

  /**
   * Get enableLiveTvAccess
   * @return enableLiveTvAccess
  */
  
  @Schema(name = "EnableLiveTvAccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableLiveTvAccess")
  public Boolean getEnableLiveTvAccess() {
    return enableLiveTvAccess;
  }

  public void setEnableLiveTvAccess(Boolean enableLiveTvAccess) {
    this.enableLiveTvAccess = enableLiveTvAccess;
  }

  public UserPolicy enableLiveTvManagement(Boolean enableLiveTvManagement) {
    this.enableLiveTvManagement = enableLiveTvManagement;
    return this;
  }

  /**
   * Get enableLiveTvManagement
   * @return enableLiveTvManagement
  */
  
  @Schema(name = "EnableLiveTvManagement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableLiveTvManagement")
  public Boolean getEnableLiveTvManagement() {
    return enableLiveTvManagement;
  }

  public void setEnableLiveTvManagement(Boolean enableLiveTvManagement) {
    this.enableLiveTvManagement = enableLiveTvManagement;
  }

  public UserPolicy enableMediaConversion(Boolean enableMediaConversion) {
    this.enableMediaConversion = enableMediaConversion;
    return this;
  }

  /**
   * Get enableMediaConversion
   * @return enableMediaConversion
  */
  
  @Schema(name = "EnableMediaConversion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableMediaConversion")
  public Boolean getEnableMediaConversion() {
    return enableMediaConversion;
  }

  public void setEnableMediaConversion(Boolean enableMediaConversion) {
    this.enableMediaConversion = enableMediaConversion;
  }

  public UserPolicy enableMediaPlayback(Boolean enableMediaPlayback) {
    this.enableMediaPlayback = enableMediaPlayback;
    return this;
  }

  /**
   * Get enableMediaPlayback
   * @return enableMediaPlayback
  */
  
  @Schema(name = "EnableMediaPlayback", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableMediaPlayback")
  public Boolean getEnableMediaPlayback() {
    return enableMediaPlayback;
  }

  public void setEnableMediaPlayback(Boolean enableMediaPlayback) {
    this.enableMediaPlayback = enableMediaPlayback;
  }

  public UserPolicy enablePlaybackRemuxing(Boolean enablePlaybackRemuxing) {
    this.enablePlaybackRemuxing = enablePlaybackRemuxing;
    return this;
  }

  /**
   * Get enablePlaybackRemuxing
   * @return enablePlaybackRemuxing
  */
  
  @Schema(name = "EnablePlaybackRemuxing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnablePlaybackRemuxing")
  public Boolean getEnablePlaybackRemuxing() {
    return enablePlaybackRemuxing;
  }

  public void setEnablePlaybackRemuxing(Boolean enablePlaybackRemuxing) {
    this.enablePlaybackRemuxing = enablePlaybackRemuxing;
  }

  public UserPolicy enablePublicSharing(Boolean enablePublicSharing) {
    this.enablePublicSharing = enablePublicSharing;
    return this;
  }

  /**
   * Get enablePublicSharing
   * @return enablePublicSharing
  */
  
  @Schema(name = "EnablePublicSharing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnablePublicSharing")
  public Boolean getEnablePublicSharing() {
    return enablePublicSharing;
  }

  public void setEnablePublicSharing(Boolean enablePublicSharing) {
    this.enablePublicSharing = enablePublicSharing;
  }

  public UserPolicy enableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
    return this;
  }

  /**
   * Get enableRemoteAccess
   * @return enableRemoteAccess
  */
  
  @Schema(name = "EnableRemoteAccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableRemoteAccess")
  public Boolean getEnableRemoteAccess() {
    return enableRemoteAccess;
  }

  public void setEnableRemoteAccess(Boolean enableRemoteAccess) {
    this.enableRemoteAccess = enableRemoteAccess;
  }

  public UserPolicy enableRemoteControlOfOtherUsers(Boolean enableRemoteControlOfOtherUsers) {
    this.enableRemoteControlOfOtherUsers = enableRemoteControlOfOtherUsers;
    return this;
  }

  /**
   * Get enableRemoteControlOfOtherUsers
   * @return enableRemoteControlOfOtherUsers
  */
  
  @Schema(name = "EnableRemoteControlOfOtherUsers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableRemoteControlOfOtherUsers")
  public Boolean getEnableRemoteControlOfOtherUsers() {
    return enableRemoteControlOfOtherUsers;
  }

  public void setEnableRemoteControlOfOtherUsers(Boolean enableRemoteControlOfOtherUsers) {
    this.enableRemoteControlOfOtherUsers = enableRemoteControlOfOtherUsers;
  }

  public UserPolicy enableSharedDeviceControl(Boolean enableSharedDeviceControl) {
    this.enableSharedDeviceControl = enableSharedDeviceControl;
    return this;
  }

  /**
   * Get enableSharedDeviceControl
   * @return enableSharedDeviceControl
  */
  
  @Schema(name = "EnableSharedDeviceControl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableSharedDeviceControl")
  public Boolean getEnableSharedDeviceControl() {
    return enableSharedDeviceControl;
  }

  public void setEnableSharedDeviceControl(Boolean enableSharedDeviceControl) {
    this.enableSharedDeviceControl = enableSharedDeviceControl;
  }

  public UserPolicy enableSyncTranscoding(Boolean enableSyncTranscoding) {
    this.enableSyncTranscoding = enableSyncTranscoding;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [enable synchronize].
   * @return enableSyncTranscoding
  */
  
  @Schema(name = "EnableSyncTranscoding", description = "Gets or sets a value indicating whether [enable synchronize].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableSyncTranscoding")
  public Boolean getEnableSyncTranscoding() {
    return enableSyncTranscoding;
  }

  public void setEnableSyncTranscoding(Boolean enableSyncTranscoding) {
    this.enableSyncTranscoding = enableSyncTranscoding;
  }

  public UserPolicy enableUserPreferenceAccess(Boolean enableUserPreferenceAccess) {
    this.enableUserPreferenceAccess = enableUserPreferenceAccess;
    return this;
  }

  /**
   * Get enableUserPreferenceAccess
   * @return enableUserPreferenceAccess
  */
  
  @Schema(name = "EnableUserPreferenceAccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableUserPreferenceAccess")
  public Boolean getEnableUserPreferenceAccess() {
    return enableUserPreferenceAccess;
  }

  public void setEnableUserPreferenceAccess(Boolean enableUserPreferenceAccess) {
    this.enableUserPreferenceAccess = enableUserPreferenceAccess;
  }

  public UserPolicy enableVideoPlaybackTranscoding(Boolean enableVideoPlaybackTranscoding) {
    this.enableVideoPlaybackTranscoding = enableVideoPlaybackTranscoding;
    return this;
  }

  /**
   * Get enableVideoPlaybackTranscoding
   * @return enableVideoPlaybackTranscoding
  */
  
  @Schema(name = "EnableVideoPlaybackTranscoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableVideoPlaybackTranscoding")
  public Boolean getEnableVideoPlaybackTranscoding() {
    return enableVideoPlaybackTranscoding;
  }

  public void setEnableVideoPlaybackTranscoding(Boolean enableVideoPlaybackTranscoding) {
    this.enableVideoPlaybackTranscoding = enableVideoPlaybackTranscoding;
  }

  public UserPolicy enabledChannels(List<UUID> enabledChannels) {
    this.enabledChannels = JsonNullable.of(enabledChannels);
    return this;
  }

  public UserPolicy addEnabledChannelsItem(UUID enabledChannelsItem) {
    if (this.enabledChannels == null || !this.enabledChannels.isPresent()) {
      this.enabledChannels = JsonNullable.of(new ArrayList<>());
    }
    this.enabledChannels.get().add(enabledChannelsItem);
    return this;
  }

  /**
   * Get enabledChannels
   * @return enabledChannels
  */
  @Valid 
  @Schema(name = "EnabledChannels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnabledChannels")
  public JsonNullable<List<UUID>> getEnabledChannels() {
    return enabledChannels;
  }

  public void setEnabledChannels(JsonNullable<List<UUID>> enabledChannels) {
    this.enabledChannels = enabledChannels;
  }

  public UserPolicy enabledDevices(List<String> enabledDevices) {
    this.enabledDevices = JsonNullable.of(enabledDevices);
    return this;
  }

  public UserPolicy addEnabledDevicesItem(String enabledDevicesItem) {
    if (this.enabledDevices == null || !this.enabledDevices.isPresent()) {
      this.enabledDevices = JsonNullable.of(new ArrayList<>());
    }
    this.enabledDevices.get().add(enabledDevicesItem);
    return this;
  }

  /**
   * Get enabledDevices
   * @return enabledDevices
  */
  
  @Schema(name = "EnabledDevices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnabledDevices")
  public JsonNullable<List<String>> getEnabledDevices() {
    return enabledDevices;
  }

  public void setEnabledDevices(JsonNullable<List<String>> enabledDevices) {
    this.enabledDevices = enabledDevices;
  }

  public UserPolicy enabledFolders(List<UUID> enabledFolders) {
    this.enabledFolders = JsonNullable.of(enabledFolders);
    return this;
  }

  public UserPolicy addEnabledFoldersItem(UUID enabledFoldersItem) {
    if (this.enabledFolders == null || !this.enabledFolders.isPresent()) {
      this.enabledFolders = JsonNullable.of(new ArrayList<>());
    }
    this.enabledFolders.get().add(enabledFoldersItem);
    return this;
  }

  /**
   * Get enabledFolders
   * @return enabledFolders
  */
  @Valid 
  @Schema(name = "EnabledFolders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnabledFolders")
  public JsonNullable<List<UUID>> getEnabledFolders() {
    return enabledFolders;
  }

  public void setEnabledFolders(JsonNullable<List<UUID>> enabledFolders) {
    this.enabledFolders = enabledFolders;
  }

  public UserPolicy forceRemoteSourceTranscoding(Boolean forceRemoteSourceTranscoding) {
    this.forceRemoteSourceTranscoding = forceRemoteSourceTranscoding;
    return this;
  }

  /**
   * Get forceRemoteSourceTranscoding
   * @return forceRemoteSourceTranscoding
  */
  
  @Schema(name = "ForceRemoteSourceTranscoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ForceRemoteSourceTranscoding")
  public Boolean getForceRemoteSourceTranscoding() {
    return forceRemoteSourceTranscoding;
  }

  public void setForceRemoteSourceTranscoding(Boolean forceRemoteSourceTranscoding) {
    this.forceRemoteSourceTranscoding = forceRemoteSourceTranscoding;
  }

  public UserPolicy invalidLoginAttemptCount(Integer invalidLoginAttemptCount) {
    this.invalidLoginAttemptCount = invalidLoginAttemptCount;
    return this;
  }

  /**
   * Get invalidLoginAttemptCount
   * @return invalidLoginAttemptCount
  */
  
  @Schema(name = "InvalidLoginAttemptCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("InvalidLoginAttemptCount")
  public Integer getInvalidLoginAttemptCount() {
    return invalidLoginAttemptCount;
  }

  public void setInvalidLoginAttemptCount(Integer invalidLoginAttemptCount) {
    this.invalidLoginAttemptCount = invalidLoginAttemptCount;
  }

  public UserPolicy isAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is administrator.
   * @return isAdministrator
  */
  
  @Schema(name = "IsAdministrator", description = "Gets or sets a value indicating whether this instance is administrator.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAdministrator")
  public Boolean getIsAdministrator() {
    return isAdministrator;
  }

  public void setIsAdministrator(Boolean isAdministrator) {
    this.isAdministrator = isAdministrator;
  }

  public UserPolicy isDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is disabled.
   * @return isDisabled
  */
  
  @Schema(name = "IsDisabled", description = "Gets or sets a value indicating whether this instance is disabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDisabled")
  public Boolean getIsDisabled() {
    return isDisabled;
  }

  public void setIsDisabled(Boolean isDisabled) {
    this.isDisabled = isDisabled;
  }

  public UserPolicy isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is hidden.
   * @return isHidden
  */
  
  @Schema(name = "IsHidden", description = "Gets or sets a value indicating whether this instance is hidden.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsHidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public UserPolicy loginAttemptsBeforeLockout(Integer loginAttemptsBeforeLockout) {
    this.loginAttemptsBeforeLockout = loginAttemptsBeforeLockout;
    return this;
  }

  /**
   * Get loginAttemptsBeforeLockout
   * @return loginAttemptsBeforeLockout
  */
  
  @Schema(name = "LoginAttemptsBeforeLockout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LoginAttemptsBeforeLockout")
  public Integer getLoginAttemptsBeforeLockout() {
    return loginAttemptsBeforeLockout;
  }

  public void setLoginAttemptsBeforeLockout(Integer loginAttemptsBeforeLockout) {
    this.loginAttemptsBeforeLockout = loginAttemptsBeforeLockout;
  }

  public UserPolicy maxActiveSessions(Integer maxActiveSessions) {
    this.maxActiveSessions = maxActiveSessions;
    return this;
  }

  /**
   * Get maxActiveSessions
   * @return maxActiveSessions
  */
  
  @Schema(name = "MaxActiveSessions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxActiveSessions")
  public Integer getMaxActiveSessions() {
    return maxActiveSessions;
  }

  public void setMaxActiveSessions(Integer maxActiveSessions) {
    this.maxActiveSessions = maxActiveSessions;
  }

  public UserPolicy maxParentalRating(Integer maxParentalRating) {
    this.maxParentalRating = JsonNullable.of(maxParentalRating);
    return this;
  }

  /**
   * Gets or sets the max parental rating.
   * @return maxParentalRating
  */
  
  @Schema(name = "MaxParentalRating", description = "Gets or sets the max parental rating.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxParentalRating")
  public JsonNullable<Integer> getMaxParentalRating() {
    return maxParentalRating;
  }

  public void setMaxParentalRating(JsonNullable<Integer> maxParentalRating) {
    this.maxParentalRating = maxParentalRating;
  }

  public UserPolicy passwordResetProviderId(String passwordResetProviderId) {
    this.passwordResetProviderId = JsonNullable.of(passwordResetProviderId);
    return this;
  }

  /**
   * Get passwordResetProviderId
   * @return passwordResetProviderId
  */
  
  @Schema(name = "PasswordResetProviderId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PasswordResetProviderId")
  public JsonNullable<String> getPasswordResetProviderId() {
    return passwordResetProviderId;
  }

  public void setPasswordResetProviderId(JsonNullable<String> passwordResetProviderId) {
    this.passwordResetProviderId = passwordResetProviderId;
  }

  public UserPolicy remoteClientBitrateLimit(Integer remoteClientBitrateLimit) {
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

  public UserPolicy syncPlayAccess(SyncPlayUserAccessType syncPlayAccess) {
    this.syncPlayAccess = syncPlayAccess;
    return this;
  }

  /**
   * Get syncPlayAccess
   * @return syncPlayAccess
  */
  @Valid 
  @Schema(name = "SyncPlayAccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SyncPlayAccess")
  public SyncPlayUserAccessType getSyncPlayAccess() {
    return syncPlayAccess;
  }

  public void setSyncPlayAccess(SyncPlayUserAccessType syncPlayAccess) {
    this.syncPlayAccess = syncPlayAccess;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPolicy userPolicy = (UserPolicy) o;
    return equalsNullable(this.accessSchedules, userPolicy.accessSchedules) &&
        equalsNullable(this.authenticationProviderId, userPolicy.authenticationProviderId) &&
        equalsNullable(this.blockUnratedItems, userPolicy.blockUnratedItems) &&
        equalsNullable(this.blockedChannels, userPolicy.blockedChannels) &&
        equalsNullable(this.blockedMediaFolders, userPolicy.blockedMediaFolders) &&
        equalsNullable(this.blockedTags, userPolicy.blockedTags) &&
        Objects.equals(this.enableAllChannels, userPolicy.enableAllChannels) &&
        Objects.equals(this.enableAllDevices, userPolicy.enableAllDevices) &&
        Objects.equals(this.enableAllFolders, userPolicy.enableAllFolders) &&
        Objects.equals(this.enableAudioPlaybackTranscoding, userPolicy.enableAudioPlaybackTranscoding) &&
        Objects.equals(this.enableContentDeletion, userPolicy.enableContentDeletion) &&
        equalsNullable(this.enableContentDeletionFromFolders, userPolicy.enableContentDeletionFromFolders) &&
        Objects.equals(this.enableContentDownloading, userPolicy.enableContentDownloading) &&
        Objects.equals(this.enableLiveTvAccess, userPolicy.enableLiveTvAccess) &&
        Objects.equals(this.enableLiveTvManagement, userPolicy.enableLiveTvManagement) &&
        Objects.equals(this.enableMediaConversion, userPolicy.enableMediaConversion) &&
        Objects.equals(this.enableMediaPlayback, userPolicy.enableMediaPlayback) &&
        Objects.equals(this.enablePlaybackRemuxing, userPolicy.enablePlaybackRemuxing) &&
        Objects.equals(this.enablePublicSharing, userPolicy.enablePublicSharing) &&
        Objects.equals(this.enableRemoteAccess, userPolicy.enableRemoteAccess) &&
        Objects.equals(this.enableRemoteControlOfOtherUsers, userPolicy.enableRemoteControlOfOtherUsers) &&
        Objects.equals(this.enableSharedDeviceControl, userPolicy.enableSharedDeviceControl) &&
        Objects.equals(this.enableSyncTranscoding, userPolicy.enableSyncTranscoding) &&
        Objects.equals(this.enableUserPreferenceAccess, userPolicy.enableUserPreferenceAccess) &&
        Objects.equals(this.enableVideoPlaybackTranscoding, userPolicy.enableVideoPlaybackTranscoding) &&
        equalsNullable(this.enabledChannels, userPolicy.enabledChannels) &&
        equalsNullable(this.enabledDevices, userPolicy.enabledDevices) &&
        equalsNullable(this.enabledFolders, userPolicy.enabledFolders) &&
        Objects.equals(this.forceRemoteSourceTranscoding, userPolicy.forceRemoteSourceTranscoding) &&
        Objects.equals(this.invalidLoginAttemptCount, userPolicy.invalidLoginAttemptCount) &&
        Objects.equals(this.isAdministrator, userPolicy.isAdministrator) &&
        Objects.equals(this.isDisabled, userPolicy.isDisabled) &&
        Objects.equals(this.isHidden, userPolicy.isHidden) &&
        Objects.equals(this.loginAttemptsBeforeLockout, userPolicy.loginAttemptsBeforeLockout) &&
        Objects.equals(this.maxActiveSessions, userPolicy.maxActiveSessions) &&
        equalsNullable(this.maxParentalRating, userPolicy.maxParentalRating) &&
        equalsNullable(this.passwordResetProviderId, userPolicy.passwordResetProviderId) &&
        Objects.equals(this.remoteClientBitrateLimit, userPolicy.remoteClientBitrateLimit) &&
        Objects.equals(this.syncPlayAccess, userPolicy.syncPlayAccess);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(accessSchedules), hashCodeNullable(authenticationProviderId), hashCodeNullable(blockUnratedItems), hashCodeNullable(blockedChannels), hashCodeNullable(blockedMediaFolders), hashCodeNullable(blockedTags), enableAllChannels, enableAllDevices, enableAllFolders, enableAudioPlaybackTranscoding, enableContentDeletion, hashCodeNullable(enableContentDeletionFromFolders), enableContentDownloading, enableLiveTvAccess, enableLiveTvManagement, enableMediaConversion, enableMediaPlayback, enablePlaybackRemuxing, enablePublicSharing, enableRemoteAccess, enableRemoteControlOfOtherUsers, enableSharedDeviceControl, enableSyncTranscoding, enableUserPreferenceAccess, enableVideoPlaybackTranscoding, hashCodeNullable(enabledChannels), hashCodeNullable(enabledDevices), hashCodeNullable(enabledFolders), forceRemoteSourceTranscoding, invalidLoginAttemptCount, isAdministrator, isDisabled, isHidden, loginAttemptsBeforeLockout, maxActiveSessions, hashCodeNullable(maxParentalRating), hashCodeNullable(passwordResetProviderId), remoteClientBitrateLimit, syncPlayAccess);
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
    sb.append("class UserPolicy {\n");
    sb.append("    accessSchedules: ").append(toIndentedString(accessSchedules)).append("\n");
    sb.append("    authenticationProviderId: ").append(toIndentedString(authenticationProviderId)).append("\n");
    sb.append("    blockUnratedItems: ").append(toIndentedString(blockUnratedItems)).append("\n");
    sb.append("    blockedChannels: ").append(toIndentedString(blockedChannels)).append("\n");
    sb.append("    blockedMediaFolders: ").append(toIndentedString(blockedMediaFolders)).append("\n");
    sb.append("    blockedTags: ").append(toIndentedString(blockedTags)).append("\n");
    sb.append("    enableAllChannels: ").append(toIndentedString(enableAllChannels)).append("\n");
    sb.append("    enableAllDevices: ").append(toIndentedString(enableAllDevices)).append("\n");
    sb.append("    enableAllFolders: ").append(toIndentedString(enableAllFolders)).append("\n");
    sb.append("    enableAudioPlaybackTranscoding: ").append(toIndentedString(enableAudioPlaybackTranscoding)).append("\n");
    sb.append("    enableContentDeletion: ").append(toIndentedString(enableContentDeletion)).append("\n");
    sb.append("    enableContentDeletionFromFolders: ").append(toIndentedString(enableContentDeletionFromFolders)).append("\n");
    sb.append("    enableContentDownloading: ").append(toIndentedString(enableContentDownloading)).append("\n");
    sb.append("    enableLiveTvAccess: ").append(toIndentedString(enableLiveTvAccess)).append("\n");
    sb.append("    enableLiveTvManagement: ").append(toIndentedString(enableLiveTvManagement)).append("\n");
    sb.append("    enableMediaConversion: ").append(toIndentedString(enableMediaConversion)).append("\n");
    sb.append("    enableMediaPlayback: ").append(toIndentedString(enableMediaPlayback)).append("\n");
    sb.append("    enablePlaybackRemuxing: ").append(toIndentedString(enablePlaybackRemuxing)).append("\n");
    sb.append("    enablePublicSharing: ").append(toIndentedString(enablePublicSharing)).append("\n");
    sb.append("    enableRemoteAccess: ").append(toIndentedString(enableRemoteAccess)).append("\n");
    sb.append("    enableRemoteControlOfOtherUsers: ").append(toIndentedString(enableRemoteControlOfOtherUsers)).append("\n");
    sb.append("    enableSharedDeviceControl: ").append(toIndentedString(enableSharedDeviceControl)).append("\n");
    sb.append("    enableSyncTranscoding: ").append(toIndentedString(enableSyncTranscoding)).append("\n");
    sb.append("    enableUserPreferenceAccess: ").append(toIndentedString(enableUserPreferenceAccess)).append("\n");
    sb.append("    enableVideoPlaybackTranscoding: ").append(toIndentedString(enableVideoPlaybackTranscoding)).append("\n");
    sb.append("    enabledChannels: ").append(toIndentedString(enabledChannels)).append("\n");
    sb.append("    enabledDevices: ").append(toIndentedString(enabledDevices)).append("\n");
    sb.append("    enabledFolders: ").append(toIndentedString(enabledFolders)).append("\n");
    sb.append("    forceRemoteSourceTranscoding: ").append(toIndentedString(forceRemoteSourceTranscoding)).append("\n");
    sb.append("    invalidLoginAttemptCount: ").append(toIndentedString(invalidLoginAttemptCount)).append("\n");
    sb.append("    isAdministrator: ").append(toIndentedString(isAdministrator)).append("\n");
    sb.append("    isDisabled: ").append(toIndentedString(isDisabled)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    loginAttemptsBeforeLockout: ").append(toIndentedString(loginAttemptsBeforeLockout)).append("\n");
    sb.append("    maxActiveSessions: ").append(toIndentedString(maxActiveSessions)).append("\n");
    sb.append("    maxParentalRating: ").append(toIndentedString(maxParentalRating)).append("\n");
    sb.append("    passwordResetProviderId: ").append(toIndentedString(passwordResetProviderId)).append("\n");
    sb.append("    remoteClientBitrateLimit: ").append(toIndentedString(remoteClientBitrateLimit)).append("\n");
    sb.append("    syncPlayAccess: ").append(toIndentedString(syncPlayAccess)).append("\n");
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

