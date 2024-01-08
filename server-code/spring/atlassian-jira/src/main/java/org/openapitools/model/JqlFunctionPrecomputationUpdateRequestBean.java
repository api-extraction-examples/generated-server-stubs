package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JqlFunctionPrecomputationUpdateBean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * List of pairs (id and value) for precomputation updates.
 */

@Schema(name = "JqlFunctionPrecomputationUpdateRequestBean", description = "List of pairs (id and value) for precomputation updates.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlFunctionPrecomputationUpdateRequestBean {

  @Valid
  private List<@Valid JqlFunctionPrecomputationUpdateBean> values;

  public JqlFunctionPrecomputationUpdateRequestBean values(List<@Valid JqlFunctionPrecomputationUpdateBean> values) {
    this.values = values;
    return this;
  }

  public JqlFunctionPrecomputationUpdateRequestBean addValuesItem(JqlFunctionPrecomputationUpdateBean valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  */
  @Valid 
  @Schema(name = "values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<@Valid JqlFunctionPrecomputationUpdateBean> getValues() {
    return values;
  }

  public void setValues(List<@Valid JqlFunctionPrecomputationUpdateBean> values) {
    this.values = values;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlFunctionPrecomputationUpdateRequestBean jqlFunctionPrecomputationUpdateRequestBean = (JqlFunctionPrecomputationUpdateRequestBean) o;
    return Objects.equals(this.values, jqlFunctionPrecomputationUpdateRequestBean.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlFunctionPrecomputationUpdateRequestBean {\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

