package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SuggestedIssue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A type of issue suggested for use in auto-completion.
 */

@Schema(name = "IssuePickerSuggestionsIssueType", description = "A type of issue suggested for use in auto-completion.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssuePickerSuggestionsIssueType {

  private String id;

  @Valid
  private List<@Valid SuggestedIssue> issues;

  private String label;

  private String msg;

  private String sub;

  public IssuePickerSuggestionsIssueType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the type of issues suggested for use in auto-completion.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the type of issues suggested for use in auto-completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public IssuePickerSuggestionsIssueType issues(List<@Valid SuggestedIssue> issues) {
    this.issues = issues;
    return this;
  }

  public IssuePickerSuggestionsIssueType addIssuesItem(SuggestedIssue issuesItem) {
    if (this.issues == null) {
      this.issues = new ArrayList<>();
    }
    this.issues.add(issuesItem);
    return this;
  }

  /**
   * A list of issues suggested for use in auto-completion.
   * @return issues
  */
  @Valid 
  @Schema(name = "issues", accessMode = Schema.AccessMode.READ_ONLY, description = "A list of issues suggested for use in auto-completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issues")
  public List<@Valid SuggestedIssue> getIssues() {
    return issues;
  }

  public void setIssues(List<@Valid SuggestedIssue> issues) {
    this.issues = issues;
  }

  public IssuePickerSuggestionsIssueType label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The label of the type of issues suggested for use in auto-completion.
   * @return label
  */
  
  @Schema(name = "label", accessMode = Schema.AccessMode.READ_ONLY, description = "The label of the type of issues suggested for use in auto-completion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public IssuePickerSuggestionsIssueType msg(String msg) {
    this.msg = msg;
    return this;
  }

  /**
   * If no issue suggestions are found, returns a message indicating no suggestions were found,
   * @return msg
  */
  
  @Schema(name = "msg", accessMode = Schema.AccessMode.READ_ONLY, description = "If no issue suggestions are found, returns a message indicating no suggestions were found,", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("msg")
  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }

  public IssuePickerSuggestionsIssueType sub(String sub) {
    this.sub = sub;
    return this;
  }

  /**
   * If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.
   * @return sub
  */
  
  @Schema(name = "sub", accessMode = Schema.AccessMode.READ_ONLY, description = "If issue suggestions are found, returns a message indicating the number of issues suggestions found and returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sub")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssuePickerSuggestionsIssueType issuePickerSuggestionsIssueType = (IssuePickerSuggestionsIssueType) o;
    return Objects.equals(this.id, issuePickerSuggestionsIssueType.id) &&
        Objects.equals(this.issues, issuePickerSuggestionsIssueType.issues) &&
        Objects.equals(this.label, issuePickerSuggestionsIssueType.label) &&
        Objects.equals(this.msg, issuePickerSuggestionsIssueType.msg) &&
        Objects.equals(this.sub, issuePickerSuggestionsIssueType.sub);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, issues, label, msg, sub);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuePickerSuggestionsIssueType {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
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

