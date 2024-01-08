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
 * This exists simply to identify a set of known commands.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum GeneralCommandType {
  
  MOVEUP("MoveUp"),
  
  MOVEDOWN("MoveDown"),
  
  MOVELEFT("MoveLeft"),
  
  MOVERIGHT("MoveRight"),
  
  PAGEUP("PageUp"),
  
  PAGEDOWN("PageDown"),
  
  PREVIOUSLETTER("PreviousLetter"),
  
  NEXTLETTER("NextLetter"),
  
  TOGGLEOSD("ToggleOsd"),
  
  TOGGLECONTEXTMENU("ToggleContextMenu"),
  
  SELECT("Select"),
  
  BACK("Back"),
  
  TAKESCREENSHOT("TakeScreenshot"),
  
  SENDKEY("SendKey"),
  
  SENDSTRING("SendString"),
  
  GOHOME("GoHome"),
  
  GOTOSETTINGS("GoToSettings"),
  
  VOLUMEUP("VolumeUp"),
  
  VOLUMEDOWN("VolumeDown"),
  
  MUTE("Mute"),
  
  UNMUTE("Unmute"),
  
  TOGGLEMUTE("ToggleMute"),
  
  SETVOLUME("SetVolume"),
  
  SETAUDIOSTREAMINDEX("SetAudioStreamIndex"),
  
  SETSUBTITLESTREAMINDEX("SetSubtitleStreamIndex"),
  
  TOGGLEFULLSCREEN("ToggleFullscreen"),
  
  DISPLAYCONTENT("DisplayContent"),
  
  GOTOSEARCH("GoToSearch"),
  
  DISPLAYMESSAGE("DisplayMessage"),
  
  SETREPEATMODE("SetRepeatMode"),
  
  CHANNELUP("ChannelUp"),
  
  CHANNELDOWN("ChannelDown"),
  
  GUIDE("Guide"),
  
  TOGGLESTATS("ToggleStats"),
  
  PLAYMEDIASOURCE("PlayMediaSource"),
  
  PLAYTRAILERS("PlayTrailers"),
  
  SETSHUFFLEQUEUE("SetShuffleQueue"),
  
  PLAYSTATE("PlayState"),
  
  PLAYNEXT("PlayNext"),
  
  TOGGLEOSDMENU("ToggleOsdMenu"),
  
  PLAY("Play");

  private String value;

  GeneralCommandType(String value) {
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
  public static GeneralCommandType fromValue(String value) {
    for (GeneralCommandType b : GeneralCommandType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

