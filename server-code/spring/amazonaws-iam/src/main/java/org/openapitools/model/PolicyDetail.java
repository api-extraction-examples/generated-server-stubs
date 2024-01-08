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
 * &lt;p&gt;Contains information about an IAM policy, including the policy document.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetAccountAuthorizationDetails&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "PolicyDetail", description = "<p>Contains information about an IAM policy, including the policy document.</p> <p>This data type is used as a response element in the <a>GetAccountAuthorizationDetails</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class PolicyDetail {

  private String policyName;

  private String policyDocument;

  public PolicyDetail policyName(String policyName) {
    this.policyName = policyName;
    return this;
  }

  /**
   * Get policyName
   * @return policyName
  */
  
  @Schema(name = "PolicyName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyName")
  public String getPolicyName() {
    return policyName;
  }

  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }

  public PolicyDetail policyDocument(String policyDocument) {
    this.policyDocument = policyDocument;
    return this;
  }

  /**
   * Get policyDocument
   * @return policyDocument
  */
  
  @Schema(name = "PolicyDocument", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    PolicyDetail policyDetail = (PolicyDetail) o;
    return Objects.equals(this.policyName, policyDetail.policyName) &&
        Objects.equals(this.policyDocument, policyDetail.policyDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, policyDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyDetail {\n");
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

