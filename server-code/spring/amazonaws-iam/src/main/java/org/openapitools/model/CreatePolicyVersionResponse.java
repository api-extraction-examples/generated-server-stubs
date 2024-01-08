package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CreatePolicyVersionResponsePolicyVersion;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;CreatePolicyVersion&lt;/a&gt; request. 
 */

@Schema(name = "CreatePolicyVersionResponse", description = "Contains the response to a successful <a>CreatePolicyVersion</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreatePolicyVersionResponse {

  private CreatePolicyVersionResponsePolicyVersion policyVersion;

  public CreatePolicyVersionResponse policyVersion(CreatePolicyVersionResponsePolicyVersion policyVersion) {
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
  public CreatePolicyVersionResponsePolicyVersion getPolicyVersion() {
    return policyVersion;
  }

  public void setPolicyVersion(CreatePolicyVersionResponsePolicyVersion policyVersion) {
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
    CreatePolicyVersionResponse createPolicyVersionResponse = (CreatePolicyVersionResponse) o;
    return Objects.equals(this.policyVersion, createPolicyVersionResponse.policyVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePolicyVersionResponse {\n");
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

