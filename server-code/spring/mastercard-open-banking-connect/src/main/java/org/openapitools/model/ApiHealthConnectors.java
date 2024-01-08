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
 * ApiHealthConnectors
 */

@JsonTypeName("ApiHealth_connectors")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class ApiHealthConnectors {

  private String name;

  /**
   * Overall connect platform availability status
   */
  public enum StatusEnum {
    UP("UP"),
    
    DOWN("DOWN"),
    
    DEGRADED("DEGRADED");

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

  private String statusMessage;

  public ApiHealthConnectors() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiHealthConnectors(String name, StatusEnum status) {
    this.name = name;
    this.status = status;
  }

  public ApiHealthConnectors name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Connector name
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Buffalo", description = "Connector name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApiHealthConnectors status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Overall connect platform availability status
   * @return status
  */
  @NotNull 
  @Schema(name = "status", example = "UP", description = "Overall connect platform availability status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ApiHealthConnectors statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Additional informational message
   * @return statusMessage
  */
  
  @Schema(name = "statusMessage", example = "", description = "Additional informational message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statusMessage")
  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiHealthConnectors apiHealthConnectors = (ApiHealthConnectors) o;
    return Objects.equals(this.name, apiHealthConnectors.name) &&
        Objects.equals(this.status, apiHealthConnectors.status) &&
        Objects.equals(this.statusMessage, apiHealthConnectors.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, status, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiHealthConnectors {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
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

