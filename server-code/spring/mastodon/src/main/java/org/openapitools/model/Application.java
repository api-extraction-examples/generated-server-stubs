package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents an application that interfaces with the REST API to access accounts or post statuses.
 */

@Schema(name = "Application", description = "Represents an application that interfaces with the REST API to access accounts or post statuses.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class Application {

  private String clientId;

  private String clientSecret;

  private String name;

  private String vapidKey;

  private String website;

  public Application() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Application(String name) {
    this.name = name;
  }

  public Application clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Client ID key, to be used for obtaining OAuth tokens
   * @return clientId
  */
  
  @Schema(name = "client_id", description = "Client ID key, to be used for obtaining OAuth tokens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_id")
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public Application clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Client secret key, to be used for obtaining OAuth tokens
   * @return clientSecret
  */
  
  @Schema(name = "client_secret", description = "Client secret key, to be used for obtaining OAuth tokens", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("client_secret")
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  public Application name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of your application.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of your application.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Application vapidKey(String vapidKey) {
    this.vapidKey = vapidKey;
    return this;
  }

  /**
   * Used for Push Streaming API. Returned with [POST /api/v1/apps](https://docs.joinmastodon.org/methods/apps/#create-an-application). Equivalent to [PushSubscription#server_key](https://docs.joinmastodon.org/entities/pushsubscription/#server_key)
   * @return vapidKey
  */
  
  @Schema(name = "vapid_key", description = "Used for Push Streaming API. Returned with [POST /api/v1/apps](https://docs.joinmastodon.org/methods/apps/#create-an-application). Equivalent to [PushSubscription#server_key](https://docs.joinmastodon.org/entities/pushsubscription/#server_key)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vapid_key")
  public String getVapidKey() {
    return vapidKey;
  }

  public void setVapidKey(String vapidKey) {
    this.vapidKey = vapidKey;
  }

  public Application website(String website) {
    this.website = website;
    return this;
  }

  /**
   * The website associated with your application. Must be URL.
   * @return website
  */
  
  @Schema(name = "website", description = "The website associated with your application. Must be URL.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    Application application = (Application) o;
    return Objects.equals(this.clientId, application.clientId) &&
        Objects.equals(this.clientSecret, application.clientSecret) &&
        Objects.equals(this.name, application.name) &&
        Objects.equals(this.vapidKey, application.vapidKey) &&
        Objects.equals(this.website, application.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, name, vapidKey, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Application {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

