package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.JiraExpressionsComplexityValueBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JiraExpressionsComplexityBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionsComplexityBean {

  private JiraExpressionsComplexityValueBean beans;

  private JiraExpressionsComplexityValueBean expensiveOperations;

  private JiraExpressionsComplexityValueBean primitiveValues;

  private JiraExpressionsComplexityValueBean steps;

  public JiraExpressionsComplexityBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionsComplexityBean(JiraExpressionsComplexityValueBean beans, JiraExpressionsComplexityValueBean expensiveOperations, JiraExpressionsComplexityValueBean primitiveValues, JiraExpressionsComplexityValueBean steps) {
    this.beans = beans;
    this.expensiveOperations = expensiveOperations;
    this.primitiveValues = primitiveValues;
    this.steps = steps;
  }

  public JiraExpressionsComplexityBean beans(JiraExpressionsComplexityValueBean beans) {
    this.beans = beans;
    return this;
  }

  /**
   * Get beans
   * @return beans
  */
  @NotNull @Valid 
  @Schema(name = "beans", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("beans")
  public JiraExpressionsComplexityValueBean getBeans() {
    return beans;
  }

  public void setBeans(JiraExpressionsComplexityValueBean beans) {
    this.beans = beans;
  }

  public JiraExpressionsComplexityBean expensiveOperations(JiraExpressionsComplexityValueBean expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
    return this;
  }

  /**
   * Get expensiveOperations
   * @return expensiveOperations
  */
  @NotNull @Valid 
  @Schema(name = "expensiveOperations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("expensiveOperations")
  public JiraExpressionsComplexityValueBean getExpensiveOperations() {
    return expensiveOperations;
  }

  public void setExpensiveOperations(JiraExpressionsComplexityValueBean expensiveOperations) {
    this.expensiveOperations = expensiveOperations;
  }

  public JiraExpressionsComplexityBean primitiveValues(JiraExpressionsComplexityValueBean primitiveValues) {
    this.primitiveValues = primitiveValues;
    return this;
  }

  /**
   * Get primitiveValues
   * @return primitiveValues
  */
  @NotNull @Valid 
  @Schema(name = "primitiveValues", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("primitiveValues")
  public JiraExpressionsComplexityValueBean getPrimitiveValues() {
    return primitiveValues;
  }

  public void setPrimitiveValues(JiraExpressionsComplexityValueBean primitiveValues) {
    this.primitiveValues = primitiveValues;
  }

  public JiraExpressionsComplexityBean steps(JiraExpressionsComplexityValueBean steps) {
    this.steps = steps;
    return this;
  }

  /**
   * Get steps
   * @return steps
  */
  @NotNull @Valid 
  @Schema(name = "steps", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("steps")
  public JiraExpressionsComplexityValueBean getSteps() {
    return steps;
  }

  public void setSteps(JiraExpressionsComplexityValueBean steps) {
    this.steps = steps;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionsComplexityBean jiraExpressionsComplexityBean = (JiraExpressionsComplexityBean) o;
    return Objects.equals(this.beans, jiraExpressionsComplexityBean.beans) &&
        Objects.equals(this.expensiveOperations, jiraExpressionsComplexityBean.expensiveOperations) &&
        Objects.equals(this.primitiveValues, jiraExpressionsComplexityBean.primitiveValues) &&
        Objects.equals(this.steps, jiraExpressionsComplexityBean.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beans, expensiveOperations, primitiveValues, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionsComplexityBean {\n");
    sb.append("    beans: ").append(toIndentedString(beans)).append("\n");
    sb.append("    expensiveOperations: ").append(toIndentedString(expensiveOperations)).append("\n");
    sb.append("    primitiveValues: ").append(toIndentedString(primitiveValues)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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

