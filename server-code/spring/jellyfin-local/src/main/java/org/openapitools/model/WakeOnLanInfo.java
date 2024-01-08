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
 * Provides the MAC address and port for wake-on-LAN functionality.
 */

@Schema(name = "WakeOnLanInfo", description = "Provides the MAC address and port for wake-on-LAN functionality.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class WakeOnLanInfo {

  private JsonNullable<String> macAddress = JsonNullable.<String>undefined();

  private Integer port;

  public WakeOnLanInfo macAddress(String macAddress) {
    this.macAddress = JsonNullable.of(macAddress);
    return this;
  }

  /**
   * Gets the MAC address of the device.
   * @return macAddress
  */
  
  @Schema(name = "MacAddress", description = "Gets the MAC address of the device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("MacAddress")
  public JsonNullable<String> getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(JsonNullable<String> macAddress) {
    this.macAddress = macAddress;
  }

  public WakeOnLanInfo port(Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Gets or sets the wake-on-LAN port.
   * @return port
  */
  
  @Schema(name = "Port", description = "Gets or sets the wake-on-LAN port.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Port")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WakeOnLanInfo wakeOnLanInfo = (WakeOnLanInfo) o;
    return equalsNullable(this.macAddress, wakeOnLanInfo.macAddress) &&
        Objects.equals(this.port, wakeOnLanInfo.port);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(macAddress), port);
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
    sb.append("class WakeOnLanInfo {\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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

