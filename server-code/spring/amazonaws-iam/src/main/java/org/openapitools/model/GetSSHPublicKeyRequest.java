package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.EncodingType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetSSHPublicKeyRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetSSHPublicKeyRequest {

  private String userName;

  private String ssHPublicKeyId;

  private EncodingType encoding;

  public GetSSHPublicKeyRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetSSHPublicKeyRequest(String userName, String ssHPublicKeyId, EncodingType encoding) {
    this.userName = userName;
    this.ssHPublicKeyId = ssHPublicKeyId;
    this.encoding = encoding;
  }

  public GetSSHPublicKeyRequest userName(String userName) {
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

  public GetSSHPublicKeyRequest ssHPublicKeyId(String ssHPublicKeyId) {
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

  public GetSSHPublicKeyRequest encoding(EncodingType encoding) {
    this.encoding = encoding;
    return this;
  }

  /**
   * Get encoding
   * @return encoding
  */
  @NotNull @Valid 
  @Schema(name = "Encoding", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Encoding")
  public EncodingType getEncoding() {
    return encoding;
  }

  public void setEncoding(EncodingType encoding) {
    this.encoding = encoding;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSSHPublicKeyRequest getSSHPublicKeyRequest = (GetSSHPublicKeyRequest) o;
    return Objects.equals(this.userName, getSSHPublicKeyRequest.userName) &&
        Objects.equals(this.ssHPublicKeyId, getSSHPublicKeyRequest.ssHPublicKeyId) &&
        Objects.equals(this.encoding, getSSHPublicKeyRequest.encoding);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, ssHPublicKeyId, encoding);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSSHPublicKeyRequest {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    ssHPublicKeyId: ").append(toIndentedString(ssHPublicKeyId)).append("\n");
    sb.append("    encoding: ").append(toIndentedString(encoding)).append("\n");
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

