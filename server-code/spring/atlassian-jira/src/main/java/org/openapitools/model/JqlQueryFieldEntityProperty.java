package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an entity property.
 */

@Schema(name = "JqlQueryFieldEntityProperty", description = "Details of an entity property.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueryFieldEntityProperty {

  private String entity;

  private String key;

  private String path;

  /**
   * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
   */
  public enum TypeEnum {
    NUMBER("number"),
    
    STRING("string"),
    
    TEXT("text"),
    
    DATE("date"),
    
    USER("user");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private TypeEnum type;

  public JqlQueryFieldEntityProperty() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueryFieldEntityProperty(String entity, String key, String path) {
    this.entity = entity;
    this.key = key;
    this.path = path;
  }

  public JqlQueryFieldEntityProperty entity(String entity) {
    this.entity = entity;
    return this;
  }

  /**
   * The object on which the property is set.
   * @return entity
  */
  @NotNull 
  @Schema(name = "entity", example = "issue", description = "The object on which the property is set.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entity")
  public String getEntity() {
    return entity;
  }

  public void setEntity(String entity) {
    this.entity = entity;
  }

  public JqlQueryFieldEntityProperty key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the property.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "stats", description = "The key of the property.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public JqlQueryFieldEntityProperty path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path in the property value to query.
   * @return path
  */
  @NotNull 
  @Schema(name = "path", example = "comments.count", description = "The path in the property value to query.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("path")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public JqlQueryFieldEntityProperty type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.
   * @return type
  */
  
  @Schema(name = "type", example = "number", description = "The type of the property value extraction. Not available if the extraction for the property is not registered on the instance with the [Entity property](https://developer.atlassian.com/cloud/jira/platform/modules/entity-property/) module.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryFieldEntityProperty jqlQueryFieldEntityProperty = (JqlQueryFieldEntityProperty) o;
    return Objects.equals(this.entity, jqlQueryFieldEntityProperty.entity) &&
        Objects.equals(this.key, jqlQueryFieldEntityProperty.key) &&
        Objects.equals(this.path, jqlQueryFieldEntityProperty.path) &&
        Objects.equals(this.type, jqlQueryFieldEntityProperty.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entity, key, path, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryFieldEntityProperty {\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

