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
 * Details of a context to project association.
 */

@Schema(name = "CustomFieldContextProjectMapping", description = "Details of a context to project association.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextProjectMapping {

  private String contextId;

  private Boolean isGlobalContext;

  private String projectId;

  public CustomFieldContextProjectMapping() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextProjectMapping(String contextId) {
    this.contextId = contextId;
  }

  public CustomFieldContextProjectMapping contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * The ID of the context.
   * @return contextId
  */
  
  @Schema(name = "contextId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public CustomFieldContextProjectMapping isGlobalContext(Boolean isGlobalContext) {
    this.isGlobalContext = isGlobalContext;
    return this;
  }

  /**
   * Whether context is global.
   * @return isGlobalContext
  */
  
  @Schema(name = "isGlobalContext", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether context is global.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isGlobalContext")
  public Boolean getIsGlobalContext() {
    return isGlobalContext;
  }

  public void setIsGlobalContext(Boolean isGlobalContext) {
    this.isGlobalContext = isGlobalContext;
  }

  public CustomFieldContextProjectMapping projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project.
   * @return projectId
  */
  
  @Schema(name = "projectId", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the project.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("projectId")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextProjectMapping customFieldContextProjectMapping = (CustomFieldContextProjectMapping) o;
    return Objects.equals(this.contextId, customFieldContextProjectMapping.contextId) &&
        Objects.equals(this.isGlobalContext, customFieldContextProjectMapping.isGlobalContext) &&
        Objects.equals(this.projectId, customFieldContextProjectMapping.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, isGlobalContext, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextProjectMapping {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    isGlobalContext: ").append(toIndentedString(isGlobalContext)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

