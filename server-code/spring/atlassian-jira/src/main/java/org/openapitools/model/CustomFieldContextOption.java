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
 * Details of the custom field options for a context.
 */

@Schema(name = "CustomFieldContextOption", description = "Details of the custom field options for a context.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class CustomFieldContextOption {

  private Boolean disabled;

  private String id;

  private String optionId;

  private String value;

  public CustomFieldContextOption() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CustomFieldContextOption(Boolean disabled, String id, String value) {
    this.disabled = disabled;
    this.id = id;
    this.value = value;
  }

  public CustomFieldContextOption disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether the option is disabled.
   * @return disabled
  */
  @NotNull 
  @Schema(name = "disabled", description = "Whether the option is disabled.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public CustomFieldContextOption id(String id) {
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

  public CustomFieldContextOption optionId(String optionId) {
    this.optionId = optionId;
    return this;
  }

  /**
   * For cascading options, the ID of the custom field option containing the cascading option.
   * @return optionId
  */
  
  @Schema(name = "optionId", description = "For cascading options, the ID of the custom field option containing the cascading option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("optionId")
  public String getOptionId() {
    return optionId;
  }

  public void setOptionId(String optionId) {
    this.optionId = optionId;
  }

  public CustomFieldContextOption value(String value) {
    this.value = value;
    return this;
  }

  /**
   * The value of the custom field option.
   * @return value
  */
  @NotNull 
  @Schema(name = "value", description = "The value of the custom field option.", requiredMode = Schema.RequiredMode.REQUIRED)
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
    CustomFieldContextOption customFieldContextOption = (CustomFieldContextOption) o;
    return Objects.equals(this.disabled, customFieldContextOption.disabled) &&
        Objects.equals(this.id, customFieldContextOption.id) &&
        Objects.equals(this.optionId, customFieldContextOption.optionId) &&
        Objects.equals(this.value, customFieldContextOption.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, id, optionId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomFieldContextOption {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    optionId: ").append(toIndentedString(optionId)).append("\n");
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

