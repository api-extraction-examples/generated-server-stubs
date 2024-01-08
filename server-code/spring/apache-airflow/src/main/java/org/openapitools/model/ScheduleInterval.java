package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.model.CronExpression;
import org.openapitools.model.RelativeDelta;
import org.openapitools.model.TimeDelta;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Schedule interval. Defines how often DAG runs, this object gets added to your latest task instance&#39;s execution_date to figure out the next schedule. 
 */

@Schema(name = "ScheduleInterval", description = "Schedule interval. Defines how often DAG runs, this object gets added to your latest task instance's execution_date to figure out the next schedule. ")
@JsonIgnoreProperties(
  value = "__type", // ignore manually set __type, it will be automatically generated by Jackson during serialization
  allowSetters = true // allows the __type to be set during deserialization
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "__type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CronExpression.class, name = "CronExpression"),
  @JsonSubTypes.Type(value = RelativeDelta.class, name = "RelativeDelta"),
  @JsonSubTypes.Type(value = TimeDelta.class, name = "TimeDelta")
})

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ScheduleInterval {

  private String type;

  private Integer days;

  private Integer microseconds;

  private Integer seconds;

  private Integer day;

  private Integer hour;

  private Integer hours;

  private Integer leapdays;

  private Integer microsecond;

  private Integer minute;

  private Integer minutes;

  private Integer month;

  private Integer months;

  private Integer second;

  private Integer year;

  private Integer years;

  private String value;

  public ScheduleInterval() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduleInterval(String type, Integer days, Integer microseconds, Integer seconds, Integer day, Integer hour, Integer hours, Integer leapdays, Integer microsecond, Integer minute, Integer minutes, Integer month, Integer months, Integer second, Integer year, Integer years, String value) {
    this.type = type;
    this.days = days;
    this.microseconds = microseconds;
    this.seconds = seconds;
    this.day = day;
    this.hour = hour;
    this.hours = hours;
    this.leapdays = leapdays;
    this.microsecond = microsecond;
    this.minute = minute;
    this.minutes = minutes;
    this.month = month;
    this.months = months;
    this.second = second;
    this.year = year;
    this.years = years;
    this.value = value;
  }

  public ScheduleInterval type(String type) {
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

  public ScheduleInterval days(Integer days) {
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

  public ScheduleInterval microseconds(Integer microseconds) {
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

  public ScheduleInterval seconds(Integer seconds) {
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

  public ScheduleInterval day(Integer day) {
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

  public ScheduleInterval hour(Integer hour) {
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

  public ScheduleInterval hours(Integer hours) {
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

  public ScheduleInterval leapdays(Integer leapdays) {
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

  public ScheduleInterval microsecond(Integer microsecond) {
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

  public ScheduleInterval minute(Integer minute) {
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

  public ScheduleInterval minutes(Integer minutes) {
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

  public ScheduleInterval month(Integer month) {
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

  public ScheduleInterval months(Integer months) {
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

  public ScheduleInterval second(Integer second) {
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

  public ScheduleInterval year(Integer year) {
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

  public ScheduleInterval years(Integer years) {
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

  public ScheduleInterval value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  @NotNull 
  @Schema(name = "value", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    ScheduleInterval scheduleInterval = (ScheduleInterval) o;
    return Objects.equals(this.type, scheduleInterval.type) &&
        Objects.equals(this.days, scheduleInterval.days) &&
        Objects.equals(this.microseconds, scheduleInterval.microseconds) &&
        Objects.equals(this.seconds, scheduleInterval.seconds) &&
        Objects.equals(this.day, scheduleInterval.day) &&
        Objects.equals(this.hour, scheduleInterval.hour) &&
        Objects.equals(this.hours, scheduleInterval.hours) &&
        Objects.equals(this.leapdays, scheduleInterval.leapdays) &&
        Objects.equals(this.microsecond, scheduleInterval.microsecond) &&
        Objects.equals(this.minute, scheduleInterval.minute) &&
        Objects.equals(this.minutes, scheduleInterval.minutes) &&
        Objects.equals(this.month, scheduleInterval.month) &&
        Objects.equals(this.months, scheduleInterval.months) &&
        Objects.equals(this.second, scheduleInterval.second) &&
        Objects.equals(this.year, scheduleInterval.year) &&
        Objects.equals(this.years, scheduleInterval.years) &&
        Objects.equals(this.value, scheduleInterval.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, days, microseconds, seconds, day, hour, hours, leapdays, microsecond, minute, minutes, month, months, second, year, years, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleInterval {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    microseconds: ").append(toIndentedString(microseconds)).append("\n");
    sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    hours: ").append(toIndentedString(hours)).append("\n");
    sb.append("    leapdays: ").append(toIndentedString(leapdays)).append("\n");
    sb.append("    microsecond: ").append(toIndentedString(microsecond)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
    sb.append("    minutes: ").append(toIndentedString(minutes)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
    sb.append("    second: ").append(toIndentedString(second)).append("\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    years: ").append(toIndentedString(years)).append("\n");
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

