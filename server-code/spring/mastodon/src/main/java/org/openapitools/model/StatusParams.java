package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * StatusParams
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class StatusParams {

  private String applicationId;

  private String inReplyToId;

  @Valid
  private List<String> mediaIds;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledAt;

  private Boolean sensitive;

  private String spoilerText;

  private String text;

  private String visibility;

  public StatusParams applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * application_id
   * @return applicationId
  */
  
  @Schema(name = "application_id", description = "application_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("application_id")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public StatusParams inReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
    return this;
  }

  /**
   * in_reply_to_id
   * @return inReplyToId
  */
  
  @Schema(name = "in_reply_to_id", description = "in_reply_to_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("in_reply_to_id")
  public String getInReplyToId() {
    return inReplyToId;
  }

  public void setInReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
  }

  public StatusParams mediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
    return this;
  }

  public StatusParams addMediaIdsItem(String mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

  /**
   * media_ids
   * @return mediaIds
  */
  
  @Schema(name = "media_ids", description = "media_ids", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_ids")
  public List<String> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }

  public StatusParams scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * scheduled_at
   * @return scheduledAt
  */
  @Valid 
  @Schema(name = "scheduled_at", description = "scheduled_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduled_at")
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public StatusParams sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * sensitive
   * @return sensitive
  */
  
  @Schema(name = "sensitive", description = "sensitive", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sensitive")
  public Boolean getSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public StatusParams spoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
    return this;
  }

  /**
   * spoiler_text
   * @return spoilerText
  */
  
  @Schema(name = "spoiler_text", description = "spoiler_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spoiler_text")
  public String getSpoilerText() {
    return spoilerText;
  }

  public void setSpoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
  }

  public StatusParams text(String text) {
    this.text = text;
    return this;
  }

  /**
   * text
   * @return text
  */
  
  @Schema(name = "text", description = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public StatusParams visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * visibility
   * @return visibility
  */
  
  @Schema(name = "visibility", description = "visibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusParams statusParams = (StatusParams) o;
    return Objects.equals(this.applicationId, statusParams.applicationId) &&
        Objects.equals(this.inReplyToId, statusParams.inReplyToId) &&
        Objects.equals(this.mediaIds, statusParams.mediaIds) &&
        Objects.equals(this.scheduledAt, statusParams.scheduledAt) &&
        Objects.equals(this.sensitive, statusParams.sensitive) &&
        Objects.equals(this.spoilerText, statusParams.spoilerText) &&
        Objects.equals(this.text, statusParams.text) &&
        Objects.equals(this.visibility, statusParams.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, inReplyToId, mediaIds, scheduledAt, sensitive, spoilerText, text, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusParams {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    spoilerText: ").append(toIndentedString(spoilerText)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

