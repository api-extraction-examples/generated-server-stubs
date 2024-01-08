package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseItemDto;
import org.openapitools.model.KeepUntil;
import org.openapitools.model.RecordingStatus;
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
 * TimerInfoDto
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TimerInfoDto {

  private UUID channelId;

  private JsonNullable<String> channelName = JsonNullable.<String>undefined();

  private JsonNullable<String> channelPrimaryImageTag = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  private JsonNullable<String> externalChannelId = JsonNullable.<String>undefined();

  private JsonNullable<String> externalId = JsonNullable.<String>undefined();

  private JsonNullable<String> externalProgramId = JsonNullable.<String>undefined();

  private JsonNullable<String> externalSeriesTimerId = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private Boolean isPostPaddingRequired;

  private Boolean isPrePaddingRequired;

  private KeepUntil keepUntil;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> overview = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> parentBackdropImageTags = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> parentBackdropItemId = JsonNullable.<String>undefined();

  private Integer postPaddingSeconds;

  private Integer prePaddingSeconds;

  private Integer priority;

  private JsonNullable<String> programId = JsonNullable.<String>undefined();

  private BaseItemDto programInfo;

  private JsonNullable<Long> runTimeTicks = JsonNullable.<Long>undefined();

  private JsonNullable<String> seriesTimerId = JsonNullable.<String>undefined();

  private JsonNullable<String> serverId = JsonNullable.<String>undefined();

  private JsonNullable<String> serviceName = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  private RecordingStatus status;

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public TimerInfoDto channelId(UUID channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * ChannelId of the recording.
   * @return channelId
  */
  @Valid 
  @Schema(name = "ChannelId", description = "ChannelId of the recording.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelId")
  public UUID getChannelId() {
    return channelId;
  }

  public void setChannelId(UUID channelId) {
    this.channelId = channelId;
  }

  public TimerInfoDto channelName(String channelName) {
    this.channelName = JsonNullable.of(channelName);
    return this;
  }

  /**
   * ChannelName of the recording.
   * @return channelName
  */
  
  @Schema(name = "ChannelName", description = "ChannelName of the recording.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelName")
  public JsonNullable<String> getChannelName() {
    return channelName;
  }

  public void setChannelName(JsonNullable<String> channelName) {
    this.channelName = channelName;
  }

  public TimerInfoDto channelPrimaryImageTag(String channelPrimaryImageTag) {
    this.channelPrimaryImageTag = JsonNullable.of(channelPrimaryImageTag);
    return this;
  }

  /**
   * Get channelPrimaryImageTag
   * @return channelPrimaryImageTag
  */
  
  @Schema(name = "ChannelPrimaryImageTag", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ChannelPrimaryImageTag")
  public JsonNullable<String> getChannelPrimaryImageTag() {
    return channelPrimaryImageTag;
  }

  public void setChannelPrimaryImageTag(JsonNullable<String> channelPrimaryImageTag) {
    this.channelPrimaryImageTag = channelPrimaryImageTag;
  }

  public TimerInfoDto endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The end date of the recording, in UTC.
   * @return endDate
  */
  @Valid 
  @Schema(name = "EndDate", description = "The end date of the recording, in UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EndDate")
  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public TimerInfoDto externalChannelId(String externalChannelId) {
    this.externalChannelId = JsonNullable.of(externalChannelId);
    return this;
  }

  /**
   * Gets or sets the external channel identifier.
   * @return externalChannelId
  */
  
  @Schema(name = "ExternalChannelId", description = "Gets or sets the external channel identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExternalChannelId")
  public JsonNullable<String> getExternalChannelId() {
    return externalChannelId;
  }

  public void setExternalChannelId(JsonNullable<String> externalChannelId) {
    this.externalChannelId = externalChannelId;
  }

  public TimerInfoDto externalId(String externalId) {
    this.externalId = JsonNullable.of(externalId);
    return this;
  }

  /**
   * Gets or sets the external identifier.
   * @return externalId
  */
  
  @Schema(name = "ExternalId", description = "Gets or sets the external identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExternalId")
  public JsonNullable<String> getExternalId() {
    return externalId;
  }

  public void setExternalId(JsonNullable<String> externalId) {
    this.externalId = externalId;
  }

  public TimerInfoDto externalProgramId(String externalProgramId) {
    this.externalProgramId = JsonNullable.of(externalProgramId);
    return this;
  }

  /**
   * Gets or sets the external program identifier.
   * @return externalProgramId
  */
  
  @Schema(name = "ExternalProgramId", description = "Gets or sets the external program identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExternalProgramId")
  public JsonNullable<String> getExternalProgramId() {
    return externalProgramId;
  }

  public void setExternalProgramId(JsonNullable<String> externalProgramId) {
    this.externalProgramId = externalProgramId;
  }

  public TimerInfoDto externalSeriesTimerId(String externalSeriesTimerId) {
    this.externalSeriesTimerId = JsonNullable.of(externalSeriesTimerId);
    return this;
  }

  /**
   * Gets or sets the external series timer identifier.
   * @return externalSeriesTimerId
  */
  
  @Schema(name = "ExternalSeriesTimerId", description = "Gets or sets the external series timer identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ExternalSeriesTimerId")
  public JsonNullable<String> getExternalSeriesTimerId() {
    return externalSeriesTimerId;
  }

  public void setExternalSeriesTimerId(JsonNullable<String> externalSeriesTimerId) {
    this.externalSeriesTimerId = externalSeriesTimerId;
  }

  public TimerInfoDto id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Id of the recording.
   * @return id
  */
  
  @Schema(name = "Id", description = "Id of the recording.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public TimerInfoDto isPostPaddingRequired(Boolean isPostPaddingRequired) {
    this.isPostPaddingRequired = isPostPaddingRequired;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is post padding required.
   * @return isPostPaddingRequired
  */
  
  @Schema(name = "IsPostPaddingRequired", description = "Gets or sets a value indicating whether this instance is post padding required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPostPaddingRequired")
  public Boolean getIsPostPaddingRequired() {
    return isPostPaddingRequired;
  }

  public void setIsPostPaddingRequired(Boolean isPostPaddingRequired) {
    this.isPostPaddingRequired = isPostPaddingRequired;
  }

  public TimerInfoDto isPrePaddingRequired(Boolean isPrePaddingRequired) {
    this.isPrePaddingRequired = isPrePaddingRequired;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is pre padding required.
   * @return isPrePaddingRequired
  */
  
  @Schema(name = "IsPrePaddingRequired", description = "Gets or sets a value indicating whether this instance is pre padding required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsPrePaddingRequired")
  public Boolean getIsPrePaddingRequired() {
    return isPrePaddingRequired;
  }

  public void setIsPrePaddingRequired(Boolean isPrePaddingRequired) {
    this.isPrePaddingRequired = isPrePaddingRequired;
  }

  public TimerInfoDto keepUntil(KeepUntil keepUntil) {
    this.keepUntil = keepUntil;
    return this;
  }

  /**
   * Get keepUntil
   * @return keepUntil
  */
  @Valid 
  @Schema(name = "KeepUntil", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KeepUntil")
  public KeepUntil getKeepUntil() {
    return keepUntil;
  }

  public void setKeepUntil(KeepUntil keepUntil) {
    this.keepUntil = keepUntil;
  }

  public TimerInfoDto name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Name of the recording.
   * @return name
  */
  
  @Schema(name = "Name", description = "Name of the recording.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public TimerInfoDto overview(String overview) {
    this.overview = JsonNullable.of(overview);
    return this;
  }

  /**
   * Description of the recording.
   * @return overview
  */
  
  @Schema(name = "Overview", description = "Description of the recording.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Overview")
  public JsonNullable<String> getOverview() {
    return overview;
  }

  public void setOverview(JsonNullable<String> overview) {
    this.overview = overview;
  }

  public TimerInfoDto parentBackdropImageTags(List<String> parentBackdropImageTags) {
    this.parentBackdropImageTags = JsonNullable.of(parentBackdropImageTags);
    return this;
  }

  public TimerInfoDto addParentBackdropImageTagsItem(String parentBackdropImageTagsItem) {
    if (this.parentBackdropImageTags == null || !this.parentBackdropImageTags.isPresent()) {
      this.parentBackdropImageTags = JsonNullable.of(new ArrayList<>());
    }
    this.parentBackdropImageTags.get().add(parentBackdropImageTagsItem);
    return this;
  }

  /**
   * Gets or sets the parent backdrop image tags.
   * @return parentBackdropImageTags
  */
  
  @Schema(name = "ParentBackdropImageTags", description = "Gets or sets the parent backdrop image tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentBackdropImageTags")
  public JsonNullable<List<String>> getParentBackdropImageTags() {
    return parentBackdropImageTags;
  }

  public void setParentBackdropImageTags(JsonNullable<List<String>> parentBackdropImageTags) {
    this.parentBackdropImageTags = parentBackdropImageTags;
  }

  public TimerInfoDto parentBackdropItemId(String parentBackdropItemId) {
    this.parentBackdropItemId = JsonNullable.of(parentBackdropItemId);
    return this;
  }

  /**
   * If the item does not have any backdrops, this will hold the Id of the Parent that has one.
   * @return parentBackdropItemId
  */
  
  @Schema(name = "ParentBackdropItemId", description = "If the item does not have any backdrops, this will hold the Id of the Parent that has one.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentBackdropItemId")
  public JsonNullable<String> getParentBackdropItemId() {
    return parentBackdropItemId;
  }

  public void setParentBackdropItemId(JsonNullable<String> parentBackdropItemId) {
    this.parentBackdropItemId = parentBackdropItemId;
  }

  public TimerInfoDto postPaddingSeconds(Integer postPaddingSeconds) {
    this.postPaddingSeconds = postPaddingSeconds;
    return this;
  }

  /**
   * Gets or sets the post padding seconds.
   * @return postPaddingSeconds
  */
  
  @Schema(name = "PostPaddingSeconds", description = "Gets or sets the post padding seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PostPaddingSeconds")
  public Integer getPostPaddingSeconds() {
    return postPaddingSeconds;
  }

  public void setPostPaddingSeconds(Integer postPaddingSeconds) {
    this.postPaddingSeconds = postPaddingSeconds;
  }

  public TimerInfoDto prePaddingSeconds(Integer prePaddingSeconds) {
    this.prePaddingSeconds = prePaddingSeconds;
    return this;
  }

  /**
   * Gets or sets the pre padding seconds.
   * @return prePaddingSeconds
  */
  
  @Schema(name = "PrePaddingSeconds", description = "Gets or sets the pre padding seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PrePaddingSeconds")
  public Integer getPrePaddingSeconds() {
    return prePaddingSeconds;
  }

  public void setPrePaddingSeconds(Integer prePaddingSeconds) {
    this.prePaddingSeconds = prePaddingSeconds;
  }

  public TimerInfoDto priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Gets or sets the priority.
   * @return priority
  */
  
  @Schema(name = "Priority", description = "Gets or sets the priority.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Priority")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public TimerInfoDto programId(String programId) {
    this.programId = JsonNullable.of(programId);
    return this;
  }

  /**
   * Gets or sets the program identifier.
   * @return programId
  */
  
  @Schema(name = "ProgramId", description = "Gets or sets the program identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProgramId")
  public JsonNullable<String> getProgramId() {
    return programId;
  }

  public void setProgramId(JsonNullable<String> programId) {
    this.programId = programId;
  }

  public TimerInfoDto programInfo(BaseItemDto programInfo) {
    this.programInfo = programInfo;
    return this;
  }

  /**
   * Get programInfo
   * @return programInfo
  */
  @Valid 
  @Schema(name = "ProgramInfo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ProgramInfo")
  public BaseItemDto getProgramInfo() {
    return programInfo;
  }

  public void setProgramInfo(BaseItemDto programInfo) {
    this.programInfo = programInfo;
  }

  public TimerInfoDto runTimeTicks(Long runTimeTicks) {
    this.runTimeTicks = JsonNullable.of(runTimeTicks);
    return this;
  }

  /**
   * Gets or sets the run time ticks.
   * @return runTimeTicks
  */
  
  @Schema(name = "RunTimeTicks", description = "Gets or sets the run time ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RunTimeTicks")
  public JsonNullable<Long> getRunTimeTicks() {
    return runTimeTicks;
  }

  public void setRunTimeTicks(JsonNullable<Long> runTimeTicks) {
    this.runTimeTicks = runTimeTicks;
  }

  public TimerInfoDto seriesTimerId(String seriesTimerId) {
    this.seriesTimerId = JsonNullable.of(seriesTimerId);
    return this;
  }

  /**
   * Gets or sets the series timer identifier.
   * @return seriesTimerId
  */
  
  @Schema(name = "SeriesTimerId", description = "Gets or sets the series timer identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeriesTimerId")
  public JsonNullable<String> getSeriesTimerId() {
    return seriesTimerId;
  }

  public void setSeriesTimerId(JsonNullable<String> seriesTimerId) {
    this.seriesTimerId = seriesTimerId;
  }

  public TimerInfoDto serverId(String serverId) {
    this.serverId = JsonNullable.of(serverId);
    return this;
  }

  /**
   * Gets or sets the server identifier.
   * @return serverId
  */
  
  @Schema(name = "ServerId", description = "Gets or sets the server identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerId")
  public JsonNullable<String> getServerId() {
    return serverId;
  }

  public void setServerId(JsonNullable<String> serverId) {
    this.serverId = serverId;
  }

  public TimerInfoDto serviceName(String serviceName) {
    this.serviceName = JsonNullable.of(serviceName);
    return this;
  }

  /**
   * Gets or sets the name of the service.
   * @return serviceName
  */
  
  @Schema(name = "ServiceName", description = "Gets or sets the name of the service.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceName")
  public JsonNullable<String> getServiceName() {
    return serviceName;
  }

  public void setServiceName(JsonNullable<String> serviceName) {
    this.serviceName = serviceName;
  }

  public TimerInfoDto startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The start date of the recording, in UTC.
   * @return startDate
  */
  @Valid 
  @Schema(name = "StartDate", description = "The start date of the recording, in UTC.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("StartDate")
  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public TimerInfoDto status(RecordingStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Status")
  public RecordingStatus getStatus() {
    return status;
  }

  public void setStatus(RecordingStatus status) {
    this.status = status;
  }

  public TimerInfoDto type(String type) {
    this.type = JsonNullable.of(type);
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    TimerInfoDto timerInfoDto = (TimerInfoDto) o;
    return Objects.equals(this.channelId, timerInfoDto.channelId) &&
        equalsNullable(this.channelName, timerInfoDto.channelName) &&
        equalsNullable(this.channelPrimaryImageTag, timerInfoDto.channelPrimaryImageTag) &&
        Objects.equals(this.endDate, timerInfoDto.endDate) &&
        equalsNullable(this.externalChannelId, timerInfoDto.externalChannelId) &&
        equalsNullable(this.externalId, timerInfoDto.externalId) &&
        equalsNullable(this.externalProgramId, timerInfoDto.externalProgramId) &&
        equalsNullable(this.externalSeriesTimerId, timerInfoDto.externalSeriesTimerId) &&
        equalsNullable(this.id, timerInfoDto.id) &&
        Objects.equals(this.isPostPaddingRequired, timerInfoDto.isPostPaddingRequired) &&
        Objects.equals(this.isPrePaddingRequired, timerInfoDto.isPrePaddingRequired) &&
        Objects.equals(this.keepUntil, timerInfoDto.keepUntil) &&
        equalsNullable(this.name, timerInfoDto.name) &&
        equalsNullable(this.overview, timerInfoDto.overview) &&
        equalsNullable(this.parentBackdropImageTags, timerInfoDto.parentBackdropImageTags) &&
        equalsNullable(this.parentBackdropItemId, timerInfoDto.parentBackdropItemId) &&
        Objects.equals(this.postPaddingSeconds, timerInfoDto.postPaddingSeconds) &&
        Objects.equals(this.prePaddingSeconds, timerInfoDto.prePaddingSeconds) &&
        Objects.equals(this.priority, timerInfoDto.priority) &&
        equalsNullable(this.programId, timerInfoDto.programId) &&
        Objects.equals(this.programInfo, timerInfoDto.programInfo) &&
        equalsNullable(this.runTimeTicks, timerInfoDto.runTimeTicks) &&
        equalsNullable(this.seriesTimerId, timerInfoDto.seriesTimerId) &&
        equalsNullable(this.serverId, timerInfoDto.serverId) &&
        equalsNullable(this.serviceName, timerInfoDto.serviceName) &&
        Objects.equals(this.startDate, timerInfoDto.startDate) &&
        Objects.equals(this.status, timerInfoDto.status) &&
        equalsNullable(this.type, timerInfoDto.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, hashCodeNullable(channelName), hashCodeNullable(channelPrimaryImageTag), endDate, hashCodeNullable(externalChannelId), hashCodeNullable(externalId), hashCodeNullable(externalProgramId), hashCodeNullable(externalSeriesTimerId), hashCodeNullable(id), isPostPaddingRequired, isPrePaddingRequired, keepUntil, hashCodeNullable(name), hashCodeNullable(overview), hashCodeNullable(parentBackdropImageTags), hashCodeNullable(parentBackdropItemId), postPaddingSeconds, prePaddingSeconds, priority, hashCodeNullable(programId), programInfo, hashCodeNullable(runTimeTicks), hashCodeNullable(seriesTimerId), hashCodeNullable(serverId), hashCodeNullable(serviceName), startDate, status, hashCodeNullable(type));
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
    sb.append("class TimerInfoDto {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelPrimaryImageTag: ").append(toIndentedString(channelPrimaryImageTag)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    externalChannelId: ").append(toIndentedString(externalChannelId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalProgramId: ").append(toIndentedString(externalProgramId)).append("\n");
    sb.append("    externalSeriesTimerId: ").append(toIndentedString(externalSeriesTimerId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isPostPaddingRequired: ").append(toIndentedString(isPostPaddingRequired)).append("\n");
    sb.append("    isPrePaddingRequired: ").append(toIndentedString(isPrePaddingRequired)).append("\n");
    sb.append("    keepUntil: ").append(toIndentedString(keepUntil)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    parentBackdropImageTags: ").append(toIndentedString(parentBackdropImageTags)).append("\n");
    sb.append("    parentBackdropItemId: ").append(toIndentedString(parentBackdropItemId)).append("\n");
    sb.append("    postPaddingSeconds: ").append(toIndentedString(postPaddingSeconds)).append("\n");
    sb.append("    prePaddingSeconds: ").append(toIndentedString(prePaddingSeconds)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    programInfo: ").append(toIndentedString(programInfo)).append("\n");
    sb.append("    runTimeTicks: ").append(toIndentedString(runTimeTicks)).append("\n");
    sb.append("    seriesTimerId: ").append(toIndentedString(seriesTimerId)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

