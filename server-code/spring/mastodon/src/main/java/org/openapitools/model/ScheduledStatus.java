package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Attachment;
import org.openapitools.model.StatusParams;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a status that will be published at a future scheduled date.
 */

@Schema(name = "ScheduledStatus", description = "Represents a status that will be published at a future scheduled date.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ScheduledStatus implements ApiV1StatusesPost200Response {

  private String id;

  @Valid
  private List<@Valid Attachment> mediaAttachments = new ArrayList<>();

  private StatusParams params;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime scheduledAt;

  public ScheduledStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ScheduledStatus(String id, List<@Valid Attachment> mediaAttachments, StatusParams params, OffsetDateTime scheduledAt) {
    this.id = id;
    this.mediaAttachments = mediaAttachments;
    this.params = params;
    this.scheduledAt = scheduledAt;
  }

  public ScheduledStatus id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the scheduled status in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "ID of the scheduled status in the database. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScheduledStatus mediaAttachments(List<@Valid Attachment> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
    return this;
  }

  public ScheduledStatus addMediaAttachmentsItem(Attachment mediaAttachmentsItem) {
    if (this.mediaAttachments == null) {
      this.mediaAttachments = new ArrayList<>();
    }
    this.mediaAttachments.add(mediaAttachmentsItem);
    return this;
  }

  /**
   * Array of attachements
   * @return mediaAttachments
  */
  @NotNull @Valid 
  @Schema(name = "media_attachments", description = "Array of attachements", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("media_attachments")
  public List<@Valid Attachment> getMediaAttachments() {
    return mediaAttachments;
  }

  public void setMediaAttachments(List<@Valid Attachment> mediaAttachments) {
    this.mediaAttachments = mediaAttachments;
  }

  public ScheduledStatus params(StatusParams params) {
    this.params = params;
    return this;
  }

  /**
   * Get params
   * @return params
  */
  @NotNull @Valid 
  @Schema(name = "params", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("params")
  public StatusParams getParams() {
    return params;
  }

  public void setParams(StatusParams params) {
    this.params = params;
  }

  public ScheduledStatus scheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
    return this;
  }

  /**
   * ID of the status in the database. ISO 8601 Datetime.
   * @return scheduledAt
  */
  @NotNull @Valid 
  @Schema(name = "scheduled_at", description = "ID of the status in the database. ISO 8601 Datetime.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scheduled_at")
  public OffsetDateTime getScheduledAt() {
    return scheduledAt;
  }

  public void setScheduledAt(OffsetDateTime scheduledAt) {
    this.scheduledAt = scheduledAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledStatus scheduledStatus = (ScheduledStatus) o;
    return Objects.equals(this.id, scheduledStatus.id) &&
        Objects.equals(this.mediaAttachments, scheduledStatus.mediaAttachments) &&
        Objects.equals(this.params, scheduledStatus.params) &&
        Objects.equals(this.scheduledAt, scheduledStatus.scheduledAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaAttachments, params, scheduledAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaAttachments: ").append(toIndentedString(mediaAttachments)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    scheduledAt: ").append(toIndentedString(scheduledAt)).append("\n");
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

