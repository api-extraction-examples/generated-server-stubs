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
 * SetDefaultPolicyVersionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class SetDefaultPolicyVersionRequest {

  private String policyArn;

  private String versionId;

  public SetDefaultPolicyVersionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetDefaultPolicyVersionRequest(String policyArn, String versionId) {
    this.policyArn = policyArn;
    this.versionId = versionId;
  }

  public SetDefaultPolicyVersionRequest policyArn(String policyArn) {
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

  public SetDefaultPolicyVersionRequest versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * Get versionId
   * @return versionId
  */
  @NotNull 
  @Schema(name = "VersionId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("VersionId")
  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest = (SetDefaultPolicyVersionRequest) o;
    return Objects.equals(this.policyArn, setDefaultPolicyVersionRequest.policyArn) &&
        Objects.equals(this.versionId, setDefaultPolicyVersionRequest.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyArn, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDefaultPolicyVersionRequest {\n");
    sb.append("    policyArn: ").append(toIndentedString(policyArn)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

