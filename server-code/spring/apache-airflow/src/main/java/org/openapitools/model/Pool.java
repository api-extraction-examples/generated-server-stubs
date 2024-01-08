package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The pool
 */

@Schema(name = "Pool", description = "The pool")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class Pool {

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private String name;

  private Integer occupiedSlots;

  private Integer openSlots;

  private Integer queuedSlots;

  private Integer slots;

  private Integer usedSlots;

  public Pool description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * The description of the pool.  *New in version 2.3.0* 
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the pool.  *New in version 2.3.0* ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public Pool name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of pool.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of pool.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pool occupiedSlots(Integer occupiedSlots) {
    this.occupiedSlots = occupiedSlots;
    return this;
  }

  /**
   * The number of slots used by running/queued tasks at the moment.
   * @return occupiedSlots
  */
  
  @Schema(name = "occupied_slots", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of slots used by running/queued tasks at the moment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("occupied_slots")
  public Integer getOccupiedSlots() {
    return occupiedSlots;
  }

  public void setOccupiedSlots(Integer occupiedSlots) {
    this.occupiedSlots = occupiedSlots;
  }

  public Pool openSlots(Integer openSlots) {
    this.openSlots = openSlots;
    return this;
  }

  /**
   * The number of free slots at the moment.
   * @return openSlots
  */
  
  @Schema(name = "open_slots", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of free slots at the moment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("open_slots")
  public Integer getOpenSlots() {
    return openSlots;
  }

  public void setOpenSlots(Integer openSlots) {
    this.openSlots = openSlots;
  }

  public Pool queuedSlots(Integer queuedSlots) {
    this.queuedSlots = queuedSlots;
    return this;
  }

  /**
   * The number of slots used by queued tasks at the moment.
   * @return queuedSlots
  */
  
  @Schema(name = "queued_slots", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of slots used by queued tasks at the moment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("queued_slots")
  public Integer getQueuedSlots() {
    return queuedSlots;
  }

  public void setQueuedSlots(Integer queuedSlots) {
    this.queuedSlots = queuedSlots;
  }

  public Pool slots(Integer slots) {
    this.slots = slots;
    return this;
  }

  /**
   * The maximum number of slots that can be assigned to tasks. One job may occupy one or more slots. 
   * @return slots
  */
  
  @Schema(name = "slots", description = "The maximum number of slots that can be assigned to tasks. One job may occupy one or more slots. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slots")
  public Integer getSlots() {
    return slots;
  }

  public void setSlots(Integer slots) {
    this.slots = slots;
  }

  public Pool usedSlots(Integer usedSlots) {
    this.usedSlots = usedSlots;
    return this;
  }

  /**
   * The number of slots used by running tasks at the moment.
   * @return usedSlots
  */
  
  @Schema(name = "used_slots", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of slots used by running tasks at the moment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("used_slots")
  public Integer getUsedSlots() {
    return usedSlots;
  }

  public void setUsedSlots(Integer usedSlots) {
    this.usedSlots = usedSlots;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pool pool = (Pool) o;
    return equalsNullable(this.description, pool.description) &&
        Objects.equals(this.name, pool.name) &&
        Objects.equals(this.occupiedSlots, pool.occupiedSlots) &&
        Objects.equals(this.openSlots, pool.openSlots) &&
        Objects.equals(this.queuedSlots, pool.queuedSlots) &&
        Objects.equals(this.slots, pool.slots) &&
        Objects.equals(this.usedSlots, pool.usedSlots);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(description), name, occupiedSlots, openSlots, queuedSlots, slots, usedSlots);
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
    sb.append("class Pool {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    occupiedSlots: ").append(toIndentedString(occupiedSlots)).append("\n");
    sb.append("    openSlots: ").append(toIndentedString(openSlots)).append("\n");
    sb.append("    queuedSlots: ").append(toIndentedString(queuedSlots)).append("\n");
    sb.append("    slots: ").append(toIndentedString(slots)).append("\n");
    sb.append("    usedSlots: ").append(toIndentedString(usedSlots)).append("\n");
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

