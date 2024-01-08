package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BasicDAGRun;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A dataset event.  *New in version 2.4.0* 
 */

@Schema(name = "DatasetEvent", description = "A dataset event.  *New in version 2.4.0* ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class DatasetEvent {

  @Valid
  private List<@Valid BasicDAGRun> createdDagruns;

  private Integer datasetId;

  private String datasetUri;

  private JsonNullable<Object> extra = JsonNullable.<Object>undefined();

  private JsonNullable<String> sourceDagId = JsonNullable.<String>undefined();

  private JsonNullable<Integer> sourceMapIndex = JsonNullable.<Integer>undefined();

  private JsonNullable<String> sourceRunId = JsonNullable.<String>undefined();

  private JsonNullable<String> sourceTaskId = JsonNullable.<String>undefined();

  private String timestamp;

  public DatasetEvent createdDagruns(List<@Valid BasicDAGRun> createdDagruns) {
    this.createdDagruns = createdDagruns;
    return this;
  }

  public DatasetEvent addCreatedDagrunsItem(BasicDAGRun createdDagrunsItem) {
    if (this.createdDagruns == null) {
      this.createdDagruns = new ArrayList<>();
    }
    this.createdDagruns.add(createdDagrunsItem);
    return this;
  }

  /**
   * Get createdDagruns
   * @return createdDagruns
  */
  @Valid 
  @Schema(name = "created_dagruns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_dagruns")
  public List<@Valid BasicDAGRun> getCreatedDagruns() {
    return createdDagruns;
  }

  public void setCreatedDagruns(List<@Valid BasicDAGRun> createdDagruns) {
    this.createdDagruns = createdDagruns;
  }

  public DatasetEvent datasetId(Integer datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * The dataset id
   * @return datasetId
  */
  
  @Schema(name = "dataset_id", description = "The dataset id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataset_id")
  public Integer getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(Integer datasetId) {
    this.datasetId = datasetId;
  }

  public DatasetEvent datasetUri(String datasetUri) {
    this.datasetUri = datasetUri;
    return this;
  }

  /**
   * The URI of the dataset
   * @return datasetUri
  */
  
  @Schema(name = "dataset_uri", description = "The URI of the dataset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataset_uri")
  public String getDatasetUri() {
    return datasetUri;
  }

  public void setDatasetUri(String datasetUri) {
    this.datasetUri = datasetUri;
  }

  public DatasetEvent extra(Object extra) {
    this.extra = JsonNullable.of(extra);
    return this;
  }

  /**
   * The dataset event extra
   * @return extra
  */
  
  @Schema(name = "extra", description = "The dataset event extra", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra")
  public JsonNullable<Object> getExtra() {
    return extra;
  }

  public void setExtra(JsonNullable<Object> extra) {
    this.extra = extra;
  }

  public DatasetEvent sourceDagId(String sourceDagId) {
    this.sourceDagId = JsonNullable.of(sourceDagId);
    return this;
  }

  /**
   * The DAG ID that updated the dataset.
   * @return sourceDagId
  */
  
  @Schema(name = "source_dag_id", description = "The DAG ID that updated the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source_dag_id")
  public JsonNullable<String> getSourceDagId() {
    return sourceDagId;
  }

  public void setSourceDagId(JsonNullable<String> sourceDagId) {
    this.sourceDagId = sourceDagId;
  }

  public DatasetEvent sourceMapIndex(Integer sourceMapIndex) {
    this.sourceMapIndex = JsonNullable.of(sourceMapIndex);
    return this;
  }

  /**
   * The task map index that updated the dataset.
   * @return sourceMapIndex
  */
  
  @Schema(name = "source_map_index", description = "The task map index that updated the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source_map_index")
  public JsonNullable<Integer> getSourceMapIndex() {
    return sourceMapIndex;
  }

  public void setSourceMapIndex(JsonNullable<Integer> sourceMapIndex) {
    this.sourceMapIndex = sourceMapIndex;
  }

  public DatasetEvent sourceRunId(String sourceRunId) {
    this.sourceRunId = JsonNullable.of(sourceRunId);
    return this;
  }

  /**
   * The DAG run ID that updated the dataset.
   * @return sourceRunId
  */
  
  @Schema(name = "source_run_id", description = "The DAG run ID that updated the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source_run_id")
  public JsonNullable<String> getSourceRunId() {
    return sourceRunId;
  }

  public void setSourceRunId(JsonNullable<String> sourceRunId) {
    this.sourceRunId = sourceRunId;
  }

  public DatasetEvent sourceTaskId(String sourceTaskId) {
    this.sourceTaskId = JsonNullable.of(sourceTaskId);
    return this;
  }

  /**
   * The task ID that updated the dataset.
   * @return sourceTaskId
  */
  
  @Schema(name = "source_task_id", description = "The task ID that updated the dataset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("source_task_id")
  public JsonNullable<String> getSourceTaskId() {
    return sourceTaskId;
  }

  public void setSourceTaskId(JsonNullable<String> sourceTaskId) {
    this.sourceTaskId = sourceTaskId;
  }

  public DatasetEvent timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The dataset event creation time
   * @return timestamp
  */
  
  @Schema(name = "timestamp", description = "The dataset event creation time", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetEvent datasetEvent = (DatasetEvent) o;
    return Objects.equals(this.createdDagruns, datasetEvent.createdDagruns) &&
        Objects.equals(this.datasetId, datasetEvent.datasetId) &&
        Objects.equals(this.datasetUri, datasetEvent.datasetUri) &&
        equalsNullable(this.extra, datasetEvent.extra) &&
        equalsNullable(this.sourceDagId, datasetEvent.sourceDagId) &&
        equalsNullable(this.sourceMapIndex, datasetEvent.sourceMapIndex) &&
        equalsNullable(this.sourceRunId, datasetEvent.sourceRunId) &&
        equalsNullable(this.sourceTaskId, datasetEvent.sourceTaskId) &&
        Objects.equals(this.timestamp, datasetEvent.timestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdDagruns, datasetId, datasetUri, hashCodeNullable(extra), hashCodeNullable(sourceDagId), hashCodeNullable(sourceMapIndex), hashCodeNullable(sourceRunId), hashCodeNullable(sourceTaskId), timestamp);
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
    sb.append("class DatasetEvent {\n");
    sb.append("    createdDagruns: ").append(toIndentedString(createdDagruns)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    datasetUri: ").append(toIndentedString(datasetUri)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    sourceDagId: ").append(toIndentedString(sourceDagId)).append("\n");
    sb.append("    sourceMapIndex: ").append(toIndentedString(sourceMapIndex)).append("\n");
    sb.append("    sourceRunId: ").append(toIndentedString(sourceRunId)).append("\n");
    sb.append("    sourceTaskId: ").append(toIndentedString(sourceTaskId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

