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
 * SetEnvVarValueRequest
 */

@JsonTypeName("setEnvVarValue_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class SetEnvVarValueRequest {

  /**
   * The deploy context in which this value will be used. `dev` refers to local development when running `netlify dev`.
   */
  public enum ContextEnum {
    DEV("dev"),
    
    BRANCH_DEPLOY("branch-deploy"),
    
    DEPLOY_PREVIEW("deploy-preview"),
    
    PRODUCTION("production");

    private String value;

    ContextEnum(String value) {
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
    public static ContextEnum fromValue(String value) {
      for (ContextEnum b : ContextEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ContextEnum context;

  private String value;

  public SetEnvVarValueRequest context(ContextEnum context) {
    this.context = context;
    return this;
  }

  /**
   * The deploy context in which this value will be used. `dev` refers to local development when running `netlify dev`.
   * @return context
  */
  
  @Schema(name = "context", description = "The deploy context in which this value will be used. `dev` refers to local development when running `netlify dev`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("context")
  public ContextEnum getContext() {
    return context;
  }

  public void setContext(ContextEnum context) {
    this.context = context;
  }

  public SetEnvVarValueRequest value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The environment variable's unencrypted value
   * @return value
  */
  
  @Schema(name = "value", description = "The environment variable's unencrypted value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetEnvVarValueRequest setEnvVarValueRequest = (SetEnvVarValueRequest) o;
    return Objects.equals(this.context, setEnvVarValueRequest.context) &&
        Objects.equals(this.value, setEnvVarValueRequest.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetEnvVarValueRequest {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

