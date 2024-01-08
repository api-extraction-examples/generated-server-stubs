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
 * CustomPolicyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:38.845776-04:00[America/Lower_Princes]")
public class CustomPolicyRequest {

  private String description;

  private String label;

  private String name;

  public CustomPolicyRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Details of the seller's specific policy and terms for this policy.<br/><br/><b>Max length:</b> 15,000
   * @return description
  */
  
  @Schema(name = "description", description = "Details of the seller's specific policy and terms for this policy.<br/><br/><b>Max length:</b> 15,000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CustomPolicyRequest label(String label) {
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

  public CustomPolicyRequest name(String name) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomPolicyRequest customPolicyRequest = (CustomPolicyRequest) o;
    return Objects.equals(this.description, customPolicyRequest.description) &&
        Objects.equals(this.label, customPolicyRequest.label) &&
        Objects.equals(this.name, customPolicyRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, label, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomPolicyRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

