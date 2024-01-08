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
 * Details about the complexity of the analysed Jira expression.
 */

@Schema(name = "JiraExpressionComplexity", description = "Details about the complexity of the analysed Jira expression.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionComplexity {

  private String expensiveOperations;

  @Valid
  private Map<String, String> variables = new HashMap<>();

  public JiraExpressionComplexity() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionComplexity(String expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
  }

  public JiraExpressionComplexity expensiveOperations(String expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
    return this;
  }

  /**
   * Information that can be used to determine how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) the evaluation of the expression will perform. This information may be a formula or number. For example:   *  `issues.map(i => i.comments)` performs as many expensive operations as there are issues on the issues list. So this parameter returns `N`, where `N` is the size of issue list.  *  `new Issue(10010).comments` gets comments for one issue, so its complexity is `2` (`1` to retrieve issue 10010 from the database plus `1` to get its comments).
   * @return expensiveOperations
  */
  @NotNull 
  @Schema(name = "expensiveOperations", description = "Information that can be used to determine how many [expensive operations](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#expensive-operations) the evaluation of the expression will perform. This information may be a formula or number. For example:   *  `issues.map(i => i.comments)` performs as many expensive operations as there are issues on the issues list. So this parameter returns `N`, where `N` is the size of issue list.  *  `new Issue(10010).comments` gets comments for one issue, so its complexity is `2` (`1` to retrieve issue 10010 from the database plus `1` to get its comments).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expensiveOperations")
  public String getExpensiveOperations() {
    return expensiveOperations;
  }

  public void setExpensiveOperations(String expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
  }

  public JiraExpressionComplexity variables(Map<String, String> variables) {
    this.variables = variables;
    return this;
  }

  public JiraExpressionComplexity putVariablesItem(String key, String variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

  /**
   * Variables used in the formula, mapped to the parts of the expression they refer to.
   * @return variables
  */
  
  @Schema(name = "variables", description = "Variables used in the formula, mapped to the parts of the expression they refer to.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("variables")
  public Map<String, String> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, String> variables) {
    this.variables = variables;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionComplexity jiraExpressionComplexity = (JiraExpressionComplexity) o;
    return Objects.equals(this.expensiveOperations, jiraExpressionComplexity.expensiveOperations) &&
        Objects.equals(this.variables, jiraExpressionComplexity.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expensiveOperations, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionComplexity {\n");
    sb.append("    expensiveOperations: ").append(toIndentedString(expensiveOperations)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

