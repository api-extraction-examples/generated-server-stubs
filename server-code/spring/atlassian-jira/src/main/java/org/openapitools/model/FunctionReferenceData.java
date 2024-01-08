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
 * Details of functions that can be used in advanced searches.
 */

@Schema(name = "FunctionReferenceData", description = "Details of functions that can be used in advanced searches.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class FunctionReferenceData {

  private String displayName;

  /**
   * Whether the function can take a list of arguments.
   */
  public enum IsListEnum {
    TRUE("true"),
    
    FALSE("false");

    private String value;

    IsListEnum(String value) {
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
    public static IsListEnum fromValue(String value) {
      for (IsListEnum b : IsListEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private IsListEnum isList;

  @Valid
  private List<String> types;

  private String value;

  public FunctionReferenceData displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The display name of the function.
   * @return displayName
  */
  
  @Schema(name = "displayName", description = "The display name of the function.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public FunctionReferenceData isList(IsListEnum isList) {
    this.isList = isList;
    return this;
  }

  /**
   * Whether the function can take a list of arguments.
   * @return isList
  */
  
  @Schema(name = "isList", description = "Whether the function can take a list of arguments.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isList")
  public IsListEnum getIsList() {
    return isList;
  }

  public void setIsList(IsListEnum isList) {
    this.isList = isList;
  }

  public FunctionReferenceData types(List<String> types) {
    this.types = types;
    return this;
  }

  public FunctionReferenceData addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

  /**
   * The data types returned by the function.
   * @return types
  */
  
  @Schema(name = "types", description = "The data types returned by the function.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("types")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  public FunctionReferenceData value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The function identifier.
   * @return value
  */
  
  @Schema(name = "value", description = "The function identifier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    FunctionReferenceData functionReferenceData = (FunctionReferenceData) o;
    return Objects.equals(this.displayName, functionReferenceData.displayName) &&
        Objects.equals(this.isList, functionReferenceData.isList) &&
        Objects.equals(this.types, functionReferenceData.types) &&
        Objects.equals(this.value, functionReferenceData.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, isList, types, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionReferenceData {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isList: ").append(toIndentedString(isList)).append("\n");
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

