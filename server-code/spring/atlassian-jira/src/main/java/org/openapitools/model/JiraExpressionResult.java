package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.JiraExpressionEvaluationMetaDataBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The result of evaluating a Jira expression.
 */

@Schema(name = "JiraExpressionResult", description = "The result of evaluating a Jira expression.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionResult {

  private JiraExpressionEvaluationMetaDataBean meta;

  private JsonNullable<Object> value = JsonNullable.<Object>undefined();

  public JiraExpressionResult() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionResult(Object value) {
    this.value = JsonNullable.of(value);
  }

  public JiraExpressionResult meta(JiraExpressionEvaluationMetaDataBean meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  */
  @Valid 
  @Schema(name = "meta", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("meta")
  public JiraExpressionEvaluationMetaDataBean getMeta() {
    return meta;
  }

  public void setMeta(JiraExpressionEvaluationMetaDataBean meta) {
    this.meta = meta;
  }

  public JiraExpressionResult value(Object value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that's the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.)
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "The value of the evaluated expression. It may be a primitive JSON value or a Jira REST API object. (Some expressions do not produce any meaningful results—for example, an expression that returns a lambda function—if that's the case a simple string representation is returned. These string representations should not be relied upon and may change without notice.)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public JsonNullable<Object> getValue() {
    return value;
  }

  public void setValue(JsonNullable<Object> value) {
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
    JiraExpressionResult jiraExpressionResult = (JiraExpressionResult) o;
    return Objects.equals(this.meta, jiraExpressionResult.meta) &&
        Objects.equals(this.value, jiraExpressionResult.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meta, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionResult {\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

