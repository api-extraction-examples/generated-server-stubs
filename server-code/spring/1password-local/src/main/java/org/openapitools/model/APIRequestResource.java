package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.APIRequestResourceItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * APIRequestResource
 */

@JsonTypeName("APIRequest_resource")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:26.239496-04:00[America/Lower_Princes]")
public class APIRequestResource {

  private APIRequestResourceItem item;

  private Integer itemVersion;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ITEM("ITEM"),
    
    VAULT("VAULT");

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

  private APIRequestResourceItem vault;

  public APIRequestResource item(APIRequestResourceItem item) {
    this.item = item;
    return this;
  }

  /**
   * Get item
   * @return item
  */
  @Valid 
  @Schema(name = "item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item")
  public APIRequestResourceItem getItem() {
    return item;
  }

  public void setItem(APIRequestResourceItem item) {
    this.item = item;
  }

  public APIRequestResource itemVersion(Integer itemVersion) {
    this.itemVersion = itemVersion;
    return this;
  }

  /**
   * Get itemVersion
   * @return itemVersion
  */
  
  @Schema(name = "itemVersion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("itemVersion")
  public Integer getItemVersion() {
    return itemVersion;
  }

  public void setItemVersion(Integer itemVersion) {
    this.itemVersion = itemVersion;
  }

  public APIRequestResource type(TypeEnum type) {
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

  public APIRequestResource vault(APIRequestResourceItem vault) {
    this.vault = vault;
    return this;
  }

  /**
   * Get vault
   * @return vault
  */
  @Valid 
  @Schema(name = "vault", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vault")
  public APIRequestResourceItem getVault() {
    return vault;
  }

  public void setVault(APIRequestResourceItem vault) {
    this.vault = vault;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIRequestResource apIRequestResource = (APIRequestResource) o;
    return Objects.equals(this.item, apIRequestResource.item) &&
        Objects.equals(this.itemVersion, apIRequestResource.itemVersion) &&
        Objects.equals(this.type, apIRequestResource.type) &&
        Objects.equals(this.vault, apIRequestResource.vault);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, itemVersion, type, vault);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIRequestResource {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemVersion: ").append(toIndentedString(itemVersion)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    vault: ").append(toIndentedString(vault)).append("\n");
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

