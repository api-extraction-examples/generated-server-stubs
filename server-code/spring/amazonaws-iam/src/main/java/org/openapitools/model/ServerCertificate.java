package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * &lt;p&gt;Contains information about a server certificate.&lt;/p&gt; &lt;p&gt; This data type is used as a response element in the &lt;a&gt;GetServerCertificate&lt;/a&gt; operation. &lt;/p&gt;
 */

@Schema(name = "ServerCertificate", description = "<p>Contains information about a server certificate.</p> <p> This data type is used as a response element in the <a>GetServerCertificate</a> operation. </p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class ServerCertificate {

  private ServerCertificateServerCertificateMetadata serverCertificateMetadata;

  private String certificateBody;

  private String certificateChain;

  private List tags;

  public ServerCertificate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ServerCertificate(ServerCertificateServerCertificateMetadata serverCertificateMetadata, String certificateBody) {
    this.serverCertificateMetadata = serverCertificateMetadata;
    this.certificateBody = certificateBody;
  }

  public ServerCertificate serverCertificateMetadata(ServerCertificateServerCertificateMetadata serverCertificateMetadata) {
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

  public ServerCertificate certificateBody(String certificateBody) {
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

  public ServerCertificate certificateChain(String certificateChain) {
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

  public ServerCertificate tags(List tags) {
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
    ServerCertificate serverCertificate = (ServerCertificate) o;
    return Objects.equals(this.serverCertificateMetadata, serverCertificate.serverCertificateMetadata) &&
        Objects.equals(this.certificateBody, serverCertificate.certificateBody) &&
        Objects.equals(this.certificateChain, serverCertificate.certificateChain) &&
        Objects.equals(this.tags, serverCertificate.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverCertificateMetadata, certificateBody, certificateChain, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerCertificate {\n");
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

