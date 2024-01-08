package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.DeletionTaskStatusType;
import org.openapitools.model.GetServiceLinkedRoleDeletionStatusResponseReason;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetServiceLinkedRoleDeletionStatusResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetServiceLinkedRoleDeletionStatusResponse {

  private DeletionTaskStatusType status;

  private GetServiceLinkedRoleDeletionStatusResponseReason reason;

  public GetServiceLinkedRoleDeletionStatusResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetServiceLinkedRoleDeletionStatusResponse(DeletionTaskStatusType status) {
    this.status = status;
  }

  public GetServiceLinkedRoleDeletionStatusResponse status(DeletionTaskStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public DeletionTaskStatusType getStatus() {
    return status;
  }

  public void setStatus(DeletionTaskStatusType status) {
    this.status = status;
  }

  public GetServiceLinkedRoleDeletionStatusResponse reason(GetServiceLinkedRoleDeletionStatusResponseReason reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  @Valid 
  @Schema(name = "Reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reason")
  public GetServiceLinkedRoleDeletionStatusResponseReason getReason() {
    return reason;
  }

  public void setReason(GetServiceLinkedRoleDeletionStatusResponseReason reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServiceLinkedRoleDeletionStatusResponse getServiceLinkedRoleDeletionStatusResponse = (GetServiceLinkedRoleDeletionStatusResponse) o;
    return Objects.equals(this.status, getServiceLinkedRoleDeletionStatusResponse.status) &&
        Objects.equals(this.reason, getServiceLinkedRoleDeletionStatusResponse.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServiceLinkedRoleDeletionStatusResponse {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

