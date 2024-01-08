package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Clause
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:51:38.380306-04:00[America/Lower_Princes]")
public class Clause {

  private String id;

  private String attribute;

  private Boolean negate;

  private String op;

  @Valid
  private List<Object> values;

  public Clause id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("_id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Clause attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * Get attribute
   * @return attribute
  */
  
  @Schema(name = "attribute", example = "groups", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribute")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public Clause negate(Boolean negate) {
    this.negate = negate;
    return this;
  }

  /**
   * Get negate
   * @return negate
  */
  
  @Schema(name = "negate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("negate")
  public Boolean getNegate() {
    return negate;
  }

  public void setNegate(Boolean negate) {
    this.negate = negate;
  }

  public Clause op(String op) {
    this.op = op;
    return this;
  }

  /**
   * Get op
   * @return op
  */
  
  @Schema(name = "op", example = "in", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("op")
  public String getOp() {
    return op;
  }

  public void setOp(String op) {
    this.op = op;
  }

  public Clause values(List<Object> values) {
    this.values = values;
    return this;
  }

  public Clause addValuesItem(Object valuesItem) {
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
  
  @Schema(name = "values", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("values")
  public List<Object> getValues() {
    return values;
  }

  public void setValues(List<Object> values) {
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
    Clause clause = (Clause) o;
    return Objects.equals(this.id, clause.id) &&
        Objects.equals(this.attribute, clause.attribute) &&
        Objects.equals(this.negate, clause.negate) &&
        Objects.equals(this.op, clause.op) &&
        Objects.equals(this.values, clause.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, attribute, negate, op, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Clause {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
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

