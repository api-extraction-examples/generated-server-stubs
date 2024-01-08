package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DeprecatedWorkflowScope;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details about a workflow.
 */

@Schema(name = "DeprecatedWorkflow", description = "Details about a workflow.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class DeprecatedWorkflow {

  private Boolean _default;

  private String description;

  private String lastModifiedDate;

  private String lastModifiedUser;

  private String lastModifiedUserAccountId;

  private String name;

  private DeprecatedWorkflowScope scope;

  private Integer steps;

  public DeprecatedWorkflow _default(Boolean _default) {
    this._default = _default;
    return this;
  }

  /**
   * Get _default
   * @return _default
  */
  
  @Schema(name = "default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public DeprecatedWorkflow description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the workflow.
   * @return description
  */
  
  @Schema(name = "description", accessMode = Schema.AccessMode.READ_ONLY, description = "The description of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeprecatedWorkflow lastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * The datetime the workflow was last modified.
   * @return lastModifiedDate
  */
  
  @Schema(name = "lastModifiedDate", accessMode = Schema.AccessMode.READ_ONLY, description = "The datetime the workflow was last modified.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedDate")
  public String getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(String lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public DeprecatedWorkflow lastModifiedUser(String lastModifiedUser) {
    this.lastModifiedUser = lastModifiedUser;
    return this;
  }

  /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return lastModifiedUser
  */
  
  @Schema(name = "lastModifiedUser", accessMode = Schema.AccessMode.READ_ONLY, description = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedUser")
  public String getLastModifiedUser() {
    return lastModifiedUser;
  }

  public void setLastModifiedUser(String lastModifiedUser) {
    this.lastModifiedUser = lastModifiedUser;
  }

  public DeprecatedWorkflow lastModifiedUserAccountId(String lastModifiedUserAccountId) {
    this.lastModifiedUserAccountId = lastModifiedUserAccountId;
    return this;
  }

  /**
   * The account ID of the user that last modified the workflow.
   * @return lastModifiedUserAccountId
  */
  
  @Schema(name = "lastModifiedUserAccountId", accessMode = Schema.AccessMode.READ_ONLY, description = "The account ID of the user that last modified the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lastModifiedUserAccountId")
  public String getLastModifiedUserAccountId() {
    return lastModifiedUserAccountId;
  }

  public void setLastModifiedUserAccountId(String lastModifiedUserAccountId) {
    this.lastModifiedUserAccountId = lastModifiedUserAccountId;
  }

  public DeprecatedWorkflow name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the workflow.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeprecatedWorkflow scope(DeprecatedWorkflowScope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public DeprecatedWorkflowScope getScope() {
    return scope;
  }

  public void setScope(DeprecatedWorkflowScope scope) {
    this.scope = scope;
  }

  public DeprecatedWorkflow steps(Integer steps) {
    this.steps = steps;
    return this;
  }

  /**
   * The number of steps included in the workflow.
   * @return steps
  */
  
  @Schema(name = "steps", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of steps included in the workflow.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("steps")
  public Integer getSteps() {
    return steps;
  }

  public void setSteps(Integer steps) {
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
    DeprecatedWorkflow deprecatedWorkflow = (DeprecatedWorkflow) o;
    return Objects.equals(this._default, deprecatedWorkflow._default) &&
        Objects.equals(this.description, deprecatedWorkflow.description) &&
        Objects.equals(this.lastModifiedDate, deprecatedWorkflow.lastModifiedDate) &&
        Objects.equals(this.lastModifiedUser, deprecatedWorkflow.lastModifiedUser) &&
        Objects.equals(this.lastModifiedUserAccountId, deprecatedWorkflow.lastModifiedUserAccountId) &&
        Objects.equals(this.name, deprecatedWorkflow.name) &&
        Objects.equals(this.scope, deprecatedWorkflow.scope) &&
        Objects.equals(this.steps, deprecatedWorkflow.steps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, description, lastModifiedDate, lastModifiedUser, lastModifiedUserAccountId, name, scope, steps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeprecatedWorkflow {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastModifiedUser: ").append(toIndentedString(lastModifiedUser)).append("\n");
    sb.append("    lastModifiedUserAccountId: ").append(toIndentedString(lastModifiedUserAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

