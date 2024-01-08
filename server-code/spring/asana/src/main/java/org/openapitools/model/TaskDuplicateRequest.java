package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * TaskDuplicateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class TaskDuplicateRequest {

  /**
   * The fields that will be duplicated to the new task.
   */
  public enum IncludeEnum {
    NOTES("notes"),
    
    ASSIGNEE("assignee"),
    
    SUBTASKS("subtasks"),
    
    ATTACHMENTS("attachments"),
    
    TAGS("tags"),
    
    FOLLOWERS("followers"),
    
    PROJECTS("projects"),
    
    DATES("dates"),
    
    DEPENDENCIES("dependencies"),
    
    PARENT("parent");

    private String value;

    IncludeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IncludeEnum fromValue(String value) {
      for (IncludeEnum b : IncludeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IncludeEnum include;

  private String name;

  public TaskDuplicateRequest include(IncludeEnum include) {
    this.include = include;
    return this;
  }

  /**
   * The fields that will be duplicated to the new task.
   * @return include
  */
  
  @Schema(name = "include", example = "[\"notes\",\"assignee\"]", description = "The fields that will be duplicated to the new task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("include")
  public IncludeEnum getInclude() {
    return include;
  }

  public void setInclude(IncludeEnum include) {
    this.include = include;
  }

  public TaskDuplicateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the new task.
   * @return name
  */
  
  @Schema(name = "name", example = "New Task Name", description = "The name of the new task.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDuplicateRequest taskDuplicateRequest = (TaskDuplicateRequest) o;
    return Objects.equals(this.include, taskDuplicateRequest.include) &&
        Objects.equals(this.name, taskDuplicateRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(include, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDuplicateRequest {\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

