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
 * The default value for a Forge date time custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueForgeDateTimeField", description = "The default value for a Forge date time custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueForgeDateTimeField implements CustomFieldContextDefaultValue {

  private String contextId;

  private String dateTime;

  private String type;

  private Boolean useCurrent = false;

  public CustomFieldContextDefaultValueForgeDateTimeField() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueForgeDateTimeField(String contextId, String type) {
    this.contextId = contextId;
    this.type = type;
  }

  public CustomFieldContextDefaultValueForgeDateTimeField contextId(String contextId) {
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

  public CustomFieldContextDefaultValueForgeDateTimeField dateTime(String dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * The default date-time in ISO format. Ignored if `useCurrent` is true.
   * @return dateTime
  */
  
  @Schema(name = "dateTime", description = "The default date-time in ISO format. Ignored if `useCurrent` is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dateTime")
  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
  }

  public CustomFieldContextDefaultValueForgeDateTimeField type(String type) {
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

  public CustomFieldContextDefaultValueForgeDateTimeField useCurrent(Boolean useCurrent) {
    this.useCurrent = useCurrent;
    return this;
  }

  /**
   * Whether to use the current date.
   * @return useCurrent
  */
  
  @Schema(name = "useCurrent", description = "Whether to use the current date.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("useCurrent")
  public Boolean getUseCurrent() {
    return useCurrent;
  }

  public void setUseCurrent(Boolean useCurrent) {
    this.useCurrent = useCurrent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomFieldContextDefaultValueForgeDateTimeField customFieldContextDefaultValueForgeDateTimeField = (CustomFieldContextDefaultValueForgeDateTimeField) o;
    return Objects.equals(this.contextId, customFieldContextDefaultValueForgeDateTimeField.contextId) &&
        Objects.equals(this.dateTime, customFieldContextDefaultValueForgeDateTimeField.dateTime) &&
        Objects.equals(this.type, customFieldContextDefaultValueForgeDateTimeField.type) &&
        Objects.equals(this.useCurrent, customFieldContextDefaultValueForgeDateTimeField.useCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contextId, dateTime, type, useCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueForgeDateTimeField {\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useCurrent: ").append(toIndentedString(useCurrent)).append("\n");
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
