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
 * Represents a weekly bucket of instance activity.
 */

@Schema(name = "Activity", description = "Represents a weekly bucket of instance activity.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Activity {

  private String logins;

  private String registrations;

  private String statuses;

  private String week;

  public Activity logins(String logins) {
    this.logins = logins;
    return this;
  }

  /**
   * User logins since the week began, String (cast from an integer).
   * @return logins
  */
  
  @Schema(name = "logins", description = "User logins since the week began, String (cast from an integer).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logins")
  public String getLogins() {
    return logins;
  }

  public void setLogins(String logins) {
    this.logins = logins;
  }

  public Activity registrations(String registrations) {
    this.registrations = registrations;
    return this;
  }

  /**
   * User registrations since the week began, String (cast from an integer).
   * @return registrations
  */
  
  @Schema(name = "registrations", description = "User registrations since the week began, String (cast from an integer).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("registrations")
  public String getRegistrations() {
    return registrations;
  }

  public void setRegistrations(String registrations) {
    this.registrations = registrations;
  }

  public Activity statuses(String statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Statuses created since the week began, String (cast from an integer).
   * @return statuses
  */
  
  @Schema(name = "statuses", description = "Statuses created since the week began, String (cast from an integer).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public String getStatuses() {
    return statuses;
  }

  public void setStatuses(String statuses) {
    this.statuses = statuses;
  }

  public Activity week(String week) {
    this.week = week;
    return this;
  }

  /**
   * Midnight at the first day of the week.  (UNIX Timestamp).
   * @return week
  */
  
  @Schema(name = "week", description = "Midnight at the first day of the week.  (UNIX Timestamp).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("week")
  public String getWeek() {
    return week;
  }

  public void setWeek(String week) {
    this.week = week;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.logins, activity.logins) &&
        Objects.equals(this.registrations, activity.registrations) &&
        Objects.equals(this.statuses, activity.statuses) &&
        Objects.equals(this.week, activity.week);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logins, registrations, statuses, week);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    sb.append("    logins: ").append(toIndentedString(logins)).append("\n");
    sb.append("    registrations: ").append(toIndentedString(registrations)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    week: ").append(toIndentedString(week)).append("\n");
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

