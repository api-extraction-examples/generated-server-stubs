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

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of a permission and its availability to a user.
 */

@Schema(name = "UserPermission", description = "Details of a permission and its availability to a user.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class UserPermission {

  private Boolean deprecatedKey;

  private String description;

  private Boolean havePermission;

  private String id;

  private String key;

  private String name;

  /**
   * The type of the permission.
   */
  public enum TypeEnum {
    GLOBAL("GLOBAL"),
    
    PROJECT("PROJECT");

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

  public UserPermission deprecatedKey(Boolean deprecatedKey) {
    this.deprecatedKey = deprecatedKey;
    return this;
  }

  /**
   * Indicate whether the permission key is deprecated. Note that deprecated keys cannot be used in the `permissions parameter of Get my permissions. Deprecated keys are not returned by Get all permissions.`
   * @return deprecatedKey
  */
  
  @Schema(name = "deprecatedKey", description = "Indicate whether the permission key is deprecated. Note that deprecated keys cannot be used in the `permissions parameter of Get my permissions. Deprecated keys are not returned by Get all permissions.`", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deprecatedKey")
  public Boolean getDeprecatedKey() {
    return deprecatedKey;
  }

  public void setDeprecatedKey(Boolean deprecatedKey) {
    this.deprecatedKey = deprecatedKey;
  }

  public UserPermission description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the permission.
   * @return description
  */
  
  @Schema(name = "description", description = "The description of the permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UserPermission havePermission(Boolean havePermission) {
    this.havePermission = havePermission;
    return this;
  }

  /**
   * Whether the permission is available to the user in the queried context.
   * @return havePermission
  */
  
  @Schema(name = "havePermission", description = "Whether the permission is available to the user in the queried context.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("havePermission")
  public Boolean getHavePermission() {
    return havePermission;
  }

  public void setHavePermission(Boolean havePermission) {
    this.havePermission = havePermission;
  }

  public UserPermission id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserPermission key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.
   * @return key
  */
  
  @Schema(name = "key", description = "The key of the permission. Either `id` or `key` must be specified. Use [Get all permissions](#api-rest-api-3-permissions-get) to get the list of permissions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public UserPermission name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the permission.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserPermission type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the permission.
   * @return type
  */
  
  @Schema(name = "type", description = "The type of the permission.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public UserPermission putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPermission userPermission = (UserPermission) o;
    return Objects.equals(this.deprecatedKey, userPermission.deprecatedKey) &&
        Objects.equals(this.description, userPermission.description) &&
        Objects.equals(this.havePermission, userPermission.havePermission) &&
        Objects.equals(this.id, userPermission.id) &&
        Objects.equals(this.key, userPermission.key) &&
        Objects.equals(this.name, userPermission.name) &&
        Objects.equals(this.type, userPermission.type) &&
    Objects.equals(this.additionalProperties, userPermission.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deprecatedKey, description, havePermission, id, key, name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPermission {\n");
    sb.append("    deprecatedKey: ").append(toIndentedString(deprecatedKey)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    havePermission: ").append(toIndentedString(havePermission)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

