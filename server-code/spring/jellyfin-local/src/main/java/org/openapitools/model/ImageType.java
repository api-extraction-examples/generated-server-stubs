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
 * Enum ImageType.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public enum ImageType {
  
  PRIMARY("Primary"),
  
  ART("Art"),
  
  BACKDROP("Backdrop"),
  
  BANNER("Banner"),
  
  LOGO("Logo"),
  
  THUMB("Thumb"),
  
  DISC("Disc"),
  
  BOX("Box"),
  
  SCREENSHOT("Screenshot"),
  
  MENU("Menu"),
  
  CHAPTER("Chapter"),
  
  BOXREAR("BoxRear"),
  
  PROFILE("Profile");

  private String value;

  ImageType(String value) {
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
  public static ImageType fromValue(String value) {
    for (ImageType b : ImageType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}
