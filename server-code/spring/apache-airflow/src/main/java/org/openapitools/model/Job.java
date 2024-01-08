package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Job
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class Job {

  private JsonNullable<String> dagId = JsonNullable.<String>undefined();

  private JsonNullable<String> endDate = JsonNullable.<String>undefined();

  private JsonNullable<String> executorClass = JsonNullable.<String>undefined();

  private JsonNullable<String> hostname = JsonNullable.<String>undefined();

  private Integer id;

  private JsonNullable<String> jobType = JsonNullable.<String>undefined();

  private JsonNullable<String> latestHeartbeat = JsonNullable.<String>undefined();

  private JsonNullable<String> startDate = JsonNullable.<String>undefined();

  private JsonNullable<String> state = JsonNullable.<String>undefined();

  private JsonNullable<String> unixname = JsonNullable.<String>undefined();

  public Job dagId(String dagId) {
    this.dagId = JsonNullable.of(dagId);
    return this;
  }

  /**
   * Get dagId
   * @return dagId
  */
  
  @Schema(name = "dag_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public JsonNullable<String> getDagId() {
    return dagId;
  }

  public void setDagId(JsonNullable<String> dagId) {
    this.dagId = dagId;
  }

  public Job endDate(String endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  
  @Schema(name = "end_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public JsonNullable<String> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<String> endDate) {
    this.endDate = endDate;
  }

  public Job executorClass(String executorClass) {
    this.executorClass = JsonNullable.of(executorClass);
    return this;
  }

  /**
   * Get executorClass
   * @return executorClass
  */
  
  @Schema(name = "executor_class", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("executor_class")
  public JsonNullable<String> getExecutorClass() {
    return executorClass;
  }

  public void setExecutorClass(JsonNullable<String> executorClass) {
    this.executorClass = executorClass;
  }

  public Job hostname(String hostname) {
    this.hostname = JsonNullable.of(hostname);
    return this;
  }

  /**
   * Get hostname
   * @return hostname
  */
  
  @Schema(name = "hostname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hostname")
  public JsonNullable<String> getHostname() {
    return hostname;
  }

  public void setHostname(JsonNullable<String> hostname) {
    this.hostname = hostname;
  }

  public Job id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Job jobType(String jobType) {
    this.jobType = JsonNullable.of(jobType);
    return this;
  }

  /**
   * Get jobType
   * @return jobType
  */
  
  @Schema(name = "job_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("job_type")
  public JsonNullable<String> getJobType() {
    return jobType;
  }

  public void setJobType(JsonNullable<String> jobType) {
    this.jobType = jobType;
  }

  public Job latestHeartbeat(String latestHeartbeat) {
    this.latestHeartbeat = JsonNullable.of(latestHeartbeat);
    return this;
  }

  /**
   * Get latestHeartbeat
   * @return latestHeartbeat
  */
  
  @Schema(name = "latest_heartbeat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latest_heartbeat")
  public JsonNullable<String> getLatestHeartbeat() {
    return latestHeartbeat;
  }

  public void setLatestHeartbeat(JsonNullable<String> latestHeartbeat) {
    this.latestHeartbeat = latestHeartbeat;
  }

  public Job startDate(String startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  
  @Schema(name = "start_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public JsonNullable<String> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<String> startDate) {
    this.startDate = startDate;
  }

  public Job state(String state) {
    this.state = JsonNullable.of(state);
    return this;
  }

  /**
   * Get state
   * @return state
  */
  
  @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("state")
  public JsonNullable<String> getState() {
    return state;
  }

  public void setState(JsonNullable<String> state) {
    this.state = state;
  }

  public Job unixname(String unixname) {
    this.unixname = JsonNullable.of(unixname);
    return this;
  }

  /**
   * Get unixname
   * @return unixname
  */
  
  @Schema(name = "unixname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unixname")
  public JsonNullable<String> getUnixname() {
    return unixname;
  }

  public void setUnixname(JsonNullable<String> unixname) {
    this.unixname = unixname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return equalsNullable(this.dagId, job.dagId) &&
        equalsNullable(this.endDate, job.endDate) &&
        equalsNullable(this.executorClass, job.executorClass) &&
        equalsNullable(this.hostname, job.hostname) &&
        Objects.equals(this.id, job.id) &&
        equalsNullable(this.jobType, job.jobType) &&
        equalsNullable(this.latestHeartbeat, job.latestHeartbeat) &&
        equalsNullable(this.startDate, job.startDate) &&
        equalsNullable(this.state, job.state) &&
        equalsNullable(this.unixname, job.unixname);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(dagId), hashCodeNullable(endDate), hashCodeNullable(executorClass), hashCodeNullable(hostname), id, hashCodeNullable(jobType), hashCodeNullable(latestHeartbeat), hashCodeNullable(startDate), hashCodeNullable(state), hashCodeNullable(unixname));
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
    sb.append("class Job {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    executorClass: ").append(toIndentedString(executorClass)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
    sb.append("    latestHeartbeat: ").append(toIndentedString(latestHeartbeat)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    unixname: ").append(toIndentedString(unixname)).append("\n");
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

