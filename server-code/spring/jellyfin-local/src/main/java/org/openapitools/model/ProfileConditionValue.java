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
 * Gets or Sets ProfileConditionValue
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum ProfileConditionValue {
  
  AUDIOCHANNELS("AudioChannels"),
  
  AUDIOBITRATE("AudioBitrate"),
  
  AUDIOPROFILE("AudioProfile"),
  
  WIDTH("Width"),
  
  HEIGHT("Height"),
  
  HAS64BITOFFSETS("Has64BitOffsets"),
  
  PACKETLENGTH("PacketLength"),
  
  VIDEOBITDEPTH("VideoBitDepth"),
  
  VIDEOBITRATE("VideoBitrate"),
  
  VIDEOFRAMERATE("VideoFramerate"),
  
  VIDEOLEVEL("VideoLevel"),
  
  VIDEOPROFILE("VideoProfile"),
  
  VIDEOTIMESTAMP("VideoTimestamp"),
  
  ISANAMORPHIC("IsAnamorphic"),
  
  REFFRAMES("RefFrames"),
  
  NUMAUDIOSTREAMS("NumAudioStreams"),
  
  NUMVIDEOSTREAMS("NumVideoStreams"),
  
  ISSECONDARYAUDIO("IsSecondaryAudio"),
  
  VIDEOCODECTAG("VideoCodecTag"),
  
  ISAVC("IsAvc"),
  
  ISINTERLACED("IsInterlaced"),
  
  AUDIOSAMPLERATE("AudioSampleRate"),
  
  AUDIOBITDEPTH("AudioBitDepth");

  private String value;

  ProfileConditionValue(String value) {
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
  public static ProfileConditionValue fromValue(String value) {
    for (ProfileConditionValue b : ProfileConditionValue.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

