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
 * Contains the response to a successful &lt;a&gt;ListSSHPublicKeys&lt;/a&gt; request.
 */

@Schema(name = "ListSSHPublicKeysResponse", description = "Contains the response to a successful <a>ListSSHPublicKeys</a> request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListSSHPublicKeysResponse {

  private List ssHPublicKeys;

  private Boolean isTruncated;

  private String marker;

  public ListSSHPublicKeysResponse ssHPublicKeys(List ssHPublicKeys) {
    this.ssHPublicKeys = ssHPublicKeys;
    return this;
  }

  /**
   * Get ssHPublicKeys
   * @return ssHPublicKeys
  */
  @Valid 
  @Schema(name = "SSHPublicKeys", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SSHPublicKeys")
  public List getSsHPublicKeys() {
    return ssHPublicKeys;
  }

  public void setSsHPublicKeys(List ssHPublicKeys) {
    this.ssHPublicKeys = ssHPublicKeys;
  }

  public ListSSHPublicKeysResponse isTruncated(Boolean isTruncated) {
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

  public ListSSHPublicKeysResponse marker(String marker) {
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
    ListSSHPublicKeysResponse listSSHPublicKeysResponse = (ListSSHPublicKeysResponse) o;
    return Objects.equals(this.ssHPublicKeys, listSSHPublicKeysResponse.ssHPublicKeys) &&
        Objects.equals(this.isTruncated, listSSHPublicKeysResponse.isTruncated) &&
        Objects.equals(this.marker, listSSHPublicKeysResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssHPublicKeys, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSSHPublicKeysResponse {\n");
    sb.append("    ssHPublicKeys: ").append(toIndentedString(ssHPublicKeys)).append("\n");
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

