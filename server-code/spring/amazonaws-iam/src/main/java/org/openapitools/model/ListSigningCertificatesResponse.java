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
 * Contains the response to a successful &lt;a&gt;ListSigningCertificates&lt;/a&gt; request. 
 */

@Schema(name = "ListSigningCertificatesResponse", description = "Contains the response to a successful <a>ListSigningCertificates</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ListSigningCertificatesResponse {

  private List certificates;

  private Boolean isTruncated;

  private String marker;

  public ListSigningCertificatesResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ListSigningCertificatesResponse(List certificates) {
    this.certificates = certificates;
  }

  public ListSigningCertificatesResponse certificates(List certificates) {
    this.certificates = certificates;
    return this;
  }

  /**
   * Get certificates
   * @return certificates
  */
  @NotNull @Valid 
  @Schema(name = "Certificates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Certificates")
  public List getCertificates() {
    return certificates;
  }

  public void setCertificates(List certificates) {
    this.certificates = certificates;
  }

  public ListSigningCertificatesResponse isTruncated(Boolean isTruncated) {
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

  public ListSigningCertificatesResponse marker(String marker) {
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
    ListSigningCertificatesResponse listSigningCertificatesResponse = (ListSigningCertificatesResponse) o;
    return Objects.equals(this.certificates, listSigningCertificatesResponse.certificates) &&
        Objects.equals(this.isTruncated, listSigningCertificatesResponse.isTruncated) &&
        Objects.equals(this.marker, listSigningCertificatesResponse.marker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificates, isTruncated, marker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListSigningCertificatesResponse {\n");
    sb.append("    certificates: ").append(toIndentedString(certificates)).append("\n");
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

