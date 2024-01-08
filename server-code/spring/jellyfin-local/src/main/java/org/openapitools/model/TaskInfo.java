package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TaskResult;
import org.openapitools.model.TaskState;
import org.openapitools.model.TaskTriggerInfo;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Class TaskInfo.
 */

@Schema(name = "TaskInfo", description = "Class TaskInfo.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class TaskInfo {

  private JsonNullable<String> category = JsonNullable.<String>undefined();

  private JsonNullable<Double> currentProgressPercentage = JsonNullable.<Double>undefined();

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> id = JsonNullable.<String>undefined();

  private Boolean isHidden;

  private JsonNullable<String> key = JsonNullable.<String>undefined();

  private TaskResult lastExecutionResult;

  private JsonNullable<String> name = JsonNullable.<String>undefined();

  private TaskState state;

  @Valid
  private JsonNullable<List<@Valid TaskTriggerInfo>> triggers = JsonNullable.<List<@Valid TaskTriggerInfo>>undefined();

  public TaskInfo category(String category) {
    this.category = JsonNullable.of(category);
    return this;
  }

  /**
   * Gets or sets the category.
   * @return category
  */
  
  @Schema(name = "Category", description = "Gets or sets the category.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Category")
  public JsonNullable<String> getCategory() {
    return category;
  }

  public void setCategory(JsonNullable<String> category) {
    this.category = category;
  }

  public TaskInfo currentProgressPercentage(Double currentProgressPercentage) {
    this.currentProgressPercentage = JsonNullable.of(currentProgressPercentage);
    return this;
  }

  /**
   * Gets or sets the progress.
   * @return currentProgressPercentage
  */
  
  @Schema(name = "CurrentProgressPercentage", description = "Gets or sets the progress.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CurrentProgressPercentage")
  public JsonNullable<Double> getCurrentProgressPercentage() {
    return currentProgressPercentage;
  }

  public void setCurrentProgressPercentage(JsonNullable<Double> currentProgressPercentage) {
    this.currentProgressPercentage = currentProgressPercentage;
  }

  public TaskInfo description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * Gets or sets the description.
   * @return description
  */
  
  @Schema(name = "Description", description = "Gets or sets the description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public TaskInfo id(String id) {
    this.id = JsonNullable.of(id);
    return this;
  }

  /**
   * Gets or sets the id.
   * @return id
  */
  
  @Schema(name = "Id", description = "Gets or sets the id.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Id")
  public JsonNullable<String> getId() {
    return id;
  }

  public void setId(JsonNullable<String> id) {
    this.id = id;
  }

  public TaskInfo isHidden(Boolean isHidden) {
    this.isHidden = isHidden;
    return this;
  }

  /**
   * Gets or sets a value indicating whether this instance is hidden.
   * @return isHidden
  */
  
  @Schema(name = "IsHidden", description = "Gets or sets a value indicating whether this instance is hidden.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsHidden")
  public Boolean getIsHidden() {
    return isHidden;
  }

  public void setIsHidden(Boolean isHidden) {
    this.isHidden = isHidden;
  }

  public TaskInfo key(String key) {
    this.key = JsonNullable.of(key);
    return this;
  }

  /**
   * Gets or sets the key.
   * @return key
  */
  
  @Schema(name = "Key", description = "Gets or sets the key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Key")
  public JsonNullable<String> getKey() {
    return key;
  }

  public void setKey(JsonNullable<String> key) {
    this.key = key;
  }

  public TaskInfo lastExecutionResult(TaskResult lastExecutionResult) {
    this.lastExecutionResult = lastExecutionResult;
    return this;
  }

  /**
   * Get lastExecutionResult
   * @return lastExecutionResult
  */
  @Valid 
  @Schema(name = "LastExecutionResult", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("LastExecutionResult")
  public TaskResult getLastExecutionResult() {
    return lastExecutionResult;
  }

  public void setLastExecutionResult(TaskResult lastExecutionResult) {
    this.lastExecutionResult = lastExecutionResult;
  }

  public TaskInfo name(String name) {
    this.name = JsonNullable.of(name);
    return this;
  }

  /**
   * Gets or sets the name.
   * @return name
  */
  
  @Schema(name = "Name", description = "Gets or sets the name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Name")
  public JsonNullable<String> getName() {
    return name;
  }

  public void setName(JsonNullable<String> name) {
    this.name = name;
  }

  public TaskInfo state(TaskState state) {
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
  public TaskState getState() {
    return state;
  }

  public void setState(TaskState state) {
    this.state = state;
  }

  public TaskInfo triggers(List<@Valid TaskTriggerInfo> triggers) {
    this.triggers = JsonNullable.of(triggers);
    return this;
  }

  public TaskInfo addTriggersItem(TaskTriggerInfo triggersItem) {
    if (this.triggers == null || !this.triggers.isPresent()) {
      this.triggers = JsonNullable.of(new ArrayList<>());
    }
    this.triggers.get().add(triggersItem);
    return this;
  }

  /**
   * Gets or sets the triggers.
   * @return triggers
  */
  @Valid 
  @Schema(name = "Triggers", description = "Gets or sets the triggers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Triggers")
  public JsonNullable<List<@Valid TaskTriggerInfo>> getTriggers() {
    return triggers;
  }

  public void setTriggers(JsonNullable<List<@Valid TaskTriggerInfo>> triggers) {
    this.triggers = triggers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskInfo taskInfo = (TaskInfo) o;
    return equalsNullable(this.category, taskInfo.category) &&
        equalsNullable(this.currentProgressPercentage, taskInfo.currentProgressPercentage) &&
        equalsNullable(this.description, taskInfo.description) &&
        equalsNullable(this.id, taskInfo.id) &&
        Objects.equals(this.isHidden, taskInfo.isHidden) &&
        equalsNullable(this.key, taskInfo.key) &&
        Objects.equals(this.lastExecutionResult, taskInfo.lastExecutionResult) &&
        equalsNullable(this.name, taskInfo.name) &&
        Objects.equals(this.state, taskInfo.state) &&
        equalsNullable(this.triggers, taskInfo.triggers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(category), hashCodeNullable(currentProgressPercentage), hashCodeNullable(description), hashCodeNullable(id), isHidden, hashCodeNullable(key), lastExecutionResult, hashCodeNullable(name), state, hashCodeNullable(triggers));
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
    sb.append("class TaskInfo {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    currentProgressPercentage: ").append(toIndentedString(currentProgressPercentage)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isHidden: ").append(toIndentedString(isHidden)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastExecutionResult: ").append(toIndentedString(lastExecutionResult)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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

