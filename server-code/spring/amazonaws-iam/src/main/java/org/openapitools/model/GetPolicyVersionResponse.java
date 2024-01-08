package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GetPolicyVersionResponsePolicyVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetPolicyVersion&lt;/a&gt; request. 
 */

@Schema(name = "GetPolicyVersionResponse", description = "Contains the response to a successful <a>GetPolicyVersion</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetPolicyVersionResponse {

  private GetPolicyVersionResponsePolicyVersion policyVersion;

  public GetPolicyVersionResponse policyVersion(GetPolicyVersionResponsePolicyVersion policyVersion) {
    this.policyVersion = policyVersion;
    return this;
  }

  /**
   * Get policyVersion
   * @return policyVersion
  */
  @Valid 
  @Schema(name = "PolicyVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("PolicyVersion")
  public GetPolicyVersionResponsePolicyVersion getPolicyVersion() {
    return policyVersion;
  }

  public void setPolicyVersion(GetPolicyVersionResponsePolicyVersion policyVersion) {
    this.policyVersion = policyVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPolicyVersionResponse getPolicyVersionResponse = (GetPolicyVersionResponse) o;
    return Objects.equals(this.policyVersion, getPolicyVersionResponse.policyVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPolicyVersionResponse {\n");
    sb.append("    policyVersion: ").append(toIndentedString(policyVersion)).append("\n");
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

