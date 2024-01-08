package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.model.FileSection;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * File
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class File {

  private byte[] content;

  private String contentPath;

  private String id;

  private String name;

  private FileSection section;

  private Integer size;

  public File content(byte[] content) {
    this.content = content;
    return this;
  }

  /**
   * Base64-encoded contents of the file. Only set if size <= OP_MAX_INLINE_FILE_SIZE_KB kb and `inline_files` is set to `true`.
   * @return content
  */
  
  @Schema(name = "content", description = "Base64-encoded contents of the file. Only set if size <= OP_MAX_INLINE_FILE_SIZE_KB kb and `inline_files` is set to `true`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content")
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }

  public File contentPath(String contentPath) {
    this.contentPath = contentPath;
    return this;
  }

  /**
   * Path of the Connect API that can be used to download the contents of this file.
   * @return contentPath
  */
  
  @Schema(name = "content_path", accessMode = Schema.AccessMode.READ_ONLY, description = "Path of the Connect API that can be used to download the contents of this file.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content_path")
  public String getContentPath() {
    return contentPath;
  }

  public void setContentPath(String contentPath) {
    this.contentPath = contentPath;
  }

  public File id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the file
   * @return id
  */
  
  @Schema(name = "id", description = "ID of the file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public File name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the file
   * @return name
  */
  
  @Schema(name = "name", description = "Name of the file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public File section(FileSection section) {
    this.section = section;
    return this;
  }

  /**
   * Get section
   * @return section
  */
  @Valid 
  @Schema(name = "section", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("section")
  public FileSection getSection() {
    return section;
  }

  public void setSection(FileSection section) {
    this.section = section;
  }

  public File size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Size in bytes of the file
   * @return size
  */
  
  @Schema(name = "size", description = "Size in bytes of the file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
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
    File file = (File) o;
    return Arrays.equals(this.content, file.content) &&
        Objects.equals(this.contentPath, file.contentPath) &&
        Objects.equals(this.id, file.id) &&
        Objects.equals(this.name, file.name) &&
        Objects.equals(this.section, file.section) &&
        Objects.equals(this.size, file.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Arrays.hashCode(content), contentPath, id, name, section, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class File {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentPath: ").append(toIndentedString(contentPath)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
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

