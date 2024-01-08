package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DayOfWeek;
import org.openapitools.model.DayPattern;
import org.openapitools.model.KeepUntil;
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
 * Class SeriesTimerInfoDto.
 */

@Schema(name = "SeriesTimerInfoDto", description = "Class SeriesTimerInfoDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SeriesTimerInfoDto {

  private UUID channelId;

  private JsonNullable<String> channelName = JsonNullable.<String>undefined();

  private JsonNullable<String> channelPrimaryImageTag = JsonNullable.<String>undefined();

  private DayPattern dayPattern;

  @Valid
  private JsonNullable<List<@Valid DayOfWeek>> days = JsonNullable.<List<@Valid DayOfWeek>>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  private JsonNullable<String> externalChannelId = JsonNullable.<String>undefined();

  private JsonNullable<String> externalId = JsonNullable.<String>undefined();

  private JsonNullable<String> externalProgramId = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<Map<String, String>> imageTags = JsonNullable.<Map<String, String>>undefined();

  private Boolean isPostPaddingRequired;

  private Boolean isPrePaddingRequired;

  private KeepUntil keepUntil;

  private Integer keepUpTo;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private JsonNullable<String> overview = JsonNullable.<String>undefined();

  @Valid
  private JsonNullable<List<String>> parentBackdropImageTags = JsonNullable.<List<String>>undefined();

  private JsonNullable<String> parentBackdropItemId = JsonNullable.<String>undefined();

  private JsonNullable<String> parentPrimaryImageItemId = JsonNullable.<String>undefined();

  private JsonNullable<String> parentPrimaryImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> parentThumbImageTag = JsonNullable.<String>undefined();

  private JsonNullable<String> parentThumbItemId = JsonNullable.<String>undefined();

  private Integer postPaddingSeconds;

  private Integer prePaddingSeconds;

  private Integer priority;

  private JsonNullable<String> programId = JsonNullable.<String>undefined();

  private Boolean recordAnyChannel;

  private Boolean recordAnyTime;

  private Boolean recordNewOnly;

  private JsonNullable<String> serverId = JsonNullable.<String>undefined();

  private JsonNullable<String> serviceName = JsonNullable.<String>undefined();

  private Boolean skipEpisodesInLibrary;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public SeriesTimerInfoDto channelId(UUID channelId) {
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

  public SeriesTimerInfoDto channelName(String channelName) {
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

  public SeriesTimerInfoDto channelPrimaryImageTag(String channelPrimaryImageTag) {
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

  public SeriesTimerInfoDto dayPattern(DayPattern dayPattern) {
    this.dayPattern = dayPattern;
    return this;
  }

  /**
   * Get dayPattern
   * @return dayPattern
  */
  @Valid 
  @Schema(name = "DayPattern", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DayPattern")
  public DayPattern getDayPattern() {
    return dayPattern;
  }

  public void setDayPattern(DayPattern dayPattern) {
    this.dayPattern = dayPattern;
  }

  public SeriesTimerInfoDto days(List<@Valid DayOfWeek> days) {
    this.days = JsonNullable.of(days);
    return this;
  }

  public SeriesTimerInfoDto addDaysItem(DayOfWeek daysItem) {
    if (this.days == null || !this.days.isPresent()) {
      this.days = JsonNullable.of(new ArrayList<>());
    }
    this.days.get().add(daysItem);
    return this;
  }

  /**
   * Gets or sets the days.
   * @return days
  */
  @Valid 
  @Schema(name = "Days", description = "Gets or sets the days.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Days")
  public JsonNullable<List<@Valid DayOfWeek>> getDays() {
    return days;
  }

  public void setDays(JsonNullable<List<@Valid DayOfWeek>> days) {
    this.days = days;
  }

  public SeriesTimerInfoDto endDate(OffsetDateTime endDate) {
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

  public SeriesTimerInfoDto externalChannelId(String externalChannelId) {
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

  public SeriesTimerInfoDto externalId(String externalId) {
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

  public SeriesTimerInfoDto externalProgramId(String externalProgramId) {
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

  public SeriesTimerInfoDto id(String id) {
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

  public SeriesTimerInfoDto imageTags(Map<String, String> imageTags) {
    this.imageTags = JsonNullable.of(imageTags);
    return this;
  }

  public SeriesTimerInfoDto putImageTagsItem(String key, String imageTagsItem) {
    if (this.imageTags == null || !this.imageTags.isPresent()) {
      this.imageTags = JsonNullable.of(new HashMap<>());
    }
    this.imageTags.get().put(key, imageTagsItem);
    return this;
  }

  /**
   * Gets or sets the image tags.
   * @return imageTags
  */
  
  @Schema(name = "ImageTags", description = "Gets or sets the image tags.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ImageTags")
  public JsonNullable<Map<String, String>> getImageTags() {
    return imageTags;
  }

  public void setImageTags(JsonNullable<Map<String, String>> imageTags) {
    this.imageTags = imageTags;
  }

  public SeriesTimerInfoDto isPostPaddingRequired(Boolean isPostPaddingRequired) {
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

  public SeriesTimerInfoDto isPrePaddingRequired(Boolean isPrePaddingRequired) {
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

  public SeriesTimerInfoDto keepUntil(KeepUntil keepUntil) {
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

  public SeriesTimerInfoDto keepUpTo(Integer keepUpTo) {
    this.keepUpTo = keepUpTo;
    return this;
  }

  /**
   * Get keepUpTo
   * @return keepUpTo
  */
  
  @Schema(name = "KeepUpTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("KeepUpTo")
  public Integer getKeepUpTo() {
    return keepUpTo;
  }

  public void setKeepUpTo(Integer keepUpTo) {
    this.keepUpTo = keepUpTo;
  }

  public SeriesTimerInfoDto name(String name) {
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

  public SeriesTimerInfoDto overview(String overview) {
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

  public SeriesTimerInfoDto parentBackdropImageTags(List<String> parentBackdropImageTags) {
    this.parentBackdropImageTags = JsonNullable.of(parentBackdropImageTags);
    return this;
  }

  public SeriesTimerInfoDto addParentBackdropImageTagsItem(String parentBackdropImageTagsItem) {
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

  public SeriesTimerInfoDto parentBackdropItemId(String parentBackdropItemId) {
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

  public SeriesTimerInfoDto parentPrimaryImageItemId(String parentPrimaryImageItemId) {
    this.parentPrimaryImageItemId = JsonNullable.of(parentPrimaryImageItemId);
    return this;
  }

  /**
   * Gets or sets the parent primary image item identifier.
   * @return parentPrimaryImageItemId
  */
  
  @Schema(name = "ParentPrimaryImageItemId", description = "Gets or sets the parent primary image item identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentPrimaryImageItemId")
  public JsonNullable<String> getParentPrimaryImageItemId() {
    return parentPrimaryImageItemId;
  }

  public void setParentPrimaryImageItemId(JsonNullable<String> parentPrimaryImageItemId) {
    this.parentPrimaryImageItemId = parentPrimaryImageItemId;
  }

  public SeriesTimerInfoDto parentPrimaryImageTag(String parentPrimaryImageTag) {
    this.parentPrimaryImageTag = JsonNullable.of(parentPrimaryImageTag);
    return this;
  }

  /**
   * Gets or sets the parent primary image tag.
   * @return parentPrimaryImageTag
  */
  
  @Schema(name = "ParentPrimaryImageTag", description = "Gets or sets the parent primary image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentPrimaryImageTag")
  public JsonNullable<String> getParentPrimaryImageTag() {
    return parentPrimaryImageTag;
  }

  public void setParentPrimaryImageTag(JsonNullable<String> parentPrimaryImageTag) {
    this.parentPrimaryImageTag = parentPrimaryImageTag;
  }

  public SeriesTimerInfoDto parentThumbImageTag(String parentThumbImageTag) {
    this.parentThumbImageTag = JsonNullable.of(parentThumbImageTag);
    return this;
  }

  /**
   * Gets or sets the parent thumb image tag.
   * @return parentThumbImageTag
  */
  
  @Schema(name = "ParentThumbImageTag", description = "Gets or sets the parent thumb image tag.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentThumbImageTag")
  public JsonNullable<String> getParentThumbImageTag() {
    return parentThumbImageTag;
  }

  public void setParentThumbImageTag(JsonNullable<String> parentThumbImageTag) {
    this.parentThumbImageTag = parentThumbImageTag;
  }

  public SeriesTimerInfoDto parentThumbItemId(String parentThumbItemId) {
    this.parentThumbItemId = JsonNullable.of(parentThumbItemId);
    return this;
  }

  /**
   * Gets or sets the parent thumb item id.
   * @return parentThumbItemId
  */
  
  @Schema(name = "ParentThumbItemId", description = "Gets or sets the parent thumb item id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ParentThumbItemId")
  public JsonNullable<String> getParentThumbItemId() {
    return parentThumbItemId;
  }

  public void setParentThumbItemId(JsonNullable<String> parentThumbItemId) {
    this.parentThumbItemId = parentThumbItemId;
  }

  public SeriesTimerInfoDto postPaddingSeconds(Integer postPaddingSeconds) {
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

  public SeriesTimerInfoDto prePaddingSeconds(Integer prePaddingSeconds) {
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

  public SeriesTimerInfoDto priority(Integer priority) {
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

  public SeriesTimerInfoDto programId(String programId) {
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

  public SeriesTimerInfoDto recordAnyChannel(Boolean recordAnyChannel) {
    this.recordAnyChannel = recordAnyChannel;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [record any channel].
   * @return recordAnyChannel
  */
  
  @Schema(name = "RecordAnyChannel", description = "Gets or sets a value indicating whether [record any channel].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RecordAnyChannel")
  public Boolean getRecordAnyChannel() {
    return recordAnyChannel;
  }

  public void setRecordAnyChannel(Boolean recordAnyChannel) {
    this.recordAnyChannel = recordAnyChannel;
  }

  public SeriesTimerInfoDto recordAnyTime(Boolean recordAnyTime) {
    this.recordAnyTime = recordAnyTime;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [record any time].
   * @return recordAnyTime
  */
  
  @Schema(name = "RecordAnyTime", description = "Gets or sets a value indicating whether [record any time].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RecordAnyTime")
  public Boolean getRecordAnyTime() {
    return recordAnyTime;
  }

  public void setRecordAnyTime(Boolean recordAnyTime) {
    this.recordAnyTime = recordAnyTime;
  }

  public SeriesTimerInfoDto recordNewOnly(Boolean recordNewOnly) {
    this.recordNewOnly = recordNewOnly;
    return this;
  }

  /**
   * Gets or sets a value indicating whether [record new only].
   * @return recordNewOnly
  */
  
  @Schema(name = "RecordNewOnly", description = "Gets or sets a value indicating whether [record new only].", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RecordNewOnly")
  public Boolean getRecordNewOnly() {
    return recordNewOnly;
  }

  public void setRecordNewOnly(Boolean recordNewOnly) {
    this.recordNewOnly = recordNewOnly;
  }

  public SeriesTimerInfoDto serverId(String serverId) {
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

  public SeriesTimerInfoDto serviceName(String serviceName) {
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

  public SeriesTimerInfoDto skipEpisodesInLibrary(Boolean skipEpisodesInLibrary) {
    this.skipEpisodesInLibrary = skipEpisodesInLibrary;
    return this;
  }

  /**
   * Get skipEpisodesInLibrary
   * @return skipEpisodesInLibrary
  */
  
  @Schema(name = "SkipEpisodesInLibrary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SkipEpisodesInLibrary")
  public Boolean getSkipEpisodesInLibrary() {
    return skipEpisodesInLibrary;
  }

  public void setSkipEpisodesInLibrary(Boolean skipEpisodesInLibrary) {
    this.skipEpisodesInLibrary = skipEpisodesInLibrary;
  }

  public SeriesTimerInfoDto startDate(OffsetDateTime startDate) {
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

  public SeriesTimerInfoDto type(String type) {
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
    SeriesTimerInfoDto seriesTimerInfoDto = (SeriesTimerInfoDto) o;
    return Objects.equals(this.channelId, seriesTimerInfoDto.channelId) &&
        equalsNullable(this.channelName, seriesTimerInfoDto.channelName) &&
        equalsNullable(this.channelPrimaryImageTag, seriesTimerInfoDto.channelPrimaryImageTag) &&
        Objects.equals(this.dayPattern, seriesTimerInfoDto.dayPattern) &&
        equalsNullable(this.days, seriesTimerInfoDto.days) &&
        Objects.equals(this.endDate, seriesTimerInfoDto.endDate) &&
        equalsNullable(this.externalChannelId, seriesTimerInfoDto.externalChannelId) &&
        equalsNullable(this.externalId, seriesTimerInfoDto.externalId) &&
        equalsNullable(this.externalProgramId, seriesTimerInfoDto.externalProgramId) &&
        equalsNullable(this.id, seriesTimerInfoDto.id) &&
        equalsNullable(this.imageTags, seriesTimerInfoDto.imageTags) &&
        Objects.equals(this.isPostPaddingRequired, seriesTimerInfoDto.isPostPaddingRequired) &&
        Objects.equals(this.isPrePaddingRequired, seriesTimerInfoDto.isPrePaddingRequired) &&
        Objects.equals(this.keepUntil, seriesTimerInfoDto.keepUntil) &&
        Objects.equals(this.keepUpTo, seriesTimerInfoDto.keepUpTo) &&
        equalsNullable(this.name, seriesTimerInfoDto.name) &&
        equalsNullable(this.overview, seriesTimerInfoDto.overview) &&
        equalsNullable(this.parentBackdropImageTags, seriesTimerInfoDto.parentBackdropImageTags) &&
        equalsNullable(this.parentBackdropItemId, seriesTimerInfoDto.parentBackdropItemId) &&
        equalsNullable(this.parentPrimaryImageItemId, seriesTimerInfoDto.parentPrimaryImageItemId) &&
        equalsNullable(this.parentPrimaryImageTag, seriesTimerInfoDto.parentPrimaryImageTag) &&
        equalsNullable(this.parentThumbImageTag, seriesTimerInfoDto.parentThumbImageTag) &&
        equalsNullable(this.parentThumbItemId, seriesTimerInfoDto.parentThumbItemId) &&
        Objects.equals(this.postPaddingSeconds, seriesTimerInfoDto.postPaddingSeconds) &&
        Objects.equals(this.prePaddingSeconds, seriesTimerInfoDto.prePaddingSeconds) &&
        Objects.equals(this.priority, seriesTimerInfoDto.priority) &&
        equalsNullable(this.programId, seriesTimerInfoDto.programId) &&
        Objects.equals(this.recordAnyChannel, seriesTimerInfoDto.recordAnyChannel) &&
        Objects.equals(this.recordAnyTime, seriesTimerInfoDto.recordAnyTime) &&
        Objects.equals(this.recordNewOnly, seriesTimerInfoDto.recordNewOnly) &&
        equalsNullable(this.serverId, seriesTimerInfoDto.serverId) &&
        equalsNullable(this.serviceName, seriesTimerInfoDto.serviceName) &&
        Objects.equals(this.skipEpisodesInLibrary, seriesTimerInfoDto.skipEpisodesInLibrary) &&
        Objects.equals(this.startDate, seriesTimerInfoDto.startDate) &&
        equalsNullable(this.type, seriesTimerInfoDto.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId, hashCodeNullable(channelName), hashCodeNullable(channelPrimaryImageTag), dayPattern, hashCodeNullable(days), endDate, hashCodeNullable(externalChannelId), hashCodeNullable(externalId), hashCodeNullable(externalProgramId), hashCodeNullable(id), hashCodeNullable(imageTags), isPostPaddingRequired, isPrePaddingRequired, keepUntil, keepUpTo, hashCodeNullable(name), hashCodeNullable(overview), hashCodeNullable(parentBackdropImageTags), hashCodeNullable(parentBackdropItemId), hashCodeNullable(parentPrimaryImageItemId), hashCodeNullable(parentPrimaryImageTag), hashCodeNullable(parentThumbImageTag), hashCodeNullable(parentThumbItemId), postPaddingSeconds, prePaddingSeconds, priority, hashCodeNullable(programId), recordAnyChannel, recordAnyTime, recordNewOnly, hashCodeNullable(serverId), hashCodeNullable(serviceName), skipEpisodesInLibrary, startDate, hashCodeNullable(type));
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
    sb.append("class SeriesTimerInfoDto {\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    channelPrimaryImageTag: ").append(toIndentedString(channelPrimaryImageTag)).append("\n");
    sb.append("    dayPattern: ").append(toIndentedString(dayPattern)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    externalChannelId: ").append(toIndentedString(externalChannelId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalProgramId: ").append(toIndentedString(externalProgramId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageTags: ").append(toIndentedString(imageTags)).append("\n");
    sb.append("    isPostPaddingRequired: ").append(toIndentedString(isPostPaddingRequired)).append("\n");
    sb.append("    isPrePaddingRequired: ").append(toIndentedString(isPrePaddingRequired)).append("\n");
    sb.append("    keepUntil: ").append(toIndentedString(keepUntil)).append("\n");
    sb.append("    keepUpTo: ").append(toIndentedString(keepUpTo)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overview: ").append(toIndentedString(overview)).append("\n");
    sb.append("    parentBackdropImageTags: ").append(toIndentedString(parentBackdropImageTags)).append("\n");
    sb.append("    parentBackdropItemId: ").append(toIndentedString(parentBackdropItemId)).append("\n");
    sb.append("    parentPrimaryImageItemId: ").append(toIndentedString(parentPrimaryImageItemId)).append("\n");
    sb.append("    parentPrimaryImageTag: ").append(toIndentedString(parentPrimaryImageTag)).append("\n");
    sb.append("    parentThumbImageTag: ").append(toIndentedString(parentThumbImageTag)).append("\n");
    sb.append("    parentThumbItemId: ").append(toIndentedString(parentThumbItemId)).append("\n");
    sb.append("    postPaddingSeconds: ").append(toIndentedString(postPaddingSeconds)).append("\n");
    sb.append("    prePaddingSeconds: ").append(toIndentedString(prePaddingSeconds)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    recordAnyChannel: ").append(toIndentedString(recordAnyChannel)).append("\n");
    sb.append("    recordAnyTime: ").append(toIndentedString(recordAnyTime)).append("\n");
    sb.append("    recordNewOnly: ").append(toIndentedString(recordNewOnly)).append("\n");
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    skipEpisodesInLibrary: ").append(toIndentedString(skipEpisodesInLibrary)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

