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
 * DeleteServerCertificateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class DeleteServerCertificateRequest {

  private String serverCertificateName;

  public DeleteServerCertificateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeleteServerCertificateRequest(String serverCertificateName) {
    this.serverCertificateName = serverCertificateName;
  }

  public DeleteServerCertificateRequest serverCertificateName(String serverCertificateName) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteServerCertificateRequest deleteServerCertificateRequest = (DeleteServerCertificateRequest) o;
    return Objects.equals(this.serverCertificateName, deleteServerCertificateRequest.serverCertificateName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverCertificateName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteServerCertificateRequest {\n");
    sb.append("    serverCertificateName: ").append(toIndentedString(serverCertificateName)).append("\n");
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

