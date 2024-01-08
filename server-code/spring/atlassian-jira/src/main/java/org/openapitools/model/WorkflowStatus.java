package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a workflow status.
 */

@Schema(name = "WorkflowStatus", description = "Details of a workflow status.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowStatus {

  private String id;

  private String name;

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  public WorkflowStatus() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowStatus(String id, String name) {
    this.id = id;
    this.name = name;
  }

  public WorkflowStatus id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the issue status.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the issue status.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WorkflowStatus name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the status in the workflow.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the status in the workflow.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkflowStatus properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public WorkflowStatus putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Additional properties that modify the behavior of issues in this status. Supports the properties `jira.issue.editable` and `issueEditable` (deprecated) that indicate whether issues are editable.
   * @return properties
  */
  
  @Schema(name = "properties", description = "Additional properties that modify the behavior of issues in this status. Supports the properties `jira.issue.editable` and `issueEditable` (deprecated) that indicate whether issues are editable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowStatus workflowStatus = (WorkflowStatus) o;
    return Objects.equals(this.id, workflowStatus.id) &&
        Objects.equals(this.name, workflowStatus.name) &&
        Objects.equals(this.properties, workflowStatus.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowStatus {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

