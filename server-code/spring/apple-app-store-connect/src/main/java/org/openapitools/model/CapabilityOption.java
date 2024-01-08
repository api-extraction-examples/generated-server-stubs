package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CapabilityOption
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class CapabilityOption {

  private String description;

  private Boolean enabled;

  private Boolean enabledByDefault;

  /**
   * Gets or Sets key
   */
  public enum KeyEnum {
    XCODE_5("XCODE_5"),
    
    XCODE_6("XCODE_6"),
    
    COMPLETE_PROTECTION("COMPLETE_PROTECTION"),
    
    PROTECTED_UNLESS_OPEN("PROTECTED_UNLESS_OPEN"),
    
    PROTECTED_UNTIL_FIRST_USER_AUTH("PROTECTED_UNTIL_FIRST_USER_AUTH"),
    
    PRIMARY_APP_CONSENT("PRIMARY_APP_CONSENT");

    private String value;

    KeyEnum(String value) {
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
    public static KeyEnum fromValue(String value) {
      for (KeyEnum b : KeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private KeyEnum key;

  private String name;

  private Boolean supportsWildcard;

  public CapabilityOption description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CapabilityOption enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  */
  
  @Schema(name = "enabled", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CapabilityOption enabledByDefault(Boolean enabledByDefault) {
    this.enabledByDefault = enabledByDefault;
    return this;
  }

  /**
   * Get enabledByDefault
   * @return enabledByDefault
  */
  
  @Schema(name = "enabledByDefault", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabledByDefault")
  public Boolean getEnabledByDefault() {
    return enabledByDefault;
  }

  public void setEnabledByDefault(Boolean enabledByDefault) {
    this.enabledByDefault = enabledByDefault;
  }

  public CapabilityOption key(KeyEnum key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
  */
  
  @Schema(name = "key", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public KeyEnum getKey() {
    return key;
  }

  public void setKey(KeyEnum key) {
    this.key = key;
  }

  public CapabilityOption name(String name) {
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

  public CapabilityOption supportsWildcard(Boolean supportsWildcard) {
    this.supportsWildcard = supportsWildcard;
    return this;
  }

  /**
   * Get supportsWildcard
   * @return supportsWildcard
  */
  
  @Schema(name = "supportsWildcard", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportsWildcard")
  public Boolean getSupportsWildcard() {
    return supportsWildcard;
  }

  public void setSupportsWildcard(Boolean supportsWildcard) {
    this.supportsWildcard = supportsWildcard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilityOption capabilityOption = (CapabilityOption) o;
    return Objects.equals(this.description, capabilityOption.description) &&
        Objects.equals(this.enabled, capabilityOption.enabled) &&
        Objects.equals(this.enabledByDefault, capabilityOption.enabledByDefault) &&
        Objects.equals(this.key, capabilityOption.key) &&
        Objects.equals(this.name, capabilityOption.name) &&
        Objects.equals(this.supportsWildcard, capabilityOption.supportsWildcard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enabled, enabledByDefault, key, name, supportsWildcard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilityOption {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enabledByDefault: ").append(toIndentedString(enabledByDefault)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    supportsWildcard: ").append(toIndentedString(supportsWildcard)).append("\n");
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

