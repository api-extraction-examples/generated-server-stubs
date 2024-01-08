package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * &lt;p&gt;Contains information about an SSH public key, without the key&#39;s body or fingerprint.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;ListSSHPublicKeys&lt;/a&gt; operation.&lt;/p&gt;
 */

@Schema(name = "SSHPublicKeyMetadata", description = "<p>Contains information about an SSH public key, without the key's body or fingerprint.</p> <p>This data type is used as a response element in the <a>ListSSHPublicKeys</a> operation.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class SSHPublicKeyMetadata {

  private String userName;

  private String ssHPublicKeyId;

  private StatusType status;

  private OffsetDateTime uploadDate;

  public SSHPublicKeyMetadata() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SSHPublicKeyMetadata(String userName, String ssHPublicKeyId, StatusType status, OffsetDateTime uploadDate) {
    this.userName = userName;
    this.ssHPublicKeyId = ssHPublicKeyId;
    this.status = status;
    this.uploadDate = uploadDate;
  }

  public SSHPublicKeyMetadata userName(String userName) {
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

  public SSHPublicKeyMetadata ssHPublicKeyId(String ssHPublicKeyId) {
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

  public SSHPublicKeyMetadata status(StatusType status) {
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

  public SSHPublicKeyMetadata uploadDate(OffsetDateTime uploadDate) {
    this.uploadDate = uploadDate;
    return this;
  }

  /**
   * Get uploadDate
   * @return uploadDate
  */
  @NotNull @Valid 
  @Schema(name = "UploadDate", requiredMode = Schema.RequiredMode.REQUIRED)
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
    SSHPublicKeyMetadata ssHPublicKeyMetadata = (SSHPublicKeyMetadata) o;
    return Objects.equals(this.userName, ssHPublicKeyMetadata.userName) &&
        Objects.equals(this.ssHPublicKeyId, ssHPublicKeyMetadata.ssHPublicKeyId) &&
        Objects.equals(this.status, ssHPublicKeyMetadata.status) &&
        Objects.equals(this.uploadDate, ssHPublicKeyMetadata.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, ssHPublicKeyId, status, uploadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSHPublicKeyMetadata {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    ssHPublicKeyId: ").append(toIndentedString(ssHPublicKeyId)).append("\n");
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

