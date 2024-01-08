package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * EntityPropertyDetails
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class EntityPropertyDetails {

  private BigDecimal entityId;

  private String key;

  private String value;

  public EntityPropertyDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EntityPropertyDetails(BigDecimal entityId, String key, String value) {
    this.entityId = entityId;
    this.key = key;
    this.value = value;
  }

  public EntityPropertyDetails entityId(BigDecimal entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The entity property ID.
   * @return entityId
  */
  @NotNull @Valid 
  @Schema(name = "entityId", example = "123", description = "The entity property ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("entityId")
  public BigDecimal getEntityId() {
    return entityId;
  }

  public void setEntityId(BigDecimal entityId) {
    this.entityId = entityId;
  }

  public EntityPropertyDetails key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The entity property key.
   * @return key
  */
  @NotNull 
  @Schema(name = "key", example = "mykey", description = "The entity property key.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public EntityPropertyDetails value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The new value of the entity property.
   * @return value
  */
  @NotNull 
  @Schema(name = "value", example = "newValue", description = "The new value of the entity property.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    EntityPropertyDetails entityPropertyDetails = (EntityPropertyDetails) o;
    return Objects.equals(this.entityId, entityPropertyDetails.entityId) &&
        Objects.equals(this.key, entityPropertyDetails.key) &&
        Objects.equals(this.value, entityPropertyDetails.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityPropertyDetails {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

