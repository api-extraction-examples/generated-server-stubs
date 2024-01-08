package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of Jira expressions for analysis.
 */

@Schema(name = "JiraExpressionForAnalysis", description = "Details of Jira expressions for analysis.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionForAnalysis {

  @Valid
  private Map<String, String> contextVariables = new HashMap<>();

  @Valid
  private List<String> expressions = new ArrayList<>();

  public JiraExpressionForAnalysis() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionForAnalysis(List<String> expressions) {
    this.expressions = expressions;
  }

  public JiraExpressionForAnalysis contextVariables(Map<String, String> contextVariables) {
    this.contextVariables = contextVariables;
    return this;
  }

  public JiraExpressionForAnalysis putContextVariablesItem(String key, String contextVariablesItem) {
    if (this.contextVariables == null) {
      this.contextVariables = new HashMap<>();
    }
    this.contextVariables.put(key, contextVariablesItem);
    return this;
  }

  /**
   * Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as `issue` or `project`, are available in context and sets their type. Use this property to override the default types or provide details of new variables.
   * @return contextVariables
  */
  
  @Schema(name = "contextVariables", description = "Context variables and their types. The type checker assumes that [common context variables](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#context-variables), such as `issue` or `project`, are available in context and sets their type. Use this property to override the default types or provide details of new variables.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contextVariables")
  public Map<String, String> getContextVariables() {
    return contextVariables;
  }

  public void setContextVariables(Map<String, String> contextVariables) {
    this.contextVariables = contextVariables;
  }

  public JiraExpressionForAnalysis expressions(List<String> expressions) {
    this.expressions = expressions;
    return this;
  }

  public JiraExpressionForAnalysis addExpressionsItem(String expressionsItem) {
    if (this.expressions == null) {
      this.expressions = new ArrayList<>();
    }
    this.expressions.add(expressionsItem);
    return this;
  }

  /**
   * The list of Jira expressions to analyse.
   * @return expressions
  */
  @NotNull 
  @Schema(name = "expressions", example = "issues.map(issue => issue.properties['property_key'])", description = "The list of Jira expressions to analyse.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expressions")
  public List<String> getExpressions() {
    return expressions;
  }

  public void setExpressions(List<String> expressions) {
    this.expressions = expressions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionForAnalysis jiraExpressionForAnalysis = (JiraExpressionForAnalysis) o;
    return Objects.equals(this.contextVariables, jiraExpressionForAnalysis.contextVariables) &&
        Objects.equals(this.expressions, jiraExpressionForAnalysis.expressions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextVariables, expressions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionForAnalysis {\n");
    sb.append("    contextVariables: ").append(toIndentedString(contextVariables)).append("\n");
    sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
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

