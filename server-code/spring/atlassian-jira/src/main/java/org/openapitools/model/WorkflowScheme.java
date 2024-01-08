package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.IssueTypeDetails;
import org.openapitools.model.WorkflowSchemeLastModifiedUser;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a workflow scheme.
 */

@Schema(name = "WorkflowScheme", description = "Details about a workflow scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class WorkflowScheme {

  private String defaultWorkflow;

  private String description;

  private Boolean draft;

  private Long id;

  @Valid
  private Map<String, String> issueTypeMappings = new HashMap<>();

  @Valid
  private Map<String, IssueTypeDetails> issueTypes = new HashMap<>();

  private String lastModified;

  private WorkflowSchemeLastModifiedUser lastModifiedUser;

  private String name;

  private String originalDefaultWorkflow;

  @Valid
  private Map<String, String> originalIssueTypeMappings = new HashMap<>();

  private URI self;

  private Boolean updateDraftIfNeeded;

  public WorkflowScheme defaultWorkflow(String defaultWorkflow) {
    this.defaultWorkflow = defaultWorkflow;
    return this;
  }

  /**
   * The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If `defaultWorkflow` is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.
   * @return defaultWorkflow
  */
  
  @Schema(name = "defaultWorkflow", description = "The name of the default workflow for the workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira. If `defaultWorkflow` is not specified when creating a workflow scheme, it is set to *Jira Workflow (jira)*.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultWorkflow")
  public String getDefaultWorkflow() {
    return defaultWorkflow;
  }

  public void setDefaultWorkflow(String defaultWorkflow) {
    this.defaultWorkflow = defaultWorkflow;
  }

  public WorkflowScheme description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the workflow scheme.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the workflow scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public WorkflowScheme draft(Boolean draft) {
    this.draft = draft;
    return this;
  }

  /**
   * Whether the workflow scheme is a draft or not.
   * @return draft
  */
  
  @Schema(name = "draft", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the workflow scheme is a draft or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("draft")
  public Boolean getDraft() {
    return draft;
  }

  public void setDraft(Boolean draft) {
    this.draft = draft;
  }

  public WorkflowScheme id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the workflow scheme.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the workflow scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WorkflowScheme issueTypeMappings(Map<String, String> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
    return this;
  }

  public WorkflowScheme putIssueTypeMappingsItem(String key, String issueTypeMappingsItem) {
    if (this.issueTypeMappings == null) {
      this.issueTypeMappings = new HashMap<>();
    }
    this.issueTypeMappings.put(key, issueTypeMappingsItem);
    return this;
  }

  /**
   * The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
   * @return issueTypeMappings
  */
  
  @Schema(name = "issueTypeMappings", description = "The issue type to workflow mappings, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeMappings")
  public Map<String, String> getIssueTypeMappings() {
    return issueTypeMappings;
  }

  public void setIssueTypeMappings(Map<String, String> issueTypeMappings) {
    this.issueTypeMappings = issueTypeMappings;
  }

  public WorkflowScheme issueTypes(Map<String, IssueTypeDetails> issueTypes) {
    this.issueTypes = issueTypes;
    return this;
  }

  public WorkflowScheme putIssueTypesItem(String key, IssueTypeDetails issueTypesItem) {
    if (this.issueTypes == null) {
      this.issueTypes = new HashMap<>();
    }
    this.issueTypes.put(key, issueTypesItem);
    return this;
  }

  /**
   * The issue types available in Jira.
   * @return issueTypes
  */
  @Valid 
  @Schema(name = "issueTypes", accessMode = Schema.AccessMode.READ_ONLY, description = "The issue types available in Jira.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypes")
  public Map<String, IssueTypeDetails> getIssueTypes() {
    return issueTypes;
  }

  public void setIssueTypes(Map<String, IssueTypeDetails> issueTypes) {
    this.issueTypes = issueTypes;
  }

  public WorkflowScheme lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

  /**
   * The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.
   * @return lastModified
  */
  
  @Schema(name = "lastModified", accessMode = Schema.AccessMode.READ_ONLY, description = "The date-time that the draft workflow scheme was last modified. A modification is a change to the issue type-project mappings only. This property does not apply to non-draft workflows.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModified")
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public WorkflowScheme lastModifiedUser(WorkflowSchemeLastModifiedUser lastModifiedUser) {
    this.lastModifiedUser = lastModifiedUser;
    return this;
  }

  /**
   * Get lastModifiedUser
   * @return lastModifiedUser
  */
  @Valid 
  @Schema(name = "lastModifiedUser", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedUser")
  public WorkflowSchemeLastModifiedUser getLastModifiedUser() {
    return lastModifiedUser;
  }

  public void setLastModifiedUser(WorkflowSchemeLastModifiedUser lastModifiedUser) {
    this.lastModifiedUser = lastModifiedUser;
  }

  public WorkflowScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the workflow scheme. The name must be unique. The maximum length is 255 characters. Required when creating a workflow scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WorkflowScheme originalDefaultWorkflow(String originalDefaultWorkflow) {
    this.originalDefaultWorkflow = originalDefaultWorkflow;
    return this;
  }

  /**
   * For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.
   * @return originalDefaultWorkflow
  */
  
  @Schema(name = "originalDefaultWorkflow", accessMode = Schema.AccessMode.READ_ONLY, description = "For draft workflow schemes, this property is the name of the default workflow for the original workflow scheme. The default workflow has *All Unassigned Issue Types* assigned to it in Jira.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalDefaultWorkflow")
  public String getOriginalDefaultWorkflow() {
    return originalDefaultWorkflow;
  }

  public void setOriginalDefaultWorkflow(String originalDefaultWorkflow) {
    this.originalDefaultWorkflow = originalDefaultWorkflow;
  }

  public WorkflowScheme originalIssueTypeMappings(Map<String, String> originalIssueTypeMappings) {
    this.originalIssueTypeMappings = originalIssueTypeMappings;
    return this;
  }

  public WorkflowScheme putOriginalIssueTypeMappingsItem(String key, String originalIssueTypeMappingsItem) {
    if (this.originalIssueTypeMappings == null) {
      this.originalIssueTypeMappings = new HashMap<>();
    }
    this.originalIssueTypeMappings.put(key, originalIssueTypeMappingsItem);
    return this;
  }

  /**
   * For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.
   * @return originalIssueTypeMappings
  */
  
  @Schema(name = "originalIssueTypeMappings", accessMode = Schema.AccessMode.READ_ONLY, description = "For draft workflow schemes, this property is the issue type to workflow mappings for the original workflow scheme, where each mapping is an issue type ID and workflow name pair. Note that an issue type can only be mapped to one workflow in a workflow scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("originalIssueTypeMappings")
  public Map<String, String> getOriginalIssueTypeMappings() {
    return originalIssueTypeMappings;
  }

  public void setOriginalIssueTypeMappings(Map<String, String> originalIssueTypeMappings) {
    this.originalIssueTypeMappings = originalIssueTypeMappings;
  }

  public WorkflowScheme self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * Get self
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public WorkflowScheme updateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
    return this;
  }

  /**
   * Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:   *  Update an active workflow scheme with `updateDraftIfNeeded` set to `true`: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.  *  Update an active workflow scheme with `updateDraftIfNeeded` set to `false`: An error is returned, as active workflow schemes cannot be updated.  *  Update an inactive workflow scheme with `updateDraftIfNeeded` set to `true`: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.  Defaults to `false`.
   * @return updateDraftIfNeeded
  */
  
  @Schema(name = "updateDraftIfNeeded", description = "Whether to create or update a draft workflow scheme when updating an active workflow scheme. An active workflow scheme is a workflow scheme that is used by at least one project. The following examples show how this property works:   *  Update an active workflow scheme with `updateDraftIfNeeded` set to `true`: If a draft workflow scheme exists, it is updated. Otherwise, a draft workflow scheme is created.  *  Update an active workflow scheme with `updateDraftIfNeeded` set to `false`: An error is returned, as active workflow schemes cannot be updated.  *  Update an inactive workflow scheme with `updateDraftIfNeeded` set to `true`: The workflow scheme is updated, as inactive workflow schemes do not require drafts to update.  Defaults to `false`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateDraftIfNeeded")
  public Boolean getUpdateDraftIfNeeded() {
    return updateDraftIfNeeded;
  }

  public void setUpdateDraftIfNeeded(Boolean updateDraftIfNeeded) {
    this.updateDraftIfNeeded = updateDraftIfNeeded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowScheme workflowScheme = (WorkflowScheme) o;
    return Objects.equals(this.defaultWorkflow, workflowScheme.defaultWorkflow) &&
        Objects.equals(this.description, workflowScheme.description) &&
        Objects.equals(this.draft, workflowScheme.draft) &&
        Objects.equals(this.id, workflowScheme.id) &&
        Objects.equals(this.issueTypeMappings, workflowScheme.issueTypeMappings) &&
        Objects.equals(this.issueTypes, workflowScheme.issueTypes) &&
        Objects.equals(this.lastModified, workflowScheme.lastModified) &&
        Objects.equals(this.lastModifiedUser, workflowScheme.lastModifiedUser) &&
        Objects.equals(this.name, workflowScheme.name) &&
        Objects.equals(this.originalDefaultWorkflow, workflowScheme.originalDefaultWorkflow) &&
        Objects.equals(this.originalIssueTypeMappings, workflowScheme.originalIssueTypeMappings) &&
        Objects.equals(this.self, workflowScheme.self) &&
        Objects.equals(this.updateDraftIfNeeded, workflowScheme.updateDraftIfNeeded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWorkflow, description, draft, id, issueTypeMappings, issueTypes, lastModified, lastModifiedUser, name, originalDefaultWorkflow, originalIssueTypeMappings, self, updateDraftIfNeeded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowScheme {\n");
    sb.append("    defaultWorkflow: ").append(toIndentedString(defaultWorkflow)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    draft: ").append(toIndentedString(draft)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issueTypeMappings: ").append(toIndentedString(issueTypeMappings)).append("\n");
    sb.append("    issueTypes: ").append(toIndentedString(issueTypes)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalDefaultWorkflow: ").append(toIndentedString(originalDefaultWorkflow)).append("\n");
    sb.append("    originalIssueTypeMappings: ").append(toIndentedString(originalIssueTypeMappings)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    updateDraftIfNeeded: ").append(toIndentedString(updateDraftIfNeeded)).append("\n");
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

