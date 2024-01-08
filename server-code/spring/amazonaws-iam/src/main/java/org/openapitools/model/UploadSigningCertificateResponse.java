package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.UploadSigningCertificateResponseCertificate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;UploadSigningCertificate&lt;/a&gt; request. 
 */

@Schema(name = "UploadSigningCertificateResponse", description = "Contains the response to a successful <a>UploadSigningCertificate</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UploadSigningCertificateResponse {

  private UploadSigningCertificateResponseCertificate certificate;

  public UploadSigningCertificateResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadSigningCertificateResponse(UploadSigningCertificateResponseCertificate certificate) {
    this.certificate = certificate;
  }

  public UploadSigningCertificateResponse certificate(UploadSigningCertificateResponseCertificate certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * Get certificate
   * @return certificate
  */
  @NotNull @Valid 
  @Schema(name = "Certificate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Certificate")
  public UploadSigningCertificateResponseCertificate getCertificate() {
    return certificate;
  }

  public void setCertificate(UploadSigningCertificateResponseCertificate certificate) {
    this.certificate = certificate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSigningCertificateResponse uploadSigningCertificateResponse = (UploadSigningCertificateResponse) o;
    return Objects.equals(this.certificate, uploadSigningCertificateResponse.certificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSigningCertificateResponse {\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
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

