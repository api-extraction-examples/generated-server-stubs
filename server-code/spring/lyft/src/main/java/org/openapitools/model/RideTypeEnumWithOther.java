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
 * The ID of the ride type
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public enum RideTypeEnumWithOther {
  
  LYFT("lyft"),
  
  LYFT_LINE("lyft_line"),
  
  LYFT_PLUS("lyft_plus"),
  
  LYFT_PREMIER("lyft_premier"),
  
  LYFT_LUX("lyft_lux"),
  
  LYFT_LUXSUV("lyft_luxsuv"),
  
  OTHER("other");

  private String value;

  RideTypeEnumWithOther(String value) {
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
  public static RideTypeEnumWithOther fromValue(String value) {
    for (RideTypeEnumWithOther b : RideTypeEnumWithOther.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

