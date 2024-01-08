package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.JiraExpressionEvalContextBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JiraExpressionEvalRequestBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionEvalRequestBean {

  private JiraExpressionEvalContextBean context;

  private String expression;

  public JiraExpressionEvalRequestBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionEvalRequestBean(String expression) {
    this.expression = expression;
  }

  public JiraExpressionEvalRequestBean context(JiraExpressionEvalContextBean context) {
    this.context = context;
    return this;
  }

  /**
   * Get context
   * @return context
  */
  @Valid 
  @Schema(name = "context", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context")
  public JiraExpressionEvalContextBean getContext() {
    return context;
  }

  public void setContext(JiraExpressionEvalContextBean context) {
    this.context = context;
  }

  public JiraExpressionEvalRequestBean expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The Jira expression to evaluate.
   * @return expression
  */
  @NotNull 
  @Schema(name = "expression", example = "{ key: issue.key, type: issue.issueType.name, links: issue.links.map(link => link.linkedIssue.id) }", description = "The Jira expression to evaluate.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalRequestBean jiraExpressionEvalRequestBean = (JiraExpressionEvalRequestBean) o;
    return Objects.equals(this.context, jiraExpressionEvalRequestBean.context) &&
        Objects.equals(this.expression, jiraExpressionEvalRequestBean.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalRequestBean {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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

