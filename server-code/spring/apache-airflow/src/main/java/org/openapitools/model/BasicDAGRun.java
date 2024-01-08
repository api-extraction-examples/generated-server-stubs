package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DagState;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BasicDAGRun
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class BasicDAGRun {

  private String dagId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dataIntervalEnd = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> dataIntervalStart = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime logicalDate;

  private String runId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  private DagState state;

  public BasicDAGRun dagId(String dagId) {
    this.dagId = dagId;
    return this;
  }

  /**
   * Get dagId
   * @return dagId
  */
  
  @Schema(name = "dag_id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public String getDagId() {
    return dagId;
  }

  public void setDagId(String dagId) {
    this.dagId = dagId;
  }

  public BasicDAGRun dataIntervalEnd(OffsetDateTime dataIntervalEnd) {
    this.dataIntervalEnd = JsonNullable.of(dataIntervalEnd);
    return this;
  }

  /**
   * Get dataIntervalEnd
   * @return dataIntervalEnd
  */
  @Valid 
  @Schema(name = "data_interval_end", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_interval_end")
  public JsonNullable<OffsetDateTime> getDataIntervalEnd() {
    return dataIntervalEnd;
  }

  public void setDataIntervalEnd(JsonNullable<OffsetDateTime> dataIntervalEnd) {
    this.dataIntervalEnd = dataIntervalEnd;
  }

  public BasicDAGRun dataIntervalStart(OffsetDateTime dataIntervalStart) {
    this.dataIntervalStart = JsonNullable.of(dataIntervalStart);
    return this;
  }

  /**
   * Get dataIntervalStart
   * @return dataIntervalStart
  */
  @Valid 
  @Schema(name = "data_interval_start", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data_interval_start")
  public JsonNullable<OffsetDateTime> getDataIntervalStart() {
    return dataIntervalStart;
  }

  public void setDataIntervalStart(JsonNullable<OffsetDateTime> dataIntervalStart) {
    this.dataIntervalStart = dataIntervalStart;
  }

  public BasicDAGRun endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @Valid 
  @Schema(name = "end_date", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public JsonNullable<OffsetDateTime> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public BasicDAGRun logicalDate(OffsetDateTime logicalDate) {
    this.logicalDate = logicalDate;
    return this;
  }

  /**
   * The logical date (previously called execution date). This is the time or interval covered by this DAG run, according to the DAG definition.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  This together with DAG_ID are a unique key.  *New in version 2.2.0* 
   * @return logicalDate
  */
  @Valid 
  @Schema(name = "logical_date", description = "The logical date (previously called execution date). This is the time or interval covered by this DAG run, according to the DAG definition.  The value of this field can be set only when creating the object. If you try to modify the field of an existing object, the request fails with an BAD_REQUEST error.  This together with DAG_ID are a unique key.  *New in version 2.2.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logical_date")
  public OffsetDateTime getLogicalDate() {
    return logicalDate;
  }

  public void setLogicalDate(OffsetDateTime logicalDate) {
    this.logicalDate = logicalDate;
  }

  public BasicDAGRun runId(String runId) {
    this.runId = runId;
    return this;
  }

  /**
   * Run ID. 
   * @return runId
  */
  
  @Schema(name = "run_id", description = "Run ID. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("run_id")
  public String getRunId() {
    return runId;
  }

  public void setRunId(String runId) {
    this.runId = runId;
  }

  public BasicDAGRun startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * The start time. The time when DAG run was actually created.  *Changed in version 2.1.3*&#58; Field becomes nullable. 
   * @return startDate
  */
  @Valid 
  @Schema(name = "start_date", accessMode = Schema.AccessMode.READ_ONLY, description = "The start time. The time when DAG run was actually created.  *Changed in version 2.1.3*&#58; Field becomes nullable. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public JsonNullable<OffsetDateTime> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public BasicDAGRun state(DagState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public DagState getState() {
    return state;
  }

  public void setState(DagState state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicDAGRun basicDAGRun = (BasicDAGRun) o;
    return Objects.equals(this.dagId, basicDAGRun.dagId) &&
        equalsNullable(this.dataIntervalEnd, basicDAGRun.dataIntervalEnd) &&
        equalsNullable(this.dataIntervalStart, basicDAGRun.dataIntervalStart) &&
        equalsNullable(this.endDate, basicDAGRun.endDate) &&
        Objects.equals(this.logicalDate, basicDAGRun.logicalDate) &&
        Objects.equals(this.runId, basicDAGRun.runId) &&
        equalsNullable(this.startDate, basicDAGRun.startDate) &&
        Objects.equals(this.state, basicDAGRun.state);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, hashCodeNullable(dataIntervalEnd), hashCodeNullable(dataIntervalStart), hashCodeNullable(endDate), logicalDate, runId, hashCodeNullable(startDate), state);
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
    sb.append("class BasicDAGRun {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    dataIntervalEnd: ").append(toIndentedString(dataIntervalEnd)).append("\n");
    sb.append("    dataIntervalStart: ").append(toIndentedString(dataIntervalStart)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    logicalDate: ").append(toIndentedString(logicalDate)).append("\n");
    sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

