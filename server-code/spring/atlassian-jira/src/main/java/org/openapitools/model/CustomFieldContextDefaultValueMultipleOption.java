package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The default value for a multi-select custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueMultipleOption", description = "The default value for a multi-select custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueMultipleOption implements CustomFieldContextDefaultValue {

  private String contextId;

  @Valid
  private List<String> optionIds = new ArrayList<>();

  private String type;

  public CustomFieldContextDefaultValueMultipleOption() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueMultipleOption(String contextId, List<String> optionIds, String type) {
    this.contextId = contextId;
    this.optionIds = optionIds;
    this.type = type;
  }

  public CustomFieldContextDefaultValueMultipleOption contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }

  /**
   * The ID of the context.
   * @return contextId
  */
  @NotNull 
  @Schema(name = "contextId", description = "The ID of the context.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }

  public void setContextId(String contextId) {
    this.contextId = contextId;
  }

  public CustomFieldContextDefaultValueMultipleOption optionIds(List<String> optionIds) {
    this.optionIds = optionIds;
    return this;
  }

  public CustomFieldContextDefaultValueMultipleOption addOptionIdsItem(String optionIdsItem) {
    if (this.optionIds == null) {
      this.optionIds = new ArrayList<>();
    }
    this.optionIds.add(optionIdsItem);
    return this;
  }

  /**
   * The list of IDs of the default options.
   * @return optionIds
  */
  @NotNull 
  @Schema(name = "optionIds", description = "The list of IDs of the default options.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("optionIds")
  public List<String> getOptionIds() {
    return optionIds;
  }

  public void setOptionIds(List<String> optionIds) {
    this.optionIds = optionIds;
  }

  public CustomFieldContextDefaultValueMultipleOption type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @NotNull 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    CustomFieldContextDefaultValueMultipleOption customFieldContextDefaultValueMultipleOption = (CustomFieldContextDefaultValueMultipleOption) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueMultipleOption.contextId) &&
        Objects.equals(this.optionIds, customFieldContextDefaultValueMultipleOption.optionIds) &&
        Objects.equals(this.type, customFieldContextDefaultValueMultipleOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, optionIds, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueMultipleOption {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    optionIds: ").append(toIndentedString(optionIds)).append("\n");
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

