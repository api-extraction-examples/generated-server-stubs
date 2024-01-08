package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * *Conditional*. Only relevant for custom fields of type &#x60;date&#x60;. This object reflects the chosen date (and optionally, time) value of a &#x60;date&#x60; custom field. If no date is selected, the value of &#x60;date_value&#x60; will be &#x60;null&#x60;.
 */

@Schema(name = "CustomFieldCompact_allOf_date_value", description = "*Conditional*. Only relevant for custom fields of type `date`. This object reflects the chosen date (and optionally, time) value of a `date` custom field. If no date is selected, the value of `date_value` will be `null`.")
@JsonTypeName("CustomFieldCompact_allOf_date_value")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class CustomFieldCompactAllOfDateValue {

  private String date;

  private String dateTime;

  public CustomFieldCompactAllOfDateValue date(String date) {
    this.date = date;
    return this;
  }

  /**
   * A string representing the date in YYYY-MM-DD format.
   * @return date
  */
  
  @Schema(name = "date", example = "2024-08-23", description = "A string representing the date in YYYY-MM-DD format.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public CustomFieldCompactAllOfDateValue dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * A string representing the date in ISO 8601 format. If no time value is selected, the value of `date-time` will be `null`.
   * @return dateTime
  */
  
  @Schema(name = "date_time", example = "2024-08-23T22:00:00.000Z", description = "A string representing the date in ISO 8601 format. If no time value is selected, the value of `date-time` will be `null`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_time")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldCompactAllOfDateValue customFieldCompactAllOfDateValue = (CustomFieldCompactAllOfDateValue) o;
    return Objects.equals(this.date, customFieldCompactAllOfDateValue.date) &&
        Objects.equals(this.dateTime, customFieldCompactAllOfDateValue.dateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, dateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldCompactAllOfDateValue {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
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

