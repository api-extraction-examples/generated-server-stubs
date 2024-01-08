package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateServerCertificateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateServerCertificateRequest {

  private String serverCertificateName;

  private String newPath;

  private String newServerCertificateName;

  public UpdateServerCertificateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateServerCertificateRequest(String serverCertificateName) {
    this.serverCertificateName = serverCertificateName;
  }

  public UpdateServerCertificateRequest serverCertificateName(String serverCertificateName) {
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

  public UpdateServerCertificateRequest newPath(String newPath) {
    this.newPath = newPath;
    return this;
  }

  /**
   * Get newPath
   * @return newPath
  */
  
  @Schema(name = "NewPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewPath")
  public String getNewPath() {
    return newPath;
  }

  public void setNewPath(String newPath) {
    this.newPath = newPath;
  }

  public UpdateServerCertificateRequest newServerCertificateName(String newServerCertificateName) {
    this.newServerCertificateName = newServerCertificateName;
    return this;
  }

  /**
   * Get newServerCertificateName
   * @return newServerCertificateName
  */
  
  @Schema(name = "NewServerCertificateName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("NewServerCertificateName")
  public String getNewServerCertificateName() {
    return newServerCertificateName;
  }

  public void setNewServerCertificateName(String newServerCertificateName) {
    this.newServerCertificateName = newServerCertificateName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServerCertificateRequest updateServerCertificateRequest = (UpdateServerCertificateRequest) o;
    return Objects.equals(this.serverCertificateName, updateServerCertificateRequest.serverCertificateName) &&
        Objects.equals(this.newPath, updateServerCertificateRequest.newPath) &&
        Objects.equals(this.newServerCertificateName, updateServerCertificateRequest.newServerCertificateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverCertificateName, newPath, newServerCertificateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServerCertificateRequest {\n");
    sb.append("    serverCertificateName: ").append(toIndentedString(serverCertificateName)).append("\n");
    sb.append("    newPath: ").append(toIndentedString(newPath)).append("\n");
    sb.append("    newServerCertificateName: ").append(toIndentedString(newServerCertificateName)).append("\n");
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

