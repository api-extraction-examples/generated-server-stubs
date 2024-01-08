package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.BundleIdPlatform;
import org.openapitools.model.CertificateType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CertificateAttributes
 */

@JsonTypeName("Certificate_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class CertificateAttributes {

  private String certificateContent;

  private CertificateType certificateType;

  private String displayName;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  private String name;

  private BundleIdPlatform platform;

  private String serialNumber;

  public CertificateAttributes certificateContent(String certificateContent) {
    this.certificateContent = certificateContent;
    return this;
  }

  /**
   * Get certificateContent
   * @return certificateContent
  */
  
  @Schema(name = "certificateContent", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateContent")
  public String getCertificateContent() {
    return certificateContent;
  }

  public void setCertificateContent(String certificateContent) {
    this.certificateContent = certificateContent;
  }

  public CertificateAttributes certificateType(CertificateType certificateType) {
    this.certificateType = certificateType;
    return this;
  }

  /**
   * Get certificateType
   * @return certificateType
  */
  @Valid 
  @Schema(name = "certificateType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("certificateType")
  public CertificateType getCertificateType() {
    return certificateType;
  }

  public void setCertificateType(CertificateType certificateType) {
    this.certificateType = certificateType;
  }

  public CertificateAttributes displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
  */
  
  @Schema(name = "displayName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public CertificateAttributes expirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * Get expirationDate
   * @return expirationDate
  */
  @Valid 
  @Schema(name = "expirationDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expirationDate")
  public OffsetDateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(OffsetDateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public CertificateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CertificateAttributes platform(BundleIdPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @Valid 
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public BundleIdPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(BundleIdPlatform platform) {
    this.platform = platform;
  }

  public CertificateAttributes serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  */
  
  @Schema(name = "serialNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateAttributes certificateAttributes = (CertificateAttributes) o;
    return Objects.equals(this.certificateContent, certificateAttributes.certificateContent) &&
        Objects.equals(this.certificateType, certificateAttributes.certificateType) &&
        Objects.equals(this.displayName, certificateAttributes.displayName) &&
        Objects.equals(this.expirationDate, certificateAttributes.expirationDate) &&
        Objects.equals(this.name, certificateAttributes.name) &&
        Objects.equals(this.platform, certificateAttributes.platform) &&
        Objects.equals(this.serialNumber, certificateAttributes.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificateContent, certificateType, displayName, expirationDate, name, platform, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateAttributes {\n");
    sb.append("    certificateContent: ").append(toIndentedString(certificateContent)).append("\n");
    sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

