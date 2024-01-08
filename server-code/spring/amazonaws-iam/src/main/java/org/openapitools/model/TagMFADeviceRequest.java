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
 * TagMFADeviceRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class TagMFADeviceRequest {

  private String serialNumber;

  private List tags;

  public TagMFADeviceRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TagMFADeviceRequest(String serialNumber, List tags) {
    this.serialNumber = serialNumber;
    this.tags = tags;
  }

  public TagMFADeviceRequest serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

  /**
   * Get serialNumber
   * @return serialNumber
  */
  @NotNull 
  @Schema(name = "SerialNumber", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SerialNumber")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public TagMFADeviceRequest tags(List tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  @NotNull @Valid 
  @Schema(name = "Tags", requiredMode = Schema.RequiredMode.REQUIRED)
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
    TagMFADeviceRequest tagMFADeviceRequest = (TagMFADeviceRequest) o;
    return Objects.equals(this.serialNumber, tagMFADeviceRequest.serialNumber) &&
        Objects.equals(this.tags, tagMFADeviceRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagMFADeviceRequest {\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

