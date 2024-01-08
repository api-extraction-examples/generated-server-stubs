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
 * DetachGroupPolicyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class DetachGroupPolicyRequest {

  private String groupName;

  private String policyArn;

  public DetachGroupPolicyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DetachGroupPolicyRequest(String groupName, String policyArn) {
    this.groupName = groupName;
    this.policyArn = policyArn;
  }

  public DetachGroupPolicyRequest groupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * Get groupName
   * @return groupName
  */
  @NotNull 
  @Schema(name = "GroupName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GroupName")
  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public DetachGroupPolicyRequest policyArn(String policyArn) {
    this.policyArn = policyArn;
    return this;
  }

  /**
   * Get policyArn
   * @return policyArn
  */
  @NotNull 
  @Schema(name = "PolicyArn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicyArn")
  public String getPolicyArn() {
    return policyArn;
  }

  public void setPolicyArn(String policyArn) {
    this.policyArn = policyArn;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetachGroupPolicyRequest detachGroupPolicyRequest = (DetachGroupPolicyRequest) o;
    return Objects.equals(this.groupName, detachGroupPolicyRequest.groupName) &&
        Objects.equals(this.policyArn, detachGroupPolicyRequest.policyArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, policyArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetachGroupPolicyRequest {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    policyArn: ").append(toIndentedString(policyArn)).append("\n");
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

