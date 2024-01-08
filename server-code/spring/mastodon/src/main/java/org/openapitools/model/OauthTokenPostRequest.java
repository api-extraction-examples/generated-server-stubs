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
 * OauthTokenPostRequest
 */

@JsonTypeName("_oauth_token_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class OauthTokenPostRequest {

  private String clientId;

  private String clientSecret;

  private String code;

  private String grantType;

  private String redirectUri;

  private String scopes;

  public OauthTokenPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OauthTokenPostRequest(String clientId, String clientSecret, String grantType, String redirectUri) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
    this.grantType = grantType;
    this.redirectUri = redirectUri;
  }

  public OauthTokenPostRequest clientId(String clientId) {
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

  public OauthTokenPostRequest clientSecret(String clientSecret) {
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

  public OauthTokenPostRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * A user authorization code, obtained via /oauth/authorize
   * @return code
  */
  
  @Schema(name = "code", description = "A user authorization code, obtained via /oauth/authorize", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public OauthTokenPostRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * Set equal to authorization_code if code is provided in order to gain user-level access. Otherwise, set equal to client_credentials to obtain app-level access only.
   * @return grantType
  */
  @NotNull 
  @Schema(name = "grant_type", description = "Set equal to authorization_code if code is provided in order to gain user-level access. Otherwise, set equal to client_credentials to obtain app-level access only.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("grant_type")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public OauthTokenPostRequest redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Set a URI to redirect the user to. If this parameter is set to urn:ietf:wg:oauth:2.0:oob then the token will be shown instead. Must match one of the redirect URIs declared during app registration.
   * @return redirectUri
  */
  @NotNull 
  @Schema(name = "redirect_uri", description = "Set a URI to redirect the user to. If this parameter is set to urn:ietf:wg:oauth:2.0:oob then the token will be shown instead. Must match one of the redirect URIs declared during app registration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("redirect_uri")
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public OauthTokenPostRequest scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * List of requested OAuth scopes, separated by spaces. Must be a subset of scopes declared during app registration. If not provided, defaults to read.
   * @return scopes
  */
  
  @Schema(name = "scopes", description = "List of requested OAuth scopes, separated by spaces. Must be a subset of scopes declared during app registration. If not provided, defaults to read.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OauthTokenPostRequest oauthTokenPostRequest = (OauthTokenPostRequest) o;
    return Objects.equals(this.clientId, oauthTokenPostRequest.clientId) &&
        Objects.equals(this.clientSecret, oauthTokenPostRequest.clientSecret) &&
        Objects.equals(this.code, oauthTokenPostRequest.code) &&
        Objects.equals(this.grantType, oauthTokenPostRequest.grantType) &&
        Objects.equals(this.redirectUri, oauthTokenPostRequest.redirectUri) &&
        Objects.equals(this.scopes, oauthTokenPostRequest.scopes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, code, grantType, redirectUri, scopes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OauthTokenPostRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

