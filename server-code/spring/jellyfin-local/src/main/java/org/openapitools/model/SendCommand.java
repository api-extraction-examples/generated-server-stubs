package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SendCommandType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class SendCommand.
 */

@Schema(name = "SendCommand", description = "Class SendCommand.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class SendCommand {

  private SendCommandType command;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime emittedAt;

  private UUID groupId;

  private UUID playlistItemId;

  private JsonNullable<Long> positionTicks = JsonNullable.<Long>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime when;

  public SendCommand command(SendCommandType command) {
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
  public SendCommandType getCommand() {
    return command;
  }

  public void setCommand(SendCommandType command) {
    this.command = command;
  }

  public SendCommand emittedAt(OffsetDateTime emittedAt) {
    this.emittedAt = emittedAt;
    return this;
  }

  /**
   * Gets the UTC time when this command has been emitted.
   * @return emittedAt
  */
  @Valid 
  @Schema(name = "EmittedAt", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the UTC time when this command has been emitted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("EmittedAt")
  public OffsetDateTime getEmittedAt() {
    return emittedAt;
  }

  public void setEmittedAt(OffsetDateTime emittedAt) {
    this.emittedAt = emittedAt;
  }

  public SendCommand groupId(UUID groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Gets the group identifier.
   * @return groupId
  */
  @Valid 
  @Schema(name = "GroupId", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the group identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupId")
  public UUID getGroupId() {
    return groupId;
  }

  public void setGroupId(UUID groupId) {
    this.groupId = groupId;
  }

  public SendCommand playlistItemId(UUID playlistItemId) {
    this.playlistItemId = playlistItemId;
    return this;
  }

  /**
   * Gets the playlist identifier of the playing item.
   * @return playlistItemId
  */
  @Valid 
  @Schema(name = "PlaylistItemId", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the playlist identifier of the playing item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PlaylistItemId")
  public UUID getPlaylistItemId() {
    return playlistItemId;
  }

  public void setPlaylistItemId(UUID playlistItemId) {
    this.playlistItemId = playlistItemId;
  }

  public SendCommand positionTicks(Long positionTicks) {
    this.positionTicks = JsonNullable.of(positionTicks);
    return this;
  }

  /**
   * Gets the position ticks.
   * @return positionTicks
  */
  
  @Schema(name = "PositionTicks", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the position ticks.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PositionTicks")
  public JsonNullable<Long> getPositionTicks() {
    return positionTicks;
  }

  public void setPositionTicks(JsonNullable<Long> positionTicks) {
    this.positionTicks = positionTicks;
  }

  public SendCommand when(OffsetDateTime when) {
    this.when = when;
    return this;
  }

  /**
   * Gets or sets the UTC time when to execute the command.
   * @return when
  */
  @Valid 
  @Schema(name = "When", description = "Gets or sets the UTC time when to execute the command.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("When")
  public OffsetDateTime getWhen() {
    return when;
  }

  public void setWhen(OffsetDateTime when) {
    this.when = when;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendCommand sendCommand = (SendCommand) o;
    return Objects.equals(this.command, sendCommand.command) &&
        Objects.equals(this.emittedAt, sendCommand.emittedAt) &&
        Objects.equals(this.groupId, sendCommand.groupId) &&
        Objects.equals(this.playlistItemId, sendCommand.playlistItemId) &&
        equalsNullable(this.positionTicks, sendCommand.positionTicks) &&
        Objects.equals(this.when, sendCommand.when);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, emittedAt, groupId, playlistItemId, hashCodeNullable(positionTicks), when);
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
    sb.append("class SendCommand {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    emittedAt: ").append(toIndentedString(emittedAt)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    playlistItemId: ").append(toIndentedString(playlistItemId)).append("\n");
    sb.append("    positionTicks: ").append(toIndentedString(positionTicks)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
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

