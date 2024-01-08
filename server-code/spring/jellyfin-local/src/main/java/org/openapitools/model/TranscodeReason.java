package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TranscodeReason
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum TranscodeReason {
  
  CONTAINERNOTSUPPORTED("ContainerNotSupported"),
  
  VIDEOCODECNOTSUPPORTED("VideoCodecNotSupported"),
  
  AUDIOCODECNOTSUPPORTED("AudioCodecNotSupported"),
  
  CONTAINERBITRATEEXCEEDSLIMIT("ContainerBitrateExceedsLimit"),
  
  AUDIOBITRATENOTSUPPORTED("AudioBitrateNotSupported"),
  
  AUDIOCHANNELSNOTSUPPORTED("AudioChannelsNotSupported"),
  
  VIDEORESOLUTIONNOTSUPPORTED("VideoResolutionNotSupported"),
  
  UNKNOWNVIDEOSTREAMINFO("UnknownVideoStreamInfo"),
  
  UNKNOWNAUDIOSTREAMINFO("UnknownAudioStreamInfo"),
  
  AUDIOPROFILENOTSUPPORTED("AudioProfileNotSupported"),
  
  AUDIOSAMPLERATENOTSUPPORTED("AudioSampleRateNotSupported"),
  
  ANAMORPHICVIDEONOTSUPPORTED("AnamorphicVideoNotSupported"),
  
  INTERLACEDVIDEONOTSUPPORTED("InterlacedVideoNotSupported"),
  
  SECONDARYAUDIONOTSUPPORTED("SecondaryAudioNotSupported"),
  
  REFFRAMESNOTSUPPORTED("RefFramesNotSupported"),
  
  VIDEOBITDEPTHNOTSUPPORTED("VideoBitDepthNotSupported"),
  
  VIDEOBITRATENOTSUPPORTED("VideoBitrateNotSupported"),
  
  VIDEOFRAMERATENOTSUPPORTED("VideoFramerateNotSupported"),
  
  VIDEOLEVELNOTSUPPORTED("VideoLevelNotSupported"),
  
  VIDEOPROFILENOTSUPPORTED("VideoProfileNotSupported"),
  
  AUDIOBITDEPTHNOTSUPPORTED("AudioBitDepthNotSupported"),
  
  SUBTITLECODECNOTSUPPORTED("SubtitleCodecNotSupported"),
  
  DIRECTPLAYERROR("DirectPlayError");

  private String value;

  TranscodeReason(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static TranscodeReason fromValue(String value) {
    for (TranscodeReason b : TranscodeReason.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

