package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Full representation of the connection.
 */

@Schema(name = "Connection", description = "Full representation of the connection.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:53.320742-04:00[America/Lower_Princes]")
public class Connection {

  private String connType;

  private String connectionId;

  private JsonNullable<String> description = JsonNullable.<String>undefined();

  private JsonNullable<String> host = JsonNullable.<String>undefined();

  private JsonNullable<String> login = JsonNullable.<String>undefined();

  private JsonNullable<Integer> port = JsonNullable.<Integer>undefined();

  private JsonNullable<String> schema = JsonNullable.<String>undefined();

  private JsonNullable<String> extra = JsonNullable.<String>undefined();

  private String password;

  public Connection connType(String connType) {
    this.connType = connType;
    return this;
  }

  /**
   * The connection type.
   * @return connType
  */
  
  @Schema(name = "conn_type", description = "The connection type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("conn_type")
  public String getConnType() {
    return connType;
  }

  public void setConnType(String connType) {
    this.connType = connType;
  }

  public Connection connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

  /**
   * The connection ID.
   * @return connectionId
  */
  
  @Schema(name = "connection_id", description = "The connection ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connection_id")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }

  public Connection description(String description) {
    this.description = JsonNullable.of(description);
    return this;
  }

  /**
   * The description of the connection.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the connection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public JsonNullable<String> getDescription() {
    return description;
  }

  public void setDescription(JsonNullable<String> description) {
    this.description = description;
  }

  public Connection host(String host) {
    this.host = JsonNullable.of(host);
    return this;
  }

  /**
   * Host of the connection.
   * @return host
  */
  
  @Schema(name = "host", description = "Host of the connection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("host")
  public JsonNullable<String> getHost() {
    return host;
  }

  public void setHost(JsonNullable<String> host) {
    this.host = host;
  }

  public Connection login(String login) {
    this.login = JsonNullable.of(login);
    return this;
  }

  /**
   * Login of the connection.
   * @return login
  */
  
  @Schema(name = "login", description = "Login of the connection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("login")
  public JsonNullable<String> getLogin() {
    return login;
  }

  public void setLogin(JsonNullable<String> login) {
    this.login = login;
  }

  public Connection port(Integer port) {
    this.port = JsonNullable.of(port);
    return this;
  }

  /**
   * Port of the connection.
   * @return port
  */
  
  @Schema(name = "port", description = "Port of the connection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("port")
  public JsonNullable<Integer> getPort() {
    return port;
  }

  public void setPort(JsonNullable<Integer> port) {
    this.port = port;
  }

  public Connection schema(String schema) {
    this.schema = JsonNullable.of(schema);
    return this;
  }

  /**
   * Schema of the connection.
   * @return schema
  */
  
  @Schema(name = "schema", description = "Schema of the connection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("schema")
  public JsonNullable<String> getSchema() {
    return schema;
  }

  public void setSchema(JsonNullable<String> schema) {
    this.schema = schema;
  }

  public Connection extra(String extra) {
    this.extra = JsonNullable.of(extra);
    return this;
  }

  /**
   * Other values that cannot be put into another field, e.g. RSA keys.
   * @return extra
  */
  
  @Schema(name = "extra", description = "Other values that cannot be put into another field, e.g. RSA keys.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("extra")
  public JsonNullable<String> getExtra() {
    return extra;
  }

  public void setExtra(JsonNullable<String> extra) {
    this.extra = extra;
  }

  public Connection password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password of the connection.
   * @return password
  */
  
  @Schema(name = "password", description = "Password of the connection.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Connection connection = (Connection) o;
    return Objects.equals(this.connType, connection.connType) &&
        Objects.equals(this.connectionId, connection.connectionId) &&
        equalsNullable(this.description, connection.description) &&
        equalsNullable(this.host, connection.host) &&
        equalsNullable(this.login, connection.login) &&
        equalsNullable(this.port, connection.port) &&
        equalsNullable(this.schema, connection.schema) &&
        equalsNullable(this.extra, connection.extra) &&
        Objects.equals(this.password, connection.password);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(connType, connectionId, hashCodeNullable(description), hashCodeNullable(host), hashCodeNullable(login), hashCodeNullable(port), hashCodeNullable(schema), hashCodeNullable(extra), password);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Connection {\n");
    sb.append("    connType: ").append(toIndentedString(connType)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    password: ").append("*").append("\n");
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

