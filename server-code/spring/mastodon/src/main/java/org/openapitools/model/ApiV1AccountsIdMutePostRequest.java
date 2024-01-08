package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ApiV1AccountsIdMutePostRequest
 */

@JsonTypeName("_api_v1_accounts__id__mute_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1AccountsIdMutePostRequest {

  private Integer duration = 0;

  private Boolean notifications = true;

  public ApiV1AccountsIdMutePostRequest duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * How long the mute should last, in seconds. Defaults to 0 (indefinite).
   * @return duration
  */
  
  @Schema(name = "duration", description = "How long the mute should last, in seconds. Defaults to 0 (indefinite).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("duration")
  public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public ApiV1AccountsIdMutePostRequest notifications(Boolean notifications) {
    this.notifications = notifications;
    return this;
  }

  /**
   * Mute notifications in addition to statuses? Defaults to true.
   * @return notifications
  */
  
  @Schema(name = "notifications", description = "Mute notifications in addition to statuses? Defaults to true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("notifications")
  public Boolean getNotifications() {
    return notifications;
  }

  public void setNotifications(Boolean notifications) {
    this.notifications = notifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AccountsIdMutePostRequest apiV1AccountsIdMutePostRequest = (ApiV1AccountsIdMutePostRequest) o;
    return Objects.equals(this.duration, apiV1AccountsIdMutePostRequest.duration) &&
        Objects.equals(this.notifications, apiV1AccountsIdMutePostRequest.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AccountsIdMutePostRequest {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

