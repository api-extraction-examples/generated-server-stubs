package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MediaStreamType;
import org.openapitools.model.SubtitleDeliveryMethod;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class MediaStream.
 */

@Schema(name = "MediaStream", description = "Class MediaStream.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class MediaStream {

  private JsonNullable<String> aspectRatio = JsonNullable.<String>undefined();

  private JsonNullable<Float> averageFrameRate = JsonNullable.<Float>undefined();

  private JsonNullable<Integer> bitDepth = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> bitRate = JsonNullable.<Integer>undefined();

  private JsonNullable<String> channelLayout = JsonNullable.<String>undefined();

  private JsonNullable<Integer> channels = JsonNullable.<Integer>undefined();

  private JsonNullable<String> codec = JsonNullable.<String>undefined();

  private JsonNullable<String> codecTag = JsonNullable.<String>undefined();

  private JsonNullable<String> codecTimeBase = JsonNullable.<String>undefined();

  private JsonNullable<String> colorPrimaries = JsonNullable.<String>undefined();

  private JsonNullable<String> colorRange = JsonNullable.<String>undefined();

  private JsonNullable<String> colorSpace = JsonNullable.<String>undefined();

  private JsonNullable<String> colorTransfer = JsonNullable.<String>undefined();

  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  private SubtitleDeliveryMethod deliveryMethod;

  private JsonNullable<String> deliveryUrl = JsonNullable.<String>undefined();

  private JsonNullable<String> displayTitle = JsonNullable.<String>undefined();

  private JsonNullable<Integer> height = JsonNullable.<Integer>undefined();

  private Integer index;

  private JsonNullable<Boolean> isAVC = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isAnamorphic = JsonNullable.<Boolean>undefined();

  private Boolean isDefault;

  private Boolean isExternal;

  private JsonNullable<Boolean> isExternalUrl = JsonNullable.<Boolean>undefined();

  private Boolean isForced;

  private Boolean isInterlaced;

  private Boolean isTextSubtitleStream;

  private JsonNullable<String> language = JsonNullable.<String>undefined();

  private JsonNullable<Double> level = JsonNullable.<Double>undefined();

  private JsonNullable<String> nalLengthSize = JsonNullable.<String>undefined();

  private JsonNullable<Integer> packetLength = JsonNullable.<Integer>undefined();

  private JsonNullable<String> path = JsonNullable.<String>undefined();

  private JsonNullable<String> pixelFormat = JsonNullable.<String>undefined();

  private JsonNullable<String> profile = JsonNullable.<String>undefined();

  private JsonNullable<Float> realFrameRate = JsonNullable.<Float>undefined();

  private JsonNullable<Integer> refFrames = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> sampleRate = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> score = JsonNullable.<Integer>undefined();

  private Boolean supportsExternalStream;

  private JsonNullable<String> timeBase = JsonNullable.<String>undefined();

  private JsonNullable<String> title = JsonNullable.<String>undefined();

  private MediaStreamType type;

  private JsonNullable<String> videoRange = JsonNullable.<String>undefined();

  private JsonNullable<Integer> width = JsonNullable.<Integer>undefined();

  private JsonNullable<String> localizedDefault = JsonNullable.<String>undefined();

  private JsonNullable<String> localizedForced = JsonNullable.<String>undefined();

  private JsonNullable<String> localizedUndefined = JsonNullable.<String>undefined();

  public MediaStream aspectRatio(String aspectRatio) {
    this.aspectRatio = JsonNullable.of(aspectRatio);
    return this;
  }

  /**
   * Gets or sets the aspect ratio.
   * @return aspectRatio
  */
  
  @Schema(name = "AspectRatio", description = "Gets or sets the aspect ratio.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AspectRatio")
  public JsonNullable<String> getAspectRatio() {
    return aspectRatio;
  }

  public void setAspectRatio(JsonNullable<String> aspectRatio) {
    this.aspectRatio = aspectRatio;
  }

  public MediaStream averageFrameRate(Float averageFrameRate) {
    this.averageFrameRate = JsonNullable.of(averageFrameRate);
    return this;
  }

  /**
   * Gets or sets the average frame rate.
   * @return averageFrameRate
  */
  
  @Schema(name = "AverageFrameRate", description = "Gets or sets the average frame rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("AverageFrameRate")
  public JsonNullable<Float> getAverageFrameRate() {
    return averageFrameRate;
  }

  public void setAverageFrameRate(JsonNullable<Float> averageFrameRate) {
    this.averageFrameRate = averageFrameRate;
  }

  public MediaStream bitDepth(Integer bitDepth) {
    this.bitDepth = JsonNullable.of(bitDepth);
    return this;
  }

  /**
   * Gets or sets the bit depth.
   * @return bitDepth
  */
  
  @Schema(name = "BitDepth", description = "Gets or sets the bit depth.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BitDepth")
  public JsonNullable<Integer> getBitDepth() {
    return bitDepth;
  }

  public void setBitDepth(JsonNullable<Integer> bitDepth) {
    this.bitDepth = bitDepth;
  }

  public MediaStream bitRate(Integer bitRate) {
    this.bitRate = JsonNullable.of(bitRate);
    return this;
  }

  /**
   * Gets or sets the bit rate.
   * @return bitRate
  */
  
  @Schema(name = "BitRate", description = "Gets or sets the bit rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("BitRate")
  public JsonNullable<Integer> getBitRate() {
    return bitRate;
  }

  public void setBitRate(JsonNullable<Integer> bitRate) {
    this.bitRate = bitRate;
  }

  public MediaStream channelLayout(String channelLayout) {
    this.channelLayout = JsonNullable.of(channelLayout);
    return this;
  }

  /**
   * Gets or sets the channel layout.
   * @return channelLayout
  */
  
  @Schema(name = "ChannelLayout", description = "Gets or sets the channel layout.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelLayout")
  public JsonNullable<String> getChannelLayout() {
    return channelLayout;
  }

  public void setChannelLayout(JsonNullable<String> channelLayout) {
    this.channelLayout = channelLayout;
  }

  public MediaStream channels(Integer channels) {
    this.channels = JsonNullable.of(channels);
    return this;
  }

  /**
   * Gets or sets the channels.
   * @return channels
  */
  
  @Schema(name = "Channels", description = "Gets or sets the channels.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Channels")
  public JsonNullable<Integer> getChannels() {
    return channels;
  }

  public void setChannels(JsonNullable<Integer> channels) {
    this.channels = channels;
  }

  public MediaStream codec(String codec) {
    this.codec = JsonNullable.of(codec);
    return this;
  }

  /**
   * Gets or sets the codec.
   * @return codec
  */
  
  @Schema(name = "Codec", description = "Gets or sets the codec.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Codec")
  public JsonNullable<String> getCodec() {
    return codec;
  }

  public void setCodec(JsonNullable<String> codec) {
    this.codec = codec;
  }

  public MediaStream codecTag(String codecTag) {
    this.codecTag = JsonNullable.of(codecTag);
    return this;
  }

  /**
   * Gets or sets the codec tag.
   * @return codecTag
  */
  
  @Schema(name = "CodecTag", description = "Gets or sets the codec tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodecTag")
  public JsonNullable<String> getCodecTag() {
    return codecTag;
  }

  public void setCodecTag(JsonNullable<String> codecTag) {
    this.codecTag = codecTag;
  }

  public MediaStream codecTimeBase(String codecTimeBase) {
    this.codecTimeBase = JsonNullable.of(codecTimeBase);
    return this;
  }

  /**
   * Gets or sets the codec time base.
   * @return codecTimeBase
  */
  
  @Schema(name = "CodecTimeBase", description = "Gets or sets the codec time base.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CodecTimeBase")
  public JsonNullable<String> getCodecTimeBase() {
    return codecTimeBase;
  }

  public void setCodecTimeBase(JsonNullable<String> codecTimeBase) {
    this.codecTimeBase = codecTimeBase;
  }

  public MediaStream colorPrimaries(String colorPrimaries) {
    this.colorPrimaries = JsonNullable.of(colorPrimaries);
    return this;
  }

  /**
   * Gets or sets the color primaries.
   * @return colorPrimaries
  */
  
  @Schema(name = "ColorPrimaries", description = "Gets or sets the color primaries.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ColorPrimaries")
  public JsonNullable<String> getColorPrimaries() {
    return colorPrimaries;
  }

  public void setColorPrimaries(JsonNullable<String> colorPrimaries) {
    this.colorPrimaries = colorPrimaries;
  }

  public MediaStream colorRange(String colorRange) {
    this.colorRange = JsonNullable.of(colorRange);
    return this;
  }

  /**
   * Gets or sets the color range.
   * @return colorRange
  */
  
  @Schema(name = "ColorRange", description = "Gets or sets the color range.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ColorRange")
  public JsonNullable<String> getColorRange() {
    return colorRange;
  }

  public void setColorRange(JsonNullable<String> colorRange) {
    this.colorRange = colorRange;
  }

  public MediaStream colorSpace(String colorSpace) {
    this.colorSpace = JsonNullable.of(colorSpace);
    return this;
  }

  /**
   * Gets or sets the color space.
   * @return colorSpace
  */
  
  @Schema(name = "ColorSpace", description = "Gets or sets the color space.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ColorSpace")
  public JsonNullable<String> getColorSpace() {
    return colorSpace;
  }

  public void setColorSpace(JsonNullable<String> colorSpace) {
    this.colorSpace = colorSpace;
  }

  public MediaStream colorTransfer(String colorTransfer) {
    this.colorTransfer = JsonNullable.of(colorTransfer);
    return this;
  }

  /**
   * Gets or sets the color transfer.
   * @return colorTransfer
  */
  
  @Schema(name = "ColorTransfer", description = "Gets or sets the color transfer.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ColorTransfer")
  public JsonNullable<String> getColorTransfer() {
    return colorTransfer;
  }

  public void setColorTransfer(JsonNullable<String> colorTransfer) {
    this.colorTransfer = colorTransfer;
  }

  public MediaStream comment(String comment) {
    this.comment = JsonNullable.of(comment);
    return this;
  }

  /**
   * Gets or sets the comment.
   * @return comment
  */
  
  @Schema(name = "Comment", description = "Gets or sets the comment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Comment")
  public JsonNullable<String> getComment() {
    return comment;
  }

  public void setComment(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public MediaStream deliveryMethod(SubtitleDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
    return this;
  }

  /**
   * Get deliveryMethod
   * @return deliveryMethod
  */
  @Valid 
  @Schema(name = "DeliveryMethod", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryMethod")
  public SubtitleDeliveryMethod getDeliveryMethod() {
    return deliveryMethod;
  }

  public void setDeliveryMethod(SubtitleDeliveryMethod deliveryMethod) {
    this.deliveryMethod = deliveryMethod;
  }

  public MediaStream deliveryUrl(String deliveryUrl) {
    this.deliveryUrl = JsonNullable.of(deliveryUrl);
    return this;
  }

  /**
   * Gets or sets the delivery URL.
   * @return deliveryUrl
  */
  
  @Schema(name = "DeliveryUrl", description = "Gets or sets the delivery URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DeliveryUrl")
  public JsonNullable<String> getDeliveryUrl() {
    return deliveryUrl;
  }

  public void setDeliveryUrl(JsonNullable<String> deliveryUrl) {
    this.deliveryUrl = deliveryUrl;
  }

  public MediaStream displayTitle(String displayTitle) {
    this.displayTitle = JsonNullable.of(displayTitle);
    return this;
  }

  /**
   * Get displayTitle
   * @return displayTitle
  */
  
  @Schema(name = "DisplayTitle", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DisplayTitle")
  public JsonNullable<String> getDisplayTitle() {
    return displayTitle;
  }

  public void setDisplayTitle(JsonNullable<String> displayTitle) {
    this.displayTitle = displayTitle;
  }

  public MediaStream height(Integer height) {
    this.height = JsonNullable.of(height);
    return this;
  }

  /**
   * Gets or sets the height.
   * @return height
  */
  
  @Schema(name = "Height", description = "Gets or sets the height.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Height")
  public JsonNullable<Integer> getHeight() {
    return height;
  }

  public void setHeight(JsonNullable<Integer> height) {
    this.height = height;
  }

  public MediaStream index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Gets or sets the index.
   * @return index
  */
  
  @Schema(name = "Index", description = "Gets or sets the index.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public MediaStream isAVC(Boolean isAVC) {
    this.isAVC = JsonNullable.of(isAVC);
    return this;
  }

  /**
   * Get isAVC
   * @return isAVC
  */
  
  @Schema(name = "IsAVC", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAVC")
  public JsonNullable<Boolean> getIsAVC() {
    return isAVC;
  }

  public void setIsAVC(JsonNullable<Boolean> isAVC) {
    this.isAVC = isAVC;
  }

  public MediaStream isAnamorphic(Boolean isAnamorphic) {
    this.isAnamorphic = JsonNullable.of(isAnamorphic);
    return this;
  }

  /**
   * Gets a value indicating whether this instance is anamorphic.
   * @return isAnamorphic
  */
  
  @Schema(name = "IsAnamorphic", description = "Gets a value indicating whether this instance is anamorphic.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsAnamorphic")
  public JsonNullable<Boolean> getIsAnamorphic() {
    return isAnamorphic;
  }

  public void setIsAnamorphic(JsonNullable<Boolean> isAnamorphic) {
    this.isAnamorphic = isAnamorphic;
  }

  public MediaStream isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is default.
   * @return isDefault
  */
  
  @Schema(name = "IsDefault", description = "Gets or sets a value indicating whether this instance is default.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsDefault")
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public MediaStream isExternal(Boolean isExternal) {
    this.isExternal = isExternal;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is external.
   * @return isExternal
  */
  
  @Schema(name = "IsExternal", description = "Gets or sets a value indicating whether this instance is external.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsExternal")
  public Boolean getIsExternal() {
    return isExternal;
  }

  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }

  public MediaStream isExternalUrl(Boolean isExternalUrl) {
    this.isExternalUrl = JsonNullable.of(isExternalUrl);
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is external URL.
   * @return isExternalUrl
  */
  
  @Schema(name = "IsExternalUrl", description = "Gets or sets a value indicating whether this instance is external URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsExternalUrl")
  public JsonNullable<Boolean> getIsExternalUrl() {
    return isExternalUrl;
  }

  public void setIsExternalUrl(JsonNullable<Boolean> isExternalUrl) {
    this.isExternalUrl = isExternalUrl;
  }

  public MediaStream isForced(Boolean isForced) {
    this.isForced = isForced;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is forced.
   * @return isForced
  */
  
  @Schema(name = "IsForced", description = "Gets or sets a value indicating whether this instance is forced.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsForced")
  public Boolean getIsForced() {
    return isForced;
  }

  public void setIsForced(Boolean isForced) {
    this.isForced = isForced;
  }

  public MediaStream isInterlaced(Boolean isInterlaced) {
    this.isInterlaced = isInterlaced;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is interlaced.
   * @return isInterlaced
  */
  
  @Schema(name = "IsInterlaced", description = "Gets or sets a value indicating whether this instance is interlaced.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsInterlaced")
  public Boolean getIsInterlaced() {
    return isInterlaced;
  }

  public void setIsInterlaced(Boolean isInterlaced) {
    this.isInterlaced = isInterlaced;
  }

  public MediaStream isTextSubtitleStream(Boolean isTextSubtitleStream) {
    this.isTextSubtitleStream = isTextSubtitleStream;
    return this;
  }

  /**
   * Get isTextSubtitleStream
   * @return isTextSubtitleStream
  */
  
  @Schema(name = "IsTextSubtitleStream", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsTextSubtitleStream")
  public Boolean getIsTextSubtitleStream() {
    return isTextSubtitleStream;
  }

  public void setIsTextSubtitleStream(Boolean isTextSubtitleStream) {
    this.isTextSubtitleStream = isTextSubtitleStream;
  }

  public MediaStream language(String language) {
    this.language = JsonNullable.of(language);
    return this;
  }

  /**
   * Gets or sets the language.
   * @return language
  */
  
  @Schema(name = "Language", description = "Gets or sets the language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Language")
  public JsonNullable<String> getLanguage() {
    return language;
  }

  public void setLanguage(JsonNullable<String> language) {
    this.language = language;
  }

  public MediaStream level(Double level) {
    this.level = JsonNullable.of(level);
    return this;
  }

  /**
   * Gets or sets the level.
   * @return level
  */
  
  @Schema(name = "Level", description = "Gets or sets the level.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Level")
  public JsonNullable<Double> getLevel() {
    return level;
  }

  public void setLevel(JsonNullable<Double> level) {
    this.level = level;
  }

  public MediaStream nalLengthSize(String nalLengthSize) {
    this.nalLengthSize = JsonNullable.of(nalLengthSize);
    return this;
  }

  /**
   * Get nalLengthSize
   * @return nalLengthSize
  */
  
  @Schema(name = "NalLengthSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NalLengthSize")
  public JsonNullable<String> getNalLengthSize() {
    return nalLengthSize;
  }

  public void setNalLengthSize(JsonNullable<String> nalLengthSize) {
    this.nalLengthSize = nalLengthSize;
  }

  public MediaStream packetLength(Integer packetLength) {
    this.packetLength = JsonNullable.of(packetLength);
    return this;
  }

  /**
   * Gets or sets the length of the packet.
   * @return packetLength
  */
  
  @Schema(name = "PacketLength", description = "Gets or sets the length of the packet.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PacketLength")
  public JsonNullable<Integer> getPacketLength() {
    return packetLength;
  }

  public void setPacketLength(JsonNullable<Integer> packetLength) {
    this.packetLength = packetLength;
  }

  public MediaStream path(String path) {
    this.path = JsonNullable.of(path);
    return this;
  }

  /**
   * Gets or sets the filename.
   * @return path
  */
  
  @Schema(name = "Path", description = "Gets or sets the filename.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public JsonNullable<String> getPath() {
    return path;
  }

  public void setPath(JsonNullable<String> path) {
    this.path = path;
  }

  public MediaStream pixelFormat(String pixelFormat) {
    this.pixelFormat = JsonNullable.of(pixelFormat);
    return this;
  }

  /**
   * Gets or sets the pixel format.
   * @return pixelFormat
  */
  
  @Schema(name = "PixelFormat", description = "Gets or sets the pixel format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PixelFormat")
  public JsonNullable<String> getPixelFormat() {
    return pixelFormat;
  }

  public void setPixelFormat(JsonNullable<String> pixelFormat) {
    this.pixelFormat = pixelFormat;
  }

  public MediaStream profile(String profile) {
    this.profile = JsonNullable.of(profile);
    return this;
  }

  /**
   * Gets or sets the profile.
   * @return profile
  */
  
  @Schema(name = "Profile", description = "Gets or sets the profile.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Profile")
  public JsonNullable<String> getProfile() {
    return profile;
  }

  public void setProfile(JsonNullable<String> profile) {
    this.profile = profile;
  }

  public MediaStream realFrameRate(Float realFrameRate) {
    this.realFrameRate = JsonNullable.of(realFrameRate);
    return this;
  }

  /**
   * Gets or sets the real frame rate.
   * @return realFrameRate
  */
  
  @Schema(name = "RealFrameRate", description = "Gets or sets the real frame rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RealFrameRate")
  public JsonNullable<Float> getRealFrameRate() {
    return realFrameRate;
  }

  public void setRealFrameRate(JsonNullable<Float> realFrameRate) {
    this.realFrameRate = realFrameRate;
  }

  public MediaStream refFrames(Integer refFrames) {
    this.refFrames = JsonNullable.of(refFrames);
    return this;
  }

  /**
   * Gets or sets the reference frames.
   * @return refFrames
  */
  
  @Schema(name = "RefFrames", description = "Gets or sets the reference frames.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RefFrames")
  public JsonNullable<Integer> getRefFrames() {
    return refFrames;
  }

  public void setRefFrames(JsonNullable<Integer> refFrames) {
    this.refFrames = refFrames;
  }

  public MediaStream sampleRate(Integer sampleRate) {
    this.sampleRate = JsonNullable.of(sampleRate);
    return this;
  }

  /**
   * Gets or sets the sample rate.
   * @return sampleRate
  */
  
  @Schema(name = "SampleRate", description = "Gets or sets the sample rate.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SampleRate")
  public JsonNullable<Integer> getSampleRate() {
    return sampleRate;
  }

  public void setSampleRate(JsonNullable<Integer> sampleRate) {
    this.sampleRate = sampleRate;
  }

  public MediaStream score(Integer score) {
    this.score = JsonNullable.of(score);
    return this;
  }

  /**
   * Gets or sets the score.
   * @return score
  */
  
  @Schema(name = "Score", description = "Gets or sets the score.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Score")
  public JsonNullable<Integer> getScore() {
    return score;
  }

  public void setScore(JsonNullable<Integer> score) {
    this.score = score;
  }

  public MediaStream supportsExternalStream(Boolean supportsExternalStream) {
    this.supportsExternalStream = supportsExternalStream;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [supports external stream].
   * @return supportsExternalStream
  */
  
  @Schema(name = "SupportsExternalStream", description = "Gets or sets a value indicating whether [supports external stream].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SupportsExternalStream")
  public Boolean getSupportsExternalStream() {
    return supportsExternalStream;
  }

  public void setSupportsExternalStream(Boolean supportsExternalStream) {
    this.supportsExternalStream = supportsExternalStream;
  }

  public MediaStream timeBase(String timeBase) {
    this.timeBase = JsonNullable.of(timeBase);
    return this;
  }

  /**
   * Gets or sets the time base.
   * @return timeBase
  */
  
  @Schema(name = "TimeBase", description = "Gets or sets the time base.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TimeBase")
  public JsonNullable<String> getTimeBase() {
    return timeBase;
  }

  public void setTimeBase(JsonNullable<String> timeBase) {
    this.timeBase = timeBase;
  }

  public MediaStream title(String title) {
    this.title = JsonNullable.of(title);
    return this;
  }

  /**
   * Gets or sets the title.
   * @return title
  */
  
  @Schema(name = "Title", description = "Gets or sets the title.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Title")
  public JsonNullable<String> getTitle() {
    return title;
  }

  public void setTitle(JsonNullable<String> title) {
    this.title = title;
  }

  public MediaStream type(MediaStreamType type) {
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
  public MediaStreamType getType() {
    return type;
  }

  public void setType(MediaStreamType type) {
    this.type = type;
  }

  public MediaStream videoRange(String videoRange) {
    this.videoRange = JsonNullable.of(videoRange);
    return this;
  }

  /**
   * Gets or sets the video range.
   * @return videoRange
  */
  
  @Schema(name = "VideoRange", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets or sets the video range.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("VideoRange")
  public JsonNullable<String> getVideoRange() {
    return videoRange;
  }

  public void setVideoRange(JsonNullable<String> videoRange) {
    this.videoRange = videoRange;
  }

  public MediaStream width(Integer width) {
    this.width = JsonNullable.of(width);
    return this;
  }

  /**
   * Gets or sets the width.
   * @return width
  */
  
  @Schema(name = "Width", description = "Gets or sets the width.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Width")
  public JsonNullable<Integer> getWidth() {
    return width;
  }

  public void setWidth(JsonNullable<Integer> width) {
    this.width = width;
  }

  public MediaStream localizedDefault(String localizedDefault) {
    this.localizedDefault = JsonNullable.of(localizedDefault);
    return this;
  }

  /**
   * Get localizedDefault
   * @return localizedDefault
  */
  
  @Schema(name = "localizedDefault", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localizedDefault")
  public JsonNullable<String> getLocalizedDefault() {
    return localizedDefault;
  }

  public void setLocalizedDefault(JsonNullable<String> localizedDefault) {
    this.localizedDefault = localizedDefault;
  }

  public MediaStream localizedForced(String localizedForced) {
    this.localizedForced = JsonNullable.of(localizedForced);
    return this;
  }

  /**
   * Get localizedForced
   * @return localizedForced
  */
  
  @Schema(name = "localizedForced", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localizedForced")
  public JsonNullable<String> getLocalizedForced() {
    return localizedForced;
  }

  public void setLocalizedForced(JsonNullable<String> localizedForced) {
    this.localizedForced = localizedForced;
  }

  public MediaStream localizedUndefined(String localizedUndefined) {
    this.localizedUndefined = JsonNullable.of(localizedUndefined);
    return this;
  }

  /**
   * Get localizedUndefined
   * @return localizedUndefined
  */
  
  @Schema(name = "localizedUndefined", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("localizedUndefined")
  public JsonNullable<String> getLocalizedUndefined() {
    return localizedUndefined;
  }

  public void setLocalizedUndefined(JsonNullable<String> localizedUndefined) {
    this.localizedUndefined = localizedUndefined;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaStream mediaStream = (MediaStream) o;
    return equalsNullable(this.aspectRatio, mediaStream.aspectRatio) &&
        equalsNullable(this.averageFrameRate, mediaStream.averageFrameRate) &&
        equalsNullable(this.bitDepth, mediaStream.bitDepth) &&
        equalsNullable(this.bitRate, mediaStream.bitRate) &&
        equalsNullable(this.channelLayout, mediaStream.channelLayout) &&
        equalsNullable(this.channels, mediaStream.channels) &&
        equalsNullable(this.codec, mediaStream.codec) &&
        equalsNullable(this.codecTag, mediaStream.codecTag) &&
        equalsNullable(this.codecTimeBase, mediaStream.codecTimeBase) &&
        equalsNullable(this.colorPrimaries, mediaStream.colorPrimaries) &&
        equalsNullable(this.colorRange, mediaStream.colorRange) &&
        equalsNullable(this.colorSpace, mediaStream.colorSpace) &&
        equalsNullable(this.colorTransfer, mediaStream.colorTransfer) &&
        equalsNullable(this.comment, mediaStream.comment) &&
        Objects.equals(this.deliveryMethod, mediaStream.deliveryMethod) &&
        equalsNullable(this.deliveryUrl, mediaStream.deliveryUrl) &&
        equalsNullable(this.displayTitle, mediaStream.displayTitle) &&
        equalsNullable(this.height, mediaStream.height) &&
        Objects.equals(this.index, mediaStream.index) &&
        equalsNullable(this.isAVC, mediaStream.isAVC) &&
        equalsNullable(this.isAnamorphic, mediaStream.isAnamorphic) &&
        Objects.equals(this.isDefault, mediaStream.isDefault) &&
        Objects.equals(this.isExternal, mediaStream.isExternal) &&
        equalsNullable(this.isExternalUrl, mediaStream.isExternalUrl) &&
        Objects.equals(this.isForced, mediaStream.isForced) &&
        Objects.equals(this.isInterlaced, mediaStream.isInterlaced) &&
        Objects.equals(this.isTextSubtitleStream, mediaStream.isTextSubtitleStream) &&
        equalsNullable(this.language, mediaStream.language) &&
        equalsNullable(this.level, mediaStream.level) &&
        equalsNullable(this.nalLengthSize, mediaStream.nalLengthSize) &&
        equalsNullable(this.packetLength, mediaStream.packetLength) &&
        equalsNullable(this.path, mediaStream.path) &&
        equalsNullable(this.pixelFormat, mediaStream.pixelFormat) &&
        equalsNullable(this.profile, mediaStream.profile) &&
        equalsNullable(this.realFrameRate, mediaStream.realFrameRate) &&
        equalsNullable(this.refFrames, mediaStream.refFrames) &&
        equalsNullable(this.sampleRate, mediaStream.sampleRate) &&
        equalsNullable(this.score, mediaStream.score) &&
        Objects.equals(this.supportsExternalStream, mediaStream.supportsExternalStream) &&
        equalsNullable(this.timeBase, mediaStream.timeBase) &&
        equalsNullable(this.title, mediaStream.title) &&
        Objects.equals(this.type, mediaStream.type) &&
        equalsNullable(this.videoRange, mediaStream.videoRange) &&
        equalsNullable(this.width, mediaStream.width) &&
        equalsNullable(this.localizedDefault, mediaStream.localizedDefault) &&
        equalsNullable(this.localizedForced, mediaStream.localizedForced) &&
        equalsNullable(this.localizedUndefined, mediaStream.localizedUndefined);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(aspectRatio), hashCodeNullable(averageFrameRate), hashCodeNullable(bitDepth), hashCodeNullable(bitRate), hashCodeNullable(channelLayout), hashCodeNullable(channels), hashCodeNullable(codec), hashCodeNullable(codecTag), hashCodeNullable(codecTimeBase), hashCodeNullable(colorPrimaries), hashCodeNullable(colorRange), hashCodeNullable(colorSpace), hashCodeNullable(colorTransfer), hashCodeNullable(comment), deliveryMethod, hashCodeNullable(deliveryUrl), hashCodeNullable(displayTitle), hashCodeNullable(height), index, hashCodeNullable(isAVC), hashCodeNullable(isAnamorphic), isDefault, isExternal, hashCodeNullable(isExternalUrl), isForced, isInterlaced, isTextSubtitleStream, hashCodeNullable(language), hashCodeNullable(level), hashCodeNullable(nalLengthSize), hashCodeNullable(packetLength), hashCodeNullable(path), hashCodeNullable(pixelFormat), hashCodeNullable(profile), hashCodeNullable(realFrameRate), hashCodeNullable(refFrames), hashCodeNullable(sampleRate), hashCodeNullable(score), supportsExternalStream, hashCodeNullable(timeBase), hashCodeNullable(title), type, hashCodeNullable(videoRange), hashCodeNullable(width), hashCodeNullable(localizedDefault), hashCodeNullable(localizedForced), hashCodeNullable(localizedUndefined));
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
    sb.append("class MediaStream {\n");
    sb.append("    aspectRatio: ").append(toIndentedString(aspectRatio)).append("\n");
    sb.append("    averageFrameRate: ").append(toIndentedString(averageFrameRate)).append("\n");
    sb.append("    bitDepth: ").append(toIndentedString(bitDepth)).append("\n");
    sb.append("    bitRate: ").append(toIndentedString(bitRate)).append("\n");
    sb.append("    channelLayout: ").append(toIndentedString(channelLayout)).append("\n");
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
    sb.append("    codec: ").append(toIndentedString(codec)).append("\n");
    sb.append("    codecTag: ").append(toIndentedString(codecTag)).append("\n");
    sb.append("    codecTimeBase: ").append(toIndentedString(codecTimeBase)).append("\n");
    sb.append("    colorPrimaries: ").append(toIndentedString(colorPrimaries)).append("\n");
    sb.append("    colorRange: ").append(toIndentedString(colorRange)).append("\n");
    sb.append("    colorSpace: ").append(toIndentedString(colorSpace)).append("\n");
    sb.append("    colorTransfer: ").append(toIndentedString(colorTransfer)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    deliveryMethod: ").append(toIndentedString(deliveryMethod)).append("\n");
    sb.append("    deliveryUrl: ").append(toIndentedString(deliveryUrl)).append("\n");
    sb.append("    displayTitle: ").append(toIndentedString(displayTitle)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    isAVC: ").append(toIndentedString(isAVC)).append("\n");
    sb.append("    isAnamorphic: ").append(toIndentedString(isAnamorphic)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isExternal: ").append(toIndentedString(isExternal)).append("\n");
    sb.append("    isExternalUrl: ").append(toIndentedString(isExternalUrl)).append("\n");
    sb.append("    isForced: ").append(toIndentedString(isForced)).append("\n");
    sb.append("    isInterlaced: ").append(toIndentedString(isInterlaced)).append("\n");
    sb.append("    isTextSubtitleStream: ").append(toIndentedString(isTextSubtitleStream)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    nalLengthSize: ").append(toIndentedString(nalLengthSize)).append("\n");
    sb.append("    packetLength: ").append(toIndentedString(packetLength)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    pixelFormat: ").append(toIndentedString(pixelFormat)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    realFrameRate: ").append(toIndentedString(realFrameRate)).append("\n");
    sb.append("    refFrames: ").append(toIndentedString(refFrames)).append("\n");
    sb.append("    sampleRate: ").append(toIndentedString(sampleRate)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    supportsExternalStream: ").append(toIndentedString(supportsExternalStream)).append("\n");
    sb.append("    timeBase: ").append(toIndentedString(timeBase)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    videoRange: ").append(toIndentedString(videoRange)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    localizedDefault: ").append(toIndentedString(localizedDefault)).append("\n");
    sb.append("    localizedForced: ").append(toIndentedString(localizedForced)).append("\n");
    sb.append("    localizedUndefined: ").append(toIndentedString(localizedUndefined)).append("\n");
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

