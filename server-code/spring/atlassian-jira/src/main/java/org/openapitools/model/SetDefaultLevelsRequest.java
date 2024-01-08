package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DefaultLevelValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
/**
 * Details of new default levels.
 */

@Schema(name = "SetDefaultLevelsRequest", description = "Details of new default levels.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class SetDefaultLevelsRequest {

  @Valid
  private List<@Valid DefaultLevelValue> defaultValues = new ArrayList<>();

  public SetDefaultLevelsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetDefaultLevelsRequest(List<@Valid DefaultLevelValue> defaultValues) {
    this.defaultValues = defaultValues;
  }

  public SetDefaultLevelsRequest defaultValues(List<@Valid DefaultLevelValue> defaultValues) {
    this.defaultValues = defaultValues;
    return this;
  }

  public SetDefaultLevelsRequest addDefaultValuesItem(DefaultLevelValue defaultValuesItem) {
    if (this.defaultValues == null) {
      this.defaultValues = new ArrayList<>();
    }
    this.defaultValues.add(defaultValuesItem);
    return this;
  }

  /**
   * List of objects with issue security scheme ID and new default level ID.
   * @return defaultValues
  */
  @NotNull @Valid 
  @Schema(name = "defaultValues", description = "List of objects with issue security scheme ID and new default level ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("defaultValues")
  public List<@Valid DefaultLevelValue> getDefaultValues() {
    return defaultValues;
  }

  public void setDefaultValues(List<@Valid DefaultLevelValue> defaultValues) {
    this.defaultValues = defaultValues;
  }
    /**
    * A container for additional, undeclared properties.
    * This is a holder for any undeclared properties as specified with
    * the 'additionalProperties' keyword in the OAS document.
    */
    private Map<String, Object> additionalProperties;

    /**
    * Set the additional (undeclared) property with the specified name and value.
    * If the property does not already exist, create it otherwise replace it.
    */
    @JsonAnySetter
    public SetDefaultLevelsRequest putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
    * Return the additional (undeclared) property.
    */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
    * Return the additional (undeclared) property with the specified name.
    */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDefaultLevelsRequest setDefaultLevelsRequest = (SetDefaultLevelsRequest) o;
    return Objects.equals(this.defaultValues, setDefaultLevelsRequest.defaultValues) &&
    Objects.equals(this.additionalProperties, setDefaultLevelsRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValues, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDefaultLevelsRequest {\n");
    sb.append("    defaultValues: ").append(toIndentedString(defaultValues)).append("\n");
    
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

