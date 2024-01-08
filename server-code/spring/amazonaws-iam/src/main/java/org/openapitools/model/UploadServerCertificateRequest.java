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
 * UploadServerCertificateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UploadServerCertificateRequest {

  private String path;

  private String serverCertificateName;

  private String certificateBody;

  private String privateKey;

  private String certificateChain;

  private List tags;

  public UploadServerCertificateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadServerCertificateRequest(String serverCertificateName, String certificateBody, String privateKey) {
    this.serverCertificateName = serverCertificateName;
    this.certificateBody = certificateBody;
    this.privateKey = privateKey;
  }

  public UploadServerCertificateRequest path(String path) {
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

  public UploadServerCertificateRequest serverCertificateName(String serverCertificateName) {
    this.serverCertificateName = serverCertificateName;
    return this;
  }

  /**
   * Get serverCertificateName
   * @return serverCertificateName
  */
  @NotNull 
  @Schema(name = "ServerCertificateName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServerCertificateName")
  public String getServerCertificateName() {
    return serverCertificateName;
  }

  public void setServerCertificateName(String serverCertificateName) {
    this.serverCertificateName = serverCertificateName;
  }

  public UploadServerCertificateRequest certificateBody(String certificateBody) {
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

  public UploadServerCertificateRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * Get privateKey
   * @return privateKey
  */
  @NotNull 
  @Schema(name = "PrivateKey", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PrivateKey")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public UploadServerCertificateRequest certificateChain(String certificateChain) {
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

  public UploadServerCertificateRequest tags(List tags) {
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
    UploadServerCertificateRequest uploadServerCertificateRequest = (UploadServerCertificateRequest) o;
    return Objects.equals(this.path, uploadServerCertificateRequest.path) &&
        Objects.equals(this.serverCertificateName, uploadServerCertificateRequest.serverCertificateName) &&
        Objects.equals(this.certificateBody, uploadServerCertificateRequest.certificateBody) &&
        Objects.equals(this.privateKey, uploadServerCertificateRequest.privateKey) &&
        Objects.equals(this.certificateChain, uploadServerCertificateRequest.certificateChain) &&
        Objects.equals(this.tags, uploadServerCertificateRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serverCertificateName, certificateBody, privateKey, certificateChain, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadServerCertificateRequest {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serverCertificateName: ").append(toIndentedString(serverCertificateName)).append("\n");
    sb.append("    certificateBody: ").append(toIndentedString(certificateBody)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

