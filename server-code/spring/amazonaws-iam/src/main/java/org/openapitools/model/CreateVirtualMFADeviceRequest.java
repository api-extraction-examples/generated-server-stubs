package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateVirtualMFADeviceRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class CreateVirtualMFADeviceRequest {

  private String path;

  private String virtualMFADeviceName;

  private List tags;

  public CreateVirtualMFADeviceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateVirtualMFADeviceRequest(String virtualMFADeviceName) {
    this.virtualMFADeviceName = virtualMFADeviceName;
  }

  public CreateVirtualMFADeviceRequest path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public CreateVirtualMFADeviceRequest virtualMFADeviceName(String virtualMFADeviceName) {
    this.virtualMFADeviceName = virtualMFADeviceName;
    return this;
  }

  /**
   * Get virtualMFADeviceName
   * @return virtualMFADeviceName
  */
  @NotNull 
  @Schema(name = "VirtualMFADeviceName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("VirtualMFADeviceName")
  public String getVirtualMFADeviceName() {
    return virtualMFADeviceName;
  }

  public void setVirtualMFADeviceName(String virtualMFADeviceName) {
    this.virtualMFADeviceName = virtualMFADeviceName;
  }

  public CreateVirtualMFADeviceRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Tags")
  public List getTags() {
    return tags;
  }

  public void setTags(List tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest = (CreateVirtualMFADeviceRequest) o;
    return Objects.equals(this.path, createVirtualMFADeviceRequest.path) &&
        Objects.equals(this.virtualMFADeviceName, createVirtualMFADeviceRequest.virtualMFADeviceName) &&
        Objects.equals(this.tags, createVirtualMFADeviceRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, virtualMFADeviceName, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVirtualMFADeviceRequest {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    virtualMFADeviceName: ").append(toIndentedString(virtualMFADeviceName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

