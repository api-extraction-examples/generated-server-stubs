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
 * Contains the response to a successful &lt;a&gt;GetUserPolicy&lt;/a&gt; request. 
 */

@Schema(name = "GetUserPolicyResponse", description = "Contains the response to a successful <a>GetUserPolicy</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetUserPolicyResponse {

  private String userName;

  private String policyName;

  private String policyDocument;

  public GetUserPolicyResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetUserPolicyResponse(String userName, String policyName, String policyDocument) {
    this.userName = userName;
    this.policyName = policyName;
    this.policyDocument = policyDocument;
  }

  public GetUserPolicyResponse userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @NotNull 
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public GetUserPolicyResponse policyName(String policyName) {
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

  public GetUserPolicyResponse policyDocument(String policyDocument) {
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
    GetUserPolicyResponse getUserPolicyResponse = (GetUserPolicyResponse) o;
    return Objects.equals(this.userName, getUserPolicyResponse.userName) &&
        Objects.equals(this.policyName, getUserPolicyResponse.policyName) &&
        Objects.equals(this.policyDocument, getUserPolicyResponse.policyDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, policyName, policyDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserPolicyResponse {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

