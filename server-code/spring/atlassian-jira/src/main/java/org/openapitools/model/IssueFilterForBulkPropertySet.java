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

@Schema(name = "IssueFilterForBulkPropertySet", description = "Bulk operation filter details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueFilterForBulkPropertySet {

  private JsonNullable<Object> currentValue = JsonNullable.<Object>undefined();

  @Valid
  private Set<Long> entityIds;

  private Boolean hasProperty;

  public IssueFilterForBulkPropertySet currentValue(Object currentValue) {
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

  public IssueFilterForBulkPropertySet entityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public IssueFilterForBulkPropertySet addEntityIdsItem(Long entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new LinkedHashSet<>();
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

  /**
   * List of issues to perform the bulk operation on.
   * @return entityIds
  */
  
  @Schema(name = "entityIds", description = "List of issues to perform the bulk operation on.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entityIds")
  public Set<Long> getEntityIds() {
    return entityIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setEntityIds(Set<Long> entityIds) {
    this.entityIds = entityIds;
  }

  public IssueFilterForBulkPropertySet hasProperty(Boolean hasProperty) {
    this.hasProperty = hasProperty;
    return this;
  }

  /**
   * Whether the bulk operation occurs only when the property is present on or absent from an issue.
   * @return hasProperty
  */
  
  @Schema(name = "hasProperty", description = "Whether the bulk operation occurs only when the property is present on or absent from an issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasProperty")
  public Boolean getHasProperty() {
    return hasProperty;
  }

  public void setHasProperty(Boolean hasProperty) {
    this.hasProperty = hasProperty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueFilterForBulkPropertySet issueFilterForBulkPropertySet = (IssueFilterForBulkPropertySet) o;
    return equalsNullable(this.currentValue, issueFilterForBulkPropertySet.currentValue) &&
        Objects.equals(this.entityIds, issueFilterForBulkPropertySet.entityIds) &&
        Objects.equals(this.hasProperty, issueFilterForBulkPropertySet.hasProperty);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(currentValue), entityIds, hasProperty);
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
    sb.append("class IssueFilterForBulkPropertySet {\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    hasProperty: ").append(toIndentedString(hasProperty)).append("\n");
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

