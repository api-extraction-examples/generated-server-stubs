package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets CapabilityType
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public enum CapabilityType {
  
  ICLOUD("ICLOUD"),
  
  IN_APP_PURCHASE("IN_APP_PURCHASE"),
  
  GAME_CENTER("GAME_CENTER"),
  
  PUSH_NOTIFICATIONS("PUSH_NOTIFICATIONS"),
  
  WALLET("WALLET"),
  
  INTER_APP_AUDIO("INTER_APP_AUDIO"),
  
  MAPS("MAPS"),
  
  ASSOCIATED_DOMAINS("ASSOCIATED_DOMAINS"),
  
  PERSONAL_VPN("PERSONAL_VPN"),
  
  APP_GROUPS("APP_GROUPS"),
  
  HEALTHKIT("HEALTHKIT"),
  
  HOMEKIT("HOMEKIT"),
  
  WIRELESS_ACCESSORY_CONFIGURATION("WIRELESS_ACCESSORY_CONFIGURATION"),
  
  APPLE_PAY("APPLE_PAY"),
  
  DATA_PROTECTION("DATA_PROTECTION"),
  
  SIRIKIT("SIRIKIT"),
  
  NETWORK_EXTENSIONS("NETWORK_EXTENSIONS"),
  
  MULTIPATH("MULTIPATH"),
  
  HOT_SPOT("HOT_SPOT"),
  
  NFC_TAG_READING("NFC_TAG_READING"),
  
  CLASSKIT("CLASSKIT"),
  
  AUTOFILL_CREDENTIAL_PROVIDER("AUTOFILL_CREDENTIAL_PROVIDER"),
  
  ACCESS_WIFI_INFORMATION("ACCESS_WIFI_INFORMATION"),
  
  NETWORK_CUSTOM_PROTOCOL("NETWORK_CUSTOM_PROTOCOL"),
  
  COREMEDIA_HLS_LOW_LATENCY("COREMEDIA_HLS_LOW_LATENCY"),
  
  SYSTEM_EXTENSION_INSTALL("SYSTEM_EXTENSION_INSTALL"),
  
  USER_MANAGEMENT("USER_MANAGEMENT"),
  
  APPLE_ID_AUTH("APPLE_ID_AUTH");

  private String value;

  CapabilityType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CapabilityType fromValue(String value) {
    for (CapabilityType b : CapabilityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

