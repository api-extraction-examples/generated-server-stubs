package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
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
 * Bulk operation filter details.
 */

@Schema(name = "IssueFilterForBulkPropertyDelete", description = "Bulk operation filter details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueFilterForBulkPropertyDelete {

  private JsonNullable<Object> currentValue = JsonNullable.<Object>undefined();

  @Valid
  private Set<Long> entityIds;

  public IssueFilterForBulkPropertyDelete currentValue(Object currentValue) {
    this.currentValue = JsonNullable.of(currentValue);
    return this;
  }

  /**
   * The value of properties to perform the bulk operation on.
   * @return currentValue
  */
  
  @Schema(name = "currentValue", description = "The value of properties to perform the bulk operation on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentValue")
  public JsonNullable<Object> getCurrentValue() {
    return currentValue;
  }

  public void setCurrentValue(JsonNullable<Object> currentValue) {
    this.currentValue = currentValue;
  }

  public IssueFilterForBulkPropertyDelete entityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public IssueFilterForBulkPropertyDelete addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new LinkedHashSet<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

  /**
   * List of issues to perform the bulk delete operation on.
   * @return entityIds
  */
  
  @Schema(name = "entityIds", description = "List of issues to perform the bulk delete operation on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityIds")
  public Set<Long> getEntityIds() {
    return entityIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setEntityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFilterForBulkPropertyDelete issueFilterForBulkPropertyDelete = (IssueFilterForBulkPropertyDelete) o;
    return equalsNullable(this.currentValue, issueFilterForBulkPropertyDelete.currentValue) &&
        Objects.equals(this.entityIds, issueFilterForBulkPropertyDelete.entityIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(currentValue), entityIds);
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
    sb.append("class IssueFilterForBulkPropertyDelete {\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
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

