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
import org.openapitools.model.EnvVarValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateEnvVarsRequestInner
 */

@JsonTypeName("createEnvVars_request_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class CreateEnvVarsRequestInner {

  private String key;

  /**
   * Gets or Sets scopes
   */
  public enum ScopesEnum {
    BUILDS("builds"),
    
    FUNCTIONS("functions"),
    
    RUNTIME("runtime"),
    
    POST_PROCESSING("post-processing");

    private String value;

    ScopesEnum(String value) {
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
    public static ScopesEnum fromValue(String value) {
      for (ScopesEnum b : ScopesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @Valid
  private List<ScopesEnum> scopes;

  @Valid
  private List<@Valid EnvVarValue> values;

  public CreateEnvVarsRequestInner key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The existing or new name of the key, if you wish to rename it (case-sensitive)
   * @return key
  */
  
  @Schema(name = "key", description = "The existing or new name of the key, if you wish to rename it (case-sensitive)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CreateEnvVarsRequestInner scopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
    return this;
  }

  public CreateEnvVarsRequestInner addScopesItem(ScopesEnum scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * The scopes that this environment variable is set to (Pro plans and above)
   * @return scopes
  */
  
  @Schema(name = "scopes", description = "The scopes that this environment variable is set to (Pro plans and above)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public List<ScopesEnum> getScopes() {
    return scopes;
  }

  public void setScopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
  }

  public CreateEnvVarsRequestInner values(List<@Valid EnvVarValue> values) {
    this.values = values;
    return this;
  }

  public CreateEnvVarsRequestInner addValuesItem(EnvVarValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @Valid 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<@Valid EnvVarValue> getValues() {
    return values;
  }

  public void setValues(List<@Valid EnvVarValue> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEnvVarsRequestInner createEnvVarsRequestInner = (CreateEnvVarsRequestInner) o;
    return Objects.equals(this.key, createEnvVarsRequestInner.key) &&
        Objects.equals(this.scopes, createEnvVarsRequestInner.scopes) &&
        Objects.equals(this.values, createEnvVarsRequestInner.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, scopes, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEnvVarsRequestInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

