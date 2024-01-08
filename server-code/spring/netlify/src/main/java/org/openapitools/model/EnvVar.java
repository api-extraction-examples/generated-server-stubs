package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnvVarUser;
import org.openapitools.model.EnvVarValue;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Environment variable model definition
 */

@Schema(name = "envVar", description = "Environment variable model definition")
@JsonTypeName("envVar")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:52:42.313754-04:00[America/Lower_Princes]")
public class EnvVar {

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  private EnvVarUser updatedBy;

  @Valid
  private List<@Valid EnvVarValue> values;

  public EnvVar key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The environment variable key, like ALGOLIA_ID (case-sensitive)
   * @return key
  */
  
  @Schema(name = "key", description = "The environment variable key, like ALGOLIA_ID (case-sensitive)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public EnvVar scopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
    return this;
  }

  public EnvVar addScopesItem(ScopesEnum scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

  /**
   * The scopes that this environment variable is set to
   * @return scopes
  */
  
  @Schema(name = "scopes", description = "The scopes that this environment variable is set to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scopes")
  public List<ScopesEnum> getScopes() {
    return scopes;
  }

  public void setScopes(List<ScopesEnum> scopes) {
    this.scopes = scopes;
  }

  public EnvVar updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp of when the value was last updated
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updated_at", description = "The timestamp of when the value was last updated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_at")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public EnvVar updatedBy(EnvVarUser updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
  */
  @Valid 
  @Schema(name = "updated_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_by")
  public EnvVarUser getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(EnvVarUser updatedBy) {
    this.updatedBy = updatedBy;
  }

  public EnvVar values(List<@Valid EnvVarValue> values) {
    this.values = values;
    return this;
  }

  public EnvVar addValuesItem(EnvVarValue valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * An array of Value objects containing values and metadata
   * @return values
  */
  @Valid 
  @Schema(name = "values", description = "An array of Value objects containing values and metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    EnvVar envVar = (EnvVar) o;
    return Objects.equals(this.key, envVar.key) &&
        Objects.equals(this.scopes, envVar.scopes) &&
        Objects.equals(this.updatedAt, envVar.updatedAt) &&
        Objects.equals(this.updatedBy, envVar.updatedBy) &&
        Objects.equals(this.values, envVar.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, scopes, updatedAt, updatedBy, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnvVar {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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

