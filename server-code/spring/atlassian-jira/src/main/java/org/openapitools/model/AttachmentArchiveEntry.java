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
 * AttachmentArchiveEntry
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AttachmentArchiveEntry {

  private String abbreviatedName;

  private Long entryIndex;

  private String mediaType;

  private String name;

  private Long size;

  public AttachmentArchiveEntry abbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
    return this;
  }

  /**
   * Get abbreviatedName
   * @return abbreviatedName
  */
  
  @Schema(name = "abbreviatedName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("abbreviatedName")
  public String getAbbreviatedName() {
    return abbreviatedName;
  }

  public void setAbbreviatedName(String abbreviatedName) {
    this.abbreviatedName = abbreviatedName;
  }

  public AttachmentArchiveEntry entryIndex(Long entryIndex) {
    this.entryIndex = entryIndex;
    return this;
  }

  /**
   * Get entryIndex
   * @return entryIndex
  */
  
  @Schema(name = "entryIndex", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entryIndex")
  public Long getEntryIndex() {
    return entryIndex;
  }

  public void setEntryIndex(Long entryIndex) {
    this.entryIndex = entryIndex;
  }

  public AttachmentArchiveEntry mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
  */
  
  @Schema(name = "mediaType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AttachmentArchiveEntry name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentArchiveEntry size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  
  @Schema(name = "size", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
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
    AttachmentArchiveEntry attachmentArchiveEntry = (AttachmentArchiveEntry) o;
    return Objects.equals(this.abbreviatedName, attachmentArchiveEntry.abbreviatedName) &&
        Objects.equals(this.entryIndex, attachmentArchiveEntry.entryIndex) &&
        Objects.equals(this.mediaType, attachmentArchiveEntry.mediaType) &&
        Objects.equals(this.name, attachmentArchiveEntry.name) &&
        Objects.equals(this.size, attachmentArchiveEntry.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abbreviatedName, entryIndex, mediaType, name, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveEntry {\n");
    sb.append("    abbreviatedName: ").append(toIndentedString(abbreviatedName)).append("\n");
    sb.append("    entryIndex: ").append(toIndentedString(entryIndex)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

