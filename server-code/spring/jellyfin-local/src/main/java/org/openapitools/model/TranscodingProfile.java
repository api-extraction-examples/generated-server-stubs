package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DlnaProfileType;
import org.openapitools.model.EncodingContext;
import org.openapitools.model.TranscodeSeekInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TranscodingProfile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TranscodingProfile {

  private JsonNullable<String> audioCodec = JsonNullable.<String>undefined();

  private Boolean breakOnNonKeyFrames;

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  private EncodingContext context;

  private Boolean copyTimestamps;

  private Boolean enableMpegtsM2TsMode;

  private Boolean enableSubtitlesInManifest;

  private Boolean estimateContentLength;

  private JsonNullable<String> maxAudioChannels = JsonNullable.<String>undefined();

  private Integer minSegments;

  private JsonNullable<String> protocol = JsonNullable.<String>undefined();

  private Integer segmentLength;

  private TranscodeSeekInfo transcodeSeekInfo;

  private DlnaProfileType type;

  private JsonNullable<String> videoCodec = JsonNullable.<String>undefined();

  public TranscodingProfile audioCodec(String audioCodec) {
    this.audioCodec = JsonNullable.of(audioCodec);
    return this;
  }

  /**
   * Get audioCodec
   * @return audioCodec
  */
  
  @Schema(name = "AudioCodec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioCodec")
  public JsonNullable<String> getAudioCodec() {
    return audioCodec;
  }

  public void setAudioCodec(JsonNullable<String> audioCodec) {
    this.audioCodec = audioCodec;
  }

  public TranscodingProfile breakOnNonKeyFrames(Boolean breakOnNonKeyFrames) {
    this.breakOnNonKeyFrames = breakOnNonKeyFrames;
    return this;
  }

  /**
   * Get breakOnNonKeyFrames
   * @return breakOnNonKeyFrames
  */
  
  @Schema(name = "BreakOnNonKeyFrames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BreakOnNonKeyFrames")
  public Boolean getBreakOnNonKeyFrames() {
    return breakOnNonKeyFrames;
  }

  public void setBreakOnNonKeyFrames(Boolean breakOnNonKeyFrames) {
    this.breakOnNonKeyFrames = breakOnNonKeyFrames;
  }

  public TranscodingProfile container(String container) {
    this.container = JsonNullable.of(container);
    return this;
  }

  /**
   * Get container
   * @return container
  */
  
  @Schema(name = "Container", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Container")
  public JsonNullable<String> getContainer() {
    return container;
  }

  public void setContainer(JsonNullable<String> container) {
    this.container = container;
  }

  public TranscodingProfile context(EncodingContext context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  @Valid 
  @Schema(name = "Context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Context")
  public EncodingContext getContext() {
    return context;
  }

  public void setContext(EncodingContext context) {
    this.context = context;
  }

  public TranscodingProfile copyTimestamps(Boolean copyTimestamps) {
    this.copyTimestamps = copyTimestamps;
    return this;
  }

  /**
   * Get copyTimestamps
   * @return copyTimestamps
  */
  
  @Schema(name = "CopyTimestamps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CopyTimestamps")
  public Boolean getCopyTimestamps() {
    return copyTimestamps;
  }

  public void setCopyTimestamps(Boolean copyTimestamps) {
    this.copyTimestamps = copyTimestamps;
  }

  public TranscodingProfile enableMpegtsM2TsMode(Boolean enableMpegtsM2TsMode) {
    this.enableMpegtsM2TsMode = enableMpegtsM2TsMode;
    return this;
  }

  /**
   * Get enableMpegtsM2TsMode
   * @return enableMpegtsM2TsMode
  */
  
  @Schema(name = "EnableMpegtsM2TsMode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableMpegtsM2TsMode")
  public Boolean getEnableMpegtsM2TsMode() {
    return enableMpegtsM2TsMode;
  }

  public void setEnableMpegtsM2TsMode(Boolean enableMpegtsM2TsMode) {
    this.enableMpegtsM2TsMode = enableMpegtsM2TsMode;
  }

  public TranscodingProfile enableSubtitlesInManifest(Boolean enableSubtitlesInManifest) {
    this.enableSubtitlesInManifest = enableSubtitlesInManifest;
    return this;
  }

  /**
   * Get enableSubtitlesInManifest
   * @return enableSubtitlesInManifest
  */
  
  @Schema(name = "EnableSubtitlesInManifest", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EnableSubtitlesInManifest")
  public Boolean getEnableSubtitlesInManifest() {
    return enableSubtitlesInManifest;
  }

  public void setEnableSubtitlesInManifest(Boolean enableSubtitlesInManifest) {
    this.enableSubtitlesInManifest = enableSubtitlesInManifest;
  }

  public TranscodingProfile estimateContentLength(Boolean estimateContentLength) {
    this.estimateContentLength = estimateContentLength;
    return this;
  }

  /**
   * Get estimateContentLength
   * @return estimateContentLength
  */
  
  @Schema(name = "EstimateContentLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EstimateContentLength")
  public Boolean getEstimateContentLength() {
    return estimateContentLength;
  }

  public void setEstimateContentLength(Boolean estimateContentLength) {
    this.estimateContentLength = estimateContentLength;
  }

  public TranscodingProfile maxAudioChannels(String maxAudioChannels) {
    this.maxAudioChannels = JsonNullable.of(maxAudioChannels);
    return this;
  }

  /**
   * Get maxAudioChannels
   * @return maxAudioChannels
  */
  
  @Schema(name = "MaxAudioChannels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxAudioChannels")
  public JsonNullable<String> getMaxAudioChannels() {
    return maxAudioChannels;
  }

  public void setMaxAudioChannels(JsonNullable<String> maxAudioChannels) {
    this.maxAudioChannels = maxAudioChannels;
  }

  public TranscodingProfile minSegments(Integer minSegments) {
    this.minSegments = minSegments;
    return this;
  }

  /**
   * Get minSegments
   * @return minSegments
  */
  
  @Schema(name = "MinSegments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MinSegments")
  public Integer getMinSegments() {
    return minSegments;
  }

  public void setMinSegments(Integer minSegments) {
    this.minSegments = minSegments;
  }

  public TranscodingProfile protocol(String protocol) {
    this.protocol = JsonNullable.of(protocol);
    return this;
  }

  /**
   * Get protocol
   * @return protocol
  */
  
  @Schema(name = "Protocol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Protocol")
  public JsonNullable<String> getProtocol() {
    return protocol;
  }

  public void setProtocol(JsonNullable<String> protocol) {
    this.protocol = protocol;
  }

  public TranscodingProfile segmentLength(Integer segmentLength) {
    this.segmentLength = segmentLength;
    return this;
  }

  /**
   * Get segmentLength
   * @return segmentLength
  */
  
  @Schema(name = "SegmentLength", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SegmentLength")
  public Integer getSegmentLength() {
    return segmentLength;
  }

  public void setSegmentLength(Integer segmentLength) {
    this.segmentLength = segmentLength;
  }

  public TranscodingProfile transcodeSeekInfo(TranscodeSeekInfo transcodeSeekInfo) {
    this.transcodeSeekInfo = transcodeSeekInfo;
    return this;
  }

  /**
   * Get transcodeSeekInfo
   * @return transcodeSeekInfo
  */
  @Valid 
  @Schema(name = "TranscodeSeekInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TranscodeSeekInfo")
  public TranscodeSeekInfo getTranscodeSeekInfo() {
    return transcodeSeekInfo;
  }

  public void setTranscodeSeekInfo(TranscodeSeekInfo transcodeSeekInfo) {
    this.transcodeSeekInfo = transcodeSeekInfo;
  }

  public TranscodingProfile type(DlnaProfileType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public DlnaProfileType getType() {
    return type;
  }

  public void setType(DlnaProfileType type) {
    this.type = type;
  }

  public TranscodingProfile videoCodec(String videoCodec) {
    this.videoCodec = JsonNullable.of(videoCodec);
    return this;
  }

  /**
   * Get videoCodec
   * @return videoCodec
  */
  
  @Schema(name = "VideoCodec", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VideoCodec")
  public JsonNullable<String> getVideoCodec() {
    return videoCodec;
  }

  public void setVideoCodec(JsonNullable<String> videoCodec) {
    this.videoCodec = videoCodec;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscodingProfile transcodingProfile = (TranscodingProfile) o;
    return equalsNullable(this.audioCodec, transcodingProfile.audioCodec) &&
        Objects.equals(this.breakOnNonKeyFrames, transcodingProfile.breakOnNonKeyFrames) &&
        equalsNullable(this.container, transcodingProfile.container) &&
        Objects.equals(this.context, transcodingProfile.context) &&
        Objects.equals(this.copyTimestamps, transcodingProfile.copyTimestamps) &&
        Objects.equals(this.enableMpegtsM2TsMode, transcodingProfile.enableMpegtsM2TsMode) &&
        Objects.equals(this.enableSubtitlesInManifest, transcodingProfile.enableSubtitlesInManifest) &&
        Objects.equals(this.estimateContentLength, transcodingProfile.estimateContentLength) &&
        equalsNullable(this.maxAudioChannels, transcodingProfile.maxAudioChannels) &&
        Objects.equals(this.minSegments, transcodingProfile.minSegments) &&
        equalsNullable(this.protocol, transcodingProfile.protocol) &&
        Objects.equals(this.segmentLength, transcodingProfile.segmentLength) &&
        Objects.equals(this.transcodeSeekInfo, transcodingProfile.transcodeSeekInfo) &&
        Objects.equals(this.type, transcodingProfile.type) &&
        equalsNullable(this.videoCodec, transcodingProfile.videoCodec);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioCodec), breakOnNonKeyFrames, hashCodeNullable(container), context, copyTimestamps, enableMpegtsM2TsMode, enableSubtitlesInManifest, estimateContentLength, hashCodeNullable(maxAudioChannels), minSegments, hashCodeNullable(protocol), segmentLength, transcodeSeekInfo, type, hashCodeNullable(videoCodec));
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
    sb.append("class TranscodingProfile {\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    breakOnNonKeyFrames: ").append(toIndentedString(breakOnNonKeyFrames)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    copyTimestamps: ").append(toIndentedString(copyTimestamps)).append("\n");
    sb.append("    enableMpegtsM2TsMode: ").append(toIndentedString(enableMpegtsM2TsMode)).append("\n");
    sb.append("    enableSubtitlesInManifest: ").append(toIndentedString(enableSubtitlesInManifest)).append("\n");
    sb.append("    estimateContentLength: ").append(toIndentedString(estimateContentLength)).append("\n");
    sb.append("    maxAudioChannels: ").append(toIndentedString(maxAudioChannels)).append("\n");
    sb.append("    minSegments: ").append(toIndentedString(minSegments)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    segmentLength: ").append(toIndentedString(segmentLength)).append("\n");
    sb.append("    transcodeSeekInfo: ").append(toIndentedString(transcodeSeekInfo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
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

