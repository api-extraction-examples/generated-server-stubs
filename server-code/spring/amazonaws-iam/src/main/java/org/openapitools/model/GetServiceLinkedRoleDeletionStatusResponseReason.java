package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetServiceLinkedRoleDeletionStatusResponseReason
 */

@JsonTypeName("GetServiceLinkedRoleDeletionStatusResponse_Reason")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetServiceLinkedRoleDeletionStatusResponseReason {

  private String reason;

  private List roleUsageList;

  public GetServiceLinkedRoleDeletionStatusResponseReason reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  
  @Schema(name = "Reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public GetServiceLinkedRoleDeletionStatusResponseReason roleUsageList(List roleUsageList) {
    this.roleUsageList = roleUsageList;
    return this;
  }

  /**
   * Get roleUsageList
   * @return roleUsageList
  */
  @Valid 
  @Schema(name = "RoleUsageList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("RoleUsageList")
  public List getRoleUsageList() {
    return roleUsageList;
  }

  public void setRoleUsageList(List roleUsageList) {
    this.roleUsageList = roleUsageList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServiceLinkedRoleDeletionStatusResponseReason getServiceLinkedRoleDeletionStatusResponseReason = (GetServiceLinkedRoleDeletionStatusResponseReason) o;
    return Objects.equals(this.reason, getServiceLinkedRoleDeletionStatusResponseReason.reason) &&
        Objects.equals(this.roleUsageList, getServiceLinkedRoleDeletionStatusResponseReason.roleUsageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, roleUsageList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServiceLinkedRoleDeletionStatusResponseReason {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    roleUsageList: ").append(toIndentedString(roleUsageList)).append("\n");
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

