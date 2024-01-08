package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Details of a field that can be used in advanced searches.
 */

@Schema(name = "FieldReferenceData", description = "Details of a field that can be used in advanced searches.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldReferenceData {

  /**
   * Whether the field provide auto-complete suggestions.
   */
  public enum AutoEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    AutoEnum(String value) {
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
    public static AutoEnum fromValue(String value) {
      for (AutoEnum b : AutoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AutoEnum auto;

  private String cfid;

  /**
   * Whether this field has been deprecated.
   */
  public enum DeprecatedEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    DeprecatedEnum(String value) {
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
    public static DeprecatedEnum fromValue(String value) {
      for (DeprecatedEnum b : DeprecatedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DeprecatedEnum deprecated;

  private String deprecatedSearcherKey;

  private String displayName;

  @Valid
  private List<String> operators;

  /**
   * Whether the field can be used in a query's `ORDER BY` clause.
   */
  public enum OrderableEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    OrderableEnum(String value) {
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
    public static OrderableEnum fromValue(String value) {
      for (OrderableEnum b : OrderableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private OrderableEnum orderable;

  /**
   * Whether the content of this field can be searched.
   */
  public enum SearchableEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    SearchableEnum(String value) {
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
    public static SearchableEnum fromValue(String value) {
      for (SearchableEnum b : SearchableEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SearchableEnum searchable;

  @Valid
  private List<String> types;

  private String value;

  public FieldReferenceData auto(AutoEnum auto) {
    this.auto = auto;
    return this;
  }

  /**
   * Whether the field provide auto-complete suggestions.
   * @return auto
  */
  
  @Schema(name = "auto", description = "Whether the field provide auto-complete suggestions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto")
  public AutoEnum getAuto() {
    return auto;
  }

  public void setAuto(AutoEnum auto) {
    this.auto = auto;
  }

  public FieldReferenceData cfid(String cfid) {
    this.cfid = cfid;
    return this;
  }

  /**
   * If the item is a custom field, the ID of the custom field.
   * @return cfid
  */
  
  @Schema(name = "cfid", description = "If the item is a custom field, the ID of the custom field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cfid")
  public String getCfid() {
    return cfid;
  }

  public void setCfid(String cfid) {
    this.cfid = cfid;
  }

  public FieldReferenceData deprecated(DeprecatedEnum deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Whether this field has been deprecated.
   * @return deprecated
  */
  
  @Schema(name = "deprecated", description = "Whether this field has been deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deprecated")
  public DeprecatedEnum getDeprecated() {
    return deprecated;
  }

  public void setDeprecated(DeprecatedEnum deprecated) {
    this.deprecated = deprecated;
  }

  public FieldReferenceData deprecatedSearcherKey(String deprecatedSearcherKey) {
    this.deprecatedSearcherKey = deprecatedSearcherKey;
    return this;
  }

  /**
   * The searcher key of the field, only passed when the field is deprecated.
   * @return deprecatedSearcherKey
  */
  
  @Schema(name = "deprecatedSearcherKey", description = "The searcher key of the field, only passed when the field is deprecated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deprecatedSearcherKey")
  public String getDeprecatedSearcherKey() {
    return deprecatedSearcherKey;
  }

  public void setDeprecatedSearcherKey(String deprecatedSearcherKey) {
    this.deprecatedSearcherKey = deprecatedSearcherKey;
  }

  public FieldReferenceData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name contains the following:   *  for system fields, the field name. For example, `Summary`.  *  for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, `Component - Component[Dropdown]`.  *  for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, `Component - cf[10061]`.
   * @return displayName
  */
  
  @Schema(name = "displayName", description = "The display name contains the following:   *  for system fields, the field name. For example, `Summary`.  *  for collapsed custom fields, the field name followed by a hyphen and then the field name and field type. For example, `Component - Component[Dropdown]`.  *  for other custom fields, the field name followed by a hyphen and then the custom field ID. For example, `Component - cf[10061]`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FieldReferenceData operators(List<String> operators) {
    this.operators = operators;
    return this;
  }

  public FieldReferenceData addOperatorsItem(String operatorsItem) {
    if (this.operators == null) {
      this.operators = new ArrayList<>();
    }
    this.operators.add(operatorsItem);
    return this;
  }

  /**
   * The valid search operators for the field.
   * @return operators
  */
  
  @Schema(name = "operators", description = "The valid search operators for the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("operators")
  public List<String> getOperators() {
    return operators;
  }

  public void setOperators(List<String> operators) {
    this.operators = operators;
  }

  public FieldReferenceData orderable(OrderableEnum orderable) {
    this.orderable = orderable;
    return this;
  }

  /**
   * Whether the field can be used in a query's `ORDER BY` clause.
   * @return orderable
  */
  
  @Schema(name = "orderable", description = "Whether the field can be used in a query's `ORDER BY` clause.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderable")
  public OrderableEnum getOrderable() {
    return orderable;
  }

  public void setOrderable(OrderableEnum orderable) {
    this.orderable = orderable;
  }

  public FieldReferenceData searchable(SearchableEnum searchable) {
    this.searchable = searchable;
    return this;
  }

  /**
   * Whether the content of this field can be searched.
   * @return searchable
  */
  
  @Schema(name = "searchable", description = "Whether the content of this field can be searched.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("searchable")
  public SearchableEnum getSearchable() {
    return searchable;
  }

  public void setSearchable(SearchableEnum searchable) {
    this.searchable = searchable;
  }

  public FieldReferenceData types(List<String> types) {
    this.types = types;
    return this;
  }

  public FieldReferenceData addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * The data types of items in the field.
   * @return types
  */
  
  @Schema(name = "types", description = "The data types of items in the field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("types")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public FieldReferenceData value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The field identifier.
   * @return value
  */
  
  @Schema(name = "value", description = "The field identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    FieldReferenceData fieldReferenceData = (FieldReferenceData) o;
    return Objects.equals(this.auto, fieldReferenceData.auto) &&
        Objects.equals(this.cfid, fieldReferenceData.cfid) &&
        Objects.equals(this.deprecated, fieldReferenceData.deprecated) &&
        Objects.equals(this.deprecatedSearcherKey, fieldReferenceData.deprecatedSearcherKey) &&
        Objects.equals(this.displayName, fieldReferenceData.displayName) &&
        Objects.equals(this.operators, fieldReferenceData.operators) &&
        Objects.equals(this.orderable, fieldReferenceData.orderable) &&
        Objects.equals(this.searchable, fieldReferenceData.searchable) &&
        Objects.equals(this.types, fieldReferenceData.types) &&
        Objects.equals(this.value, fieldReferenceData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auto, cfid, deprecated, deprecatedSearcherKey, displayName, operators, orderable, searchable, types, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldReferenceData {\n");
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
    sb.append("    cfid: ").append(toIndentedString(cfid)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    deprecatedSearcherKey: ").append(toIndentedString(deprecatedSearcherKey)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    operators: ").append(toIndentedString(operators)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

