package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.JexpJqlIssues;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The JQL specifying the issues available in the evaluated Jira expression under the &#x60;issues&#x60; context variable.
 */

@Schema(name = "JexpIssues", description = "The JQL specifying the issues available in the evaluated Jira expression under the `issues` context variable.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JexpIssues {

  private JexpJqlIssues jql;

  public JexpIssues jql(JexpJqlIssues jql) {
    this.jql = jql;
    return this;
  }

  /**
   * Get jql
   * @return jql
  */
  @Valid 
  @Schema(name = "jql", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("jql")
  public JexpJqlIssues getJql() {
    return jql;
  }

  public void setJql(JexpJqlIssues jql) {
    this.jql = jql;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JexpIssues jexpIssues = (JexpIssues) o;
    return Objects.equals(this.jql, jexpIssues.jql);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jql);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JexpIssues {\n");
    sb.append("    jql: ").append(toIndentedString(jql)).append("\n");
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

