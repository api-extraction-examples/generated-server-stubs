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
 * Environment variable value model definition
 */

@Schema(name = "envVarValue", description = "Environment variable value model definition")
@JsonTypeName("envVarValue")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class EnvVarValue {

  /**
   * The deploy context in which this value will be used. `dev` refers to local development when running `netlify dev`.
   */
  public enum ContextEnum {
    ALL("all"),
    
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

  private String id;

  private String value;

  public EnvVarValue context(ContextEnum context) {
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

  public EnvVarValue id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The environment variable value's universally unique ID
   * @return id
  */
  
  @Schema(name = "id", description = "The environment variable value's universally unique ID", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EnvVarValue value(String value) {
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
    EnvVarValue envVarValue = (EnvVarValue) o;
    return Objects.equals(this.context, envVarValue.context) &&
        Objects.equals(this.id, envVarValue.id) &&
        Objects.equals(this.value, envVarValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(context, id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvVarValue {\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

