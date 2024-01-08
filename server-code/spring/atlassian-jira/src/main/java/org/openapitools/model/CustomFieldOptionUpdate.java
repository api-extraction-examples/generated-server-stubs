package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of a custom field option for a context.
 */

@Schema(name = "CustomFieldOptionUpdate", description = "Details of a custom field option for a context.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldOptionUpdate {

  private Boolean disabled;

  private String id;

  private String value;

  public CustomFieldOptionUpdate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldOptionUpdate(String id) {
    this.id = id;
  }

  public CustomFieldOptionUpdate disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether the option is disabled.
   * @return disabled
  */
  
  @Schema(name = "disabled", description = "Whether the option is disabled.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public CustomFieldOptionUpdate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the custom field option.
   * @return id
  */
  @NotNull 
  @Schema(name = "id", description = "The ID of the custom field option.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CustomFieldOptionUpdate value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the custom field option.
   * @return value
  */
  
  @Schema(name = "value", description = "The value of the custom field option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    CustomFieldOptionUpdate customFieldOptionUpdate = (CustomFieldOptionUpdate) o;
    return Objects.equals(this.disabled, customFieldOptionUpdate.disabled) &&
        Objects.equals(this.id, customFieldOptionUpdate.id) &&
        Objects.equals(this.value, customFieldOptionUpdate.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldOptionUpdate {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

