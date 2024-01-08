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
 * Gets or Sets ContextKeyTypeEnum
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public enum ContextKeyTypeEnum {
  
  STRING("string"),
  
  STRINGLIST("stringList"),
  
  NUMERIC("numeric"),
  
  NUMERICLIST("numericList"),
  
  BOOLEAN("boolean"),
  
  BOOLEANLIST("booleanList"),
  
  IP("ip"),
  
  IPLIST("ipList"),
  
  BINARY("binary"),
  
  BINARYLIST("binaryList"),
  
  DATE("date"),
  
  DATELIST("dateList");

  private String value;

  ContextKeyTypeEnum(String value) {
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
  public static ContextKeyTypeEnum fromValue(String value) {
    for (ContextKeyTypeEnum b : ContextKeyTypeEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

