package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.model.BundleIdPlatform;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeviceAttributes
 */

@JsonTypeName("Device_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class DeviceAttributes {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime addedDate;

  /**
   * Gets or Sets deviceClass
   */
  public enum DeviceClassEnum {
    APPLE_WATCH("APPLE_WATCH"),
    
    IPAD("IPAD"),
    
    IPHONE("IPHONE"),
    
    IPOD("IPOD"),
    
    APPLE_TV("APPLE_TV"),
    
    MAC("MAC");

    private String value;

    DeviceClassEnum(String value) {
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
    public static DeviceClassEnum fromValue(String value) {
      for (DeviceClassEnum b : DeviceClassEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DeviceClassEnum deviceClass;

  private String model;

  private String name;

  private BundleIdPlatform platform;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StatusEnum status;

  private String udid;

  public DeviceAttributes addedDate(OffsetDateTime addedDate) {
    this.addedDate = addedDate;
    return this;
  }

  /**
   * Get addedDate
   * @return addedDate
  */
  @Valid 
  @Schema(name = "addedDate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("addedDate")
  public OffsetDateTime getAddedDate() {
    return addedDate;
  }

  public void setAddedDate(OffsetDateTime addedDate) {
    this.addedDate = addedDate;
  }

  public DeviceAttributes deviceClass(DeviceClassEnum deviceClass) {
    this.deviceClass = deviceClass;
    return this;
  }

  /**
   * Get deviceClass
   * @return deviceClass
  */
  
  @Schema(name = "deviceClass", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceClass")
  public DeviceClassEnum getDeviceClass() {
    return deviceClass;
  }

  public void setDeviceClass(DeviceClassEnum deviceClass) {
    this.deviceClass = deviceClass;
  }

  public DeviceAttributes model(String model) {
    this.model = model;
    return this;
  }

  /**
   * Get model
   * @return model
  */
  
  @Schema(name = "model", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("model")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public DeviceAttributes name(String name) {
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

  public DeviceAttributes platform(BundleIdPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @Valid 
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public BundleIdPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(BundleIdPlatform platform) {
    this.platform = platform;
  }

  public DeviceAttributes status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DeviceAttributes udid(String udid) {
    this.udid = udid;
    return this;
  }

  /**
   * Get udid
   * @return udid
  */
  
  @Schema(name = "udid", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    DeviceAttributes deviceAttributes = (DeviceAttributes) o;
    return Objects.equals(this.addedDate, deviceAttributes.addedDate) &&
        Objects.equals(this.deviceClass, deviceAttributes.deviceClass) &&
        Objects.equals(this.model, deviceAttributes.model) &&
        Objects.equals(this.name, deviceAttributes.name) &&
        Objects.equals(this.platform, deviceAttributes.platform) &&
        Objects.equals(this.status, deviceAttributes.status) &&
        Objects.equals(this.udid, deviceAttributes.udid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addedDate, deviceClass, model, name, platform, status, udid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceAttributes {\n");
    sb.append("    addedDate: ").append(toIndentedString(addedDate)).append("\n");
    sb.append("    deviceClass: ").append(toIndentedString(deviceClass)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

