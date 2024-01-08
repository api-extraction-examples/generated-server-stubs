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
 * UntagPolicyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UntagPolicyRequest {

  private String policyArn;

  private List tagKeys;

  public UntagPolicyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UntagPolicyRequest(String policyArn, List tagKeys) {
    this.policyArn = policyArn;
    this.tagKeys = tagKeys;
  }

  public UntagPolicyRequest policyArn(String policyArn) {
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

  public UntagPolicyRequest tagKeys(List tagKeys) {
    this.tagKeys = tagKeys;
    return this;
  }

  /**
   * Get tagKeys
   * @return tagKeys
  */
  @NotNull @Valid 
  @Schema(name = "TagKeys", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TagKeys")
  public List getTagKeys() {
    return tagKeys;
  }

  public void setTagKeys(List tagKeys) {
    this.tagKeys = tagKeys;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UntagPolicyRequest untagPolicyRequest = (UntagPolicyRequest) o;
    return Objects.equals(this.policyArn, untagPolicyRequest.policyArn) &&
        Objects.equals(this.tagKeys, untagPolicyRequest.tagKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyArn, tagKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UntagPolicyRequest {\n");
    sb.append("    policyArn: ").append(toIndentedString(policyArn)).append("\n");
    sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
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

