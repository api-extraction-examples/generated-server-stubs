package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the time tracking configuration.
 */

@Schema(name = "TimeTrackingConfiguration", description = "Details of the time tracking configuration.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class TimeTrackingConfiguration {

  /**
   * The default unit of time applied to logged time.
   */
  public enum DefaultUnitEnum {
    MINUTE("minute"),
    
    HOUR("hour"),
    
    DAY("day"),
    
    WEEK("week");

    private String value;

    DefaultUnitEnum(String value) {
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
    public static DefaultUnitEnum fromValue(String value) {
      for (DefaultUnitEnum b : DefaultUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DefaultUnitEnum defaultUnit;

  /**
   * The format that will appear on an issue's *Time Spent* field.
   */
  public enum TimeFormatEnum {
    PRETTY("pretty"),
    
    DAYS("days"),
    
    HOURS("hours");

    private String value;

    TimeFormatEnum(String value) {
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
    public static TimeFormatEnum fromValue(String value) {
      for (TimeFormatEnum b : TimeFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TimeFormatEnum timeFormat;

  private Double workingDaysPerWeek;

  private Double workingHoursPerDay;

  public TimeTrackingConfiguration() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TimeTrackingConfiguration(DefaultUnitEnum defaultUnit, TimeFormatEnum timeFormat, Double workingDaysPerWeek, Double workingHoursPerDay) {
    this.defaultUnit = defaultUnit;
    this.timeFormat = timeFormat;
    this.workingDaysPerWeek = workingDaysPerWeek;
    this.workingHoursPerDay = workingHoursPerDay;
  }

  public TimeTrackingConfiguration defaultUnit(DefaultUnitEnum defaultUnit) {
    this.defaultUnit = defaultUnit;
    return this;
  }

  /**
   * The default unit of time applied to logged time.
   * @return defaultUnit
  */
  @NotNull 
  @Schema(name = "defaultUnit", description = "The default unit of time applied to logged time.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("defaultUnit")
  public DefaultUnitEnum getDefaultUnit() {
    return defaultUnit;
  }

  public void setDefaultUnit(DefaultUnitEnum defaultUnit) {
    this.defaultUnit = defaultUnit;
  }

  public TimeTrackingConfiguration timeFormat(TimeFormatEnum timeFormat) {
    this.timeFormat = timeFormat;
    return this;
  }

  /**
   * The format that will appear on an issue's *Time Spent* field.
   * @return timeFormat
  */
  @NotNull 
  @Schema(name = "timeFormat", description = "The format that will appear on an issue's *Time Spent* field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("timeFormat")
  public TimeFormatEnum getTimeFormat() {
    return timeFormat;
  }

  public void setTimeFormat(TimeFormatEnum timeFormat) {
    this.timeFormat = timeFormat;
  }

  public TimeTrackingConfiguration workingDaysPerWeek(Double workingDaysPerWeek) {
    this.workingDaysPerWeek = workingDaysPerWeek;
    return this;
  }

  /**
   * The number of days in a working week.
   * @return workingDaysPerWeek
  */
  @NotNull 
  @Schema(name = "workingDaysPerWeek", description = "The number of days in a working week.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workingDaysPerWeek")
  public Double getWorkingDaysPerWeek() {
    return workingDaysPerWeek;
  }

  public void setWorkingDaysPerWeek(Double workingDaysPerWeek) {
    this.workingDaysPerWeek = workingDaysPerWeek;
  }

  public TimeTrackingConfiguration workingHoursPerDay(Double workingHoursPerDay) {
    this.workingHoursPerDay = workingHoursPerDay;
    return this;
  }

  /**
   * The number of hours in a working day.
   * @return workingHoursPerDay
  */
  @NotNull 
  @Schema(name = "workingHoursPerDay", description = "The number of hours in a working day.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("workingHoursPerDay")
  public Double getWorkingHoursPerDay() {
    return workingHoursPerDay;
  }

  public void setWorkingHoursPerDay(Double workingHoursPerDay) {
    this.workingHoursPerDay = workingHoursPerDay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeTrackingConfiguration timeTrackingConfiguration = (TimeTrackingConfiguration) o;
    return Objects.equals(this.defaultUnit, timeTrackingConfiguration.defaultUnit) &&
        Objects.equals(this.timeFormat, timeTrackingConfiguration.timeFormat) &&
        Objects.equals(this.workingDaysPerWeek, timeTrackingConfiguration.workingDaysPerWeek) &&
        Objects.equals(this.workingHoursPerDay, timeTrackingConfiguration.workingHoursPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultUnit, timeFormat, workingDaysPerWeek, workingHoursPerDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingConfiguration {\n");
    sb.append("    defaultUnit: ").append(toIndentedString(defaultUnit)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    workingDaysPerWeek: ").append(toIndentedString(workingDaysPerWeek)).append("\n");
    sb.append("    workingHoursPerDay: ").append(toIndentedString(workingHoursPerDay)).append("\n");
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

