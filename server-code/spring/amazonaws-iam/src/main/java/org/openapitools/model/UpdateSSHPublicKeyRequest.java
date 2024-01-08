package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.StatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateSSHPublicKeyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class UpdateSSHPublicKeyRequest {

  private String userName;

  private String ssHPublicKeyId;

  private StatusType status;

  public UpdateSSHPublicKeyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateSSHPublicKeyRequest(String userName, String ssHPublicKeyId, StatusType status) {
    this.userName = userName;
    this.ssHPublicKeyId = ssHPublicKeyId;
    this.status = status;
  }

  public UpdateSSHPublicKeyRequest userName(String userName) {
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

  public UpdateSSHPublicKeyRequest ssHPublicKeyId(String ssHPublicKeyId) {
    this.ssHPublicKeyId = ssHPublicKeyId;
    return this;
  }

  /**
   * Get ssHPublicKeyId
   * @return ssHPublicKeyId
  */
  @NotNull 
  @Schema(name = "SSHPublicKeyId", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SSHPublicKeyId")
  public String getSsHPublicKeyId() {
    return ssHPublicKeyId;
  }

  public void setSsHPublicKeyId(String ssHPublicKeyId) {
    this.ssHPublicKeyId = ssHPublicKeyId;
  }

  public UpdateSSHPublicKeyRequest status(StatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull @Valid 
  @Schema(name = "Status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Status")
  public StatusType getStatus() {
    return status;
  }

  public void setStatus(StatusType status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest = (UpdateSSHPublicKeyRequest) o;
    return Objects.equals(this.userName, updateSSHPublicKeyRequest.userName) &&
        Objects.equals(this.ssHPublicKeyId, updateSSHPublicKeyRequest.ssHPublicKeyId) &&
        Objects.equals(this.status, updateSSHPublicKeyRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, ssHPublicKeyId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSSHPublicKeyRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    ssHPublicKeyId: ").append(toIndentedString(ssHPublicKeyId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

