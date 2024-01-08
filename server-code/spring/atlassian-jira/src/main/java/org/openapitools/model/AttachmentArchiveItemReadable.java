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
 * Metadata for an item in an attachment archive.
 */

@Schema(name = "AttachmentArchiveItemReadable", description = "Metadata for an item in an attachment archive.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AttachmentArchiveItemReadable {

  private Long index;

  private String label;

  private String mediaType;

  private String path;

  private String size;

  public AttachmentArchiveItemReadable index(Long index) {
    this.index = index;
    return this;
  }

  /**
   * The position of the item within the archive.
   * @return index
  */
  
  @Schema(name = "index", accessMode = Schema.AccessMode.READ_ONLY, description = "The position of the item within the archive.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("index")
  public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public AttachmentArchiveItemReadable label(String label) {
    this.label = label;
    return this;
  }

  /**
   * The label for the archive item.
   * @return label
  */
  
  @Schema(name = "label", accessMode = Schema.AccessMode.READ_ONLY, description = "The label for the archive item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("label")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public AttachmentArchiveItemReadable mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * The MIME type of the archive item.
   * @return mediaType
  */
  
  @Schema(name = "mediaType", accessMode = Schema.AccessMode.READ_ONLY, description = "The MIME type of the archive item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AttachmentArchiveItemReadable path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path of the archive item.
   * @return path
  */
  
  @Schema(name = "path", accessMode = Schema.AccessMode.READ_ONLY, description = "The path of the archive item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AttachmentArchiveItemReadable size(String size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the archive item.
   * @return size
  */
  
  @Schema(name = "size", accessMode = Schema.AccessMode.READ_ONLY, description = "The size of the archive item.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveItemReadable attachmentArchiveItemReadable = (AttachmentArchiveItemReadable) o;
    return Objects.equals(this.index, attachmentArchiveItemReadable.index) &&
        Objects.equals(this.label, attachmentArchiveItemReadable.label) &&
        Objects.equals(this.mediaType, attachmentArchiveItemReadable.mediaType) &&
        Objects.equals(this.path, attachmentArchiveItemReadable.path) &&
        Objects.equals(this.size, attachmentArchiveItemReadable.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, label, mediaType, path, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveItemReadable {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

