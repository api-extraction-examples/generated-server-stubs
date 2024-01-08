package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TranscodeReason;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TranscodingInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TranscodingInfo {

  private JsonNullable<Integer> audioChannels = JsonNullable.<Integer>undefined();

  private JsonNullable<String> audioCodec = JsonNullable.<String>undefined();

  private JsonNullable<Integer> bitrate = JsonNullable.<Integer>undefined();

  private JsonNullable<Double> completionPercentage = JsonNullable.<Double>undefined();

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  private JsonNullable<Float> framerate = JsonNullable.<Float>undefined();

  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  private Boolean isAudioDirect;

  private Boolean isVideoDirect;

  @Valid
  private JsonNullable<List<@Valid TranscodeReason>> transcodeReasons = JsonNullable.<List<@Valid TranscodeReason>>undefined();

  private JsonNullable<String> videoCodec = JsonNullable.<String>undefined();

  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  public TranscodingInfo audioChannels(Integer audioChannels) {
    this.audioChannels = JsonNullable.of(audioChannels);
    return this;
  }

  /**
   * Get audioChannels
   * @return audioChannels
  */
  
  @Schema(name = "AudioChannels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AudioChannels")
  public JsonNullable<Integer> getAudioChannels() {
    return audioChannels;
  }

  public void setAudioChannels(JsonNullable<Integer> audioChannels) {
    this.audioChannels = audioChannels;
  }

  public TranscodingInfo audioCodec(String audioCodec) {
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

  public TranscodingInfo bitrate(Integer bitrate) {
    this.bitrate = JsonNullable.of(bitrate);
    return this;
  }

  /**
   * Get bitrate
   * @return bitrate
  */
  
  @Schema(name = "Bitrate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Bitrate")
  public JsonNullable<Integer> getBitrate() {
    return bitrate;
  }

  public void setBitrate(JsonNullable<Integer> bitrate) {
    this.bitrate = bitrate;
  }

  public TranscodingInfo completionPercentage(Double completionPercentage) {
    this.completionPercentage = JsonNullable.of(completionPercentage);
    return this;
  }

  /**
   * Get completionPercentage
   * @return completionPercentage
  */
  
  @Schema(name = "CompletionPercentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CompletionPercentage")
  public JsonNullable<Double> getCompletionPercentage() {
    return completionPercentage;
  }

  public void setCompletionPercentage(JsonNullable<Double> completionPercentage) {
    this.completionPercentage = completionPercentage;
  }

  public TranscodingInfo container(String container) {
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

  public TranscodingInfo framerate(Float framerate) {
    this.framerate = JsonNullable.of(framerate);
    return this;
  }

  /**
   * Get framerate
   * @return framerate
  */
  
  @Schema(name = "Framerate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Framerate")
  public JsonNullable<Float> getFramerate() {
    return framerate;
  }

  public void setFramerate(JsonNullable<Float> framerate) {
    this.framerate = framerate;
  }

  public TranscodingInfo height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Get height
   * @return height
  */
  
  @Schema(name = "Height", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Height")
  public JsonNullable<Integer> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public TranscodingInfo isAudioDirect(Boolean isAudioDirect) {
    this.isAudioDirect = isAudioDirect;
    return this;
  }

  /**
   * Get isAudioDirect
   * @return isAudioDirect
  */
  
  @Schema(name = "IsAudioDirect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAudioDirect")
  public Boolean getIsAudioDirect() {
    return isAudioDirect;
  }

  public void setIsAudioDirect(Boolean isAudioDirect) {
    this.isAudioDirect = isAudioDirect;
  }

  public TranscodingInfo isVideoDirect(Boolean isVideoDirect) {
    this.isVideoDirect = isVideoDirect;
    return this;
  }

  /**
   * Get isVideoDirect
   * @return isVideoDirect
  */
  
  @Schema(name = "IsVideoDirect", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsVideoDirect")
  public Boolean getIsVideoDirect() {
    return isVideoDirect;
  }

  public void setIsVideoDirect(Boolean isVideoDirect) {
    this.isVideoDirect = isVideoDirect;
  }

  public TranscodingInfo transcodeReasons(List<@Valid TranscodeReason> transcodeReasons) {
    this.transcodeReasons = JsonNullable.of(transcodeReasons);
    return this;
  }

  public TranscodingInfo addTranscodeReasonsItem(TranscodeReason transcodeReasonsItem) {
    if (this.transcodeReasons == null || !this.transcodeReasons.isPresent()) {
      this.transcodeReasons = JsonNullable.of(new ArrayList<>());
    }
    this.transcodeReasons.get().add(transcodeReasonsItem);
    return this;
  }

  /**
   * Get transcodeReasons
   * @return transcodeReasons
  */
  @Valid 
  @Schema(name = "TranscodeReasons", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TranscodeReasons")
  public JsonNullable<List<@Valid TranscodeReason>> getTranscodeReasons() {
    return transcodeReasons;
  }

  public void setTranscodeReasons(JsonNullable<List<@Valid TranscodeReason>> transcodeReasons) {
    this.transcodeReasons = transcodeReasons;
  }

  public TranscodingInfo videoCodec(String videoCodec) {
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

  public TranscodingInfo width(Integer width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * Get width
   * @return width
  */
  
  @Schema(name = "Width", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Width")
  public JsonNullable<Integer> getWidth() {
    return width;
  }

  public void setWidth(JsonNullable<Integer> width) {
    this.width = width;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscodingInfo transcodingInfo = (TranscodingInfo) o;
    return equalsNullable(this.audioChannels, transcodingInfo.audioChannels) &&
        equalsNullable(this.audioCodec, transcodingInfo.audioCodec) &&
        equalsNullable(this.bitrate, transcodingInfo.bitrate) &&
        equalsNullable(this.completionPercentage, transcodingInfo.completionPercentage) &&
        equalsNullable(this.container, transcodingInfo.container) &&
        equalsNullable(this.framerate, transcodingInfo.framerate) &&
        equalsNullable(this.height, transcodingInfo.height) &&
        Objects.equals(this.isAudioDirect, transcodingInfo.isAudioDirect) &&
        Objects.equals(this.isVideoDirect, transcodingInfo.isVideoDirect) &&
        equalsNullable(this.transcodeReasons, transcodingInfo.transcodeReasons) &&
        equalsNullable(this.videoCodec, transcodingInfo.videoCodec) &&
        equalsNullable(this.width, transcodingInfo.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(audioChannels), hashCodeNullable(audioCodec), hashCodeNullable(bitrate), hashCodeNullable(completionPercentage), hashCodeNullable(container), hashCodeNullable(framerate), hashCodeNullable(height), isAudioDirect, isVideoDirect, hashCodeNullable(transcodeReasons), hashCodeNullable(videoCodec), hashCodeNullable(width));
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
    sb.append("class TranscodingInfo {\n");
    sb.append("    audioChannels: ").append(toIndentedString(audioChannels)).append("\n");
    sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    framerate: ").append(toIndentedString(framerate)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isAudioDirect: ").append(toIndentedString(isAudioDirect)).append("\n");
    sb.append("    isVideoDirect: ").append(toIndentedString(isVideoDirect)).append("\n");
    sb.append("    transcodeReasons: ").append(toIndentedString(transcodeReasons)).append("\n");
    sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

