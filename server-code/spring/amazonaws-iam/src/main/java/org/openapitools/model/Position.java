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
 * &lt;p&gt;Contains the row and column of a location of a &lt;code&gt;Statement&lt;/code&gt; element in a policy document.&lt;/p&gt; &lt;p&gt;This data type is used as a member of the &lt;code&gt; &lt;a&gt;Statement&lt;/a&gt; &lt;/code&gt; type.&lt;/p&gt;
 */

@Schema(name = "Position", description = "<p>Contains the row and column of a location of a <code>Statement</code> element in a policy document.</p> <p>This data type is used as a member of the <code> <a>Statement</a> </code> type.</p>")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:42:43.476388-04:00[America/Lower_Princes]")
public class Position {

  private Integer line;

  private Integer column;

  public Position line(Integer line) {
    this.line = line;
    return this;
  }

  /**
   * Get line
   * @return line
  */
  
  @Schema(name = "Line", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Line")
  public Integer getLine() {
    return line;
  }

  public void setLine(Integer line) {
    this.line = line;
  }

  public Position column(Integer column) {
    this.column = column;
    return this;
  }

  /**
   * Get column
   * @return column
  */
  
  @Schema(name = "Column", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Column")
  public Integer getColumn() {
    return column;
  }

  public void setColumn(Integer column) {
    this.column = column;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Position position = (Position) o;
    return Objects.equals(this.line, position.line) &&
        Objects.equals(this.column, position.column);
  }

  @Override
  public int hashCode() {
    return Objects.hash(line, column);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Position {\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
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

