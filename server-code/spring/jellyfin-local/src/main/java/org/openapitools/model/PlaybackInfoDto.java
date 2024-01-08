package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeviceProfile;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Plabyback info dto.
 */

@Schema(name = "PlaybackInfoDto", description = "Plabyback info dto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PlaybackInfoDto {

  private JsonNullable<Boolean> allowAudioStreamCopy = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> allowVideoStreamCopy = JsonNullable.<Boolean>undefined();

  private JsonNullable<Integer> audioStreamIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<Boolean> autoOpenLiveStream = JsonNullable.<Boolean>undefined();

  private DeviceProfile deviceProfile;

  private JsonNullable<Boolean> enableDirectPlay = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> enableDirectStream = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> enableTranscoding = JsonNullable.<Boolean>undefined();

  private JsonNullable<String> liveStreamId = JsonNullable.<String>undefined();

  private JsonNullable<Integer> maxAudioChannels = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxStreamingBitrate = JsonNullable.<Integer>undefined();

  private JsonNullable<String> mediaSourceId = JsonNullable.<String>undefined();

  private JsonNullable<Long> startTimeTicks = JsonNullable.<Long>undefined();

  private JsonNullable<Integer> subtitleStreamIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<UUID> userId = JsonNullable.<UUID>undefined();

  public PlaybackInfoDto allowAudioStreamCopy(Boolean allowAudioStreamCopy) {
    this.allowAudioStreamCopy = JsonNullable.of(allowAudioStreamCopy);
    return this;
  }

  /**
   * Gets or sets a value indicating whether to allow audio stream copy.
   * @return allowAudioStreamCopy
  */
  
  @Schema(name = "AllowAudioStreamCopy", description = "Gets or sets a value indicating whether to allow audio stream copy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AllowAudioStreamCopy")
  public JsonNullable<Boolean> getAllowAudioStreamCopy() {
    return allowAudioStreamCopy;
  }

  public void setAllowAudioStreamCopy(JsonNullable<Boolean> allowAudioStreamCopy) {
    this.allowAudioStreamCopy = allowAudioStreamCopy;
  }

  public PlaybackInfoDto allowVideoStreamCopy(Boolean allowVideoStreamCopy) {
    this.allowVideoStreamCopy = JsonNullable.of(allowVideoStreamCopy);
    return this;
  }

  /**
   * Gets or sets a value indicating whether to enable video stream copy.
   * @return allowVideoStreamCopy
  */
  
  @Schema(name = "AllowVideoStreamCopy", description = "Gets or sets a value indicating whether to enable video stream copy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AllowVideoStreamCopy")
  public JsonNullable<Boolean> getAllowVideoStreamCopy() {
    return allowVideoStreamCopy;
  }

  public void setAllowVideoStreamCopy(JsonNullable<Boolean> allowVideoStreamCopy) {
    this.allowVideoStreamCopy = allowVideoStreamCopy;
  }

  public PlaybackInfoDto audioStreamIndex(Integer audioStreamIndex) {
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

  public PlaybackInfoDto autoOpenLiveStream(Boolean autoOpenLiveStream) {
    this.autoOpenLiveStream = JsonNullable.of(autoOpenLiveStream);
    return this;
  }

  /**
   * Gets or sets a value indicating whether to auto open the live stream.
   * @return autoOpenLiveStream
  */
  
  @Schema(name = "AutoOpenLiveStream", description = "Gets or sets a value indicating whether to auto open the live stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AutoOpenLiveStream")
  public JsonNullable<Boolean> getAutoOpenLiveStream() {
    return autoOpenLiveStream;
  }

  public void setAutoOpenLiveStream(JsonNullable<Boolean> autoOpenLiveStream) {
    this.autoOpenLiveStream = autoOpenLiveStream;
  }

  public PlaybackInfoDto deviceProfile(DeviceProfile deviceProfile) {
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

  public PlaybackInfoDto enableDirectPlay(Boolean enableDirectPlay) {
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

  public PlaybackInfoDto enableDirectStream(Boolean enableDirectStream) {
    this.enableDirectStream = JsonNullable.of(enableDirectStream);
    return this;
  }

  /**
   * Gets or sets a value indicating whether to enable direct stream.
   * @return enableDirectStream
  */
  
  @Schema(name = "EnableDirectStream", description = "Gets or sets a value indicating whether to enable direct stream.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableDirectStream")
  public JsonNullable<Boolean> getEnableDirectStream() {
    return enableDirectStream;
  }

  public void setEnableDirectStream(JsonNullable<Boolean> enableDirectStream) {
    this.enableDirectStream = enableDirectStream;
  }

  public PlaybackInfoDto enableTranscoding(Boolean enableTranscoding) {
    this.enableTranscoding = JsonNullable.of(enableTranscoding);
    return this;
  }

  /**
   * Gets or sets a value indicating whether to enable transcoding.
   * @return enableTranscoding
  */
  
  @Schema(name = "EnableTranscoding", description = "Gets or sets a value indicating whether to enable transcoding.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableTranscoding")
  public JsonNullable<Boolean> getEnableTranscoding() {
    return enableTranscoding;
  }

  public void setEnableTranscoding(JsonNullable<Boolean> enableTranscoding) {
    this.enableTranscoding = enableTranscoding;
  }

  public PlaybackInfoDto liveStreamId(String liveStreamId) {
    this.liveStreamId = JsonNullable.of(liveStreamId);
    return this;
  }

  /**
   * Gets or sets the live stream id.
   * @return liveStreamId
  */
  
  @Schema(name = "LiveStreamId", description = "Gets or sets the live stream id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LiveStreamId")
  public JsonNullable<String> getLiveStreamId() {
    return liveStreamId;
  }

  public void setLiveStreamId(JsonNullable<String> liveStreamId) {
    this.liveStreamId = liveStreamId;
  }

  public PlaybackInfoDto maxAudioChannels(Integer maxAudioChannels) {
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

  public PlaybackInfoDto maxStreamingBitrate(Integer maxStreamingBitrate) {
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

  public PlaybackInfoDto mediaSourceId(String mediaSourceId) {
    this.mediaSourceId = JsonNullable.of(mediaSourceId);
    return this;
  }

  /**
   * Gets or sets the media source id.
   * @return mediaSourceId
  */
  
  @Schema(name = "MediaSourceId", description = "Gets or sets the media source id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaSourceId")
  public JsonNullable<String> getMediaSourceId() {
    return mediaSourceId;
  }

  public void setMediaSourceId(JsonNullable<String> mediaSourceId) {
    this.mediaSourceId = mediaSourceId;
  }

  public PlaybackInfoDto startTimeTicks(Long startTimeTicks) {
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

  public PlaybackInfoDto subtitleStreamIndex(Integer subtitleStreamIndex) {
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

  public PlaybackInfoDto userId(UUID userId) {
    this.userId = JsonNullable.of(userId);
    return this;
  }

  /**
   * Gets or sets the playback userId.
   * @return userId
  */
  @Valid 
  @Schema(name = "UserId", description = "Gets or sets the playback userId.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PlaybackInfoDto playbackInfoDto = (PlaybackInfoDto) o;
    return equalsNullable(this.allowAudioStreamCopy, playbackInfoDto.allowAudioStreamCopy) &&
        equalsNullable(this.allowVideoStreamCopy, playbackInfoDto.allowVideoStreamCopy) &&
        equalsNullable(this.audioStreamIndex, playbackInfoDto.audioStreamIndex) &&
        equalsNullable(this.autoOpenLiveStream, playbackInfoDto.autoOpenLiveStream) &&
        Objects.equals(this.deviceProfile, playbackInfoDto.deviceProfile) &&
        equalsNullable(this.enableDirectPlay, playbackInfoDto.enableDirectPlay) &&
        equalsNullable(this.enableDirectStream, playbackInfoDto.enableDirectStream) &&
        equalsNullable(this.enableTranscoding, playbackInfoDto.enableTranscoding) &&
        equalsNullable(this.liveStreamId, playbackInfoDto.liveStreamId) &&
        equalsNullable(this.maxAudioChannels, playbackInfoDto.maxAudioChannels) &&
        equalsNullable(this.maxStreamingBitrate, playbackInfoDto.maxStreamingBitrate) &&
        equalsNullable(this.mediaSourceId, playbackInfoDto.mediaSourceId) &&
        equalsNullable(this.startTimeTicks, playbackInfoDto.startTimeTicks) &&
        equalsNullable(this.subtitleStreamIndex, playbackInfoDto.subtitleStreamIndex) &&
        equalsNullable(this.userId, playbackInfoDto.userId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(allowAudioStreamCopy), hashCodeNullable(allowVideoStreamCopy), hashCodeNullable(audioStreamIndex), hashCodeNullable(autoOpenLiveStream), deviceProfile, hashCodeNullable(enableDirectPlay), hashCodeNullable(enableDirectStream), hashCodeNullable(enableTranscoding), hashCodeNullable(liveStreamId), hashCodeNullable(maxAudioChannels), hashCodeNullable(maxStreamingBitrate), hashCodeNullable(mediaSourceId), hashCodeNullable(startTimeTicks), hashCodeNullable(subtitleStreamIndex), hashCodeNullable(userId));
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
    sb.append("class PlaybackInfoDto {\n");
    sb.append("    allowAudioStreamCopy: ").append(toIndentedString(allowAudioStreamCopy)).append("\n");
    sb.append("    allowVideoStreamCopy: ").append(toIndentedString(allowVideoStreamCopy)).append("\n");
    sb.append("    audioStreamIndex: ").append(toIndentedString(audioStreamIndex)).append("\n");
    sb.append("    autoOpenLiveStream: ").append(toIndentedString(autoOpenLiveStream)).append("\n");
    sb.append("    deviceProfile: ").append(toIndentedString(deviceProfile)).append("\n");
    sb.append("    enableDirectPlay: ").append(toIndentedString(enableDirectPlay)).append("\n");
    sb.append("    enableDirectStream: ").append(toIndentedString(enableDirectStream)).append("\n");
    sb.append("    enableTranscoding: ").append(toIndentedString(enableTranscoding)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    maxAudioChannels: ").append(toIndentedString(maxAudioChannels)).append("\n");
    sb.append("    maxStreamingBitrate: ").append(toIndentedString(maxStreamingBitrate)).append("\n");
    sb.append("    mediaSourceId: ").append(toIndentedString(mediaSourceId)).append("\n");
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

