package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.&lt;br/&gt;&lt;br/&gt;Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.
 */

@Schema(name = "TimeDuration", description = "A type used to specify a period of time using a specified time-measurement unit. Payment, return, and fulfillment business policies all use this type to specify time windows.<br/><br/>Whenever a container that uses this type is used in a request, both of these fields are required. Similarly, whenever a container that uses this type is returned in a response, both of these fields are always returned.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class TimeDuration {

  private String unit;

  private Integer value;

  public TimeDuration unit(String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * These enum values represent the time measurement unit, such as <code>DAY</code>. A span of time is defined when you apply the value specified in the <b>value</b> field to the value specified for <b>unit</b>. <br/><br/>See <b>TimeDurationUnitEnum</b> for a complete list of possible time-measurement units. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:TimeDurationUnitEnum'>eBay API documentation</a>
   * @return unit
  */
  
  @Schema(name = "unit", description = "These enum values represent the time measurement unit, such as <code>DAY</code>. A span of time is defined when you apply the value specified in the <b>value</b> field to the value specified for <b>unit</b>. <br/><br/>See <b>TimeDurationUnitEnum</b> for a complete list of possible time-measurement units. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:TimeDurationUnitEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public TimeDuration value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * An integer that represents an amount of time, as measured by the time-measurement unit specified in the <b>unit</b> field.
   * @return value
  */
  
  @Schema(name = "value", description = "An integer that represents an amount of time, as measured by the time-measurement unit specified in the <b>unit</b> field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeDuration timeDuration = (TimeDuration) o;
    return Objects.equals(this.unit, timeDuration.unit) &&
        Objects.equals(this.value, timeDuration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeDuration {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

