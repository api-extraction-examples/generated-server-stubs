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
 * ResetServiceSpecificCredentialRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ResetServiceSpecificCredentialRequest {

  private String userName;

  private String serviceSpecificCredentialId;

  public ResetServiceSpecificCredentialRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ResetServiceSpecificCredentialRequest(String serviceSpecificCredentialId) {
    this.serviceSpecificCredentialId = serviceSpecificCredentialId;
  }

  public ResetServiceSpecificCredentialRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public ResetServiceSpecificCredentialRequest serviceSpecificCredentialId(String serviceSpecificCredentialId) {
    this.serviceSpecificCredentialId = serviceSpecificCredentialId;
    return this;
  }

  /**
   * Get serviceSpecificCredentialId
   * @return serviceSpecificCredentialId
  */
  @NotNull 
  @Schema(name = "ServiceSpecificCredentialId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServiceSpecificCredentialId")
  public String getServiceSpecificCredentialId() {
    return serviceSpecificCredentialId;
  }

  public void setServiceSpecificCredentialId(String serviceSpecificCredentialId) {
    this.serviceSpecificCredentialId = serviceSpecificCredentialId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetServiceSpecificCredentialRequest resetServiceSpecificCredentialRequest = (ResetServiceSpecificCredentialRequest) o;
    return Objects.equals(this.userName, resetServiceSpecificCredentialRequest.userName) &&
        Objects.equals(this.serviceSpecificCredentialId, resetServiceSpecificCredentialRequest.serviceSpecificCredentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, serviceSpecificCredentialId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetServiceSpecificCredentialRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    serviceSpecificCredentialId: ").append(toIndentedString(serviceSpecificCredentialId)).append("\n");
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

