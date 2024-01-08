package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ServerCertificateServerCertificateMetadata
 */

@JsonTypeName("ServerCertificate_ServerCertificateMetadata")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ServerCertificateServerCertificateMetadata {

  private String path;

  private String serverCertificateName;

  private String serverCertificateId;

  private String arn;

  private OffsetDateTime uploadDate;

  private OffsetDateTime expiration;

  public ServerCertificateServerCertificateMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServerCertificateServerCertificateMetadata(String path, String serverCertificateName, String serverCertificateId, String arn) {
    this.path = path;
    this.serverCertificateName = serverCertificateName;
    this.serverCertificateId = serverCertificateId;
    this.arn = arn;
  }

  public ServerCertificateServerCertificateMetadata path(String path) {
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

  public ServerCertificateServerCertificateMetadata serverCertificateName(String serverCertificateName) {
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

  public ServerCertificateServerCertificateMetadata serverCertificateId(String serverCertificateId) {
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

  public ServerCertificateServerCertificateMetadata arn(String arn) {
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

  public ServerCertificateServerCertificateMetadata uploadDate(OffsetDateTime uploadDate) {
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

  public ServerCertificateServerCertificateMetadata expiration(OffsetDateTime expiration) {
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
    ServerCertificateServerCertificateMetadata serverCertificateServerCertificateMetadata = (ServerCertificateServerCertificateMetadata) o;
    return Objects.equals(this.path, serverCertificateServerCertificateMetadata.path) &&
        Objects.equals(this.serverCertificateName, serverCertificateServerCertificateMetadata.serverCertificateName) &&
        Objects.equals(this.serverCertificateId, serverCertificateServerCertificateMetadata.serverCertificateId) &&
        Objects.equals(this.arn, serverCertificateServerCertificateMetadata.arn) &&
        Objects.equals(this.uploadDate, serverCertificateServerCertificateMetadata.uploadDate) &&
        Objects.equals(this.expiration, serverCertificateServerCertificateMetadata.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, serverCertificateName, serverCertificateId, arn, uploadDate, expiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerCertificateServerCertificateMetadata {\n");
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

