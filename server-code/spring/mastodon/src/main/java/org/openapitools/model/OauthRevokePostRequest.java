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
 * OauthRevokePostRequest
 */

@JsonTypeName("_oauth_revoke_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class OauthRevokePostRequest {

  private String clientId;

  private String clientSecret;

  private String token;

  public OauthRevokePostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OauthRevokePostRequest(String clientId, String clientSecret, String token) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.token = token;
  }

  public OauthRevokePostRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID, obtained during app registration
   * @return clientId
  */
  @NotNull 
  @Schema(name = "client_id", description = "Client ID, obtained during app registration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public OauthRevokePostRequest clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Client secret, obtained during app registration
   * @return clientSecret
  */
  @NotNull 
  @Schema(name = "client_secret", description = "Client secret, obtained during app registration", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("client_secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public OauthRevokePostRequest token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The previously obtained token, to be invalidated
   * @return token
  */
  @NotNull 
  @Schema(name = "token", description = "The previously obtained token, to be invalidated", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("token")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthRevokePostRequest oauthRevokePostRequest = (OauthRevokePostRequest) o;
    return Objects.equals(this.clientId, oauthRevokePostRequest.clientId) &&
        Objects.equals(this.clientSecret, oauthRevokePostRequest.clientSecret) &&
        Objects.equals(this.token, oauthRevokePostRequest.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthRevokePostRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

