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
 * GetContextKeysForPrincipalPolicyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetContextKeysForPrincipalPolicyRequest {

  private String policySourceArn;

  private List policyInputList;

  public GetContextKeysForPrincipalPolicyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetContextKeysForPrincipalPolicyRequest(String policySourceArn) {
    this.policySourceArn = policySourceArn;
  }

  public GetContextKeysForPrincipalPolicyRequest policySourceArn(String policySourceArn) {
    this.policySourceArn = policySourceArn;
    return this;
  }

  /**
   * Get policySourceArn
   * @return policySourceArn
  */
  @NotNull 
  @Schema(name = "PolicySourceArn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicySourceArn")
  public String getPolicySourceArn() {
    return policySourceArn;
  }

  public void setPolicySourceArn(String policySourceArn) {
    this.policySourceArn = policySourceArn;
  }

  public GetContextKeysForPrincipalPolicyRequest policyInputList(List policyInputList) {
    this.policyInputList = policyInputList;
    return this;
  }

  /**
   * Get policyInputList
   * @return policyInputList
  */
  @Valid 
  @Schema(name = "PolicyInputList", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyInputList")
  public List getPolicyInputList() {
    return policyInputList;
  }

  public void setPolicyInputList(List policyInputList) {
    this.policyInputList = policyInputList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest = (GetContextKeysForPrincipalPolicyRequest) o;
    return Objects.equals(this.policySourceArn, getContextKeysForPrincipalPolicyRequest.policySourceArn) &&
        Objects.equals(this.policyInputList, getContextKeysForPrincipalPolicyRequest.policyInputList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policySourceArn, policyInputList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContextKeysForPrincipalPolicyRequest {\n");
    sb.append("    policySourceArn: ").append(toIndentedString(policySourceArn)).append("\n");
    sb.append("    policyInputList: ").append(toIndentedString(policyInputList)).append("\n");
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

