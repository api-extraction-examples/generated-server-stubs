package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of an application property.
 */

@Schema(name = "ApplicationProperty", description = "Details of an application property.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ApplicationProperty {

  @Valid
  private List<String> allowedValues;

  private String defaultValue;

  private String desc;

  private String example;

  private String id;

  private String key;

  private String name;

  private String type;

  private String value;

  public ApplicationProperty allowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
    return this;
  }

  public ApplicationProperty addAllowedValuesItem(String allowedValuesItem) {
    if (this.allowedValues == null) {
      this.allowedValues = new ArrayList<>();
    }
    this.allowedValues.add(allowedValuesItem);
    return this;
  }

  /**
   * The allowed values, if applicable.
   * @return allowedValues
  */
  
  @Schema(name = "allowedValues", description = "The allowed values, if applicable.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowedValues")
  public List<String> getAllowedValues() {
    return allowedValues;
  }

  public void setAllowedValues(List<String> allowedValues) {
    this.allowedValues = allowedValues;
  }

  public ApplicationProperty defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The default value of the application property.
   * @return defaultValue
  */
  
  @Schema(name = "defaultValue", description = "The default value of the application property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ApplicationProperty desc(String desc) {
    this.desc = desc;
    return this;
  }

  /**
   * The description of the application property.
   * @return desc
  */
  
  @Schema(name = "desc", description = "The description of the application property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("desc")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public ApplicationProperty example(String example) {
    this.example = example;
    return this;
  }

  /**
   * Get example
   * @return example
  */
  
  @Schema(name = "example", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("example")
  public String getExample() {
    return example;
  }

  public void setExample(String example) {
    this.example = example;
  }

  public ApplicationProperty id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the application property. The ID and key are the same.
   * @return id
  */
  
  @Schema(name = "id", description = "The ID of the application property. The ID and key are the same.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ApplicationProperty key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of the application property. The ID and key are the same.
   * @return key
  */
  
  @Schema(name = "key", description = "The key of the application property. The ID and key are the same.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("key")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ApplicationProperty name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the application property.
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the application property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationProperty type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The data type of the application property.
   * @return type
  */
  
  @Schema(name = "type", description = "The data type of the application property.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ApplicationProperty value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The new value.
   * @return value
  */
  
  @Schema(name = "value", description = "The new value.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    ApplicationProperty applicationProperty = (ApplicationProperty) o;
    return Objects.equals(this.allowedValues, applicationProperty.allowedValues) &&
        Objects.equals(this.defaultValue, applicationProperty.defaultValue) &&
        Objects.equals(this.desc, applicationProperty.desc) &&
        Objects.equals(this.example, applicationProperty.example) &&
        Objects.equals(this.id, applicationProperty.id) &&
        Objects.equals(this.key, applicationProperty.key) &&
        Objects.equals(this.name, applicationProperty.name) &&
        Objects.equals(this.type, applicationProperty.type) &&
        Objects.equals(this.value, applicationProperty.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedValues, defaultValue, desc, example, id, key, name, type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationProperty {\n");
    sb.append("    allowedValues: ").append(toIndentedString(allowedValues)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    example: ").append(toIndentedString(example)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

