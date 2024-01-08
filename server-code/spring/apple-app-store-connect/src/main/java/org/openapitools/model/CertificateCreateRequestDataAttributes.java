package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CertificateType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CertificateCreateRequestDataAttributes
 */

@JsonTypeName("CertificateCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class CertificateCreateRequestDataAttributes {

  private CertificateType certificateType;

  private String csrContent;

  public CertificateCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CertificateCreateRequestDataAttributes(CertificateType certificateType, String csrContent) {
    this.certificateType = certificateType;
    this.csrContent = csrContent;
  }

  public CertificateCreateRequestDataAttributes certificateType(CertificateType certificateType) {
    this.certificateType = certificateType;
    return this;
  }

  /**
   * Get certificateType
   * @return certificateType
  */
  @NotNull @Valid 
  @Schema(name = "certificateType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("certificateType")
  public CertificateType getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(CertificateType certificateType) {
    this.certificateType = certificateType;
  }

  public CertificateCreateRequestDataAttributes csrContent(String csrContent) {
    this.csrContent = csrContent;
    return this;
  }

  /**
   * Get csrContent
   * @return csrContent
  */
  @NotNull 
  @Schema(name = "csrContent", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("csrContent")
  public String getCsrContent() {
    return csrContent;
  }

  public void setCsrContent(String csrContent) {
    this.csrContent = csrContent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateCreateRequestDataAttributes certificateCreateRequestDataAttributes = (CertificateCreateRequestDataAttributes) o;
    return Objects.equals(this.certificateType, certificateCreateRequestDataAttributes.certificateType) &&
        Objects.equals(this.csrContent, certificateCreateRequestDataAttributes.csrContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateType, csrContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateCreateRequestDataAttributes {\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    csrContent: ").append(toIndentedString(csrContent)).append("\n");
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

