package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateTaskInstance
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class UpdateTaskInstance {

  private Boolean dryRun = false;

  /**
   * Expected new state.
   */
  public enum NewStateEnum {
    SUCCESS("success"),
    
    FAILED("failed");

    private String value;

    NewStateEnum(String value) {
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
    public static NewStateEnum fromValue(String value) {
      for (NewStateEnum b : NewStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NewStateEnum newState;

  public UpdateTaskInstance dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * If set, don't actually run this operation. The response will contain the task instance planned to be affected, but won't be modified in any way. 
   * @return dryRun
  */
  
  @Schema(name = "dry_run", description = "If set, don't actually run this operation. The response will contain the task instance planned to be affected, but won't be modified in any way. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dry_run")
  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public UpdateTaskInstance newState(NewStateEnum newState) {
    this.newState = newState;
    return this;
  }

  /**
   * Expected new state.
   * @return newState
  */
  
  @Schema(name = "new_state", description = "Expected new state.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_state")
  public NewStateEnum getNewState() {
    return newState;
  }

  public void setNewState(NewStateEnum newState) {
    this.newState = newState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTaskInstance updateTaskInstance = (UpdateTaskInstance) o;
    return Objects.equals(this.dryRun, updateTaskInstance.dryRun) &&
        Objects.equals(this.newState, updateTaskInstance.newState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, newState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTaskInstance {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    newState: ").append(toIndentedString(newState)).append("\n");
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

