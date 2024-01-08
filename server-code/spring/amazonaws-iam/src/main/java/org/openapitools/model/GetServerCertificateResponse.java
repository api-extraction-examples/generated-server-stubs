package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GetServerCertificateResponseServerCertificate;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetServerCertificate&lt;/a&gt; request. 
 */

@Schema(name = "GetServerCertificateResponse", description = "Contains the response to a successful <a>GetServerCertificate</a> request. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetServerCertificateResponse {

  private GetServerCertificateResponseServerCertificate serverCertificate;

  public GetServerCertificateResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetServerCertificateResponse(GetServerCertificateResponseServerCertificate serverCertificate) {
    this.serverCertificate = serverCertificate;
  }

  public GetServerCertificateResponse serverCertificate(GetServerCertificateResponseServerCertificate serverCertificate) {
    this.serverCertificate = serverCertificate;
    return this;
  }

  /**
   * Get serverCertificate
   * @return serverCertificate
  */
  @NotNull @Valid 
  @Schema(name = "ServerCertificate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ServerCertificate")
  public GetServerCertificateResponseServerCertificate getServerCertificate() {
    return serverCertificate;
  }

  public void setServerCertificate(GetServerCertificateResponseServerCertificate serverCertificate) {
    this.serverCertificate = serverCertificate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetServerCertificateResponse getServerCertificateResponse = (GetServerCertificateResponse) o;
    return Objects.equals(this.serverCertificate, getServerCertificateResponse.serverCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetServerCertificateResponse {\n");
    sb.append("    serverCertificate: ").append(toIndentedString(serverCertificate)).append("\n");
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

