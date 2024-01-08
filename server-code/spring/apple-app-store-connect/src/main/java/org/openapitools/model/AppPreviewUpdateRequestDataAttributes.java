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
 * AppPreviewUpdateRequestDataAttributes
 */

@JsonTypeName("AppPreviewUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppPreviewUpdateRequestDataAttributes {

  private String previewFrameTimeCode;

  private String sourceFileChecksum;

  private Boolean uploaded;

  public AppPreviewUpdateRequestDataAttributes previewFrameTimeCode(String previewFrameTimeCode) {
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

  public AppPreviewUpdateRequestDataAttributes sourceFileChecksum(String sourceFileChecksum) {
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

  public AppPreviewUpdateRequestDataAttributes uploaded(Boolean uploaded) {
    this.uploaded = uploaded;
    return this;
  }

  /**
   * Get uploaded
   * @return uploaded
  */
  
  @Schema(name = "uploaded", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploaded")
  public Boolean getUploaded() {
    return uploaded;
  }

  public void setUploaded(Boolean uploaded) {
    this.uploaded = uploaded;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppPreviewUpdateRequestDataAttributes appPreviewUpdateRequestDataAttributes = (AppPreviewUpdateRequestDataAttributes) o;
    return Objects.equals(this.previewFrameTimeCode, appPreviewUpdateRequestDataAttributes.previewFrameTimeCode) &&
        Objects.equals(this.sourceFileChecksum, appPreviewUpdateRequestDataAttributes.sourceFileChecksum) &&
        Objects.equals(this.uploaded, appPreviewUpdateRequestDataAttributes.uploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previewFrameTimeCode, sourceFileChecksum, uploaded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppPreviewUpdateRequestDataAttributes {\n");
    sb.append("    previewFrameTimeCode: ").append(toIndentedString(previewFrameTimeCode)).append("\n");
    sb.append("    sourceFileChecksum: ").append(toIndentedString(sourceFileChecksum)).append("\n");
    sb.append("    uploaded: ").append(toIndentedString(uploaded)).append("\n");
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

