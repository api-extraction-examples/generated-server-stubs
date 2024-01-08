package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlaystateCommand;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PlaystateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class PlaystateRequest {

  private PlaystateCommand command;

  private JsonNullable<String> controllingUserId = JsonNullable.<String>undefined();

  private JsonNullable<Long> seekPositionTicks = JsonNullable.<Long>undefined();

  public PlaystateRequest command(PlaystateCommand command) {
    this.command = command;
    return this;
  }

  /**
   * Get command
   * @return command
  */
  @Valid 
  @Schema(name = "Command", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Command")
  public PlaystateCommand getCommand() {
    return command;
  }

  public void setCommand(PlaystateCommand command) {
    this.command = command;
  }

  public PlaystateRequest controllingUserId(String controllingUserId) {
    this.controllingUserId = JsonNullable.of(controllingUserId);
    return this;
  }

  /**
   * Gets or sets the controlling user identifier.
   * @return controllingUserId
  */
  
  @Schema(name = "ControllingUserId", description = "Gets or sets the controlling user identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ControllingUserId")
  public JsonNullable<String> getControllingUserId() {
    return controllingUserId;
  }

  public void setControllingUserId(JsonNullable<String> controllingUserId) {
    this.controllingUserId = controllingUserId;
  }

  public PlaystateRequest seekPositionTicks(Long seekPositionTicks) {
    this.seekPositionTicks = JsonNullable.of(seekPositionTicks);
    return this;
  }

  /**
   * Get seekPositionTicks
   * @return seekPositionTicks
  */
  
  @Schema(name = "SeekPositionTicks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SeekPositionTicks")
  public JsonNullable<Long> getSeekPositionTicks() {
    return seekPositionTicks;
  }

  public void setSeekPositionTicks(JsonNullable<Long> seekPositionTicks) {
    this.seekPositionTicks = seekPositionTicks;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaystateRequest playstateRequest = (PlaystateRequest) o;
    return Objects.equals(this.command, playstateRequest.command) &&
        equalsNullable(this.controllingUserId, playstateRequest.controllingUserId) &&
        equalsNullable(this.seekPositionTicks, playstateRequest.seekPositionTicks);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, hashCodeNullable(controllingUserId), hashCodeNullable(seekPositionTicks));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaystateRequest {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    controllingUserId: ").append(toIndentedString(controllingUserId)).append("\n");
    sb.append("    seekPositionTicks: ").append(toIndentedString(seekPositionTicks)).append("\n");
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

