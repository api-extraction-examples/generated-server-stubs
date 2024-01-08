package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseItem;
import org.openapitools.model.BaseItemDto;
import org.openapitools.model.ClientCapabilities;
import org.openapitools.model.GeneralCommandType;
import org.openapitools.model.PlayerStateInfo;
import org.openapitools.model.QueueItem;
import org.openapitools.model.SessionUserInfo;
import org.openapitools.model.TranscodingInfo;
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
 * Class SessionInfo.
 */

@Schema(name = "SessionInfo", description = "Class SessionInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SessionInfo {

  @Valid
  private JsonNullable<List<@Valid SessionUserInfo>> additionalUsers = JsonNullable.<List<@Valid SessionUserInfo>>undefined();

  private JsonNullable<String> applicationVersion = JsonNullable.<String>undefined();

  private ClientCapabilities capabilities;

  private JsonNullable<String> client = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceId = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceName = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceType = JsonNullable.<String>undefined();

  private BaseItem fullNowPlayingItem;

  private Boolean hasCustomDeviceName;

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private Boolean isActive;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastActivityDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastPlaybackCheckIn;

  private BaseItemDto nowPlayingItem;

  @Valid
  private JsonNullable<List<@Valid QueueItem>> nowPlayingQueue = JsonNullable.<List<@Valid QueueItem>>undefined();

  private BaseItemDto nowViewingItem;

  private PlayerStateInfo playState;

  @Valid
  private JsonNullable<List<String>> playableMediaTypes = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> playlistItemId = JsonNullable.<String>undefined();

  private JsonNullable<String> remoteEndPoint = JsonNullable.<String>undefined();

  private JsonNullable<String> serverId = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid GeneralCommandType>> supportedCommands = JsonNullable.<List<@Valid GeneralCommandType>>undefined();

  private Boolean supportsMediaControl;

  private Boolean supportsRemoteControl;

  private TranscodingInfo transcodingInfo;

  private UUID userId;

  private JsonNullable<String> userName = JsonNullable.<String>undefined();

  private JsonNullable<String> userPrimaryImageTag = JsonNullable.<String>undefined();

  public SessionInfo additionalUsers(List<@Valid SessionUserInfo> additionalUsers) {
    this.additionalUsers = JsonNullable.of(additionalUsers);
    return this;
  }

  public SessionInfo addAdditionalUsersItem(SessionUserInfo additionalUsersItem) {
    if (this.additionalUsers == null || !this.additionalUsers.isPresent()) {
      this.additionalUsers = JsonNullable.of(new ArrayList<>());
    }
    this.additionalUsers.get().add(additionalUsersItem);
    return this;
  }

  /**
   * Get additionalUsers
   * @return additionalUsers
  */
  @Valid 
  @Schema(name = "AdditionalUsers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AdditionalUsers")
  public JsonNullable<List<@Valid SessionUserInfo>> getAdditionalUsers() {
    return additionalUsers;
  }

  public void setAdditionalUsers(JsonNullable<List<@Valid SessionUserInfo>> additionalUsers) {
    this.additionalUsers = additionalUsers;
  }

  public SessionInfo applicationVersion(String applicationVersion) {
    this.applicationVersion = JsonNullable.of(applicationVersion);
    return this;
  }

  /**
   * Gets or sets the application version.
   * @return applicationVersion
  */
  
  @Schema(name = "ApplicationVersion", description = "Gets or sets the application version.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ApplicationVersion")
  public JsonNullable<String> getApplicationVersion() {
    return applicationVersion;
  }

  public void setApplicationVersion(JsonNullable<String> applicationVersion) {
    this.applicationVersion = applicationVersion;
  }

  public SessionInfo capabilities(ClientCapabilities capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  /**
   * Get capabilities
   * @return capabilities
  */
  @Valid 
  @Schema(name = "Capabilities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Capabilities")
  public ClientCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(ClientCapabilities capabilities) {
    this.capabilities = capabilities;
  }

  public SessionInfo client(String client) {
    this.client = JsonNullable.of(client);
    return this;
  }

  /**
   * Gets or sets the type of the client.
   * @return client
  */
  
  @Schema(name = "Client", description = "Gets or sets the type of the client.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Client")
  public JsonNullable<String> getClient() {
    return client;
  }

  public void setClient(JsonNullable<String> client) {
    this.client = client;
  }

  public SessionInfo deviceId(String deviceId) {
    this.deviceId = JsonNullable.of(deviceId);
    return this;
  }

  /**
   * Gets or sets the device id.
   * @return deviceId
  */
  
  @Schema(name = "DeviceId", description = "Gets or sets the device id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceId")
  public JsonNullable<String> getDeviceId() {
    return deviceId;
  }

  public void setDeviceId(JsonNullable<String> deviceId) {
    this.deviceId = deviceId;
  }

  public SessionInfo deviceName(String deviceName) {
    this.deviceName = JsonNullable.of(deviceName);
    return this;
  }

  /**
   * Gets or sets the name of the device.
   * @return deviceName
  */
  
  @Schema(name = "DeviceName", description = "Gets or sets the name of the device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceName")
  public JsonNullable<String> getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(JsonNullable<String> deviceName) {
    this.deviceName = deviceName;
  }

  public SessionInfo deviceType(String deviceType) {
    this.deviceType = JsonNullable.of(deviceType);
    return this;
  }

  /**
   * Gets or sets the type of the device.
   * @return deviceType
  */
  
  @Schema(name = "DeviceType", description = "Gets or sets the type of the device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceType")
  public JsonNullable<String> getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(JsonNullable<String> deviceType) {
    this.deviceType = deviceType;
  }

  public SessionInfo fullNowPlayingItem(BaseItem fullNowPlayingItem) {
    this.fullNowPlayingItem = fullNowPlayingItem;
    return this;
  }

  /**
   * Get fullNowPlayingItem
   * @return fullNowPlayingItem
  */
  @Valid 
  @Schema(name = "FullNowPlayingItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FullNowPlayingItem")
  public BaseItem getFullNowPlayingItem() {
    return fullNowPlayingItem;
  }

  public void setFullNowPlayingItem(BaseItem fullNowPlayingItem) {
    this.fullNowPlayingItem = fullNowPlayingItem;
  }

  public SessionInfo hasCustomDeviceName(Boolean hasCustomDeviceName) {
    this.hasCustomDeviceName = hasCustomDeviceName;
    return this;
  }

  /**
   * Get hasCustomDeviceName
   * @return hasCustomDeviceName
  */
  
  @Schema(name = "HasCustomDeviceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("HasCustomDeviceName")
  public Boolean getHasCustomDeviceName() {
    return hasCustomDeviceName;
  }

  public void setHasCustomDeviceName(Boolean hasCustomDeviceName) {
    this.hasCustomDeviceName = hasCustomDeviceName;
  }

  public SessionInfo id(String id) {
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

  public SessionInfo isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * Gets a value indicating whether this instance is active.
   * @return isActive
  */
  
  @Schema(name = "IsActive", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets a value indicating whether this instance is active.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsActive")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }

  public SessionInfo lastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
    return this;
  }

  /**
   * Gets or sets the last activity date.
   * @return lastActivityDate
  */
  @Valid 
  @Schema(name = "LastActivityDate", description = "Gets or sets the last activity date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastActivityDate")
  public OffsetDateTime getLastActivityDate() {
    return lastActivityDate;
  }

  public void setLastActivityDate(OffsetDateTime lastActivityDate) {
    this.lastActivityDate = lastActivityDate;
  }

  public SessionInfo lastPlaybackCheckIn(OffsetDateTime lastPlaybackCheckIn) {
    this.lastPlaybackCheckIn = lastPlaybackCheckIn;
    return this;
  }

  /**
   * Gets or sets the last playback check in.
   * @return lastPlaybackCheckIn
  */
  @Valid 
  @Schema(name = "LastPlaybackCheckIn", description = "Gets or sets the last playback check in.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastPlaybackCheckIn")
  public OffsetDateTime getLastPlaybackCheckIn() {
    return lastPlaybackCheckIn;
  }

  public void setLastPlaybackCheckIn(OffsetDateTime lastPlaybackCheckIn) {
    this.lastPlaybackCheckIn = lastPlaybackCheckIn;
  }

  public SessionInfo nowPlayingItem(BaseItemDto nowPlayingItem) {
    this.nowPlayingItem = nowPlayingItem;
    return this;
  }

  /**
   * Get nowPlayingItem
   * @return nowPlayingItem
  */
  @Valid 
  @Schema(name = "NowPlayingItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NowPlayingItem")
  public BaseItemDto getNowPlayingItem() {
    return nowPlayingItem;
  }

  public void setNowPlayingItem(BaseItemDto nowPlayingItem) {
    this.nowPlayingItem = nowPlayingItem;
  }

  public SessionInfo nowPlayingQueue(List<@Valid QueueItem> nowPlayingQueue) {
    this.nowPlayingQueue = JsonNullable.of(nowPlayingQueue);
    return this;
  }

  public SessionInfo addNowPlayingQueueItem(QueueItem nowPlayingQueueItem) {
    if (this.nowPlayingQueue == null || !this.nowPlayingQueue.isPresent()) {
      this.nowPlayingQueue = JsonNullable.of(new ArrayList<>());
    }
    this.nowPlayingQueue.get().add(nowPlayingQueueItem);
    return this;
  }

  /**
   * Get nowPlayingQueue
   * @return nowPlayingQueue
  */
  @Valid 
  @Schema(name = "NowPlayingQueue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NowPlayingQueue")
  public JsonNullable<List<@Valid QueueItem>> getNowPlayingQueue() {
    return nowPlayingQueue;
  }

  public void setNowPlayingQueue(JsonNullable<List<@Valid QueueItem>> nowPlayingQueue) {
    this.nowPlayingQueue = nowPlayingQueue;
  }

  public SessionInfo nowViewingItem(BaseItemDto nowViewingItem) {
    this.nowViewingItem = nowViewingItem;
    return this;
  }

  /**
   * Get nowViewingItem
   * @return nowViewingItem
  */
  @Valid 
  @Schema(name = "NowViewingItem", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NowViewingItem")
  public BaseItemDto getNowViewingItem() {
    return nowViewingItem;
  }

  public void setNowViewingItem(BaseItemDto nowViewingItem) {
    this.nowViewingItem = nowViewingItem;
  }

  public SessionInfo playState(PlayerStateInfo playState) {
    this.playState = playState;
    return this;
  }

  /**
   * Get playState
   * @return playState
  */
  @Valid 
  @Schema(name = "PlayState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayState")
  public PlayerStateInfo getPlayState() {
    return playState;
  }

  public void setPlayState(PlayerStateInfo playState) {
    this.playState = playState;
  }

  public SessionInfo playableMediaTypes(List<String> playableMediaTypes) {
    this.playableMediaTypes = JsonNullable.of(playableMediaTypes);
    return this;
  }

  public SessionInfo addPlayableMediaTypesItem(String playableMediaTypesItem) {
    if (this.playableMediaTypes == null || !this.playableMediaTypes.isPresent()) {
      this.playableMediaTypes = JsonNullable.of(new ArrayList<>());
    }
    this.playableMediaTypes.get().add(playableMediaTypesItem);
    return this;
  }

  /**
   * Gets or sets the playable media types.
   * @return playableMediaTypes
  */
  
  @Schema(name = "PlayableMediaTypes", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets or sets the playable media types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlayableMediaTypes")
  public JsonNullable<List<String>> getPlayableMediaTypes() {
    return playableMediaTypes;
  }

  public void setPlayableMediaTypes(JsonNullable<List<String>> playableMediaTypes) {
    this.playableMediaTypes = playableMediaTypes;
  }

  public SessionInfo playlistItemId(String playlistItemId) {
    this.playlistItemId = JsonNullable.of(playlistItemId);
    return this;
  }

  /**
   * Get playlistItemId
   * @return playlistItemId
  */
  
  @Schema(name = "PlaylistItemId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaylistItemId")
  public JsonNullable<String> getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(JsonNullable<String> playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public SessionInfo remoteEndPoint(String remoteEndPoint) {
    this.remoteEndPoint = JsonNullable.of(remoteEndPoint);
    return this;
  }

  /**
   * Gets or sets the remote end point.
   * @return remoteEndPoint
  */
  
  @Schema(name = "RemoteEndPoint", description = "Gets or sets the remote end point.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RemoteEndPoint")
  public JsonNullable<String> getRemoteEndPoint() {
    return remoteEndPoint;
  }

  public void setRemoteEndPoint(JsonNullable<String> remoteEndPoint) {
    this.remoteEndPoint = remoteEndPoint;
  }

  public SessionInfo serverId(String serverId) {
    this.serverId = JsonNullable.of(serverId);
    return this;
  }

  /**
   * Get serverId
   * @return serverId
  */
  
  @Schema(name = "ServerId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerId")
  public JsonNullable<String> getServerId() {
    return serverId;
  }

  public void setServerId(JsonNullable<String> serverId) {
    this.serverId = serverId;
  }

  public SessionInfo supportedCommands(List<@Valid GeneralCommandType> supportedCommands) {
    this.supportedCommands = JsonNullable.of(supportedCommands);
    return this;
  }

  public SessionInfo addSupportedCommandsItem(GeneralCommandType supportedCommandsItem) {
    if (this.supportedCommands == null || !this.supportedCommands.isPresent()) {
      this.supportedCommands = JsonNullable.of(new ArrayList<>());
    }
    this.supportedCommands.get().add(supportedCommandsItem);
    return this;
  }

  /**
   * Gets or sets the supported commands.
   * @return supportedCommands
  */
  @Valid 
  @Schema(name = "SupportedCommands", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets or sets the supported commands.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportedCommands")
  public JsonNullable<List<@Valid GeneralCommandType>> getSupportedCommands() {
    return supportedCommands;
  }

  public void setSupportedCommands(JsonNullable<List<@Valid GeneralCommandType>> supportedCommands) {
    this.supportedCommands = supportedCommands;
  }

  public SessionInfo supportsMediaControl(Boolean supportsMediaControl) {
    this.supportsMediaControl = supportsMediaControl;
    return this;
  }

  /**
   * Get supportsMediaControl
   * @return supportsMediaControl
  */
  
  @Schema(name = "SupportsMediaControl", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsMediaControl")
  public Boolean getSupportsMediaControl() {
    return supportsMediaControl;
  }

  public void setSupportsMediaControl(Boolean supportsMediaControl) {
    this.supportsMediaControl = supportsMediaControl;
  }

  public SessionInfo supportsRemoteControl(Boolean supportsRemoteControl) {
    this.supportsRemoteControl = supportsRemoteControl;
    return this;
  }

  /**
   * Get supportsRemoteControl
   * @return supportsRemoteControl
  */
  
  @Schema(name = "SupportsRemoteControl", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsRemoteControl")
  public Boolean getSupportsRemoteControl() {
    return supportsRemoteControl;
  }

  public void setSupportsRemoteControl(Boolean supportsRemoteControl) {
    this.supportsRemoteControl = supportsRemoteControl;
  }

  public SessionInfo transcodingInfo(TranscodingInfo transcodingInfo) {
    this.transcodingInfo = transcodingInfo;
    return this;
  }

  /**
   * Get transcodingInfo
   * @return transcodingInfo
  */
  @Valid 
  @Schema(name = "TranscodingInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TranscodingInfo")
  public TranscodingInfo getTranscodingInfo() {
    return transcodingInfo;
  }

  public void setTranscodingInfo(TranscodingInfo transcodingInfo) {
    this.transcodingInfo = transcodingInfo;
  }

  public SessionInfo userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Gets or sets the user id.
   * @return userId
  */
  @Valid 
  @Schema(name = "UserId", description = "Gets or sets the user id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public SessionInfo userName(String userName) {
    this.userName = JsonNullable.of(userName);
    return this;
  }

  /**
   * Gets or sets the username.
   * @return userName
  */
  
  @Schema(name = "UserName", description = "Gets or sets the username.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserName")
  public JsonNullable<String> getUserName() {
    return userName;
  }

  public void setUserName(JsonNullable<String> userName) {
    this.userName = userName;
  }

  public SessionInfo userPrimaryImageTag(String userPrimaryImageTag) {
    this.userPrimaryImageTag = JsonNullable.of(userPrimaryImageTag);
    return this;
  }

  /**
   * Get userPrimaryImageTag
   * @return userPrimaryImageTag
  */
  
  @Schema(name = "UserPrimaryImageTag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserPrimaryImageTag")
  public JsonNullable<String> getUserPrimaryImageTag() {
    return userPrimaryImageTag;
  }

  public void setUserPrimaryImageTag(JsonNullable<String> userPrimaryImageTag) {
    this.userPrimaryImageTag = userPrimaryImageTag;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SessionInfo sessionInfo = (SessionInfo) o;
    return equalsNullable(this.additionalUsers, sessionInfo.additionalUsers) &&
        equalsNullable(this.applicationVersion, sessionInfo.applicationVersion) &&
        Objects.equals(this.capabilities, sessionInfo.capabilities) &&
        equalsNullable(this.client, sessionInfo.client) &&
        equalsNullable(this.deviceId, sessionInfo.deviceId) &&
        equalsNullable(this.deviceName, sessionInfo.deviceName) &&
        equalsNullable(this.deviceType, sessionInfo.deviceType) &&
        Objects.equals(this.fullNowPlayingItem, sessionInfo.fullNowPlayingItem) &&
        Objects.equals(this.hasCustomDeviceName, sessionInfo.hasCustomDeviceName) &&
        equalsNullable(this.id, sessionInfo.id) &&
        Objects.equals(this.isActive, sessionInfo.isActive) &&
        Objects.equals(this.lastActivityDate, sessionInfo.lastActivityDate) &&
        Objects.equals(this.lastPlaybackCheckIn, sessionInfo.lastPlaybackCheckIn) &&
        Objects.equals(this.nowPlayingItem, sessionInfo.nowPlayingItem) &&
        equalsNullable(this.nowPlayingQueue, sessionInfo.nowPlayingQueue) &&
        Objects.equals(this.nowViewingItem, sessionInfo.nowViewingItem) &&
        Objects.equals(this.playState, sessionInfo.playState) &&
        equalsNullable(this.playableMediaTypes, sessionInfo.playableMediaTypes) &&
        equalsNullable(this.playlistItemId, sessionInfo.playlistItemId) &&
        equalsNullable(this.remoteEndPoint, sessionInfo.remoteEndPoint) &&
        equalsNullable(this.serverId, sessionInfo.serverId) &&
        equalsNullable(this.supportedCommands, sessionInfo.supportedCommands) &&
        Objects.equals(this.supportsMediaControl, sessionInfo.supportsMediaControl) &&
        Objects.equals(this.supportsRemoteControl, sessionInfo.supportsRemoteControl) &&
        Objects.equals(this.transcodingInfo, sessionInfo.transcodingInfo) &&
        Objects.equals(this.userId, sessionInfo.userId) &&
        equalsNullable(this.userName, sessionInfo.userName) &&
        equalsNullable(this.userPrimaryImageTag, sessionInfo.userPrimaryImageTag);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(additionalUsers), hashCodeNullable(applicationVersion), capabilities, hashCodeNullable(client), hashCodeNullable(deviceId), hashCodeNullable(deviceName), hashCodeNullable(deviceType), fullNowPlayingItem, hasCustomDeviceName, hashCodeNullable(id), isActive, lastActivityDate, lastPlaybackCheckIn, nowPlayingItem, hashCodeNullable(nowPlayingQueue), nowViewingItem, playState, hashCodeNullable(playableMediaTypes), hashCodeNullable(playlistItemId), hashCodeNullable(remoteEndPoint), hashCodeNullable(serverId), hashCodeNullable(supportedCommands), supportsMediaControl, supportsRemoteControl, transcodingInfo, userId, hashCodeNullable(userName), hashCodeNullable(userPrimaryImageTag));
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
    sb.append("class SessionInfo {\n");
    sb.append("    additionalUsers: ").append(toIndentedString(additionalUsers)).append("\n");
    sb.append("    applicationVersion: ").append(toIndentedString(applicationVersion)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    fullNowPlayingItem: ").append(toIndentedString(fullNowPlayingItem)).append("\n");
    sb.append("    hasCustomDeviceName: ").append(toIndentedString(hasCustomDeviceName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    lastActivityDate: ").append(toIndentedString(lastActivityDate)).append("\n");
    sb.append("    lastPlaybackCheckIn: ").append(toIndentedString(lastPlaybackCheckIn)).append("\n");
    sb.append("    nowPlayingItem: ").append(toIndentedString(nowPlayingItem)).append("\n");
    sb.append("    nowPlayingQueue: ").append(toIndentedString(nowPlayingQueue)).append("\n");
    sb.append("    nowViewingItem: ").append(toIndentedString(nowViewingItem)).append("\n");
    sb.append("    playState: ").append(toIndentedString(playState)).append("\n");
    sb.append("    playableMediaTypes: ").append(toIndentedString(playableMediaTypes)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    remoteEndPoint: ").append(toIndentedString(remoteEndPoint)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    supportedCommands: ").append(toIndentedString(supportedCommands)).append("\n");
    sb.append("    supportsMediaControl: ").append(toIndentedString(supportsMediaControl)).append("\n");
    sb.append("    supportsRemoteControl: ").append(toIndentedString(supportsRemoteControl)).append("\n");
    sb.append("    transcodingInfo: ").append(toIndentedString(transcodingInfo)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    userPrimaryImageTag: ").append(toIndentedString(userPrimaryImageTag)).append("\n");
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

