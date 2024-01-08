package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CapabilityOption;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CapabilitySetting
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class CapabilitySetting {

  /**
   * Gets or Sets allowedInstances
   */
  public enum AllowedInstancesEnum {
    ENTRY("ENTRY"),
    
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    AllowedInstancesEnum(String value) {
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
    public static AllowedInstancesEnum fromValue(String value) {
      for (AllowedInstancesEnum b : AllowedInstancesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AllowedInstancesEnum allowedInstances;

  private String description;

  private Boolean enabledByDefault;

  /**
   * Gets or Sets key
   */
  public enum KeyEnum {
    ICLOUD_VERSION("ICLOUD_VERSION"),
    
    DATA_PROTECTION_PERMISSION_LEVEL("DATA_PROTECTION_PERMISSION_LEVEL"),
    
    APPLE_ID_AUTH_APP_CONSENT("APPLE_ID_AUTH_APP_CONSENT");

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

  private Integer minInstances;

  private String name;

  @Valid
  private List<@Valid CapabilityOption> options;

  private Boolean visible;

  public CapabilitySetting allowedInstances(AllowedInstancesEnum allowedInstances) {
    this.allowedInstances = allowedInstances;
    return this;
  }

  /**
   * Get allowedInstances
   * @return allowedInstances
  */
  
  @Schema(name = "allowedInstances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedInstances")
  public AllowedInstancesEnum getAllowedInstances() {
    return allowedInstances;
  }

  public void setAllowedInstances(AllowedInstancesEnum allowedInstances) {
    this.allowedInstances = allowedInstances;
  }

  public CapabilitySetting description(String description) {
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

  public CapabilitySetting enabledByDefault(Boolean enabledByDefault) {
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

  public CapabilitySetting key(KeyEnum key) {
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

  public CapabilitySetting minInstances(Integer minInstances) {
    this.minInstances = minInstances;
    return this;
  }

  /**
   * Get minInstances
   * @return minInstances
  */
  
  @Schema(name = "minInstances", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minInstances")
  public Integer getMinInstances() {
    return minInstances;
  }

  public void setMinInstances(Integer minInstances) {
    this.minInstances = minInstances;
  }

  public CapabilitySetting name(String name) {
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

  public CapabilitySetting options(List<@Valid CapabilityOption> options) {
    this.options = options;
    return this;
  }

  public CapabilitySetting addOptionsItem(CapabilityOption optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  */
  @Valid 
  @Schema(name = "options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public List<@Valid CapabilityOption> getOptions() {
    return options;
  }

  public void setOptions(List<@Valid CapabilityOption> options) {
    this.options = options;
  }

  public CapabilitySetting visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

  /**
   * Get visible
   * @return visible
  */
  
  @Schema(name = "visible", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visible")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapabilitySetting capabilitySetting = (CapabilitySetting) o;
    return Objects.equals(this.allowedInstances, capabilitySetting.allowedInstances) &&
        Objects.equals(this.description, capabilitySetting.description) &&
        Objects.equals(this.enabledByDefault, capabilitySetting.enabledByDefault) &&
        Objects.equals(this.key, capabilitySetting.key) &&
        Objects.equals(this.minInstances, capabilitySetting.minInstances) &&
        Objects.equals(this.name, capabilitySetting.name) &&
        Objects.equals(this.options, capabilitySetting.options) &&
        Objects.equals(this.visible, capabilitySetting.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedInstances, description, enabledByDefault, key, minInstances, name, options, visible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapabilitySetting {\n");
    sb.append("    allowedInstances: ").append(toIndentedString(allowedInstances)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabledByDefault: ").append(toIndentedString(enabledByDefault)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    minInstances: ").append(toIndentedString(minInstances)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

