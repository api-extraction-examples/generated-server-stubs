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
 * CreatePolicyVersionRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreatePolicyVersionRequest {

  private String policyArn;

  private String policyDocument;

  private Boolean setAsDefault;

  public CreatePolicyVersionRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreatePolicyVersionRequest(String policyArn, String policyDocument) {
    this.policyArn = policyArn;
    this.policyDocument = policyDocument;
  }

  public CreatePolicyVersionRequest policyArn(String policyArn) {
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

  public CreatePolicyVersionRequest policyDocument(String policyDocument) {
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

  public CreatePolicyVersionRequest setAsDefault(Boolean setAsDefault) {
    this.setAsDefault = setAsDefault;
    return this;
  }

  /**
   * Get setAsDefault
   * @return setAsDefault
  */
  
  @Schema(name = "SetAsDefault", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SetAsDefault")
  public Boolean getSetAsDefault() {
    return setAsDefault;
  }

  public void setSetAsDefault(Boolean setAsDefault) {
    this.setAsDefault = setAsDefault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePolicyVersionRequest createPolicyVersionRequest = (CreatePolicyVersionRequest) o;
    return Objects.equals(this.policyArn, createPolicyVersionRequest.policyArn) &&
        Objects.equals(this.policyDocument, createPolicyVersionRequest.policyDocument) &&
        Objects.equals(this.setAsDefault, createPolicyVersionRequest.setAsDefault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyArn, policyDocument, setAsDefault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePolicyVersionRequest {\n");
    sb.append("    policyArn: ").append(toIndentedString(policyArn)).append("\n");
    sb.append("    policyDocument: ").append(toIndentedString(policyDocument)).append("\n");
    sb.append("    setAsDefault: ").append(toIndentedString(setAsDefault)).append("\n");
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

