package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The default value for a cascading select custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueCascadingOption", description = "The default value for a cascading select custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueCascadingOption implements CustomFieldContextDefaultValue {

  private String cascadingOptionId;

  private String contextId;

  private String optionId;

  private String type;

  public CustomFieldContextDefaultValueCascadingOption() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueCascadingOption(String contextId, String optionId, String type) {
    this.contextId = contextId;
    this.optionId = optionId;
    this.type = type;
  }

  public CustomFieldContextDefaultValueCascadingOption cascadingOptionId(String cascadingOptionId) {
    this.cascadingOptionId = cascadingOptionId;
    return this;
  }

  /**
   * The ID of the default cascading option.
   * @return cascadingOptionId
  */
  
  @Schema(name = "cascadingOptionId", description = "The ID of the default cascading option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cascadingOptionId")
  public String getCascadingOptionId() {
    return cascadingOptionId;
  }

  public void setCascadingOptionId(String cascadingOptionId) {
    this.cascadingOptionId = cascadingOptionId;
  }

  public CustomFieldContextDefaultValueCascadingOption contextId(String contextId) {
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

  public CustomFieldContextDefaultValueCascadingOption optionId(String optionId) {
    this.optionId = optionId;
    return this;
  }

  /**
   * The ID of the default option.
   * @return optionId
  */
  @NotNull 
  @Schema(name = "optionId", description = "The ID of the default option.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("optionId")
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  public CustomFieldContextDefaultValueCascadingOption type(String type) {
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
    CustomFieldContextDefaultValueCascadingOption customFieldContextDefaultValueCascadingOption = (CustomFieldContextDefaultValueCascadingOption) o;
    return Objects.equals(this.cascadingOptionId, customFieldContextDefaultValueCascadingOption.cascadingOptionId) &&
        Objects.equals(this.contextId, customFieldContextDefaultValueCascadingOption.contextId) &&
        Objects.equals(this.optionId, customFieldContextDefaultValueCascadingOption.optionId) &&
        Objects.equals(this.type, customFieldContextDefaultValueCascadingOption.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cascadingOptionId, contextId, optionId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueCascadingOption {\n");
    sb.append("    cascadingOptionId: ").append(toIndentedString(cascadingOptionId)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
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

