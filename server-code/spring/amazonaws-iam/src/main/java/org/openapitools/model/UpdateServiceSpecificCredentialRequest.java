package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.StatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateServiceSpecificCredentialRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateServiceSpecificCredentialRequest {

  private String userName;

  private String serviceSpecificCredentialId;

  private StatusType status;

  public UpdateServiceSpecificCredentialRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateServiceSpecificCredentialRequest(String serviceSpecificCredentialId, StatusType status) {
    this.serviceSpecificCredentialId = serviceSpecificCredentialId;
    this.status = status;
  }

  public UpdateServiceSpecificCredentialRequest userName(String userName) {
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

  public UpdateServiceSpecificCredentialRequest serviceSpecificCredentialId(String serviceSpecificCredentialId) {
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

  public UpdateServiceSpecificCredentialRequest status(StatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public StatusType getStatus() {
    return status;
  }

  public void setStatus(StatusType status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServiceSpecificCredentialRequest updateServiceSpecificCredentialRequest = (UpdateServiceSpecificCredentialRequest) o;
    return Objects.equals(this.userName, updateServiceSpecificCredentialRequest.userName) &&
        Objects.equals(this.serviceSpecificCredentialId, updateServiceSpecificCredentialRequest.serviceSpecificCredentialId) &&
        Objects.equals(this.status, updateServiceSpecificCredentialRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, serviceSpecificCredentialId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceSpecificCredentialRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    serviceSpecificCredentialId: ").append(toIndentedString(serviceSpecificCredentialId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

