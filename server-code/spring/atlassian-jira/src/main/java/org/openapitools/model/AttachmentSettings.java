package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the instance&#39;s attachment settings.
 */

@Schema(name = "AttachmentSettings", description = "Details of the instance's attachment settings.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AttachmentSettings {

  private Boolean enabled;

  private Long uploadLimit;

  public AttachmentSettings enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the ability to add attachments is enabled.
   * @return enabled
  */
  
  @Schema(name = "enabled", accessMode = Schema.AccessMode.READ_ONLY, description = "Whether the ability to add attachments is enabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AttachmentSettings uploadLimit(Long uploadLimit) {
    this.uploadLimit = uploadLimit;
    return this;
  }

  /**
   * The maximum size of attachments permitted, in bytes.
   * @return uploadLimit
  */
  
  @Schema(name = "uploadLimit", accessMode = Schema.AccessMode.READ_ONLY, description = "The maximum size of attachments permitted, in bytes.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("uploadLimit")
  public Long getUploadLimit() {
    return uploadLimit;
  }

  public void setUploadLimit(Long uploadLimit) {
    this.uploadLimit = uploadLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentSettings attachmentSettings = (AttachmentSettings) o;
    return Objects.equals(this.enabled, attachmentSettings.enabled) &&
        Objects.equals(this.uploadLimit, attachmentSettings.uploadLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, uploadLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentSettings {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    uploadLimit: ").append(toIndentedString(uploadLimit)).append("\n");
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

