package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EventLog;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Collection of event logs.  *Changed in version 2.1.0*&amp;#58; &#39;total_entries&#39; field is added. 
 */

@Schema(name = "EventLogCollection", description = "Collection of event logs.  *Changed in version 2.1.0*&#58; 'total_entries' field is added. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class EventLogCollection {

  private Integer totalEntries;

  @Valid
  private List<@Valid EventLog> eventLogs;

  public EventLogCollection totalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
    return this;
  }

  /**
   * Count of total objects in the current result set before pagination parameters (limit, offset) are applied. 
   * @return totalEntries
  */
  
  @Schema(name = "total_entries", description = "Count of total objects in the current result set before pagination parameters (limit, offset) are applied. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_entries")
  public Integer getTotalEntries() {
    return totalEntries;
  }

  public void setTotalEntries(Integer totalEntries) {
    this.totalEntries = totalEntries;
  }

  public EventLogCollection eventLogs(List<@Valid EventLog> eventLogs) {
    this.eventLogs = eventLogs;
    return this;
  }

  public EventLogCollection addEventLogsItem(EventLog eventLogsItem) {
    if (this.eventLogs == null) {
      this.eventLogs = new ArrayList<>();
    }
    this.eventLogs.add(eventLogsItem);
    return this;
  }

  /**
   * Get eventLogs
   * @return eventLogs
  */
  @Valid 
  @Schema(name = "event_logs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_logs")
  public List<@Valid EventLog> getEventLogs() {
    return eventLogs;
  }

  public void setEventLogs(List<@Valid EventLog> eventLogs) {
    this.eventLogs = eventLogs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventLogCollection eventLogCollection = (EventLogCollection) o;
    return Objects.equals(this.totalEntries, eventLogCollection.totalEntries) &&
        Objects.equals(this.eventLogs, eventLogCollection.eventLogs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEntries, eventLogs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventLogCollection {\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    eventLogs: ").append(toIndentedString(eventLogs)).append("\n");
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

