package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CapabilitySetting;
import org.openapitools.model.CapabilityType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BundleIdCapabilityAttributes
 */

@JsonTypeName("BundleIdCapability_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class BundleIdCapabilityAttributes {

  private CapabilityType capabilityType;

  @Valid
  private List<@Valid CapabilitySetting> settings;

  public BundleIdCapabilityAttributes capabilityType(CapabilityType capabilityType) {
    this.capabilityType = capabilityType;
    return this;
  }

  /**
   * Get capabilityType
   * @return capabilityType
  */
  @Valid 
  @Schema(name = "capabilityType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("capabilityType")
  public CapabilityType getCapabilityType() {
    return capabilityType;
  }

  public void setCapabilityType(CapabilityType capabilityType) {
    this.capabilityType = capabilityType;
  }

  public BundleIdCapabilityAttributes settings(List<@Valid CapabilitySetting> settings) {
    this.settings = settings;
    return this;
  }

  public BundleIdCapabilityAttributes addSettingsItem(CapabilitySetting settingsItem) {
    if (this.settings == null) {
      this.settings = new ArrayList<>();
    }
    this.settings.add(settingsItem);
    return this;
  }

  /**
   * Get settings
   * @return settings
  */
  @Valid 
  @Schema(name = "settings", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("settings")
  public List<@Valid CapabilitySetting> getSettings() {
    return settings;
  }

  public void setSettings(List<@Valid CapabilitySetting> settings) {
    this.settings = settings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleIdCapabilityAttributes bundleIdCapabilityAttributes = (BundleIdCapabilityAttributes) o;
    return Objects.equals(this.capabilityType, bundleIdCapabilityAttributes.capabilityType) &&
        Objects.equals(this.settings, bundleIdCapabilityAttributes.settings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilityType, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleIdCapabilityAttributes {\n");
    sb.append("    capabilityType: ").append(toIndentedString(capabilityType)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

