package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ApiHealthConnectors;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * API Healt response object
 */

@Schema(name = "ApiHealth", description = "API Healt response object")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:01.362611-04:00[America/Lower_Princes]")
public class ApiHealth {

  @Valid
  private List<@Valid ApiHealthConnectors> connectors;

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

  public ApiHealth() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ApiHealth(StatusEnum status) {
    this.status = status;
  }

  public ApiHealth connectors(List<@Valid ApiHealthConnectors> connectors) {
    this.connectors = connectors;
    return this;
  }

  public ApiHealth addConnectorsItem(ApiHealthConnectors connectorsItem) {
    if (this.connectors == null) {
      this.connectors = new ArrayList<>();
    }
    this.connectors.add(connectorsItem);
    return this;
  }

  /**
   * Connector availability
   * @return connectors
  */
  @Valid 
  @Schema(name = "connectors", description = "Connector availability", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectors")
  public List<@Valid ApiHealthConnectors> getConnectors() {
    return connectors;
  }

  public void setConnectors(List<@Valid ApiHealthConnectors> connectors) {
    this.connectors = connectors;
  }

  public ApiHealth status(StatusEnum status) {
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

  public ApiHealth statusMessage(String statusMessage) {
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
    ApiHealth apiHealth = (ApiHealth) o;
    return Objects.equals(this.connectors, apiHealth.connectors) &&
        Objects.equals(this.status, apiHealth.status) &&
        Objects.equals(this.statusMessage, apiHealth.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectors, status, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiHealth {\n");
    sb.append("    connectors: ").append(toIndentedString(connectors)).append("\n");
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

