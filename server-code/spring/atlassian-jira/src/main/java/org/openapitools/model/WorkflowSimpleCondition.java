package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A workflow transition rule condition. This object returns &#x60;nodeType&#x60; as &#x60;simple&#x60;.
 */

@Schema(name = "WorkflowSimpleCondition", description = "A workflow transition rule condition. This object returns `nodeType` as `simple`.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowSimpleCondition implements WorkflowCondition {

  private Object _configuration;

  private String nodeType;

  private String type;

  public WorkflowSimpleCondition() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WorkflowSimpleCondition(String nodeType, String type) {
    this.nodeType = nodeType;
    this.type = type;
  }

  public WorkflowSimpleCondition _configuration(Object _configuration) {
    this._configuration = _configuration;
    return this;
  }

  /**
   * EXPERIMENTAL. The configuration of the transition rule.
   * @return _configuration
  */
  
  @Schema(name = "configuration", description = "EXPERIMENTAL. The configuration of the transition rule.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public Object getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Object _configuration) {
    this._configuration = _configuration;
  }

  public WorkflowSimpleCondition nodeType(String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Get nodeType
   * @return nodeType
  */
  @NotNull 
  @Schema(name = "nodeType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("nodeType")
  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public WorkflowSimpleCondition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transition rule.
   * @return type
  */
  @NotNull 
  @Schema(name = "type", description = "The type of the transition rule.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    WorkflowSimpleCondition workflowSimpleCondition = (WorkflowSimpleCondition) o;
    return Objects.equals(this._configuration, workflowSimpleCondition._configuration) &&
        Objects.equals(this.nodeType, workflowSimpleCondition.nodeType) &&
        Objects.equals(this.type, workflowSimpleCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, nodeType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowSimpleCondition {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
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

