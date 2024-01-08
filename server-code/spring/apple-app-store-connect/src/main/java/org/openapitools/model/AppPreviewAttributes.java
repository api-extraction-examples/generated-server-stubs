package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AppMediaAssetState;
import org.openapitools.model.ImageAsset;
import org.openapitools.model.UploadOperation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppPreviewAttributes
 */

@JsonTypeName("AppPreview_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewAttributes {

  private AppMediaAssetState assetDeliveryState;

  private String fileName;

  private Integer fileSize;

  private String mimeType;

  private String previewFrameTimeCode;

  private ImageAsset previewImage;

  private String sourceFileChecksum;

  @Valid
  private List<@Valid UploadOperation> uploadOperations;

  private String videoUrl;

  public AppPreviewAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
    this.assetDeliveryState = assetDeliveryState;
    return this;
  }

  /**
   * Get assetDeliveryState
   * @return assetDeliveryState
  */
  @Valid 
  @Schema(name = "assetDeliveryState", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetDeliveryState")
  public AppMediaAssetState getAssetDeliveryState() {
    return assetDeliveryState;
  }

  public void setAssetDeliveryState(AppMediaAssetState assetDeliveryState) {
    this.assetDeliveryState = assetDeliveryState;
  }

  public AppPreviewAttributes fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  */
  
  @Schema(name = "fileName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileName")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AppPreviewAttributes fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

  /**
   * Get fileSize
   * @return fileSize
  */
  
  @Schema(name = "fileSize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fileSize")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public AppPreviewAttributes mimeType(String mimeType) {
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

  public AppPreviewAttributes previewFrameTimeCode(String previewFrameTimeCode) {
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

  public AppPreviewAttributes previewImage(ImageAsset previewImage) {
    this.previewImage = previewImage;
    return this;
  }

  /**
   * Get previewImage
   * @return previewImage
  */
  @Valid 
  @Schema(name = "previewImage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("previewImage")
  public ImageAsset getPreviewImage() {
    return previewImage;
  }

  public void setPreviewImage(ImageAsset previewImage) {
    this.previewImage = previewImage;
  }

  public AppPreviewAttributes sourceFileChecksum(String sourceFileChecksum) {
    this.sourceFileChecksum = sourceFileChecksum;
    return this;
  }

  /**
   * Get sourceFileChecksum
   * @return sourceFileChecksum
  */
  
  @Schema(name = "sourceFileChecksum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sourceFileChecksum")
  public String getSourceFileChecksum() {
    return sourceFileChecksum;
  }

  public void setSourceFileChecksum(String sourceFileChecksum) {
    this.sourceFileChecksum = sourceFileChecksum;
  }

  public AppPreviewAttributes uploadOperations(List<@Valid UploadOperation> uploadOperations) {
    this.uploadOperations = uploadOperations;
    return this;
  }

  public AppPreviewAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
    if (this.uploadOperations == null) {
      this.uploadOperations = new ArrayList<>();
    }
    this.uploadOperations.add(uploadOperationsItem);
    return this;
  }

  /**
   * Get uploadOperations
   * @return uploadOperations
  */
  @Valid 
  @Schema(name = "uploadOperations", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploadOperations")
  public List<@Valid UploadOperation> getUploadOperations() {
    return uploadOperations;
  }

  public void setUploadOperations(List<@Valid UploadOperation> uploadOperations) {
    this.uploadOperations = uploadOperations;
  }

  public AppPreviewAttributes videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

  /**
   * Get videoUrl
   * @return videoUrl
  */
  
  @Schema(name = "videoUrl", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("videoUrl")
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreviewAttributes appPreviewAttributes = (AppPreviewAttributes) o;
    return Objects.equals(this.assetDeliveryState, appPreviewAttributes.assetDeliveryState) &&
        Objects.equals(this.fileName, appPreviewAttributes.fileName) &&
        Objects.equals(this.fileSize, appPreviewAttributes.fileSize) &&
        Objects.equals(this.mimeType, appPreviewAttributes.mimeType) &&
        Objects.equals(this.previewFrameTimeCode, appPreviewAttributes.previewFrameTimeCode) &&
        Objects.equals(this.previewImage, appPreviewAttributes.previewImage) &&
        Objects.equals(this.sourceFileChecksum, appPreviewAttributes.sourceFileChecksum) &&
        Objects.equals(this.uploadOperations, appPreviewAttributes.uploadOperations) &&
        Objects.equals(this.videoUrl, appPreviewAttributes.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetDeliveryState, fileName, fileSize, mimeType, previewFrameTimeCode, previewImage, sourceFileChecksum, uploadOperations, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewAttributes {\n");
    sb.append("    assetDeliveryState: ").append(toIndentedString(assetDeliveryState)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    previewFrameTimeCode: ").append(toIndentedString(previewFrameTimeCode)).append("\n");
    sb.append("    previewImage: ").append(toIndentedString(previewImage)).append("\n");
    sb.append("    sourceFileChecksum: ").append(toIndentedString(sourceFileChecksum)).append("\n");
    sb.append("    uploadOperations: ").append(toIndentedString(uploadOperations)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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

