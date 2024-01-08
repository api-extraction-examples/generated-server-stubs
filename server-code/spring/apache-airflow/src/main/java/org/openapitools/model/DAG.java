package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ScheduleInterval;
import org.openapitools.model.Tag;
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
 * DAG
 */

@Schema(name = "DAG", description = "DAG")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class DAG {

  private String dagId;

  private JsonNullable<String> defaultView = JsonNullable.<String>undefined();

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

  public DAG dagId(String dagId) {
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

  public DAG defaultView(String defaultView) {
    this.defaultView = JsonNullable.of(defaultView);
    return this;
  }

  /**
   * Default view of the DAG inside the webserver  *New in version 2.3.0* 
   * @return defaultView
  */
  
  @Schema(name = "default_view", accessMode = Schema.AccessMode.READ_ONLY, description = "Default view of the DAG inside the webserver  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_view")
  public JsonNullable<String> getDefaultView() {
    return defaultView;
  }

  public void setDefaultView(JsonNullable<String> defaultView) {
    this.defaultView = defaultView;
  }

  public DAG description(String description) {
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

  public DAG fileToken(String fileToken) {
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

  public DAG fileloc(String fileloc) {
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

  public DAG hasImportErrors(Boolean hasImportErrors) {
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

  public DAG hasTaskConcurrencyLimits(Boolean hasTaskConcurrencyLimits) {
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

  public DAG isActive(Boolean isActive) {
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

  public DAG isPaused(Boolean isPaused) {
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

  public DAG isSubdag(Boolean isSubdag) {
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

  public DAG lastExpired(OffsetDateTime lastExpired) {
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

  public DAG lastParsedTime(OffsetDateTime lastParsedTime) {
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

  public DAG lastPickled(OffsetDateTime lastPickled) {
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

  public DAG maxActiveRuns(Integer maxActiveRuns) {
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

  public DAG maxActiveTasks(Integer maxActiveTasks) {
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

  public DAG nextDagrun(OffsetDateTime nextDagrun) {
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

  public DAG nextDagrunCreateAfter(OffsetDateTime nextDagrunCreateAfter) {
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

  public DAG nextDagrunDataIntervalEnd(OffsetDateTime nextDagrunDataIntervalEnd) {
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

  public DAG nextDagrunDataIntervalStart(OffsetDateTime nextDagrunDataIntervalStart) {
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

  public DAG owners(List<String> owners) {
    this.owners = owners;
    return this;
  }

  public DAG addOwnersItem(String ownersItem) {
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

  public DAG pickleId(String pickleId) {
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

  public DAG rootDagId(String rootDagId) {
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

  public DAG scheduleInterval(ScheduleInterval scheduleInterval) {
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

  public DAG schedulerLock(Boolean schedulerLock) {
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

  public DAG tags(List<@Valid Tag> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public DAG addTagsItem(Tag tagsItem) {
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

  public DAG timetableDescription(String timetableDescription) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DAG DAG = (DAG) o;
    return Objects.equals(this.dagId, DAG.dagId) &&
        equalsNullable(this.defaultView, DAG.defaultView) &&
        equalsNullable(this.description, DAG.description) &&
        Objects.equals(this.fileToken, DAG.fileToken) &&
        Objects.equals(this.fileloc, DAG.fileloc) &&
        equalsNullable(this.hasImportErrors, DAG.hasImportErrors) &&
        equalsNullable(this.hasTaskConcurrencyLimits, DAG.hasTaskConcurrencyLimits) &&
        equalsNullable(this.isActive, DAG.isActive) &&
        equalsNullable(this.isPaused, DAG.isPaused) &&
        Objects.equals(this.isSubdag, DAG.isSubdag) &&
        equalsNullable(this.lastExpired, DAG.lastExpired) &&
        equalsNullable(this.lastParsedTime, DAG.lastParsedTime) &&
        equalsNullable(this.lastPickled, DAG.lastPickled) &&
        equalsNullable(this.maxActiveRuns, DAG.maxActiveRuns) &&
        equalsNullable(this.maxActiveTasks, DAG.maxActiveTasks) &&
        equalsNullable(this.nextDagrun, DAG.nextDagrun) &&
        equalsNullable(this.nextDagrunCreateAfter, DAG.nextDagrunCreateAfter) &&
        equalsNullable(this.nextDagrunDataIntervalEnd, DAG.nextDagrunDataIntervalEnd) &&
        equalsNullable(this.nextDagrunDataIntervalStart, DAG.nextDagrunDataIntervalStart) &&
        Objects.equals(this.owners, DAG.owners) &&
        equalsNullable(this.pickleId, DAG.pickleId) &&
        equalsNullable(this.rootDagId, DAG.rootDagId) &&
        equalsNullable(this.scheduleInterval, DAG.scheduleInterval) &&
        equalsNullable(this.schedulerLock, DAG.schedulerLock) &&
        equalsNullable(this.tags, DAG.tags) &&
        equalsNullable(this.timetableDescription, DAG.timetableDescription);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, hashCodeNullable(defaultView), hashCodeNullable(description), fileToken, fileloc, hashCodeNullable(hasImportErrors), hashCodeNullable(hasTaskConcurrencyLimits), hashCodeNullable(isActive), hashCodeNullable(isPaused), isSubdag, hashCodeNullable(lastExpired), hashCodeNullable(lastParsedTime), hashCodeNullable(lastPickled), hashCodeNullable(maxActiveRuns), hashCodeNullable(maxActiveTasks), hashCodeNullable(nextDagrun), hashCodeNullable(nextDagrunCreateAfter), hashCodeNullable(nextDagrunDataIntervalEnd), hashCodeNullable(nextDagrunDataIntervalStart), owners, hashCodeNullable(pickleId), hashCodeNullable(rootDagId), hashCodeNullable(scheduleInterval), hashCodeNullable(schedulerLock), hashCodeNullable(tags), hashCodeNullable(timetableDescription));
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
    sb.append("class DAG {\n");
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

