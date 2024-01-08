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
 * AppScreenshotUpdateRequestDataAttributes
 */

@JsonTypeName("AppScreenshotUpdateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AppScreenshotUpdateRequestDataAttributes {

  private String sourceFileChecksum;

  private Boolean uploaded;

  public AppScreenshotUpdateRequestDataAttributes sourceFileChecksum(String sourceFileChecksum) {
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

  public AppScreenshotUpdateRequestDataAttributes uploaded(Boolean uploaded) {
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
    AppScreenshotUpdateRequestDataAttributes appScreenshotUpdateRequestDataAttributes = (AppScreenshotUpdateRequestDataAttributes) o;
    return Objects.equals(this.sourceFileChecksum, appScreenshotUpdateRequestDataAttributes.sourceFileChecksum) &&
        Objects.equals(this.uploaded, appScreenshotUpdateRequestDataAttributes.uploaded);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceFileChecksum, uploaded);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppScreenshotUpdateRequestDataAttributes {\n");
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

