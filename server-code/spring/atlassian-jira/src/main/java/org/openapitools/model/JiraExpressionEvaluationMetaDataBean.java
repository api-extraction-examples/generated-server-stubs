package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.IssuesMetaBean;
import org.openapitools.model.JiraExpressionsComplexityBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JiraExpressionEvaluationMetaDataBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionEvaluationMetaDataBean {

  private JiraExpressionsComplexityBean complexity;

  private IssuesMetaBean issues;

  public JiraExpressionEvaluationMetaDataBean complexity(JiraExpressionsComplexityBean complexity) {
    this.complexity = complexity;
    return this;
  }

  /**
   * Get complexity
   * @return complexity
  */
  @Valid 
  @Schema(name = "complexity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("complexity")
  public JiraExpressionsComplexityBean getComplexity() {
    return complexity;
  }

  public void setComplexity(JiraExpressionsComplexityBean complexity) {
    this.complexity = complexity;
  }

  public JiraExpressionEvaluationMetaDataBean issues(IssuesMetaBean issues) {
    this.issues = issues;
    return this;
  }

  /**
   * Get issues
   * @return issues
  */
  @Valid 
  @Schema(name = "issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issues")
  public IssuesMetaBean getIssues() {
    return issues;
  }

  public void setIssues(IssuesMetaBean issues) {
    this.issues = issues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvaluationMetaDataBean jiraExpressionEvaluationMetaDataBean = (JiraExpressionEvaluationMetaDataBean) o;
    return Objects.equals(this.complexity, jiraExpressionEvaluationMetaDataBean.complexity) &&
        Objects.equals(this.issues, jiraExpressionEvaluationMetaDataBean.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(complexity, issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvaluationMetaDataBean {\n");
    sb.append("    complexity: ").append(toIndentedString(complexity)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
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

