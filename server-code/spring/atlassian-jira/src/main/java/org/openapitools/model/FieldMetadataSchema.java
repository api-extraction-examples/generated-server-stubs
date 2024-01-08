package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The data type of the field.
 */

@Schema(name = "FieldMetadata_schema", description = "The data type of the field.")
@JsonTypeName("FieldMetadata_schema")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldMetadataSchema {

  @Valid
  private Map<String, Object> _configuration = new HashMap<>();

  private String custom;

  private Long customId;

  private String items;

  private String system;

  private String type;

  public FieldMetadataSchema() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldMetadataSchema(String type) {
    this.type = type;
  }

  public FieldMetadataSchema _configuration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
    return this;
  }

  public FieldMetadataSchema putConfigurationItem(String key, Object _configurationItem) {
    if (this._configuration == null) {
      this._configuration = new HashMap<>();
    }
    this._configuration.put(key, _configurationItem);
    return this;
  }

  /**
   * If the field is a custom field, the configuration of the field.
   * @return _configuration
  */
  
  @Schema(name = "configuration", accessMode = Schema.AccessMode.READ_ONLY, description = "If the field is a custom field, the configuration of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("configuration")
  public Map<String, Object> getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(Map<String, Object> _configuration) {
    this._configuration = _configuration;
  }

  public FieldMetadataSchema custom(String custom) {
    this.custom = custom;
    return this;
  }

  /**
   * If the field is a custom field, the URI of the field.
   * @return custom
  */
  
  @Schema(name = "custom", accessMode = Schema.AccessMode.READ_ONLY, description = "If the field is a custom field, the URI of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom")
  public String getCustom() {
    return custom;
  }

  public void setCustom(String custom) {
    this.custom = custom;
  }

  public FieldMetadataSchema customId(Long customId) {
    this.customId = customId;
    return this;
  }

  /**
   * If the field is a custom field, the custom ID of the field.
   * @return customId
  */
  
  @Schema(name = "customId", accessMode = Schema.AccessMode.READ_ONLY, description = "If the field is a custom field, the custom ID of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customId")
  public Long getCustomId() {
    return customId;
  }

  public void setCustomId(Long customId) {
    this.customId = customId;
  }

  public FieldMetadataSchema items(String items) {
    this.items = items;
    return this;
  }

  /**
   * When the data type is an array, the name of the field items within the array.
   * @return items
  */
  
  @Schema(name = "items", accessMode = Schema.AccessMode.READ_ONLY, description = "When the data type is an array, the name of the field items within the array.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public String getItems() {
    return items;
  }

  public void setItems(String items) {
    this.items = items;
  }

  public FieldMetadataSchema system(String system) {
    this.system = system;
    return this;
  }

  /**
   * If the field is a system field, the name of the field.
   * @return system
  */
  
  @Schema(name = "system", accessMode = Schema.AccessMode.READ_ONLY, description = "If the field is a system field, the name of the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("system")
  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public FieldMetadataSchema type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The data type of the field.
   * @return type
  */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "The data type of the field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    FieldMetadataSchema fieldMetadataSchema = (FieldMetadataSchema) o;
    return Objects.equals(this._configuration, fieldMetadataSchema._configuration) &&
        Objects.equals(this.custom, fieldMetadataSchema.custom) &&
        Objects.equals(this.customId, fieldMetadataSchema.customId) &&
        Objects.equals(this.items, fieldMetadataSchema.items) &&
        Objects.equals(this.system, fieldMetadataSchema.system) &&
        Objects.equals(this.type, fieldMetadataSchema.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, custom, customId, items, system, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldMetadataSchema {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
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

