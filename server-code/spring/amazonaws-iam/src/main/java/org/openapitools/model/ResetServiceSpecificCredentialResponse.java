package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ResetServiceSpecificCredentialResponseServiceSpecificCredential;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ResetServiceSpecificCredentialResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ResetServiceSpecificCredentialResponse {

  private ResetServiceSpecificCredentialResponseServiceSpecificCredential serviceSpecificCredential;

  public ResetServiceSpecificCredentialResponse serviceSpecificCredential(ResetServiceSpecificCredentialResponseServiceSpecificCredential serviceSpecificCredential) {
    this.serviceSpecificCredential = serviceSpecificCredential;
    return this;
  }

  /**
   * Get serviceSpecificCredential
   * @return serviceSpecificCredential
  */
  @Valid 
  @Schema(name = "ServiceSpecificCredential", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServiceSpecificCredential")
  public ResetServiceSpecificCredentialResponseServiceSpecificCredential getServiceSpecificCredential() {
    return serviceSpecificCredential;
  }

  public void setServiceSpecificCredential(ResetServiceSpecificCredentialResponseServiceSpecificCredential serviceSpecificCredential) {
    this.serviceSpecificCredential = serviceSpecificCredential;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetServiceSpecificCredentialResponse resetServiceSpecificCredentialResponse = (ResetServiceSpecificCredentialResponse) o;
    return Objects.equals(this.serviceSpecificCredential, resetServiceSpecificCredentialResponse.serviceSpecificCredential);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceSpecificCredential);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetServiceSpecificCredentialResponse {\n");
    sb.append("    serviceSpecificCredential: ").append(toIndentedString(serviceSpecificCredential)).append("\n");
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

