package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.model.AttachmentMetadataAuthor;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Metadata for an issue attachment.
 */

@Schema(name = "AttachmentMetadata", description = "Metadata for an issue attachment.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AttachmentMetadata {

  private AttachmentMetadataAuthor author;

  private String content;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime created;

  private String filename;

  private Long id;

  private String mimeType;

  @Valid
  private Map<String, Object> properties = new HashMap<>();

  private URI self;

  private Long size;

  private String thumbnail;

  public AttachmentMetadata author(AttachmentMetadataAuthor author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @Valid 
  @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("author")
  public AttachmentMetadataAuthor getAuthor() {
    return author;
  }

  public void setAuthor(AttachmentMetadataAuthor author) {
    this.author = author;
  }

  public AttachmentMetadata content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The URL of the attachment.
   * @return content
  */
  
  @Schema(name = "content", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public AttachmentMetadata created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The datetime the attachment was created.
   * @return created
  */
  @Valid 
  @Schema(name = "created", accessMode = Schema.AccessMode.READ_ONLY, description = "The datetime the attachment was created.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public AttachmentMetadata filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The name of the attachment file.
   * @return filename
  */
  
  @Schema(name = "filename", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the attachment file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("filename")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public AttachmentMetadata id(Long id) {
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

  public AttachmentMetadata mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The MIME type of the attachment.
   * @return mimeType
  */
  
  @Schema(name = "mimeType", accessMode = Schema.AccessMode.READ_ONLY, description = "The MIME type of the attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public AttachmentMetadata properties(Map<String, Object> properties) {
    this.properties = properties;
    return this;
  }

  public AttachmentMetadata putPropertiesItem(String key, Object propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Additional properties of the attachment.
   * @return properties
  */
  
  @Schema(name = "properties", accessMode = Schema.AccessMode.READ_ONLY, description = "Additional properties of the attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("properties")
  public Map<String, Object> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, Object> properties) {
    this.properties = properties;
  }

  public AttachmentMetadata self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the attachment metadata details.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the attachment metadata details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
  }

  public AttachmentMetadata size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * The size of the attachment.
   * @return size
  */
  
  @Schema(name = "size", accessMode = Schema.AccessMode.READ_ONLY, description = "The size of the attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public AttachmentMetadata thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * The URL of a thumbnail representing the attachment.
   * @return thumbnail
  */
  
  @Schema(name = "thumbnail", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of a thumbnail representing the attachment.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("thumbnail")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentMetadata attachmentMetadata = (AttachmentMetadata) o;
    return Objects.equals(this.author, attachmentMetadata.author) &&
        Objects.equals(this.content, attachmentMetadata.content) &&
        Objects.equals(this.created, attachmentMetadata.created) &&
        Objects.equals(this.filename, attachmentMetadata.filename) &&
        Objects.equals(this.id, attachmentMetadata.id) &&
        Objects.equals(this.mimeType, attachmentMetadata.mimeType) &&
        Objects.equals(this.properties, attachmentMetadata.properties) &&
        Objects.equals(this.self, attachmentMetadata.self) &&
        Objects.equals(this.size, attachmentMetadata.size) &&
        Objects.equals(this.thumbnail, attachmentMetadata.thumbnail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, content, created, filename, id, mimeType, properties, self, size, thumbnail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentMetadata {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    thumbnail: ").append(toIndentedString(thumbnail)).append("\n");
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

