package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkOperationErrorResult;
import org.openapitools.model.CreatedIssue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about the issues created and the errors for requests that failed.
 */

@Schema(name = "CreatedIssues", description = "Details about the issues created and the errors for requests that failed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CreatedIssues {

  @Valid
  private List<@Valid BulkOperationErrorResult> errors;

  @Valid
  private List<@Valid CreatedIssue> issues;

  public CreatedIssues errors(List<@Valid BulkOperationErrorResult> errors) {
    this.errors = errors;
    return this;
  }

  public CreatedIssues addErrorsItem(BulkOperationErrorResult errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Error details for failed issue creation requests.
   * @return errors
  */
  @Valid 
  @Schema(name = "errors", accessMode = Schema.AccessMode.READ_ONLY, description = "Error details for failed issue creation requests.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public List<@Valid BulkOperationErrorResult> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid BulkOperationErrorResult> errors) {
    this.errors = errors;
  }

  public CreatedIssues issues(List<@Valid CreatedIssue> issues) {
    this.issues = issues;
    return this;
  }

  public CreatedIssues addIssuesItem(CreatedIssue issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * Details of the issues created.
   * @return issues
  */
  @Valid 
  @Schema(name = "issues", accessMode = Schema.AccessMode.READ_ONLY, description = "Details of the issues created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issues")
  public List<@Valid CreatedIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<@Valid CreatedIssue> issues) {
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
    CreatedIssues createdIssues = (CreatedIssues) o;
    return Objects.equals(this.errors, createdIssues.errors) &&
        Objects.equals(this.issues, createdIssues.issues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, issues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedIssues {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

