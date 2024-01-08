package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.IsoType;
import org.openapitools.model.MediaAttachment;
import org.openapitools.model.MediaProtocol;
import org.openapitools.model.MediaSourceType;
import org.openapitools.model.MediaStream;
import org.openapitools.model.TransportStreamTimestamp;
import org.openapitools.model.Video3DFormat;
import org.openapitools.model.VideoType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * MediaSourceInfo
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MediaSourceInfo {

  private JsonNullable<Integer> analyzeDurationMs = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> bitrate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> bufferMs = JsonNullable.<Integer>undefined();

  private JsonNullable<String> container = JsonNullable.<String>undefined();

  private JsonNullable<Integer> defaultAudioStreamIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> defaultSubtitleStreamIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<String> etag = JsonNullable.<String>undefined();

  private JsonNullable<String> encoderPath = JsonNullable.<String>undefined();

  private MediaProtocol encoderProtocol;

  @Valid
  private JsonNullable<List<String>> formats = JsonNullable.<List<String>>undefined();

  private Boolean genPtsInput;

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private Boolean ignoreDts;

  private Boolean ignoreIndex;

  private Boolean isInfiniteStream;

  private Boolean isRemote;

  private IsoType isoType;

  private JsonNullable<String> liveStreamId = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<@Valid MediaAttachment>> mediaAttachments = JsonNullable.<List<@Valid MediaAttachment>>undefined();

  @Valid
  private JsonNullable<List<@Valid MediaStream>> mediaStreams = JsonNullable.<List<@Valid MediaStream>>undefined();

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> openToken = JsonNullable.<String>undefined();

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  private MediaProtocol protocol;

  private Boolean readAtNativeFramerate;

  @Valid
  private JsonNullable<Map<String, String>> requiredHttpHeaders = JsonNullable.<Map<String, String>>undefined();

  private Boolean requiresClosing;

  private Boolean requiresLooping;

  private Boolean requiresOpening;

  private JsonNullable<Long> runTimeTicks = JsonNullable.<Long>undefined();

  private JsonNullable<Long> size = JsonNullable.<Long>undefined();

  private Boolean supportsDirectPlay;

  private Boolean supportsDirectStream;

  private Boolean supportsProbing;

  private Boolean supportsTranscoding;

  private TransportStreamTimestamp timestamp;

  private JsonNullable<String> transcodingContainer = JsonNullable.<String>undefined();

  private JsonNullable<String> transcodingSubProtocol = JsonNullable.<String>undefined();

  private JsonNullable<String> transcodingUrl = JsonNullable.<String>undefined();

  private MediaSourceType type;

  private Video3DFormat video3DFormat;

  private VideoType videoType;

  public MediaSourceInfo analyzeDurationMs(Integer analyzeDurationMs) {
    this.analyzeDurationMs = JsonNullable.of(analyzeDurationMs);
    return this;
  }

  /**
   * Get analyzeDurationMs
   * @return analyzeDurationMs
  */
  
  @Schema(name = "AnalyzeDurationMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AnalyzeDurationMs")
  public JsonNullable<Integer> getAnalyzeDurationMs() {
    return analyzeDurationMs;
  }

  public void setAnalyzeDurationMs(JsonNullable<Integer> analyzeDurationMs) {
    this.analyzeDurationMs = analyzeDurationMs;
  }

  public MediaSourceInfo bitrate(Integer bitrate) {
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

  public MediaSourceInfo bufferMs(Integer bufferMs) {
    this.bufferMs = JsonNullable.of(bufferMs);
    return this;
  }

  /**
   * Get bufferMs
   * @return bufferMs
  */
  
  @Schema(name = "BufferMs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BufferMs")
  public JsonNullable<Integer> getBufferMs() {
    return bufferMs;
  }

  public void setBufferMs(JsonNullable<Integer> bufferMs) {
    this.bufferMs = bufferMs;
  }

  public MediaSourceInfo container(String container) {
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

  public MediaSourceInfo defaultAudioStreamIndex(Integer defaultAudioStreamIndex) {
    this.defaultAudioStreamIndex = JsonNullable.of(defaultAudioStreamIndex);
    return this;
  }

  /**
   * Get defaultAudioStreamIndex
   * @return defaultAudioStreamIndex
  */
  
  @Schema(name = "DefaultAudioStreamIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultAudioStreamIndex")
  public JsonNullable<Integer> getDefaultAudioStreamIndex() {
    return defaultAudioStreamIndex;
  }

  public void setDefaultAudioStreamIndex(JsonNullable<Integer> defaultAudioStreamIndex) {
    this.defaultAudioStreamIndex = defaultAudioStreamIndex;
  }

  public MediaSourceInfo defaultSubtitleStreamIndex(Integer defaultSubtitleStreamIndex) {
    this.defaultSubtitleStreamIndex = JsonNullable.of(defaultSubtitleStreamIndex);
    return this;
  }

  /**
   * Get defaultSubtitleStreamIndex
   * @return defaultSubtitleStreamIndex
  */
  
  @Schema(name = "DefaultSubtitleStreamIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DefaultSubtitleStreamIndex")
  public JsonNullable<Integer> getDefaultSubtitleStreamIndex() {
    return defaultSubtitleStreamIndex;
  }

  public void setDefaultSubtitleStreamIndex(JsonNullable<Integer> defaultSubtitleStreamIndex) {
    this.defaultSubtitleStreamIndex = defaultSubtitleStreamIndex;
  }

  public MediaSourceInfo etag(String etag) {
    this.etag = JsonNullable.of(etag);
    return this;
  }

  /**
   * Get etag
   * @return etag
  */
  
  @Schema(name = "ETag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ETag")
  public JsonNullable<String> getEtag() {
    return etag;
  }

  public void setEtag(JsonNullable<String> etag) {
    this.etag = etag;
  }

  public MediaSourceInfo encoderPath(String encoderPath) {
    this.encoderPath = JsonNullable.of(encoderPath);
    return this;
  }

  /**
   * Get encoderPath
   * @return encoderPath
  */
  
  @Schema(name = "EncoderPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EncoderPath")
  public JsonNullable<String> getEncoderPath() {
    return encoderPath;
  }

  public void setEncoderPath(JsonNullable<String> encoderPath) {
    this.encoderPath = encoderPath;
  }

  public MediaSourceInfo encoderProtocol(MediaProtocol encoderProtocol) {
    this.encoderProtocol = encoderProtocol;
    return this;
  }

  /**
   * Get encoderProtocol
   * @return encoderProtocol
  */
  @Valid 
  @Schema(name = "EncoderProtocol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EncoderProtocol")
  public MediaProtocol getEncoderProtocol() {
    return encoderProtocol;
  }

  public void setEncoderProtocol(MediaProtocol encoderProtocol) {
    this.encoderProtocol = encoderProtocol;
  }

  public MediaSourceInfo formats(List<String> formats) {
    this.formats = JsonNullable.of(formats);
    return this;
  }

  public MediaSourceInfo addFormatsItem(String formatsItem) {
    if (this.formats == null || !this.formats.isPresent()) {
      this.formats = JsonNullable.of(new ArrayList<>());
    }
    this.formats.get().add(formatsItem);
    return this;
  }

  /**
   * Get formats
   * @return formats
  */
  
  @Schema(name = "Formats", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Formats")
  public JsonNullable<List<String>> getFormats() {
    return formats;
  }

  public void setFormats(JsonNullable<List<String>> formats) {
    this.formats = formats;
  }

  public MediaSourceInfo genPtsInput(Boolean genPtsInput) {
    this.genPtsInput = genPtsInput;
    return this;
  }

  /**
   * Get genPtsInput
   * @return genPtsInput
  */
  
  @Schema(name = "GenPtsInput", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GenPtsInput")
  public Boolean getGenPtsInput() {
    return genPtsInput;
  }

  public void setGenPtsInput(Boolean genPtsInput) {
    this.genPtsInput = genPtsInput;
  }

  public MediaSourceInfo id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "Id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public MediaSourceInfo ignoreDts(Boolean ignoreDts) {
    this.ignoreDts = ignoreDts;
    return this;
  }

  /**
   * Get ignoreDts
   * @return ignoreDts
  */
  
  @Schema(name = "IgnoreDts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IgnoreDts")
  public Boolean getIgnoreDts() {
    return ignoreDts;
  }

  public void setIgnoreDts(Boolean ignoreDts) {
    this.ignoreDts = ignoreDts;
  }

  public MediaSourceInfo ignoreIndex(Boolean ignoreIndex) {
    this.ignoreIndex = ignoreIndex;
    return this;
  }

  /**
   * Get ignoreIndex
   * @return ignoreIndex
  */
  
  @Schema(name = "IgnoreIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IgnoreIndex")
  public Boolean getIgnoreIndex() {
    return ignoreIndex;
  }

  public void setIgnoreIndex(Boolean ignoreIndex) {
    this.ignoreIndex = ignoreIndex;
  }

  public MediaSourceInfo isInfiniteStream(Boolean isInfiniteStream) {
    this.isInfiniteStream = isInfiniteStream;
    return this;
  }

  /**
   * Get isInfiniteStream
   * @return isInfiniteStream
  */
  
  @Schema(name = "IsInfiniteStream", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsInfiniteStream")
  public Boolean getIsInfiniteStream() {
    return isInfiniteStream;
  }

  public void setIsInfiniteStream(Boolean isInfiniteStream) {
    this.isInfiniteStream = isInfiniteStream;
  }

  public MediaSourceInfo isRemote(Boolean isRemote) {
    this.isRemote = isRemote;
    return this;
  }

  /**
   * Differentiate internet url vs local network.
   * @return isRemote
  */
  
  @Schema(name = "IsRemote", description = "Differentiate internet url vs local network.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsRemote")
  public Boolean getIsRemote() {
    return isRemote;
  }

  public void setIsRemote(Boolean isRemote) {
    this.isRemote = isRemote;
  }

  public MediaSourceInfo isoType(IsoType isoType) {
    this.isoType = isoType;
    return this;
  }

  /**
   * Get isoType
   * @return isoType
  */
  @Valid 
  @Schema(name = "IsoType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsoType")
  public IsoType getIsoType() {
    return isoType;
  }

  public void setIsoType(IsoType isoType) {
    this.isoType = isoType;
  }

  public MediaSourceInfo liveStreamId(String liveStreamId) {
    this.liveStreamId = JsonNullable.of(liveStreamId);
    return this;
  }

  /**
   * Get liveStreamId
   * @return liveStreamId
  */
  
  @Schema(name = "LiveStreamId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LiveStreamId")
  public JsonNullable<String> getLiveStreamId() {
    return liveStreamId;
  }

  public void setLiveStreamId(JsonNullable<String> liveStreamId) {
    this.liveStreamId = liveStreamId;
  }

  public MediaSourceInfo mediaAttachments(List<@Valid MediaAttachment> mediaAttachments) {
    this.mediaAttachments = JsonNullable.of(mediaAttachments);
    return this;
  }

  public MediaSourceInfo addMediaAttachmentsItem(MediaAttachment mediaAttachmentsItem) {
    if (this.mediaAttachments == null || !this.mediaAttachments.isPresent()) {
      this.mediaAttachments = JsonNullable.of(new ArrayList<>());
    }
    this.mediaAttachments.get().add(mediaAttachmentsItem);
    return this;
  }

  /**
   * Get mediaAttachments
   * @return mediaAttachments
  */
  @Valid 
  @Schema(name = "MediaAttachments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaAttachments")
  public JsonNullable<List<@Valid MediaAttachment>> getMediaAttachments() {
    return mediaAttachments;
  }

  public void setMediaAttachments(JsonNullable<List<@Valid MediaAttachment>> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
  }

  public MediaSourceInfo mediaStreams(List<@Valid MediaStream> mediaStreams) {
    this.mediaStreams = JsonNullable.of(mediaStreams);
    return this;
  }

  public MediaSourceInfo addMediaStreamsItem(MediaStream mediaStreamsItem) {
    if (this.mediaStreams == null || !this.mediaStreams.isPresent()) {
      this.mediaStreams = JsonNullable.of(new ArrayList<>());
    }
    this.mediaStreams.get().add(mediaStreamsItem);
    return this;
  }

  /**
   * Get mediaStreams
   * @return mediaStreams
  */
  @Valid 
  @Schema(name = "MediaStreams", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MediaStreams")
  public JsonNullable<List<@Valid MediaStream>> getMediaStreams() {
    return mediaStreams;
  }

  public void setMediaStreams(JsonNullable<List<@Valid MediaStream>> mediaStreams) {
    this.mediaStreams = mediaStreams;
  }

  public MediaSourceInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "Name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public MediaSourceInfo openToken(String openToken) {
    this.openToken = JsonNullable.of(openToken);
    return this;
  }

  /**
   * Get openToken
   * @return openToken
  */
  
  @Schema(name = "OpenToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("OpenToken")
  public JsonNullable<String> getOpenToken() {
    return openToken;
  }

  public void setOpenToken(JsonNullable<String> openToken) {
    this.openToken = openToken;
  }

  public MediaSourceInfo path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public MediaSourceInfo protocol(MediaProtocol protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Get protocol
   * @return protocol
  */
  @Valid 
  @Schema(name = "Protocol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Protocol")
  public MediaProtocol getProtocol() {
    return protocol;
  }

  public void setProtocol(MediaProtocol protocol) {
    this.protocol = protocol;
  }

  public MediaSourceInfo readAtNativeFramerate(Boolean readAtNativeFramerate) {
    this.readAtNativeFramerate = readAtNativeFramerate;
    return this;
  }

  /**
   * Get readAtNativeFramerate
   * @return readAtNativeFramerate
  */
  
  @Schema(name = "ReadAtNativeFramerate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ReadAtNativeFramerate")
  public Boolean getReadAtNativeFramerate() {
    return readAtNativeFramerate;
  }

  public void setReadAtNativeFramerate(Boolean readAtNativeFramerate) {
    this.readAtNativeFramerate = readAtNativeFramerate;
  }

  public MediaSourceInfo requiredHttpHeaders(Map<String, String> requiredHttpHeaders) {
    this.requiredHttpHeaders = JsonNullable.of(requiredHttpHeaders);
    return this;
  }

  public MediaSourceInfo putRequiredHttpHeadersItem(String key, String requiredHttpHeadersItem) {
    if (this.requiredHttpHeaders == null || !this.requiredHttpHeaders.isPresent()) {
      this.requiredHttpHeaders = JsonNullable.of(new HashMap<>());
    }
    this.requiredHttpHeaders.get().put(key, requiredHttpHeadersItem);
    return this;
  }

  /**
   * Get requiredHttpHeaders
   * @return requiredHttpHeaders
  */
  
  @Schema(name = "RequiredHttpHeaders", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequiredHttpHeaders")
  public JsonNullable<Map<String, String>> getRequiredHttpHeaders() {
    return requiredHttpHeaders;
  }

  public void setRequiredHttpHeaders(JsonNullable<Map<String, String>> requiredHttpHeaders) {
    this.requiredHttpHeaders = requiredHttpHeaders;
  }

  public MediaSourceInfo requiresClosing(Boolean requiresClosing) {
    this.requiresClosing = requiresClosing;
    return this;
  }

  /**
   * Get requiresClosing
   * @return requiresClosing
  */
  
  @Schema(name = "RequiresClosing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequiresClosing")
  public Boolean getRequiresClosing() {
    return requiresClosing;
  }

  public void setRequiresClosing(Boolean requiresClosing) {
    this.requiresClosing = requiresClosing;
  }

  public MediaSourceInfo requiresLooping(Boolean requiresLooping) {
    this.requiresLooping = requiresLooping;
    return this;
  }

  /**
   * Get requiresLooping
   * @return requiresLooping
  */
  
  @Schema(name = "RequiresLooping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequiresLooping")
  public Boolean getRequiresLooping() {
    return requiresLooping;
  }

  public void setRequiresLooping(Boolean requiresLooping) {
    this.requiresLooping = requiresLooping;
  }

  public MediaSourceInfo requiresOpening(Boolean requiresOpening) {
    this.requiresOpening = requiresOpening;
    return this;
  }

  /**
   * Get requiresOpening
   * @return requiresOpening
  */
  
  @Schema(name = "RequiresOpening", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RequiresOpening")
  public Boolean getRequiresOpening() {
    return requiresOpening;
  }

  public void setRequiresOpening(Boolean requiresOpening) {
    this.requiresOpening = requiresOpening;
  }

  public MediaSourceInfo runTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = JsonNullable.of(runTimeTicks);
    return this;
  }

  /**
   * Get runTimeTicks
   * @return runTimeTicks
  */
  
  @Schema(name = "RunTimeTicks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RunTimeTicks")
  public JsonNullable<Long> getRunTimeTicks() {
    return runTimeTicks;
  }

  public void setRunTimeTicks(JsonNullable<Long> runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
  }

  public MediaSourceInfo size(Long size) {
    this.size = JsonNullable.of(size);
    return this;
  }

  /**
   * Get size
   * @return size
  */
  
  @Schema(name = "Size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Size")
  public JsonNullable<Long> getSize() {
    return size;
  }

  public void setSize(JsonNullable<Long> size) {
    this.size = size;
  }

  public MediaSourceInfo supportsDirectPlay(Boolean supportsDirectPlay) {
    this.supportsDirectPlay = supportsDirectPlay;
    return this;
  }

  /**
   * Get supportsDirectPlay
   * @return supportsDirectPlay
  */
  
  @Schema(name = "SupportsDirectPlay", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsDirectPlay")
  public Boolean getSupportsDirectPlay() {
    return supportsDirectPlay;
  }

  public void setSupportsDirectPlay(Boolean supportsDirectPlay) {
    this.supportsDirectPlay = supportsDirectPlay;
  }

  public MediaSourceInfo supportsDirectStream(Boolean supportsDirectStream) {
    this.supportsDirectStream = supportsDirectStream;
    return this;
  }

  /**
   * Get supportsDirectStream
   * @return supportsDirectStream
  */
  
  @Schema(name = "SupportsDirectStream", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsDirectStream")
  public Boolean getSupportsDirectStream() {
    return supportsDirectStream;
  }

  public void setSupportsDirectStream(Boolean supportsDirectStream) {
    this.supportsDirectStream = supportsDirectStream;
  }

  public MediaSourceInfo supportsProbing(Boolean supportsProbing) {
    this.supportsProbing = supportsProbing;
    return this;
  }

  /**
   * Get supportsProbing
   * @return supportsProbing
  */
  
  @Schema(name = "SupportsProbing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsProbing")
  public Boolean getSupportsProbing() {
    return supportsProbing;
  }

  public void setSupportsProbing(Boolean supportsProbing) {
    this.supportsProbing = supportsProbing;
  }

  public MediaSourceInfo supportsTranscoding(Boolean supportsTranscoding) {
    this.supportsTranscoding = supportsTranscoding;
    return this;
  }

  /**
   * Get supportsTranscoding
   * @return supportsTranscoding
  */
  
  @Schema(name = "SupportsTranscoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsTranscoding")
  public Boolean getSupportsTranscoding() {
    return supportsTranscoding;
  }

  public void setSupportsTranscoding(Boolean supportsTranscoding) {
    this.supportsTranscoding = supportsTranscoding;
  }

  public MediaSourceInfo timestamp(TransportStreamTimestamp timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @Valid 
  @Schema(name = "Timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Timestamp")
  public TransportStreamTimestamp getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(TransportStreamTimestamp timestamp) {
    this.timestamp = timestamp;
  }

  public MediaSourceInfo transcodingContainer(String transcodingContainer) {
    this.transcodingContainer = JsonNullable.of(transcodingContainer);
    return this;
  }

  /**
   * Get transcodingContainer
   * @return transcodingContainer
  */
  
  @Schema(name = "TranscodingContainer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TranscodingContainer")
  public JsonNullable<String> getTranscodingContainer() {
    return transcodingContainer;
  }

  public void setTranscodingContainer(JsonNullable<String> transcodingContainer) {
    this.transcodingContainer = transcodingContainer;
  }

  public MediaSourceInfo transcodingSubProtocol(String transcodingSubProtocol) {
    this.transcodingSubProtocol = JsonNullable.of(transcodingSubProtocol);
    return this;
  }

  /**
   * Get transcodingSubProtocol
   * @return transcodingSubProtocol
  */
  
  @Schema(name = "TranscodingSubProtocol", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TranscodingSubProtocol")
  public JsonNullable<String> getTranscodingSubProtocol() {
    return transcodingSubProtocol;
  }

  public void setTranscodingSubProtocol(JsonNullable<String> transcodingSubProtocol) {
    this.transcodingSubProtocol = transcodingSubProtocol;
  }

  public MediaSourceInfo transcodingUrl(String transcodingUrl) {
    this.transcodingUrl = JsonNullable.of(transcodingUrl);
    return this;
  }

  /**
   * Get transcodingUrl
   * @return transcodingUrl
  */
  
  @Schema(name = "TranscodingUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TranscodingUrl")
  public JsonNullable<String> getTranscodingUrl() {
    return transcodingUrl;
  }

  public void setTranscodingUrl(JsonNullable<String> transcodingUrl) {
    this.transcodingUrl = transcodingUrl;
  }

  public MediaSourceInfo type(MediaSourceType type) {
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
  public MediaSourceType getType() {
    return type;
  }

  public void setType(MediaSourceType type) {
    this.type = type;
  }

  public MediaSourceInfo video3DFormat(Video3DFormat video3DFormat) {
    this.video3DFormat = video3DFormat;
    return this;
  }

  /**
   * Get video3DFormat
   * @return video3DFormat
  */
  @Valid 
  @Schema(name = "Video3DFormat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Video3DFormat")
  public Video3DFormat getVideo3DFormat() {
    return video3DFormat;
  }

  public void setVideo3DFormat(Video3DFormat video3DFormat) {
    this.video3DFormat = video3DFormat;
  }

  public MediaSourceInfo videoType(VideoType videoType) {
    this.videoType = videoType;
    return this;
  }

  /**
   * Get videoType
   * @return videoType
  */
  @Valid 
  @Schema(name = "VideoType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VideoType")
  public VideoType getVideoType() {
    return videoType;
  }

  public void setVideoType(VideoType videoType) {
    this.videoType = videoType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaSourceInfo mediaSourceInfo = (MediaSourceInfo) o;
    return equalsNullable(this.analyzeDurationMs, mediaSourceInfo.analyzeDurationMs) &&
        equalsNullable(this.bitrate, mediaSourceInfo.bitrate) &&
        equalsNullable(this.bufferMs, mediaSourceInfo.bufferMs) &&
        equalsNullable(this.container, mediaSourceInfo.container) &&
        equalsNullable(this.defaultAudioStreamIndex, mediaSourceInfo.defaultAudioStreamIndex) &&
        equalsNullable(this.defaultSubtitleStreamIndex, mediaSourceInfo.defaultSubtitleStreamIndex) &&
        equalsNullable(this.etag, mediaSourceInfo.etag) &&
        equalsNullable(this.encoderPath, mediaSourceInfo.encoderPath) &&
        Objects.equals(this.encoderProtocol, mediaSourceInfo.encoderProtocol) &&
        equalsNullable(this.formats, mediaSourceInfo.formats) &&
        Objects.equals(this.genPtsInput, mediaSourceInfo.genPtsInput) &&
        equalsNullable(this.id, mediaSourceInfo.id) &&
        Objects.equals(this.ignoreDts, mediaSourceInfo.ignoreDts) &&
        Objects.equals(this.ignoreIndex, mediaSourceInfo.ignoreIndex) &&
        Objects.equals(this.isInfiniteStream, mediaSourceInfo.isInfiniteStream) &&
        Objects.equals(this.isRemote, mediaSourceInfo.isRemote) &&
        Objects.equals(this.isoType, mediaSourceInfo.isoType) &&
        equalsNullable(this.liveStreamId, mediaSourceInfo.liveStreamId) &&
        equalsNullable(this.mediaAttachments, mediaSourceInfo.mediaAttachments) &&
        equalsNullable(this.mediaStreams, mediaSourceInfo.mediaStreams) &&
        equalsNullable(this.name, mediaSourceInfo.name) &&
        equalsNullable(this.openToken, mediaSourceInfo.openToken) &&
        equalsNullable(this.path, mediaSourceInfo.path) &&
        Objects.equals(this.protocol, mediaSourceInfo.protocol) &&
        Objects.equals(this.readAtNativeFramerate, mediaSourceInfo.readAtNativeFramerate) &&
        equalsNullable(this.requiredHttpHeaders, mediaSourceInfo.requiredHttpHeaders) &&
        Objects.equals(this.requiresClosing, mediaSourceInfo.requiresClosing) &&
        Objects.equals(this.requiresLooping, mediaSourceInfo.requiresLooping) &&
        Objects.equals(this.requiresOpening, mediaSourceInfo.requiresOpening) &&
        equalsNullable(this.runTimeTicks, mediaSourceInfo.runTimeTicks) &&
        equalsNullable(this.size, mediaSourceInfo.size) &&
        Objects.equals(this.supportsDirectPlay, mediaSourceInfo.supportsDirectPlay) &&
        Objects.equals(this.supportsDirectStream, mediaSourceInfo.supportsDirectStream) &&
        Objects.equals(this.supportsProbing, mediaSourceInfo.supportsProbing) &&
        Objects.equals(this.supportsTranscoding, mediaSourceInfo.supportsTranscoding) &&
        Objects.equals(this.timestamp, mediaSourceInfo.timestamp) &&
        equalsNullable(this.transcodingContainer, mediaSourceInfo.transcodingContainer) &&
        equalsNullable(this.transcodingSubProtocol, mediaSourceInfo.transcodingSubProtocol) &&
        equalsNullable(this.transcodingUrl, mediaSourceInfo.transcodingUrl) &&
        Objects.equals(this.type, mediaSourceInfo.type) &&
        Objects.equals(this.video3DFormat, mediaSourceInfo.video3DFormat) &&
        Objects.equals(this.videoType, mediaSourceInfo.videoType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(analyzeDurationMs), hashCodeNullable(bitrate), hashCodeNullable(bufferMs), hashCodeNullable(container), hashCodeNullable(defaultAudioStreamIndex), hashCodeNullable(defaultSubtitleStreamIndex), hashCodeNullable(etag), hashCodeNullable(encoderPath), encoderProtocol, hashCodeNullable(formats), genPtsInput, hashCodeNullable(id), ignoreDts, ignoreIndex, isInfiniteStream, isRemote, isoType, hashCodeNullable(liveStreamId), hashCodeNullable(mediaAttachments), hashCodeNullable(mediaStreams), hashCodeNullable(name), hashCodeNullable(openToken), hashCodeNullable(path), protocol, readAtNativeFramerate, hashCodeNullable(requiredHttpHeaders), requiresClosing, requiresLooping, requiresOpening, hashCodeNullable(runTimeTicks), hashCodeNullable(size), supportsDirectPlay, supportsDirectStream, supportsProbing, supportsTranscoding, timestamp, hashCodeNullable(transcodingContainer), hashCodeNullable(transcodingSubProtocol), hashCodeNullable(transcodingUrl), type, video3DFormat, videoType);
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
    sb.append("class MediaSourceInfo {\n");
    sb.append("    analyzeDurationMs: ").append(toIndentedString(analyzeDurationMs)).append("\n");
    sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
    sb.append("    bufferMs: ").append(toIndentedString(bufferMs)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    defaultAudioStreamIndex: ").append(toIndentedString(defaultAudioStreamIndex)).append("\n");
    sb.append("    defaultSubtitleStreamIndex: ").append(toIndentedString(defaultSubtitleStreamIndex)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    encoderPath: ").append(toIndentedString(encoderPath)).append("\n");
    sb.append("    encoderProtocol: ").append(toIndentedString(encoderProtocol)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    genPtsInput: ").append(toIndentedString(genPtsInput)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreDts: ").append(toIndentedString(ignoreDts)).append("\n");
    sb.append("    ignoreIndex: ").append(toIndentedString(ignoreIndex)).append("\n");
    sb.append("    isInfiniteStream: ").append(toIndentedString(isInfiniteStream)).append("\n");
    sb.append("    isRemote: ").append(toIndentedString(isRemote)).append("\n");
    sb.append("    isoType: ").append(toIndentedString(isoType)).append("\n");
    sb.append("    liveStreamId: ").append(toIndentedString(liveStreamId)).append("\n");
    sb.append("    mediaAttachments: ").append(toIndentedString(mediaAttachments)).append("\n");
    sb.append("    mediaStreams: ").append(toIndentedString(mediaStreams)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    openToken: ").append(toIndentedString(openToken)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    readAtNativeFramerate: ").append(toIndentedString(readAtNativeFramerate)).append("\n");
    sb.append("    requiredHttpHeaders: ").append(toIndentedString(requiredHttpHeaders)).append("\n");
    sb.append("    requiresClosing: ").append(toIndentedString(requiresClosing)).append("\n");
    sb.append("    requiresLooping: ").append(toIndentedString(requiresLooping)).append("\n");
    sb.append("    requiresOpening: ").append(toIndentedString(requiresOpening)).append("\n");
    sb.append("    runTimeTicks: ").append(toIndentedString(runTimeTicks)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    supportsDirectPlay: ").append(toIndentedString(supportsDirectPlay)).append("\n");
    sb.append("    supportsDirectStream: ").append(toIndentedString(supportsDirectStream)).append("\n");
    sb.append("    supportsProbing: ").append(toIndentedString(supportsProbing)).append("\n");
    sb.append("    supportsTranscoding: ").append(toIndentedString(supportsTranscoding)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    transcodingContainer: ").append(toIndentedString(transcodingContainer)).append("\n");
    sb.append("    transcodingSubProtocol: ").append(toIndentedString(transcodingSubProtocol)).append("\n");
    sb.append("    transcodingUrl: ").append(toIndentedString(transcodingUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    video3DFormat: ").append(toIndentedString(video3DFormat)).append("\n");
    sb.append("    videoType: ").append(toIndentedString(videoType)).append("\n");
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

