package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PerfPowerMetricAttributes
 */

@JsonTypeName("PerfPowerMetric_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class PerfPowerMetricAttributes {

  private String deviceType;

  /**
   * Gets or Sets metricType
   */
  public enum MetricTypeEnum {
    DISK("DISK"),
    
    HANG("HANG"),
    
    BATTERY("BATTERY"),
    
    LAUNCH("LAUNCH"),
    
    MEMORY("MEMORY"),
    
    ANIMATION("ANIMATION"),
    
    TERMINATION("TERMINATION");

    private String value;

    MetricTypeEnum(String value) {
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
    public static MetricTypeEnum fromValue(String value) {
      for (MetricTypeEnum b : MetricTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MetricTypeEnum metricType;

  /**
   * Gets or Sets platform
   */
  public enum PlatformEnum {
    IOS("IOS");

    private String value;

    PlatformEnum(String value) {
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
    public static PlatformEnum fromValue(String value) {
      for (PlatformEnum b : PlatformEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private PlatformEnum platform;

  public PerfPowerMetricAttributes deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Get deviceType
   * @return deviceType
  */
  
  @Schema(name = "deviceType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deviceType")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public PerfPowerMetricAttributes metricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
    return this;
  }

  /**
   * Get metricType
   * @return metricType
  */
  
  @Schema(name = "metricType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metricType")
  public MetricTypeEnum getMetricType() {
    return metricType;
  }

  public void setMetricType(MetricTypeEnum metricType) {
    this.metricType = metricType;
  }

  public PerfPowerMetricAttributes platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  
  @Schema(name = "platform", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("platform")
  public PlatformEnum getPlatform() {
    return platform;
  }

  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerfPowerMetricAttributes perfPowerMetricAttributes = (PerfPowerMetricAttributes) o;
    return Objects.equals(this.deviceType, perfPowerMetricAttributes.deviceType) &&
        Objects.equals(this.metricType, perfPowerMetricAttributes.metricType) &&
        Objects.equals(this.platform, perfPowerMetricAttributes.platform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, metricType, platform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerfPowerMetricAttributes {\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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

