package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;The reason that the service-linked role deletion failed.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetServiceLinkedRoleDeletionStatus&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "DeletionTaskFailureReasonType", description = "<p>The reason that the service-linked role deletion failed.</p> <p>This data type is used as a response element in the <a>GetServiceLinkedRoleDeletionStatus</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class DeletionTaskFailureReasonType {

  private String reason;

  private List roleUsageList;

  public DeletionTaskFailureReasonType reason(String reason) {
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

  public DeletionTaskFailureReasonType roleUsageList(List roleUsageList) {
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
    DeletionTaskFailureReasonType deletionTaskFailureReasonType = (DeletionTaskFailureReasonType) o;
    return Objects.equals(this.reason, deletionTaskFailureReasonType.reason) &&
        Objects.equals(this.roleUsageList, deletionTaskFailureReasonType.roleUsageList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, roleUsageList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletionTaskFailureReasonType {\n");
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

