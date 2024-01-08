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
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * JsonNode
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JsonNode {

  private Boolean array;

  private Boolean bigDecimal;

  private Boolean bigInteger;

  private Integer bigIntegerValue;

  private Boolean binary;

  @Valid
  private List<byte[]> binaryValue;

  private Boolean _boolean;

  private Boolean booleanValue;

  private Boolean containerNode;

  private BigDecimal decimalValue;

  private Boolean _double;

  private Double doubleValue;

  private Object elements;

  private Object fieldNames;

  private Object fields;

  private Boolean floatingPointNumber;

  private Boolean _int;

  private Integer intValue;

  private Boolean integralNumber;

  private Boolean _long;

  private Long longValue;

  private Boolean missingNode;

  private Boolean _null;

  private Boolean number;

  /**
   * Gets or Sets numberType
   */
  public enum NumberTypeEnum {
    INT("INT"),
    
    LONG("LONG"),
    
    BIG_INTEGER("BIG_INTEGER"),
    
    FLOAT("FLOAT"),
    
    DOUBLE("DOUBLE"),
    
    BIG_DECIMAL("BIG_DECIMAL");

    private String value;

    NumberTypeEnum(String value) {
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
    public static NumberTypeEnum fromValue(String value) {
      for (NumberTypeEnum b : NumberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NumberTypeEnum numberType;

  private BigDecimal numberValue;

  private Boolean _object;

  private Boolean pojo;

  private String textValue;

  private Boolean textual;

  private Boolean valueAsBoolean;

  private Double valueAsDouble;

  private Integer valueAsInt;

  private Long valueAsLong;

  private String valueAsText;

  private Boolean valueNode;

  public JsonNode array(Boolean array) {
    this.array = array;
    return this;
  }

  /**
   * Get array
   * @return array
  */
  
  @Schema(name = "array", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("array")
  public Boolean getArray() {
    return array;
  }

  public void setArray(Boolean array) {
    this.array = array;
  }

  public JsonNode bigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
    return this;
  }

  /**
   * Get bigDecimal
   * @return bigDecimal
  */
  
  @Schema(name = "bigDecimal", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bigDecimal")
  public Boolean getBigDecimal() {
    return bigDecimal;
  }

  public void setBigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
  }

  public JsonNode bigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
    return this;
  }

  /**
   * Get bigInteger
   * @return bigInteger
  */
  
  @Schema(name = "bigInteger", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bigInteger")
  public Boolean getBigInteger() {
    return bigInteger;
  }

  public void setBigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
  }

  public JsonNode bigIntegerValue(Integer bigIntegerValue) {
    this.bigIntegerValue = bigIntegerValue;
    return this;
  }

  /**
   * Get bigIntegerValue
   * @return bigIntegerValue
  */
  
  @Schema(name = "bigIntegerValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bigIntegerValue")
  public Integer getBigIntegerValue() {
    return bigIntegerValue;
  }

  public void setBigIntegerValue(Integer bigIntegerValue) {
    this.bigIntegerValue = bigIntegerValue;
  }

  public JsonNode binary(Boolean binary) {
    this.binary = binary;
    return this;
  }

  /**
   * Get binary
   * @return binary
  */
  
  @Schema(name = "binary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("binary")
  public Boolean getBinary() {
    return binary;
  }

  public void setBinary(Boolean binary) {
    this.binary = binary;
  }

  public JsonNode binaryValue(List<byte[]> binaryValue) {
    this.binaryValue = binaryValue;
    return this;
  }

  public JsonNode addBinaryValueItem(byte[] binaryValueItem) {
    if (this.binaryValue == null) {
      this.binaryValue = new ArrayList<>();
    }
    this.binaryValue.add(binaryValueItem);
    return this;
  }

  /**
   * Get binaryValue
   * @return binaryValue
  */
  
  @Schema(name = "binaryValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("binaryValue")
  public List<byte[]> getBinaryValue() {
    return binaryValue;
  }

  public void setBinaryValue(List<byte[]> binaryValue) {
    this.binaryValue = binaryValue;
  }

  public JsonNode _boolean(Boolean _boolean) {
    this._boolean = _boolean;
    return this;
  }

  /**
   * Get _boolean
   * @return _boolean
  */
  
  @Schema(name = "boolean", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boolean")
  public Boolean getBoolean() {
    return _boolean;
  }

  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }

  public JsonNode booleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

  /**
   * Get booleanValue
   * @return booleanValue
  */
  
  @Schema(name = "booleanValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("booleanValue")
  public Boolean getBooleanValue() {
    return booleanValue;
  }

  public void setBooleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
  }

  public JsonNode containerNode(Boolean containerNode) {
    this.containerNode = containerNode;
    return this;
  }

  /**
   * Get containerNode
   * @return containerNode
  */
  
  @Schema(name = "containerNode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("containerNode")
  public Boolean getContainerNode() {
    return containerNode;
  }

  public void setContainerNode(Boolean containerNode) {
    this.containerNode = containerNode;
  }

  public JsonNode decimalValue(BigDecimal decimalValue) {
    this.decimalValue = decimalValue;
    return this;
  }

  /**
   * Get decimalValue
   * @return decimalValue
  */
  @Valid 
  @Schema(name = "decimalValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("decimalValue")
  public BigDecimal getDecimalValue() {
    return decimalValue;
  }

  public void setDecimalValue(BigDecimal decimalValue) {
    this.decimalValue = decimalValue;
  }

  public JsonNode _double(Boolean _double) {
    this._double = _double;
    return this;
  }

  /**
   * Get _double
   * @return _double
  */
  
  @Schema(name = "double", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("double")
  public Boolean getDouble() {
    return _double;
  }

  public void setDouble(Boolean _double) {
    this._double = _double;
  }

  public JsonNode doubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * Get doubleValue
   * @return doubleValue
  */
  
  @Schema(name = "doubleValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("doubleValue")
  public Double getDoubleValue() {
    return doubleValue;
  }

  public void setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
  }

  public JsonNode elements(Object elements) {
    this.elements = elements;
    return this;
  }

  /**
   * Get elements
   * @return elements
  */
  
  @Schema(name = "elements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("elements")
  public Object getElements() {
    return elements;
  }

  public void setElements(Object elements) {
    this.elements = elements;
  }

  public JsonNode fieldNames(Object fieldNames) {
    this.fieldNames = fieldNames;
    return this;
  }

  /**
   * Get fieldNames
   * @return fieldNames
  */
  
  @Schema(name = "fieldNames", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldNames")
  public Object getFieldNames() {
    return fieldNames;
  }

  public void setFieldNames(Object fieldNames) {
    this.fieldNames = fieldNames;
  }

  public JsonNode fields(Object fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Get fields
   * @return fields
  */
  
  @Schema(name = "fields", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fields")
  public Object getFields() {
    return fields;
  }

  public void setFields(Object fields) {
    this.fields = fields;
  }

  public JsonNode floatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
    return this;
  }

  /**
   * Get floatingPointNumber
   * @return floatingPointNumber
  */
  
  @Schema(name = "floatingPointNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("floatingPointNumber")
  public Boolean getFloatingPointNumber() {
    return floatingPointNumber;
  }

  public void setFloatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
  }

  public JsonNode _int(Boolean _int) {
    this._int = _int;
    return this;
  }

  /**
   * Get _int
   * @return _int
  */
  
  @Schema(name = "int", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("int")
  public Boolean getInt() {
    return _int;
  }

  public void setInt(Boolean _int) {
    this._int = _int;
  }

  public JsonNode intValue(Integer intValue) {
    this.intValue = intValue;
    return this;
  }

  /**
   * Get intValue
   * @return intValue
  */
  
  @Schema(name = "intValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intValue")
  public Integer getIntValue() {
    return intValue;
  }

  public void setIntValue(Integer intValue) {
    this.intValue = intValue;
  }

  public JsonNode integralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
    return this;
  }

  /**
   * Get integralNumber
   * @return integralNumber
  */
  
  @Schema(name = "integralNumber", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("integralNumber")
  public Boolean getIntegralNumber() {
    return integralNumber;
  }

  public void setIntegralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
  }

  public JsonNode _long(Boolean _long) {
    this._long = _long;
    return this;
  }

  /**
   * Get _long
   * @return _long
  */
  
  @Schema(name = "long", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("long")
  public Boolean getLong() {
    return _long;
  }

  public void setLong(Boolean _long) {
    this._long = _long;
  }

  public JsonNode longValue(Long longValue) {
    this.longValue = longValue;
    return this;
  }

  /**
   * Get longValue
   * @return longValue
  */
  
  @Schema(name = "longValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("longValue")
  public Long getLongValue() {
    return longValue;
  }

  public void setLongValue(Long longValue) {
    this.longValue = longValue;
  }

  public JsonNode missingNode(Boolean missingNode) {
    this.missingNode = missingNode;
    return this;
  }

  /**
   * Get missingNode
   * @return missingNode
  */
  
  @Schema(name = "missingNode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("missingNode")
  public Boolean getMissingNode() {
    return missingNode;
  }

  public void setMissingNode(Boolean missingNode) {
    this.missingNode = missingNode;
  }

  public JsonNode _null(Boolean _null) {
    this._null = _null;
    return this;
  }

  /**
   * Get _null
   * @return _null
  */
  
  @Schema(name = "null", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("null")
  public Boolean getNull() {
    return _null;
  }

  public void setNull(Boolean _null) {
    this._null = _null;
  }

  public JsonNode number(Boolean number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
  */
  
  @Schema(name = "number", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public Boolean getNumber() {
    return number;
  }

  public void setNumber(Boolean number) {
    this.number = number;
  }

  public JsonNode numberType(NumberTypeEnum numberType) {
    this.numberType = numberType;
    return this;
  }

  /**
   * Get numberType
   * @return numberType
  */
  
  @Schema(name = "numberType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberType")
  public NumberTypeEnum getNumberType() {
    return numberType;
  }

  public void setNumberType(NumberTypeEnum numberType) {
    this.numberType = numberType;
  }

  public JsonNode numberValue(BigDecimal numberValue) {
    this.numberValue = numberValue;
    return this;
  }

  /**
   * Get numberValue
   * @return numberValue
  */
  @Valid 
  @Schema(name = "numberValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("numberValue")
  public BigDecimal getNumberValue() {
    return numberValue;
  }

  public void setNumberValue(BigDecimal numberValue) {
    this.numberValue = numberValue;
  }

  public JsonNode _object(Boolean _object) {
    this._object = _object;
    return this;
  }

  /**
   * Get _object
   * @return _object
  */
  
  @Schema(name = "object", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("object")
  public Boolean getObject() {
    return _object;
  }

  public void setObject(Boolean _object) {
    this._object = _object;
  }

  public JsonNode pojo(Boolean pojo) {
    this.pojo = pojo;
    return this;
  }

  /**
   * Get pojo
   * @return pojo
  */
  
  @Schema(name = "pojo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pojo")
  public Boolean getPojo() {
    return pojo;
  }

  public void setPojo(Boolean pojo) {
    this.pojo = pojo;
  }

  public JsonNode textValue(String textValue) {
    this.textValue = textValue;
    return this;
  }

  /**
   * Get textValue
   * @return textValue
  */
  
  @Schema(name = "textValue", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("textValue")
  public String getTextValue() {
    return textValue;
  }

  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }

  public JsonNode textual(Boolean textual) {
    this.textual = textual;
    return this;
  }

  /**
   * Get textual
   * @return textual
  */
  
  @Schema(name = "textual", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("textual")
  public Boolean getTextual() {
    return textual;
  }

  public void setTextual(Boolean textual) {
    this.textual = textual;
  }

  public JsonNode valueAsBoolean(Boolean valueAsBoolean) {
    this.valueAsBoolean = valueAsBoolean;
    return this;
  }

  /**
   * Get valueAsBoolean
   * @return valueAsBoolean
  */
  
  @Schema(name = "valueAsBoolean", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueAsBoolean")
  public Boolean getValueAsBoolean() {
    return valueAsBoolean;
  }

  public void setValueAsBoolean(Boolean valueAsBoolean) {
    this.valueAsBoolean = valueAsBoolean;
  }

  public JsonNode valueAsDouble(Double valueAsDouble) {
    this.valueAsDouble = valueAsDouble;
    return this;
  }

  /**
   * Get valueAsDouble
   * @return valueAsDouble
  */
  
  @Schema(name = "valueAsDouble", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueAsDouble")
  public Double getValueAsDouble() {
    return valueAsDouble;
  }

  public void setValueAsDouble(Double valueAsDouble) {
    this.valueAsDouble = valueAsDouble;
  }

  public JsonNode valueAsInt(Integer valueAsInt) {
    this.valueAsInt = valueAsInt;
    return this;
  }

  /**
   * Get valueAsInt
   * @return valueAsInt
  */
  
  @Schema(name = "valueAsInt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueAsInt")
  public Integer getValueAsInt() {
    return valueAsInt;
  }

  public void setValueAsInt(Integer valueAsInt) {
    this.valueAsInt = valueAsInt;
  }

  public JsonNode valueAsLong(Long valueAsLong) {
    this.valueAsLong = valueAsLong;
    return this;
  }

  /**
   * Get valueAsLong
   * @return valueAsLong
  */
  
  @Schema(name = "valueAsLong", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueAsLong")
  public Long getValueAsLong() {
    return valueAsLong;
  }

  public void setValueAsLong(Long valueAsLong) {
    this.valueAsLong = valueAsLong;
  }

  public JsonNode valueAsText(String valueAsText) {
    this.valueAsText = valueAsText;
    return this;
  }

  /**
   * Get valueAsText
   * @return valueAsText
  */
  
  @Schema(name = "valueAsText", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueAsText")
  public String getValueAsText() {
    return valueAsText;
  }

  public void setValueAsText(String valueAsText) {
    this.valueAsText = valueAsText;
  }

  public JsonNode valueNode(Boolean valueNode) {
    this.valueNode = valueNode;
    return this;
  }

  /**
   * Get valueNode
   * @return valueNode
  */
  
  @Schema(name = "valueNode", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("valueNode")
  public Boolean getValueNode() {
    return valueNode;
  }

  public void setValueNode(Boolean valueNode) {
    this.valueNode = valueNode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonNode jsonNode = (JsonNode) o;
    return Objects.equals(this.array, jsonNode.array) &&
        Objects.equals(this.bigDecimal, jsonNode.bigDecimal) &&
        Objects.equals(this.bigInteger, jsonNode.bigInteger) &&
        Objects.equals(this.bigIntegerValue, jsonNode.bigIntegerValue) &&
        Objects.equals(this.binary, jsonNode.binary) &&
        Objects.equals(this.binaryValue, jsonNode.binaryValue) &&
        Objects.equals(this._boolean, jsonNode._boolean) &&
        Objects.equals(this.booleanValue, jsonNode.booleanValue) &&
        Objects.equals(this.containerNode, jsonNode.containerNode) &&
        Objects.equals(this.decimalValue, jsonNode.decimalValue) &&
        Objects.equals(this._double, jsonNode._double) &&
        Objects.equals(this.doubleValue, jsonNode.doubleValue) &&
        Objects.equals(this.elements, jsonNode.elements) &&
        Objects.equals(this.fieldNames, jsonNode.fieldNames) &&
        Objects.equals(this.fields, jsonNode.fields) &&
        Objects.equals(this.floatingPointNumber, jsonNode.floatingPointNumber) &&
        Objects.equals(this._int, jsonNode._int) &&
        Objects.equals(this.intValue, jsonNode.intValue) &&
        Objects.equals(this.integralNumber, jsonNode.integralNumber) &&
        Objects.equals(this._long, jsonNode._long) &&
        Objects.equals(this.longValue, jsonNode.longValue) &&
        Objects.equals(this.missingNode, jsonNode.missingNode) &&
        Objects.equals(this._null, jsonNode._null) &&
        Objects.equals(this.number, jsonNode.number) &&
        Objects.equals(this.numberType, jsonNode.numberType) &&
        Objects.equals(this.numberValue, jsonNode.numberValue) &&
        Objects.equals(this._object, jsonNode._object) &&
        Objects.equals(this.pojo, jsonNode.pojo) &&
        Objects.equals(this.textValue, jsonNode.textValue) &&
        Objects.equals(this.textual, jsonNode.textual) &&
        Objects.equals(this.valueAsBoolean, jsonNode.valueAsBoolean) &&
        Objects.equals(this.valueAsDouble, jsonNode.valueAsDouble) &&
        Objects.equals(this.valueAsInt, jsonNode.valueAsInt) &&
        Objects.equals(this.valueAsLong, jsonNode.valueAsLong) &&
        Objects.equals(this.valueAsText, jsonNode.valueAsText) &&
        Objects.equals(this.valueNode, jsonNode.valueNode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(array, bigDecimal, bigInteger, bigIntegerValue, binary, binaryValue, _boolean, booleanValue, containerNode, decimalValue, _double, doubleValue, elements, fieldNames, fields, floatingPointNumber, _int, intValue, integralNumber, _long, longValue, missingNode, _null, number, numberType, numberValue, _object, pojo, textValue, textual, valueAsBoolean, valueAsDouble, valueAsInt, valueAsLong, valueAsText, valueNode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonNode {\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
    sb.append("    bigInteger: ").append(toIndentedString(bigInteger)).append("\n");
    sb.append("    bigIntegerValue: ").append(toIndentedString(bigIntegerValue)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    binaryValue: ").append(toIndentedString(binaryValue)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    containerNode: ").append(toIndentedString(containerNode)).append("\n");
    sb.append("    decimalValue: ").append(toIndentedString(decimalValue)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    floatingPointNumber: ").append(toIndentedString(floatingPointNumber)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    intValue: ").append(toIndentedString(intValue)).append("\n");
    sb.append("    integralNumber: ").append(toIndentedString(integralNumber)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    longValue: ").append(toIndentedString(longValue)).append("\n");
    sb.append("    missingNode: ").append(toIndentedString(missingNode)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberType: ").append(toIndentedString(numberType)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pojo: ").append(toIndentedString(pojo)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    valueAsBoolean: ").append(toIndentedString(valueAsBoolean)).append("\n");
    sb.append("    valueAsDouble: ").append(toIndentedString(valueAsDouble)).append("\n");
    sb.append("    valueAsInt: ").append(toIndentedString(valueAsInt)).append("\n");
    sb.append("    valueAsLong: ").append(toIndentedString(valueAsLong)).append("\n");
    sb.append("    valueAsText: ").append(toIndentedString(valueAsText)).append("\n");
    sb.append("    valueNode: ").append(toIndentedString(valueNode)).append("\n");
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
