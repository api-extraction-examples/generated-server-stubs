package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentArchiveItemReadable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Metadata for an archive (for example a zip) and its contents.
 */

@Schema(name = "AttachmentArchiveMetadataReadable", description = "Metadata for an archive (for example a zip) and its contents.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AttachmentArchiveMetadataReadable {

  @Valid
  private List<@Valid AttachmentArchiveItemReadable> entries;

  private Long id;

  private String mediaType;

  private String name;

  private Long totalEntryCount;

  public AttachmentArchiveMetadataReadable entries(List<@Valid AttachmentArchiveItemReadable> entries) {
    this.entries = entries;
    return this;
  }

  public AttachmentArchiveMetadataReadable addEntriesItem(AttachmentArchiveItemReadable entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * The list of the items included in the archive.
   * @return entries
  */
  @Valid 
  @Schema(name = "entries", accessMode = Schema.AccessMode.READ_ONLY, description = "The list of the items included in the archive.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entries")
  public List<@Valid AttachmentArchiveItemReadable> getEntries() {
    return entries;
  }

  public void setEntries(List<@Valid AttachmentArchiveItemReadable> entries) {
    this.entries = entries;
  }

  public AttachmentArchiveMetadataReadable id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the attachment.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AttachmentArchiveMetadataReadable mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * The MIME type of the attachment.
   * @return mediaType
  */
  
  @Schema(name = "mediaType", accessMode = Schema.AccessMode.READ_ONLY, description = "The MIME type of the attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediaType")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public AttachmentArchiveMetadataReadable name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the archive file.
   * @return name
  */
  
  @Schema(name = "name", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the archive file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AttachmentArchiveMetadataReadable totalEntryCount(Long totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
    return this;
  }

  /**
   * The number of items included in the archive.
   * @return totalEntryCount
  */
  
  @Schema(name = "totalEntryCount", accessMode = Schema.AccessMode.READ_ONLY, description = "The number of items included in the archive.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalEntryCount")
  public Long getTotalEntryCount() {
    return totalEntryCount;
  }

  public void setTotalEntryCount(Long totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchiveMetadataReadable attachmentArchiveMetadataReadable = (AttachmentArchiveMetadataReadable) o;
    return Objects.equals(this.entries, attachmentArchiveMetadataReadable.entries) &&
        Objects.equals(this.id, attachmentArchiveMetadataReadable.id) &&
        Objects.equals(this.mediaType, attachmentArchiveMetadataReadable.mediaType) &&
        Objects.equals(this.name, attachmentArchiveMetadataReadable.name) &&
        Objects.equals(this.totalEntryCount, attachmentArchiveMetadataReadable.totalEntryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, id, mediaType, name, totalEntryCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveMetadataReadable {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
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

