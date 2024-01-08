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
 * DagWarning
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class DagWarning {

  private String dagId;

  private String message;

  private String timestamp;

  private String warningType;

  public DagWarning dagId(String dagId) {
    this.dagId = dagId;
    return this;
  }

  /**
   * The dag_id.
   * @return dagId
  */
  
  @Schema(name = "dag_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The dag_id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dag_id")
  public String getDagId() {
    return dagId;
  }

  public void setDagId(String dagId) {
    this.dagId = dagId;
  }

  public DagWarning message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message for the dag warning.
   * @return message
  */
  
  @Schema(name = "message", accessMode = Schema.AccessMode.READ_ONLY, description = "The message for the dag warning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DagWarning timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The time when this warning was logged.
   * @return timestamp
  */
  
  @Schema(name = "timestamp", accessMode = Schema.AccessMode.READ_ONLY, description = "The time when this warning was logged.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public DagWarning warningType(String warningType) {
    this.warningType = warningType;
    return this;
  }

  /**
   * The warning type for the dag warning.
   * @return warningType
  */
  
  @Schema(name = "warning_type", accessMode = Schema.AccessMode.READ_ONLY, description = "The warning type for the dag warning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warning_type")
  public String getWarningType() {
    return warningType;
  }

  public void setWarningType(String warningType) {
    this.warningType = warningType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DagWarning dagWarning = (DagWarning) o;
    return Objects.equals(this.dagId, dagWarning.dagId) &&
        Objects.equals(this.message, dagWarning.message) &&
        Objects.equals(this.timestamp, dagWarning.timestamp) &&
        Objects.equals(this.warningType, dagWarning.warningType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dagId, message, timestamp, warningType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DagWarning {\n");
    sb.append("    dagId: ").append(toIndentedString(dagId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
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

