package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CustomFieldCompactAllOfDateValue;
import org.openapitools.model.CustomFieldCompactAllOfEnumValue;
import org.openapitools.model.EnumOption;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CustomFieldCompact
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class CustomFieldCompact {

  private String gid;

  private String resourceType;

  private CustomFieldCompactAllOfDateValue dateValue;

  private JsonNullable<String> displayValue = JsonNullable.<String>undefined();

  private Boolean enabled;

  @Valid
  private List<@Valid EnumOption> enumOptions;

  private CustomFieldCompactAllOfEnumValue enumValue;

  @Valid
  private List<@Valid EnumOption> multiEnumValues;

  private String name;

  private BigDecimal numberValue;

  /**
   * The type of the custom field. Must be one of the given values. 
   */
  public enum ResourceSubtypeEnum {
    TEXT("text"),
    
    ENUM("enum"),
    
    MULTI_ENUM("multi_enum"),
    
    NUMBER("number"),
    
    DATE("date"),
    
    PEOPLE("people");

    private String value;

    ResourceSubtypeEnum(String value) {
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
    public static ResourceSubtypeEnum fromValue(String value) {
      for (ResourceSubtypeEnum b : ResourceSubtypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ResourceSubtypeEnum resourceSubtype;

  private String textValue;

  /**
   * *Deprecated: new integrations should prefer the resource_subtype field.* The type of the custom field. Must be one of the given values. 
   */
  public enum TypeEnum {
    TEXT("text"),
    
    ENUM("enum"),
    
    MULTI_ENUM("multi_enum"),
    
    NUMBER("number");

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

  public CustomFieldCompact gid(String gid) {
    this.gid = gid;
    return this;
  }

  /**
   * Globally unique identifier of the resource, as a string.
   * @return gid
  */
  
  @Schema(name = "gid", accessMode = Schema.AccessMode.READ_ONLY, example = "12345", description = "Globally unique identifier of the resource, as a string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gid")
  public String getGid() {
    return gid;
  }

  public void setGid(String gid) {
    this.gid = gid;
  }

  public CustomFieldCompact resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * The base type of this resource.
   * @return resourceType
  */
  
  @Schema(name = "resource_type", accessMode = Schema.AccessMode.READ_ONLY, example = "task", description = "The base type of this resource.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_type")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public CustomFieldCompact dateValue(CustomFieldCompactAllOfDateValue dateValue) {
    this.dateValue = dateValue;
    return this;
  }

  /**
   * Get dateValue
   * @return dateValue
  */
  @Valid 
  @Schema(name = "date_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date_value")
  public CustomFieldCompactAllOfDateValue getDateValue() {
    return dateValue;
  }

  public void setDateValue(CustomFieldCompactAllOfDateValue dateValue) {
    this.dateValue = dateValue;
  }

  public CustomFieldCompact displayValue(String displayValue) {
    this.displayValue = JsonNullable.of(displayValue);
    return this;
  }

  /**
   * A string representation for the value of the custom field. Integrations that don't require the underlying type should use this field to read values. Using this field will future-proof an app against new custom field types.
   * @return displayValue
  */
  
  @Schema(name = "display_value", accessMode = Schema.AccessMode.READ_ONLY, example = "blue", description = "A string representation for the value of the custom field. Integrations that don't require the underlying type should use this field to read values. Using this field will future-proof an app against new custom field types.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_value")
  public JsonNullable<String> getDisplayValue() {
    return displayValue;
  }

  public void setDisplayValue(JsonNullable<String> displayValue) {
    this.displayValue = displayValue;
  }

  public CustomFieldCompact enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * *Conditional*. Determines if the custom field is enabled or not.
   * @return enabled
  */
  
  @Schema(name = "enabled", example = "true", description = "*Conditional*. Determines if the custom field is enabled or not.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CustomFieldCompact enumOptions(List<@Valid EnumOption> enumOptions) {
    this.enumOptions = enumOptions;
    return this;
  }

  public CustomFieldCompact addEnumOptionsItem(EnumOption enumOptionsItem) {
    if (this.enumOptions == null) {
      this.enumOptions = new ArrayList<>();
    }
    this.enumOptions.add(enumOptionsItem);
    return this;
  }

  /**
   * *Conditional*. Only relevant for custom fields of type `enum`. This array specifies the possible values which an `enum` custom field can adopt. To modify the enum options, refer to [working with enum options](/docs/create-an-enum-option).
   * @return enumOptions
  */
  @Valid 
  @Schema(name = "enum_options", description = "*Conditional*. Only relevant for custom fields of type `enum`. This array specifies the possible values which an `enum` custom field can adopt. To modify the enum options, refer to [working with enum options](/docs/create-an-enum-option).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enum_options")
  public List<@Valid EnumOption> getEnumOptions() {
    return enumOptions;
  }

  public void setEnumOptions(List<@Valid EnumOption> enumOptions) {
    this.enumOptions = enumOptions;
  }

  public CustomFieldCompact enumValue(CustomFieldCompactAllOfEnumValue enumValue) {
    this.enumValue = enumValue;
    return this;
  }

  /**
   * Get enumValue
   * @return enumValue
  */
  @Valid 
  @Schema(name = "enum_value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enum_value")
  public CustomFieldCompactAllOfEnumValue getEnumValue() {
    return enumValue;
  }

  public void setEnumValue(CustomFieldCompactAllOfEnumValue enumValue) {
    this.enumValue = enumValue;
  }

  public CustomFieldCompact multiEnumValues(List<@Valid EnumOption> multiEnumValues) {
    this.multiEnumValues = multiEnumValues;
    return this;
  }

  public CustomFieldCompact addMultiEnumValuesItem(EnumOption multiEnumValuesItem) {
    if (this.multiEnumValues == null) {
      this.multiEnumValues = new ArrayList<>();
    }
    this.multiEnumValues.add(multiEnumValuesItem);
    return this;
  }

  /**
   * *Conditional*. Only relevant for custom fields of type `multi_enum`. This object is the chosen values of a `multi_enum` custom field.
   * @return multiEnumValues
  */
  @Valid 
  @Schema(name = "multi_enum_values", description = "*Conditional*. Only relevant for custom fields of type `multi_enum`. This object is the chosen values of a `multi_enum` custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("multi_enum_values")
  public List<@Valid EnumOption> getMultiEnumValues() {
    return multiEnumValues;
  }

  public void setMultiEnumValues(List<@Valid EnumOption> multiEnumValues) {
    this.multiEnumValues = multiEnumValues;
  }

  public CustomFieldCompact name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the custom field.
   * @return name
  */
  
  @Schema(name = "name", example = "Status", description = "The name of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomFieldCompact numberValue(BigDecimal numberValue) {
    this.numberValue = numberValue;
    return this;
  }

  /**
   * *Conditional*. This number is the value of a `number` custom field.
   * @return numberValue
  */
  @Valid 
  @Schema(name = "number_value", example = "5.2", description = "*Conditional*. This number is the value of a `number` custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number_value")
  public BigDecimal getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(BigDecimal numberValue) {
    this.numberValue = numberValue;
  }

  public CustomFieldCompact resourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The type of the custom field. Must be one of the given values. 
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", example = "text", description = "The type of the custom field. Must be one of the given values. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public CustomFieldCompact textValue(String textValue) {
    this.textValue = textValue;
    return this;
  }

  /**
   * *Conditional*. This string is the value of a `text` custom field.
   * @return textValue
  */
  
  @Schema(name = "text_value", example = "Some Value", description = "*Conditional*. This string is the value of a `text` custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text_value")
  public String getTextValue() {
    return textValue;
  }

  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }

  public CustomFieldCompact type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * *Deprecated: new integrations should prefer the resource_subtype field.* The type of the custom field. Must be one of the given values. 
   * @return type
  */
  
  @Schema(name = "type", accessMode = Schema.AccessMode.READ_ONLY, description = "*Deprecated: new integrations should prefer the resource_subtype field.* The type of the custom field. Must be one of the given values. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CustomFieldCompact customFieldCompact = (CustomFieldCompact) o;
    return Objects.equals(this.gid, customFieldCompact.gid) &&
        Objects.equals(this.resourceType, customFieldCompact.resourceType) &&
        Objects.equals(this.dateValue, customFieldCompact.dateValue) &&
        equalsNullable(this.displayValue, customFieldCompact.displayValue) &&
        Objects.equals(this.enabled, customFieldCompact.enabled) &&
        Objects.equals(this.enumOptions, customFieldCompact.enumOptions) &&
        Objects.equals(this.enumValue, customFieldCompact.enumValue) &&
        Objects.equals(this.multiEnumValues, customFieldCompact.multiEnumValues) &&
        Objects.equals(this.name, customFieldCompact.name) &&
        Objects.equals(this.numberValue, customFieldCompact.numberValue) &&
        Objects.equals(this.resourceSubtype, customFieldCompact.resourceSubtype) &&
        Objects.equals(this.textValue, customFieldCompact.textValue) &&
        Objects.equals(this.type, customFieldCompact.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, dateValue, hashCodeNullable(displayValue), enabled, enumOptions, enumValue, multiEnumValues, name, numberValue, resourceSubtype, textValue, type);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldCompact {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    dateValue: ").append(toIndentedString(dateValue)).append("\n");
    sb.append("    displayValue: ").append(toIndentedString(displayValue)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    enumOptions: ").append(toIndentedString(enumOptions)).append("\n");
    sb.append("    enumValue: ").append(toIndentedString(enumValue)).append("\n");
    sb.append("    multiEnumValues: ").append(toIndentedString(multiEnumValues)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
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

