package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class JoinGroupRequestDto.
 */

@Schema(name = "JoinGroupRequestDto", description = "Class JoinGroupRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class JoinGroupRequestDto {

  private UUID groupId;

  public JoinGroupRequestDto groupId(UUID groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Gets or sets the group identifier.
   * @return groupId
  */
  @Valid 
  @Schema(name = "GroupId", description = "Gets or sets the group identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("GroupId")
  public UUID getGroupId() {
    return groupId;
  }

  public void setGroupId(UUID groupId) {
    this.groupId = groupId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinGroupRequestDto joinGroupRequestDto = (JoinGroupRequestDto) o;
    return Objects.equals(this.groupId, joinGroupRequestDto.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinGroupRequestDto {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

