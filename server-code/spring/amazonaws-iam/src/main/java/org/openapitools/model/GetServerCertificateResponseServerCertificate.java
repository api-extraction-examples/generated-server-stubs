package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import org.openapitools.model.ServerCertificateServerCertificateMetadata;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetServerCertificateResponseServerCertificate
 */

@JsonTypeName("GetServerCertificateResponse_ServerCertificate")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetServerCertificateResponseServerCertificate {

  private ServerCertificateServerCertificateMetadata serverCertificateMetadata;

  private String certificateBody;

  private String certificateChain;

  private List tags;

  public GetServerCertificateResponseServerCertificate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetServerCertificateResponseServerCertificate(ServerCertificateServerCertificateMetadata serverCertificateMetadata, String certificateBody) {
    this.serverCertificateMetadata = serverCertificateMetadata;
    this.certificateBody = certificateBody;
  }

  public GetServerCertificateResponseServerCertificate serverCertificateMetadata(ServerCertificateServerCertificateMetadata serverCertificateMetadata) {
    this.serverCertificateMetadata = serverCertificateMetadata;
    return this;
  }

  /**
   * Get serverCertificateMetadata
   * @return serverCertificateMetadata
  */
  @NotNull @Valid 
  @Schema(name = "ServerCertificateMetadata", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServerCertificateMetadata")
  public ServerCertificateServerCertificateMetadata getServerCertificateMetadata() {
    return serverCertificateMetadata;
  }

  public void setServerCertificateMetadata(ServerCertificateServerCertificateMetadata serverCertificateMetadata) {
    this.serverCertificateMetadata = serverCertificateMetadata;
  }

  public GetServerCertificateResponseServerCertificate certificateBody(String certificateBody) {
    this.certificateBody = certificateBody;
    return this;
  }

  /**
   * Get certificateBody
   * @return certificateBody
  */
  @NotNull 
  @Schema(name = "CertificateBody", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CertificateBody")
  public String getCertificateBody() {
    return certificateBody;
  }

  public void setCertificateBody(String certificateBody) {
    this.certificateBody = certificateBody;
  }

  public GetServerCertificateResponseServerCertificate certificateChain(String certificateChain) {
    this.certificateChain = certificateChain;
    return this;
  }

  /**
   * Get certificateChain
   * @return certificateChain
  */
  
  @Schema(name = "CertificateChain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CertificateChain")
  public String getCertificateChain() {
    return certificateChain;
  }

  public void setCertificateChain(String certificateChain) {
    this.certificateChain = certificateChain;
  }

  public GetServerCertificateResponseServerCertificate tags(List tags) {
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
    GetServerCertificateResponseServerCertificate getServerCertificateResponseServerCertificate = (GetServerCertificateResponseServerCertificate) o;
    return Objects.equals(this.serverCertificateMetadata, getServerCertificateResponseServerCertificate.serverCertificateMetadata) &&
        Objects.equals(this.certificateBody, getServerCertificateResponseServerCertificate.certificateBody) &&
        Objects.equals(this.certificateChain, getServerCertificateResponseServerCertificate.certificateChain) &&
        Objects.equals(this.tags, getServerCertificateResponseServerCertificate.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverCertificateMetadata, certificateBody, certificateChain, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServerCertificateResponseServerCertificate {\n");
    sb.append("    serverCertificateMetadata: ").append(toIndentedString(serverCertificateMetadata)).append("\n");
    sb.append("    certificateBody: ").append(toIndentedString(certificateBody)).append("\n");
    sb.append("    certificateChain: ").append(toIndentedString(certificateChain)).append("\n");
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

