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
 * This container defines a seller&#39;s custom policy identified by policy ID for the selected eBay marketplace. A successful call returns the requested policy information.
 */

@Schema(name = "CustomPolicy", description = "This container defines a seller's custom policy identified by policy ID for the selected eBay marketplace. A successful call returns the requested policy information.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class CustomPolicy {

  private String customPolicyId;

  private String description;

  private String label;

  private String name;

  private String policyType;

  public CustomPolicy customPolicyId(String customPolicyId) {
    this.customPolicyId = customPolicyId;
    return this;
  }

  /**
   * The unique custom policy identifier for a policy.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> This value is automatically assigned by the system when the policy is created.</span>
   * @return customPolicyId
  */
  
  @Schema(name = "customPolicyId", description = "The unique custom policy identifier for a policy.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> This value is automatically assigned by the system when the policy is created.</span>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customPolicyId")
  public String getCustomPolicyId() {
    return customPolicyId;
  }

  public void setCustomPolicyId(String customPolicyId) {
    this.customPolicyId = customPolicyId;
  }

  public CustomPolicy description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Details of the seller's specific policy and terms associated with the policy. Buyers access this information from the View Item page for items to which the policy has been applied.<br/><br/><b>Max length:</b> 15,000
   * @return description
  */
  
  @Schema(name = "description", description = "Details of the seller's specific policy and terms associated with the policy. Buyers access this information from the View Item page for items to which the policy has been applied.<br/><br/><b>Max length:</b> 15,000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomPolicy label(String label) {
    this.label = label;
    return this;
  }

  /**
   * Customer-facing label shown on View Item pages for items to which the policy applies. This seller-defined string is displayed as a system-generated hyperlink pointing to detailed policy information.<br/><br/><b>Max length:</b> 65
   * @return label
  */
  
  @Schema(name = "label", description = "Customer-facing label shown on View Item pages for items to which the policy applies. This seller-defined string is displayed as a system-generated hyperlink pointing to detailed policy information.<br/><br/><b>Max length:</b> 65", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public CustomPolicy name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The seller-defined name for the custom policy. Names must be unique for policies assigned to the same seller, policy type, and eBay marketplace.<br /><span class=\"tablenote\"><strong>Note:</strong> This field is visible only to the seller. </span><br/><br/><b>Max length:</b> 65
   * @return name
  */
  
  @Schema(name = "name", description = "The seller-defined name for the custom policy. Names must be unique for policies assigned to the same seller, policy type, and eBay marketplace.<br /><span class=\"tablenote\"><strong>Note:</strong> This field is visible only to the seller. </span><br/><br/><b>Max length:</b> 65", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomPolicy policyType(String policyType) {
    this.policyType = policyType;
    return this;
  }

  /**
   * Specifies the type of Custom Policy. <br/><br/>Two Custom Policy types are supported: <ul><li>Product Compliance (PRODUCT_COMPLIANCE)</li> <li>Takeback (TAKE_BACK)</li></ul> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:CustomPolicyTypeEnum'>eBay API documentation</a>
   * @return policyType
  */
  
  @Schema(name = "policyType", description = "Specifies the type of Custom Policy. <br/><br/>Two Custom Policy types are supported: <ul><li>Product Compliance (PRODUCT_COMPLIANCE)</li> <li>Takeback (TAKE_BACK)</li></ul> For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:CustomPolicyTypeEnum'>eBay API documentation</a>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("policyType")
  public String getPolicyType() {
    return policyType;
  }

  public void setPolicyType(String policyType) {
    this.policyType = policyType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomPolicy customPolicy = (CustomPolicy) o;
    return Objects.equals(this.customPolicyId, customPolicy.customPolicyId) &&
        Objects.equals(this.description, customPolicy.description) &&
        Objects.equals(this.label, customPolicy.label) &&
        Objects.equals(this.name, customPolicy.name) &&
        Objects.equals(this.policyType, customPolicy.policyType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customPolicyId, description, label, name, policyType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomPolicy {\n");
    sb.append("    customPolicyId: ").append(toIndentedString(customPolicyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
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

