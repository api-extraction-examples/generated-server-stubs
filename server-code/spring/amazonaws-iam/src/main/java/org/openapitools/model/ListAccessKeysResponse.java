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
 * Contains the response to a successful &lt;a&gt;ListAccessKeys&lt;/a&gt; request. 
 */

@Schema(name = "ListAccessKeysResponse", description = "Contains the response to a successful <a>ListAccessKeys</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListAccessKeysResponse {

  private List accessKeyMetadata;

  private Boolean isTruncated;

  private String marker;

  public ListAccessKeysResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListAccessKeysResponse(List accessKeyMetadata) {
    this.accessKeyMetadata = accessKeyMetadata;
  }

  public ListAccessKeysResponse accessKeyMetadata(List accessKeyMetadata) {
    this.accessKeyMetadata = accessKeyMetadata;
    return this;
  }

  /**
   * Get accessKeyMetadata
   * @return accessKeyMetadata
  */
  @NotNull @Valid 
  @Schema(name = "AccessKeyMetadata", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AccessKeyMetadata")
  public List getAccessKeyMetadata() {
    return accessKeyMetadata;
  }

  public void setAccessKeyMetadata(List accessKeyMetadata) {
    this.accessKeyMetadata = accessKeyMetadata;
  }

  public ListAccessKeysResponse isTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
    return this;
  }

  /**
   * Get isTruncated
   * @return isTruncated
  */
  
  @Schema(name = "IsTruncated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsTruncated")
  public Boolean getIsTruncated() {
    return isTruncated;
  }

  public void setIsTruncated(Boolean isTruncated) {
    this.isTruncated = isTruncated;
  }

  public ListAccessKeysResponse marker(String marker) {
    this.marker = marker;
    return this;
  }

  /**
   * Get marker
   * @return marker
  */
  
  @Schema(name = "Marker", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Marker")
  public String getMarker() {
    return marker;
  }

  public void setMarker(String marker) {
    this.marker = marker;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAccessKeysResponse listAccessKeysResponse = (ListAccessKeysResponse) o;
    return Objects.equals(this.accessKeyMetadata, listAccessKeysResponse.accessKeyMetadata) &&
        Objects.equals(this.isTruncated, listAccessKeysResponse.isTruncated) &&
        Objects.equals(this.marker, listAccessKeysResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyMetadata, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAccessKeysResponse {\n");
    sb.append("    accessKeyMetadata: ").append(toIndentedString(accessKeyMetadata)).append("\n");
    sb.append("    isTruncated: ").append(toIndentedString(isTruncated)).append("\n");
    sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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

