package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GroupStateType;
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
 * Class GroupInfoDto.
 */

@Schema(name = "GroupInfoDto", description = "Class GroupInfoDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class GroupInfoDto {

  private UUID groupId;

  private JsonNullable<String> groupName = JsonNullable.<String>undefined();

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime lastUpdatedAt;

  @Valid
  private JsonNullable<List<String>> participants = JsonNullable.<List<String>>undefined();

  private GroupStateType state;

  public GroupInfoDto groupId(UUID groupId) {
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

  public GroupInfoDto groupName(String groupName) {
    this.groupName = JsonNullable.of(groupName);
    return this;
  }

  /**
   * Gets the group name.
   * @return groupName
  */
  
  @Schema(name = "GroupName", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the group name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupName")
  public JsonNullable<String> getGroupName() {
    return groupName;
  }

  public void setGroupName(JsonNullable<String> groupName) {
    this.groupName = groupName;
  }

  public GroupInfoDto lastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * Gets the date when this DTO has been created.
   * @return lastUpdatedAt
  */
  @Valid 
  @Schema(name = "LastUpdatedAt", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the date when this DTO has been created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastUpdatedAt")
  public OffsetDateTime getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public GroupInfoDto participants(List<String> participants) {
    this.participants = JsonNullable.of(participants);
    return this;
  }

  public GroupInfoDto addParticipantsItem(String participantsItem) {
    if (this.participants == null || !this.participants.isPresent()) {
      this.participants = JsonNullable.of(new ArrayList<>());
    }
    this.participants.get().add(participantsItem);
    return this;
  }

  /**
   * Gets the participants.
   * @return participants
  */
  
  @Schema(name = "Participants", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the participants.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Participants")
  public JsonNullable<List<String>> getParticipants() {
    return participants;
  }

  public void setParticipants(JsonNullable<List<String>> participants) {
    this.participants = participants;
  }

  public GroupInfoDto state(GroupStateType state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @Valid 
  @Schema(name = "State", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("State")
  public GroupStateType getState() {
    return state;
  }

  public void setState(GroupStateType state) {
    this.state = state;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupInfoDto groupInfoDto = (GroupInfoDto) o;
    return Objects.equals(this.groupId, groupInfoDto.groupId) &&
        equalsNullable(this.groupName, groupInfoDto.groupName) &&
        Objects.equals(this.lastUpdatedAt, groupInfoDto.lastUpdatedAt) &&
        equalsNullable(this.participants, groupInfoDto.participants) &&
        Objects.equals(this.state, groupInfoDto.state);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, hashCodeNullable(groupName), lastUpdatedAt, hashCodeNullable(participants), state);
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
    sb.append("class GroupInfoDto {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

