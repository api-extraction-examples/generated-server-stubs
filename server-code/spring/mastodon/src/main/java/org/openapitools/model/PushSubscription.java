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
 * Represents a subscription to the push streaming server.
 */

@Schema(name = "PushSubscription", description = "Represents a subscription to the push streaming server.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:10.316579-04:00[America/Lower_Princes]")
public class PushSubscription {

  private Object alerts;

  private String endpoint;

  private String id;

  private String serverKey;

  public PushSubscription() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PushSubscription(Object alerts, String endpoint, String id, String serverKey) {
    this.alerts = alerts;
    this.endpoint = endpoint;
    this.id = id;
    this.serverKey = serverKey;
  }

  public PushSubscription alerts(Object alerts) {
    this.alerts = alerts;
    return this;
  }

  /**
   * Which alerts should be delivered to the `endpoint`.
   * @return alerts
  */
  @NotNull 
  @Schema(name = "alerts", description = "Which alerts should be delivered to the `endpoint`.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("alerts")
  public Object getAlerts() {
    return alerts;
  }

  public void setAlerts(Object alerts) {
    this.alerts = alerts;
  }

  public PushSubscription endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Where push alerts will be sent to.
   * @return endpoint
  */
  @NotNull 
  @Schema(name = "endpoint", description = "Where push alerts will be sent to.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("endpoint")
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public PushSubscription id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the push subscription in the database. Cast from an integer, but not guaranteed to be a number.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the push subscription in the database. Cast from an integer, but not guaranteed to be a number.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PushSubscription serverKey(String serverKey) {
    this.serverKey = serverKey;
    return this;
  }

  /**
   * The streaming server's VAPID key.
   * @return serverKey
  */
  @NotNull 
  @Schema(name = "server_key", description = "The streaming server's VAPID key.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("server_key")
  public String getServerKey() {
    return serverKey;
  }

  public void setServerKey(String serverKey) {
    this.serverKey = serverKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushSubscription pushSubscription = (PushSubscription) o;
    return Objects.equals(this.alerts, pushSubscription.alerts) &&
        Objects.equals(this.endpoint, pushSubscription.endpoint) &&
        Objects.equals(this.id, pushSubscription.id) &&
        Objects.equals(this.serverKey, pushSubscription.serverKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alerts, endpoint, id, serverKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushSubscription {\n");
    sb.append("    alerts: ").append(toIndentedString(alerts)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
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

