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
 * An object with a single key-value pair, where the key is the name of the invalid parameter, and the value is a description of the error. 
 */

@Schema(name = "ErrorDetail", description = "An object with a single key-value pair, where the key is the name of the invalid parameter, and the value is a description of the error. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:53.578762-04:00[America/Lower_Princes]")
public class ErrorDetail {

  private String fieldName;

  public ErrorDetail fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * description of the error
   * @return fieldName
  */
  
  @Schema(name = "field_name", description = "description of the error", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("field_name")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.fieldName, errorDetail.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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

