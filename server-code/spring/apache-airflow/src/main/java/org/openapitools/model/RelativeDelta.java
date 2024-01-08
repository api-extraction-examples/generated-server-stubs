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
 * Relative delta
 */

@Schema(name = "RelativeDelta", description = "Relative delta")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class RelativeDelta {

  private String type;

  private Integer day;

  private Integer days;

  private Integer hour;

  private Integer hours;

  private Integer leapdays;

  private Integer microsecond;

  private Integer microseconds;

  private Integer minute;

  private Integer minutes;

  private Integer month;

  private Integer months;

  private Integer second;

  private Integer seconds;

  private Integer year;

  private Integer years;

  public RelativeDelta() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public RelativeDelta(String type, Integer day, Integer days, Integer hour, Integer hours, Integer leapdays, Integer microsecond, Integer microseconds, Integer minute, Integer minutes, Integer month, Integer months, Integer second, Integer seconds, Integer year, Integer years) {
    this.type = type;
    this.day = day;
    this.days = days;
    this.hour = hour;
    this.hours = hours;
    this.leapdays = leapdays;
    this.microsecond = microsecond;
    this.microseconds = microseconds;
    this.minute = minute;
    this.minutes = minutes;
    this.month = month;
    this.months = months;
    this.second = second;
    this.seconds = seconds;
    this.year = year;
    this.years = years;
  }

  public RelativeDelta type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "__type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("__type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public RelativeDelta day(Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Get day
   * @return day
  */
  @NotNull 
  @Schema(name = "day", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("day")
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public RelativeDelta days(Integer days) {
    this.days = days;
    return this;
  }

  /**
   * Get days
   * @return days
  */
  @NotNull 
  @Schema(name = "days", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("days")
  public Integer getDays() {
    return days;
  }

  public void setDays(Integer days) {
    this.days = days;
  }

  public RelativeDelta hour(Integer hour) {
    this.hour = hour;
    return this;
  }

  /**
   * Get hour
   * @return hour
  */
  @NotNull 
  @Schema(name = "hour", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hour")
  public Integer getHour() {
    return hour;
  }

  public void setHour(Integer hour) {
    this.hour = hour;
  }

  public RelativeDelta hours(Integer hours) {
    this.hours = hours;
    return this;
  }

  /**
   * Get hours
   * @return hours
  */
  @NotNull 
  @Schema(name = "hours", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("hours")
  public Integer getHours() {
    return hours;
  }

  public void setHours(Integer hours) {
    this.hours = hours;
  }

  public RelativeDelta leapdays(Integer leapdays) {
    this.leapdays = leapdays;
    return this;
  }

  /**
   * Get leapdays
   * @return leapdays
  */
  @NotNull 
  @Schema(name = "leapdays", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("leapdays")
  public Integer getLeapdays() {
    return leapdays;
  }

  public void setLeapdays(Integer leapdays) {
    this.leapdays = leapdays;
  }

  public RelativeDelta microsecond(Integer microsecond) {
    this.microsecond = microsecond;
    return this;
  }

  /**
   * Get microsecond
   * @return microsecond
  */
  @NotNull 
  @Schema(name = "microsecond", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("microsecond")
  public Integer getMicrosecond() {
    return microsecond;
  }

  public void setMicrosecond(Integer microsecond) {
    this.microsecond = microsecond;
  }

  public RelativeDelta microseconds(Integer microseconds) {
    this.microseconds = microseconds;
    return this;
  }

  /**
   * Get microseconds
   * @return microseconds
  */
  @NotNull 
  @Schema(name = "microseconds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("microseconds")
  public Integer getMicroseconds() {
    return microseconds;
  }

  public void setMicroseconds(Integer microseconds) {
    this.microseconds = microseconds;
  }

  public RelativeDelta minute(Integer minute) {
    this.minute = minute;
    return this;
  }

  /**
   * Get minute
   * @return minute
  */
  @NotNull 
  @Schema(name = "minute", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("minute")
  public Integer getMinute() {
    return minute;
  }

  public void setMinute(Integer minute) {
    this.minute = minute;
  }

  public RelativeDelta minutes(Integer minutes) {
    this.minutes = minutes;
    return this;
  }

  /**
   * Get minutes
   * @return minutes
  */
  @NotNull 
  @Schema(name = "minutes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("minutes")
  public Integer getMinutes() {
    return minutes;
  }

  public void setMinutes(Integer minutes) {
    this.minutes = minutes;
  }

  public RelativeDelta month(Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Get month
   * @return month
  */
  @NotNull 
  @Schema(name = "month", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("month")
  public Integer getMonth() {
    return month;
  }

  public void setMonth(Integer month) {
    this.month = month;
  }

  public RelativeDelta months(Integer months) {
    this.months = months;
    return this;
  }

  /**
   * Get months
   * @return months
  */
  @NotNull 
  @Schema(name = "months", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("months")
  public Integer getMonths() {
    return months;
  }

  public void setMonths(Integer months) {
    this.months = months;
  }

  public RelativeDelta second(Integer second) {
    this.second = second;
    return this;
  }

  /**
   * Get second
   * @return second
  */
  @NotNull 
  @Schema(name = "second", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("second")
  public Integer getSecond() {
    return second;
  }

  public void setSecond(Integer second) {
    this.second = second;
  }

  public RelativeDelta seconds(Integer seconds) {
    this.seconds = seconds;
    return this;
  }

  /**
   * Get seconds
   * @return seconds
  */
  @NotNull 
  @Schema(name = "seconds", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("seconds")
  public Integer getSeconds() {
    return seconds;
  }

  public void setSeconds(Integer seconds) {
    this.seconds = seconds;
  }

  public RelativeDelta year(Integer year) {
    this.year = year;
    return this;
  }

  /**
   * Get year
   * @return year
  */
  @NotNull 
  @Schema(name = "year", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("year")
  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  public RelativeDelta years(Integer years) {
    this.years = years;
    return this;
  }

  /**
   * Get years
   * @return years
  */
  @NotNull 
  @Schema(name = "years", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("years")
  public Integer getYears() {
    return years;
  }

  public void setYears(Integer years) {
    this.years = years;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelativeDelta relativeDelta = (RelativeDelta) o;
    return Objects.equals(this.type, relativeDelta.type) &&
        Objects.equals(this.day, relativeDelta.day) &&
        Objects.equals(this.days, relativeDelta.days) &&
        Objects.equals(this.hour, relativeDelta.hour) &&
        Objects.equals(this.hours, relativeDelta.hours) &&
        Objects.equals(this.leapdays, relativeDelta.leapdays) &&
        Objects.equals(this.microsecond, relativeDelta.microsecond) &&
        Objects.equals(this.microseconds, relativeDelta.microseconds) &&
        Objects.equals(this.minute, relativeDelta.minute) &&
        Objects.equals(this.minutes, relativeDelta.minutes) &&
        Objects.equals(this.month, relativeDelta.month) &&
        Objects.equals(this.months, relativeDelta.months) &&
        Objects.equals(this.second, relativeDelta.second) &&
        Objects.equals(this.seconds, relativeDelta.seconds) &&
        Objects.equals(this.year, relativeDelta.year) &&
        Objects.equals(this.years, relativeDelta.years);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, day, days, hour, hours, leapdays, microsecond, microseconds, minute, minutes, month, months, second, seconds, year, years);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelativeDelta {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    leapdays: ").append(toIndentedString(leapdays)).append("\n");
    sb.append("    microsecond: ").append(toIndentedString(microsecond)).append("\n");
    sb.append("    microseconds: ").append(toIndentedString(microseconds)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    years: ").append(toIndentedString(years)).append("\n");
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

