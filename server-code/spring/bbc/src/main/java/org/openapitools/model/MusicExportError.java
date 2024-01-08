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
 * MusicExportError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:06.732824-04:00[America/Lower_Princes]")
public class MusicExportError {

  private String message;

  private Integer repliedAt;

  private Integer status;

  public MusicExportError() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public MusicExportError(String message, Integer repliedAt, Integer status) {
    this.message = message;
    this.repliedAt = repliedAt;
    this.status = status;
  }

  public MusicExportError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @NotNull 
  @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MusicExportError repliedAt(Integer repliedAt) {
    this.repliedAt = repliedAt;
    return this;
  }

  /**
   * Get repliedAt
   * @return repliedAt
  */
  @NotNull 
  @Schema(name = "replied_at", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("replied_at")
  public Integer getRepliedAt() {
    return repliedAt;
  }

  public void setRepliedAt(Integer repliedAt) {
    this.repliedAt = repliedAt;
  }

  public MusicExportError status(Integer status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MusicExportError musicExportError = (MusicExportError) o;
    return Objects.equals(this.message, musicExportError.message) &&
        Objects.equals(this.repliedAt, musicExportError.repliedAt) &&
        Objects.equals(this.status, musicExportError.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, repliedAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MusicExportError {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    repliedAt: ").append(toIndentedString(repliedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

