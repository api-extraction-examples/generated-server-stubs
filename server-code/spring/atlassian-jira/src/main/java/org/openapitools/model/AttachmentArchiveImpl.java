package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AttachmentArchiveEntry;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AttachmentArchiveImpl
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AttachmentArchiveImpl {

  @Valid
  private List<@Valid AttachmentArchiveEntry> entries;

  private Integer totalEntryCount;

  public AttachmentArchiveImpl entries(List<@Valid AttachmentArchiveEntry> entries) {
    this.entries = entries;
    return this;
  }

  public AttachmentArchiveImpl addEntriesItem(AttachmentArchiveEntry entriesItem) {
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
  @Schema(name = "entries", description = "The list of the items included in the archive.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entries")
  public List<@Valid AttachmentArchiveEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<@Valid AttachmentArchiveEntry> entries) {
    this.entries = entries;
  }

  public AttachmentArchiveImpl totalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
    return this;
  }

  /**
   * The number of items in the archive.
   * @return totalEntryCount
  */
  
  @Schema(name = "totalEntryCount", description = "The number of items in the archive.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalEntryCount")
  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }

  public void setTotalEntryCount(Integer totalEntryCount) {
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
    AttachmentArchiveImpl attachmentArchiveImpl = (AttachmentArchiveImpl) o;
    return Objects.equals(this.entries, attachmentArchiveImpl.entries) &&
        Objects.equals(this.totalEntryCount, attachmentArchiveImpl.totalEntryCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, totalEntryCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchiveImpl {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

