package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import org.openapitools.model.DynamicDayOfWeek;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An entity representing a user&#39;s access schedule.
 */

@Schema(name = "AccessSchedule", description = "An entity representing a user's access schedule.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class AccessSchedule {

  private DynamicDayOfWeek dayOfWeek;

  private Double endHour;

  private Integer id;

  private Double startHour;

  private UUID userId;

  public AccessSchedule() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AccessSchedule(DynamicDayOfWeek dayOfWeek, Double endHour, Integer id, Double startHour, UUID userId) {
    this.dayOfWeek = dayOfWeek;
    this.endHour = endHour;
    this.id = id;
    this.startHour = startHour;
    this.userId = userId;
  }

  public AccessSchedule dayOfWeek(DynamicDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Get dayOfWeek
   * @return dayOfWeek
  */
  @NotNull @Valid 
  @Schema(name = "DayOfWeek", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("DayOfWeek")
  public DynamicDayOfWeek getDayOfWeek() {
    return dayOfWeek;
  }

  public void setDayOfWeek(DynamicDayOfWeek dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
  }

  public AccessSchedule endHour(Double endHour) {
    this.endHour = endHour;
    return this;
  }

  /**
   * Gets or sets the end hour.
   * @return endHour
  */
  @NotNull 
  @Schema(name = "EndHour", description = "Gets or sets the end hour.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EndHour")
  public Double getEndHour() {
    return endHour;
  }

  public void setEndHour(Double endHour) {
    this.endHour = endHour;
  }

  public AccessSchedule id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Gets or sets the id of this instance.
   * @return id
  */
  
  @Schema(name = "Id", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets or sets the id of this instance.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AccessSchedule startHour(Double startHour) {
    this.startHour = startHour;
    return this;
  }

  /**
   * Gets or sets the start hour.
   * @return startHour
  */
  @NotNull 
  @Schema(name = "StartHour", description = "Gets or sets the start hour.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("StartHour")
  public Double getStartHour() {
    return startHour;
  }

  public void setStartHour(Double startHour) {
    this.startHour = startHour;
  }

  public AccessSchedule userId(UUID userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Gets or sets the id of the associated user.
   * @return userId
  */
  @Valid 
  @Schema(name = "UserId", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets or sets the id of the associated user.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("UserId")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessSchedule accessSchedule = (AccessSchedule) o;
    return Objects.equals(this.dayOfWeek, accessSchedule.dayOfWeek) &&
        Objects.equals(this.endHour, accessSchedule.endHour) &&
        Objects.equals(this.id, accessSchedule.id) &&
        Objects.equals(this.startHour, accessSchedule.startHour) &&
        Objects.equals(this.userId, accessSchedule.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dayOfWeek, endHour, id, startHour, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessSchedule {\n");
    sb.append("    dayOfWeek: ").append(toIndentedString(dayOfWeek)).append("\n");
    sb.append("    endHour: ").append(toIndentedString(endHour)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startHour: ").append(toIndentedString(startHour)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

