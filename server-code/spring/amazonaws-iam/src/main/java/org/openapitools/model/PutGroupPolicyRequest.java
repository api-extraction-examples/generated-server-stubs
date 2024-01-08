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
 * PutGroupPolicyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class PutGroupPolicyRequest {

  private String groupName;

  private String policyName;

  private String policyDocument;

  public PutGroupPolicyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PutGroupPolicyRequest(String groupName, String policyName, String policyDocument) {
    this.groupName = groupName;
    this.policyName = policyName;
    this.policyDocument = policyDocument;
  }

  public PutGroupPolicyRequest groupName(String groupName) {
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

  public PutGroupPolicyRequest policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Get policyName
   * @return policyName
  */
  @NotNull 
  @Schema(name = "PolicyName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicyName")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public PutGroupPolicyRequest policyDocument(String policyDocument) {
    this.policyDocument = policyDocument;
    return this;
  }

  /**
   * Get policyDocument
   * @return policyDocument
  */
  @NotNull 
  @Schema(name = "PolicyDocument", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicyDocument")
  public String getPolicyDocument() {
    return policyDocument;
  }

  public void setPolicyDocument(String policyDocument) {
    this.policyDocument = policyDocument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PutGroupPolicyRequest putGroupPolicyRequest = (PutGroupPolicyRequest) o;
    return Objects.equals(this.groupName, putGroupPolicyRequest.groupName) &&
        Objects.equals(this.policyName, putGroupPolicyRequest.policyName) &&
        Objects.equals(this.policyDocument, putGroupPolicyRequest.policyDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, policyName, policyDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PutGroupPolicyRequest {\n");
    sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    policyDocument: ").append(toIndentedString(policyDocument)).append("\n");
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

