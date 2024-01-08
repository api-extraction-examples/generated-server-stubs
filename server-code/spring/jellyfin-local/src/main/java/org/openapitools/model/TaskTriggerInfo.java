package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DayOfWeek;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class TaskTriggerInfo.
 */

@Schema(name = "TaskTriggerInfo", description = "Class TaskTriggerInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TaskTriggerInfo {

  private DayOfWeek dayOfWeek;

  private JsonNullable<Long> intervalTicks = JsonNullable.<Long>undefined();

  private JsonNullable<Long> maxRuntimeTicks = JsonNullable.<Long>undefined();

  private JsonNullable<Long> timeOfDayTicks = JsonNullable.<Long>undefined();

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public TaskTriggerInfo dayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  */
  @Valid 
  @Schema(name = "DayOfWeek", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DayOfWeek")
  public DayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public TaskTriggerInfo intervalTicks(Long intervalTicks) {
    this.intervalTicks = JsonNullable.of(intervalTicks);
    return this;
  }

  /**
   * Gets or sets the interval.
   * @return intervalTicks
  */
  
  @Schema(name = "IntervalTicks", description = "Gets or sets the interval.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IntervalTicks")
  public JsonNullable<Long> getIntervalTicks() {
    return intervalTicks;
  }

  public void setIntervalTicks(JsonNullable<Long> intervalTicks) {
    this.intervalTicks = intervalTicks;
  }

  public TaskTriggerInfo maxRuntimeTicks(Long maxRuntimeTicks) {
    this.maxRuntimeTicks = JsonNullable.of(maxRuntimeTicks);
    return this;
  }

  /**
   * Gets or sets the maximum runtime ticks.
   * @return maxRuntimeTicks
  */
  
  @Schema(name = "MaxRuntimeTicks", description = "Gets or sets the maximum runtime ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxRuntimeTicks")
  public JsonNullable<Long> getMaxRuntimeTicks() {
    return maxRuntimeTicks;
  }

  public void setMaxRuntimeTicks(JsonNullable<Long> maxRuntimeTicks) {
    this.maxRuntimeTicks = maxRuntimeTicks;
  }

  public TaskTriggerInfo timeOfDayTicks(Long timeOfDayTicks) {
    this.timeOfDayTicks = JsonNullable.of(timeOfDayTicks);
    return this;
  }

  /**
   * Gets or sets the time of day.
   * @return timeOfDayTicks
  */
  
  @Schema(name = "TimeOfDayTicks", description = "Gets or sets the time of day.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TimeOfDayTicks")
  public JsonNullable<Long> getTimeOfDayTicks() {
    return timeOfDayTicks;
  }

  public void setTimeOfDayTicks(JsonNullable<Long> timeOfDayTicks) {
    this.timeOfDayTicks = timeOfDayTicks;
  }

  public TaskTriggerInfo type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Gets or sets the type.
   * @return type
  */
  
  @Schema(name = "Type", description = "Gets or sets the type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public JsonNullable<String> getType() {
    return type;
  }

  public void setType(JsonNullable<String> type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskTriggerInfo taskTriggerInfo = (TaskTriggerInfo) o;
    return Objects.equals(this.dayOfWeek, taskTriggerInfo.dayOfWeek) &&
        equalsNullable(this.intervalTicks, taskTriggerInfo.intervalTicks) &&
        equalsNullable(this.maxRuntimeTicks, taskTriggerInfo.maxRuntimeTicks) &&
        equalsNullable(this.timeOfDayTicks, taskTriggerInfo.timeOfDayTicks) &&
        equalsNullable(this.type, taskTriggerInfo.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, hashCodeNullable(intervalTicks), hashCodeNullable(maxRuntimeTicks), hashCodeNullable(timeOfDayTicks), hashCodeNullable(type));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskTriggerInfo {\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    intervalTicks: ").append(toIndentedString(intervalTicks)).append("\n");
    sb.append("    maxRuntimeTicks: ").append(toIndentedString(maxRuntimeTicks)).append("\n");
    sb.append("    timeOfDayTicks: ").append(toIndentedString(timeOfDayTicks)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

