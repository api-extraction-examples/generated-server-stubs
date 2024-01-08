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
 * EnumOptionInsertRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:35.342665-04:00[America/Lower_Princes]")
public class EnumOptionInsertRequest {

  private String afterEnumOption;

  private String beforeEnumOption;

  private String enumOption;

  public EnumOptionInsertRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public EnumOptionInsertRequest(String enumOption) {
    this.enumOption = enumOption;
  }

  public EnumOptionInsertRequest afterEnumOption(String afterEnumOption) {
    this.afterEnumOption = afterEnumOption;
    return this;
  }

  /**
   * An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.
   * @return afterEnumOption
  */
  
  @Schema(name = "after_enum_option", example = "12345", description = "An existing enum option within this custom field after which the new enum option should be inserted. Cannot be provided together with before_enum_option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("after_enum_option")
  public String getAfterEnumOption() {
    return afterEnumOption;
  }

  public void setAfterEnumOption(String afterEnumOption) {
    this.afterEnumOption = afterEnumOption;
  }

  public EnumOptionInsertRequest beforeEnumOption(String beforeEnumOption) {
    this.beforeEnumOption = beforeEnumOption;
    return this;
  }

  /**
   * An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.
   * @return beforeEnumOption
  */
  
  @Schema(name = "before_enum_option", example = "12345", description = "An existing enum option within this custom field before which the new enum option should be inserted. Cannot be provided together with after_enum_option.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("before_enum_option")
  public String getBeforeEnumOption() {
    return beforeEnumOption;
  }

  public void setBeforeEnumOption(String beforeEnumOption) {
    this.beforeEnumOption = beforeEnumOption;
  }

  public EnumOptionInsertRequest enumOption(String enumOption) {
    this.enumOption = enumOption;
    return this;
  }

  /**
   * The gid of the enum option to relocate.
   * @return enumOption
  */
  @NotNull 
  @Schema(name = "enum_option", example = "97285", description = "The gid of the enum option to relocate.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("enum_option")
  public String getEnumOption() {
    return enumOption;
  }

  public void setEnumOption(String enumOption) {
    this.enumOption = enumOption;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumOptionInsertRequest enumOptionInsertRequest = (EnumOptionInsertRequest) o;
    return Objects.equals(this.afterEnumOption, enumOptionInsertRequest.afterEnumOption) &&
        Objects.equals(this.beforeEnumOption, enumOptionInsertRequest.beforeEnumOption) &&
        Objects.equals(this.enumOption, enumOptionInsertRequest.enumOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterEnumOption, beforeEnumOption, enumOption);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumOptionInsertRequest {\n");
    sb.append("    afterEnumOption: ").append(toIndentedString(afterEnumOption)).append("\n");
    sb.append("    beforeEnumOption: ").append(toIndentedString(beforeEnumOption)).append("\n");
    sb.append("    enumOption: ").append(toIndentedString(enumOption)).append("\n");
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

