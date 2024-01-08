package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.List;
import org.openapitools.model.UploadServerCertificateResponseServerCertificateMetadata;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;UploadServerCertificate&lt;/a&gt; request. 
 */

@Schema(name = "UploadServerCertificateResponse", description = "Contains the response to a successful <a>UploadServerCertificate</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UploadServerCertificateResponse {

  private UploadServerCertificateResponseServerCertificateMetadata serverCertificateMetadata;

  private List tags;

  public UploadServerCertificateResponse serverCertificateMetadata(UploadServerCertificateResponseServerCertificateMetadata serverCertificateMetadata) {
    this.serverCertificateMetadata = serverCertificateMetadata;
    return this;
  }

  /**
   * Get serverCertificateMetadata
   * @return serverCertificateMetadata
  */
  @Valid 
  @Schema(name = "ServerCertificateMetadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ServerCertificateMetadata")
  public UploadServerCertificateResponseServerCertificateMetadata getServerCertificateMetadata() {
    return serverCertificateMetadata;
  }

  public void setServerCertificateMetadata(UploadServerCertificateResponseServerCertificateMetadata serverCertificateMetadata) {
    this.serverCertificateMetadata = serverCertificateMetadata;
  }

  public UploadServerCertificateResponse tags(List tags) {
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
    UploadServerCertificateResponse uploadServerCertificateResponse = (UploadServerCertificateResponse) o;
    return Objects.equals(this.serverCertificateMetadata, uploadServerCertificateResponse.serverCertificateMetadata) &&
        Objects.equals(this.tags, uploadServerCertificateResponse.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverCertificateMetadata, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadServerCertificateResponse {\n");
    sb.append("    serverCertificateMetadata: ").append(toIndentedString(serverCertificateMetadata)).append("\n");
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

