package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.FieldsAssignee;
import org.openapitools.model.FieldsIssueType;
import org.openapitools.model.FieldsPriority;
import org.openapitools.model.FieldsStatus;
import org.openapitools.model.FieldsTimetracking;
import org.openapitools.model.IssueTypeDetails;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Key fields from the linked issue.
 */

@Schema(name = "Fields", description = "Key fields from the linked issue.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class Fields {

  private FieldsAssignee assignee;

  private FieldsIssueType issueType;

  private IssueTypeDetails issuetype;

  private FieldsPriority priority;

  private FieldsStatus status;

  private String summary;

  private FieldsTimetracking timetracking;

  public Fields assignee(FieldsAssignee assignee) {
    this.assignee = assignee;
    return this;
  }

  /**
   * Get assignee
   * @return assignee
  */
  @Valid 
  @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assignee")
  public FieldsAssignee getAssignee() {
    return assignee;
  }

  public void setAssignee(FieldsAssignee assignee) {
    this.assignee = assignee;
  }

  public Fields issueType(FieldsIssueType issueType) {
    this.issueType = issueType;
    return this;
  }

  /**
   * Get issueType
   * @return issueType
  */
  @Valid 
  @Schema(name = "issueType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueType")
  public FieldsIssueType getIssueType() {
    return issueType;
  }

  public void setIssueType(FieldsIssueType issueType) {
    this.issueType = issueType;
  }

  public Fields issuetype(IssueTypeDetails issuetype) {
    this.issuetype = issuetype;
    return this;
  }

  /**
   * Get issuetype
   * @return issuetype
  */
  @Valid 
  @Schema(name = "issuetype", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issuetype")
  public IssueTypeDetails getIssuetype() {
    return issuetype;
  }

  public void setIssuetype(IssueTypeDetails issuetype) {
    this.issuetype = issuetype;
  }

  public Fields priority(FieldsPriority priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Get priority
   * @return priority
  */
  @Valid 
  @Schema(name = "priority", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("priority")
  public FieldsPriority getPriority() {
    return priority;
  }

  public void setPriority(FieldsPriority priority) {
    this.priority = priority;
  }

  public Fields status(FieldsStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public FieldsStatus getStatus() {
    return status;
  }

  public void setStatus(FieldsStatus status) {
    this.status = status;
  }

  public Fields summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * The summary description of the linked issue.
   * @return summary
  */
  
  @Schema(name = "summary", accessMode = Schema.AccessMode.READ_ONLY, description = "The summary description of the linked issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public Fields timetracking(FieldsTimetracking timetracking) {
    this.timetracking = timetracking;
    return this;
  }

  /**
   * Get timetracking
   * @return timetracking
  */
  @Valid 
  @Schema(name = "timetracking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timetracking")
  public FieldsTimetracking getTimetracking() {
    return timetracking;
  }

  public void setTimetracking(FieldsTimetracking timetracking) {
    this.timetracking = timetracking;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Fields fields = (Fields) o;
    return Objects.equals(this.assignee, fields.assignee) &&
        Objects.equals(this.issueType, fields.issueType) &&
        Objects.equals(this.issuetype, fields.issuetype) &&
        Objects.equals(this.priority, fields.priority) &&
        Objects.equals(this.status, fields.status) &&
        Objects.equals(this.summary, fields.summary) &&
        Objects.equals(this.timetracking, fields.timetracking);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, issueType, issuetype, priority, status, summary, timetracking);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fields {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    issueType: ").append(toIndentedString(issueType)).append("\n");
    sb.append("    issuetype: ").append(toIndentedString(issuetype)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    timetracking: ").append(toIndentedString(timetracking)).append("\n");
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
