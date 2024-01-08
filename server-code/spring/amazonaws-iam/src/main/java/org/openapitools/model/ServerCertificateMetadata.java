package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * &lt;p&gt;Contains information about a server certificate without its certificate body, certificate chain, and private key.&lt;/p&gt; &lt;p&gt; This data type is used as a response element in the &lt;a&gt;UploadServerCertificate&lt;/a&gt; and &lt;a&gt;ListServerCertificates&lt;/a&gt; operations. &lt;/p&gt;
 */

@Schema(name = "ServerCertificateMetadata", description = "<p>Contains information about a server certificate without its certificate body, certificate chain, and private key.</p> <p> This data type is used as a response element in the <a>UploadServerCertificate</a> and <a>ListServerCertificates</a> operations. </p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ServerCertificateMetadata {

  private String path;

  private String serverCertificateName;

  private String serverCertificateId;

  private String arn;

  private OffsetDateTime uploadDate;

  private OffsetDateTime expiration;

  public ServerCertificateMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServerCertificateMetadata(String path, String serverCertificateName, String serverCertificateId, String arn) {
    this.path = path;
    this.serverCertificateName = serverCertificateName;
    this.serverCertificateId = serverCertificateId;
    this.arn = arn;
  }

  public ServerCertificateMetadata path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @NotNull 
  @Schema(name = "Path", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ServerCertificateMetadata serverCertificateName(String serverCertificateName) {
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

  public ServerCertificateMetadata serverCertificateId(String serverCertificateId) {
    this.serverCertificateId = serverCertificateId;
    return this;
  }

  /**
   * Get serverCertificateId
   * @return serverCertificateId
  */
  @NotNull 
  @Schema(name = "ServerCertificateId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServerCertificateId")
  public String getServerCertificateId() {
    return serverCertificateId;
  }

  public void setServerCertificateId(String serverCertificateId) {
    this.serverCertificateId = serverCertificateId;
  }

  public ServerCertificateMetadata arn(String arn) {
    this.arn = arn;
    return this;
  }

  /**
   * Get arn
   * @return arn
  */
  @NotNull 
  @Schema(name = "Arn", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Arn")
  public String getArn() {
    return arn;
  }

  public void setArn(String arn) {
    this.arn = arn;
  }

  public ServerCertificateMetadata uploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  /**
   * Get uploadDate
   * @return uploadDate
  */
  @Valid 
  @Schema(name = "UploadDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("UploadDate")
  public OffsetDateTime getUploadDate() {
    return uploadDate;
  }

  public void setUploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
  }

  public ServerCertificateMetadata expiration(OffsetDateTime expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * Get expiration
   * @return expiration
  */
  @Valid 
  @Schema(name = "Expiration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Expiration")
  public OffsetDateTime getExpiration() {
    return expiration;
  }

  public void setExpiration(OffsetDateTime expiration) {
    this.expiration = expiration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerCertificateMetadata serverCertificateMetadata = (ServerCertificateMetadata) o;
    return Objects.equals(this.path, serverCertificateMetadata.path) &&
        Objects.equals(this.serverCertificateName, serverCertificateMetadata.serverCertificateName) &&
        Objects.equals(this.serverCertificateId, serverCertificateMetadata.serverCertificateId) &&
        Objects.equals(this.arn, serverCertificateMetadata.arn) &&
        Objects.equals(this.uploadDate, serverCertificateMetadata.uploadDate) &&
        Objects.equals(this.expiration, serverCertificateMetadata.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serverCertificateName, serverCertificateId, arn, uploadDate, expiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerCertificateMetadata {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    serverCertificateName: ").append(toIndentedString(serverCertificateName)).append("\n");
    sb.append("    serverCertificateId: ").append(toIndentedString(serverCertificateId)).append("\n");
    sb.append("    arn: ").append(toIndentedString(arn)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

