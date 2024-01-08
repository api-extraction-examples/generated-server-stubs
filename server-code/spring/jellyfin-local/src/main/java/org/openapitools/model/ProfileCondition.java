package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ProfileConditionType;
import org.openapitools.model.ProfileConditionValue;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProfileCondition
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:28.311925-04:00[America/Lower_Princes]")
public class ProfileCondition {

  private ProfileConditionType condition;

  private Boolean isRequired;

  private ProfileConditionValue property;

  private JsonNullable<String> value = JsonNullable.<String>undefined();

  public ProfileCondition condition(ProfileConditionType condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Get condition
   * @return condition
  */
  @Valid 
  @Schema(name = "Condition", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Condition")
  public ProfileConditionType getCondition() {
    return condition;
  }

  public void setCondition(ProfileConditionType condition) {
    this.condition = condition;
  }

  public ProfileCondition isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

  /**
   * Get isRequired
   * @return isRequired
  */
  
  @Schema(name = "IsRequired", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("IsRequired")
  public Boolean getIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public ProfileCondition property(ProfileConditionValue property) {
    this.property = property;
    return this;
  }

  /**
   * Get property
   * @return property
  */
  @Valid 
  @Schema(name = "Property", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Property")
  public ProfileConditionValue getProperty() {
    return property;
  }

  public void setProperty(ProfileConditionValue property) {
    this.property = property;
  }

  public ProfileCondition value(String value) {
    this.value = JsonNullable.of(value);
    return this;
  }

  /**
   * Get value
   * @return value
  */
  
  @Schema(name = "Value", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Value")
  public JsonNullable<String> getValue() {
    return value;
  }

  public void setValue(JsonNullable<String> value) {
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
    ProfileCondition profileCondition = (ProfileCondition) o;
    return Objects.equals(this.condition, profileCondition.condition) &&
        Objects.equals(this.isRequired, profileCondition.isRequired) &&
        Objects.equals(this.property, profileCondition.property) &&
        equalsNullable(this.value, profileCondition.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, isRequired, property, hashCodeNullable(value));
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
    sb.append("class ProfileCondition {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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

