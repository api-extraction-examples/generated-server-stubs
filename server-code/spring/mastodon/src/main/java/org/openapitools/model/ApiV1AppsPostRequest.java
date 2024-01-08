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
 * ApiV1AppsPostRequest
 */

@JsonTypeName("_api_v1_apps_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1AppsPostRequest {

  private String clientName;

  private String redirectUris;

  private String scopes;

  private String website;

  public ApiV1AppsPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiV1AppsPostRequest(String clientName, String redirectUris) {
    this.clientName = clientName;
    this.redirectUris = redirectUris;
  }

  public ApiV1AppsPostRequest clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }

  /**
   * A name for your application
   * @return clientName
  */
  @NotNull 
  @Schema(name = "client_name", description = "A name for your application", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("client_name")
  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public ApiV1AppsPostRequest redirectUris(String redirectUris) {
    this.redirectUris = redirectUris;
    return this;
  }

  /**
   * Where the user should be redirected after authorization. To display the authorization code to the user instead of redirecting to a web page, use urn:ietf:wg:oauth:2.0:oob in this parameter.
   * @return redirectUris
  */
  @NotNull 
  @Schema(name = "redirect_uris", description = "Where the user should be redirected after authorization. To display the authorization code to the user instead of redirecting to a web page, use urn:ietf:wg:oauth:2.0:oob in this parameter.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("redirect_uris")
  public String getRedirectUris() {
    return redirectUris;
  }

  public void setRedirectUris(String redirectUris) {
    this.redirectUris = redirectUris;
  }

  public ApiV1AppsPostRequest scopes(String scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * Space separated list of scopes. If none is provided, defaults to read.
   * @return scopes
  */
  
  @Schema(name = "scopes", description = "Space separated list of scopes. If none is provided, defaults to read.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public String getScopes() {
    return scopes;
  }

  public void setScopes(String scopes) {
    this.scopes = scopes;
  }

  public ApiV1AppsPostRequest website(String website) {
    this.website = website;
    return this;
  }

  /**
   * A URL to the homepage of your app
   * @return website
  */
  
  @Schema(name = "website", description = "A URL to the homepage of your app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV1AppsPostRequest apiV1AppsPostRequest = (ApiV1AppsPostRequest) o;
    return Objects.equals(this.clientName, apiV1AppsPostRequest.clientName) &&
        Objects.equals(this.redirectUris, apiV1AppsPostRequest.redirectUris) &&
        Objects.equals(this.scopes, apiV1AppsPostRequest.scopes) &&
        Objects.equals(this.website, apiV1AppsPostRequest.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientName, redirectUris, scopes, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AppsPostRequest {\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    redirectUris: ").append(toIndentedString(redirectUris)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
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

