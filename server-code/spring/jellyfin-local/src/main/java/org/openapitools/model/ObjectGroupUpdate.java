package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GroupUpdateType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class GroupUpdate.
 */

@Schema(name = "ObjectGroupUpdate", description = "Class GroupUpdate.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ObjectGroupUpdate {

  private JsonNullable<Object> data = JsonNullable.<Object>undefined();

  private UUID groupId;

  private GroupUpdateType type;

  public ObjectGroupUpdate data(Object data) {
    this.data = JsonNullable.of(data);
    return this;
  }

  /**
   * Gets the update data.
   * @return data
  */
  
  @Schema(name = "Data", accessMode = Schema.AccessMode.READ_ONLY, description = "Gets the update data.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Data")
  public JsonNullable<Object> getData() {
    return data;
  }

  public void setData(JsonNullable<Object> data) {
    this.data = data;
  }

  public ObjectGroupUpdate groupId(UUID groupId) {
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

  public ObjectGroupUpdate type(GroupUpdateType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @Valid 
  @Schema(name = "Type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Type")
  public GroupUpdateType getType() {
    return type;
  }

  public void setType(GroupUpdateType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectGroupUpdate objectGroupUpdate = (ObjectGroupUpdate) o;
    return equalsNullable(this.data, objectGroupUpdate.data) &&
        Objects.equals(this.groupId, objectGroupUpdate.groupId) &&
        Objects.equals(this.type, objectGroupUpdate.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(data), groupId, type);
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
    sb.append("class ObjectGroupUpdate {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

