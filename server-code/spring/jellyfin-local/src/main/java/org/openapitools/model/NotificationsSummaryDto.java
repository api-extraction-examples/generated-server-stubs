package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.NotificationLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The notification summary DTO.
 */

@Schema(name = "NotificationsSummaryDto", description = "The notification summary DTO.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class NotificationsSummaryDto {

  private NotificationLevel maxUnreadNotificationLevel;

  private Integer unreadCount;

  public NotificationsSummaryDto maxUnreadNotificationLevel(NotificationLevel maxUnreadNotificationLevel) {
    this.maxUnreadNotificationLevel = maxUnreadNotificationLevel;
    return this;
  }

  /**
   * Get maxUnreadNotificationLevel
   * @return maxUnreadNotificationLevel
  */
  @Valid 
  @Schema(name = "MaxUnreadNotificationLevel", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MaxUnreadNotificationLevel")
  public NotificationLevel getMaxUnreadNotificationLevel() {
    return maxUnreadNotificationLevel;
  }

  public void setMaxUnreadNotificationLevel(NotificationLevel maxUnreadNotificationLevel) {
    this.maxUnreadNotificationLevel = maxUnreadNotificationLevel;
  }

  public NotificationsSummaryDto unreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
    return this;
  }

  /**
   * Gets or sets the number of unread notifications.
   * @return unreadCount
  */
  
  @Schema(name = "UnreadCount", description = "Gets or sets the number of unread notifications.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UnreadCount")
  public Integer getUnreadCount() {
    return unreadCount;
  }

  public void setUnreadCount(Integer unreadCount) {
    this.unreadCount = unreadCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationsSummaryDto notificationsSummaryDto = (NotificationsSummaryDto) o;
    return Objects.equals(this.maxUnreadNotificationLevel, notificationsSummaryDto.maxUnreadNotificationLevel) &&
        Objects.equals(this.unreadCount, notificationsSummaryDto.unreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxUnreadNotificationLevel, unreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationsSummaryDto {\n");
    sb.append("    maxUnreadNotificationLevel: ").append(toIndentedString(maxUnreadNotificationLevel)).append("\n");
    sb.append("    unreadCount: ").append(toIndentedString(unreadCount)).append("\n");
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

