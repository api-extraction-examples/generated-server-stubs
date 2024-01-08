package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GoalMetricBase
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class GoalMetricBase {

  private String gid;

  private String resourceType;

  private JsonNullable<String> currencyCode = JsonNullable.<String>undefined();

  private String currentDisplayValue;

  private BigDecimal currentNumberValue;

  private BigDecimal initialNumberValue;

  private Integer precision;

  /**
   * This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.
   */
  public enum ProgressSourceEnum {
    MANUAL("manual"),
    
    SUBGOAL_PROGRESS("subgoal_progress"),
    
    PROJECT_TASK_COMPLETION("project_task_completion"),
    
    PROJECT_MILESTONE_COMPLETION("project_milestone_completion"),
    
    EXTERNAL("external");

    private String value;

    ProgressSourceEnum(String value) {
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
    public static ProgressSourceEnum fromValue(String value) {
      for (ProgressSourceEnum b : ProgressSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProgressSourceEnum progressSource;

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   */
  public enum ResourceSubtypeEnum {
    NUMBER("number");

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

  private BigDecimal targetNumberValue;

  /**
   * A supported unit of measure for the goal metric, or none.
   */
  public enum UnitEnum {
    NONE("none"),
    
    CURRENCY("currency"),
    
    PERCENTAGE("percentage");

    private String value;

    UnitEnum(String value) {
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
    public static UnitEnum fromValue(String value) {
      for (UnitEnum b : UnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private UnitEnum unit;

  public GoalMetricBase gid(String gid) {
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

  public GoalMetricBase resourceType(String resourceType) {
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

  public GoalMetricBase currencyCode(String currencyCode) {
    this.currencyCode = JsonNullable.of(currencyCode);
    return this;
  }

  /**
   * ISO 4217 currency code to format this custom field. This will be null if the `unit` is not `currency`.
   * @return currencyCode
  */
  
  @Schema(name = "currency_code", example = "EUR", description = "ISO 4217 currency code to format this custom field. This will be null if the `unit` is not `currency`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency_code")
  public JsonNullable<String> getCurrencyCode() {
    return currencyCode;
  }

  public void setCurrencyCode(JsonNullable<String> currencyCode) {
    this.currencyCode = currencyCode;
  }

  public GoalMetricBase currentDisplayValue(String currentDisplayValue) {
    this.currentDisplayValue = currentDisplayValue;
    return this;
  }

  /**
   * This string is the current value of a goal metric of type string.
   * @return currentDisplayValue
  */
  
  @Schema(name = "current_display_value", accessMode = Schema.AccessMode.READ_ONLY, example = "8.12", description = "This string is the current value of a goal metric of type string.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_display_value")
  public String getCurrentDisplayValue() {
    return currentDisplayValue;
  }

  public void setCurrentDisplayValue(String currentDisplayValue) {
    this.currentDisplayValue = currentDisplayValue;
  }

  public GoalMetricBase currentNumberValue(BigDecimal currentNumberValue) {
    this.currentNumberValue = currentNumberValue;
    return this;
  }

  /**
   * This number is the current value of a goal metric of type number.
   * @return currentNumberValue
  */
  @Valid 
  @Schema(name = "current_number_value", example = "8.12", description = "This number is the current value of a goal metric of type number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("current_number_value")
  public BigDecimal getCurrentNumberValue() {
    return currentNumberValue;
  }

  public void setCurrentNumberValue(BigDecimal currentNumberValue) {
    this.currentNumberValue = currentNumberValue;
  }

  public GoalMetricBase initialNumberValue(BigDecimal initialNumberValue) {
    this.initialNumberValue = initialNumberValue;
    return this;
  }

  /**
   * This number is the start value of a goal metric of type number.
   * @return initialNumberValue
  */
  @Valid 
  @Schema(name = "initial_number_value", example = "5.2", description = "This number is the start value of a goal metric of type number.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("initial_number_value")
  public BigDecimal getInitialNumberValue() {
    return initialNumberValue;
  }

  public void setInitialNumberValue(BigDecimal initialNumberValue) {
    this.initialNumberValue = initialNumberValue;
  }

  public GoalMetricBase precision(Integer precision) {
    this.precision = precision;
    return this;
  }

  /**
   * *Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.
   * @return precision
  */
  
  @Schema(name = "precision", example = "2", description = "*Conditional*. Only relevant for goal metrics of type ‘Number’. This field dictates the number of places after the decimal to round to, i.e. 0 is integer values, 1 rounds to the nearest tenth, and so on. Must be between 0 and 6, inclusive. For percentage format, this may be unintuitive, as a value of 0.25 has a precision of 0, while a value of 0.251 has a precision of 1. This is due to 0.25 being displayed as 25%.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("precision")
  public Integer getPrecision() {
    return precision;
  }

  public void setPrecision(Integer precision) {
    this.precision = precision;
  }

  public GoalMetricBase progressSource(ProgressSourceEnum progressSource) {
    this.progressSource = progressSource;
    return this;
  }

  /**
   * This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.
   * @return progressSource
  */
  
  @Schema(name = "progress_source", example = "manual", description = "This field defines how the progress value of a goal metric is being calculated. A goal's progress can be provided manually by the user, calculated automatically from contributing subgoals or projects, or managed by an integration with an external data source, such as Salesforce.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("progress_source")
  public ProgressSourceEnum getProgressSource() {
    return progressSource;
  }

  public void setProgressSource(ProgressSourceEnum progressSource) {
    this.progressSource = progressSource;
  }

  public GoalMetricBase resourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
    return this;
  }

  /**
   * The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.
   * @return resourceSubtype
  */
  
  @Schema(name = "resource_subtype", accessMode = Schema.AccessMode.READ_ONLY, example = "number", description = "The subtype of this resource. Different subtypes retain many of the same fields and behavior, but may render differently in Asana or represent resources with different semantic meaning.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("resource_subtype")
  public ResourceSubtypeEnum getResourceSubtype() {
    return resourceSubtype;
  }

  public void setResourceSubtype(ResourceSubtypeEnum resourceSubtype) {
    this.resourceSubtype = resourceSubtype;
  }

  public GoalMetricBase targetNumberValue(BigDecimal targetNumberValue) {
    this.targetNumberValue = targetNumberValue;
    return this;
  }

  /**
   * This number is the end value of a goal metric of type number. This number cannot equal `initial_number_value`.
   * @return targetNumberValue
  */
  @Valid 
  @Schema(name = "target_number_value", example = "10.2", description = "This number is the end value of a goal metric of type number. This number cannot equal `initial_number_value`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("target_number_value")
  public BigDecimal getTargetNumberValue() {
    return targetNumberValue;
  }

  public void setTargetNumberValue(BigDecimal targetNumberValue) {
    this.targetNumberValue = targetNumberValue;
  }

  public GoalMetricBase unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

  /**
   * A supported unit of measure for the goal metric, or none.
   * @return unit
  */
  
  @Schema(name = "unit", description = "A supported unit of measure for the goal metric, or none.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }

  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoalMetricBase goalMetricBase = (GoalMetricBase) o;
    return Objects.equals(this.gid, goalMetricBase.gid) &&
        Objects.equals(this.resourceType, goalMetricBase.resourceType) &&
        equalsNullable(this.currencyCode, goalMetricBase.currencyCode) &&
        Objects.equals(this.currentDisplayValue, goalMetricBase.currentDisplayValue) &&
        Objects.equals(this.currentNumberValue, goalMetricBase.currentNumberValue) &&
        Objects.equals(this.initialNumberValue, goalMetricBase.initialNumberValue) &&
        Objects.equals(this.precision, goalMetricBase.precision) &&
        Objects.equals(this.progressSource, goalMetricBase.progressSource) &&
        Objects.equals(this.resourceSubtype, goalMetricBase.resourceSubtype) &&
        Objects.equals(this.targetNumberValue, goalMetricBase.targetNumberValue) &&
        Objects.equals(this.unit, goalMetricBase.unit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(gid, resourceType, hashCodeNullable(currencyCode), currentDisplayValue, currentNumberValue, initialNumberValue, precision, progressSource, resourceSubtype, targetNumberValue, unit);
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
    sb.append("class GoalMetricBase {\n");
    sb.append("    gid: ").append(toIndentedString(gid)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    currentDisplayValue: ").append(toIndentedString(currentDisplayValue)).append("\n");
    sb.append("    currentNumberValue: ").append(toIndentedString(currentNumberValue)).append("\n");
    sb.append("    initialNumberValue: ").append(toIndentedString(initialNumberValue)).append("\n");
    sb.append("    precision: ").append(toIndentedString(precision)).append("\n");
    sb.append("    progressSource: ").append(toIndentedString(progressSource)).append("\n");
    sb.append("    resourceSubtype: ").append(toIndentedString(resourceSubtype)).append("\n");
    sb.append("    targetNumberValue: ").append(toIndentedString(targetNumberValue)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

