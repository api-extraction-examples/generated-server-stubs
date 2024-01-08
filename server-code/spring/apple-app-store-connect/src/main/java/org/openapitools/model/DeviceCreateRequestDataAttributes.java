package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BundleIdPlatform;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeviceCreateRequestDataAttributes
 */

@JsonTypeName("DeviceCreateRequest_data_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class DeviceCreateRequestDataAttributes {

  private String name;

  private BundleIdPlatform platform;

  private String udid;

  public DeviceCreateRequestDataAttributes() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DeviceCreateRequestDataAttributes(String name, BundleIdPlatform platform, String udid) {
    this.name = name;
    this.platform = platform;
    this.udid = udid;
  }

  public DeviceCreateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceCreateRequestDataAttributes platform(BundleIdPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @NotNull @Valid 
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("platform")
  public BundleIdPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(BundleIdPlatform platform) {
    this.platform = platform;
  }

  public DeviceCreateRequestDataAttributes udid(String udid) {
    this.udid = udid;
    return this;
  }

  /**
   * Get udid
   * @return udid
  */
  @NotNull 
  @Schema(name = "udid", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("udid")
  public String getUdid() {
    return udid;
  }

  public void setUdid(String udid) {
    this.udid = udid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceCreateRequestDataAttributes deviceCreateRequestDataAttributes = (DeviceCreateRequestDataAttributes) o;
    return Objects.equals(this.name, deviceCreateRequestDataAttributes.name) &&
        Objects.equals(this.platform, deviceCreateRequestDataAttributes.platform) &&
        Objects.equals(this.udid, deviceCreateRequestDataAttributes.udid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, platform, udid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceCreateRequestDataAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    udid: ").append(toIndentedString(udid)).append("\n");
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

