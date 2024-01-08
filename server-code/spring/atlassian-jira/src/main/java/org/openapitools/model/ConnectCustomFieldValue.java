package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * A list of custom field details.
 */

@Schema(name = "ConnectCustomFieldValue", description = "A list of custom field details.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ConnectCustomFieldValue {

  /**
   * The type of custom field.
   */
  public enum TypeEnum {
    STRINGISSUEFIELD("StringIssueField"),
    
    NUMBERISSUEFIELD("NumberIssueField"),
    
    RICHTEXTISSUEFIELD("RichTextIssueField"),
    
    SINGLESELECTISSUEFIELD("SingleSelectIssueField"),
    
    MULTISELECTISSUEFIELD("MultiSelectIssueField"),
    
    TEXTISSUEFIELD("TextIssueField");

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

  private Integer fieldID;

  private Integer issueID;

  private BigDecimal number;

  private String optionID;

  private String richText;

  private String string;

  private String text;

  public ConnectCustomFieldValue() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConnectCustomFieldValue(TypeEnum type, Integer fieldID, Integer issueID) {
    this.type = type;
    this.fieldID = fieldID;
    this.issueID = issueID;
  }

  public ConnectCustomFieldValue type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of custom field.
   * @return type
  */
  @NotNull 
  @Schema(name = "_type", description = "The type of custom field.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("_type")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ConnectCustomFieldValue fieldID(Integer fieldID) {
    this.fieldID = fieldID;
    return this;
  }

  /**
   * The custom field ID.
   * @return fieldID
  */
  @NotNull 
  @Schema(name = "fieldID", description = "The custom field ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fieldID")
  public Integer getFieldID() {
    return fieldID;
  }

  public void setFieldID(Integer fieldID) {
    this.fieldID = fieldID;
  }

  public ConnectCustomFieldValue issueID(Integer issueID) {
    this.issueID = issueID;
    return this;
  }

  /**
   * The issue ID.
   * @return issueID
  */
  @NotNull 
  @Schema(name = "issueID", description = "The issue ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("issueID")
  public Integer getIssueID() {
    return issueID;
  }

  public void setIssueID(Integer issueID) {
    this.issueID = issueID;
  }

  public ConnectCustomFieldValue number(BigDecimal number) {
    this.number = number;
    return this;
  }

  /**
   * The value of number type custom field when `_type` is `NumberIssueField`.
   * @return number
  */
  @Valid 
  @Schema(name = "number", description = "The value of number type custom field when `_type` is `NumberIssueField`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("number")
  public BigDecimal getNumber() {
    return number;
  }

  public void setNumber(BigDecimal number) {
    this.number = number;
  }

  public ConnectCustomFieldValue optionID(String optionID) {
    this.optionID = optionID;
    return this;
  }

  /**
   * The value of single select and multiselect custom field type when `_type` is `SingleSelectIssueField` or `MultiSelectIssueField`.
   * @return optionID
  */
  
  @Schema(name = "optionID", description = "The value of single select and multiselect custom field type when `_type` is `SingleSelectIssueField` or `MultiSelectIssueField`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionID")
  public String getOptionID() {
    return optionID;
  }

  public void setOptionID(String optionID) {
    this.optionID = optionID;
  }

  public ConnectCustomFieldValue richText(String richText) {
    this.richText = richText;
    return this;
  }

  /**
   * The value of richText type custom field when `_type` is `RichTextIssueField`.
   * @return richText
  */
  
  @Schema(name = "richText", description = "The value of richText type custom field when `_type` is `RichTextIssueField`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("richText")
  public String getRichText() {
    return richText;
  }

  public void setRichText(String richText) {
    this.richText = richText;
  }

  public ConnectCustomFieldValue string(String string) {
    this.string = string;
    return this;
  }

  /**
   * The value of string type custom field when `_type` is `StringIssueField`.
   * @return string
  */
  
  @Schema(name = "string", description = "The value of string type custom field when `_type` is `StringIssueField`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("string")
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public ConnectCustomFieldValue text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The value of of text custom field type when `_type` is `TextIssueField`.
   * @return text
  */
  
  @Schema(name = "text", description = "The value of of text custom field type when `_type` is `TextIssueField`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectCustomFieldValue connectCustomFieldValue = (ConnectCustomFieldValue) o;
    return Objects.equals(this.type, connectCustomFieldValue.type) &&
        Objects.equals(this.fieldID, connectCustomFieldValue.fieldID) &&
        Objects.equals(this.issueID, connectCustomFieldValue.issueID) &&
        Objects.equals(this.number, connectCustomFieldValue.number) &&
        Objects.equals(this.optionID, connectCustomFieldValue.optionID) &&
        Objects.equals(this.richText, connectCustomFieldValue.richText) &&
        Objects.equals(this.string, connectCustomFieldValue.string) &&
        Objects.equals(this.text, connectCustomFieldValue.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fieldID, issueID, number, optionID, richText, string, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCustomFieldValue {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fieldID: ").append(toIndentedString(fieldID)).append("\n");
    sb.append("    issueID: ").append(toIndentedString(issueID)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    optionID: ").append(toIndentedString(optionID)).append("\n");
    sb.append("    richText: ").append(toIndentedString(richText)).append("\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

