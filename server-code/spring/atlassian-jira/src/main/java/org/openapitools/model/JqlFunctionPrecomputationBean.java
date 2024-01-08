package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Jql function precomputation.
 */

@Schema(name = "JqlFunctionPrecomputationBean", description = "Jql function precomputation.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlFunctionPrecomputationBean {

  @Valid
  private List<String> arguments;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  private String field;

  private String functionKey;

  private String functionName;

  private String id;

  private String operator;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updated;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime used;

  private String value;

  public JqlFunctionPrecomputationBean arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public JqlFunctionPrecomputationBean addArgumentsItem(String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Get arguments
   * @return arguments
  */
  
  @Schema(name = "arguments", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("arguments")
  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }

  public JqlFunctionPrecomputationBean created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @Valid 
  @Schema(name = "created", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public JqlFunctionPrecomputationBean field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  
  @Schema(name = "field", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public JqlFunctionPrecomputationBean functionKey(String functionKey) {
    this.functionKey = functionKey;
    return this;
  }

  /**
   * Get functionKey
   * @return functionKey
  */
  
  @Schema(name = "functionKey", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functionKey")
  public String getFunctionKey() {
    return functionKey;
  }

  public void setFunctionKey(String functionKey) {
    this.functionKey = functionKey;
  }

  public JqlFunctionPrecomputationBean functionName(String functionName) {
    this.functionName = functionName;
    return this;
  }

  /**
   * Get functionName
   * @return functionName
  */
  
  @Schema(name = "functionName", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("functionName")
  public String getFunctionName() {
    return functionName;
  }

  public void setFunctionName(String functionName) {
    this.functionName = functionName;
  }

  public JqlFunctionPrecomputationBean id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public JqlFunctionPrecomputationBean operator(String operator) {
    this.operator = operator;
    return this;
  }

  /**
   * Get operator
   * @return operator
  */
  
  @Schema(name = "operator", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operator")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public JqlFunctionPrecomputationBean updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public JqlFunctionPrecomputationBean used(OffsetDateTime used) {
    this.used = used;
    return this;
  }

  /**
   * Get used
   * @return used
  */
  @Valid 
  @Schema(name = "used", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("used")
  public OffsetDateTime getUsed() {
    return used;
  }

  public void setUsed(OffsetDateTime used) {
    this.used = used;
  }

  public JqlFunctionPrecomputationBean value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "value", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlFunctionPrecomputationBean jqlFunctionPrecomputationBean = (JqlFunctionPrecomputationBean) o;
    return Objects.equals(this.arguments, jqlFunctionPrecomputationBean.arguments) &&
        Objects.equals(this.created, jqlFunctionPrecomputationBean.created) &&
        Objects.equals(this.field, jqlFunctionPrecomputationBean.field) &&
        Objects.equals(this.functionKey, jqlFunctionPrecomputationBean.functionKey) &&
        Objects.equals(this.functionName, jqlFunctionPrecomputationBean.functionName) &&
        Objects.equals(this.id, jqlFunctionPrecomputationBean.id) &&
        Objects.equals(this.operator, jqlFunctionPrecomputationBean.operator) &&
        Objects.equals(this.updated, jqlFunctionPrecomputationBean.updated) &&
        Objects.equals(this.used, jqlFunctionPrecomputationBean.used) &&
        Objects.equals(this.value, jqlFunctionPrecomputationBean.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arguments, created, field, functionKey, functionName, id, operator, updated, used, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlFunctionPrecomputationBean {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    functionKey: ").append(toIndentedString(functionKey)).append("\n");
    sb.append("    functionName: ").append(toIndentedString(functionName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

