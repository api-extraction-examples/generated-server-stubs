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
 * Enum PlaystateCommand.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum PlaystateCommand {
  
  STOP("Stop"),
  
  PAUSE("Pause"),
  
  UNPAUSE("Unpause"),
  
  NEXTTRACK("NextTrack"),
  
  PREVIOUSTRACK("PreviousTrack"),
  
  SEEK("Seek"),
  
  REWIND("Rewind"),
  
  FASTFORWARD("FastForward"),
  
  PLAYPAUSE("PlayPause");

  private String value;

  PlaystateCommand(String value) {
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
  public static PlaystateCommand fromValue(String value) {
    for (PlaystateCommand b : PlaystateCommand.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

