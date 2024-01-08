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
 * Gets or Sets ScreenshotDisplayType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public enum ScreenshotDisplayType {
  
  APP_IPHONE_65("APP_IPHONE_65"),
  
  APP_IPHONE_58("APP_IPHONE_58"),
  
  APP_IPHONE_55("APP_IPHONE_55"),
  
  APP_IPHONE_47("APP_IPHONE_47"),
  
  APP_IPHONE_40("APP_IPHONE_40"),
  
  APP_IPHONE_35("APP_IPHONE_35"),
  
  APP_IPAD_PRO_3GEN_129("APP_IPAD_PRO_3GEN_129"),
  
  APP_IPAD_PRO_3GEN_11("APP_IPAD_PRO_3GEN_11"),
  
  APP_IPAD_PRO_129("APP_IPAD_PRO_129"),
  
  APP_IPAD_105("APP_IPAD_105"),
  
  APP_IPAD_97("APP_IPAD_97"),
  
  APP_DESKTOP("APP_DESKTOP"),
  
  APP_WATCH_SERIES_4("APP_WATCH_SERIES_4"),
  
  APP_WATCH_SERIES_3("APP_WATCH_SERIES_3"),
  
  APP_APPLE_TV("APP_APPLE_TV"),
  
  IMESSAGE_APP_IPHONE_65("IMESSAGE_APP_IPHONE_65"),
  
  IMESSAGE_APP_IPHONE_58("IMESSAGE_APP_IPHONE_58"),
  
  IMESSAGE_APP_IPHONE_55("IMESSAGE_APP_IPHONE_55"),
  
  IMESSAGE_APP_IPHONE_47("IMESSAGE_APP_IPHONE_47"),
  
  IMESSAGE_APP_IPHONE_40("IMESSAGE_APP_IPHONE_40"),
  
  IMESSAGE_APP_IPAD_PRO_3GEN_129("IMESSAGE_APP_IPAD_PRO_3GEN_129"),
  
  IMESSAGE_APP_IPAD_PRO_3GEN_11("IMESSAGE_APP_IPAD_PRO_3GEN_11"),
  
  IMESSAGE_APP_IPAD_PRO_129("IMESSAGE_APP_IPAD_PRO_129"),
  
  IMESSAGE_APP_IPAD_105("IMESSAGE_APP_IPAD_105"),
  
  IMESSAGE_APP_IPAD_97("IMESSAGE_APP_IPAD_97");

  private String value;

  ScreenshotDisplayType(String value) {
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
  public static ScreenshotDisplayType fromValue(String value) {
    for (ScreenshotDisplayType b : ScreenshotDisplayType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

