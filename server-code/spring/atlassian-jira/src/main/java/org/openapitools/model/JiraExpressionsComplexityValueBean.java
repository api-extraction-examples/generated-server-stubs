package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JiraExpressionsComplexityValueBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JiraExpressionsComplexityValueBean {

  private Integer limit;

  private Integer value;

  public JiraExpressionsComplexityValueBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JiraExpressionsComplexityValueBean(Integer limit, Integer value) {
    this.limit = limit;
    this.value = value;
  }

  public JiraExpressionsComplexityValueBean limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The maximum allowed complexity. The evaluation will fail if this value is exceeded.
   * @return limit
  */
  @NotNull 
  @Schema(name = "limit", description = "The maximum allowed complexity. The evaluation will fail if this value is exceeded.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("limit")
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public JiraExpressionsComplexityValueBean value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * The complexity value of the current expression.
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "The complexity value of the current expression.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
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
    JiraExpressionsComplexityValueBean jiraExpressionsComplexityValueBean = (JiraExpressionsComplexityValueBean) o;
    return Objects.equals(this.limit, jiraExpressionsComplexityValueBean.limit) &&
        Objects.equals(this.value, jiraExpressionsComplexityValueBean.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limit, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionsComplexityValueBean {\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

