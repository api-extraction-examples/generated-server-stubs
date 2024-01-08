package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConnectCustomFieldValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of updates for a custom field.
 */

@Schema(name = "ConnectCustomFieldValues", description = "Details of updates for a custom field.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class ConnectCustomFieldValues {

  @Valid
  private List<@Valid ConnectCustomFieldValue> updateValueList;

  public ConnectCustomFieldValues updateValueList(List<@Valid ConnectCustomFieldValue> updateValueList) {
    this.updateValueList = updateValueList;
    return this;
  }

  public ConnectCustomFieldValues addUpdateValueListItem(ConnectCustomFieldValue updateValueListItem) {
    if (this.updateValueList == null) {
      this.updateValueList = new ArrayList<>();
    }
    this.updateValueList.add(updateValueListItem);
    return this;
  }

  /**
   * The list of custom field update details.
   * @return updateValueList
  */
  @Valid 
  @Schema(name = "updateValueList", description = "The list of custom field update details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateValueList")
  public List<@Valid ConnectCustomFieldValue> getUpdateValueList() {
    return updateValueList;
  }

  public void setUpdateValueList(List<@Valid ConnectCustomFieldValue> updateValueList) {
    this.updateValueList = updateValueList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectCustomFieldValues connectCustomFieldValues = (ConnectCustomFieldValues) o;
    return Objects.equals(this.updateValueList, connectCustomFieldValues.updateValueList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateValueList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectCustomFieldValues {\n");
    sb.append("    updateValueList: ").append(toIndentedString(updateValueList)).append("\n");
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

