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
import org.openapitools.model.UploadOperation;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AppStoreReviewAttachmentAttributes
 */

@JsonTypeName("AppStoreReviewAttachment_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppStoreReviewAttachmentAttributes {

  private AppMediaAssetState assetDeliveryState;

  private String fileName;

  private Integer fileSize;

  private String sourceFileChecksum;

  @Valid
  private List<@Valid UploadOperation> uploadOperations;

  public AppStoreReviewAttachmentAttributes assetDeliveryState(AppMediaAssetState assetDeliveryState) {
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

  public AppStoreReviewAttachmentAttributes fileName(String fileName) {
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

  public AppStoreReviewAttachmentAttributes fileSize(Integer fileSize) {
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

  public AppStoreReviewAttachmentAttributes sourceFileChecksum(String sourceFileChecksum) {
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

  public AppStoreReviewAttachmentAttributes uploadOperations(List<@Valid UploadOperation> uploadOperations) {
    this.uploadOperations = uploadOperations;
    return this;
  }

  public AppStoreReviewAttachmentAttributes addUploadOperationsItem(UploadOperation uploadOperationsItem) {
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
    AppStoreReviewAttachmentAttributes appStoreReviewAttachmentAttributes = (AppStoreReviewAttachmentAttributes) o;
    return Objects.equals(this.assetDeliveryState, appStoreReviewAttachmentAttributes.assetDeliveryState) &&
        Objects.equals(this.fileName, appStoreReviewAttachmentAttributes.fileName) &&
        Objects.equals(this.fileSize, appStoreReviewAttachmentAttributes.fileSize) &&
        Objects.equals(this.sourceFileChecksum, appStoreReviewAttachmentAttributes.sourceFileChecksum) &&
        Objects.equals(this.uploadOperations, appStoreReviewAttachmentAttributes.uploadOperations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetDeliveryState, fileName, fileSize, sourceFileChecksum, uploadOperations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppStoreReviewAttachmentAttributes {\n");
    sb.append("    assetDeliveryState: ").append(toIndentedString(assetDeliveryState)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
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

