package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ScheduleInterval;
import org.openapitools.model.Tag;
import org.openapitools.model.TimeDelta;
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
 * DAG details.  For details see: [airflow.models.DAG](https://airflow.apache.org/docs/apache-airflow/stable/_api/airflow/models/index.html#airflow.models.DAG) 
 */

@Schema(name = "DAGDetail", description = "DAG details.  For details see: [airflow.models.DAG](https://airflow.apache.org/docs/apache-airflow/stable/_api/airflow/models/index.html#airflow.models.DAG) ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class DAGDetail {

  private String dagId;

  private String defaultView;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private String fileToken;

  private String fileloc;

  private JsonNullable<Boolean> hasImportErrors = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> hasTaskConcurrencyLimits = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isActive = JsonNullable.<Boolean>undefined();

  private JsonNullable<Boolean> isPaused = JsonNullable.<Boolean>undefined();

  private Boolean isSubdag;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> lastExpired = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> lastParsedTime = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> lastPickled = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Integer> maxActiveRuns = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> maxActiveTasks = JsonNullable.<Integer>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> nextDagrun = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> nextDagrunCreateAfter = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> nextDagrunDataIntervalEnd = JsonNullable.<OffsetDateTime>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> nextDagrunDataIntervalStart = JsonNullable.<OffsetDateTime>undefined();

  @Valid
  private List<String> owners;

  private JsonNullable<String> pickleId = JsonNullable.<String>undefined();

  private JsonNullable<String> rootDagId = JsonNullable.<String>undefined();

  private JsonNullable<ScheduleInterval> scheduleInterval = JsonNullable.<ScheduleInterval>undefined();

  private JsonNullable<Boolean> schedulerLock = JsonNullable.<Boolean>undefined();

  @Valid
  private JsonNullable<List<@Valid Tag>> tags = JsonNullable.<List<@Valid Tag>>undefined();

  private JsonNullable<String> timetableDescription = JsonNullable.<String>undefined();

  private Boolean catchup;

  private BigDecimal concurrency;

  private TimeDelta dagRunTimeout;

  private JsonNullable<String> docMd = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> endDate = JsonNullable.<OffsetDateTime>undefined();

  private JsonNullable<Boolean> isPausedUponCreation = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> lastParsed = JsonNullable.<OffsetDateTime>undefined();

  private String orientation;

  private Object params;

  private JsonNullable<Boolean> renderTemplateAsNativeObj = JsonNullable.<Boolean>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private JsonNullable<OffsetDateTime> startDate = JsonNullable.<OffsetDateTime>undefined();

  @Valid
  private JsonNullable<List<String>> templateSearchPath = JsonNullable.<List<String>>undefined();

  private String timezone;

  public DAGDetail dagId(String dagId) {
    this.dagId = dagId;
    return this;
  }

  /**
   * The ID of the DAG.
   * @return dagId
  */
  
  @Schema(name = "dag_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the DAG.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public String getDagId() {
    return dagId;
  }

  public void setDagId(String dagId) {
    this.dagId = dagId;
  }

  public DAGDetail defaultView(String defaultView) {
    this.defaultView = defaultView;
    return this;
  }

  /**
   * Get defaultView
   * @return defaultView
  */
  
  @Schema(name = "default_view", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_view")
  public String getDefaultView() {
    return defaultView;
  }

  public void setDefaultView(String defaultView) {
    this.defaultView = defaultView;
  }

  public DAGDetail description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * User-provided DAG description, which can consist of several sentences or paragraphs that describe DAG contents. 
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "User-provided DAG description, which can consist of several sentences or paragraphs that describe DAG contents. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public DAGDetail fileToken(String fileToken) {
    this.fileToken = fileToken;
    return this;
  }

  /**
   * The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. 
   * @return fileToken
  */
  
  @Schema(name = "file_token", accessMode = Schema.AccessMode.READ_ONLY, description = "The key containing the encrypted path to the file. Encryption and decryption take place only on the server. This prevents the client from reading an non-DAG file. This also ensures API extensibility, because the format of encrypted data may change. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file_token")
  public String getFileToken() {
    return fileToken;
  }

  public void setFileToken(String fileToken) {
    this.fileToken = fileToken;
  }

  public DAGDetail fileloc(String fileloc) {
    this.fileloc = fileloc;
    return this;
  }

  /**
   * The absolute path to the file.
   * @return fileloc
  */
  
  @Schema(name = "fileloc", accessMode = Schema.AccessMode.READ_ONLY, description = "The absolute path to the file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileloc")
  public String getFileloc() {
    return fileloc;
  }

  public void setFileloc(String fileloc) {
    this.fileloc = fileloc;
  }

  public DAGDetail hasImportErrors(Boolean hasImportErrors) {
    this.hasImportErrors = JsonNullable.of(hasImportErrors);
    return this;
  }

  /**
   * Whether the DAG has import errors  *New in version 2.3.0* 
   * @return hasImportErrors
  */
  
  @Schema(name = "has_import_errors", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the DAG has import errors  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_import_errors")
  public JsonNullable<Boolean> getHasImportErrors() {
    return hasImportErrors;
  }

  public void setHasImportErrors(JsonNullable<Boolean> hasImportErrors) {
    this.hasImportErrors = hasImportErrors;
  }

  public DAGDetail hasTaskConcurrencyLimits(Boolean hasTaskConcurrencyLimits) {
    this.hasTaskConcurrencyLimits = JsonNullable.of(hasTaskConcurrencyLimits);
    return this;
  }

  /**
   * Whether the DAG has task concurrency limits  *New in version 2.3.0* 
   * @return hasTaskConcurrencyLimits
  */
  
  @Schema(name = "has_task_concurrency_limits", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the DAG has task concurrency limits  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("has_task_concurrency_limits")
  public JsonNullable<Boolean> getHasTaskConcurrencyLimits() {
    return hasTaskConcurrencyLimits;
  }

  public void setHasTaskConcurrencyLimits(JsonNullable<Boolean> hasTaskConcurrencyLimits) {
    this.hasTaskConcurrencyLimits = hasTaskConcurrencyLimits;
  }

  public DAGDetail isActive(Boolean isActive) {
    this.isActive = JsonNullable.of(isActive);
    return this;
  }

  /**
   * Whether the DAG is currently seen by the scheduler(s).  *New in version 2.1.1*  *Changed in version 2.2.0*&#58; Field is read-only. 
   * @return isActive
  */
  
  @Schema(name = "is_active", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the DAG is currently seen by the scheduler(s).  *New in version 2.1.1*  *Changed in version 2.2.0*&#58; Field is read-only. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_active")
  public JsonNullable<Boolean> getIsActive() {
    return isActive;
  }

  public void setIsActive(JsonNullable<Boolean> isActive) {
    this.isActive = isActive;
  }

  public DAGDetail isPaused(Boolean isPaused) {
    this.isPaused = JsonNullable.of(isPaused);
    return this;
  }

  /**
   * Whether the DAG is paused.
   * @return isPaused
  */
  
  @Schema(name = "is_paused", description = "Whether the DAG is paused.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_paused")
  public JsonNullable<Boolean> getIsPaused() {
    return isPaused;
  }

  public void setIsPaused(JsonNullable<Boolean> isPaused) {
    this.isPaused = isPaused;
  }

  public DAGDetail isSubdag(Boolean isSubdag) {
    this.isSubdag = isSubdag;
    return this;
  }

  /**
   * Whether the DAG is SubDAG.
   * @return isSubdag
  */
  
  @Schema(name = "is_subdag", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the DAG is SubDAG.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_subdag")
  public Boolean getIsSubdag() {
    return isSubdag;
  }

  public void setIsSubdag(Boolean isSubdag) {
    this.isSubdag = isSubdag;
  }

  public DAGDetail lastExpired(OffsetDateTime lastExpired) {
    this.lastExpired = JsonNullable.of(lastExpired);
    return this;
  }

  /**
   * Time when the DAG last received a refresh signal (e.g. the DAG's \"refresh\" button was clicked in the web UI)  *New in version 2.3.0* 
   * @return lastExpired
  */
  @Valid 
  @Schema(name = "last_expired", accessMode = Schema.AccessMode.READ_ONLY, description = "Time when the DAG last received a refresh signal (e.g. the DAG's \"refresh\" button was clicked in the web UI)  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_expired")
  public JsonNullable<OffsetDateTime> getLastExpired() {
    return lastExpired;
  }

  public void setLastExpired(JsonNullable<OffsetDateTime> lastExpired) {
    this.lastExpired = lastExpired;
  }

  public DAGDetail lastParsedTime(OffsetDateTime lastParsedTime) {
    this.lastParsedTime = JsonNullable.of(lastParsedTime);
    return this;
  }

  /**
   * The last time the DAG was parsed.  *New in version 2.3.0* 
   * @return lastParsedTime
  */
  @Valid 
  @Schema(name = "last_parsed_time", accessMode = Schema.AccessMode.READ_ONLY, description = "The last time the DAG was parsed.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_parsed_time")
  public JsonNullable<OffsetDateTime> getLastParsedTime() {
    return lastParsedTime;
  }

  public void setLastParsedTime(JsonNullable<OffsetDateTime> lastParsedTime) {
    this.lastParsedTime = lastParsedTime;
  }

  public DAGDetail lastPickled(OffsetDateTime lastPickled) {
    this.lastPickled = JsonNullable.of(lastPickled);
    return this;
  }

  /**
   * The last time the DAG was pickled.  *New in version 2.3.0* 
   * @return lastPickled
  */
  @Valid 
  @Schema(name = "last_pickled", accessMode = Schema.AccessMode.READ_ONLY, description = "The last time the DAG was pickled.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_pickled")
  public JsonNullable<OffsetDateTime> getLastPickled() {
    return lastPickled;
  }

  public void setLastPickled(JsonNullable<OffsetDateTime> lastPickled) {
    this.lastPickled = lastPickled;
  }

  public DAGDetail maxActiveRuns(Integer maxActiveRuns) {
    this.maxActiveRuns = JsonNullable.of(maxActiveRuns);
    return this;
  }

  /**
   * Maximum number of active DAG runs for the DAG  *New in version 2.3.0* 
   * @return maxActiveRuns
  */
  
  @Schema(name = "max_active_runs", accessMode = Schema.AccessMode.READ_ONLY, description = "Maximum number of active DAG runs for the DAG  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_active_runs")
  public JsonNullable<Integer> getMaxActiveRuns() {
    return maxActiveRuns;
  }

  public void setMaxActiveRuns(JsonNullable<Integer> maxActiveRuns) {
    this.maxActiveRuns = maxActiveRuns;
  }

  public DAGDetail maxActiveTasks(Integer maxActiveTasks) {
    this.maxActiveTasks = JsonNullable.of(maxActiveTasks);
    return this;
  }

  /**
   * Maximum number of active tasks that can be run on the DAG  *New in version 2.3.0* 
   * @return maxActiveTasks
  */
  
  @Schema(name = "max_active_tasks", accessMode = Schema.AccessMode.READ_ONLY, description = "Maximum number of active tasks that can be run on the DAG  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("max_active_tasks")
  public JsonNullable<Integer> getMaxActiveTasks() {
    return maxActiveTasks;
  }

  public void setMaxActiveTasks(JsonNullable<Integer> maxActiveTasks) {
    this.maxActiveTasks = maxActiveTasks;
  }

  public DAGDetail nextDagrun(OffsetDateTime nextDagrun) {
    this.nextDagrun = JsonNullable.of(nextDagrun);
    return this;
  }

  /**
   * The logical date of the next dag run.  *New in version 2.3.0* 
   * @return nextDagrun
  */
  @Valid 
  @Schema(name = "next_dagrun", accessMode = Schema.AccessMode.READ_ONLY, description = "The logical date of the next dag run.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_dagrun")
  public JsonNullable<OffsetDateTime> getNextDagrun() {
    return nextDagrun;
  }

  public void setNextDagrun(JsonNullable<OffsetDateTime> nextDagrun) {
    this.nextDagrun = nextDagrun;
  }

  public DAGDetail nextDagrunCreateAfter(OffsetDateTime nextDagrunCreateAfter) {
    this.nextDagrunCreateAfter = JsonNullable.of(nextDagrunCreateAfter);
    return this;
  }

  /**
   * Earliest time at which this ``next_dagrun`` can be created.  *New in version 2.3.0* 
   * @return nextDagrunCreateAfter
  */
  @Valid 
  @Schema(name = "next_dagrun_create_after", accessMode = Schema.AccessMode.READ_ONLY, description = "Earliest time at which this ``next_dagrun`` can be created.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_dagrun_create_after")
  public JsonNullable<OffsetDateTime> getNextDagrunCreateAfter() {
    return nextDagrunCreateAfter;
  }

  public void setNextDagrunCreateAfter(JsonNullable<OffsetDateTime> nextDagrunCreateAfter) {
    this.nextDagrunCreateAfter = nextDagrunCreateAfter;
  }

  public DAGDetail nextDagrunDataIntervalEnd(OffsetDateTime nextDagrunDataIntervalEnd) {
    this.nextDagrunDataIntervalEnd = JsonNullable.of(nextDagrunDataIntervalEnd);
    return this;
  }

  /**
   * The end of the interval of the next dag run.  *New in version 2.3.0* 
   * @return nextDagrunDataIntervalEnd
  */
  @Valid 
  @Schema(name = "next_dagrun_data_interval_end", accessMode = Schema.AccessMode.READ_ONLY, description = "The end of the interval of the next dag run.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_dagrun_data_interval_end")
  public JsonNullable<OffsetDateTime> getNextDagrunDataIntervalEnd() {
    return nextDagrunDataIntervalEnd;
  }

  public void setNextDagrunDataIntervalEnd(JsonNullable<OffsetDateTime> nextDagrunDataIntervalEnd) {
    this.nextDagrunDataIntervalEnd = nextDagrunDataIntervalEnd;
  }

  public DAGDetail nextDagrunDataIntervalStart(OffsetDateTime nextDagrunDataIntervalStart) {
    this.nextDagrunDataIntervalStart = JsonNullable.of(nextDagrunDataIntervalStart);
    return this;
  }

  /**
   * The start of the interval of the next dag run.  *New in version 2.3.0* 
   * @return nextDagrunDataIntervalStart
  */
  @Valid 
  @Schema(name = "next_dagrun_data_interval_start", accessMode = Schema.AccessMode.READ_ONLY, description = "The start of the interval of the next dag run.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("next_dagrun_data_interval_start")
  public JsonNullable<OffsetDateTime> getNextDagrunDataIntervalStart() {
    return nextDagrunDataIntervalStart;
  }

  public void setNextDagrunDataIntervalStart(JsonNullable<OffsetDateTime> nextDagrunDataIntervalStart) {
    this.nextDagrunDataIntervalStart = nextDagrunDataIntervalStart;
  }

  public DAGDetail owners(List<String> owners) {
    this.owners = owners;
    return this;
  }

  public DAGDetail addOwnersItem(String ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

  /**
   * Get owners
   * @return owners
  */
  
  @Schema(name = "owners", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("owners")
  public List<String> getOwners() {
    return owners;
  }

  public void setOwners(List<String> owners) {
    this.owners = owners;
  }

  public DAGDetail pickleId(String pickleId) {
    this.pickleId = JsonNullable.of(pickleId);
    return this;
  }

  /**
   * Foreign key to the latest pickle_id  *New in version 2.3.0* 
   * @return pickleId
  */
  
  @Schema(name = "pickle_id", accessMode = Schema.AccessMode.READ_ONLY, description = "Foreign key to the latest pickle_id  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pickle_id")
  public JsonNullable<String> getPickleId() {
    return pickleId;
  }

  public void setPickleId(JsonNullable<String> pickleId) {
    this.pickleId = pickleId;
  }

  public DAGDetail rootDagId(String rootDagId) {
    this.rootDagId = JsonNullable.of(rootDagId);
    return this;
  }

  /**
   * If the DAG is SubDAG then it is the top level DAG identifier. Otherwise, null.
   * @return rootDagId
  */
  
  @Schema(name = "root_dag_id", accessMode = Schema.AccessMode.READ_ONLY, description = "If the DAG is SubDAG then it is the top level DAG identifier. Otherwise, null.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("root_dag_id")
  public JsonNullable<String> getRootDagId() {
    return rootDagId;
  }

  public void setRootDagId(JsonNullable<String> rootDagId) {
    this.rootDagId = rootDagId;
  }

  public DAGDetail scheduleInterval(ScheduleInterval scheduleInterval) {
    this.scheduleInterval = JsonNullable.of(scheduleInterval);
    return this;
  }

  /**
   * Get scheduleInterval
   * @return scheduleInterval
  */
  @Valid 
  @Schema(name = "schedule_interval", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schedule_interval")
  public JsonNullable<ScheduleInterval> getScheduleInterval() {
    return scheduleInterval;
  }

  public void setScheduleInterval(JsonNullable<ScheduleInterval> scheduleInterval) {
    this.scheduleInterval = scheduleInterval;
  }

  public DAGDetail schedulerLock(Boolean schedulerLock) {
    this.schedulerLock = JsonNullable.of(schedulerLock);
    return this;
  }

  /**
   * Whether (one of) the scheduler is scheduling this DAG at the moment  *New in version 2.3.0* 
   * @return schedulerLock
  */
  
  @Schema(name = "scheduler_lock", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether (one of) the scheduler is scheduling this DAG at the moment  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduler_lock")
  public JsonNullable<Boolean> getSchedulerLock() {
    return schedulerLock;
  }

  public void setSchedulerLock(JsonNullable<Boolean> schedulerLock) {
    this.schedulerLock = schedulerLock;
  }

  public DAGDetail tags(List<@Valid Tag> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public DAGDetail addTagsItem(Tag tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.of(new ArrayList<>());
    }
    this.tags.get().add(tagsItem);
    return this;
  }

  /**
   * List of tags.
   * @return tags
  */
  @Valid 
  @Schema(name = "tags", accessMode = Schema.AccessMode.READ_ONLY, description = "List of tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public JsonNullable<List<@Valid Tag>> getTags() {
    return tags;
  }

  public void setTags(JsonNullable<List<@Valid Tag>> tags) {
    this.tags = tags;
  }

  public DAGDetail timetableDescription(String timetableDescription) {
    this.timetableDescription = JsonNullable.of(timetableDescription);
    return this;
  }

  /**
   * Timetable/Schedule Interval description.  *New in version 2.3.0* 
   * @return timetableDescription
  */
  
  @Schema(name = "timetable_description", accessMode = Schema.AccessMode.READ_ONLY, description = "Timetable/Schedule Interval description.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timetable_description")
  public JsonNullable<String> getTimetableDescription() {
    return timetableDescription;
  }

  public void setTimetableDescription(JsonNullable<String> timetableDescription) {
    this.timetableDescription = timetableDescription;
  }

  public DAGDetail catchup(Boolean catchup) {
    this.catchup = catchup;
    return this;
  }

  /**
   * Get catchup
   * @return catchup
  */
  
  @Schema(name = "catchup", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catchup")
  public Boolean getCatchup() {
    return catchup;
  }

  public void setCatchup(Boolean catchup) {
    this.catchup = catchup;
  }

  public DAGDetail concurrency(BigDecimal concurrency) {
    this.concurrency = concurrency;
    return this;
  }

  /**
   * Get concurrency
   * @return concurrency
  */
  @Valid 
  @Schema(name = "concurrency", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("concurrency")
  public BigDecimal getConcurrency() {
    return concurrency;
  }

  public void setConcurrency(BigDecimal concurrency) {
    this.concurrency = concurrency;
  }

  public DAGDetail dagRunTimeout(TimeDelta dagRunTimeout) {
    this.dagRunTimeout = dagRunTimeout;
    return this;
  }

  /**
   * Get dagRunTimeout
   * @return dagRunTimeout
  */
  @Valid 
  @Schema(name = "dag_run_timeout", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_run_timeout")
  public TimeDelta getDagRunTimeout() {
    return dagRunTimeout;
  }

  public void setDagRunTimeout(TimeDelta dagRunTimeout) {
    this.dagRunTimeout = dagRunTimeout;
  }

  public DAGDetail docMd(String docMd) {
    this.docMd = JsonNullable.of(docMd);
    return this;
  }

  /**
   * Get docMd
   * @return docMd
  */
  
  @Schema(name = "doc_md", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("doc_md")
  public JsonNullable<String> getDocMd() {
    return docMd;
  }

  public void setDocMd(JsonNullable<String> docMd) {
    this.docMd = docMd;
  }

  public DAGDetail endDate(OffsetDateTime endDate) {
    this.endDate = JsonNullable.of(endDate);
    return this;
  }

  /**
   * The DAG's end date.  *New in version 2.3.0*. 
   * @return endDate
  */
  @Valid 
  @Schema(name = "end_date", accessMode = Schema.AccessMode.READ_ONLY, description = "The DAG's end date.  *New in version 2.3.0*. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public JsonNullable<OffsetDateTime> getEndDate() {
    return endDate;
  }

  public void setEndDate(JsonNullable<OffsetDateTime> endDate) {
    this.endDate = endDate;
  }

  public DAGDetail isPausedUponCreation(Boolean isPausedUponCreation) {
    this.isPausedUponCreation = JsonNullable.of(isPausedUponCreation);
    return this;
  }

  /**
   * Whether the DAG is paused upon creation.  *New in version 2.3.0* 
   * @return isPausedUponCreation
  */
  
  @Schema(name = "is_paused_upon_creation", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the DAG is paused upon creation.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_paused_upon_creation")
  public JsonNullable<Boolean> getIsPausedUponCreation() {
    return isPausedUponCreation;
  }

  public void setIsPausedUponCreation(JsonNullable<Boolean> isPausedUponCreation) {
    this.isPausedUponCreation = isPausedUponCreation;
  }

  public DAGDetail lastParsed(OffsetDateTime lastParsed) {
    this.lastParsed = JsonNullable.of(lastParsed);
    return this;
  }

  /**
   * The last time the DAG was parsed.  *New in version 2.3.0* 
   * @return lastParsed
  */
  @Valid 
  @Schema(name = "last_parsed", accessMode = Schema.AccessMode.READ_ONLY, description = "The last time the DAG was parsed.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("last_parsed")
  public JsonNullable<OffsetDateTime> getLastParsed() {
    return lastParsed;
  }

  public void setLastParsed(JsonNullable<OffsetDateTime> lastParsed) {
    this.lastParsed = lastParsed;
  }

  public DAGDetail orientation(String orientation) {
    this.orientation = orientation;
    return this;
  }

  /**
   * Get orientation
   * @return orientation
  */
  
  @Schema(name = "orientation", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orientation")
  public String getOrientation() {
    return orientation;
  }

  public void setOrientation(String orientation) {
    this.orientation = orientation;
  }

  public DAGDetail params(Object params) {
    this.params = params;
    return this;
  }

  /**
   * User-specified DAG params.  *New in version 2.0.1* 
   * @return params
  */
  
  @Schema(name = "params", accessMode = Schema.AccessMode.READ_ONLY, description = "User-specified DAG params.  *New in version 2.0.1* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("params")
  public Object getParams() {
    return params;
  }

  public void setParams(Object params) {
    this.params = params;
  }

  public DAGDetail renderTemplateAsNativeObj(Boolean renderTemplateAsNativeObj) {
    this.renderTemplateAsNativeObj = JsonNullable.of(renderTemplateAsNativeObj);
    return this;
  }

  /**
   * Whether to render templates as native Python objects.  *New in version 2.3.0* 
   * @return renderTemplateAsNativeObj
  */
  
  @Schema(name = "render_template_as_native_obj", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether to render templates as native Python objects.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("render_template_as_native_obj")
  public JsonNullable<Boolean> getRenderTemplateAsNativeObj() {
    return renderTemplateAsNativeObj;
  }

  public void setRenderTemplateAsNativeObj(JsonNullable<Boolean> renderTemplateAsNativeObj) {
    this.renderTemplateAsNativeObj = renderTemplateAsNativeObj;
  }

  public DAGDetail startDate(OffsetDateTime startDate) {
    this.startDate = JsonNullable.of(startDate);
    return this;
  }

  /**
   * The DAG's start date.  *Changed in version 2.0.1*&#58; Field becomes nullable. 
   * @return startDate
  */
  @Valid 
  @Schema(name = "start_date", accessMode = Schema.AccessMode.READ_ONLY, description = "The DAG's start date.  *Changed in version 2.0.1*&#58; Field becomes nullable. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_date")
  public JsonNullable<OffsetDateTime> getStartDate() {
    return startDate;
  }

  public void setStartDate(JsonNullable<OffsetDateTime> startDate) {
    this.startDate = startDate;
  }

  public DAGDetail templateSearchPath(List<String> templateSearchPath) {
    this.templateSearchPath = JsonNullable.of(templateSearchPath);
    return this;
  }

  public DAGDetail addTemplateSearchPathItem(String templateSearchPathItem) {
    if (this.templateSearchPath == null || !this.templateSearchPath.isPresent()) {
      this.templateSearchPath = JsonNullable.of(new ArrayList<>());
    }
    this.templateSearchPath.get().add(templateSearchPathItem);
    return this;
  }

  /**
   * The template search path.  *New in version 2.3.0* 
   * @return templateSearchPath
  */
  
  @Schema(name = "template_search_path", description = "The template search path.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("template_search_path")
  public JsonNullable<List<String>> getTemplateSearchPath() {
    return templateSearchPath;
  }

  public void setTemplateSearchPath(JsonNullable<List<String>> templateSearchPath) {
    this.templateSearchPath = templateSearchPath;
  }

  public DAGDetail timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * Get timezone
   * @return timezone
  */
  
  @Schema(name = "timezone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timezone")
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAGDetail daGDetail = (DAGDetail) o;
    return Objects.equals(this.dagId, daGDetail.dagId) &&
        Objects.equals(this.defaultView, daGDetail.defaultView) &&
        equalsNullable(this.description, daGDetail.description) &&
        Objects.equals(this.fileToken, daGDetail.fileToken) &&
        Objects.equals(this.fileloc, daGDetail.fileloc) &&
        equalsNullable(this.hasImportErrors, daGDetail.hasImportErrors) &&
        equalsNullable(this.hasTaskConcurrencyLimits, daGDetail.hasTaskConcurrencyLimits) &&
        equalsNullable(this.isActive, daGDetail.isActive) &&
        equalsNullable(this.isPaused, daGDetail.isPaused) &&
        Objects.equals(this.isSubdag, daGDetail.isSubdag) &&
        equalsNullable(this.lastExpired, daGDetail.lastExpired) &&
        equalsNullable(this.lastParsedTime, daGDetail.lastParsedTime) &&
        equalsNullable(this.lastPickled, daGDetail.lastPickled) &&
        equalsNullable(this.maxActiveRuns, daGDetail.maxActiveRuns) &&
        equalsNullable(this.maxActiveTasks, daGDetail.maxActiveTasks) &&
        equalsNullable(this.nextDagrun, daGDetail.nextDagrun) &&
        equalsNullable(this.nextDagrunCreateAfter, daGDetail.nextDagrunCreateAfter) &&
        equalsNullable(this.nextDagrunDataIntervalEnd, daGDetail.nextDagrunDataIntervalEnd) &&
        equalsNullable(this.nextDagrunDataIntervalStart, daGDetail.nextDagrunDataIntervalStart) &&
        Objects.equals(this.owners, daGDetail.owners) &&
        equalsNullable(this.pickleId, daGDetail.pickleId) &&
        equalsNullable(this.rootDagId, daGDetail.rootDagId) &&
        equalsNullable(this.scheduleInterval, daGDetail.scheduleInterval) &&
        equalsNullable(this.schedulerLock, daGDetail.schedulerLock) &&
        equalsNullable(this.tags, daGDetail.tags) &&
        equalsNullable(this.timetableDescription, daGDetail.timetableDescription) &&
        Objects.equals(this.catchup, daGDetail.catchup) &&
        Objects.equals(this.concurrency, daGDetail.concurrency) &&
        Objects.equals(this.dagRunTimeout, daGDetail.dagRunTimeout) &&
        equalsNullable(this.docMd, daGDetail.docMd) &&
        equalsNullable(this.endDate, daGDetail.endDate) &&
        equalsNullable(this.isPausedUponCreation, daGDetail.isPausedUponCreation) &&
        equalsNullable(this.lastParsed, daGDetail.lastParsed) &&
        Objects.equals(this.orientation, daGDetail.orientation) &&
        Objects.equals(this.params, daGDetail.params) &&
        equalsNullable(this.renderTemplateAsNativeObj, daGDetail.renderTemplateAsNativeObj) &&
        equalsNullable(this.startDate, daGDetail.startDate) &&
        equalsNullable(this.templateSearchPath, daGDetail.templateSearchPath) &&
        Objects.equals(this.timezone, daGDetail.timezone);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, defaultView, hashCodeNullable(description), fileToken, fileloc, hashCodeNullable(hasImportErrors), hashCodeNullable(hasTaskConcurrencyLimits), hashCodeNullable(isActive), hashCodeNullable(isPaused), isSubdag, hashCodeNullable(lastExpired), hashCodeNullable(lastParsedTime), hashCodeNullable(lastPickled), hashCodeNullable(maxActiveRuns), hashCodeNullable(maxActiveTasks), hashCodeNullable(nextDagrun), hashCodeNullable(nextDagrunCreateAfter), hashCodeNullable(nextDagrunDataIntervalEnd), hashCodeNullable(nextDagrunDataIntervalStart), owners, hashCodeNullable(pickleId), hashCodeNullable(rootDagId), hashCodeNullable(scheduleInterval), hashCodeNullable(schedulerLock), hashCodeNullable(tags), hashCodeNullable(timetableDescription), catchup, concurrency, dagRunTimeout, hashCodeNullable(docMd), hashCodeNullable(endDate), hashCodeNullable(isPausedUponCreation), hashCodeNullable(lastParsed), orientation, params, hashCodeNullable(renderTemplateAsNativeObj), hashCodeNullable(startDate), hashCodeNullable(templateSearchPath), timezone);
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
    sb.append("class DAGDetail {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    defaultView: ").append(toIndentedString(defaultView)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fileToken: ").append(toIndentedString(fileToken)).append("\n");
    sb.append("    fileloc: ").append(toIndentedString(fileloc)).append("\n");
    sb.append("    hasImportErrors: ").append(toIndentedString(hasImportErrors)).append("\n");
    sb.append("    hasTaskConcurrencyLimits: ").append(toIndentedString(hasTaskConcurrencyLimits)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isPaused: ").append(toIndentedString(isPaused)).append("\n");
    sb.append("    isSubdag: ").append(toIndentedString(isSubdag)).append("\n");
    sb.append("    lastExpired: ").append(toIndentedString(lastExpired)).append("\n");
    sb.append("    lastParsedTime: ").append(toIndentedString(lastParsedTime)).append("\n");
    sb.append("    lastPickled: ").append(toIndentedString(lastPickled)).append("\n");
    sb.append("    maxActiveRuns: ").append(toIndentedString(maxActiveRuns)).append("\n");
    sb.append("    maxActiveTasks: ").append(toIndentedString(maxActiveTasks)).append("\n");
    sb.append("    nextDagrun: ").append(toIndentedString(nextDagrun)).append("\n");
    sb.append("    nextDagrunCreateAfter: ").append(toIndentedString(nextDagrunCreateAfter)).append("\n");
    sb.append("    nextDagrunDataIntervalEnd: ").append(toIndentedString(nextDagrunDataIntervalEnd)).append("\n");
    sb.append("    nextDagrunDataIntervalStart: ").append(toIndentedString(nextDagrunDataIntervalStart)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    pickleId: ").append(toIndentedString(pickleId)).append("\n");
    sb.append("    rootDagId: ").append(toIndentedString(rootDagId)).append("\n");
    sb.append("    scheduleInterval: ").append(toIndentedString(scheduleInterval)).append("\n");
    sb.append("    schedulerLock: ").append(toIndentedString(schedulerLock)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    timetableDescription: ").append(toIndentedString(timetableDescription)).append("\n");
    sb.append("    catchup: ").append(toIndentedString(catchup)).append("\n");
    sb.append("    concurrency: ").append(toIndentedString(concurrency)).append("\n");
    sb.append("    dagRunTimeout: ").append(toIndentedString(dagRunTimeout)).append("\n");
    sb.append("    docMd: ").append(toIndentedString(docMd)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    isPausedUponCreation: ").append(toIndentedString(isPausedUponCreation)).append("\n");
    sb.append("    lastParsed: ").append(toIndentedString(lastParsed)).append("\n");
    sb.append("    orientation: ").append(toIndentedString(orientation)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    renderTemplateAsNativeObj: ").append(toIndentedString(renderTemplateAsNativeObj)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    templateSearchPath: ").append(toIndentedString(templateSearchPath)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
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

