package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GroupQueueMode;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class QueueRequestDto.
 */

@Schema(name = "QueueRequestDto", description = "Class QueueRequestDto.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class QueueRequestDto {

  @Valid
  private JsonNullable<List<UUID>> itemIds = JsonNullable.<List<UUID>>undefined();

  private GroupQueueMode mode;

  public QueueRequestDto itemIds(List<UUID> itemIds) {
    this.itemIds = JsonNullable.of(itemIds);
    return this;
  }

  public QueueRequestDto addItemIdsItem(UUID itemIdsItem) {
    if (this.itemIds == null || !this.itemIds.isPresent()) {
      this.itemIds = JsonNullable.of(new ArrayList<>());
    }
    this.itemIds.get().add(itemIdsItem);
    return this;
  }

  /**
   * Gets or sets the items to enqueue.
   * @return itemIds
  */
  @Valid 
  @Schema(name = "ItemIds", description = "Gets or sets the items to enqueue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ItemIds")
  public JsonNullable<List<UUID>> getItemIds() {
    return itemIds;
  }

  public void setItemIds(JsonNullable<List<UUID>> itemIds) {
    this.itemIds = itemIds;
  }

  public QueueRequestDto mode(GroupQueueMode mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @Valid 
  @Schema(name = "Mode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Mode")
  public GroupQueueMode getMode() {
    return mode;
  }

  public void setMode(GroupQueueMode mode) {
    this.mode = mode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueRequestDto queueRequestDto = (QueueRequestDto) o;
    return equalsNullable(this.itemIds, queueRequestDto.itemIds) &&
        Objects.equals(this.mode, queueRequestDto.mode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(itemIds), mode);
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
    sb.append("class QueueRequestDto {\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

