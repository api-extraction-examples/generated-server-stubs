package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.ImageAsset;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BuildAttributes
 */

@JsonTypeName("Build_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BuildAttributes {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime expirationDate;

  private Boolean expired;

  private ImageAsset iconAssetToken;

  private String minOsVersion;

  /**
   * Gets or Sets processingState
   */
  public enum ProcessingStateEnum {
    PROCESSING("PROCESSING"),
    
    FAILED("FAILED"),
    
    INVALID("INVALID"),
    
    VALID("VALID");

    private String value;

    ProcessingStateEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProcessingStateEnum fromValue(String value) {
      for (ProcessingStateEnum b : ProcessingStateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProcessingStateEnum processingState;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime uploadedDate;

  private Boolean usesNonExemptEncryption;

  private String version;

  public BuildAttributes expirationDate(OffsetDateTime expirationDate) {
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

  public BuildAttributes expired(Boolean expired) {
    this.expired = expired;
    return this;
  }

  /**
   * Get expired
   * @return expired
  */
  
  @Schema(name = "expired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expired")
  public Boolean getExpired() {
    return expired;
  }

  public void setExpired(Boolean expired) {
    this.expired = expired;
  }

  public BuildAttributes iconAssetToken(ImageAsset iconAssetToken) {
    this.iconAssetToken = iconAssetToken;
    return this;
  }

  /**
   * Get iconAssetToken
   * @return iconAssetToken
  */
  @Valid 
  @Schema(name = "iconAssetToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("iconAssetToken")
  public ImageAsset getIconAssetToken() {
    return iconAssetToken;
  }

  public void setIconAssetToken(ImageAsset iconAssetToken) {
    this.iconAssetToken = iconAssetToken;
  }

  public BuildAttributes minOsVersion(String minOsVersion) {
    this.minOsVersion = minOsVersion;
    return this;
  }

  /**
   * Get minOsVersion
   * @return minOsVersion
  */
  
  @Schema(name = "minOsVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minOsVersion")
  public String getMinOsVersion() {
    return minOsVersion;
  }

  public void setMinOsVersion(String minOsVersion) {
    this.minOsVersion = minOsVersion;
  }

  public BuildAttributes processingState(ProcessingStateEnum processingState) {
    this.processingState = processingState;
    return this;
  }

  /**
   * Get processingState
   * @return processingState
  */
  
  @Schema(name = "processingState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("processingState")
  public ProcessingStateEnum getProcessingState() {
    return processingState;
  }

  public void setProcessingState(ProcessingStateEnum processingState) {
    this.processingState = processingState;
  }

  public BuildAttributes uploadedDate(OffsetDateTime uploadedDate) {
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

  public BuildAttributes usesNonExemptEncryption(Boolean usesNonExemptEncryption) {
    this.usesNonExemptEncryption = usesNonExemptEncryption;
    return this;
  }

  /**
   * Get usesNonExemptEncryption
   * @return usesNonExemptEncryption
  */
  
  @Schema(name = "usesNonExemptEncryption", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usesNonExemptEncryption")
  public Boolean getUsesNonExemptEncryption() {
    return usesNonExemptEncryption;
  }

  public void setUsesNonExemptEncryption(Boolean usesNonExemptEncryption) {
    this.usesNonExemptEncryption = usesNonExemptEncryption;
  }

  public BuildAttributes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildAttributes buildAttributes = (BuildAttributes) o;
    return Objects.equals(this.expirationDate, buildAttributes.expirationDate) &&
        Objects.equals(this.expired, buildAttributes.expired) &&
        Objects.equals(this.iconAssetToken, buildAttributes.iconAssetToken) &&
        Objects.equals(this.minOsVersion, buildAttributes.minOsVersion) &&
        Objects.equals(this.processingState, buildAttributes.processingState) &&
        Objects.equals(this.uploadedDate, buildAttributes.uploadedDate) &&
        Objects.equals(this.usesNonExemptEncryption, buildAttributes.usesNonExemptEncryption) &&
        Objects.equals(this.version, buildAttributes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expirationDate, expired, iconAssetToken, minOsVersion, processingState, uploadedDate, usesNonExemptEncryption, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildAttributes {\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    expired: ").append(toIndentedString(expired)).append("\n");
    sb.append("    iconAssetToken: ").append(toIndentedString(iconAssetToken)).append("\n");
    sb.append("    minOsVersion: ").append(toIndentedString(minOsVersion)).append("\n");
    sb.append("    processingState: ").append(toIndentedString(processingState)).append("\n");
    sb.append("    uploadedDate: ").append(toIndentedString(uploadedDate)).append("\n");
    sb.append("    usesNonExemptEncryption: ").append(toIndentedString(usesNonExemptEncryption)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

