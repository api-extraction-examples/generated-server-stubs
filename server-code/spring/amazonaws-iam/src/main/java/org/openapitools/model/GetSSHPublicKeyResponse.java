package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.GetSSHPublicKeyResponseSSHPublicKey;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Contains the response to a successful &lt;a&gt;GetSSHPublicKey&lt;/a&gt; request.
 */

@Schema(name = "GetSSHPublicKeyResponse", description = "Contains the response to a successful <a>GetSSHPublicKey</a> request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class GetSSHPublicKeyResponse {

  private GetSSHPublicKeyResponseSSHPublicKey ssHPublicKey;

  public GetSSHPublicKeyResponse ssHPublicKey(GetSSHPublicKeyResponseSSHPublicKey ssHPublicKey) {
    this.ssHPublicKey = ssHPublicKey;
    return this;
  }

  /**
   * Get ssHPublicKey
   * @return ssHPublicKey
  */
  @Valid 
  @Schema(name = "SSHPublicKey", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("SSHPublicKey")
  public GetSSHPublicKeyResponseSSHPublicKey getSsHPublicKey() {
    return ssHPublicKey;
  }

  public void setSsHPublicKey(GetSSHPublicKeyResponseSSHPublicKey ssHPublicKey) {
    this.ssHPublicKey = ssHPublicKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSSHPublicKeyResponse getSSHPublicKeyResponse = (GetSSHPublicKeyResponse) o;
    return Objects.equals(this.ssHPublicKey, getSSHPublicKeyResponse.ssHPublicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ssHPublicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSSHPublicKeyResponse {\n");
    sb.append("    ssHPublicKey: ").append(toIndentedString(ssHPublicKey)).append("\n");
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

