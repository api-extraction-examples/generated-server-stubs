package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ScheduledChangesFeatureFlagConflict
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class ScheduledChangesFeatureFlagConflict {

  private String id;

  private String reason;

  public ScheduledChangesFeatureFlagConflict id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Feature flag scheduled change id this change will conflict with
   * @return id
  */
  
  @Schema(name = "_id", description = "Feature flag scheduled change id this change will conflict with", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ScheduledChangesFeatureFlagConflict reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Feature flag scheduled change conflict reason
   * @return reason
  */
  
  @Schema(name = "reason", description = "Feature flag scheduled change conflict reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduledChangesFeatureFlagConflict scheduledChangesFeatureFlagConflict = (ScheduledChangesFeatureFlagConflict) o;
    return Objects.equals(this.id, scheduledChangesFeatureFlagConflict.id) &&
        Objects.equals(this.reason, scheduledChangesFeatureFlagConflict.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduledChangesFeatureFlagConflict {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

