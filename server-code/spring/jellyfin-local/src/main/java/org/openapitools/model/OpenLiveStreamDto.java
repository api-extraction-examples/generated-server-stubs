package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeviceProfile;
import org.openapitools.model.MediaProtocol;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Open live stream dto.
 */

@Schema(name = "OpenLiveStreamDto", description = "Open live stream dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class OpenLiveStreamDto {

  private JsonNullable<Integer> audioStreamIndex = JsonNullable.<Integer>undefined();

  private DeviceProfile deviceProfile;

  @Valid
  private JsonNullable<List<@Valid MediaProtocol>> directPlayProtocols = JsonNullable.<List<@Valid MediaProtocol>>undefined();

  private JsonNullable<Boolean> enableDirectPlay = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> enableDirectStream = JsonNullable.<Boolean>undefined();

  private JsonNullable<UUID> itemId = JsonNullable.<UUID>undefined();

  private JsonNullable<Integer> maxAudioChannels = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxStreamingBitrate = JsonNullable.<Integer>undefined();

  private JsonNullable<String> openToken = JsonNullable.<String>undefined();

  private JsonNullable<String> playSessionId = JsonNullable.<String>undefined();

  private JsonNullable<Long> startTimeTicks = JsonNullable.<Long>undefined();

  private JsonNullable<Integer> subtitleStreamIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<UUID> userId = JsonNullable.<UUID>undefined();

  public OpenLiveStreamDto audioStreamIndex(Integer audioStreamIndex) {
    this.audioStreamIndex = JsonNullable.of(audioStreamIndex);
    return this;
  }

  /**
   * Gets or sets the audio stream index.
   * @return audioStreamIndex
  */
  
  @Schema(name = "AudioStreamIndex", description = "Gets or sets the audio stream index.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioStreamIndex")
  public JsonNullable<Integer> getAudioStreamIndex() {
    return audioStreamIndex;
  }

  public void setAudioStreamIndex(JsonNullable<Integer> audioStreamIndex) {
    this.audioStreamIndex = audioStreamIndex;
  }

  public OpenLiveStreamDto deviceProfile(DeviceProfile deviceProfile) {
    this.deviceProfile = deviceProfile;
    return this;
  }

  /**
   * Get deviceProfile
   * @return deviceProfile
  */
  @Valid 
  @Schema(name = "DeviceProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeviceProfile")
  public DeviceProfile getDeviceProfile() {
    return deviceProfile;
  }

  public void setDeviceProfile(DeviceProfile deviceProfile) {
    this.deviceProfile = deviceProfile;
  }

  public OpenLiveStreamDto directPlayProtocols(List<@Valid MediaProtocol> directPlayProtocols) {
    this.directPlayProtocols = JsonNullable.of(directPlayProtocols);
    return this;
  }

  public OpenLiveStreamDto addDirectPlayProtocolsItem(MediaProtocol directPlayProtocolsItem) {
    if (this.directPlayProtocols == null || !this.directPlayProtocols.isPresent()) {
      this.directPlayProtocols = JsonNullable.of(new ArrayList<>());
    }
    this.directPlayProtocols.get().add(directPlayProtocolsItem);
    return this;
  }

  /**
   * Gets or sets the device play protocols.
   * @return directPlayProtocols
  */
  @Valid 
  @Schema(name = "DirectPlayProtocols", description = "Gets or sets the device play protocols.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DirectPlayProtocols")
  public JsonNullable<List<@Valid MediaProtocol>> getDirectPlayProtocols() {
    return directPlayProtocols;
  }

  public void setDirectPlayProtocols(JsonNullable<List<@Valid MediaProtocol>> directPlayProtocols) {
    this.directPlayProtocols = directPlayProtocols;
  }

  public OpenLiveStreamDto enableDirectPlay(Boolean enableDirectPlay) {
    this.enableDirectPlay = JsonNullable.of(enableDirectPlay);
    return this;
  }

  /**
   * Gets or sets a value indicating whether to enable direct play.
   * @return enableDirectPlay
  */
  
  @Schema(name = "EnableDirectPlay", description = "Gets or sets a value indicating whether to enable direct play.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableDirectPlay")
  public JsonNullable<Boolean> getEnableDirectPlay() {
    return enableDirectPlay;
  }

  public void setEnableDirectPlay(JsonNullable<Boolean> enableDirectPlay) {
    this.enableDirectPlay = enableDirectPlay;
  }

  public OpenLiveStreamDto enableDirectStream(Boolean enableDirectStream) {
    this.enableDirectStream = JsonNullable.of(enableDirectStream);
    return this;
  }

  /**
   * Gets or sets a value indicating whether to enale direct stream.
   * @return enableDirectStream
  */
  
  @Schema(name = "EnableDirectStream", description = "Gets or sets a value indicating whether to enale direct stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableDirectStream")
  public JsonNullable<Boolean> getEnableDirectStream() {
    return enableDirectStream;
  }

  public void setEnableDirectStream(JsonNullable<Boolean> enableDirectStream) {
    this.enableDirectStream = enableDirectStream;
  }

  public OpenLiveStreamDto itemId(UUID itemId) {
    this.itemId = JsonNullable.of(itemId);
    return this;
  }

  /**
   * Gets or sets the item id.
   * @return itemId
  */
  @Valid 
  @Schema(name = "ItemId", description = "Gets or sets the item id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemId")
  public JsonNullable<UUID> getItemId() {
    return itemId;
  }

  public void setItemId(JsonNullable<UUID> itemId) {
    this.itemId = itemId;
  }

  public OpenLiveStreamDto maxAudioChannels(Integer maxAudioChannels) {
    this.maxAudioChannels = JsonNullable.of(maxAudioChannels);
    return this;
  }

  /**
   * Gets or sets the max audio channels.
   * @return maxAudioChannels
  */
  
  @Schema(name = "MaxAudioChannels", description = "Gets or sets the max audio channels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxAudioChannels")
  public JsonNullable<Integer> getMaxAudioChannels() {
    return maxAudioChannels;
  }

  public void setMaxAudioChannels(JsonNullable<Integer> maxAudioChannels) {
    this.maxAudioChannels = maxAudioChannels;
  }

  public OpenLiveStreamDto maxStreamingBitrate(Integer maxStreamingBitrate) {
    this.maxStreamingBitrate = JsonNullable.of(maxStreamingBitrate);
    return this;
  }

  /**
   * Gets or sets the max streaming bitrate.
   * @return maxStreamingBitrate
  */
  
  @Schema(name = "MaxStreamingBitrate", description = "Gets or sets the max streaming bitrate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxStreamingBitrate")
  public JsonNullable<Integer> getMaxStreamingBitrate() {
    return maxStreamingBitrate;
  }

  public void setMaxStreamingBitrate(JsonNullable<Integer> maxStreamingBitrate) {
    this.maxStreamingBitrate = maxStreamingBitrate;
  }

  public OpenLiveStreamDto openToken(String openToken) {
    this.openToken = JsonNullable.of(openToken);
    return this;
  }

  /**
   * Gets or sets the open token.
   * @return openToken
  */
  
  @Schema(name = "OpenToken", description = "Gets or sets the open token.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpenToken")
  public JsonNullable<String> getOpenToken() {
    return openToken;
  }

  public void setOpenToken(JsonNullable<String> openToken) {
    this.openToken = openToken;
  }

  public OpenLiveStreamDto playSessionId(String playSessionId) {
    this.playSessionId = JsonNullable.of(playSessionId);
    return this;
  }

  /**
   * Gets or sets the play session id.
   * @return playSessionId
  */
  
  @Schema(name = "PlaySessionId", description = "Gets or sets the play session id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaySessionId")
  public JsonNullable<String> getPlaySessionId() {
    return playSessionId;
  }

  public void setPlaySessionId(JsonNullable<String> playSessionId) {
    this.playSessionId = playSessionId;
  }

  public OpenLiveStreamDto startTimeTicks(Long startTimeTicks) {
    this.startTimeTicks = JsonNullable.of(startTimeTicks);
    return this;
  }

  /**
   * Gets or sets the start time in ticks.
   * @return startTimeTicks
  */
  
  @Schema(name = "StartTimeTicks", description = "Gets or sets the start time in ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartTimeTicks")
  public JsonNullable<Long> getStartTimeTicks() {
    return startTimeTicks;
  }

  public void setStartTimeTicks(JsonNullable<Long> startTimeTicks) {
    this.startTimeTicks = startTimeTicks;
  }

  public OpenLiveStreamDto subtitleStreamIndex(Integer subtitleStreamIndex) {
    this.subtitleStreamIndex = JsonNullable.of(subtitleStreamIndex);
    return this;
  }

  /**
   * Gets or sets the subtitle stream index.
   * @return subtitleStreamIndex
  */
  
  @Schema(name = "SubtitleStreamIndex", description = "Gets or sets the subtitle stream index.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SubtitleStreamIndex")
  public JsonNullable<Integer> getSubtitleStreamIndex() {
    return subtitleStreamIndex;
  }

  public void setSubtitleStreamIndex(JsonNullable<Integer> subtitleStreamIndex) {
    this.subtitleStreamIndex = subtitleStreamIndex;
  }

  public OpenLiveStreamDto userId(UUID userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Gets or sets the user id.
   * @return userId
  */
  @Valid 
  @Schema(name = "UserId", description = "Gets or sets the user id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserId")
  public JsonNullable<UUID> getUserId() {
    return userId;
  }

  public void setUserId(JsonNullable<UUID> userId) {
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
    OpenLiveStreamDto openLiveStreamDto = (OpenLiveStreamDto) o;
    return equalsNullable(this.audioStreamIndex, openLiveStreamDto.audioStreamIndex) &&
        Objects.equals(this.deviceProfile, openLiveStreamDto.deviceProfile) &&
        equalsNullable(this.directPlayProtocols, openLiveStreamDto.directPlayProtocols) &&
        equalsNullable(this.enableDirectPlay, openLiveStreamDto.enableDirectPlay) &&
        equalsNullable(this.enableDirectStream, openLiveStreamDto.enableDirectStream) &&
        equalsNullable(this.itemId, openLiveStreamDto.itemId) &&
        equalsNullable(this.maxAudioChannels, openLiveStreamDto.maxAudioChannels) &&
        equalsNullable(this.maxStreamingBitrate, openLiveStreamDto.maxStreamingBitrate) &&
        equalsNullable(this.openToken, openLiveStreamDto.openToken) &&
        equalsNullable(this.playSessionId, openLiveStreamDto.playSessionId) &&
        equalsNullable(this.startTimeTicks, openLiveStreamDto.startTimeTicks) &&
        equalsNullable(this.subtitleStreamIndex, openLiveStreamDto.subtitleStreamIndex) &&
        equalsNullable(this.userId, openLiveStreamDto.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioStreamIndex), deviceProfile, hashCodeNullable(directPlayProtocols), hashCodeNullable(enableDirectPlay), hashCodeNullable(enableDirectStream), hashCodeNullable(itemId), hashCodeNullable(maxAudioChannels), hashCodeNullable(maxStreamingBitrate), hashCodeNullable(openToken), hashCodeNullable(playSessionId), hashCodeNullable(startTimeTicks), hashCodeNullable(subtitleStreamIndex), hashCodeNullable(userId));
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
    sb.append("class OpenLiveStreamDto {\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    deviceProfile: ").append(toIndentedString(deviceProfile)).append("\n");
    sb.append("    directPlayProtocols: ").append(toIndentedString(directPlayProtocols)).append("\n");
    sb.append("    enableDirectPlay: ").append(toIndentedString(enableDirectPlay)).append("\n");
    sb.append("    enableDirectStream: ").append(toIndentedString(enableDirectStream)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    maxAudioChannels: ").append(toIndentedString(maxAudioChannels)).append("\n");
    sb.append("    maxStreamingBitrate: ").append(toIndentedString(maxStreamingBitrate)).append("\n");
    sb.append("    openToken: ").append(toIndentedString(openToken)).append("\n");
    sb.append("    playSessionId: ").append(toIndentedString(playSessionId)).append("\n");
    sb.append("    startTimeTicks: ").append(toIndentedString(startTimeTicks)).append("\n");
    sb.append("    subtitleStreamIndex: ").append(toIndentedString(subtitleStreamIndex)).append("\n");
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

