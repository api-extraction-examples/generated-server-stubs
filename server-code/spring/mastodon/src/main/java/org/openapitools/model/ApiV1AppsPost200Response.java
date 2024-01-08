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
 * ApiV1AppsPost200Response
 */

@JsonTypeName("_api_v1_apps_post_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class ApiV1AppsPost200Response {

  private String clientId;

  private String clientSecret;

  private String id;

  private String name;

  private String redirectUri;

  private String vapidKey;

  private String website;

  public ApiV1AppsPost200Response clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Get clientId
   * @return clientId
  */
  
  @Schema(name = "client_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public ApiV1AppsPost200Response clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Get clientSecret
   * @return clientSecret
  */
  
  @Schema(name = "client_secret", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public ApiV1AppsPost200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApiV1AppsPost200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiV1AppsPost200Response redirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
    return this;
  }

  /**
   * Get redirectUri
   * @return redirectUri
  */
  
  @Schema(name = "redirect_uri", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("redirect_uri")
  public String getRedirectUri() {
    return redirectUri;
  }

  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }

  public ApiV1AppsPost200Response vapidKey(String vapidKey) {
    this.vapidKey = vapidKey;
    return this;
  }

  /**
   * Get vapidKey
   * @return vapidKey
  */
  
  @Schema(name = "vapid_key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vapid_key")
  public String getVapidKey() {
    return vapidKey;
  }

  public void setVapidKey(String vapidKey) {
    this.vapidKey = vapidKey;
  }

  public ApiV1AppsPost200Response website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
  */
  
  @Schema(name = "website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ApiV1AppsPost200Response apiV1AppsPost200Response = (ApiV1AppsPost200Response) o;
    return Objects.equals(this.clientId, apiV1AppsPost200Response.clientId) &&
        Objects.equals(this.clientSecret, apiV1AppsPost200Response.clientSecret) &&
        Objects.equals(this.id, apiV1AppsPost200Response.id) &&
        Objects.equals(this.name, apiV1AppsPost200Response.name) &&
        Objects.equals(this.redirectUri, apiV1AppsPost200Response.redirectUri) &&
        Objects.equals(this.vapidKey, apiV1AppsPost200Response.vapidKey) &&
        Objects.equals(this.website, apiV1AppsPost200Response.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, id, name, redirectUri, vapidKey, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV1AppsPost200Response {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    vapidKey: ").append(toIndentedString(vapidKey)).append("\n");
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

