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
 * &lt;p&gt;Contains information about an SSH public key.&lt;/p&gt; &lt;p&gt;This data type is used as a response element in the &lt;a&gt;GetSSHPublicKey&lt;/a&gt; and &lt;a&gt;UploadSSHPublicKey&lt;/a&gt; operations. &lt;/p&gt;
 */

@Schema(name = "SSHPublicKey", description = "<p>Contains information about an SSH public key.</p> <p>This data type is used as a response element in the <a>GetSSHPublicKey</a> and <a>UploadSSHPublicKey</a> operations. </p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class SSHPublicKey {

  private String userName;

  private String ssHPublicKeyId;

  private String fingerprint;

  private String ssHPublicKeyBody;

  private StatusType status;

  private OffsetDateTime uploadDate;

  public SSHPublicKey() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SSHPublicKey(String userName, String ssHPublicKeyId, String fingerprint, String ssHPublicKeyBody, StatusType status) {
    this.userName = userName;
    this.ssHPublicKeyId = ssHPublicKeyId;
    this.fingerprint = fingerprint;
    this.ssHPublicKeyBody = ssHPublicKeyBody;
    this.status = status;
  }

  public SSHPublicKey userName(String userName) {
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

  public SSHPublicKey ssHPublicKeyId(String ssHPublicKeyId) {
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

  public SSHPublicKey fingerprint(String fingerprint) {
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

  public SSHPublicKey ssHPublicKeyBody(String ssHPublicKeyBody) {
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

  public SSHPublicKey status(StatusType status) {
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

  public SSHPublicKey uploadDate(OffsetDateTime uploadDate) {
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
    SSHPublicKey ssHPublicKey = (SSHPublicKey) o;
    return Objects.equals(this.userName, ssHPublicKey.userName) &&
        Objects.equals(this.ssHPublicKeyId, ssHPublicKey.ssHPublicKeyId) &&
        Objects.equals(this.fingerprint, ssHPublicKey.fingerprint) &&
        Objects.equals(this.ssHPublicKeyBody, ssHPublicKey.ssHPublicKeyBody) &&
        Objects.equals(this.status, ssHPublicKey.status) &&
        Objects.equals(this.uploadDate, ssHPublicKey.uploadDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, ssHPublicKeyId, fingerprint, ssHPublicKeyBody, status, uploadDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SSHPublicKey {\n");
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

