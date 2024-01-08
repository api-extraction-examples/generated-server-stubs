package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Information about the type of change that has occurred. This field is only present when the value of the property &#x60;action&#x60;, describing the action taken on the **resource**, is &#x60;changed&#x60;.
 */

@Schema(name = "EventResponse_change", description = "Information about the type of change that has occurred. This field is only present when the value of the property `action`, describing the action taken on the **resource**, is `changed`.")
@JsonTypeName("EventResponse_change")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class EventResponseChange {

  private String action;

  private JsonNullable<Object> addedValue = JsonNullable.<Object>undefined();

  private String field;

  private JsonNullable<Object> newValue = JsonNullable.<Object>undefined();

  private JsonNullable<Object> removedValue = JsonNullable.<Object>undefined();

  public EventResponseChange action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The type of action taken on the **field** which has been changed.  This can be one of `changed`, `added`, or `removed` depending on the nature of the change.
   * @return action
  */
  
  @Schema(name = "action", accessMode = Schema.AccessMode.READ_ONLY, example = "changed", description = "The type of action taken on the **field** which has been changed.  This can be one of `changed`, `added`, or `removed` depending on the nature of the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public EventResponseChange addedValue(Object addedValue) {
    this.addedValue = JsonNullable.of(addedValue);
    return this;
  }

  /**
   * *Conditional.* This property is only present when the **field's** `action` is `added` _and_ the `added_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.
   * @return addedValue
  */
  
  @Schema(name = "added_value", example = "{\"gid\":\"12345\",\"resource_type\":\"user\"}", description = "*Conditional.* This property is only present when the **field's** `action` is `added` _and_ the `added_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("added_value")
  public JsonNullable<Object> getAddedValue() {
    return addedValue;
  }

  public void setAddedValue(JsonNullable<Object> addedValue) {
    this.addedValue = addedValue;
  }

  public EventResponseChange field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The name of the field that has changed in the resource.
   * @return field
  */
  
  @Schema(name = "field", accessMode = Schema.AccessMode.READ_ONLY, example = "assignee", description = "The name of the field that has changed in the resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public EventResponseChange newValue(Object newValue) {
    this.newValue = JsonNullable.of(newValue);
    return this;
  }

  /**
   * *Conditional.* This property is only present when the **field's** `action` is `changed` _and_ the `new_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.
   * @return newValue
  */
  
  @Schema(name = "new_value", example = "{\"gid\":\"12345\",\"resource_type\":\"user\"}", description = "*Conditional.* This property is only present when the **field's** `action` is `changed` _and_ the `new_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("new_value")
  public JsonNullable<Object> getNewValue() {
    return newValue;
  }

  public void setNewValue(JsonNullable<Object> newValue) {
    this.newValue = newValue;
  }

  public EventResponseChange removedValue(Object removedValue) {
    this.removedValue = JsonNullable.of(removedValue);
    return this;
  }

  /**
   * *Conditional.* This property is only present when the **field's** `action` is `removed` _and_ the `removed_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.
   * @return removedValue
  */
  
  @Schema(name = "removed_value", example = "{\"gid\":\"12345\",\"resource_type\":\"user\"}", description = "*Conditional.* This property is only present when the **field's** `action` is `removed` _and_ the `removed_value` is an Asana resource. This will be only the `gid` and `resource_type` of the resource when the events come from webhooks; this will be the compact representation (and can have fields expanded with [opt_fields](/docs/input-output-options)) when using the [Events](/docs/asana-events) endpoint.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("removed_value")
  public JsonNullable<Object> getRemovedValue() {
    return removedValue;
  }

  public void setRemovedValue(JsonNullable<Object> removedValue) {
    this.removedValue = removedValue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventResponseChange eventResponseChange = (EventResponseChange) o;
    return Objects.equals(this.action, eventResponseChange.action) &&
        equalsNullable(this.addedValue, eventResponseChange.addedValue) &&
        Objects.equals(this.field, eventResponseChange.field) &&
        equalsNullable(this.newValue, eventResponseChange.newValue) &&
        equalsNullable(this.removedValue, eventResponseChange.removedValue);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, hashCodeNullable(addedValue), field, hashCodeNullable(newValue), hashCodeNullable(removedValue));
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
    sb.append("class EventResponseChange {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    addedValue: ").append(toIndentedString(addedValue)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    removedValue: ").append(toIndentedString(removedValue)).append("\n");
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

