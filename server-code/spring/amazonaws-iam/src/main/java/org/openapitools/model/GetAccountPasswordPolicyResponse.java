package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GetAccountPasswordPolicyResponsePasswordPolicy;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetAccountPasswordPolicy&lt;/a&gt; request. 
 */

@Schema(name = "GetAccountPasswordPolicyResponse", description = "Contains the response to a successful <a>GetAccountPasswordPolicy</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetAccountPasswordPolicyResponse {

  private GetAccountPasswordPolicyResponsePasswordPolicy passwordPolicy;

  public GetAccountPasswordPolicyResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetAccountPasswordPolicyResponse(GetAccountPasswordPolicyResponsePasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }

  public GetAccountPasswordPolicyResponse passwordPolicy(GetAccountPasswordPolicyResponsePasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
    return this;
  }

  /**
   * Get passwordPolicy
   * @return passwordPolicy
  */
  @NotNull @Valid 
  @Schema(name = "PasswordPolicy", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PasswordPolicy")
  public GetAccountPasswordPolicyResponsePasswordPolicy getPasswordPolicy() {
    return passwordPolicy;
  }

  public void setPasswordPolicy(GetAccountPasswordPolicyResponsePasswordPolicy passwordPolicy) {
    this.passwordPolicy = passwordPolicy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountPasswordPolicyResponse getAccountPasswordPolicyResponse = (GetAccountPasswordPolicyResponse) o;
    return Objects.equals(this.passwordPolicy, getAccountPasswordPolicyResponse.passwordPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passwordPolicy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountPasswordPolicyResponse {\n");
    sb.append("    passwordPolicy: ").append(toIndentedString(passwordPolicy)).append("\n");
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

