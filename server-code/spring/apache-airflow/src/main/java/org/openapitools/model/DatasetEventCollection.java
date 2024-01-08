package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DatasetEvent;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A collection of dataset events.  *New in version 2.4.0* 
 */

@Schema(name = "DatasetEventCollection", description = "A collection of dataset events.  *New in version 2.4.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class DatasetEventCollection {

  private Integer totalEntries;

  @Valid
  private List<@Valid DatasetEvent> datasetEvents;

  public DatasetEventCollection totalEntries(Integer totalEntries) {
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

  public DatasetEventCollection datasetEvents(List<@Valid DatasetEvent> datasetEvents) {
    this.datasetEvents = datasetEvents;
    return this;
  }

  public DatasetEventCollection addDatasetEventsItem(DatasetEvent datasetEventsItem) {
    if (this.datasetEvents == null) {
      this.datasetEvents = new ArrayList<>();
    }
    this.datasetEvents.add(datasetEventsItem);
    return this;
  }

  /**
   * Get datasetEvents
   * @return datasetEvents
  */
  @Valid 
  @Schema(name = "dataset_events", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataset_events")
  public List<@Valid DatasetEvent> getDatasetEvents() {
    return datasetEvents;
  }

  public void setDatasetEvents(List<@Valid DatasetEvent> datasetEvents) {
    this.datasetEvents = datasetEvents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetEventCollection datasetEventCollection = (DatasetEventCollection) o;
    return Objects.equals(this.totalEntries, datasetEventCollection.totalEntries) &&
        Objects.equals(this.datasetEvents, datasetEventCollection.datasetEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalEntries, datasetEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetEventCollection {\n");
    sb.append("    totalEntries: ").append(toIndentedString(totalEntries)).append("\n");
    sb.append("    datasetEvents: ").append(toIndentedString(datasetEvents)).append("\n");
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

