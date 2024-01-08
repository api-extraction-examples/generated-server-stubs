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
 * AddFieldBean
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class AddFieldBean {

  private String fieldId;

  public AddFieldBean() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AddFieldBean(String fieldId) {
    this.fieldId = fieldId;
  }

  public AddFieldBean fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * The ID of the field to add.
   * @return fieldId
  */
  @NotNull 
  @Schema(name = "fieldId", description = "The ID of the field to add.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fieldId")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddFieldBean addFieldBean = (AddFieldBean) o;
    return Objects.equals(this.fieldId, addFieldBean.fieldId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddFieldBean {\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
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

