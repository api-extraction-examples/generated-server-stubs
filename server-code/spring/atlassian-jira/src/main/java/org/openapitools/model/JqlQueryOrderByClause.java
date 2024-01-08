package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.JqlQueryOrderByClauseElement;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Details of the order-by JQL clause.
 */

@Schema(name = "JqlQueryOrderByClause", description = "Details of the order-by JQL clause.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueryOrderByClause {

  @Valid
  private List<@Valid JqlQueryOrderByClauseElement> fields = new ArrayList<>();

  public JqlQueryOrderByClause() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueryOrderByClause(List<@Valid JqlQueryOrderByClauseElement> fields) {
    this.fields = fields;
  }

  public JqlQueryOrderByClause fields(List<@Valid JqlQueryOrderByClauseElement> fields) {
    this.fields = fields;
    return this;
  }

  public JqlQueryOrderByClause addFieldsItem(JqlQueryOrderByClauseElement fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

  /**
   * The list of order-by clause fields and their ordering directives.
   * @return fields
  */
  @NotNull @Valid 
  @Schema(name = "fields", description = "The list of order-by clause fields and their ordering directives.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("fields")
  public List<@Valid JqlQueryOrderByClauseElement> getFields() {
    return fields;
  }

  public void setFields(List<@Valid JqlQueryOrderByClauseElement> fields) {
    this.fields = fields;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryOrderByClause jqlQueryOrderByClause = (JqlQueryOrderByClause) o;
    return Objects.equals(this.fields, jqlQueryOrderByClause.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryOrderByClause {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

