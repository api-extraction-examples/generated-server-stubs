package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1StatusesPostRequestInner
 */

@JsonTypeName("_api_v1_statuses_post_request_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1StatusesPostRequestInner {

  private String inReplyToId;

  private String language;

  @Valid
  private List<String> mediaIds;

  @Valid
  private Map<Object> poll;

  private String scheduledAt;

  private Boolean sensitive;

  private String spoilerText;

  private String status;

  /**
   * Visibility of the posted status. Enumerable oneOf public, unlisted, private, direct.
   */
  public enum VisibilityEnum {
    PUBLIC("public"),
    
    UNLISTED("unlisted"),
    
    PRIVATE("private"),
    
    DIRECT("direct");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private VisibilityEnum visibility;

  public ApiV1StatusesPostRequestInner inReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
    return this;
  }

  /**
   * ID of the status being replied to, if status is a reply
   * @return inReplyToId
  */
  
  @Schema(name = "in_reply_to_id", description = "ID of the status being replied to, if status is a reply", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("in_reply_to_id")
  public String getInReplyToId() {
    return inReplyToId;
  }

  public void setInReplyToId(String inReplyToId) {
    this.inReplyToId = inReplyToId;
  }

  public ApiV1StatusesPostRequestInner language(String language) {
    this.language = language;
    return this;
  }

  /**
   * ISO 639 language code for this status.
   * @return language
  */
  
  @Schema(name = "language", description = "ISO 639 language code for this status.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ApiV1StatusesPostRequestInner mediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
    return this;
  }

  public ApiV1StatusesPostRequestInner addMediaIdsItem(String mediaIdsItem) {
    if (this.mediaIds == null) {
      this.mediaIds = new ArrayList<>();
    }
    this.mediaIds.add(mediaIdsItem);
    return this;
  }

  /**
   * Array of Attachment ids to be attached as media. If provided, `status` becomes optional, and `poll` cannot be used.
   * @return mediaIds
  */
  
  @Schema(name = "media_ids", description = "Array of Attachment ids to be attached as media. If provided, `status` becomes optional, and `poll` cannot be used.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("media_ids")
  public List<String> getMediaIds() {
    return mediaIds;
  }

  public void setMediaIds(List<String> mediaIds) {
    this.mediaIds = mediaIds;
  }

  public ApiV1StatusesPostRequestInner poll(Map<Object> poll) {
    this.poll = poll;
    return this;
  }

  public ApiV1StatusesPostRequestInner addPollItem(Object pollItem) {
    if (this.poll == null) {
      this.poll = new ArrayList<>();
    }
    this.poll.add(pollItem);
    return this;
  }

  /**
   * Get poll
   * @return poll
  */
  
  @Schema(name = "poll", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("poll")
  public Map<Object> getPoll() {
    return poll;
  }

  public void setPoll(Map<Object> poll) {
    this.poll = poll;
  }

  public ApiV1StatusesPostRequestInner scheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * ISO 8601 Datetime at which to schedule a status. Providing this paramter will cause ScheduledStatus to be returned instead of Status. Must be at least 5 minutes in the future.
   * @return scheduledAt
  */
  
  @Schema(name = "scheduled_at", description = "ISO 8601 Datetime at which to schedule a status. Providing this paramter will cause ScheduledStatus to be returned instead of Status. Must be at least 5 minutes in the future.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scheduled_at")
  public String getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(String scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  public ApiV1StatusesPostRequestInner sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

  /**
   * Mark status and attached media as sensitive?
   * @return sensitive
  */
  
  @Schema(name = "sensitive", description = "Mark status and attached media as sensitive?", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sensitive")
  public Boolean getSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public ApiV1StatusesPostRequestInner spoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
    return this;
  }

  /**
   * Text to be shown as a warning or subject before the actual content. Statuses are generally collapsed behind this field.
   * @return spoilerText
  */
  
  @Schema(name = "spoiler_text", description = "Text to be shown as a warning or subject before the actual content. Statuses are generally collapsed behind this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("spoiler_text")
  public String getSpoilerText() {
    return spoilerText;
  }

  public void setSpoilerText(String spoilerText) {
    this.spoilerText = spoilerText;
  }

  public ApiV1StatusesPostRequestInner status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Text content of the status. If `media_ids` is provided, this becomes optional. Attaching a `poll` is optional while `status` is provided.
   * @return status
  */
  
  @Schema(name = "status", description = "Text content of the status. If `media_ids` is provided, this becomes optional. Attaching a `poll` is optional while `status` is provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ApiV1StatusesPostRequestInner visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the posted status. Enumerable oneOf public, unlisted, private, direct.
   * @return visibility
  */
  
  @Schema(name = "visibility", description = "Visibility of the posted status. Enumerable oneOf public, unlisted, private, direct.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
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
    ApiV1StatusesPostRequestInner apiV1StatusesPostRequestInner = (ApiV1StatusesPostRequestInner) o;
    return Objects.equals(this.inReplyToId, apiV1StatusesPostRequestInner.inReplyToId) &&
        Objects.equals(this.language, apiV1StatusesPostRequestInner.language) &&
        Objects.equals(this.mediaIds, apiV1StatusesPostRequestInner.mediaIds) &&
        Objects.equals(this.poll, apiV1StatusesPostRequestInner.poll) &&
        Objects.equals(this.scheduledAt, apiV1StatusesPostRequestInner.scheduledAt) &&
        Objects.equals(this.sensitive, apiV1StatusesPostRequestInner.sensitive) &&
        Objects.equals(this.spoilerText, apiV1StatusesPostRequestInner.spoilerText) &&
        Objects.equals(this.status, apiV1StatusesPostRequestInner.status) &&
        Objects.equals(this.visibility, apiV1StatusesPostRequestInner.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inReplyToId, language, mediaIds, poll, scheduledAt, sensitive, spoilerText, status, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1StatusesPostRequestInner {\n");
    sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    mediaIds: ").append(toIndentedString(mediaIds)).append("\n");
    sb.append("    poll: ").append(toIndentedString(poll)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    spoilerText: ").append(toIndentedString(spoilerText)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

