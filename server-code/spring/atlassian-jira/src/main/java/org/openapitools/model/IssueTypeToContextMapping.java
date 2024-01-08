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
 * Mapping of an issue type to a context.
 */

@Schema(name = "IssueTypeToContextMapping", description = "Mapping of an issue type to a context.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class IssueTypeToContextMapping {

  private String contextId;

  private Boolean isAnyIssueType;

  private String issueTypeId;

  public IssueTypeToContextMapping() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public IssueTypeToContextMapping(String contextId) {
    this.contextId = contextId;
  }

  public IssueTypeToContextMapping contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * The ID of the context.
   * @return contextId
  */
  @NotNull 
  @Schema(name = "contextId", description = "The ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public IssueTypeToContextMapping isAnyIssueType(Boolean isAnyIssueType) {
    this.isAnyIssueType = isAnyIssueType;
    return this;
  }

  /**
   * Whether the context is mapped to any issue type.
   * @return isAnyIssueType
  */
  
  @Schema(name = "isAnyIssueType", description = "Whether the context is mapped to any issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isAnyIssueType")
  public Boolean getIsAnyIssueType() {
    return isAnyIssueType;
  }

  public void setIsAnyIssueType(Boolean isAnyIssueType) {
    this.isAnyIssueType = isAnyIssueType;
  }

  public IssueTypeToContextMapping issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the issue type.
   * @return issueTypeId
  */
  
  @Schema(name = "issueTypeId", description = "The ID of the issue type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("issueTypeId")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueTypeToContextMapping issueTypeToContextMapping = (IssueTypeToContextMapping) o;
    return Objects.equals(this.contextId, issueTypeToContextMapping.contextId) &&
        Objects.equals(this.isAnyIssueType, issueTypeToContextMapping.isAnyIssueType) &&
        Objects.equals(this.issueTypeId, issueTypeToContextMapping.issueTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, isAnyIssueType, issueTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeToContextMapping {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    isAnyIssueType: ").append(toIndentedString(isAnyIssueType)).append("\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
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

