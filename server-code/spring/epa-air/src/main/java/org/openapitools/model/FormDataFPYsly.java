package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import java.math.BigDecimal;
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
 * Number of years (1 to 5) since last facility inspection.  A value of 1 means that it has been inspected within the year.
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public enum FormDataFPYsly {
  
  NUMBER_1(new BigDecimal("1")),
  
  NUMBER_2(new BigDecimal("2")),
  
  NUMBER_3(new BigDecimal("3")),
  
  NUMBER_4(new BigDecimal("4")),
  
  NUMBER_5(new BigDecimal("5"));

  private BigDecimal value;

  FormDataFPYsly(BigDecimal value) {
    this.value = value;
  }

  @JsonValue
  public BigDecimal getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static FormDataFPYsly fromValue(BigDecimal value) {
    for (FormDataFPYsly b : FormDataFPYsly.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

