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
 * UploadSigningCertificateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UploadSigningCertificateRequest {

  private String userName;

  private String certificateBody;

  public UploadSigningCertificateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadSigningCertificateRequest(String certificateBody) {
    this.certificateBody = certificateBody;
  }

  public UploadSigningCertificateRequest userName(String userName) {
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

  public UploadSigningCertificateRequest certificateBody(String certificateBody) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSigningCertificateRequest uploadSigningCertificateRequest = (UploadSigningCertificateRequest) o;
    return Objects.equals(this.userName, uploadSigningCertificateRequest.userName) &&
        Objects.equals(this.certificateBody, uploadSigningCertificateRequest.certificateBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, certificateBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSigningCertificateRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    certificateBody: ").append(toIndentedString(certificateBody)).append("\n");
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

