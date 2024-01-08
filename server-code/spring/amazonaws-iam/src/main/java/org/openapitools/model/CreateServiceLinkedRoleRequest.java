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
 * CreateServiceLinkedRoleRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateServiceLinkedRoleRequest {

  private String awSServiceName;

  private String description;

  private String customSuffix;

  public CreateServiceLinkedRoleRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateServiceLinkedRoleRequest(String awSServiceName) {
    this.awSServiceName = awSServiceName;
  }

  public CreateServiceLinkedRoleRequest awSServiceName(String awSServiceName) {
    this.awSServiceName = awSServiceName;
    return this;
  }

  /**
   * Get awSServiceName
   * @return awSServiceName
  */
  @NotNull 
  @Schema(name = "AWSServiceName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AWSServiceName")
  public String getAwSServiceName() {
    return awSServiceName;
  }

  public void setAwSServiceName(String awSServiceName) {
    this.awSServiceName = awSServiceName;
  }

  public CreateServiceLinkedRoleRequest description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "Description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateServiceLinkedRoleRequest customSuffix(String customSuffix) {
    this.customSuffix = customSuffix;
    return this;
  }

  /**
   * Get customSuffix
   * @return customSuffix
  */
  
  @Schema(name = "CustomSuffix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CustomSuffix")
  public String getCustomSuffix() {
    return customSuffix;
  }

  public void setCustomSuffix(String customSuffix) {
    this.customSuffix = customSuffix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceLinkedRoleRequest createServiceLinkedRoleRequest = (CreateServiceLinkedRoleRequest) o;
    return Objects.equals(this.awSServiceName, createServiceLinkedRoleRequest.awSServiceName) &&
        Objects.equals(this.description, createServiceLinkedRoleRequest.description) &&
        Objects.equals(this.customSuffix, createServiceLinkedRoleRequest.customSuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awSServiceName, description, customSuffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceLinkedRoleRequest {\n");
    sb.append("    awSServiceName: ").append(toIndentedString(awSServiceName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    customSuffix: ").append(toIndentedString(customSuffix)).append("\n");
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

