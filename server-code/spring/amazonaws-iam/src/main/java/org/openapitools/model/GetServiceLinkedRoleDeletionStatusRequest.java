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
 * GetServiceLinkedRoleDeletionStatusRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetServiceLinkedRoleDeletionStatusRequest {

  private String deletionTaskId;

  public GetServiceLinkedRoleDeletionStatusRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetServiceLinkedRoleDeletionStatusRequest(String deletionTaskId) {
    this.deletionTaskId = deletionTaskId;
  }

  public GetServiceLinkedRoleDeletionStatusRequest deletionTaskId(String deletionTaskId) {
    this.deletionTaskId = deletionTaskId;
    return this;
  }

  /**
   * Get deletionTaskId
   * @return deletionTaskId
  */
  @NotNull 
  @Schema(name = "DeletionTaskId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("DeletionTaskId")
  public String getDeletionTaskId() {
    return deletionTaskId;
  }

  public void setDeletionTaskId(String deletionTaskId) {
    this.deletionTaskId = deletionTaskId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServiceLinkedRoleDeletionStatusRequest getServiceLinkedRoleDeletionStatusRequest = (GetServiceLinkedRoleDeletionStatusRequest) o;
    return Objects.equals(this.deletionTaskId, getServiceLinkedRoleDeletionStatusRequest.deletionTaskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletionTaskId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServiceLinkedRoleDeletionStatusRequest {\n");
    sb.append("    deletionTaskId: ").append(toIndentedString(deletionTaskId)).append("\n");
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

