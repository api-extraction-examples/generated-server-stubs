package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * UploadSigningCertificateResponseCertificate
 */

@JsonTypeName("UploadSigningCertificateResponse_Certificate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UploadSigningCertificateResponseCertificate {

  private String userName;

  private String certificateId;

  private String certificateBody;

  private StatusType status;

  private OffsetDateTime uploadDate;

  public UploadSigningCertificateResponseCertificate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadSigningCertificateResponseCertificate(String userName, String certificateId, String certificateBody, StatusType status) {
    this.userName = userName;
    this.certificateId = certificateId;
    this.certificateBody = certificateBody;
    this.status = status;
  }

  public UploadSigningCertificateResponseCertificate userName(String userName) {
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

  public UploadSigningCertificateResponseCertificate certificateId(String certificateId) {
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

  public UploadSigningCertificateResponseCertificate certificateBody(String certificateBody) {
    this.certificateBody = certificateBody;
    return this;
  }

  /**
   * Get certificateBody
   * @return certificateBody
  */
  @NotNull 
  @Schema(name = "CertificateBody", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CertificateBody")
  public String getCertificateBody() {
    return certificateBody;
  }

  public void setCertificateBody(String certificateBody) {
    this.certificateBody = certificateBody;
  }

  public UploadSigningCertificateResponseCertificate status(StatusType status) {
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

  public UploadSigningCertificateResponseCertificate uploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  /**
   * Get uploadDate
   * @return uploadDate
  */
  @Valid 
  @Schema(name = "UploadDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UploadDate")
  public OffsetDateTime getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSigningCertificateResponseCertificate uploadSigningCertificateResponseCertificate = (UploadSigningCertificateResponseCertificate) o;
    return Objects.equals(this.userName, uploadSigningCertificateResponseCertificate.userName) &&
        Objects.equals(this.certificateId, uploadSigningCertificateResponseCertificate.certificateId) &&
        Objects.equals(this.certificateBody, uploadSigningCertificateResponseCertificate.certificateBody) &&
        Objects.equals(this.status, uploadSigningCertificateResponseCertificate.status) &&
        Objects.equals(this.uploadDate, uploadSigningCertificateResponseCertificate.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, certificateId, certificateBody, status, uploadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSigningCertificateResponseCertificate {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
    sb.append("    certificateBody: ").append(toIndentedString(certificateBody)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
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

