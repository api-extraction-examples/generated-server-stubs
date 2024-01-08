package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.WeekdayInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * opening hours for a week, represented by a map where the key is a weekday and the value is an object containing the time periods. There are a maximum of two time slots for each day. If there exists no opening hours for one day, they will be shown as closed. 
 */

@Schema(name = "Weekdays", description = "opening hours for a week, represented by a map where the key is a weekday and the value is an object containing the time periods. There are a maximum of two time slots for each day. If there exists no opening hours for one day, they will be shown as closed. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:25.642267-04:00[America/Lower_Princes]")
public class Weekdays {

  private WeekdayInfo FRIDAY;

  private WeekdayInfo MONDAY;

  private WeekdayInfo SATURDAY;

  private WeekdayInfo SUNDAY;

  private WeekdayInfo THURSDAY;

  private WeekdayInfo TUESDAY;

  private WeekdayInfo WEDNESDAY;

  public Weekdays FRIDAY(WeekdayInfo FRIDAY) {
    this.FRIDAY = FRIDAY;
    return this;
  }

  /**
   * Get FRIDAY
   * @return FRIDAY
  */
  @Valid 
  @Schema(name = "FRIDAY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("FRIDAY")
  public WeekdayInfo getFRIDAY() {
    return FRIDAY;
  }

  public void setFRIDAY(WeekdayInfo FRIDAY) {
    this.FRIDAY = FRIDAY;
  }

  public Weekdays MONDAY(WeekdayInfo MONDAY) {
    this.MONDAY = MONDAY;
    return this;
  }

  /**
   * Get MONDAY
   * @return MONDAY
  */
  @Valid 
  @Schema(name = "MONDAY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MONDAY")
  public WeekdayInfo getMONDAY() {
    return MONDAY;
  }

  public void setMONDAY(WeekdayInfo MONDAY) {
    this.MONDAY = MONDAY;
  }

  public Weekdays SATURDAY(WeekdayInfo SATURDAY) {
    this.SATURDAY = SATURDAY;
    return this;
  }

  /**
   * Get SATURDAY
   * @return SATURDAY
  */
  @Valid 
  @Schema(name = "SATURDAY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SATURDAY")
  public WeekdayInfo getSATURDAY() {
    return SATURDAY;
  }

  public void setSATURDAY(WeekdayInfo SATURDAY) {
    this.SATURDAY = SATURDAY;
  }

  public Weekdays SUNDAY(WeekdayInfo SUNDAY) {
    this.SUNDAY = SUNDAY;
    return this;
  }

  /**
   * Get SUNDAY
   * @return SUNDAY
  */
  @Valid 
  @Schema(name = "SUNDAY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SUNDAY")
  public WeekdayInfo getSUNDAY() {
    return SUNDAY;
  }

  public void setSUNDAY(WeekdayInfo SUNDAY) {
    this.SUNDAY = SUNDAY;
  }

  public Weekdays THURSDAY(WeekdayInfo THURSDAY) {
    this.THURSDAY = THURSDAY;
    return this;
  }

  /**
   * Get THURSDAY
   * @return THURSDAY
  */
  @Valid 
  @Schema(name = "THURSDAY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("THURSDAY")
  public WeekdayInfo getTHURSDAY() {
    return THURSDAY;
  }

  public void setTHURSDAY(WeekdayInfo THURSDAY) {
    this.THURSDAY = THURSDAY;
  }

  public Weekdays TUESDAY(WeekdayInfo TUESDAY) {
    this.TUESDAY = TUESDAY;
    return this;
  }

  /**
   * Get TUESDAY
   * @return TUESDAY
  */
  @Valid 
  @Schema(name = "TUESDAY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TUESDAY")
  public WeekdayInfo getTUESDAY() {
    return TUESDAY;
  }

  public void setTUESDAY(WeekdayInfo TUESDAY) {
    this.TUESDAY = TUESDAY;
  }

  public Weekdays WEDNESDAY(WeekdayInfo WEDNESDAY) {
    this.WEDNESDAY = WEDNESDAY;
    return this;
  }

  /**
   * Get WEDNESDAY
   * @return WEDNESDAY
  */
  @Valid 
  @Schema(name = "WEDNESDAY", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("WEDNESDAY")
  public WeekdayInfo getWEDNESDAY() {
    return WEDNESDAY;
  }

  public void setWEDNESDAY(WeekdayInfo WEDNESDAY) {
    this.WEDNESDAY = WEDNESDAY;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Weekdays weekdays = (Weekdays) o;
    return Objects.equals(this.FRIDAY, weekdays.FRIDAY) &&
        Objects.equals(this.MONDAY, weekdays.MONDAY) &&
        Objects.equals(this.SATURDAY, weekdays.SATURDAY) &&
        Objects.equals(this.SUNDAY, weekdays.SUNDAY) &&
        Objects.equals(this.THURSDAY, weekdays.THURSDAY) &&
        Objects.equals(this.TUESDAY, weekdays.TUESDAY) &&
        Objects.equals(this.WEDNESDAY, weekdays.WEDNESDAY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FRIDAY, MONDAY, SATURDAY, SUNDAY, THURSDAY, TUESDAY, WEDNESDAY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Weekdays {\n");
    sb.append("    FRIDAY: ").append(toIndentedString(FRIDAY)).append("\n");
    sb.append("    MONDAY: ").append(toIndentedString(MONDAY)).append("\n");
    sb.append("    SATURDAY: ").append(toIndentedString(SATURDAY)).append("\n");
    sb.append("    SUNDAY: ").append(toIndentedString(SUNDAY)).append("\n");
    sb.append("    THURSDAY: ").append(toIndentedString(THURSDAY)).append("\n");
    sb.append("    TUESDAY: ").append(toIndentedString(TUESDAY)).append("\n");
    sb.append("    WEDNESDAY: ").append(toIndentedString(WEDNESDAY)).append("\n");
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

