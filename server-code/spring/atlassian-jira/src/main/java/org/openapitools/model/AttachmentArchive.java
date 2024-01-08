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
 * AttachmentArchive
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AttachmentArchive {

  @Valid
  private List<@Valid AttachmentArchiveEntry> entries;

  private Boolean moreAvailable;

  private Integer totalEntryCount;

  private Integer totalNumberOfEntriesAvailable;

  public AttachmentArchive entries(List<@Valid AttachmentArchiveEntry> entries) {
    this.entries = entries;
    return this;
  }

  public AttachmentArchive addEntriesItem(AttachmentArchiveEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
  */
  @Valid 
  @Schema(name = "entries", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entries")
  public List<@Valid AttachmentArchiveEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<@Valid AttachmentArchiveEntry> entries) {
    this.entries = entries;
  }

  public AttachmentArchive moreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
    return this;
  }

  /**
   * Get moreAvailable
   * @return moreAvailable
  */
  
  @Schema(name = "moreAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("moreAvailable")
  public Boolean getMoreAvailable() {
    return moreAvailable;
  }

  public void setMoreAvailable(Boolean moreAvailable) {
    this.moreAvailable = moreAvailable;
  }

  public AttachmentArchive totalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
    return this;
  }

  /**
   * Get totalEntryCount
   * @return totalEntryCount
  */
  
  @Schema(name = "totalEntryCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalEntryCount")
  public Integer getTotalEntryCount() {
    return totalEntryCount;
  }

  public void setTotalEntryCount(Integer totalEntryCount) {
    this.totalEntryCount = totalEntryCount;
  }

  public AttachmentArchive totalNumberOfEntriesAvailable(Integer totalNumberOfEntriesAvailable) {
    this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
    return this;
  }

  /**
   * Get totalNumberOfEntriesAvailable
   * @return totalNumberOfEntriesAvailable
  */
  
  @Schema(name = "totalNumberOfEntriesAvailable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalNumberOfEntriesAvailable")
  public Integer getTotalNumberOfEntriesAvailable() {
    return totalNumberOfEntriesAvailable;
  }

  public void setTotalNumberOfEntriesAvailable(Integer totalNumberOfEntriesAvailable) {
    this.totalNumberOfEntriesAvailable = totalNumberOfEntriesAvailable;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentArchive attachmentArchive = (AttachmentArchive) o;
    return Objects.equals(this.entries, attachmentArchive.entries) &&
        Objects.equals(this.moreAvailable, attachmentArchive.moreAvailable) &&
        Objects.equals(this.totalEntryCount, attachmentArchive.totalEntryCount) &&
        Objects.equals(this.totalNumberOfEntriesAvailable, attachmentArchive.totalNumberOfEntriesAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entries, moreAvailable, totalEntryCount, totalNumberOfEntriesAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentArchive {\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    moreAvailable: ").append(toIndentedString(moreAvailable)).append("\n");
    sb.append("    totalEntryCount: ").append(toIndentedString(totalEntryCount)).append("\n");
    sb.append("    totalNumberOfEntriesAvailable: ").append(toIndentedString(totalNumberOfEntriesAvailable)).append("\n");
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

