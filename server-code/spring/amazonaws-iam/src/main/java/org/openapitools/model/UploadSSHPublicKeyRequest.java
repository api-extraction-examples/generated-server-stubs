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
 * UploadSSHPublicKeyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UploadSSHPublicKeyRequest {

  private String userName;

  private String ssHPublicKeyBody;

  public UploadSSHPublicKeyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UploadSSHPublicKeyRequest(String userName, String ssHPublicKeyBody) {
    this.userName = userName;
    this.ssHPublicKeyBody = ssHPublicKeyBody;
  }

  public UploadSSHPublicKeyRequest userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * Get userName
   * @return userName
  */
  @NotNull 
  @Schema(name = "UserName", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("UserName")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public UploadSSHPublicKeyRequest ssHPublicKeyBody(String ssHPublicKeyBody) {
    this.ssHPublicKeyBody = ssHPublicKeyBody;
    return this;
  }

  /**
   * Get ssHPublicKeyBody
   * @return ssHPublicKeyBody
  */
  @NotNull 
  @Schema(name = "SSHPublicKeyBody", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SSHPublicKeyBody")
  public String getSsHPublicKeyBody() {
    return ssHPublicKeyBody;
  }

  public void setSsHPublicKeyBody(String ssHPublicKeyBody) {
    this.ssHPublicKeyBody = ssHPublicKeyBody;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest = (UploadSSHPublicKeyRequest) o;
    return Objects.equals(this.userName, uploadSSHPublicKeyRequest.userName) &&
        Objects.equals(this.ssHPublicKeyBody, uploadSSHPublicKeyRequest.ssHPublicKeyBody);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, ssHPublicKeyBody);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadSSHPublicKeyRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    ssHPublicKeyBody: ").append(toIndentedString(ssHPublicKeyBody)).append("\n");
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

