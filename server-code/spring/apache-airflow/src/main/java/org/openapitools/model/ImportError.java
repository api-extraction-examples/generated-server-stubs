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
 * ImportError
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class ImportError {

  private String filename;

  private Integer importErrorId;

  private String stackTrace;

  private String timestamp;

  public ImportError filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The filename
   * @return filename
  */
  
  @Schema(name = "filename", accessMode = Schema.AccessMode.READ_ONLY, description = "The filename", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public ImportError importErrorId(Integer importErrorId) {
    this.importErrorId = importErrorId;
    return this;
  }

  /**
   * The import error ID.
   * @return importErrorId
  */
  
  @Schema(name = "import_error_id", accessMode = Schema.AccessMode.READ_ONLY, description = "The import error ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("import_error_id")
  public Integer getImportErrorId() {
    return importErrorId;
  }

  public void setImportErrorId(Integer importErrorId) {
    this.importErrorId = importErrorId;
  }

  public ImportError stackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  /**
   * The full stackstrace..
   * @return stackTrace
  */
  
  @Schema(name = "stack_trace", accessMode = Schema.AccessMode.READ_ONLY, description = "The full stackstrace..", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stack_trace")
  public String getStackTrace() {
    return stackTrace;
  }

  public void setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
  }

  public ImportError timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The time when this error was created.
   * @return timestamp
  */
  
  @Schema(name = "timestamp", accessMode = Schema.AccessMode.READ_ONLY, description = "The time when this error was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImportError importError = (ImportError) o;
    return Objects.equals(this.filename, importError.filename) &&
        Objects.equals(this.importErrorId, importError.importErrorId) &&
        Objects.equals(this.stackTrace, importError.stackTrace) &&
        Objects.equals(this.timestamp, importError.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, importErrorId, stackTrace, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportError {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    importErrorId: ").append(toIndentedString(importErrorId)).append("\n");
    sb.append("    stackTrace: ").append(toIndentedString(stackTrace)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

