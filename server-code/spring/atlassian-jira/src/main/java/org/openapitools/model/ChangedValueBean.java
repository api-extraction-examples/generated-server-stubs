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
 * Details of names changed in the record event.
 */

@Schema(name = "ChangedValueBean", description = "Details of names changed in the record event.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ChangedValueBean {

  private String changedFrom;

  private String changedTo;

  private String fieldName;

  public ChangedValueBean changedFrom(String changedFrom) {
    this.changedFrom = changedFrom;
    return this;
  }

  /**
   * The value of the field before the change.
   * @return changedFrom
  */
  
  @Schema(name = "changedFrom", accessMode = Schema.AccessMode.READ_ONLY, description = "The value of the field before the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changedFrom")
  public String getChangedFrom() {
    return changedFrom;
  }

  public void setChangedFrom(String changedFrom) {
    this.changedFrom = changedFrom;
  }

  public ChangedValueBean changedTo(String changedTo) {
    this.changedTo = changedTo;
    return this;
  }

  /**
   * The value of the field after the change.
   * @return changedTo
  */
  
  @Schema(name = "changedTo", accessMode = Schema.AccessMode.READ_ONLY, description = "The value of the field after the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changedTo")
  public String getChangedTo() {
    return changedTo;
  }

  public void setChangedTo(String changedTo) {
    this.changedTo = changedTo;
  }

  public ChangedValueBean fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * The name of the field changed.
   * @return fieldName
  */
  
  @Schema(name = "fieldName", accessMode = Schema.AccessMode.READ_ONLY, description = "The name of the field changed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fieldName")
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
    ChangedValueBean changedValueBean = (ChangedValueBean) o;
    return Objects.equals(this.changedFrom, changedValueBean.changedFrom) &&
        Objects.equals(this.changedTo, changedValueBean.changedTo) &&
        Objects.equals(this.fieldName, changedValueBean.fieldName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedFrom, changedTo, fieldName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedValueBean {\n");
    sb.append("    changedFrom: ").append(toIndentedString(changedFrom)).append("\n");
    sb.append("    changedTo: ").append(toIndentedString(changedTo)).append("\n");
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

