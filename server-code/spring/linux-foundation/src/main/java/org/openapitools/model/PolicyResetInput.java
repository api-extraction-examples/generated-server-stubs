package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Expensify policy reset information
 */

@Schema(name = "policy-reset-input", description = "Expensify policy reset information")
@JsonTypeName("policy-reset-input")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:46.390673-04:00[America/Lower_Princes]")
public class PolicyResetInput {

  private String policyID;

  private String templatePolicyID;

  public PolicyResetInput() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PolicyResetInput(String policyID) {
    this.policyID = policyID;
  }

  public PolicyResetInput policyID(String policyID) {
    this.policyID = policyID;
    return this;
  }

  /**
   * Unique ID of the policy to reset
   * @return policyID
  */
  @NotNull 
  @Schema(name = "PolicyID", example = "F11B6C1D67DC6A3D", description = "Unique ID of the policy to reset", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PolicyID")
  public String getPolicyID() {
    return policyID;
  }

  public void setPolicyID(String policyID) {
    this.policyID = policyID;
  }

  public PolicyResetInput templatePolicyID(String templatePolicyID) {
    this.templatePolicyID = templatePolicyID;
    return this;
  }

  /**
   * Unique ID of the template policy to copy from
   * @return templatePolicyID
  */
  
  @Schema(name = "TemplatePolicyID", example = "F11B6C1D67DC6A3D", description = "Unique ID of the template policy to copy from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("TemplatePolicyID")
  public String getTemplatePolicyID() {
    return templatePolicyID;
  }

  public void setTemplatePolicyID(String templatePolicyID) {
    this.templatePolicyID = templatePolicyID;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyResetInput policyResetInput = (PolicyResetInput) o;
    return Objects.equals(this.policyID, policyResetInput.policyID) &&
        Objects.equals(this.templatePolicyID, policyResetInput.templatePolicyID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyID, templatePolicyID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyResetInput {\n");
    sb.append("    policyID: ").append(toIndentedString(policyID)).append("\n");
    sb.append("    templatePolicyID: ").append(toIndentedString(templatePolicyID)).append("\n");
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

