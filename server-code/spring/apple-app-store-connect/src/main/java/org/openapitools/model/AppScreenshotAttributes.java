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
 * AppScreenshotAttributes
 */

@JsonTypeName("AppScreenshot_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppScreenshotAttributes {

  private AppMediaAssetState assetDeliveryState;

  private String assetToken;

  private String assetType;

  private String fileName;

  private Integer fileSize;

  private ImageAsset imageAsset;

  private String sourceFileChecksum;

  @Valid
  private List<@Valid UploadOperation> uploadOperations;

  public AppScreenshotAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
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

  public AppScreenshotAttributes assetToken(String assetToken) {
    this.assetToken = assetToken;
    return this;
  }

  /**
   * Get assetToken
   * @return assetToken
  */
  
  @Schema(name = "assetToken", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetToken")
  public String getAssetToken() {
    return assetToken;
  }

  public void setAssetToken(String assetToken) {
    this.assetToken = assetToken;
  }

  public AppScreenshotAttributes assetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  /**
   * Get assetType
   * @return assetType
  */
  
  @Schema(name = "assetType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("assetType")
  public String getAssetType() {
    return assetType;
  }

  public void setAssetType(String assetType) {
    this.assetType = assetType;
  }

  public AppScreenshotAttributes fileName(String fileName) {
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

  public AppScreenshotAttributes fileSize(Integer fileSize) {
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

  public AppScreenshotAttributes imageAsset(ImageAsset imageAsset) {
    this.imageAsset = imageAsset;
    return this;
  }

  /**
   * Get imageAsset
   * @return imageAsset
  */
  @Valid 
  @Schema(name = "imageAsset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("imageAsset")
  public ImageAsset getImageAsset() {
    return imageAsset;
  }

  public void setImageAsset(ImageAsset imageAsset) {
    this.imageAsset = imageAsset;
  }

  public AppScreenshotAttributes sourceFileChecksum(String sourceFileChecksum) {
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

  public AppScreenshotAttributes uploadOperations(List<@Valid UploadOperation> uploadOperations) {
    this.uploadOperations = uploadOperations;
    return this;
  }

  public AppScreenshotAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppScreenshotAttributes appScreenshotAttributes = (AppScreenshotAttributes) o;
    return Objects.equals(this.assetDeliveryState, appScreenshotAttributes.assetDeliveryState) &&
        Objects.equals(this.assetToken, appScreenshotAttributes.assetToken) &&
        Objects.equals(this.assetType, appScreenshotAttributes.assetType) &&
        Objects.equals(this.fileName, appScreenshotAttributes.fileName) &&
        Objects.equals(this.fileSize, appScreenshotAttributes.fileSize) &&
        Objects.equals(this.imageAsset, appScreenshotAttributes.imageAsset) &&
        Objects.equals(this.sourceFileChecksum, appScreenshotAttributes.sourceFileChecksum) &&
        Objects.equals(this.uploadOperations, appScreenshotAttributes.uploadOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, sourceFileChecksum, uploadOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppScreenshotAttributes {\n");
    sb.append("    assetDeliveryState: ").append(toIndentedString(assetDeliveryState)).append("\n");
    sb.append("    assetToken: ").append(toIndentedString(assetToken)).append("\n");
    sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    imageAsset: ").append(toIndentedString(imageAsset)).append("\n");
    sb.append("    sourceFileChecksum: ").append(toIndentedString(sourceFileChecksum)).append("\n");
    sb.append("    uploadOperations: ").append(toIndentedString(uploadOperations)).append("\n");
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

