package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomContextVariable;
import org.openapitools.model.IdOrKeyBean;
import org.openapitools.model.JexpIssues;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JiraExpressionEvalContextBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionEvalContextBean {

  private Long board;

  @Valid
  private List<@Valid CustomContextVariable> custom;

  private Long customerRequest;

  private IdOrKeyBean issue;

  private JexpIssues issues;

  private IdOrKeyBean project;

  private Long serviceDesk;

  private Long sprint;

  public JiraExpressionEvalContextBean board(Long board) {
    this.board = board;
    return this;
  }

  /**
   * The ID of the board that is available under the `board` variable when evaluating the expression.
   * @return board
  */
  
  @Schema(name = "board", description = "The ID of the board that is available under the `board` variable when evaluating the expression.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board")
  public Long getBoard() {
    return board;
  }

  public void setBoard(Long board) {
    this.board = board;
  }

  public JiraExpressionEvalContextBean custom(List<@Valid CustomContextVariable> custom) {
    this.custom = custom;
    return this;
  }

  public JiraExpressionEvalContextBean addCustomItem(CustomContextVariable customItem) {
    if (this.custom == null) {
      this.custom = new ArrayList<>();
    }
    this.custom.add(customItem);
    return this;
  }

  /**
   * Custom context variables and their types. These variable types are available for use in a custom context:   *  `user`: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  `issue`: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  `json`: A JSON object containing custom content.  *  `list`: A JSON list of `user`, `issue`, or `json` variable types.
   * @return custom
  */
  @Valid 
  @Schema(name = "custom", description = "Custom context variables and their types. These variable types are available for use in a custom context:   *  `user`: A [user](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#user) specified as an Atlassian account ID.  *  `issue`: An [issue](https://developer.atlassian.com/cloud/jira/platform/jira-expressions-type-reference#issue) specified by ID or key. All the fields of the issue object are available in the Jira expression.  *  `json`: A JSON object containing custom content.  *  `list`: A JSON list of `user`, `issue`, or `json` variable types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom")
  public List<@Valid CustomContextVariable> getCustom() {
    return custom;
  }

  public void setCustom(List<@Valid CustomContextVariable> custom) {
    this.custom = custom;
  }

  public JiraExpressionEvalContextBean customerRequest(Long customerRequest) {
    this.customerRequest = customerRequest;
    return this;
  }

  /**
   * The ID of the customer request that is available under the `customerRequest` variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.
   * @return customerRequest
  */
  
  @Schema(name = "customerRequest", description = "The ID of the customer request that is available under the `customerRequest` variable when evaluating the expression. This is the same as the ID of the underlying Jira issue, but the customer request context variable will have a different type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerRequest")
  public Long getCustomerRequest() {
    return customerRequest;
  }

  public void setCustomerRequest(Long customerRequest) {
    this.customerRequest = customerRequest;
  }

  public JiraExpressionEvalContextBean issue(IdOrKeyBean issue) {
    this.issue = issue;
    return this;
  }

  /**
   * Get issue
   * @return issue
  */
  @Valid 
  @Schema(name = "issue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issue")
  public IdOrKeyBean getIssue() {
    return issue;
  }

  public void setIssue(IdOrKeyBean issue) {
    this.issue = issue;
  }

  public JiraExpressionEvalContextBean issues(JexpIssues issues) {
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
  public JexpIssues getIssues() {
    return issues;
  }

  public void setIssues(JexpIssues issues) {
    this.issues = issues;
  }

  public JiraExpressionEvalContextBean project(IdOrKeyBean project) {
    this.project = project;
    return this;
  }

  /**
   * Get project
   * @return project
  */
  @Valid 
  @Schema(name = "project", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("project")
  public IdOrKeyBean getProject() {
    return project;
  }

  public void setProject(IdOrKeyBean project) {
    this.project = project;
  }

  public JiraExpressionEvalContextBean serviceDesk(Long serviceDesk) {
    this.serviceDesk = serviceDesk;
    return this;
  }

  /**
   * The ID of the service desk that is available under the `serviceDesk` variable when evaluating the expression.
   * @return serviceDesk
  */
  
  @Schema(name = "serviceDesk", description = "The ID of the service desk that is available under the `serviceDesk` variable when evaluating the expression.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceDesk")
  public Long getServiceDesk() {
    return serviceDesk;
  }

  public void setServiceDesk(Long serviceDesk) {
    this.serviceDesk = serviceDesk;
  }

  public JiraExpressionEvalContextBean sprint(Long sprint) {
    this.sprint = sprint;
    return this;
  }

  /**
   * The ID of the sprint that is available under the `sprint` variable when evaluating the expression.
   * @return sprint
  */
  
  @Schema(name = "sprint", description = "The ID of the sprint that is available under the `sprint` variable when evaluating the expression.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sprint")
  public Long getSprint() {
    return sprint;
  }

  public void setSprint(Long sprint) {
    this.sprint = sprint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionEvalContextBean jiraExpressionEvalContextBean = (JiraExpressionEvalContextBean) o;
    return Objects.equals(this.board, jiraExpressionEvalContextBean.board) &&
        Objects.equals(this.custom, jiraExpressionEvalContextBean.custom) &&
        Objects.equals(this.customerRequest, jiraExpressionEvalContextBean.customerRequest) &&
        Objects.equals(this.issue, jiraExpressionEvalContextBean.issue) &&
        Objects.equals(this.issues, jiraExpressionEvalContextBean.issues) &&
        Objects.equals(this.project, jiraExpressionEvalContextBean.project) &&
        Objects.equals(this.serviceDesk, jiraExpressionEvalContextBean.serviceDesk) &&
        Objects.equals(this.sprint, jiraExpressionEvalContextBean.sprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(board, custom, customerRequest, issue, issues, project, serviceDesk, sprint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionEvalContextBean {\n");
    sb.append("    board: ").append(toIndentedString(board)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customerRequest: ").append(toIndentedString(customerRequest)).append("\n");
    sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    serviceDesk: ").append(toIndentedString(serviceDesk)).append("\n");
    sb.append("    sprint: ").append(toIndentedString(sprint)).append("\n");
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

