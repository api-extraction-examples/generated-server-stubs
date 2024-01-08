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
 * UpdateSigningCertificateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateSigningCertificateRequest {

  private String userName;

  private String certificateId;

  private StatusType status;

  public UpdateSigningCertificateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateSigningCertificateRequest(String certificateId, StatusType status) {
    this.certificateId = certificateId;
    this.status = status;
  }

  public UpdateSigningCertificateRequest userName(String userName) {
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

  public UpdateSigningCertificateRequest certificateId(String certificateId) {
    this.certificateId = certificateId;
    return this;
  }

  /**
   * Get certificateId
   * @return certificateId
  */
  @NotNull 
  @Schema(name = "CertificateId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CertificateId")
  public String getCertificateId() {
    return certificateId;
  }

  public void setCertificateId(String certificateId) {
    this.certificateId = certificateId;
  }

  public UpdateSigningCertificateRequest status(StatusType status) {
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
    UpdateSigningCertificateRequest updateSigningCertificateRequest = (UpdateSigningCertificateRequest) o;
    return Objects.equals(this.userName, updateSigningCertificateRequest.userName) &&
        Objects.equals(this.certificateId, updateSigningCertificateRequest.certificateId) &&
        Objects.equals(this.status, updateSigningCertificateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, certificateId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSigningCertificateRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
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

