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
 * Gets or Sets PreviewType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public enum PreviewType {
  
  IPHONE_65("IPHONE_65"),
  
  IPHONE_58("IPHONE_58"),
  
  IPHONE_55("IPHONE_55"),
  
  IPHONE_47("IPHONE_47"),
  
  IPHONE_40("IPHONE_40"),
  
  IPHONE_35("IPHONE_35"),
  
  IPAD_PRO_3GEN_129("IPAD_PRO_3GEN_129"),
  
  IPAD_PRO_3GEN_11("IPAD_PRO_3GEN_11"),
  
  IPAD_PRO_129("IPAD_PRO_129"),
  
  IPAD_105("IPAD_105"),
  
  IPAD_97("IPAD_97"),
  
  DESKTOP("DESKTOP"),
  
  WATCH_SERIES_4("WATCH_SERIES_4"),
  
  WATCH_SERIES_3("WATCH_SERIES_3"),
  
  APPLE_TV("APPLE_TV");

  private String value;

  PreviewType(String value) {
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
  public static PreviewType fromValue(String value) {
    for (PreviewType b : PreviewType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

