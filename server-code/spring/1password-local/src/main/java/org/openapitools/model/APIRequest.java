package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.openapitools.model.APIRequestActor;
import org.openapitools.model.APIRequestResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Represents a request that was made to the API. Including what Token was used and what resource was accessed.
 */

@Schema(name = "APIRequest", description = "Represents a request that was made to the API. Including what Token was used and what resource was accessed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class APIRequest {

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    READ("READ"),
    
    CREATE("CREATE"),
    
    UPDATE("UPDATE"),
    
    DELETE("DELETE");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ActionEnum action;

  private APIRequestActor actor;

  private UUID requestId;

  private APIRequestResource resource;

  /**
   * Gets or Sets result
   */
  public enum ResultEnum {
    SUCCESS("SUCCESS"),
    
    DENY("DENY");

    private String value;

    ResultEnum(String value) {
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
    public static ResultEnum fromValue(String value) {
      for (ResultEnum b : ResultEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResultEnum result;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime timestamp;

  public APIRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
  
  @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }

  public APIRequest actor(APIRequestActor actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  */
  @Valid 
  @Schema(name = "actor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("actor")
  public APIRequestActor getActor() {
    return actor;
  }

  public void setActor(APIRequestActor actor) {
    this.actor = actor;
  }

  public APIRequest requestId(UUID requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * The unique id used to identify a single request.
   * @return requestId
  */
  @Valid 
  @Schema(name = "requestId", description = "The unique id used to identify a single request.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestId")
  public UUID getRequestId() {
    return requestId;
  }

  public void setRequestId(UUID requestId) {
    this.requestId = requestId;
  }

  public APIRequest resource(APIRequestResource resource) {
    this.resource = resource;
    return this;
  }

  /**
   * Get resource
   * @return resource
  */
  @Valid 
  @Schema(name = "resource", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource")
  public APIRequestResource getResource() {
    return resource;
  }

  public void setResource(APIRequestResource resource) {
    this.resource = resource;
  }

  public APIRequest result(ResultEnum result) {
    this.result = result;
    return this;
  }

  /**
   * Get result
   * @return result
  */
  
  @Schema(name = "result", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("result")
  public ResultEnum getResult() {
    return result;
  }

  public void setResult(ResultEnum result) {
    this.result = result;
  }

  public APIRequest timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The time at which the request was processed by the server.
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", accessMode = Schema.AccessMode.READ_ONLY, description = "The time at which the request was processed by the server.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIRequest apIRequest = (APIRequest) o;
    return Objects.equals(this.action, apIRequest.action) &&
        Objects.equals(this.actor, apIRequest.actor) &&
        Objects.equals(this.requestId, apIRequest.requestId) &&
        Objects.equals(this.resource, apIRequest.resource) &&
        Objects.equals(this.result, apIRequest.result) &&
        Objects.equals(this.timestamp, apIRequest.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actor, requestId, resource, result, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRequest {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

