package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BatchRequestActionOptions;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An action object for use in a batch request.
 */

@Schema(name = "BatchRequestAction", description = "An action object for use in a batch request.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class BatchRequestAction {

  private Object data;

  /**
   * The HTTP method you wish to emulate for the action.
   */
  public enum MethodEnum {
    GET("get"),
    
    POST("post"),
    
    PUT("put"),
    
    DELETE("delete"),
    
    PATCH("patch"),
    
    HEAD("head");

    private String value;

    MethodEnum(String value) {
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
    public static MethodEnum fromValue(String value) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MethodEnum method;

  private BatchRequestActionOptions options;

  private String relativePath;

  public BatchRequestAction() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BatchRequestAction(MethodEnum method, String relativePath) {
    this.method = method;
    this.relativePath = relativePath;
  }

  public BatchRequestAction data(Object data) {
    this.data = data;
    return this;
  }

  /**
   * For `GET` requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in `options` instead. For `POST`, `PATCH`, and `PUT` methods, this should be the content you would have normally put in the data field of the body.
   * @return data
  */
  
  @Schema(name = "data", example = "{\"assignee\":\"me\",\"workspace\":\"1337\"}", description = "For `GET` requests, this should be a map of query parameters you would have normally passed in the URL. Options and pagination are not accepted here; put them in `options` instead. For `POST`, `PATCH`, and `PUT` methods, this should be the content you would have normally put in the data field of the body.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public BatchRequestAction method(MethodEnum method) {
    this.method = method;
    return this;
  }

  /**
   * The HTTP method you wish to emulate for the action.
   * @return method
  */
  @NotNull 
  @Schema(name = "method", example = "get", description = "The HTTP method you wish to emulate for the action.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("method")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public BatchRequestAction options(BatchRequestActionOptions options) {
    this.options = options;
    return this;
  }

  /**
   * Get options
   * @return options
  */
  @Valid 
  @Schema(name = "options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("options")
  public BatchRequestActionOptions getOptions() {
    return options;
  }

  public void setOptions(BatchRequestActionOptions options) {
    this.options = options;
  }

  public BatchRequestAction relativePath(String relativePath) {
    this.relativePath = relativePath;
    return this;
  }

  /**
   * The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in `data` instead.
   * @return relativePath
  */
  @NotNull 
  @Schema(name = "relative_path", example = "/tasks/123", description = "The path of the desired endpoint relative to the API’s base URL. Query parameters are not accepted here; put them in `data` instead.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("relative_path")
  public String getRelativePath() {
    return relativePath;
  }

  public void setRelativePath(String relativePath) {
    this.relativePath = relativePath;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchRequestAction batchRequestAction = (BatchRequestAction) o;
    return Objects.equals(this.data, batchRequestAction.data) &&
        Objects.equals(this.method, batchRequestAction.method) &&
        Objects.equals(this.options, batchRequestAction.options) &&
        Objects.equals(this.relativePath, batchRequestAction.relativePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, method, options, relativePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchRequestAction {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
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

