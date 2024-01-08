package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.JqlQueryField;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An element of the order-by JQL clause.
 */

@Schema(name = "JqlQueryOrderByClauseElement", description = "An element of the order-by JQL clause.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:56.097643-04:00[America/Lower_Princes]")
public class JqlQueryOrderByClauseElement {

  /**
   * The direction in which to order the results.
   */
  public enum DirectionEnum {
    ASC("asc"),
    
    DESC("desc");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String value) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private DirectionEnum direction;

  private JqlQueryField field;

  public JqlQueryOrderByClauseElement() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public JqlQueryOrderByClauseElement(JqlQueryField field) {
    this.field = field;
  }

  public JqlQueryOrderByClauseElement direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

  /**
   * The direction in which to order the results.
   * @return direction
  */
  
  @Schema(name = "direction", description = "The direction in which to order the results.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  public JqlQueryOrderByClauseElement field(JqlQueryField field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @NotNull @Valid 
  @Schema(name = "field", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("field")
  public JqlQueryField getField() {
    return field;
  }

  public void setField(JqlQueryField field) {
    this.field = field;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryOrderByClauseElement jqlQueryOrderByClauseElement = (JqlQueryOrderByClauseElement) o;
    return Objects.equals(this.direction, jqlQueryOrderByClauseElement.direction) &&
        Objects.equals(this.field, jqlQueryOrderByClauseElement.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryOrderByClauseElement {\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

