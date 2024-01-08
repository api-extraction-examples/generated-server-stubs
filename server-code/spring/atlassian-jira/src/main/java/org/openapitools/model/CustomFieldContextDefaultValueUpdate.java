package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CustomFieldContextDefaultValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Default values to update.
 */

@Schema(name = "CustomFieldContextDefaultValueUpdate", description = "Default values to update.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueUpdate {

  @Valid
  private List<@Valid CustomFieldContextDefaultValue> defaultValues;

  public CustomFieldContextDefaultValueUpdate defaultValues(List<@Valid CustomFieldContextDefaultValue> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public CustomFieldContextDefaultValueUpdate addDefaultValuesItem(CustomFieldContextDefaultValue defaultValuesItem) {
    if (this.defaultValues == null) {
      this.defaultValues = new ArrayList<>();
    }
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

  /**
   * Get defaultValues
   * @return defaultValues
  */
  @Valid 
  @Schema(name = "defaultValues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("defaultValues")
  public List<@Valid CustomFieldContextDefaultValue> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(List<@Valid CustomFieldContextDefaultValue> defaultValues) {
    this.defaultValues = defaultValues;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueUpdate customFieldContextDefaultValueUpdate = (CustomFieldContextDefaultValueUpdate) o;
    return Objects.equals(this.defaultValues, customFieldContextDefaultValueUpdate.defaultValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueUpdate {\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
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

