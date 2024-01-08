package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.AppEncryptionDeclarationState;
import org.openapitools.model.Platform;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppEncryptionDeclarationAttributes
 */

@JsonTypeName("AppEncryptionDeclaration_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppEncryptionDeclarationAttributes {

  private AppEncryptionDeclarationState appEncryptionDeclarationState;

  private Boolean availableOnFrenchStore;

  private String codeValue;

  private Boolean containsProprietaryCryptography;

  private Boolean containsThirdPartyCryptography;

  private String documentName;

  private String documentType;

  private String documentUrl;

  private Boolean exempt;

  private Platform platform;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime uploadedDate;

  private Boolean usesEncryption;

  public AppEncryptionDeclarationAttributes appEncryptionDeclarationState(AppEncryptionDeclarationState appEncryptionDeclarationState) {
    this.appEncryptionDeclarationState = appEncryptionDeclarationState;
    return this;
  }

  /**
   * Get appEncryptionDeclarationState
   * @return appEncryptionDeclarationState
  */
  @Valid 
  @Schema(name = "appEncryptionDeclarationState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("appEncryptionDeclarationState")
  public AppEncryptionDeclarationState getAppEncryptionDeclarationState() {
    return appEncryptionDeclarationState;
  }

  public void setAppEncryptionDeclarationState(AppEncryptionDeclarationState appEncryptionDeclarationState) {
    this.appEncryptionDeclarationState = appEncryptionDeclarationState;
  }

  public AppEncryptionDeclarationAttributes availableOnFrenchStore(Boolean availableOnFrenchStore) {
    this.availableOnFrenchStore = availableOnFrenchStore;
    return this;
  }

  /**
   * Get availableOnFrenchStore
   * @return availableOnFrenchStore
  */
  
  @Schema(name = "availableOnFrenchStore", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("availableOnFrenchStore")
  public Boolean getAvailableOnFrenchStore() {
    return availableOnFrenchStore;
  }

  public void setAvailableOnFrenchStore(Boolean availableOnFrenchStore) {
    this.availableOnFrenchStore = availableOnFrenchStore;
  }

  public AppEncryptionDeclarationAttributes codeValue(String codeValue) {
    this.codeValue = codeValue;
    return this;
  }

  /**
   * Get codeValue
   * @return codeValue
  */
  
  @Schema(name = "codeValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("codeValue")
  public String getCodeValue() {
    return codeValue;
  }

  public void setCodeValue(String codeValue) {
    this.codeValue = codeValue;
  }

  public AppEncryptionDeclarationAttributes containsProprietaryCryptography(Boolean containsProprietaryCryptography) {
    this.containsProprietaryCryptography = containsProprietaryCryptography;
    return this;
  }

  /**
   * Get containsProprietaryCryptography
   * @return containsProprietaryCryptography
  */
  
  @Schema(name = "containsProprietaryCryptography", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containsProprietaryCryptography")
  public Boolean getContainsProprietaryCryptography() {
    return containsProprietaryCryptography;
  }

  public void setContainsProprietaryCryptography(Boolean containsProprietaryCryptography) {
    this.containsProprietaryCryptography = containsProprietaryCryptography;
  }

  public AppEncryptionDeclarationAttributes containsThirdPartyCryptography(Boolean containsThirdPartyCryptography) {
    this.containsThirdPartyCryptography = containsThirdPartyCryptography;
    return this;
  }

  /**
   * Get containsThirdPartyCryptography
   * @return containsThirdPartyCryptography
  */
  
  @Schema(name = "containsThirdPartyCryptography", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containsThirdPartyCryptography")
  public Boolean getContainsThirdPartyCryptography() {
    return containsThirdPartyCryptography;
  }

  public void setContainsThirdPartyCryptography(Boolean containsThirdPartyCryptography) {
    this.containsThirdPartyCryptography = containsThirdPartyCryptography;
  }

  public AppEncryptionDeclarationAttributes documentName(String documentName) {
    this.documentName = documentName;
    return this;
  }

  /**
   * Get documentName
   * @return documentName
  */
  
  @Schema(name = "documentName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentName")
  public String getDocumentName() {
    return documentName;
  }

  public void setDocumentName(String documentName) {
    this.documentName = documentName;
  }

  public AppEncryptionDeclarationAttributes documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

  /**
   * Get documentType
   * @return documentType
  */
  
  @Schema(name = "documentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentType")
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public AppEncryptionDeclarationAttributes documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

  /**
   * Get documentUrl
   * @return documentUrl
  */
  
  @Schema(name = "documentUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("documentUrl")
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public AppEncryptionDeclarationAttributes exempt(Boolean exempt) {
    this.exempt = exempt;
    return this;
  }

  /**
   * Get exempt
   * @return exempt
  */
  
  @Schema(name = "exempt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exempt")
  public Boolean getExempt() {
    return exempt;
  }

  public void setExempt(Boolean exempt) {
    this.exempt = exempt;
  }

  public AppEncryptionDeclarationAttributes platform(Platform platform) {
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
  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public AppEncryptionDeclarationAttributes uploadedDate(OffsetDateTime uploadedDate) {
    this.uploadedDate = uploadedDate;
    return this;
  }

  /**
   * Get uploadedDate
   * @return uploadedDate
  */
  @Valid 
  @Schema(name = "uploadedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploadedDate")
  public OffsetDateTime getUploadedDate() {
    return uploadedDate;
  }

  public void setUploadedDate(OffsetDateTime uploadedDate) {
    this.uploadedDate = uploadedDate;
  }

  public AppEncryptionDeclarationAttributes usesEncryption(Boolean usesEncryption) {
    this.usesEncryption = usesEncryption;
    return this;
  }

  /**
   * Get usesEncryption
   * @return usesEncryption
  */
  
  @Schema(name = "usesEncryption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usesEncryption")
  public Boolean getUsesEncryption() {
    return usesEncryption;
  }

  public void setUsesEncryption(Boolean usesEncryption) {
    this.usesEncryption = usesEncryption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEncryptionDeclarationAttributes appEncryptionDeclarationAttributes = (AppEncryptionDeclarationAttributes) o;
    return Objects.equals(this.appEncryptionDeclarationState, appEncryptionDeclarationAttributes.appEncryptionDeclarationState) &&
        Objects.equals(this.availableOnFrenchStore, appEncryptionDeclarationAttributes.availableOnFrenchStore) &&
        Objects.equals(this.codeValue, appEncryptionDeclarationAttributes.codeValue) &&
        Objects.equals(this.containsProprietaryCryptography, appEncryptionDeclarationAttributes.containsProprietaryCryptography) &&
        Objects.equals(this.containsThirdPartyCryptography, appEncryptionDeclarationAttributes.containsThirdPartyCryptography) &&
        Objects.equals(this.documentName, appEncryptionDeclarationAttributes.documentName) &&
        Objects.equals(this.documentType, appEncryptionDeclarationAttributes.documentType) &&
        Objects.equals(this.documentUrl, appEncryptionDeclarationAttributes.documentUrl) &&
        Objects.equals(this.exempt, appEncryptionDeclarationAttributes.exempt) &&
        Objects.equals(this.platform, appEncryptionDeclarationAttributes.platform) &&
        Objects.equals(this.uploadedDate, appEncryptionDeclarationAttributes.uploadedDate) &&
        Objects.equals(this.usesEncryption, appEncryptionDeclarationAttributes.usesEncryption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appEncryptionDeclarationState, availableOnFrenchStore, codeValue, containsProprietaryCryptography, containsThirdPartyCryptography, documentName, documentType, documentUrl, exempt, platform, uploadedDate, usesEncryption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEncryptionDeclarationAttributes {\n");
    sb.append("    appEncryptionDeclarationState: ").append(toIndentedString(appEncryptionDeclarationState)).append("\n");
    sb.append("    availableOnFrenchStore: ").append(toIndentedString(availableOnFrenchStore)).append("\n");
    sb.append("    codeValue: ").append(toIndentedString(codeValue)).append("\n");
    sb.append("    containsProprietaryCryptography: ").append(toIndentedString(containsProprietaryCryptography)).append("\n");
    sb.append("    containsThirdPartyCryptography: ").append(toIndentedString(containsThirdPartyCryptography)).append("\n");
    sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    exempt: ").append(toIndentedString(exempt)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    uploadedDate: ").append(toIndentedString(uploadedDate)).append("\n");
    sb.append("    usesEncryption: ").append(toIndentedString(usesEncryption)).append("\n");
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

