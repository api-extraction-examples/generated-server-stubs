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
 * The default value for a Date custom field.
 */

@Schema(name = "CustomFieldContextDefaultValueDate", description = "The default value for a Date custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextDefaultValueDate implements CustomFieldContextDefaultValue {

  private String date;

  private String type;

  private Boolean useCurrent = false;

  public CustomFieldContextDefaultValueDate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextDefaultValueDate(String type) {
    this.type = type;
  }

  public CustomFieldContextDefaultValueDate date(String date) {
    this.date = date;
    return this;
  }

  /**
   * The default date in ISO format. Ignored if `useCurrent` is true.
   * @return date
  */
  
  @Schema(name = "date", description = "The default date in ISO format. Ignored if `useCurrent` is true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public CustomFieldContextDefaultValueDate type(String type) {
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

  public CustomFieldContextDefaultValueDate useCurrent(Boolean useCurrent) {
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
    CustomFieldContextDefaultValueDate customFieldContextDefaultValueDate = (CustomFieldContextDefaultValueDate) o;
    return Objects.equals(this.date, customFieldContextDefaultValueDate.date) &&
        Objects.equals(this.type, customFieldContextDefaultValueDate.type) &&
        Objects.equals(this.useCurrent, customFieldContextDefaultValueDate.useCurrent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, type, useCurrent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextDefaultValueDate {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

