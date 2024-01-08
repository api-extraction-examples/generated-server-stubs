package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PermissionGrant;
import org.openapitools.model.Scope;
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
 * Details of a permission scheme.
 */

@Schema(name = "PermissionScheme", description = "Details of a permission scheme.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class PermissionScheme {

  private String description;

  private String expand;

  private Long id;

  private String name;

  @Valid
  private List<@Valid PermissionGrant> permissions;

  private Scope scope;

  private URI self;

  public PermissionScheme() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PermissionScheme(String name) {
    this.name = name;
  }

  public PermissionScheme description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for the permission scheme.
   * @return description
  */
  
  @Schema(name = "description", description = "A description for the permission scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PermissionScheme expand(String expand) {
    this.expand = expand;
    return this;
  }

  /**
   * The expand options available for the permission scheme.
   * @return expand
  */
  
  @Schema(name = "expand", accessMode = Schema.AccessMode.READ_ONLY, description = "The expand options available for the permission scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expand")
  public String getExpand() {
    return expand;
  }

  public void setExpand(String expand) {
    this.expand = expand;
  }

  public PermissionScheme id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the permission scheme.
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, description = "The ID of the permission scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PermissionScheme name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the permission scheme. Must be unique.
   * @return name
  */
  @NotNull 
  @Schema(name = "name", description = "The name of the permission scheme. Must be unique.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PermissionScheme permissions(List<@Valid PermissionGrant> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PermissionScheme addPermissionsItem(PermissionGrant permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

  /**
   * The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.
   * @return permissions
  */
  @Valid 
  @Schema(name = "permissions", description = "The permission scheme to create or update. See [About permission schemes and grants](../api-group-permission-schemes/#about-permission-schemes-and-grants) for more information.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("permissions")
  public List<@Valid PermissionGrant> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<@Valid PermissionGrant> permissions) {
    this.permissions = permissions;
  }

  public PermissionScheme scope(Scope scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
  */
  @Valid 
  @Schema(name = "scope", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("scope")
  public Scope getScope() {
    return scope;
  }

  public void setScope(Scope scope) {
    this.scope = scope;
  }

  public PermissionScheme self(URI self) {
    this.self = self;
    return this;
  }

  /**
   * The URL of the permission scheme.
   * @return self
  */
  @Valid 
  @Schema(name = "self", accessMode = Schema.AccessMode.READ_ONLY, description = "The URL of the permission scheme.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("self")
  public URI getSelf() {
    return self;
  }

  public void setSelf(URI self) {
    this.self = self;
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
    public PermissionScheme putAdditionalProperty(String key, Object value) {
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
    PermissionScheme permissionScheme = (PermissionScheme) o;
    return Objects.equals(this.description, permissionScheme.description) &&
        Objects.equals(this.expand, permissionScheme.expand) &&
        Objects.equals(this.id, permissionScheme.id) &&
        Objects.equals(this.name, permissionScheme.name) &&
        Objects.equals(this.permissions, permissionScheme.permissions) &&
        Objects.equals(this.scope, permissionScheme.scope) &&
        Objects.equals(this.self, permissionScheme.self) &&
    Objects.equals(this.additionalProperties, permissionScheme.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, expand, id, name, permissions, scope, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionScheme {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    
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

