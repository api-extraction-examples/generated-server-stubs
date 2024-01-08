package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewCreateRequestDataAttributes
 */

@JsonTypeName("AppPreviewCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewCreateRequestDataAttributes {

  private String fileName;

  private Integer fileSize;

  private String mimeType;

  private String previewFrameTimeCode;

  public AppPreviewCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AppPreviewCreateRequestDataAttributes(String fileName, Integer fileSize) {
    this.fileName = fileName;
    this.fileSize = fileSize;
  }

  public AppPreviewCreateRequestDataAttributes fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  */
  @NotNull 
  @Schema(name = "fileName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AppPreviewCreateRequestDataAttributes fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   * @return fileSize
  */
  @NotNull 
  @Schema(name = "fileSize", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fileSize")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public AppPreviewCreateRequestDataAttributes mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * Get mimeType
   * @return mimeType
  */
  
  @Schema(name = "mimeType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public AppPreviewCreateRequestDataAttributes previewFrameTimeCode(String previewFrameTimeCode) {
    this.previewFrameTimeCode = previewFrameTimeCode;
    return this;
  }

  /**
   * Get previewFrameTimeCode
   * @return previewFrameTimeCode
  */
  
  @Schema(name = "previewFrameTimeCode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previewFrameTimeCode")
  public String getPreviewFrameTimeCode() {
    return previewFrameTimeCode;
  }

  public void setPreviewFrameTimeCode(String previewFrameTimeCode) {
    this.previewFrameTimeCode = previewFrameTimeCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreviewCreateRequestDataAttributes appPreviewCreateRequestDataAttributes = (AppPreviewCreateRequestDataAttributes) o;
    return Objects.equals(this.fileName, appPreviewCreateRequestDataAttributes.fileName) &&
        Objects.equals(this.fileSize, appPreviewCreateRequestDataAttributes.fileSize) &&
        Objects.equals(this.mimeType, appPreviewCreateRequestDataAttributes.mimeType) &&
        Objects.equals(this.previewFrameTimeCode, appPreviewCreateRequestDataAttributes.previewFrameTimeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, fileSize, mimeType, previewFrameTimeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewCreateRequestDataAttributes {\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    previewFrameTimeCode: ").append(toIndentedString(previewFrameTimeCode)).append("\n");
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

