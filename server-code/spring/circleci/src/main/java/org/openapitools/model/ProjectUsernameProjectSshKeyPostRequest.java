package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProjectUsernameProjectSshKeyPostRequest
 */

@JsonTypeName("_project__username___project__ssh_key_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:44:13.970205-04:00[America/Lower_Princes]")
public class ProjectUsernameProjectSshKeyPostRequest {

  private String hostname;

  private String privateKey;

  public ProjectUsernameProjectSshKeyPostRequest hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
  */
  
  @Schema(name = "hostname", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public ProjectUsernameProjectSshKeyPostRequest privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

  /**
   * Get privateKey
   * @return privateKey
  */
  
  @Schema(name = "private_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("private_key")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectUsernameProjectSshKeyPostRequest projectUsernameProjectSshKeyPostRequest = (ProjectUsernameProjectSshKeyPostRequest) o;
    return Objects.equals(this.hostname, projectUsernameProjectSshKeyPostRequest.hostname) &&
        Objects.equals(this.privateKey, projectUsernameProjectSshKeyPostRequest.privateKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, privateKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectUsernameProjectSshKeyPostRequest {\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
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

