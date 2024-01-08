package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import org.openapitools.model.StatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetSSHPublicKeyResponseSSHPublicKey
 */

@JsonTypeName("GetSSHPublicKeyResponse_SSHPublicKey")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetSSHPublicKeyResponseSSHPublicKey {

  private String userName;

  private String ssHPublicKeyId;

  private String fingerprint;

  private String ssHPublicKeyBody;

  private StatusType status;

  private OffsetDateTime uploadDate;

  public GetSSHPublicKeyResponseSSHPublicKey() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetSSHPublicKeyResponseSSHPublicKey(String userName, String ssHPublicKeyId, String fingerprint, String ssHPublicKeyBody, StatusType status) {
    this.userName = userName;
    this.ssHPublicKeyId = ssHPublicKeyId;
    this.fingerprint = fingerprint;
    this.ssHPublicKeyBody = ssHPublicKeyBody;
    this.status = status;
  }

  public GetSSHPublicKeyResponseSSHPublicKey userName(String userName) {
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

  public GetSSHPublicKeyResponseSSHPublicKey ssHPublicKeyId(String ssHPublicKeyId) {
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

  public GetSSHPublicKeyResponseSSHPublicKey fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Get fingerprint
   * @return fingerprint
  */
  @NotNull 
  @Schema(name = "Fingerprint", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public GetSSHPublicKeyResponseSSHPublicKey ssHPublicKeyBody(String ssHPublicKeyBody) {
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

  public GetSSHPublicKeyResponseSSHPublicKey status(StatusType status) {
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

  public GetSSHPublicKeyResponseSSHPublicKey uploadDate(OffsetDateTime uploadDate) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSSHPublicKeyResponseSSHPublicKey getSSHPublicKeyResponseSSHPublicKey = (GetSSHPublicKeyResponseSSHPublicKey) o;
    return Objects.equals(this.userName, getSSHPublicKeyResponseSSHPublicKey.userName) &&
        Objects.equals(this.ssHPublicKeyId, getSSHPublicKeyResponseSSHPublicKey.ssHPublicKeyId) &&
        Objects.equals(this.fingerprint, getSSHPublicKeyResponseSSHPublicKey.fingerprint) &&
        Objects.equals(this.ssHPublicKeyBody, getSSHPublicKeyResponseSSHPublicKey.ssHPublicKeyBody) &&
        Objects.equals(this.status, getSSHPublicKeyResponseSSHPublicKey.status) &&
        Objects.equals(this.uploadDate, getSSHPublicKeyResponseSSHPublicKey.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, ssHPublicKeyId, fingerprint, ssHPublicKeyBody, status, uploadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSSHPublicKeyResponseSSHPublicKey {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    ssHPublicKeyId: ").append(toIndentedString(ssHPublicKeyId)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    ssHPublicKeyBody: ").append(toIndentedString(ssHPublicKeyBody)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadDate: ").append(toIndentedString(uploadDate)).append("\n");
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

