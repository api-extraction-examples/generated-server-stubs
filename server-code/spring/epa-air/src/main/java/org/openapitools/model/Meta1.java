package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Meta3;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Results Object
 */

@Schema(name = "meta1", description = "Results Object")
@JsonTypeName("meta1")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Meta1 {

  private String message;

  @Valid
  private List<@Valid Meta3> resultColumns;

  public Meta1() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Meta1(String message) {
    this.message = message;
  }

  public Meta1 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Field to record messages (typically performance-related) about packet processing
   * @return message
  */
  @NotNull 
  @Schema(name = "Message", example = "Success", description = "Field to record messages (typically performance-related) about packet processing", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Meta1 resultColumns(List<@Valid Meta3> resultColumns) {
    this.resultColumns = resultColumns;
    return this;
  }

  public Meta1 addResultColumnsItem(Meta3 resultColumnsItem) {
    if (this.resultColumns == null) {
      this.resultColumns = new ArrayList<>();
    }
    this.resultColumns.add(resultColumnsItem);
    return this;
  }

  /**
   * Get resultColumns
   * @return resultColumns
  */
  @Valid 
  @Schema(name = "ResultColumns", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ResultColumns")
  public List<@Valid Meta3> getResultColumns() {
    return resultColumns;
  }

  public void setResultColumns(List<@Valid Meta3> resultColumns) {
    this.resultColumns = resultColumns;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta1 meta1 = (Meta1) o;
    return Objects.equals(this.message, meta1.message) &&
        Objects.equals(this.resultColumns, meta1.resultColumns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, resultColumns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta1 {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    resultColumns: ").append(toIndentedString(resultColumns)).append("\n");
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

