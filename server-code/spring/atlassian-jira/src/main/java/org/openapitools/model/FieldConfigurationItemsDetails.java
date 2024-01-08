package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FieldConfigurationItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of field configuration items.
 */

@Schema(name = "FieldConfigurationItemsDetails", description = "Details of field configuration items.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FieldConfigurationItemsDetails {

  @Valid
  private List<@Valid FieldConfigurationItem> fieldConfigurationItems = new ArrayList<>();

  public FieldConfigurationItemsDetails() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FieldConfigurationItemsDetails(List<@Valid FieldConfigurationItem> fieldConfigurationItems) {
    this.fieldConfigurationItems = fieldConfigurationItems;
  }

  public FieldConfigurationItemsDetails fieldConfigurationItems(List<@Valid FieldConfigurationItem> fieldConfigurationItems) {
    this.fieldConfigurationItems = fieldConfigurationItems;
    return this;
  }

  public FieldConfigurationItemsDetails addFieldConfigurationItemsItem(FieldConfigurationItem fieldConfigurationItemsItem) {
    if (this.fieldConfigurationItems == null) {
      this.fieldConfigurationItems = new ArrayList<>();
    }
    this.fieldConfigurationItems.add(fieldConfigurationItemsItem);
    return this;
  }

  /**
   * Details of fields in a field configuration.
   * @return fieldConfigurationItems
  */
  @NotNull @Valid 
  @Schema(name = "fieldConfigurationItems", description = "Details of fields in a field configuration.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fieldConfigurationItems")
  public List<@Valid FieldConfigurationItem> getFieldConfigurationItems() {
    return fieldConfigurationItems;
  }

  public void setFieldConfigurationItems(List<@Valid FieldConfigurationItem> fieldConfigurationItems) {
    this.fieldConfigurationItems = fieldConfigurationItems;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldConfigurationItemsDetails fieldConfigurationItemsDetails = (FieldConfigurationItemsDetails) o;
    return Objects.equals(this.fieldConfigurationItems, fieldConfigurationItemsDetails.fieldConfigurationItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldConfigurationItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldConfigurationItemsDetails {\n");
    sb.append("    fieldConfigurationItems: ").append(toIndentedString(fieldConfigurationItems)).append("\n");
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

