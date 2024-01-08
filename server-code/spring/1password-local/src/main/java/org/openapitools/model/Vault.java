package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Vault
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class Vault {

  private Integer attributeVersion;

  private Integer contentVersion;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  private String description;

  private String id;

  private Integer items;

  private String name;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    USER_CREATED("USER_CREATED"),
    
    PERSONAL("PERSONAL"),
    
    EVERYONE("EVERYONE"),
    
    TRANSFER("TRANSFER");

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

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public Vault attributeVersion(Integer attributeVersion) {
    this.attributeVersion = attributeVersion;
    return this;
  }

  /**
   * The vault version
   * @return attributeVersion
  */
  
  @Schema(name = "attributeVersion", description = "The vault version", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributeVersion")
  public Integer getAttributeVersion() {
    return attributeVersion;
  }

  public void setAttributeVersion(Integer attributeVersion) {
    this.attributeVersion = attributeVersion;
  }

  public Vault contentVersion(Integer contentVersion) {
    this.contentVersion = contentVersion;
    return this;
  }

  /**
   * The version of the vault contents
   * @return contentVersion
  */
  
  @Schema(name = "contentVersion", description = "The version of the vault contents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentVersion")
  public Integer getContentVersion() {
    return contentVersion;
  }

  public void setContentVersion(Integer contentVersion) {
    this.contentVersion = contentVersion;
  }

  public Vault createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Vault description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Vault id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @Pattern(regexp = "^[\\da-z]{26}$") 
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Vault items(Integer items) {
    this.items = items;
    return this;
  }

  /**
   * Number of active items in the vault
   * @return items
  */
  
  @Schema(name = "items", description = "Number of active items in the vault", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public Integer getItems() {
    return items;
  }

  public void setItems(Integer items) {
    this.items = items;
  }

  public Vault name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vault type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Vault updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @Valid 
  @Schema(name = "updatedAt", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updatedAt")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Vault vault = (Vault) o;
    return Objects.equals(this.attributeVersion, vault.attributeVersion) &&
        Objects.equals(this.contentVersion, vault.contentVersion) &&
        Objects.equals(this.createdAt, vault.createdAt) &&
        Objects.equals(this.description, vault.description) &&
        Objects.equals(this.id, vault.id) &&
        Objects.equals(this.items, vault.items) &&
        Objects.equals(this.name, vault.name) &&
        Objects.equals(this.type, vault.type) &&
        Objects.equals(this.updatedAt, vault.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributeVersion, contentVersion, createdAt, description, id, items, name, type, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Vault {\n");
    sb.append("    attributeVersion: ").append(toIndentedString(attributeVersion)).append("\n");
    sb.append("    contentVersion: ").append(toIndentedString(contentVersion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

