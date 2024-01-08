package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.model.StatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the details of a service-specific credential.
 */

@Schema(name = "ServiceSpecificCredential", description = "Contains the details of a service-specific credential.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ServiceSpecificCredential {

  private OffsetDateTime createDate;

  private String serviceName;

  private String serviceUserName;

  private String servicePassword;

  private String serviceSpecificCredentialId;

  private String userName;

  private StatusType status;

  public ServiceSpecificCredential() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServiceSpecificCredential(OffsetDateTime createDate, String serviceName, String serviceUserName, String servicePassword, String serviceSpecificCredentialId, String userName, StatusType status) {
    this.createDate = createDate;
    this.serviceName = serviceName;
    this.serviceUserName = serviceUserName;
    this.servicePassword = servicePassword;
    this.serviceSpecificCredentialId = serviceSpecificCredentialId;
    this.userName = userName;
    this.status = status;
  }

  public ServiceSpecificCredential createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @NotNull @Valid 
  @Schema(name = "CreateDate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CreateDate")
  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public ServiceSpecificCredential serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @NotNull 
  @Schema(name = "ServiceName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServiceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public ServiceSpecificCredential serviceUserName(String serviceUserName) {
    this.serviceUserName = serviceUserName;
    return this;
  }

  /**
   * Get serviceUserName
   * @return serviceUserName
  */
  @NotNull 
  @Schema(name = "ServiceUserName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServiceUserName")
  public String getServiceUserName() {
    return serviceUserName;
  }

  public void setServiceUserName(String serviceUserName) {
    this.serviceUserName = serviceUserName;
  }

  public ServiceSpecificCredential servicePassword(String servicePassword) {
    this.servicePassword = servicePassword;
    return this;
  }

  /**
   * Get servicePassword
   * @return servicePassword
  */
  @NotNull 
  @Schema(name = "ServicePassword", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServicePassword")
  public String getServicePassword() {
    return servicePassword;
  }

  public void setServicePassword(String servicePassword) {
    this.servicePassword = servicePassword;
  }

  public ServiceSpecificCredential serviceSpecificCredentialId(String serviceSpecificCredentialId) {
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

  public ServiceSpecificCredential userName(String userName) {
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

  public ServiceSpecificCredential status(StatusType status) {
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
    ServiceSpecificCredential serviceSpecificCredential = (ServiceSpecificCredential) o;
    return Objects.equals(this.createDate, serviceSpecificCredential.createDate) &&
        Objects.equals(this.serviceName, serviceSpecificCredential.serviceName) &&
        Objects.equals(this.serviceUserName, serviceSpecificCredential.serviceUserName) &&
        Objects.equals(this.servicePassword, serviceSpecificCredential.servicePassword) &&
        Objects.equals(this.serviceSpecificCredentialId, serviceSpecificCredential.serviceSpecificCredentialId) &&
        Objects.equals(this.userName, serviceSpecificCredential.userName) &&
        Objects.equals(this.status, serviceSpecificCredential.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDate, serviceName, serviceUserName, servicePassword, serviceSpecificCredentialId, userName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecificCredential {\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceUserName: ").append(toIndentedString(serviceUserName)).append("\n");
    sb.append("    servicePassword: ").append(toIndentedString(servicePassword)).append("\n");
    sb.append("    serviceSpecificCredentialId: ").append(toIndentedString(serviceSpecificCredentialId)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

