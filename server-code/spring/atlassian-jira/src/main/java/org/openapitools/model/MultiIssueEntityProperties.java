package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.IssueEntityPropertiesForMultiUpdate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of issues and their respective properties to set or update. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.
 */

@Schema(name = "MultiIssueEntityProperties", description = "A list of issues and their respective properties to set or update. See [Entity properties](https://developer.atlassian.com/cloud/jira/platform/jira-entity-properties/) for more information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class MultiIssueEntityProperties {

  @Valid
  private List<@Valid IssueEntityPropertiesForMultiUpdate> issues;

  public MultiIssueEntityProperties issues(List<@Valid IssueEntityPropertiesForMultiUpdate> issues) {
    this.issues = issues;
    return this;
  }

  public MultiIssueEntityProperties addIssuesItem(IssueEntityPropertiesForMultiUpdate issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * A list of issue IDs and their respective properties.
   * @return issues
  */
  @Valid 
  @Schema(name = "issues", description = "A list of issue IDs and their respective properties.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issues")
  public List<@Valid IssueEntityPropertiesForMultiUpdate> getIssues() {
    return issues;
  }

  public void setIssues(List<@Valid IssueEntityPropertiesForMultiUpdate> issues) {
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
    MultiIssueEntityProperties multiIssueEntityProperties = (MultiIssueEntityProperties) o;
    return Objects.equals(this.issues, multiIssueEntityProperties.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiIssueEntityProperties {\n");
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

