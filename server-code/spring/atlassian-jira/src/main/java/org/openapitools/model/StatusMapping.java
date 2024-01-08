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
 * Details about the mapping from a status to a new status for an issue type.
 */

@Schema(name = "StatusMapping", description = "Details about the mapping from a status to a new status for an issue type.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class StatusMapping {

  private String issueTypeId;

  private String newStatusId;

  private String statusId;

  public StatusMapping() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public StatusMapping(String issueTypeId, String newStatusId, String statusId) {
    this.issueTypeId = issueTypeId;
    this.newStatusId = newStatusId;
    this.statusId = statusId;
  }

  public StatusMapping issueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
    return this;
  }

  /**
   * The ID of the issue type.
   * @return issueTypeId
  */
  @NotNull 
  @Schema(name = "issueTypeId", description = "The ID of the issue type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueTypeId")
  public String getIssueTypeId() {
    return issueTypeId;
  }

  public void setIssueTypeId(String issueTypeId) {
    this.issueTypeId = issueTypeId;
  }

  public StatusMapping newStatusId(String newStatusId) {
    this.newStatusId = newStatusId;
    return this;
  }

  /**
   * The ID of the new status.
   * @return newStatusId
  */
  @NotNull 
  @Schema(name = "newStatusId", description = "The ID of the new status.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("newStatusId")
  public String getNewStatusId() {
    return newStatusId;
  }

  public void setNewStatusId(String newStatusId) {
    this.newStatusId = newStatusId;
  }

  public StatusMapping statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }

  /**
   * The ID of the status.
   * @return statusId
  */
  @NotNull 
  @Schema(name = "statusId", description = "The ID of the status.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("statusId")
  public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusMapping statusMapping = (StatusMapping) o;
    return Objects.equals(this.issueTypeId, statusMapping.issueTypeId) &&
        Objects.equals(this.newStatusId, statusMapping.newStatusId) &&
        Objects.equals(this.statusId, statusMapping.statusId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, newStatusId, statusId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusMapping {\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    newStatusId: ").append(toIndentedString(newStatusId)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
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

